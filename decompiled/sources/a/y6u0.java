package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/y6u0;", "La/yx5;", "<init>", "()V", "a/bzs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y6u0 extends yx5 {
    public final hnm0 K1;
    public final boolean L1;
    public tyi M1;
    public final s0r N1;
    public final kiu0 O1;
    public final n0o0 P1;
    public final zz2 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(y6u0.class, "viewBinding", "getViewBinding()Lorg/xplatform/special_event/impl/databinding/FragmentVenuesBinding;", 0), new ez40(y6u0.class, "eventId", "getEventId()I", 0)};
    public static final bzs0 R1 = new bzs0((byte) 6);
    public static final String U1 = y6u0.class.getSimpleName();

    public y6u0() {
        super(R.layout.fragment_venues);
        this.K1 = hnm0.f13359a;
        this.L1 = true;
        this.N1 = ltt0.o(this, x6u0.f40382a);
        v6u0 v6u0Var = new v6u0(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new cvs0(new cvs0(this, (byte) 9), (byte) 10));
        this.O1 = agc.G(this, sre0.f32672a.b(g7u0.class), new w6u0(a8zVarA, (byte) 0), new w6u0(a8zVarA, (byte) 1), v6u0Var);
        this.P1 = maz.b(new v6u0(this, (byte) 2));
        this.Q1 = new zz2("SPECIAL_EVENT_ID_BUNDLE_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().d.b(new v6u0(this, (byte) 0));
        G0().e.setAdapter((s6u0) this.P1.getValue());
        G0().e.m(new qmk0(G().getDimensionPixelSize(R.dimen.space_8), 0, 0, 0, 0, 1, null, null, 478));
        vvw.o(G0().e, true, 1);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(t6u0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            t6u0 t6u0Var = (t6u0) (ze3Var instanceof t6u0 ? ze3Var : null);
            if (t6u0Var != null) {
                Integer numN = this.Q1.n(this, S1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                String simpleName = y6u0.class.getSimpleName();
                i1w0VarF.getClass();
                j1q0 j1q0Var = t6u0Var.f33437a;
                cad cadVar = t6u0Var.b;
                knf0 knf0Var = t6u0Var.c;
                gii0 gii0Var = t6u0Var.d;
                ctf0 ctf0Var = t6u0Var.e;
                g2v g2vVar = t6u0Var.f;
                igm0 igm0Var = t6u0Var.g;
                yo4 yo4Var = t6u0Var.h;
                d1p d1pVar = t6u0Var.i;
                d1pVar.getClass();
                j1q0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                igm0Var.getClass();
                this.M1 = (tyi) ((n5d0) new nc0(cadVar, d1pVar, simpleName, i1w0VarF, numN, knf0Var, gii0Var, ctf0Var, g2vVar, igm0Var, yo4Var).n).get();
                return;
            }
        }
        jf4.n(b1j.i(t6u0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        qaf0 qaf0Var = new qaf0(((g7u0) this.O1.getValue()).j, (byte) 18);
        k5r0 k5r0Var = new k5r0(2, this, y6u0.class, "handleUiState", "handleUiState(Lorg/xplatform/special_event/impl/venues/presentation/VenuesUiStateModel;)V", 4, (byte) 13);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0(qaf0Var, clzVarW, k5r0Var, (yje) null), 3);
    }

    public final k6r G0() {
        Object objN = this.N1.n(S1[0], this);
        objN.getClass();
        return (k6r) objN;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.L1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
