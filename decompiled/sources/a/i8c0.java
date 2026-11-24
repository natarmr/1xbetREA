package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i8c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14332a;
    public final /* synthetic */ m8c0 b;

    public /* synthetic */ i8c0(m8c0 m8c0Var, byte b) {
        this.f14332a = b;
        this.b = m8c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14332a;
        m8c0 m8c0Var = this.b;
        switch (b) {
            case 0:
                ypi ypiVar = m8c0Var.O1;
                if (ypiVar != null) {
                    return new q0h0(ypiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                mi70 mi70Var = m8c0.V1;
                String strX = m8c0Var.H0().x();
                e9b0 e9b0Var = new e9b0(1, m8c0Var.H0(), hyc0.class, "onSimpleItemClicked", "onSimpleItemClicked(Lorg/xplatform/promo/impl/settings/presentation/adapter/uimodels/simple/PromoSimpleUiItem;)V", 0, (byte) 28);
                b0c0 b0c0Var = new b0c0(0, m8c0Var.H0(), hyc0.class, "onLoadPromoBalanceClicked", "onLoadPromoBalanceClicked()V", 0, (byte) 2);
                e9b0 e9b0Var2 = new e9b0(1, m8c0Var.H0(), hyc0.class, "onPromoBannerItemClicked", "onPromoBannerItemClicked(Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollectionItemModel;)V", 0, (byte) 29);
                b0c0 b0c0Var2 = new b0c0(0, m8c0Var.H0(), hyc0.class, "onPromoShopClicked", "onPromoShopClicked()V", 0, (byte) 3);
                l8c0 l8c0Var = new l8c0(1, m8c0Var.H0(), hyc0.class, "onBonusGamesItemClicked", "onBonusGamesItemClicked(Lorg/xplatform/uikit_web_games/game_collection/GameCollectionItemModel;)V", 0, (byte) 0);
                b0c0 b0c0Var3 = new b0c0(0, m8c0Var.H0(), hyc0.class, "onBonusGamesAllClicked", "onBonusGamesAllClicked()V", 0, (byte) 4);
                l8c0 l8c0Var2 = new l8c0(1, m8c0Var.H0(), hyc0.class, "onPromoAdditionalItemClicked", "onPromoAdditionalItemClicked(Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalItemModel;)V", 0, (byte) 1);
                h8c0 h8c0Var = new h8c0();
                gbn gbnVarI = x1x.I();
                dp dpVar = h8c0Var.d;
                dpVar.b(gbnVarI);
                dpVar.b(new gbn(new j3b0((byte) 27), new iv60(3, (byte) 24), new wyb0((byte) 8), xk60.A));
                dpVar.b(new gbn(new t4c0((byte) 9), new o5c0(3, (byte) 5), new wyb0((byte) 14), x4c0.h));
                dpVar.b(new gbn(new t4c0((byte) 2), new iv60(3, (byte) 28), new wyb0((byte) 10), xk60.f1));
                dpVar.b(m2x.A(strX, e9b0Var));
                dpVar.b(new gbn(new j3b0((byte) 28), new iv60(3, (byte) 25), new rpa0(l8c0Var2, (byte) 18), xk60.B));
                dpVar.b(ucx.d0(b0c0Var3, l8c0Var));
                dpVar.b(new gbn(new t4c0((byte) 3), new iv60(3, (byte) 29), new zlb0(b0c0Var, e9b0Var2, b0c0Var2, (byte) 2), x4c0.b));
                return h8c0Var;
            default:
                mi70 mi70Var2 = m8c0.V1;
                m8c0Var.H0().c.x();
                return Unit.f46060a;
        }
    }
}
