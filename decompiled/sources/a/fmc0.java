package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fmc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9774a;
    public final /* synthetic */ jmc0 b;

    public /* synthetic */ fmc0(jmc0 jmc0Var, byte b) {
        this.f9774a = b;
        this.b = jmc0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9774a;
        jmc0 jmc0Var = this.b;
        switch (b) {
            case 0:
                ypi ypiVar = jmc0Var.O1;
                if (ypiVar != null) {
                    return new q0h0(ypiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                nh70 nh70Var = jmc0.U1;
                String strX = jmc0Var.H0().x();
                l8c0 l8c0Var = new l8c0(1, jmc0Var.H0(), hyc0.class, "onSimpleItemClicked", "onSimpleItemClicked(Lorg/xplatform/promo/impl/settings/presentation/adapter/uimodels/simple/PromoSimpleUiItem;)V", 0, (byte) 20);
                b0c0 b0c0Var = new b0c0(0, jmc0Var.H0(), hyc0.class, "onLoadPromoBalanceClicked", "onLoadPromoBalanceClicked()V", 0, (byte) 12);
                l8c0 l8c0Var2 = new l8c0(1, jmc0Var.H0(), hyc0.class, "onPromoBannerItemClicked", "onPromoBannerItemClicked(Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollectionItemModel;)V", 0, (byte) 21);
                b0c0 b0c0Var2 = new b0c0(0, jmc0Var.H0(), hyc0.class, "onPromoShopClicked", "onPromoShopClicked()V", 0, (byte) 13);
                l8c0 l8c0Var3 = new l8c0(1, jmc0Var.H0(), hyc0.class, "onBonusGamesItemClicked", "onBonusGamesItemClicked(Lorg/xplatform/uikit_web_games/game_collection/GameCollectionItemModel;)V", 0, (byte) 22);
                b0c0 b0c0Var3 = new b0c0(0, jmc0Var.H0(), hyc0.class, "onBonusGamesAllClicked", "onBonusGamesAllClicked()V", 0, (byte) 14);
                l8c0 l8c0Var4 = new l8c0(1, jmc0Var.H0(), hyc0.class, "onPromoAdditionalItemClicked", "onPromoAdditionalItemClicked(Lorg/xplatform/promo/impl/settings/presentation/adapter/uimodels/simple/PromoSimpleUiItem;)V", 0, (byte) 23);
                emc0 emc0Var = new emc0();
                gbn gbnVarI = x1x.I();
                dp dpVar = emc0Var.d;
                dpVar.b(gbnVarI);
                dpVar.b(new gbn(new t4c0((byte) 0), new iv60(3, (byte) 26), new wyb0((byte) 9), xk60.Y));
                dpVar.b(new gbn(new t4c0((byte) 11), new o5c0(3, (byte) 7), new wyb0((byte) 15), x4c0.j));
                dpVar.b(new gbn(new t4c0((byte) 7), new o5c0(3, (byte) 3), new wyb0((byte) 12), x4c0.f));
                dpVar.b(m2x.A(strX, l8c0Var));
                dpVar.b(new gbn(new t4c0((byte) 1), new iv60(3, (byte) 27), new zga0(strX, l8c0Var4, (byte) 27), xk60.Z));
                dpVar.b(new gbn(new t4c0((byte) 12), new o5c0(3, (byte) 8), new zga0(l8c0Var3, b0c0Var3, (byte) 28), x4c0.k));
                dpVar.b(new gbn(new t4c0((byte) 8), new o5c0(3, (byte) 4), new zlb0(b0c0Var, l8c0Var2, b0c0Var2, (byte) 3), x4c0.g));
                return emc0Var;
            default:
                nh70 nh70Var2 = jmc0.U1;
                jmc0Var.H0().c.x();
                return Unit.f46060a;
        }
    }
}
