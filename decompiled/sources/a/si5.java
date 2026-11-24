package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/si5;", "La/yx5;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class si5 extends yx5 {
    public fiu0 K1;
    public ii L1;
    public wdk0 M1;
    public final s0r N1;
    public final phf0 O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(si5.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(si5.class, "navigatePath", "getNavigatePath()Ljava/lang/String;", 0)};
    public static final hfk0 Q1 = new hfk0((byte) 29);

    public si5() {
        super(R.layout.compose_fragment);
        this.N1 = ltt0.o(this, ri5.f30522a);
        this.O1 = new phf0("NAVIGATE_PATH_KEY", "");
        this.P1 = xbc.b0(this, sre0.f32672a.b(l2k0.class), new qi5(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "PAYMENT_ERROR_DIALOG_REQUEST_KEY", new qi5(this, (byte) 0));
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(1442853449, true, new fa2((Object) this, (byte) 18)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fi5.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fi5 fi5Var = (fi5) (ze3Var instanceof fi5 ? ze3Var : null);
            if (fi5Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strN = this.O1.n(this, R1[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = fi5Var.f9572a;
                zg zgVar = fi5Var.b;
                rmd0 rmd0Var = fi5Var.v;
                qgd qgdVar = fi5Var.c;
                ih5 ih5Var = fi5Var.d;
                ih5 ih5Var2 = fi5Var.e;
                v88 v88Var = fi5Var.f;
                duj dujVar = fi5Var.h;
                roi0 roi0Var = fi5Var.q;
                rou rouVar = fi5Var.i;
                pru pruVar = fi5Var.j;
                btt0 btt0Var = fi5Var.k;
                wsf0 wsf0Var = fi5Var.p;
                db9 db9Var = fi5Var.n;
                ii iiVar = fi5Var.g;
                gii0 gii0Var = fi5Var.l;
                kuy kuyVar = fi5Var.m;
                m1e m1eVar = fi5Var.o;
                lbu lbuVar = fi5Var.r;
                zx10 zx10Var = fi5Var.t;
                l7k l7kVar = fi5Var.u;
                ctf0 ctf0Var = fi5Var.s;
                wdk0 wdk0Var = fi5Var.w;
                bzt bztVar = fi5Var.x;
                ocl oclVar = fi5Var.y;
                cmt cmtVar = fi5Var.z;
                hse0 hse0Var = fi5Var.A;
                rmd0Var.getClass();
                iiVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                kuyVar.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                hse0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(l2k0.class, (r5i) new o9i(cadVar, wsf0Var, zx10Var, rmd0Var, roi0Var, i1w0VarF, iiVar, zgVar, qgdVar, ih5Var, ih5Var2, v88Var, dujVar, rouVar, pruVar, btt0Var, db9Var, gii0Var, kuyVar, m1eVar, lbuVar, l7kVar, ctf0Var, wdk0Var, bztVar, strN, oclVar, cmtVar, hse0Var).D));
                this.L1 = iiVar;
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(fi5.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }
}
