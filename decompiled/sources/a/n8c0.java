package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n8c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23082a;
    public final /* synthetic */ r8c0 b;

    public /* synthetic */ n8c0(r8c0 r8c0Var, byte b) {
        this.f23082a = b;
        this.b = r8c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23082a;
        r8c0 r8c0Var = this.b;
        switch (b) {
            case 0:
                zpi zpiVar = r8c0Var.O1;
                if (zpiVar != null) {
                    return new q0h0(zpiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                xi70 xi70Var = r8c0.U1;
                qyc0 qyc0VarH0 = r8c0Var.H0();
                String strA = qyc0VarH0.p.a().Z1;
                if (strA.length() == 0) {
                    strA = qyc0VarH0.l.b.a(R.string.one_x_club, Arrays.copyOf(new Object[0], 0));
                }
                l8c0 l8c0Var = new l8c0(1, r8c0Var.H0(), qyc0.class, "onSimpleItemClicked", "onSimpleItemClicked(Lorg/xplatform/promo/impl/settings/presentation/adapter/uimodels/simple/PromoSimpleUiItem;)V", 0, (byte) 2);
                b0c0 b0c0Var = new b0c0(0, r8c0Var.H0(), qyc0.class, "onPromoShopClicked", "onPromoShopClicked()V", 0, (byte) 5);
                l8c0 l8c0Var2 = new l8c0(1, r8c0Var.H0(), qyc0.class, "onBonusGamesItemClicked", "onBonusGamesItemClicked(Lorg/xplatform/uikit_web_games/game_collection/GameCollectionItemModel;)V", 0, (byte) 3);
                b0c0 b0c0Var2 = new b0c0(0, r8c0Var.H0(), qyc0.class, "onBonusGamesAllClicked", "onBonusGamesAllClicked()V", 0, (byte) 6);
                l8c0 l8c0Var3 = new l8c0(1, r8c0Var.H0(), qyc0.class, "onPromoAdditionalItemClicked", "onPromoAdditionalItemClicked(Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalItemModel;)V", 0, (byte) 4);
                g8c0 g8c0Var = new g8c0();
                gbn gbnVarI = x1x.I();
                dp dpVar = g8c0Var.d;
                dpVar.b(gbnVarI);
                dpVar.b(new gbn(new t4c0((byte) 4), new o5c0(3, (byte) 0), new wyb0((byte) 11), x4c0.c));
                dpVar.b(new gbn(new j3b0((byte) 27), new iv60(3, (byte) 24), new wyb0((byte) 8), xk60.A));
                dpVar.b(new gbn(new t4c0((byte) 9), new o5c0(3, (byte) 5), new wyb0((byte) 14), x4c0.h));
                dpVar.b(m2x.A(strA, l8c0Var));
                dpVar.b(new gbn(new t4c0((byte) 5), new o5c0(3, (byte) 1), new u5c0(b0c0Var, (byte) 0), x4c0.d));
                dpVar.b(new gbn(new j3b0((byte) 28), new iv60(3, (byte) 25), new rpa0(l8c0Var3, (byte) 18), xk60.B));
                dpVar.b(ucx.d0(b0c0Var2, l8c0Var2));
                return g8c0Var;
            default:
                xi70 xi70Var2 = r8c0.U1;
                r8c0Var.H0().c.x();
                return Unit.f46060a;
        }
    }
}
