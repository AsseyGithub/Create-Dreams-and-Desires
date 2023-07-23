package uwu.lopyluna.create_dd.block;

import com.jozufozu.flywheel.core.PartialModel;
import com.simibubi.create.foundation.utility.Couple;
import net.minecraft.resources.ResourceLocation;
import uwu.lopyluna.create_dd.DDcreate;

import java.util.HashMap;
import java.util.Map;

public class YIPPEEPartialModel {


    public static final PartialModel
            RADIANT_DRILL_HEAD = block("radiant_drill/head"),
            SHADOW_DRILL_HEAD = block("shadow_drill/head"),
            BRONZE_DRILL_HEAD = block("bronze_drill/head"),
            HYDRAULIC_PRESS_HEAD = block("hydraulic_press/head"),
            BRONZE_ENCASED_FAN_INNER = block("bronze_encased_fan/propeller")
            ;

    public static final Map<ResourceLocation, Couple<PartialModel>> FOLDING_DOORS = new HashMap<>();
    static {
        putFoldingDoor("rose_door");
        putFoldingDoor("smoked_door");
        putFoldingDoor("spirit_door");
    }
    private static void putFoldingDoor(String path) {
        FOLDING_DOORS.put(DDcreate.asResource(path),
                Couple.create(block(path + "/fold_left"), block(path + "/fold_right")));
    }

    private static PartialModel block(String path) {
        return new PartialModel(DDcreate.asResource("block/" + path));
    }

    public static void init() {
    }
}
