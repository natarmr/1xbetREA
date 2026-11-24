package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/el90;", "La/iw5;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class el90 extends iw5 {
    public ctf0 k2;
    public final phf0 l2 = new phf0("EXTRA_REQUEST_KEY");
    public static final /* synthetic */ iiy[] n2 = {new ez40(el90.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final nh70 m2 = new nh70();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1307385119);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-925084400, new xdr(this) { // from class: a.cl90
            public final /* synthetic */ el90 b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b2;
                final el90 el90Var = this.b;
                char c = 1;
                final byte b4 = 0;
                y5d y5dVar = (y5d) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (b3) {
                    case 0:
                        nh70 nh70Var = el90.m2;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ctf0 ctf0Var = el90Var.k2;
                            if (ctf0Var == null) {
                                Intrinsics.h("resourceManager");
                                throw null;
                            }
                            p7x.o(y5dVar, ctf0Var, fetVar2, iIntValue & 14);
                        } else {
                            fetVar2.X();
                        }
                        return Unit.f46060a;
                    default:
                        nh70 nh70Var2 = el90.m2;
                        y5dVar.getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            mm40 mm40VarA0 = wha0.a0(cjx.V(jm40.b, x0x.a0(fetVar2), null), wha0.T(fetVar2), false, 14);
                            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                            int iHashCode = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM = fetVar2.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA0);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(e7z.u1);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, x5dVarA, gqw0.x);
                            jpm0.o(fetVar2, bh90VarM, gqw0.w);
                            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                            jpm0.n(fetVar2);
                            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                            ctf0 ctf0Var2 = el90Var.k2;
                            if (ctf0Var2 == null) {
                                Intrinsics.h("resourceManager");
                                throw null;
                            }
                            boolean zI = fetVar2.i(el90Var);
                            Object objP = fetVar2.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new Function0() { // from class: a.dl90
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b5 = b4;
                                        el90 el90Var2 = el90Var;
                                        switch (b5) {
                                            case 0:
                                                nh70 nh70Var3 = el90.m2;
                                                phf0 phf0Var = el90Var2.l2;
                                                iiy[] iiyVarArr = el90.n2;
                                                vcc.f0(i120.V(new Pair(phf0Var.n(el90Var2, iiyVarArr[0]), Boolean.TRUE)), el90Var2, phf0Var.n(el90Var2, iiyVarArr[0]));
                                                el90Var2.x0();
                                                break;
                                            default:
                                                nh70 nh70Var4 = el90.m2;
                                                phf0 phf0Var2 = el90Var2.l2;
                                                iiy[] iiyVarArr2 = el90.n2;
                                                vcc.f0(i120.V(new Pair(phf0Var2.n(el90Var2, iiyVarArr2[0]), Boolean.FALSE)), el90Var2, phf0Var2.n(el90Var2, iiyVarArr2[0]));
                                                el90Var2.x0();
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar2.o0(objP);
                            }
                            Function0 function0 = (Function0) objP;
                            boolean zI2 = fetVar2.i(el90Var);
                            Object objP2 = fetVar2.P();
                            if (zI2 || objP2 == cl5Var) {
                                final char c2 = c == true ? 1 : 0;
                                objP2 = new Function0() { // from class: a.dl90
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b5 = c2;
                                        el90 el90Var2 = el90Var;
                                        switch (b5) {
                                            case 0:
                                                nh70 nh70Var3 = el90.m2;
                                                phf0 phf0Var = el90Var2.l2;
                                                iiy[] iiyVarArr = el90.n2;
                                                vcc.f0(i120.V(new Pair(phf0Var.n(el90Var2, iiyVarArr[0]), Boolean.TRUE)), el90Var2, phf0Var.n(el90Var2, iiyVarArr[0]));
                                                el90Var2.x0();
                                                break;
                                            default:
                                                nh70 nh70Var4 = el90.m2;
                                                phf0 phf0Var2 = el90Var2.l2;
                                                iiy[] iiyVarArr2 = el90.n2;
                                                vcc.f0(i120.V(new Pair(phf0Var2.n(el90Var2, iiyVarArr2[0]), Boolean.FALSE)), el90Var2, phf0Var2.n(el90Var2, iiyVarArr2[0]));
                                                el90Var2.x0();
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar2.o0(objP2);
                            }
                            p7x.g(ctf0Var2, function0, (Function0) objP2, fetVar2, 6);
                            fetVar2.r(true);
                        } else {
                            fetVar2.X();
                        }
                        return Unit.f46060a;
                }
            }
        }, fetVar), (ugd) null, u1c.M(-276491630, new xdr(this) { // from class: a.cl90
            public final /* synthetic */ el90 b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b;
                final el90 el90Var = this.b;
                char c = 1;
                final byte b4 = 0;
                y5d y5dVar = (y5d) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (b3) {
                    case 0:
                        nh70 nh70Var = el90.m2;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ctf0 ctf0Var = el90Var.k2;
                            if (ctf0Var == null) {
                                Intrinsics.h("resourceManager");
                                throw null;
                            }
                            p7x.o(y5dVar, ctf0Var, fetVar2, iIntValue & 14);
                        } else {
                            fetVar2.X();
                        }
                        return Unit.f46060a;
                    default:
                        nh70 nh70Var2 = el90.m2;
                        y5dVar.getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            mm40 mm40VarA0 = wha0.a0(cjx.V(jm40.b, x0x.a0(fetVar2), null), wha0.T(fetVar2), false, 14);
                            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                            int iHashCode = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM = fetVar2.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA0);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(e7z.u1);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, x5dVarA, gqw0.x);
                            jpm0.o(fetVar2, bh90VarM, gqw0.w);
                            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                            jpm0.n(fetVar2);
                            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                            ctf0 ctf0Var2 = el90Var.k2;
                            if (ctf0Var2 == null) {
                                Intrinsics.h("resourceManager");
                                throw null;
                            }
                            boolean zI = fetVar2.i(el90Var);
                            Object objP = fetVar2.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new Function0() { // from class: a.dl90
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b5 = b4;
                                        el90 el90Var2 = el90Var;
                                        switch (b5) {
                                            case 0:
                                                nh70 nh70Var3 = el90.m2;
                                                phf0 phf0Var = el90Var2.l2;
                                                iiy[] iiyVarArr = el90.n2;
                                                vcc.f0(i120.V(new Pair(phf0Var.n(el90Var2, iiyVarArr[0]), Boolean.TRUE)), el90Var2, phf0Var.n(el90Var2, iiyVarArr[0]));
                                                el90Var2.x0();
                                                break;
                                            default:
                                                nh70 nh70Var4 = el90.m2;
                                                phf0 phf0Var2 = el90Var2.l2;
                                                iiy[] iiyVarArr2 = el90.n2;
                                                vcc.f0(i120.V(new Pair(phf0Var2.n(el90Var2, iiyVarArr2[0]), Boolean.FALSE)), el90Var2, phf0Var2.n(el90Var2, iiyVarArr2[0]));
                                                el90Var2.x0();
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar2.o0(objP);
                            }
                            Function0 function0 = (Function0) objP;
                            boolean zI2 = fetVar2.i(el90Var);
                            Object objP2 = fetVar2.P();
                            if (zI2 || objP2 == cl5Var) {
                                final byte c2 = c == true ? 1 : 0;
                                objP2 = new Function0() { // from class: a.dl90
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        byte b5 = c2;
                                        el90 el90Var2 = el90Var;
                                        switch (b5) {
                                            case 0:
                                                nh70 nh70Var3 = el90.m2;
                                                phf0 phf0Var = el90Var2.l2;
                                                iiy[] iiyVarArr = el90.n2;
                                                vcc.f0(i120.V(new Pair(phf0Var.n(el90Var2, iiyVarArr[0]), Boolean.TRUE)), el90Var2, phf0Var.n(el90Var2, iiyVarArr[0]));
                                                el90Var2.x0();
                                                break;
                                            default:
                                                nh70 nh70Var4 = el90.m2;
                                                phf0 phf0Var2 = el90Var2.l2;
                                                iiy[] iiyVarArr2 = el90.n2;
                                                vcc.f0(i120.V(new Pair(phf0Var2.n(el90Var2, iiyVarArr2[0]), Boolean.FALSE)), el90Var2, phf0Var2.n(el90Var2, iiyVarArr2[0]));
                                                el90Var2.x0();
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar2.o0(objP2);
                            }
                            p7x.g(ctf0Var2, function0, (Function0) objP2, fetVar2, 6);
                            fetVar2.r(true);
                        } else {
                            fetVar2.X();
                        }
                        return Unit.f46060a;
                }
            }
        }, fetVar), 10);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fl90.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fl90 fl90Var = (fl90) (ze3Var instanceof fl90 ? ze3Var : null);
            if (fl90Var != null) {
                ctf0 ctf0Var = fl90Var.f9727a;
                ctf0Var.getClass();
                this.k2 = ctf0Var;
                return;
            }
        }
        jf4.n(b1j.i(fl90.class, "Cannot create dependency "));
    }
}
