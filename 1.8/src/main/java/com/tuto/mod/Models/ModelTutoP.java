package com.tuto.mod.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTutoP extends ModelBase
{
  //fields
    ModelRenderer Corp;
    ModelRenderer JambeDroite;
    ModelRenderer JambeGauche;
    ModelRenderer CorneDroite;
    ModelRenderer Tete;
    ModelRenderer CorneGauche;
  
  public ModelTutoP()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Corp = new ModelRenderer(this, 0, 0);
      Corp.addBox(-4F, 0F, -2F, 8, 7, 4);
      Corp.setRotationPoint(0F, 12F, 0F);
      Corp.setTextureSize(64, 32);
      Corp.mirror = true;
      setRotation(Corp, 0F, 0F, 0F);
      JambeDroite = new ModelRenderer(this, 0, 11);
      JambeDroite.addBox(-1F, 0F, -1F, 2, 5, 2);
      JambeDroite.setRotationPoint(3F, 19F, 0F);
      JambeDroite.setTextureSize(64, 32);
      JambeDroite.mirror = true;
      setRotation(JambeDroite, 0F, 0F, 0F);
      JambeGauche = new ModelRenderer(this, 16, 11);
      JambeGauche.addBox(-1F, 0F, -1F, 2, 5, 2);
      JambeGauche.setRotationPoint(-3F, 19F, 0F);
      JambeGauche.setTextureSize(64, 32);
      JambeGauche.mirror = true;
      setRotation(JambeGauche, 0F, 0F, 0F);
      CorneDroite = new ModelRenderer(this, 26, 0);
      CorneDroite.addBox(1F, -5F, 0F, 1, 2, 1);
      CorneDroite.setRotationPoint(0F, 12F, 0F);
      CorneDroite.setTextureSize(64, 32);
      CorneDroite.mirror = true;
      setRotation(CorneDroite, 0F, 0F, 0F);
      Tete = new ModelRenderer(this, 26, 3);
      Tete.addBox(-2F, -3F, -1F, 4, 3, 3);
      Tete.setRotationPoint(0F, 12F, 0F);
      Tete.setTextureSize(64, 32);
      Tete.mirror = true;
      setRotation(Tete, 0F, 0F, 0F);
      CorneGauche = new ModelRenderer(this, 36, 0);
      CorneGauche.addBox(-2F, -5F, 0F, 1, 2, 1);
      CorneGauche.setRotationPoint(0F, 12F, 0F);
      CorneGauche.setTextureSize(64, 32);
      CorneGauche.mirror = true;
      setRotation(CorneGauche, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Corp.render(f5);
    JambeDroite.render(f5);
    JambeGauche.render(f5);
    CorneDroite.render(f5);
    Tete.render(f5);
    CorneGauche.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Tete.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.Tete.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.CorneGauche.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.CorneGauche.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.CorneDroite.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.CorneDroite.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.JambeDroite.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.JambeGauche.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.JambeDroite.rotateAngleY = 0.0F;
    this.JambeGauche.rotateAngleY = 0.0F;
  }

}
