package a;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La/u3s0;", "La/yx5;", "La/a0s0;", "<init>", "()V", "daily_tournament"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u3s0 extends yx5 implements a0s0 {
    public static final /* synthetic */ iiy[] R1 = {new j0d0(u3s0.class, "viewBinding", "getViewBinding()Lorg/xplatform/games_section/feature/daily_tournament/databinding/DailyTournamentPrizesFgBinding;", 0)};
    public final i9o0 K1;
    public byi L1;
    public final kiu0 M1;
    public final n0o0 N1;
    public final n0o0 O1;
    public final s0r P1;
    public final gz6 Q1;

    public u3s0() {
        super(R.layout.daily_tournament_prizes_fg);
        this.K1 = i9o0.f14396a;
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.q3s0
            public final /* synthetic */ u3s0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                u3s0 u3s0Var = this.b;
                switch (b2) {
                    case 0:
                        iiy[] iiyVarArr = u3s0.R1;
                        i1w0 i1w0VarF = a4n0.f(u3s0Var);
                        byi byiVar = u3s0Var.L1;
                        if (byiVar != null) {
                            return new ry3(i1w0VarF, byiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        iiy[] iiyVarArr2 = u3s0.R1;
                        i0h0 i0h0Var = u3s0Var.y;
                        i0h0Var.getClass();
                        return ((a0s0) i0h0Var).s();
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 20), (byte) 21));
        this.M1 = agc.G(this, sre0.f32672a.b(v6j.class), new p7r0(a8zVarA, (byte) 14), new p7r0(a8zVarA, (byte) 15), function0);
        final byte b2 = 1;
        this.N1 = maz.b(new Function0(this) { // from class: a.q3s0
            public final /* synthetic */ u3s0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                u3s0 u3s0Var = this.b;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = u3s0.R1;
                        i1w0 i1w0VarF = a4n0.f(u3s0Var);
                        byi byiVar = u3s0Var.L1;
                        if (byiVar != null) {
                            return new ry3(i1w0VarF, byiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        iiy[] iiyVarArr2 = u3s0.R1;
                        i0h0 i0h0Var = u3s0Var.y;
                        i0h0Var.getClass();
                        return ((a0s0) i0h0Var).s();
                }
            }
        });
        this.O1 = maz.b(new yqr0((byte) 15));
        this.P1 = ltt0.o(this, s3s0.f31574a);
        this.Q1 = new gz6(this, (byte) 4);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().f.setLayoutManager(new LinearLayoutManager(G0().f.getContext()));
        G0().f.o(this.Q1);
        vvw.o(G0().f, false, 3);
    }

    @Override // a.yx5
    public final void C0() {
        this.L1 = (byi) ((dyi) this.N1.getValue()).e.get();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = ((v6j) this.M1.getValue()).e;
        rtq0 rtq0Var = new rtq0(this, null, (byte) 6);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0((gmq) p7m0Var, clzVarW, rtq0Var, (yje) null, (char) 0), 3);
    }

    public final q6j G0() {
        Object objN = this.P1.n(R1[0], this);
        objN.getClass();
        return (q6j) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().f.setAdapter(null);
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
