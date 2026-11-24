package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La/k1s0;", "La/yx5;", "La/a0s0;", "<init>", "()V", "daily_tournament"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class k1s0 extends yx5 implements a0s0 {
    public static final /* synthetic */ iiy[] P1 = {new j0d0(k1s0.class, "viewBinding", "getViewBinding()Lorg/xplatform/games_section/feature/daily_tournament/databinding/DailyTournamentScreenFgBinding;", 0)};
    public final i9o0 K1;
    public zxi L1;
    public final kiu0 M1;
    public final n0o0 N1;
    public final s0r O1;

    public k1s0() {
        super(R.layout.daily_tournament_screen_fg);
        this.K1 = i9o0.f14396a;
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.i1s0
            public final /* synthetic */ k1s0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                k1s0 k1s0Var = this.b;
                switch (b2) {
                    case 0:
                        iiy[] iiyVarArr = k1s0.P1;
                        i1w0 i1w0VarF = a4n0.f(k1s0Var);
                        zxi zxiVar = k1s0Var.L1;
                        if (zxiVar != null) {
                            return new ry3(i1w0VarF, zxiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        iiy[] iiyVarArr2 = k1s0.P1;
                        i0h0 i0h0Var = k1s0Var.y;
                        i0h0Var.getClass();
                        return ((a0s0) i0h0Var).s();
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 16), (byte) 17));
        this.M1 = agc.G(this, sre0.f32672a.b(f7j.class), new p7r0(a8zVarA, (byte) 10), new p7r0(a8zVarA, (byte) 11), function0);
        final byte b2 = 1;
        this.N1 = maz.b(new Function0(this) { // from class: a.i1s0
            public final /* synthetic */ k1s0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                k1s0 k1s0Var = this.b;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = k1s0.P1;
                        i1w0 i1w0VarF = a4n0.f(k1s0Var);
                        zxi zxiVar = k1s0Var.L1;
                        if (zxiVar != null) {
                            return new ry3(i1w0VarF, zxiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        iiy[] iiyVarArr2 = k1s0.P1;
                        i0h0 i0h0Var = k1s0Var.y;
                        i0h0Var.getClass();
                        return ((a0s0) i0h0Var).s();
                }
            }
        });
        this.O1 = ltt0.o(this, j1s0.f15751a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.m(new kq8(G().getDimensionPixelSize(R.dimen.space_8), (byte) 4));
        vvw.o(G0().b, false, 3);
    }

    @Override // a.yx5
    public final void C0() {
        this.L1 = (zxi) ((dyi) this.N1.getValue()).c.get();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = ((f7j) this.M1.getValue()).h;
        rtq0 rtq0Var = new rtq0(this, null, (byte) 4);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0(p7m0Var, clzVarW, rtq0Var, (yje) null), 3);
    }

    public final x6j G0() {
        Object objN = this.O1.n(P1[0], this);
        objN.getClass();
        return (x6j) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().b.setAdapter(null);
    }

    @Override // a.a0s0
    public final dyi s() {
        return (dyi) this.N1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
