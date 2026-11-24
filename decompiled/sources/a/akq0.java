package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/akq0;", "La/yx5;", "<init>", "()V", "a/s9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class akq0 extends yx5 {
    public hxi K1;
    public ii L1;
    public final zz2 M1;
    public final a8z N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(akq0.class, "limitTypeId", "getLimitTypeId()I", 0), new j0d0(akq0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final s9m0 P1 = new s9m0();

    public akq0() {
        super(R.layout.compose_fragment);
        this.M1 = new zz2("LIMIT_TYPE_ID");
        this.N1 = xbc.a0(this, sre0.f32672a.b(lkq0.class), null, new yjq0(this, (byte) 0), 14);
        this.O1 = ltt0.o(this, zjq0.f44494a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_CONFIRMATION_DIALOG_KEY", new yjq0(this, (byte) 1));
        ccq0.V(this, "REQUEST_RESPONSE_ERROR_DIALOG_KEY", new yjq0(this, (byte) 2));
        Object objN = this.O1.n(Q1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-367183411, true, new l7p0(this, (byte) 24)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bkq0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bkq0 bkq0Var = (bkq0) (ze3Var instanceof bkq0 ? ze3Var : null);
            if (bkq0Var != null) {
                Integer numN = this.M1.n(this, Q1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                iw20 iw20Var = bkq0Var.f2762a;
                ii iiVar = bkq0Var.c;
                ctf0 ctf0Var = bkq0Var.d;
                mne mneVar = bkq0Var.b;
                ocl oclVar = bkq0Var.e;
                m1e m1eVar = bkq0Var.f;
                duj dujVar = bkq0Var.g;
                btt0 btt0Var = bkq0Var.h;
                kwz kwzVar = bkq0Var.i;
                njo njoVar = bkq0Var.j;
                gii0 gii0Var = bkq0Var.k;
                wgu wguVar = bkq0Var.l;
                ctf0Var.getClass();
                iiVar.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                kwzVar.getClass();
                njoVar.getClass();
                gii0Var.getClass();
                wguVar.getClass();
                this.K1 = (hxi) ((n5d0) new f6i(new htz(), iw20Var, mneVar, i1w0VarF, numN, ctf0Var, iiVar, oclVar, m1eVar, dujVar, btt0Var, kwzVar, njoVar, gii0Var, wguVar).t).get();
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(bkq0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) G0()).C();
        ssl0 ssl0Var = new ssl0(this, (yje) null, (byte) 24);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new lto0((i89) gmqVarC, clzVarW, ssl0Var, (yje) null), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }
}
