package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/qfc;", "La/iw5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qfc extends iw5 {
    public static final /* synthetic */ int m2 = 0;
    public final a8z k2;
    public final a8z l2;

    public qfc() {
        final byte b = 0;
        this.k2 = maz.a(wez.b, new Function0(this) { // from class: a.pfc
            public final /* synthetic */ qfc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                qfc qfcVar = this.b;
                switch (b2) {
                    case 0:
                        int i = qfc.m2;
                        ComponentCallbacks2 application = qfcVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(rfc.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof rfc)) {
                                ze3Var = null;
                            }
                            rfc rfcVar = (rfc) ze3Var;
                            if (rfcVar != null) {
                                gr70 gr70Var = rfcVar.f30380a;
                                mne mneVar = rfcVar.b;
                                m1e m1eVar = rfcVar.c;
                                gr70Var.getClass();
                                m1eVar.getClass();
                                return new pci(gr70Var, mneVar, m1eVar);
                            }
                        }
                        jf4.n(b1j.i(rfc.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new fiu0(Collections.singletonMap(xgc.class, ((pci) qfcVar.k2.getValue()).d));
                }
            }
        });
        final byte b2 = 1;
        this.l2 = xbc.b0(this, sre0.f32672a.b(xgc.class), new Function0(this) { // from class: a.pfc
            public final /* synthetic */ qfc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                qfc qfcVar = this.b;
                switch (b3) {
                    case 0:
                        int i = qfc.m2;
                        ComponentCallbacks2 application = qfcVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(rfc.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof rfc)) {
                                ze3Var = null;
                            }
                            rfc rfcVar = (rfc) ze3Var;
                            if (rfcVar != null) {
                                gr70 gr70Var = rfcVar.f30380a;
                                mne mneVar = rfcVar.b;
                                m1e m1eVar = rfcVar.c;
                                gr70Var.getClass();
                                m1eVar.getClass();
                                return new pci(gr70Var, mneVar, m1eVar);
                            }
                        }
                        jf4.n(b1j.i(rfc.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new fiu0(Collections.singletonMap(xgc.class, ((pci) qfcVar.k2.getValue()).d));
                }
            }
        });
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(1911330072);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object zhbVar = new zhb(1, this, qfc.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feature/online_call/impl/presentation/ui/choose_language_dialog/ChooseLanguageViewModel$SideEffect;)V", 0, (byte) 20);
            fetVar.o0(zhbVar);
            objP = zhbVar;
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            clzVar = clzVar2;
            Object pcVar = new pc(k3t0VarP0, clzVar, pz40VarF, null, (byte) 9);
            fetVar.o0(pcVar);
            objP2 = pcVar;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        final pz40 pz40VarY = ((i3t0) P0()).y(fetVar);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-1223253559, new xdr() { // from class: a.ofc
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b2;
                cl5 cl5Var = ukd.f35823a;
                qfc qfcVar = this;
                l7m0 l7m0Var = pz40VarY;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        int i = qfc.m2;
                        ((y5d) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            k3t0 k3t0VarP1 = qfcVar.P0();
                            boolean zI3 = fetVar2.i(k3t0VarP1);
                            Object objP3 = fetVar2.P();
                            if (zI3 || objP3 == cl5Var) {
                                zhb zhbVar2 = new zhb(1, k3t0VarP1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                                fetVar2.o0(zhbVar2);
                                objP3 = zhbVar2;
                            }
                            vfc.d(l7m0Var, (Function1) ((jhy) objP3), fetVar2, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        int i2 = qfc.m2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            k3t0 k3t0VarP2 = qfcVar.P0();
                            boolean zI4 = fetVar3.i(k3t0VarP2);
                            Object objP4 = fetVar3.P();
                            if (zI4 || objP4 == cl5Var) {
                                zhb zhbVar3 = new zhb(1, k3t0VarP2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                                fetVar3.o0(zhbVar3);
                                objP4 = zhbVar3;
                            }
                            lv00.q(l7m0Var, (Function1) ((jhy) objP4), fetVar3, 0);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), (ugd) null, u1c.M(400966279, new xdr() { // from class: a.ofc
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b;
                cl5 cl5Var = ukd.f35823a;
                qfc qfcVar = this;
                l7m0 l7m0Var = pz40VarY;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        int i = qfc.m2;
                        ((y5d) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            k3t0 k3t0VarP1 = qfcVar.P0();
                            boolean zI3 = fetVar2.i(k3t0VarP1);
                            Object objP3 = fetVar2.P();
                            if (zI3 || objP3 == cl5Var) {
                                zhb zhbVar2 = new zhb(1, k3t0VarP1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                                fetVar2.o0(zhbVar2);
                                objP3 = zhbVar2;
                            }
                            vfc.d(l7m0Var, (Function1) ((jhy) objP3), fetVar2, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        int i2 = qfc.m2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            k3t0 k3t0VarP2 = qfcVar.P0();
                            boolean zI4 = fetVar3.i(k3t0VarP2);
                            Object objP4 = fetVar3.P();
                            if (zI4 || objP4 == cl5Var) {
                                zhb zhbVar3 = new zhb(1, k3t0VarP2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                                fetVar3.o0(zhbVar3);
                                objP4 = zhbVar3;
                            }
                            lv00.q(l7m0Var, (Function1) ((jhy) objP4), fetVar3, 0);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.l2.getValue();
    }

    @Override // a.iw5, a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        P0().x(ngc.f23477a);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void h0() {
        P0().x(ogc.f25211a);
        super.h0();
    }
}
