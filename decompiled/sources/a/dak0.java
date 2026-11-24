package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dak0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zsf f5752a = new zsf(1.0f, 0.0f, 0.0f, 1.5f);
    public static final n0o0 b = maz.b(new hwi0((byte) 24));

    public static final void a(String str, fet fetVar, int i) {
        String str2;
        fet fetVar2;
        fetVar.g0(-235766110);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "CLOSED_COOKIE");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            str2 = str;
            fetVar2 = fetVar;
            k7x.a(str2, null, o7k0.s(o7k0.e(jm40.b, 38.0f), 56.0f), null, null, fetVar2, (i2 & 14) | 48, 2040);
            fetVar2.r(true);
        } else {
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 26, i, str2);
        }
    }

    public static final void b(String str, String str2, nrq nrqVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(614396711);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16) | (fetVar2.g(nrqVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "OPENED_COOKIE");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            k7x.a(str, null, o7k0.s(o7k0.e(jm40Var, 38.0f), 56.0f), null, null, fetVar2, (i2 & 14) | 48, 2040);
            v8q0.a(str2, o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), 1.0f), ijg.x1, null, qmk.r, null, null, nrqVar, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, null, fetVar, ((i2 >> 3) & 14) | ((i2 << 15) & 29360128), 24960, 240488);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(str, str2, nrqVar, i, (byte) 0);
        }
    }

    public static final void c(e960 e960Var, g960 g960Var, nrq nrqVar, fet fetVar, int i) {
        fet fetVar2;
        pz40 pz40Var;
        pz40 pz40Var2;
        Object obj = e960Var;
        obj.getClass();
        nrqVar.getClass();
        fetVar.g0(1632498340);
        int i2 = i | (fetVar.i(obj) ? 4 : 2) | (fetVar.g(g960Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(obj instanceof d960 ? wke.c : wke.f39304a);
                fetVar.o0(objP);
            }
            pz40 pz40Var3 = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(obj);
                fetVar.o0(objP2);
            }
            pz40 pz40Var4 = (pz40) objP2;
            wke wkeVar = (wke) pz40Var3.getValue();
            wke wkeVar2 = wke.b;
            float f = wkeVar == wkeVar2 ? 30.0f : 15.0f;
            n0o0 n0o0Var = b;
            l7m0 l7m0VarB = d43.b(f, (j73) n0o0Var.getValue(), null, null, fetVar, 0, 28);
            l7m0 l7m0VarB2 = d43.b(((wke) pz40Var3.getValue()) == wkeVar2 ? 1.0f : 0.0f, (j73) n0o0Var.getValue(), null, null, fetVar, 0, 28);
            fetVar2 = fetVar;
            boolean z = (i2 & 14) == 4 || fetVar2.i(obj);
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                objP3 = new myj0(obj, pz40Var4, pz40Var3, (yje) null, (byte) 5);
                pz40Var = pz40Var4;
                pz40Var2 = pz40Var3;
                fetVar2.o0(objP3);
            } else {
                pz40Var2 = pz40Var3;
                pz40Var = pz40Var4;
            }
            m0x0.t(fetVar2, obj, (Function2) objP3);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1468872860, new acb0(pz40Var2, g960Var, nrqVar, l7m0VarB, l7m0VarB2, pz40Var), fetVar2), fetVar2, 56);
        } else {
            obj = obj;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(obj, g960Var, nrqVar, i, (byte) 1);
        }
    }

    public static final void d(g960 g960Var, final float f, float f2, fet fetVar, int i) {
        final byte b2;
        Object obj;
        boolean z;
        Object obj2;
        fetVar.g0(621490267);
        int i2 = i | (fetVar.g(g960Var) ? 4 : 2) | (fetVar.d(f) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            final w6k w6kVar = (w6k) fetVar.k(bmd.h);
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = g960Var.f;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 38.0f), 56.0f);
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            Object obj3 = ukd.f35823a;
            Object obj4 = objP;
            if (z2 || objP == obj3) {
                Object f54Var = new f54(f2, (byte) 27);
                fetVar.o0(f54Var);
                obj4 = f54Var;
            }
            k7x.a(str, null, i4w0.T(mm40VarS, (Function1) obj4), null, null, fetVar, 48, 2040);
            String str2 = g960Var.d;
            mm40 mm40VarS2 = o7k0.s(o7k0.e(jm40Var, 38.0f), 56.0f);
            int i3 = i2 & 112;
            boolean zG = fetVar.g(w6kVar) | (i3 == 32);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj3) {
                b2 = 0;
                Object obj5 = new Function1() { // from class: a.bak0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        byte b3 = b2;
                        float f3 = f;
                        w6k w6kVar2 = w6kVar;
                        uag0 uag0Var = (uag0) obj6;
                        uag0Var.getClass();
                        switch (b3) {
                            case 0:
                                uag0Var.H(-w6kVar2.w0(f3));
                                break;
                            default:
                                uag0Var.H(w6kVar2.w0(f3));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(obj5);
                obj = obj5;
            } else {
                b2 = 0;
                obj = objP2;
            }
            byte b3 = b2;
            k7x.a(str2, null, i4w0.T(mm40VarS2, (Function1) obj), null, null, fetVar, 48, 2040);
            String str3 = g960Var.e;
            mm40 mm40VarS3 = o7k0.s(o7k0.e(jm40Var, 38.0f), 56.0f);
            int i4 = (fetVar.g(w6kVar) ? 1 : 0) | (i3 == 32 ? (byte) 1 : b3);
            Object objP3 = fetVar.P();
            if (i4 != 0 || objP3 == obj3) {
                z = true;
                final boolean z3 = true ? 1 : 0;
                Object obj6 = new Function1() { // from class: a.bak0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        byte b4 = z3;
                        float f3 = f;
                        w6k w6kVar2 = w6kVar;
                        uag0 uag0Var = (uag0) obj7;
                        uag0Var.getClass();
                        switch (b4) {
                            case 0:
                                uag0Var.H(-w6kVar2.w0(f3));
                                break;
                            default:
                                uag0Var.H(w6kVar2.w0(f3));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(obj6);
                obj2 = obj6;
            } else {
                z = true;
                obj2 = objP3;
            }
            k7x.a(str3, null, i4w0.T(mm40VarS3, (Function1) obj2), null, null, fetVar, 48, 2040);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cak0(g960Var, f, f2, i, (byte) 0);
        }
    }
}
