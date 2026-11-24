package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ppe0;", "La/yx5;", "<init>", "()V", "a/zie0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ppe0 extends yx5 {
    public final hnm0 K1;
    public ii L1;
    public fiu0 M1;
    public pv00 N1;
    public final khf0 O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final mpe0 R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(ppe0.class, "params", "getParams()Lorg/xplatform/referral/api/presentation/ReferralsListParams;", 0), new j0d0(ppe0.class, "viewBinding", "getViewBinding()Lorg/xplatform/referral/impl/databinding/FragmentReferralsListBinding;", 0)};
    public static final zie0 S1 = new zie0();

    public ppe0() {
        super(R.layout.fragment_referrals_list);
        this.K1 = hnm0.f13359a;
        this.O1 = new khf0("params");
        kpe0 kpe0Var = new kpe0(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new lce0(new lce0(this, (byte) 7), (byte) 8));
        this.P1 = agc.G(this, sre0.f32672a.b(tpe0.class), new wbe0(a8zVarA, (byte) 10), new wbe0(a8zVarA, (byte) 11), kpe0Var);
        this.Q1 = ltt0.o(this, ope0.f25637a);
        this.R1 = new mpe0(this);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        byte b = 0;
        G0().i.setNavigationOnClickListener(new jpe0(this, b));
        qcc.X(this, new kpe0(this, b));
        pv00 pv00Var = this.N1;
        if (pv00Var == null) {
            Intrinsics.h("referralsRecyclerFragmentDelegate");
            throw null;
        }
        RecyclerView recyclerView = G0().f;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((gkz) pv00Var.f27640a);
        recyclerView.setItemAnimator(null);
        vvw.o(recyclerView, false, 3);
        dyb.N(G0().b, ymx.INTERVAL_400, new lpe0(this, b));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qpe0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qpe0 qpe0Var = (qpe0) (ze3Var instanceof qpe0 ? ze3Var : null);
            if (qpe0Var != null) {
                mpe0 mpe0Var = this.R1;
                mpe0Var.getClass();
                pzu pzuVar = qpe0Var.f29114a;
                btt0 btt0Var = qpe0Var.b;
                gst0 gst0Var = qpe0Var.c;
                gii0 gii0Var = qpe0Var.d;
                ii iiVar = qpe0Var.e;
                duj dujVar = qpe0Var.f;
                wsf0 wsf0Var = qpe0Var.h;
                sa10 sa10Var = qpe0Var.g;
                ioe0 ioe0Var = qpe0Var.i;
                iiVar.getClass();
                btt0Var.getClass();
                gst0Var.getClass();
                gii0Var.getClass();
                ioe0Var.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = ioe0Var;
                g45Var.b = gii0Var;
                g45Var.c = btt0Var;
                g45Var.d = gst0Var;
                g45Var.e = wsf0Var;
                g45Var.f = pzuVar;
                g45Var.g = dujVar;
                g45Var.h = sa10Var;
                g45Var.i = new ppi(g45Var, (byte) 28);
                this.L1 = iiVar;
                this.M1 = new fiu0(Collections.singletonMap(tpe0.class, (ppi) g45Var.i));
                gkz gkzVar = new gkz(gkz.h);
                gkzVar.d.b(new gbn(new k8e0((byte) 14), new o5c0(3, (byte) 15), new eme0(mpe0Var, (byte) 4), x4c0.r));
                this.N1 = new pv00(gkzVar);
                return;
            }
        }
        jf4.n(b1j.i(qpe0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().i;
        s9c0 s9c0Var = new s9c0(this, null, (byte) 28);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g4e0(p7m0Var, clzVarW, s9c0Var, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var2 = H0().j;
        coc0 coc0Var = new coc0(this, null, (byte) 14);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g4e0(p7m0Var2, clzVarW2, coc0Var, (yje) null, (byte) 0), 3);
    }

    public final z3r G0() {
        Object objN = this.Q1.n(U1[1], this);
        objN.getClass();
        return (z3r) objN;
    }

    public final tpe0 H0() {
        return (tpe0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        C().u0("RESULT_KEY_DATE_TIME_CALENDAR_REQUEST", this, new mpe0(this));
        ccq0.V(this, "deleteReferral", new kpe0(this, (byte) 2));
        sj3.s0(this, "selectDateFilterDialogKey", new lpe0(this, (byte) 1));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        if (this.N1 != null) {
            G0().f.setAdapter(null);
        } else {
            Intrinsics.h("referralsRecyclerFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
