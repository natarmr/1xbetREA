package a;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.recycler.managers.ExpandableLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La/z8s0;", "La/yx5;", "La/a0s0;", "<init>", "()V", "daily_tournament"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z8s0 extends yx5 implements a0s0 {
    public static final /* synthetic */ iiy[] U1 = {new j0d0(z8s0.class, "viewBinding", "getViewBinding()Lorg/xplatform/games_section/feature/daily_tournament/databinding/DailyTournamentResultsWinnerFgBinding;", 0)};
    public final i9o0 K1;
    public ayi L1;
    public final kiu0 M1;
    public final n0o0 N1;
    public final n0o0 O1;
    public final n0o0 P1;
    public final s0r Q1;
    public final gz6 R1;
    public final qpm0 S1;

    public z8s0() {
        super(R.layout.daily_tournament_results_winner_fg);
        this.K1 = i9o0.f14396a;
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.x8s0
            public final /* synthetic */ z8s0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                z8s0 z8s0Var = this.b;
                switch (b2) {
                    case 0:
                        iiy[] iiyVarArr = z8s0.U1;
                        i1w0 i1w0VarF = a4n0.f(z8s0Var);
                        ayi ayiVar = z8s0Var.L1;
                        if (ayiVar != null) {
                            return new ry3(i1w0VarF, ayiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    case 1:
                        iiy[] iiyVarArr2 = z8s0.U1;
                        i0h0 i0h0Var = z8s0Var.y;
                        i0h0Var.getClass();
                        return ((a0s0) i0h0Var).s();
                    default:
                        iiy[] iiyVarArr3 = z8s0.U1;
                        return new rac(new mjr0(1, (o7j) z8s0Var.M1.getValue(), o7j.class, "loadWinnersByDay", "loadWinnersByDay$daily_tournament(Ljava/lang/String;)V", 0, (byte) 29));
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 22), (byte) 23));
        this.M1 = agc.G(this, sre0.f32672a.b(o7j.class), new p7r0(a8zVarA, (byte) 16), new p7r0(a8zVarA, (byte) 17), function0);
        final byte b2 = 1;
        this.N1 = maz.b(new Function0(this) { // from class: a.x8s0
            public final /* synthetic */ z8s0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                z8s0 z8s0Var = this.b;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = z8s0.U1;
                        i1w0 i1w0VarF = a4n0.f(z8s0Var);
                        ayi ayiVar = z8s0Var.L1;
                        if (ayiVar != null) {
                            return new ry3(i1w0VarF, ayiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    case 1:
                        iiy[] iiyVarArr2 = z8s0.U1;
                        i0h0 i0h0Var = z8s0Var.y;
                        i0h0Var.getClass();
                        return ((a0s0) i0h0Var).s();
                    default:
                        iiy[] iiyVarArr3 = z8s0.U1;
                        return new rac(new mjr0(1, (o7j) z8s0Var.M1.getValue(), o7j.class, "loadWinnersByDay", "loadWinnersByDay$daily_tournament(Ljava/lang/String;)V", 0, (byte) 29));
                }
            }
        });
        this.O1 = maz.b(new yqr0((byte) 20));
        final byte b3 = 2;
        this.P1 = maz.b(new Function0(this) { // from class: a.x8s0
            public final /* synthetic */ z8s0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                z8s0 z8s0Var = this.b;
                switch (b4) {
                    case 0:
                        iiy[] iiyVarArr = z8s0.U1;
                        i1w0 i1w0VarF = a4n0.f(z8s0Var);
                        ayi ayiVar = z8s0Var.L1;
                        if (ayiVar != null) {
                            return new ry3(i1w0VarF, ayiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    case 1:
                        iiy[] iiyVarArr2 = z8s0.U1;
                        i0h0 i0h0Var = z8s0Var.y;
                        i0h0Var.getClass();
                        return ((a0s0) i0h0Var).s();
                    default:
                        iiy[] iiyVarArr3 = z8s0.U1;
                        return new rac(new mjr0(1, (o7j) z8s0Var.M1.getValue(), o7j.class, "loadWinnersByDay", "loadWinnersByDay$daily_tournament(Ljava/lang/String;)V", 0, (byte) 29));
                }
            }
        });
        this.Q1 = ltt0.o(this, y8s0.f42210a);
        this.R1 = new gz6(this, (byte) 5);
        this.S1 = new qpm0(this);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        RecyclerView recyclerView = G0().f;
        Context context = G0().f.getContext();
        context.getClass();
        recyclerView.setLayoutManager(new ExpandableLayoutManager(context, null, 0, 0));
        G0().b.setLayoutManager(new LinearLayoutManager(D(), 0, false));
        G0().b.m(this.S1);
        if (G0().b.getAdapter() == null) {
            G0().b.setAdapter((rac) this.P1.getValue());
        }
        G0().f.o(this.R1);
        vvw.o(G0().f, false, 3);
    }

    @Override // a.yx5
    public final void C0() {
        this.L1 = (ayi) ((dyi) this.N1.getValue()).d.get();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = ((o7j) this.M1.getValue()).g;
        rtq0 rtq0Var = new rtq0(this, null, (byte) 10);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0(p7m0Var, clzVarW, rtq0Var, (yje) null, 0), 3);
    }

    public final w6j G0() {
        Object objN = this.Q1.n(U1[0], this);
        objN.getClass();
        return (w6j) objN;
    }

    public final void H0(boolean z) {
        G0().f.setVisibility(!z ? 0 : 8);
        G0().b.setVisibility(!z ? 0 : 8);
        G0().e.setVisibility(z ? 0 : 8);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().f.setAdapter(null);
        G0().b.setAdapter(null);
    }

    @Override // a.a0s0
    public final dyi s() {
        return (dyi) this.N1.getValue();
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
