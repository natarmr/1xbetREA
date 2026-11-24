package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ibm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f14495a = true;
    public static Field b;
    public static boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    public static final t6p0 B(w6p0 w6p0Var) {
        List list;
        gip0 gip0Var;
        gip0 gip0Var2;
        ?? arrayList;
        ?? arrayList2;
        List list2;
        List list3;
        Object next;
        Object next2;
        Long l = w6p0Var.b;
        List list4 = w6p0Var.c;
        long jLongValue = l != null ? l.longValue() : 0L;
        List list5 = w6p0Var.f38635a;
        if (list5 != null) {
            ArrayList arrayList3 = new ArrayList(r3d.q(list5, 10));
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                med medVar = (med) it.next();
                if (list4 != null) {
                    Iterator it2 = list4.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!Intrinsics.d(((gip0) next2).f11360a, medVar.g));
                    gip0Var = (gip0) next2;
                } else {
                    gip0Var = null;
                }
                if (list4 != null) {
                    Iterator it3 = list4.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!Intrinsics.d(((gip0) next).f11360a, medVar.h));
                    gip0Var2 = (gip0) next;
                } else {
                    gip0Var2 = null;
                }
                String str = medVar.c;
                if (str == null) {
                    jf4.k(null);
                    return null;
                }
                Long l2 = medVar.b;
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                pek pekVar = lho.b;
                Integer num = medVar.f;
                boolean zBooleanValue = false;
                int iIntValue = num != null ? num.intValue() : 0;
                pekVar.getClass();
                lho lhoVarG = pek.g(iIntValue);
                String str2 = gip0Var != null ? gip0Var.b : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = gip0Var2 != null ? gip0Var2.b : null;
                String str4 = str3 == null ? "" : str3;
                String str5 = gip0Var != null ? gip0Var.d : null;
                if (str5 == null) {
                    str5 = "";
                }
                String strT = vsm0.t(str5);
                String str6 = gip0Var2 != null ? gip0Var2.d : null;
                String strT2 = vsm0.t(str6 != null ? str6 : "");
                Object obj = medVar.d;
                if (obj == null && (obj = medVar.i) == null) {
                    obj = "0";
                }
                String string = obj.toString();
                Object obj2 = medVar.e;
                String string2 = ((obj2 == null && (obj2 = medVar.j) == null) ? "0" : obj2).toString();
                Integer num2 = medVar.f21639a;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Integer num3 = medVar.k;
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                long jLongValue3 = l != null ? l.longValue() : 0L;
                List listZ = tx3.z(new gip0[]{gip0Var, gip0Var2});
                Iterator it4 = it;
                Long l3 = l;
                ArrayList arrayList4 = new ArrayList(r3d.q(listZ, 10));
                Iterator it5 = ((ArrayList) listZ).iterator();
                while (it5.hasNext()) {
                    arrayList4.add(dnm0.q((gip0) it5.next()));
                }
                cys0 cys0VarV = wvb.V(jLongValue3, arrayList4);
                if (gip0Var == null || (list3 = gip0Var.e) == null) {
                    arrayList = 0;
                } else {
                    arrayList = new ArrayList(r3d.q(list3, 10));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        arrayList.add(a4n0.m((o4n0) it6.next()));
                    }
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                ?? r28 = arrayList;
                if (gip0Var2 == null || (list2 = gip0Var2.e) == null) {
                    arrayList2 = 0;
                } else {
                    arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it7 = list2.iterator();
                    while (it7.hasNext()) {
                        arrayList2.add(a4n0.m((o4n0) it7.next()));
                    }
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                ?? r29 = arrayList2;
                Boolean bool = medVar.l;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                arrayList3.add(new jed(str, jLongValue2, lhoVarG, str2, str4, strT, strT2, string, string2, iIntValue2, iIntValue3, cys0VarV, r28, r29, zBooleanValue));
                it = it4;
                l = l3;
            }
            list = arrayList3;
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        return new t6p0(jLongValue, list);
    }

    public static final mbs0 C(m97 m97Var) {
        m97Var.getClass();
        long j = m97Var.f21398a;
        tqt tqtVar = uoy.b;
        int i = m97Var.b;
        tqtVar.getClass();
        return new mbs0(j, tqt.j(i), m97Var.c, m97Var.d, m97Var.e, m97Var.f, m97Var.g, m97Var.h, m97Var.i, String.valueOf(m97Var.j), m97Var.k, m97Var.l, m97Var.m, m97Var.n, m97Var.o, m97Var.p, m97Var.q, m97Var.r, m97Var.s, m97Var.t, m97Var.u, m97Var.w, m97Var.x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    public static final rgv0 D(ugv0 ugv0Var, lg30 lg30Var) {
        ?? arrayList;
        ugv0Var.getClass();
        Integer num = ugv0Var.f35645a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = ugv0Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = ugv0Var.c;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        String str = ugv0Var.d;
        String str2 = str == null ? "" : str;
        List<smn0> list = ugv0Var.e;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (smn0 smn0Var : list) {
                smn0Var.getClass();
                String str3 = smn0Var.f32456a;
                if (str3 == null) {
                    str3 = "";
                }
                Integer num4 = smn0Var.b;
                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                Integer num5 = smn0Var.c;
                int iIntValue5 = num5 != null ? num5.intValue() : 0;
                String str4 = smn0Var.d;
                if (str4 == null) {
                    str4 = "";
                }
                arrayList.add(new hmn0(str3, iIntValue4, iIntValue5, str4));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new rgv0(lg30Var, iIntValue, iIntValue2, iIntValue3, str2, arrayList);
    }

    public static BigInteger E(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] F(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        jf4.o("n must not be negative");
        return null;
    }

    public static byte[] G(BigInteger bigInteger, int i) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            jf4.o("integer must be nonnegative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (byteArray.length > i2) {
            hny.o("integer too large");
            return null;
        }
        if (byteArray.length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
            return bArr;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, byteArray.length);
        }
        hny.o("integer too large");
        return null;
    }

    public static final void a(mm40 mm40Var, kbm0 kbm0Var, fet fetVar, int i) {
        k6z k6zVar;
        kbm0Var.getClass();
        fetVar.g0(-2107522897);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kbm0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new jbm0();
                fetVar.o0(objP);
            }
            jbm0 jbm0Var = (jbm0) objP;
            if (kbm0Var.c) {
                fetVar.e0(1895068086);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1895069010);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(560571375, new o3m0(kbm0Var, jbm0Var), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) kbm0Var, i, (byte) 14);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, d280 d280Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-177191396);
        int i2 = i | 6 | (fetVar2.g(d280Var) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 16.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.l, d280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            v8q0.a(str, dw9.h(1.0f, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), true), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, (i2 >> 6) & 14, 24960, 110584);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vdp(mm40Var2, d280Var, str, i, (byte) 1);
        }
    }

    public static final void c(mm40 mm40Var, ra10 ra10Var, fet fetVar, int i) {
        fetVar.g0(-1605982960);
        int i2 = i | 6 | (fetVar.g(ra10Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bvn(ra10Var, (byte) 5);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            vbw0.y(6, 0, fetVar, jm40Var, (Function1) objP);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cvn(mm40Var, ra10Var, i, (byte) 2);
        }
    }

    public static final void d(mm40 mm40Var, mws0 mws0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1756928222);
        int i2 = i | 6 | (fetVar2.g(mws0Var) ? 32 : 16);
        byte b2 = 14;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b2)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, shdVar4, 1.0f, true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b2)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVarI);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            b(0, fetVar2, null, mws0Var.b, mws0Var.f22521a);
            b(0, fetVar2, null, mws0Var.c, mws0Var.d);
            fetVar2.r(true);
            v8q0.a(mws0Var.e, o7k0.u(jm40Var, 0.0f, 128.0f, 1), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var2, mws0Var, i, (byte) 14);
        }
    }

    public static final void e(o0x o0xVar, o0x o0xVar2, Function1 function1, xdr xdrVar, ugd ugdVar, fet fetVar, int i) {
        o0x o0xVar3;
        int i2;
        fet fetVar2;
        o0xVar.getClass();
        o0xVar2.getClass();
        function1.getClass();
        xdrVar.getClass();
        fetVar.g0(469033251);
        if ((i & 6) == 0) {
            o0xVar3 = o0xVar;
            i2 = (fetVar.g(o0xVar3) ? 4 : 2) | i;
        } else {
            o0xVar3 = o0xVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(o0xVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            Object objA = ((Boolean) pz40Var2.getValue()).booleanValue() ? o0xVar2.a() : o0xVar3.a();
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new cw7(pz40Var, pz40Var2, (byte) 8);
                fetVar.o0(objP3);
            }
            Object obj = objA;
            mz3 mz3VarX = l7x.X(obj, (Function1) objP3, null, fetVar, 384, 26);
            if (((lz3) pz40Var.getValue()) instanceof kz3) {
                fetVar.e0(1441893958);
                boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object objP4 = fetVar.P();
                if (z || objP4 == cl5Var) {
                    o0x o0xVar4 = o0xVar3;
                    fetVar2 = fetVar;
                    u6t0 u6t0Var = new u6t0(function1, o0xVar2, o0xVar4, pz40Var2, null, (byte) 0);
                    fetVar2.o0(u6t0Var);
                    objP4 = u6t0Var;
                } else {
                    fetVar2 = fetVar;
                }
                m0x0.t(fetVar2, obj, (Function2) objP4);
                xdrVar.F(mz3VarX, fetVar2, Integer.valueOf((i2 >> 6) & 112));
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(1442059002);
                twn.v((i2 >> 12) & 14, ugdVar, fetVar2, false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p4t0(o0xVar, o0xVar2, function1, xdrVar, ugdVar, i, (byte) 1);
        }
    }

    public static final void f(lc00 lc00Var, int i, int i2, boolean z) {
        boolean z2 = i2 > 0;
        if (i2 >= 0 || z) {
            lc00Var.add(new xem0(i, i2, i2 >= 0, z2 ? 1.0f : 0.6f, z2 ? kkg.f : kkg.g));
        }
    }

    public static void g(String str, String str2) {
        Log.e("SecurityComp20000302: ".concat(str), str2);
    }

    public static final String h(ql5 ql5Var) {
        if (ql5Var == null) {
            return "";
        }
        double d = ql5Var.b;
        String str = ql5Var.f;
        if (cy7.c()) {
            pn40 pn40Var = pn40.f27267a;
            return w6x.q(str, " \u200e", pn40.i(d, 2));
        }
        pn40 pn40Var2 = pn40.f27267a;
        return kng0.l(pn40.i(d, 2), Separators.SP, str);
    }

    public static final boo0 i(mgm0 mgm0Var, List list, ctf0 ctf0Var) {
        String strA;
        mgm0Var.getClass();
        list.getClass();
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            y3d y3dVar = null;
            if (!it.hasNext()) {
                return new boo0("STATISTIC_TABLE_TABS", new fyl(dyb.o0(arrayList), null, null, s5x0.t(xfn.b(ctf0Var.j()).e, 0.0f, 2), new jyl(new y3d(ijg.U), y3dVar, y3dVar, 126), 6), pno0.f27299a);
            }
            mgm0 mgm0Var2 = (mgm0) it.next();
            long j = mgm0Var2.f21751a;
            if (mgm0Var2 instanceof lgm0) {
                strA = ctf0Var.b.a(R.string.valorant_basic_stat_tab_title, Arrays.copyOf(new Object[0], 0));
            } else {
                if (!(mgm0Var2 instanceof kgm0)) {
                    t9f.b();
                    return null;
                }
                strA = ctf0Var.b.a(R.string.valorant_additional_stat_tab_title, Arrays.copyOf(new Object[0], 0));
            }
            arrayList.add(new lxl(j, (dyl) new xxl(strA), false, ((long) mgm0Var2.f21751a) == ((long) mgm0Var.f21751a) ? uxl.b : uxl.f36445a, (cwl) null, 108));
        }
    }

    public static void j(String str, String str2) {
        Log.i("SecurityComp20000302: " + str, str2);
    }

    public static final HashMap k(String str) {
        if (str == null) {
            return null;
        }
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, null);
        HashMap map = new HashMap(listSplit$default.size());
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 0, 6, null);
            if (listSplit$default2.size() > 1) {
                map.put(listSplit$default2.get(0), listSplit$default2.get(1));
            }
        }
        return map;
    }

    public static final y9q0 l(y9q0 y9q0Var, fet fetVar) {
        return y9q0.a(y9q0Var, ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
    }

    public static final y9q0 m(y9q0 y9q0Var, fet fetVar) {
        return y9q0.a(y9q0Var, ((ThemeColors) fetVar.k(zaq0.b)).getPrimaryForeground(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
    }

    public static final y9q0 n(y9q0 y9q0Var, fet fetVar) {
        return y9q0.a(y9q0Var, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
    }

    public static final y9q0 o(y9q0 y9q0Var, fet fetVar) {
        return y9q0.a(y9q0Var, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary20(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
    }

    public static final y9q0 p(y9q0 y9q0Var, fet fetVar) {
        return y9q0.a(y9q0Var, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary40(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
    }

    public static final y9q0 q(y9q0 y9q0Var, fet fetVar) {
        return y9q0.a(y9q0Var, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary60(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
    }

    public static final y9q0 r(y9q0 y9q0Var, fet fetVar) {
        return y9q0.a(y9q0Var, ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
    }

    public static final y9q0 s(y9q0 y9q0Var, fet fetVar) {
        return y9q0.a(y9q0Var, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
    }

    public static final y9q0 t(y9q0 y9q0Var, fet fetVar) {
        return y9q0.a(y9q0Var, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
    }

    public static final i4i u(d0t d0tVar, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z4) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z5) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new i4i(false, c4iVar, null, (d0tVar.S && z3) ? new v3i(new d2i()) : w3i.f38503a, z3iVar, x3iVar, null, 68);
    }

    public static k4i v(d0t d0tVar, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z4) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z5) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new k4i(c4iVar, null, (d0tVar.S && z3) ? new v3i(new d2i()) : w3i.f38503a, z3iVar, x3iVar, t3i.f33268a, 4);
    }

    public static l4i w(d0t d0tVar, String str, String str2, List list, boolean z, boolean z2, boolean z3, String str3, boolean z4, boolean z5) {
        h4i e4iVar;
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str3, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z3) {
            long jR0 = kpb.r0(d0tVar);
            fgm fgmVar = fgm.f9498a;
            e4iVar = new e4i(24, jR0, d0tVar.P.getTime(), false);
        } else {
            e4iVar = f4i.f8914a;
        }
        b4i b4iVar = new b4i(str2, e4iVar);
        if (z4) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z5) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new l4i("", c4iVar, b4iVar, null, z3iVar, x3iVar, t3i.f33268a, 8);
    }

    public static k4i x(d0t d0tVar, String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new k4i(c4iVar, null, null, z3iVar, x3iVar, t3i.f33268a, 12);
    }

    public static j4i y(d0t d0tVar, String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new j4i(c4iVar, null, z3iVar, x3iVar, t3i.f33268a, 12);
    }

    public void A(View view, float f) {
        if (f14495a) {
            try {
                dmu0.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f14495a = false;
            }
        }
        view.setAlpha(f);
    }

    public float z(View view) {
        if (f14495a) {
            try {
                return dmu0.a(view);
            } catch (NoSuchMethodError unused) {
                f14495a = false;
            }
        }
        return view.getAlpha();
    }
}
