package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/m5q;", "La/iw5;", "<init>", "()V", "a/nek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m5q extends iw5 {
    public fiu0 m2;
    public static final /* synthetic */ iiy[] p2 = {new ez40(m5q.class, "keysFilterType", "getKeysFilterType()Lorg/xplatform/feature/office/test_section/impl/presentation/remote_config_test/models/KeysFilterType;", 0), new ez40(m5q.class, "keysSortType", "getKeysSortType()Lorg/xplatform/feature/office/test_section/impl/presentation/remote_config_test/models/KeysSortType;", 0)};
    public static final nek o2 = new nek();
    public final yzn0 k2 = new yzn0("KEYS_FILTER_TYPE");
    public final yzn0 l2 = new yzn0("KEYS_SORT_TYPE");
    public final a8z n2 = xbc.b0(this, sre0.f32672a.b(q5q.class), new i5q(this, (byte) 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(1207241609);
        a8z a8zVar = this.n2;
        final p5q p5qVar = (p5q) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        final byte b = 0;
        if (zI || objP == obj) {
            objP = new j5q(this, (byte) 0);
            fetVar.o0(objP);
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            clzVar = clzVar2;
            Object pcVar = new pc(k3t0Var, clzVar, pz40VarF, null, (byte) 17);
            fetVar.o0(pcVar);
            objP2 = pcVar;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        nmy nmyVar = p5qVar.f26417a;
        iiy[] iiyVarArr = p2;
        this.k2.u(this, iiyVarArr[0], nmyVar);
        final byte b2 = 1;
        this.l2.u(this, iiyVarArr[1], p5qVar.b);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, u1c.M(344496698, new elm(p5qVar, (byte) 7), fetVar), u1c.M(-1814320270, new xdr() { // from class: a.k5q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b;
                cl5 cl5Var = ukd.f35823a;
                m5q m5qVar = this;
                final p5q p5qVar2 = p5qVar;
                Object[] objArr = 0;
                final byte b4 = 1;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        nek nekVar = m5q.o2;
                        ((ir8) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                            wul wulVar = p5qVar2.f;
                            boolean zI3 = fetVar2.i(m5qVar);
                            Object objP3 = fetVar2.P();
                            if (zI3 || objP3 == cl5Var) {
                                objP3 = new i5q(m5qVar, (byte) 2);
                                fetVar2.o0(objP3);
                            }
                            qzb.n(mm40VarN, wulVar, (Function0) objP3, fetVar2, 0, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        nek nekVar2 = m5q.o2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            jm40 jm40Var = jm40.b;
                            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarN2 = s5x0.N(mm40VarD2, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                            hjm hjmVar = p5qVar2.h;
                            kjm kjmVar = kjm.b;
                            nkb.h(mm40VarN2, hjmVar, kjmVar, null, null, null, fetVar3, 384, 56);
                            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
                            a4x a4xVar = p5qVar2.c;
                            boolean zG = fetVar3.g(p5qVar2);
                            Object objP4 = fetVar3.P();
                            if (zG || objP4 == cl5Var) {
                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                objP4 = new Function0() { // from class: a.l5q
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b5;
                                        byte b6 = objArr2;
                                        p5q p5qVar3 = p5qVar2;
                                        switch (b6) {
                                            case 0:
                                                nek nekVar3 = m5q.o2;
                                                b5 = p5qVar3.f26417a.f23794a;
                                                break;
                                            default:
                                                nek nekVar4 = m5q.o2;
                                                b5 = p5qVar3.b.f4675a;
                                                break;
                                        }
                                        return Integer.valueOf(b5);
                                    }
                                };
                                fetVar3.o0(objP4);
                            }
                            Function0 function0 = (Function0) objP4;
                            boolean zI4 = fetVar3.i(m5qVar);
                            Object objP5 = fetVar3.P();
                            if (zI4 || objP5 == cl5Var) {
                                objP5 = new j5q(m5qVar, (byte) 1);
                                fetVar3.o0(objP5);
                            }
                            gxh0 gxh0Var = gxh0.f12078a;
                            ibc.o(mm40VarL, a4xVar, gxh0Var, false, function0, (Function1) objP5, fetVar3, 3456, 0);
                            nkb.h(s5x0.N(o7k0.d(jm40Var, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8), p5qVar2.i, kjmVar, null, null, null, fetVar3, 384, 56);
                            mm40 mm40VarN3 = s5x0.N(jm40Var, 16.0f, 0.0f, 16.0f, 0.0f, 10);
                            a4x a4xVar2 = p5qVar2.d;
                            boolean zG2 = fetVar3.g(p5qVar2);
                            Object objP6 = fetVar3.P();
                            if (zG2 || objP6 == cl5Var) {
                                objP6 = new Function0() { // from class: a.l5q
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b5;
                                        byte b6 = b4;
                                        p5q p5qVar3 = p5qVar2;
                                        switch (b6) {
                                            case 0:
                                                nek nekVar3 = m5q.o2;
                                                b5 = p5qVar3.f26417a.f23794a;
                                                break;
                                            default:
                                                nek nekVar4 = m5q.o2;
                                                b5 = p5qVar3.b.f4675a;
                                                break;
                                        }
                                        return Integer.valueOf(b5);
                                    }
                                };
                                fetVar3.o0(objP6);
                            }
                            Function0 function1 = (Function0) objP6;
                            boolean zI5 = fetVar3.i(m5qVar);
                            Object objP7 = fetVar3.P();
                            if (zI5 || objP7 == cl5Var) {
                                objP7 = new j5q(m5qVar, (byte) 2);
                                fetVar3.o0(objP7);
                            }
                            ibc.o(mm40VarN3, a4xVar2, gxh0Var, false, function1, (Function1) objP7, fetVar3, 3456, 0);
                            mm40 mm40VarM = s5x0.M(o7k0.d(jm40Var, 1.0f), 16.0f, 16.0f, 16.0f, 40.0f);
                            wul wulVar2 = p5qVar2.g;
                            boolean zI6 = fetVar3.i(m5qVar);
                            Object objP8 = fetVar3.P();
                            if (zI6 || objP8 == cl5Var) {
                                objP8 = new i5q(m5qVar, (byte) 1);
                                fetVar3.o0(objP8);
                            }
                            qzb.n(mm40VarM, wulVar2, (Function0) objP8, fetVar3, 0, 0);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), u1c.M(75331320, new xdr() { // from class: a.k5q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b2;
                cl5 cl5Var = ukd.f35823a;
                m5q m5qVar = this;
                final p5q p5qVar2 = p5qVar;
                Object[] objArr = 0;
                final byte b4 = 1;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        nek nekVar = m5q.o2;
                        ((ir8) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                            wul wulVar = p5qVar2.f;
                            boolean zI3 = fetVar2.i(m5qVar);
                            Object objP3 = fetVar2.P();
                            if (zI3 || objP3 == cl5Var) {
                                objP3 = new i5q(m5qVar, (byte) 2);
                                fetVar2.o0(objP3);
                            }
                            qzb.n(mm40VarN, wulVar, (Function0) objP3, fetVar2, 0, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        nek nekVar2 = m5q.o2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            jm40 jm40Var = jm40.b;
                            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarN2 = s5x0.N(mm40VarD2, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                            hjm hjmVar = p5qVar2.h;
                            kjm kjmVar = kjm.b;
                            nkb.h(mm40VarN2, hjmVar, kjmVar, null, null, null, fetVar3, 384, 56);
                            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
                            a4x a4xVar = p5qVar2.c;
                            boolean zG = fetVar3.g(p5qVar2);
                            Object objP4 = fetVar3.P();
                            if (zG || objP4 == cl5Var) {
                                final byte objArr2 = objArr == true ? 1 : 0;
                                objP4 = new Function0() { // from class: a.l5q
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b5;
                                        byte b6 = objArr2;
                                        p5q p5qVar3 = p5qVar2;
                                        switch (b6) {
                                            case 0:
                                                nek nekVar3 = m5q.o2;
                                                b5 = p5qVar3.f26417a.f23794a;
                                                break;
                                            default:
                                                nek nekVar4 = m5q.o2;
                                                b5 = p5qVar3.b.f4675a;
                                                break;
                                        }
                                        return Integer.valueOf(b5);
                                    }
                                };
                                fetVar3.o0(objP4);
                            }
                            Function0 function0 = (Function0) objP4;
                            boolean zI4 = fetVar3.i(m5qVar);
                            Object objP5 = fetVar3.P();
                            if (zI4 || objP5 == cl5Var) {
                                objP5 = new j5q(m5qVar, (byte) 1);
                                fetVar3.o0(objP5);
                            }
                            gxh0 gxh0Var = gxh0.f12078a;
                            ibc.o(mm40VarL, a4xVar, gxh0Var, false, function0, (Function1) objP5, fetVar3, 3456, 0);
                            nkb.h(s5x0.N(o7k0.d(jm40Var, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8), p5qVar2.i, kjmVar, null, null, null, fetVar3, 384, 56);
                            mm40 mm40VarN3 = s5x0.N(jm40Var, 16.0f, 0.0f, 16.0f, 0.0f, 10);
                            a4x a4xVar2 = p5qVar2.d;
                            boolean zG2 = fetVar3.g(p5qVar2);
                            Object objP6 = fetVar3.P();
                            if (zG2 || objP6 == cl5Var) {
                                objP6 = new Function0() { // from class: a.l5q
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b5;
                                        byte b6 = b4;
                                        p5q p5qVar3 = p5qVar2;
                                        switch (b6) {
                                            case 0:
                                                nek nekVar3 = m5q.o2;
                                                b5 = p5qVar3.f26417a.f23794a;
                                                break;
                                            default:
                                                nek nekVar4 = m5q.o2;
                                                b5 = p5qVar3.b.f4675a;
                                                break;
                                        }
                                        return Integer.valueOf(b5);
                                    }
                                };
                                fetVar3.o0(objP6);
                            }
                            Function0 function1 = (Function0) objP6;
                            boolean zI5 = fetVar3.i(m5qVar);
                            Object objP7 = fetVar3.P();
                            if (zI5 || objP7 == cl5Var) {
                                objP7 = new j5q(m5qVar, (byte) 2);
                                fetVar3.o0(objP7);
                            }
                            ibc.o(mm40VarN3, a4xVar2, gxh0Var, false, function1, (Function1) objP7, fetVar3, 3456, 0);
                            mm40 mm40VarM = s5x0.M(o7k0.d(jm40Var, 1.0f), 16.0f, 16.0f, 16.0f, 40.0f);
                            wul wulVar2 = p5qVar2.g;
                            boolean zI6 = fetVar3.i(m5qVar);
                            Object objP8 = fetVar3.P();
                            if (zI6 || objP8 == cl5Var) {
                                objP8 = new i5q(m5qVar, (byte) 1);
                                fetVar3.o0(objP8);
                            }
                            qzb.n(mm40VarM, wulVar2, (Function0) objP8, fetVar3, 0, 0);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar));
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0() {
        iiy[] iiyVarArr = p2;
        vcc.f0(i120.V(new Pair("KEYS_FILTER_TYPE", (nmy) this.k2.n(this, iiyVarArr[0])), new Pair("KEYS_SORT_TYPE", (cny) this.l2.n(this, iiyVarArr[1]))), this, "FILTERS_BS_DIALOG_REQUEST_KEY");
        qcc.Q(this);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(h5q.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            h5q h5qVar = (h5q) (ze3Var instanceof h5q ? ze3Var : null);
            if (h5qVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = p2;
                nmy nmyVar = (nmy) this.k2.n(this, iiyVarArr[0]);
                cny cnyVar = (cny) this.l2.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                cad cadVar = h5qVar.f12494a;
                ctf0 ctf0Var = h5qVar.b;
                iw20 iw20Var = h5qVar.c;
                ctf0Var.getClass();
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = cadVar;
                esg0Var.b = ctf0Var;
                esg0Var.c = nmyVar;
                esg0Var.d = cnyVar;
                esg0Var.e = iw20Var;
                esg0Var.f = new ugi(esg0Var, (byte) 7);
                this.m2 = new fiu0(Collections.singletonMap(q5q.class, (ugi) esg0Var.f));
                return;
            }
        }
        jf4.n(b1j.i(h5q.class, "Cannot create dependency "));
    }
}
