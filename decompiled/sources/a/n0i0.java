package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/n0i0;", "La/yx5;", "<init>", "()V", "a/gne0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n0i0 extends yx5 {
    public final boolean K1;
    public fiu0 L1;
    public gl5 M1;
    public ii N1;
    public wdk0 O1;
    public final a8z P1;
    public final s0r Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(n0i0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gne0 R1 = new gne0((byte) 16);

    public n0i0() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.P1 = xbc.b0(this, sre0.f32672a.b(g1i0.class), new a7g0(this, (byte) 23));
        this.Q1 = ltt0.o(this, m0i0.f20956a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Class<k3t0> cls = k3t0.class;
        nxh0 nxh0Var = new nxh0(1, G0(), cls, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
        if (this.M1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new a7g0(nxh0Var, (byte) 25), new gwg0(nxh0Var, (byte) 22));
        ccq0.T(this, "REQUEST_APPROVE_DIALOG", new a7g0(new nxh0(1, G0(), cls, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5), (byte) 24));
        Object objN = this.Q1.n(S1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(765343616, true, new uph0(this, (byte) 3)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bza.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bza bzaVar = (bza) (ze3Var instanceof bza ? ze3Var : null);
            if (bzaVar != null) {
                cad cadVar = bzaVar.f3456a;
                duj dujVar = bzaVar.b;
                ctf0 ctf0Var = bzaVar.c;
                ort ortVar = bzaVar.d;
                cyh cyhVar = bzaVar.e;
                ii iiVar = bzaVar.j;
                z4w0 z4w0Var = bzaVar.f;
                rou rouVar = bzaVar.g;
                pru pruVar = bzaVar.h;
                b4j b4jVar = bzaVar.i;
                oeg0 oeg0Var = bzaVar.k;
                b3c0 b3c0Var = bzaVar.l;
                m1e m1eVar = bzaVar.m;
                x20 x20Var = bzaVar.n;
                onv onvVar = bzaVar.o;
                gle0 gle0Var = bzaVar.p;
                bzt bztVar = bzaVar.q;
                wdk0 wdk0Var = bzaVar.r;
                iiVar.getClass();
                ctf0Var.getClass();
                oeg0Var.getClass();
                b3c0Var.getClass();
                m1eVar.getClass();
                wdk0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(g1i0.class, (pai) new cr(cadVar, onvVar, gle0Var, iiVar, dujVar, ctf0Var, ortVar, cyhVar, z4w0Var, rouVar, pruVar, b4jVar, oeg0Var, b3c0Var, m1eVar, x20Var, bztVar, wdk0Var).r));
                this.M1 = new gl5((byte) 17);
                this.N1 = iiVar;
                this.O1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(bza.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        G0().x(f0i0.f8719a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        G0().x(g0i0.f10461a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
