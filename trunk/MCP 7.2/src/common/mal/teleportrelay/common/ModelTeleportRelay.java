//Date: 12/3/2011 9:26:04 PM
//Template version 1.1
//Java generated by Techne
//Keep in mind that you still need to fill in some blanks
//- ZeuX

package mal.teleportrelay.common;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelTeleportRelay extends ModelBase {
	// fields
	ModelRenderer Dish;
	ModelRenderer Base;

	public ModelTeleportRelay() {
		textureWidth = 32;
		textureHeight = 32;

		setTextureOffset("Dish.Dish_Frame_Bottom", 0, 0);
		setTextureOffset("Dish.Dish_Back", 0, 0);
		setTextureOffset("Dish.Dish_Frame_Right", 0, 0);
		setTextureOffset("Dish.Dish_Frame_Left", 0, 0);
		setTextureOffset("Dish.Dish_Frame_Top", 0, 0);
		setTextureOffset("Base.Bipod_Stalk", 3, 3);
		setTextureOffset("Base.Bipod_Base", 5, 5);

		Dish = new ModelRenderer(this, "Dish");
		Dish.setRotationPoint(-4F, 15F, 1F);
		setRotation(Dish, 0F, 0F, 0F);
		Dish.mirror = false;
		Dish.addBox("Dish_Frame_Bottom", 1F, 6F, 1F, 5, 1, 1);
		Dish.addBox("Dish_Back", 0F, 0F, 0F, 7, 7, 1);
		Dish.addBox("Dish_Frame_Right", 0F, 0F, 1F, 1, 7, 1);
		Dish.addBox("Dish_Frame_Left", 6F, 0F, 1F, 1, 7, 1);
		Dish.addBox("Dish_Frame_Top", 1F, 0F, 1F, 5, 1, 1);

		Base = new ModelRenderer(this, "Base");
		Base.setRotationPoint(-1F, 12F, 0F);
		setRotation(Base, 0F, 0F, (float)Math.PI);
		Base.mirror = false;
		Base.addBox("Bipod_Stalk", -1F, -6F, 0F, 1, 9, 1);
		Base.addBox("Bipod_Base", -4F, 3F, -3F, 7, 1, 7);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);

		Dish.render(f5);
		Base.render(f5);
	}

	public void renderModel(float f) {
		Dish.render(f);
		Base.render(f);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}
}
