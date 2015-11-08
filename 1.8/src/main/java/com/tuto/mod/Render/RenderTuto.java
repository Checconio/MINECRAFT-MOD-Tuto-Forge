package com.tuto.mod.Render;

import com.tuto.mod.Reference;
import com.tuto.mod.Entity.EntityTuto;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderTuto extends RenderLiving
{
    
    private ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":textures/mobs/Tuto.png");

    public RenderTuto(RenderManager render, ModelBase model, float x)
    {
        super(render, model, x);
    }
    
    public void renderTuto(EntityTuto entity, double x, double y, double z, float v, float b)
    {
        super.doRender(entity, x, y, z, v, b);
    }
    
    public void doRenderLiving(EntityLiving entity, double x, double y, double z, float v, float b)
    {
        renderTuto((EntityTuto) entity, x, y, z, v, b);
    }
    
    public void doRendering(Entity entity, double x, double y, double z, float v, float b)
    {
        renderTuto((EntityTuto) entity, x, y, z, v, b);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return texture;
    }
    
}
