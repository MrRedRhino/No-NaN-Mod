package org.pipeman.no_nan.mixin;

import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Entity.class)
public abstract class EntityMixin {
    @ModifyArg(method = "load", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;setPosRaw(DDD)V"), index = 0)
    public double aVoid1(double value) {
        return Double.isFinite(value) ? value : 0;
    }

    @ModifyArg(method = "load", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;setPosRaw(DDD)V"), index = 1)
    public double aVoid2(double value) {
        return Double.isFinite(value) ? value : 0;
    }

    @ModifyArg(method = "load", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;setPosRaw(DDD)V"), index = 2)
    public double aVoid3(double value) {
        return Double.isFinite(value) ? value : 0;
    }
}
