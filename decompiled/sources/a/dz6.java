package a;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dz6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6926a;
    public final /* synthetic */ hz6 b;

    public /* synthetic */ dz6(hz6 hz6Var, byte b) {
        this.f6926a = b;
        this.b = hz6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6926a;
        hz6 hz6Var = this.b;
        switch (b) {
            case 0:
                cl5 cl5Var = hz6.p2;
                i1w0 i1w0VarF = a4n0.f(hz6Var);
                jki jkiVar = hz6Var.l2;
                if (jkiVar != null) {
                    return new ry3(i1w0VarF, jkiVar);
                }
                Intrinsics.h("betGameShopPromoViewModelFactory");
                throw null;
            case 1:
                cl5 cl5Var2 = hz6.p2;
                ur6 ur6Var = new ur6(1, hz6Var.U0(), b07.class, "onGameCountClick", "onGameCountClick$impl(Lorg/xplatform/bonus_games/impl/core/presentation/game_count/GameCountItemUiModel;)V", 0, (byte) 11);
                c6s c6sVar = new c6s(c6s.f);
                c6sVar.d.b(new gbn(new s3t((byte) 4), new atq(3, (byte) 28), new t3t(ur6Var, (byte) 1), fvr.v));
                return c6sVar;
            case 2:
                cl5 cl5Var3 = hz6.p2;
                if (!hz6Var.m) {
                    hz6Var.x0();
                }
                Fragment fragment = hz6Var.y;
                Fragment fragment2 = fragment != null ? fragment.y : null;
                kjc0 kjc0Var = fragment2 instanceof kjc0 ? (kjc0) fragment2 : null;
                gkc0 gkc0VarK0 = kjc0Var != null ? kjc0Var.K0() : null;
                if (gkc0VarK0 != null) {
                    gkc0VarK0.y();
                }
                Fragment fragment3 = hz6Var.y;
                Fragment fragment4 = fragment3 != null ? fragment3.y : null;
                kjc0 kjc0Var2 = fragment4 instanceof kjc0 ? (kjc0) fragment4 : null;
                if (kjc0Var2 != null && (kjc0Var2.K0().p.getValue() instanceof tjc0)) {
                    kjc0Var2.L0(true);
                }
                return Unit.f46060a;
            case 3:
                cl5 cl5Var4 = hz6.p2;
                Fragment fragment5 = hz6Var.y;
                Fragment fragment6 = fragment5 != null ? fragment5.y : null;
                kjc0 kjc0Var3 = fragment6 instanceof kjc0 ? (kjc0) fragment6 : null;
                gkc0 gkc0VarK1 = kjc0Var3 != null ? kjc0Var3.K0() : null;
                if (gkc0VarK1 != null) {
                    p7m0 p7m0Var = gkc0VarK1.p;
                    p7m0Var.getClass();
                    p7m0Var.o(null, pjc0.f27083a);
                    gkc0VarK1.w();
                }
                return Unit.f46060a;
            default:
                cl5 cl5Var5 = hz6.p2;
                b07 b07VarU0 = hz6Var.U0();
                rg5 rg5Var = (rg5) CollectionsKt.W(b07VarU0.u, b07VarU0.v);
                if (rg5Var != null) {
                    b07VarU0.d.a(b07VarU0.b, true, rg5Var.f30416a);
                }
                return Unit.f46060a;
        }
    }
}
