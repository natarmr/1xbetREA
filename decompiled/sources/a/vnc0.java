package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vnc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37713a;
    public final /* synthetic */ znc0 b;

    public /* synthetic */ vnc0(znc0 znc0Var, byte b) {
        this.f37713a = b;
        this.b = znc0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37713a;
        znc0 znc0Var = this.b;
        switch (b) {
            case 0:
                rl70 rl70Var = znc0.U1;
                znc0Var.H0().c.x();
                return Unit.f46060a;
            case 1:
                wpi wpiVar = znc0Var.O1;
                if (wpiVar != null) {
                    return new q0h0(wpiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                rl70 rl70Var2 = znc0.U1;
                doc0 doc0VarH0 = znc0Var.H0();
                String strA = doc0VarH0.h.a().Z1;
                if (strA.length() == 0) {
                    strA = doc0VarH0.k.b.a(R.string.one_x_club, Arrays.copyOf(new Object[0], 0));
                }
                l8c0 l8c0Var = new l8c0(1, znc0Var.H0(), doc0.class, "onSimpleItemClicked", "onSimpleItemClicked(Lorg/xplatform/promo/impl/settings/presentation/adapter/uimodels/simple/PromoSimpleUiItem;)V", 0, (byte) 25);
                b0c0 b0c0Var = new b0c0(0, znc0Var.H0(), doc0.class, "onPromoShopClicked", "onPromoShopClicked()V", 0, (byte) 15);
                unc0 unc0Var = new unc0();
                gbn gbnVar = new gbn(new ksc0((byte) 4), new o5c0(3, (byte) 13), new ljc0((byte) 10), x4c0.p);
                dp dpVar = unc0Var.d;
                dpVar.b(gbnVar);
                dpVar.b(x1x.I());
                dpVar.b(new gbn(new t4c0((byte) 4), new o5c0(3, (byte) 0), new wyb0((byte) 11), x4c0.c));
                dpVar.b(m2x.A(strA, l8c0Var));
                dpVar.b(new gbn(new t4c0((byte) 6), new o5c0(3, (byte) 2), new v5c0(b0c0Var, (byte) 0), x4c0.e));
                return unc0Var;
        }
    }
}
