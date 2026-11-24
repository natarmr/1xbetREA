package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lc70;", "La/iw5;", "<init>", "()V", "a/uuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lc70 extends iw5 {
    public vmi l2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(lc70.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final uuz n2 = new uuz();
    public final phf0 k2 = new phf0("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_BUNDLE_REQUEST_KEY");
    public final a8z m2 = xbc.a0(this, sre0.f32672a.b(vc70.class), null, new pu50(this, 23), 14);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(-1413005940);
        a8z a8zVar = this.m2;
        final uc70 uc70Var = (uc70) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object cy60Var = new cy60(1, this, lc70.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/web/impl/presentation/game/dialogs/unauthorized_demo/models/OneXGamesWebGameUnauthorizedDemoSideEffect;)V", 0, (byte) 14);
            fetVar.o0(cy60Var);
            objP = cy60Var;
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            clzVar = clzVar2;
            Object kc70Var = new kc70(k3t0Var, clzVar, pz40VarF, null, (byte) 0);
            fetVar.o0(kc70Var);
            objP2 = kc70Var;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-107079493, new xdr() { // from class: a.jc70
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b2;
                uc70 uc70Var2 = uc70Var;
                y5d y5dVar = (y5d) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                switch (b3) {
                    case 0:
                        uuz uuzVar = lc70.n2;
                        y5dVar.getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            b5x.j(uc70Var2.f35416a, fetVar2, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        uuz uuzVar2 = lc70.n2;
                        y5dVar.getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            b5x.i(uc70Var2.b, fetVar2, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), u1c.M(1320607875, new ngz(uc70Var, this, (byte) 26), fetVar), u1c.M(-1780669379, new xdr() { // from class: a.jc70
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b;
                uc70 uc70Var2 = uc70Var;
                y5d y5dVar = (y5d) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                switch (b3) {
                    case 0:
                        uuz uuzVar = lc70.n2;
                        y5dVar.getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            b5x.j(uc70Var2.f35416a, fetVar2, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        uuz uuzVar2 = lc70.n2;
                        y5dVar.getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            b5x.i(uc70Var2.b, fetVar2, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    public final String P0() {
        return this.k2.n(this, o2[0]);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(e970.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            e970 e970Var = (e970) (ze3Var instanceof e970 ? ze3Var : null);
            if (e970Var != null) {
                ctf0 ctf0Var = e970Var.f7407a;
                cad cadVar = e970Var.b;
                ctf0Var.getClass();
                this.l2 = (vmi) ((n5d0) new ali(cadVar, ctf0Var).d).get();
                return;
            }
        }
        jf4.n(b1j.i(e970.class, "Cannot create dependency "));
    }
}
