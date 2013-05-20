// Date: 5/17/2013 6:50:23 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package thermalDynamics.Model;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class ModelBoiler extends ModelBase
{
  //fields
    ModelRenderer URLeg;
    ModelRenderer LRLeg;
    ModelRenderer LLLeg;
    ModelRenderer ULLeg;
    ModelRenderer CrossbeamB;
    ModelRenderer CrossbeamA;
    ModelRenderer HotPlate;
    ModelRenderer SupportRight;
    ModelRenderer SupportLeft;
    ModelRenderer StrutLeft;
    ModelRenderer StrutRight;
    ModelRenderer PotBase;
    ModelRenderer LeftWall;
    ModelRenderer RightWall;
    ModelRenderer FrontWall;
    ModelRenderer BackWall;
    ModelRenderer HandleRight;
    ModelRenderer HandleLeft;
  
  public ModelBoiler()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      URLeg = new ModelRenderer(this, 56, 0);
      URLeg.addBox(0F, 0F, 0F, 2, 6, 2);
      URLeg.setRotationPoint(6F, 18F, 6F);
      URLeg.setTextureSize(64, 32);
      URLeg.mirror = true;
      setRotation(URLeg, 0F, 0F, 0F);
      LRLeg = new ModelRenderer(this, 56, 0);
      LRLeg.addBox(0F, 0F, 0F, 2, 6, 2);
      LRLeg.setRotationPoint(6F, 18F, -8F);
      LRLeg.setTextureSize(64, 32);
      LRLeg.mirror = true;
      setRotation(LRLeg, 0F, 0F, 0F);
      LLLeg = new ModelRenderer(this, 56, 0);
      LLLeg.addBox(0F, 0F, 0F, 2, 6, 2);
      LLLeg.setRotationPoint(-8F, 18F, -8F);
      LLLeg.setTextureSize(64, 32);
      LLLeg.mirror = true;
      setRotation(LLLeg, 0F, 0F, 0F);
      ULLeg = new ModelRenderer(this, 56, 0);
      ULLeg.addBox(0F, 0F, 0F, 2, 6, 2);
      ULLeg.setRotationPoint(-8F, 18F, 6F);
      ULLeg.setTextureSize(64, 32);
      ULLeg.mirror = true;
      setRotation(ULLeg, 0F, 0F, 0F);
      CrossbeamB = new ModelRenderer(this, 22, 11);
      CrossbeamB.addBox(0F, 0F, 0F, 1, 1, 20);
      CrossbeamB.setRotationPoint(7F, 22F, -7.7F);
      CrossbeamB.setTextureSize(64, 32);
      CrossbeamB.mirror = true;
      setRotation(CrossbeamB, 0F, -0.7853982F, 0.0349066F);
      CrossbeamA = new ModelRenderer(this, 22, 11);
      CrossbeamA.addBox(0F, 0F, 0F, 1, 1, 20);
      CrossbeamA.setRotationPoint(-7F, 22F, -6.5F);
      CrossbeamA.setTextureSize(64, 32);
      CrossbeamA.mirror = true;
      setRotation(CrossbeamA, 0F, 0.7853982F, 0F);
      HotPlate = new ModelRenderer(this, 36, 0);
      HotPlate.addBox(0F, 0F, 0F, 5, 1, 5);
      HotPlate.setRotationPoint(-2.5F, 21F, -2.5F);
      HotPlate.setTextureSize(64, 32);
      HotPlate.mirror = true;
      setRotation(HotPlate, 0F, 0F, 0F);
      SupportRight = new ModelRenderer(this, 25, 15);
      SupportRight.addBox(0F, 0F, 0F, 2, 1, 16);
      SupportRight.setRotationPoint(6F, 17F, -8F);
      SupportRight.setTextureSize(64, 32);
      SupportRight.mirror = true;
      setRotation(SupportRight, 0F, 0F, 0F);
      SupportLeft = new ModelRenderer(this, 25, 15);
      SupportLeft.addBox(0F, 0F, 0F, 2, 1, 16);
      SupportLeft.setRotationPoint(-8F, 17F, -8F);
      SupportLeft.setTextureSize(64, 32);
      SupportLeft.mirror = true;
      setRotation(SupportLeft, 0F, 0F, 0F);
      StrutLeft = new ModelRenderer(this, 22, 0);
      StrutLeft.addBox(0F, 0F, 0F, 1, 9, 2);
      StrutLeft.setRotationPoint(-7F, 8F, -1F);
      StrutLeft.setTextureSize(64, 32);
      StrutLeft.mirror = true;
      setRotation(StrutLeft, 0F, 0F, 0F);
      StrutRight = new ModelRenderer(this, 22, 0);
      StrutRight.addBox(0F, 0F, 0F, 1, 9, 2);
      StrutRight.setRotationPoint(6F, 8F, -1F);
      StrutRight.setTextureSize(64, 32);
      StrutRight.mirror = true;
      setRotation(StrutRight, 0F, 0F, 0F);
      PotBase = new ModelRenderer(this, 23, 21);
      PotBase.addBox(0F, 0F, 0F, 10, 1, 10);
      PotBase.setRotationPoint(-5F, 17F, -5F);
      PotBase.setTextureSize(64, 32);
      PotBase.mirror = true;
      setRotation(PotBase, 0F, 0F, 0F);
      LeftWall = new ModelRenderer(this, 0, 0);
      LeftWall.addBox(0F, 0F, 0F, 1, 10, 10);
      LeftWall.setRotationPoint(-5F, 7F, -5F);
      LeftWall.setTextureSize(64, 32);
      LeftWall.mirror = true;
      setRotation(LeftWall, 0F, 0F, 0F);
      RightWall = new ModelRenderer(this, 0, 0);
      RightWall.addBox(0F, 0F, 0F, 1, 10, 10);
      RightWall.setRotationPoint(4F, 7F, -5F);
      RightWall.setTextureSize(64, 32);
      RightWall.mirror = true;
      setRotation(RightWall, 0F, 0F, 0F);
      FrontWall = new ModelRenderer(this, 0, 21);
      FrontWall.addBox(0F, 0F, 0F, 8, 10, 1);
      FrontWall.setRotationPoint(-4F, 7F, -5F);
      FrontWall.setTextureSize(64, 32);
      FrontWall.mirror = true;
      setRotation(FrontWall, 0F, 0F, 0F);
      BackWall = new ModelRenderer(this, 0, 21);
      BackWall.addBox(0F, 0F, 0F, 8, 10, 1);
      BackWall.setRotationPoint(-4F, 7F, 4F);
      BackWall.setTextureSize(64, 32);
      BackWall.mirror = true;
      setRotation(BackWall, 0F, 0F, 0F);
      HandleRight = new ModelRenderer(this, 18, 30);
      HandleRight.addBox(0F, 0F, 0F, 1, 1, 1);
      HandleRight.setRotationPoint(5F, 9F, -0.5F);
      HandleRight.setTextureSize(64, 32);
      HandleRight.mirror = true;
      setRotation(HandleRight, 0F, 0F, 0F);
      HandleLeft = new ModelRenderer(this, 18, 30);
      HandleLeft.addBox(0F, 0F, 0F, 1, 1, 1);
      HandleLeft.setRotationPoint(-6F, 9F, -0.5F);
      HandleLeft.setTextureSize(64, 32);
      HandleLeft.mirror = true;
      setRotation(HandleLeft, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    URLeg.render(f5);
    LRLeg.render(f5);
    LLLeg.render(f5);
    ULLeg.render(f5);
    CrossbeamB.render(f5);
    CrossbeamA.render(f5);
    HotPlate.render(f5);
    SupportRight.render(f5);
    SupportLeft.render(f5);
    StrutLeft.render(f5);
    StrutRight.render(f5);
    PotBase.render(f5);
    LeftWall.render(f5);
    RightWall.render(f5);
    FrontWall.render(f5);
    BackWall.render(f5);
    HandleRight.render(f5);
    HandleLeft.render(f5);
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
  }

}