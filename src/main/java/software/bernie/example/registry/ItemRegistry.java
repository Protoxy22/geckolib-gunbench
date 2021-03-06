package software.bernie.example.registry;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.example.client.renderer.item.JackInTheBoxRenderer;
import software.bernie.example.item.JackInTheBoxItem;
import software.bernie.example.item.PotatoArmorItem;
import software.bernie.geckolib3.GeckoLib;

public class ItemRegistry
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GeckoLib.ModID);

	public static final RegistryObject<JackInTheBoxItem> JACK_IN_THE_BOX = ITEMS.register("jackintheboxitem", () -> new JackInTheBoxItem(new Item.Properties().setISTER(() -> JackInTheBoxRenderer::new)));

	public static final RegistryObject<PotatoArmorItem> POTATO_HEAD = ITEMS.register("potato_head", () -> new PotatoArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties()));
	public static final RegistryObject<PotatoArmorItem> POTATO_CHEST = ITEMS.register("potato_chest", () -> new PotatoArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.CHEST, new Item.Properties()));
	public static final RegistryObject<PotatoArmorItem> POTATO_LEGGINGS = ITEMS.register("potato_leggings", () -> new PotatoArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.LEGS, new Item.Properties()));
	public static final RegistryObject<PotatoArmorItem> POTATO_BOOTS = ITEMS.register("potato_boots", () -> new PotatoArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.FEET, new Item.Properties()));
}
