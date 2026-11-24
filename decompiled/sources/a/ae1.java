package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ae1;", "La/iw5;", "<init>", "()V", "a/gfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ae1 extends iw5 {
    public fiu0 l2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(ae1.class, "messagesBundle", "getMessagesBundle()Ljava/util/List;", 0)};
    public static final gfk0 n2 = new gfk0((byte) 17);
    public final es k2 = new es("MESSAGES_KEY");
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(ce1.class), new xd1(this, (byte) 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        ae1 ae1Var;
        fetVar.e0(892991694);
        a8z a8zVar = this.m2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            ae1Var = this;
            Object c21Var = new c21(1, ae1Var, ae1.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/messages/presentation/promoCodeBottom/models/PromoCodeMessageSideEffect;)V", 0, (byte) 23);
            fetVar.o0(c21Var);
            objP = c21Var;
        } else {
            ae1Var = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(ae1Var) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new ee0(k3t0Var, ae1Var, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, ae1Var, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-669803201, new v7i0(pz40VarY, (byte) 4), fetVar), u1c.M(-1771450249, new ri1(pz40VarY, ae1Var, (byte) 25), fetVar), u1c.M(1132332669, new v7i0(pz40VarY, (byte) 5), fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(be1.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            be1 be1Var = (be1) (ze3Var instanceof be1 ? ze3Var : null);
            if (be1Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                List listN = this.k2.n(this, o2[0]);
                i1w0VarF.getClass();
                ctf0 ctf0Var = be1Var.e;
                cad cadVar = be1Var.f2427a;
                d1p d1pVar = be1Var.c;
                peg0 peg0Var = be1Var.d;
                b4j b4jVar = be1Var.b;
                d1pVar.getClass();
                ctf0Var.getClass();
                this.l2 = new fiu0(Collections.singletonMap(ce1.class, (t5i) new rrd(d1pVar, cadVar, listN, ctf0Var, i1w0VarF, peg0Var, b4jVar).i));
                return;
            }
        }
        jf4.n(b1j.i(be1.class, "Cannot create dependency "));
    }
}
