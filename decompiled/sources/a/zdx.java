package a;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zdx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f7u f44229a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final ba50 A(kxq kxqVar) {
        da50 da50Var = kxqVar instanceof da50 ? (da50) kxqVar : null;
        if (da50Var == null) {
            throw new z950(kxqVar.getClass().getSimpleName());
        }
        ba50 ba50Var = ((ApplicationActivity) da50Var).Z;
        if (ba50Var != null) {
            return ba50Var;
        }
        Intrinsics.h("navBarHolder");
        throw null;
    }

    public static final boolean B(Fragment fragment) {
        Iterator it = lgi0.e(new da40((byte) 26), fragment.y).iterator();
        while (it.hasNext()) {
            if (((Fragment) it.next()) instanceof ia50) {
                return true;
            }
        }
        return false;
    }

    public static final boolean C(d800 d800Var) {
        List list = d800Var.b;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<m800> list2 = ((u800) it.next()).b;
            if (list2 == null || !list2.isEmpty()) {
                for (m800 m800Var : list2) {
                    if (m800Var.c != 0 && m800Var.b != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static f7u D() {
        f7u f7uVar;
        f7u f7uVar2 = f44229a;
        if (f7uVar2 != null) {
            return f7uVar2;
        }
        Object obj = null;
        try {
            f7uVar = new f7u((Object) Class.class.getMethod("isSealed", null), (Object) Class.class.getMethod("getPermittedSubclasses", null), (Object) Class.class.getMethod("isRecord", null), (Object) Class.class.getMethod("getRecordComponents", null), (byte) 26);
        } catch (NoSuchMethodException unused) {
            f7uVar = new f7u(obj, obj, obj, obj, (byte) 26);
        }
        f44229a = f7uVar;
        return f7uVar;
    }

    public static Boolean E(Class cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method method = (Method) D().b;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }

    public static final boolean F(String str, List list) {
        if (list.isEmpty()) {
            return false;
        }
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((f8h) it.next()).n.isEmpty()) {
                return str.length() > 0;
            }
        }
        return false;
    }

    public static final long G(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final ba50 H(fet fetVar) {
        Object obj = (Activity) fetVar.k(cr00.f4820a);
        boolean zG = fetVar.g(obj);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            da50 da50Var = obj instanceof da50 ? (da50) obj : null;
            if (da50Var == null) {
                String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
                if (simpleName == null) {
                    simpleName = "";
                }
                throw new z950(simpleName);
            }
            ba50 ba50Var = ((ApplicationActivity) da50Var).Z;
            if (ba50Var == null) {
                Intrinsics.h("navBarHolder");
                throw null;
            }
            fetVar.o0(ba50Var);
            objP = ba50Var;
        }
        return (ba50) objP;
    }

    public static final long I(long j, ma80 ma80Var) {
        ma80Var.getClass();
        int iOrdinal = ma80Var.ordinal();
        if (iOrdinal == 0) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float f = -Float.intBitsToFloat((int) (j & 4294967295L));
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)));
        }
        if (iOrdinal != 1) {
            t9f.b();
            return 0L;
        }
        float f2 = -Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
    }

    public static final muy J(puy puyVar) {
        puyVar.getClass();
        List list = puyVar.f27638a;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = list;
        String str = puyVar.c;
        String str2 = str == null ? "" : str;
        String str3 = puyVar.b;
        String str4 = str3 == null ? "" : str3;
        String str5 = puyVar.d;
        String str6 = str5 == null ? "" : str5;
        Integer num = puyVar.e;
        int iIntValue = num != null ? num.intValue() : 0;
        String str7 = puyVar.g;
        String str8 = str7 == null ? "" : str7;
        String str9 = puyVar.h;
        return new muy(iIntValue, str4, str2, str6, str8, str9 == null ? "" : str9, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r24v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.util.List] */
    public static final q310 K(q510 q510Var) {
        r510 r510Var;
        r510 r510Var2;
        List list;
        n410 n410Var;
        n410 n410Var2;
        ?? arrayList;
        ?? arrayList2;
        a410 a410Var;
        x310 x310Var;
        Integer num = q510Var.f28127a;
        int iIntValue = num != null ? num.intValue() : -1;
        Long l = q510Var.b;
        long jLongValue = l != null ? l.longValue() : -1L;
        u510 u510Var = q510Var.c;
        r510 r510VarK = u510Var != null ? efx.K(u510Var) : new r510(-1, -1L, "", "");
        u510 u510Var2 = q510Var.d;
        r510 r510VarK2 = u510Var2 != null ? efx.K(u510Var2) : new r510(-1, -1L, "", "");
        String str = q510Var.e;
        if (str == null) {
            str = "";
        }
        Integer num2 = q510Var.f;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Integer num3 = q510Var.g;
        int iIntValue3 = num3 != null ? num3.intValue() : -1;
        String str2 = q510Var.h;
        if (str2 == null) {
            str2 = "";
        }
        Long l2 = q510Var.i;
        long jLongValue2 = l2 != null ? l2.longValue() : -1L;
        List list2 = q510Var.j;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                i410 i410Var = (i410) it.next();
                i410Var.getClass();
                n510 n510Var = i410Var.f14123a;
                if (n510Var != null) {
                    n410Var = xdx.L(n510Var);
                } else {
                    iun iunVar = iun.f15405a;
                    n410Var = new n410(-1L, -1L, "", "", false, "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, iunVar, iunVar);
                }
                n510 n510Var2 = i410Var.b;
                if (n510Var2 != null) {
                    n410Var2 = xdx.L(n510Var2);
                } else {
                    iun iunVar2 = iun.f15405a;
                    n410Var2 = new n410(-1L, -1L, "", "", false, "", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, iunVar2, iunVar2);
                }
                Integer num4 = i410Var.c;
                int iIntValue4 = num4 != null ? num4.intValue() : -1;
                String str3 = i410Var.d;
                String str4 = str3 == null ? "" : str3;
                Long l3 = i410Var.e;
                long jLongValue3 = l3 != null ? l3.longValue() : -1L;
                List list3 = i410Var.f;
                List list4 = null;
                Iterator it2 = it;
                if (list3 != null) {
                    arrayList = new ArrayList(r3d.q(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        u310 u310Var = (u310) it3.next();
                        u310Var.getClass();
                        Iterator it4 = it3;
                        Integer num5 = u310Var.f34974a;
                        int iIntValue5 = num5 != null ? num5.intValue() : -1;
                        Integer num6 = u310Var.b;
                        arrayList.add(new r310(iIntValue5, num6 != null ? num6.intValue() : -1));
                        it3 = it4;
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                ?? r24 = arrayList;
                List list5 = i410Var.g;
                if (list5 != null) {
                    arrayList2 = new ArrayList(r3d.q(list5, 10));
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        u310 u310Var2 = (u310) it5.next();
                        u310Var2.getClass();
                        Iterator it6 = it5;
                        Integer num7 = u310Var2.f34974a;
                        int iIntValue6 = num7 != null ? num7.intValue() : -1;
                        Integer num8 = u310Var2.b;
                        arrayList2.add(new r310(iIntValue6, num8 != null ? num8.intValue() : -1));
                        it5 = it6;
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                ?? r25 = arrayList2;
                List<f410> list6 = i410Var.h;
                if (list6 != null) {
                    ArrayList arrayList4 = new ArrayList(r3d.q(list6, 10));
                    for (f410 f410Var : list6) {
                        f410Var.getClass();
                        Long l4 = f410Var.f8890a;
                        long jLongValue4 = l4 != null ? l4.longValue() : -1L;
                        c410 c410Var = f410Var.b;
                        if (c410Var != null) {
                            int iOrdinal = c410Var.ordinal();
                            if (iOrdinal == 0) {
                                a410Var = a410.f201a;
                            } else if (iOrdinal == 1) {
                                a410Var = a410.b;
                            } else if (iOrdinal == 2) {
                                a410Var = a410.c;
                            } else if (iOrdinal == 3) {
                                a410Var = a410.d;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                a410Var = a410.e;
                            }
                        } else {
                            a410Var = a410.f;
                        }
                        a410 a410Var2 = a410Var;
                        z310 z310Var = f410Var.c;
                        if (z310Var != null) {
                            switch (z310Var.ordinal()) {
                                case 0:
                                    x310Var = x310.f40194a;
                                    break;
                                case 1:
                                    x310Var = x310.b;
                                    break;
                                case 2:
                                    x310Var = x310.c;
                                    break;
                                case 3:
                                    x310Var = x310.d;
                                    break;
                                case 4:
                                    x310Var = x310.e;
                                    break;
                                case 5:
                                    x310Var = x310.f;
                                    break;
                                case 6:
                                    x310Var = x310.g;
                                    break;
                                default:
                                    t9f.b();
                                    return null;
                            }
                        } else {
                            x310Var = x310.h;
                        }
                        x310 x310Var2 = x310Var;
                        Integer num9 = f410Var.d;
                        arrayList4.add(new w310(jLongValue4, a410Var2, x310Var2, num9 != null ? num9.intValue() : -1));
                    }
                    list4 = arrayList4;
                }
                if (list4 == null) {
                    list4 = iun.f15405a;
                }
                arrayList3.add(new v310(n410Var, n410Var2, iIntValue4, str4, jLongValue3, r24, r25, list4));
                it = it2;
                r510VarK = r510VarK;
                r510VarK2 = r510VarK2;
            }
            r510Var = r510VarK;
            r510Var2 = r510VarK2;
            list = arrayList3;
        } else {
            r510Var = r510VarK;
            r510Var2 = r510VarK2;
            list = iun.f15405a;
        }
        return new q310(iIntValue, jLongValue, r510Var, r510Var2, str, iIntValue2, iIntValue3, str2, jLongValue2, list);
    }

    public static final ys30 L(et30 et30Var) {
        Long l = et30Var.f8358a;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        Long l2 = et30Var.e;
        if (l2 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue2 = l2.longValue();
        Integer num = et30Var.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = et30Var.c;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        wr30 wr30Var = et30Var.d;
        if (wr30Var == null) {
            jf4.k(null);
            return null;
        }
        Integer num3 = wr30Var.f39620a;
        if (num3 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue3 = num3.intValue();
        List list = wr30Var.b;
        if (list == null) {
            list = iun.f15405a;
        }
        Integer num4 = wr30Var.c;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        Integer num5 = wr30Var.d;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        Integer num6 = wr30Var.e;
        if (num6 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue6 = num6.intValue();
        Integer num7 = wr30Var.f;
        if (num7 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue7 = num7.intValue();
        Integer num8 = wr30Var.g;
        if (num8 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue8 = num8.intValue();
        List list2 = wr30Var.h;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new ys30(jLongValue, jLongValue2, iIntValue, iIntValue2, new tr30(iIntValue3, list, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, list2));
    }

    public static final String M(d0t d0tVar) {
        if (d0tVar.v == 176) {
            return d0tVar.R;
        }
        return d0tVar.q.b.length() > 0 ? qzb.c0(d0tVar) : qzb.r0(d0tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    public static final zec0 N(mhc0 mhc0Var) {
        ?? arrayList;
        mhc0Var.getClass();
        String str = mhc0Var.f21785a;
        if (str == null) {
            jf4.k(null);
            return null;
        }
        String str2 = mhc0Var.h;
        if (str2 == null) {
            str2 = "";
        }
        List<cdc0> list = mhc0Var.b;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (cdc0 cdc0Var : list) {
                cdc0Var.getClass();
                String str3 = cdc0Var.f4156a;
                if (str3 == null) {
                    jf4.k(null);
                    return null;
                }
                Integer num = cdc0Var.b;
                if (num == null) {
                    jf4.k(null);
                    return null;
                }
                int iIntValue = num.intValue();
                String str4 = cdc0Var.c;
                if (str4 == null) {
                    jf4.k(null);
                    return null;
                }
                String str5 = cdc0Var.d;
                if (str5 == null) {
                    jf4.k(null);
                    return null;
                }
                arrayList.add(new wcc0(str3, iIntValue, str4, str5));
            }
        } else {
            arrayList = iun.f15405a;
        }
        Double d = mhc0Var.c;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        String str6 = mhc0Var.d;
        String str7 = str6 != null ? str6 : "";
        Long l = mhc0Var.e;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = mhc0Var.f;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Integer num2 = mhc0Var.g;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = mhc0Var.i;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        Long l3 = mhc0Var.j;
        if (l3 != null) {
            return new zec0(str, str2, arrayList, dDoubleValue, str7, jLongValue, jLongValue2, iIntValue2, iIntValue3, l3.longValue());
        }
        jf4.k(null);
        return null;
    }

    public static final dxh0 O(zvh0 zvh0Var) {
        int iOrdinal = zvh0Var.ordinal();
        if (iOrdinal == 0) {
            return axh0.f1625a;
        }
        if (iOrdinal == 1) {
            return zwh0.f45106a;
        }
        if (iOrdinal == 2) {
            return cxh0.f5122a;
        }
        if (iOrdinal == 3) {
            return bxh0.f3376a;
        }
        t9f.b();
        return null;
    }

    public static msl0 P(jkp jkpVar, boolean z) {
        long j = jkpVar.f16682a;
        String str = jkpVar.b;
        boolean z2 = jkpVar.e;
        return new msl0(j, str, z2, (z || z2) ? false : true, new zrm(new b2l0(str, y3d.g), (u1l0) null, (g3l0) null, (d4d) null, (n3l0) null, 62));
    }

    public static final void a(mm40 mm40Var, String str, y9q0 y9q0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(336710427);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(mm40Var, 4.0f, 0.0f, 2), "SPORT_EXPRESS_CARD_HEADER_TAG");
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new ryc0(pz40Var, b);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP2);
            y9q0 y9q0VarT = ibm0.t(y9q0Var, fetVar);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new ryc0(pz40Var, (byte) 17);
                fetVar.o0(objP3);
            }
            v8q0.a(str, mm40VarA, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP3, y9q0VarT, fetVar, (i2 >> 3) & 14, 1597824, 45052);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var, (Object) str, (Object) y9q0Var, i, (byte) 28);
        }
    }

    public static final void b(mm40 mm40Var, o6l0 o6l0Var, mpo mpoVar, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-261011796);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(o6l0Var) ? 32 : 16) | (fetVar2.g(mpoVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            float f = mpoVar.k;
            y9q0 y9q0Var = mpoVar.j;
            float f2 = mpoVar.i;
            mm40 mm40VarE0 = o2e.e0(o7k0.c(s5x0.N(mm40Var, 0.0f, f, 0.0f, 0.0f, 13), 1.0f), "SPORT_EXPRESS_COLUMN_TAG");
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            boolean z3 = mpoVar.l;
            byte b = 5;
            cl5 cl5Var = ukd.f35823a;
            if (z3) {
                fetVar2.e0(539868232);
                long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
                mm40 mm40VarN = o7k0.n(jm40Var, 36.0f);
                boolean zF = fetVar2.f(background);
                Object objP = fetVar2.P();
                if (zF || objP == cl5Var) {
                    objP = new r2a0(b, background);
                    fetVar2.o0(objP);
                }
                p8a.k(mm40VarN, (Function1) objP, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(540093106);
                fetVar2.r(false);
            }
            byte b2 = 6;
            if (mpoVar.m) {
                fetVar2.e0(540147418);
                long backgroundGroupSecondary = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundGroupSecondary();
                mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 32.0f);
                boolean zF2 = fetVar2.f(backgroundGroupSecondary);
                Object objP2 = fetVar2.P();
                if (zF2 || objP2 == cl5Var) {
                    objP2 = new r2a0(b2, backgroundGroupSecondary);
                    fetVar2.o0(objP2);
                }
                p8a.k(mm40VarE, (Function1) objP2, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(540508754);
                fetVar2.r(false);
            }
            ydl0 ydl0Var = o6l0Var.f24742a;
            if (ydl0Var instanceof xdl0) {
                fetVar2.e0(540590377);
                z = true;
                k7x.b(((xdl0) ydl0Var).f40699a, null, o7k0.n(jm40Var, f2), a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar2), null, null, null, null, null, null, null, new m78(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), 5), fetVar, 4144, 0, 28656);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(540986092);
                j0x.b(iom0.r(jpm0.t(R.drawable.ic_1x_bonus_new, 6, fetVar2), fetVar2), null, o7k0.n(jm40Var, f2), null, null, 0.0f, new m78(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), 5), fetVar2, 56, 56);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            v8q0.a(o6l0Var.b, null, 0L, new n05(qmk.o, y9q0Var.f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(y9q0Var, fetVar2), fetVar, 0, 24960, 110582);
            fetVar2 = fetVar;
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, o6l0Var, mpoVar, i, (byte) 13);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(757878559);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 36.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            mm40 mm40VarD2 = o7k0.d(o7k0.s(o7k0.e(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 14.0f), 160.0f), 1.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD2), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 22);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        int i2;
        l7m0Var.getClass();
        fetVar.g0(-1446980986);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(l7m0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ufp(l7m0Var, (byte) 12);
                fetVar.o0(objP);
            }
            p8a.k(mm40Var, (Function1) objP, fetVar, i3 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new udx(mm40Var, l7m0Var, i, (byte) 3);
        }
    }

    public static final void e(mez mezVar, final ma80 ma80Var, final jez jezVar, final mm40 mm40Var, final lh80 lh80Var, final qkq qkqVar, final boolean z, final vf80 vf80Var, final float f, final float f2, final Function1 function1, fet fetVar, final int i, final int i2) {
        int i3;
        int i4;
        mez mezVar2;
        boolean z2;
        mez mezVar3;
        ma80 ma80Var2;
        mm40 mm40VarG0;
        fetVar.g0(-1904835166);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mezVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.e(ma80Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? fetVar.g(jezVar) : fetVar.i(jezVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.g(mm40Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.g(lh80Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= fetVar.h(false) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= fetVar.g(qkqVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= fetVar.h(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= fetVar.g(vf80Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= fetVar.d(f) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (fetVar.d(f2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.i(function1) ? 32 : 16;
        }
        boolean z3 = true;
        if (fetVar.U(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            int i6 = i5 & 14;
            int i7 = i6 | (i4 & 112);
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            int i8 = i4;
            boolean z4 = (((i7 & 14) ^ 6) > 4 && fetVar.g(mezVar)) || (i7 & 6) == 4;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z4 || objP == obj) {
                ujn ujnVar = ujn.A;
                rip ripVar = new rip(pz40VarF, (byte) 8);
                nvu nvuVar = jgk0.f16485a;
                objP = new a6g(new zbk(new mbz(new zbk(ripVar, ujnVar), mezVar, (byte) 2), ujnVar), l7m0.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 9);
                fetVar.o0(objP);
            }
            eiy eiyVar = (eiy) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            afv afvVar = (afv) fetVar.k(bmd.g);
            int i9 = i5 >> 6;
            int i10 = i5 >> 12;
            int i11 = i6 | (i9 & 896) | (i9 & 7168) | ((i5 << 9) & 57344) | (i10 & 458752) | ((i8 << 18) & 3670016) | ((i5 << 18) & 234881024);
            boolean zG = ((((i11 & 234881024) ^ 100663296) > 67108864 && fetVar.g(jezVar)) || (i11 & 100663296) == 67108864) | ((((i11 & 896) ^ 384) > 256 && fetVar.g(lh80Var)) || (i11 & 384) == 256) | ((((i11 & 14) ^ 6) > 4 && fetVar.g(mezVar)) || (i11 & 6) == 4) | fetVar.g(eiyVar) | ((((i11 & 7168) ^ 3072) > 2048 && fetVar.h(false)) || (i11 & 3072) == 2048) | ((((i11 & 57344) ^ 24576) > 16384 && fetVar.e(ma80Var.ordinal())) || (i11 & 24576) == 16384) | ((((i11 & 458752) ^ 196608) > 131072 && fetVar.d(f)) || (i11 & 196608) == 131072) | ((((i11 & 3670016) ^ 1572864) > 1048576 && fetVar.d(f2)) || (i11 & 1572864) == 1048576) | fetVar.g(afvVar);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                z2 = false;
                Object eezVar = new eez(mezVar, ma80Var, jezVar, eiyVar, lh80Var, f, vneVar, afvVar);
                mezVar3 = mezVar;
                fetVar.o0(eezVar);
                objP3 = eezVar;
            } else {
                z2 = false;
                mezVar3 = mezVar;
            }
            ibz ibzVar = (ibz) objP3;
            int i12 = i6 | (i10 & 112);
            boolean z5 = ((((i12 & 112) ^ 48) > 32 && fetVar.h(z2)) || (i12 & 48) == 32) | ((((i12 & 14) ^ 6) > 4 && fetVar.g(mezVar3)) || (i12 & 6) == 4);
            Object objP4 = fetVar.P();
            if (z5 || objP4 == obj) {
                objP4 = new iez(mezVar3);
                fetVar.o0(objP4);
            }
            iez iezVar = (iez) objP4;
            if (z) {
                fetVar.e0(-1834596342);
                if (((i6 ^ 6) <= 4 || !fetVar.g(mezVar3)) && (i5 & 6) != 4) {
                    z3 = false;
                }
                Object objP5 = fetVar.P();
                if (z3 || objP5 == obj) {
                    objP5 = new tdz(mezVar3);
                    fetVar.o0(objP5);
                }
                ma80Var2 = ma80Var;
                mm40VarG0 = ahy.g0((tdz) objP5, mezVar3.k, z2, ma80Var2);
                fetVar.r(false);
            } else {
                ma80Var2 = ma80Var;
                fetVar.e0(-1834291488);
                fetVar.r(false);
                mm40VarG0 = jm40.b;
            }
            boolean z6 = z2;
            mez mezVar4 = mezVar3;
            mm40 mm40VarD0 = nia0.d0(i120.c0(o050.Q(mm40Var.e(mezVar3.i).e(mezVar3.j), eiyVar, iezVar, ma80Var2, z, z6).e(mm40VarG0), mezVar3.t), mezVar4, ma80Var, vf80Var, z, z6, qkqVar, mezVar3.r, null);
            mezVar2 = mezVar4;
            t9x.f(eiyVar, mm40VarD0, mezVar2.m, ibzVar, fetVar, 0);
        } else {
            mezVar2 = mezVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final mez mezVar5 = mezVar2;
            yfe0VarU.d = new Function2() { // from class: a.aez
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(i | 1);
                    int iL2 = x8x.L(i2);
                    zdx.e(mezVar5, ma80Var, jezVar, mm40Var, lh80Var, qkqVar, z, vf80Var, f, f2, function1, (fet) obj2, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void f(mm40 mm40Var, xdr xdrVar, ugd ugdVar, xdr xdrVar2, fet fetVar, int i) {
        fetVar.g0(-10848142);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.A;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            if (xdrVar2 == null) {
                fetVar.e0(741676852);
            } else {
                fetVar.e0(1409398381);
                xdrVar2.F(mrv.k0(jm40Var, "MarketCategoriesSubGamesContainerSEPARATOR"), fetVar, 54);
            }
            fetVar.r(false);
            if (xdrVar == null) {
                fetVar.e0(741733303);
            } else {
                fetVar.e0(1409400202);
                xdrVar.F(mrv.k0(jm40Var, "MarketCategoriesSubGamesContainerHEADER"), fetVar, 54);
            }
            fetVar.r(false);
            ugdVar.F(mrv.k0(jm40Var, "MarketCategoriesSubGamesContainerITEMS"), fetVar, 54);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 23, i, (Object) mm40Var, (Object) xdrVar, (Object) ugdVar, (Object) xdrVar2);
        }
    }

    public static final void g(mm40 mm40Var, final e530 e530Var, boolean z, final Function1 function1, Function1 function2, Function2 function3, final Function1 function4, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        e530Var.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        fetVar2.g0(-1652081079);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(e530Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192) | (fetVar2.i(function3) ? 131072 : 65536) | (fetVar2.i(function4) ? 1048576 : 524288);
        final byte b = 0;
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40Var, vgg0.b(16.0f, 16.0f, 16.0f, 16.0f));
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarJ, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            c530 c530Var = e530Var.b;
            boolean z2 = e530Var.d;
            int i3 = i2 & 112;
            boolean z3 = ((i2 & 7168) == 2048) | (i3 == 32);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new Function0() { // from class: a.d530
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = b;
                        e530 e530Var2 = e530Var;
                        Function1 function5 = function1;
                        switch (b2) {
                            case 0:
                                function5.invoke(Long.valueOf(e530Var2.f7212a));
                                break;
                            default:
                                function5.invoke(Long.valueOf(e530Var2.f7212a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = ((458752 & i2) == 131072) | (i3 == 32);
            Object objP2 = fetVar2.P();
            byte b2 = 3;
            if (z4 || objP2 == cl5Var) {
                objP2 = new bw20(function3, e530Var, b2);
                fetVar2.o0(objP2);
            }
            Function1 function5 = (Function1) objP2;
            boolean z5 = ((i2 & 3670016) == 1048576) | (i3 == 32);
            Object objP3 = fetVar2.P();
            if (z5 || objP3 == cl5Var) {
                final byte b3 = 1;
                objP3 = new Function0() { // from class: a.d530
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        e530 e530Var2 = e530Var;
                        Function1 function6 = function4;
                        switch (b4) {
                            case 0:
                                function6.invoke(Long.valueOf(e530Var2.f7212a));
                                break;
                            default:
                                function6.invoke(Long.valueOf(e530Var2.f7212a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP3);
            }
            piz.k(null, c530Var, z2, function0, function5, (Function0) objP3, fetVar2, 0);
            b34.e(y5d.f42040a, e530Var.d, null, kzn.k(ro4.m0(300, 0, null, 6), null, 2).a(kzn.d(null, 0.0f, 3)), kzn.i(ro4.m0(300, 0, null, 6), null, 14).a(kzn.e(null, 3)), null, u1c.M(1123750551, new l4m(e530Var, z, function2, (byte) 2), fetVar2), fetVar, 1600518, 18);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var, e530Var, z, function1, function2, function3, function4, i);
        }
    }

    public static final void h(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        str.getClass();
        function0.getClass();
        fetVar.g0(-1795387398);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = dw9.j(fetVar);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(y860.W(jm40Var, (gy40) objP, null, false, null, function0, 28), "OPTION_BET_LABEL_TAG");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            j0x.b(iom0.r(jpm0.t(R.drawable.ic_glyph_color_optionbet, 6, fetVar), fetVar), null, o7k0.n(jm40Var, 16.0f), null, null, 0.0f, null, fetVar, 56, 120);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), false);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            aad.e(str, mm40VarH, ibm0.s(g1t0.g(), fetVar), null, 2, false, 1, 0, null, null, fetVar, ((i3 >> 3) & 14) | 1597440, 936);
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_info_circle, 6, fetVar), fetVar), null, o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), StaticColors.INSTANCE.m123getWhite0d7_KjU(), fetVar, 56, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fg5(mm40Var2, str, function0, i, (byte) 5);
        }
    }

    public static final void i(mm40 mm40Var, r090 r090Var, Function1 function1, fet fetVar, int i) {
        r090Var.getClass();
        function1.getClass();
        fetVar.g0(-1215805721);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(r090Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            String str = r090Var.f29621a;
            a4x a4xVar = r090Var.b;
            wmm wmmVar = new wmm();
            pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(r090Var.c), fetVar);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new qu80(function1, (byte) 9);
                fetVar.o0(objP);
            }
            vmm.b(mm40Var, str, a4xVar, wmmVar, pz40VarF, (Function0) objP, null, fetVar, i2 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var, r090Var, function1, i, (byte) 2);
        }
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1617242616);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = q3d.j(wha0.d, wha0.e, wha0.f);
                fetVar.o0(objP);
            }
            List list = (List) objP;
            boolean zI = fetVar.i(list);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new kv80(list, (byte) 5);
                fetVar.o0(objP2);
            }
            x4n0.a(mm40Var, (Function2) objP2, fetVar, i2 & 14, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 19);
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-585605430);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 286.0f), 1.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 28);
        }
    }

    public static final void l(mm40 mm40Var, boolean z, boolean z2, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        function0.getClass();
        fetVar.g0(-824870237);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            dww.c(z2 ? iom0.r(jpm0.t(R.drawable.ic_glyph_quick_bet_active, 6, fetVar), fetVar) : iom0.r(jpm0.t(R.drawable.ic_glyph_quick_bet_inactive, 6, fetVar), fetVar), null, epv0.N(y860.W(mm40Var2, null, null, z, null, function0, 24), z ? 1.0f : 0.5f), obc.O(R.color.static_white, fetVar), fetVar, 56, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new and0(mm40Var, z, z2, function0, i, (byte) 0);
        }
    }

    public static final void m(String str, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-903211108);
        int i2 = i | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40.b, 56.0f), 24.0f);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, null, StaticColors.INSTANCE.m129getWhite400d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, i2 & 14, 0, 130042);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 22, i, str);
        }
    }

    public static final void n(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(945711664);
        int i2 = i | 6;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            c(0, fetVar, null);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 132.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, b);
        }
    }

    public static final void o(int i, int i2, fet fetVar, mm40 mm40Var) {
        wui0 wui0Var;
        fetVar.g0(-1858289587);
        int i3 = (fetVar.e(i) ? 32 : 16) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(1835172796);
            int i4 = 0;
            while (i4 < i) {
                mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
                if (i4 == 0 && i == 1) {
                    wui0Var = wui0.f39793a;
                } else if (i4 == 0) {
                    wui0Var = wui0.b;
                } else {
                    wui0Var = i4 == i + (-1) ? wui0.d : wui0.c;
                }
                g7x.n(mm40VarD2, wui0Var, fetVar, 6);
                i4++;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, i2, (byte) 11);
        }
    }

    public static final void p(final ehj0 ehj0Var, final Function1 function1, fet fetVar, int i) {
        ehj0Var.getClass();
        function1.getClass();
        fetVar.g0(620995106);
        int i2 = (fetVar.g(ehj0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        final byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 60.0f);
            boolean zI = ehj0Var.i();
            String title = ehj0Var.getTitle();
            zfn zfnVar = zaq0.b;
            rqm rqmVar = new rqm(new uui0(title, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), ehj0Var.getSubTitle(), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), ehj0Var.getSubTitle().length() > 0 ? Integer.valueOf(ehj0Var.y().f14347a) : null, 32), new nui0(Integer.valueOf(ehj0Var.b()), null, new m0x(ehj0Var.b(), null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), null, null, 0.0f, 242), new evi0(ehj0Var.l(), new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary())), (d4d) null, (tvi0) null, (wui0) null, zI, (e900) null, 376);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new Function0() { // from class: a.xgj0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = b;
                        ehj0 ehj0Var2 = ehj0Var;
                        Function1 function2 = function1;
                        switch (b2) {
                            case 0:
                                ehj0Var2.getClass();
                                function2.invoke(new gbj0(ehj0Var2));
                                break;
                            default:
                                ehj0Var2.getClass();
                                function2.invoke(new gbj0(ehj0Var2));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            int i5 = (i3 == 32 ? (byte) 1 : (byte) 0) | (i4 == 4 ? (byte) 1 : (byte) 0);
            Object objP2 = fetVar.P();
            if (i5 != 0 || objP2 == cl5Var) {
                final byte b2 = 1;
                objP2 = new Function0() { // from class: a.xgj0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        ehj0 ehj0Var2 = ehj0Var;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                ehj0Var2.getClass();
                                function2.invoke(new gbj0(ehj0Var2));
                                break;
                            default:
                                ehj0Var2.getClass();
                                function2.invoke(new gbj0(ehj0Var2));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            }
            obc.q(mm40VarE, rqmVar, false, null, function0, (Function0) objP2, null, null, fetVar, 0, 204);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) ehj0Var, function1, i, (byte) 19);
        }
    }

    public static final void q(long j, fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(1919900288);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 18.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 70.0f), 16.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 16.0f)), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yxh(j, fqj0Var, i, (byte) 6);
        }
    }

    public static final void r(mm40 mm40Var, ahk0 ahk0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        dn8 dn8VarH;
        mm40 mm40VarT;
        fet fetVar2 = fetVar;
        xgk0 xgk0Var = ahk0Var.c;
        function1.getClass();
        fetVar2.g0(-686559337);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(ahk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
            long warning = ((ThemeColors) fetVar2.k(zfnVar)).getWarning();
            boolean zE = fetVar2.e(xgk0Var.ordinal());
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                int iOrdinal = xgk0Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        zcl zclVar = qmk.f28987a;
                        dn8VarH = j120.h(1.0f, warning);
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return;
                        }
                        dn8VarH = null;
                    }
                    objP = dn8VarH;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    objP = j120.h(2.0f, primary);
                }
                fetVar2.o0(objP);
            }
            dn8 dn8Var = (dn8) objP;
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 56.0f);
            jm40 jm40Var = jm40.b;
            if (dn8Var != null) {
                zcl zclVar4 = qmk.g;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40VarT = i120.T(jm40Var, dn8Var.f6356a, dn8Var.b, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4));
            } else {
                mm40VarT = jm40Var;
            }
            mm40 mm40VarE = mm40VarN.e(mm40VarT);
            long backgroundGroup = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundGroup();
            zcl zclVar5 = qmk.g;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundGroup, new ugg0(zclVar5, zclVar5, zclVar5, zclVar5));
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP2;
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                objP3 = new o0k0((Object) function1, (Object) ahk0Var, (byte) 4);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarK = s5x0.K(y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP3, 28), 2.0f, 8.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            dww.c(a8k0.F(ahk0Var.b, 0, fetVar2), null, o7k0.n(jm40Var, 20.0f), y3d.g, fetVar2, 3128, 0);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            String str = ahk0Var.d;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN2, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var, (Object) ahk0Var, (Object) function1, i, (byte) 21);
        }
    }

    public static final void s(mm40 mm40Var, npo npoVar, String str, a4x a4xVar, chl0 chl0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        mpo mpoVar;
        Function0 function2 = function1;
        str.getClass();
        a4xVar.getClass();
        function0.getClass();
        function2.getClass();
        fetVar.g0(602372487);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(npoVar.ordinal()) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.g(a4xVar) ? 2048 : 1024) | (fetVar.g(chl0Var) ? 16384 : 8192) | (fetVar.i(function0) ? 131072 : 65536) | (fetVar.i(function2) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = i2 >> 3;
            boolean z = (((i3 & 14) ^ 6) > 4 && fetVar.e(npoVar.ordinal())) || (i3 & 6) == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                int iOrdinal = npoVar.ordinal();
                if (iOrdinal == 0) {
                    zcl zclVar = qmk.f28987a;
                    mpoVar = new mpo(138.0f, 16.0f, new gil0(1, null, null, new zgl0(), 6), 8.0f, 4.0f, 2.0f, 58.0f, g1t0.m(), 24.0f, g1t0.a(), 8.0f, false, false);
                } else if (iOrdinal == 1) {
                    zcl zclVar2 = qmk.f28987a;
                    mpoVar = new mpo(132.0f, 20.0f, new oil0((y9q0) null, (y9q0) null, new zgl0(), 6), 12.0f, 8.0f, 2.0f, 46.0f, g1t0.d(), 20.0f, g1t0.d(), 4.0f, false, false);
                } else if (iOrdinal == 2) {
                    zcl zclVar3 = qmk.f28987a;
                    mpoVar = new mpo(148.0f, 20.0f, new kil0(null, null, new zgl0(), 14), 12.0f, 6.0f, 2.0f, 60.0f, g1t0.m(), 20.0f, g1t0.e(), 4.0f, true, false);
                } else if (iOrdinal != 3) {
                    t9f.b();
                    return;
                } else {
                    zcl zclVar4 = qmk.f28987a;
                    mpoVar = new mpo(152.0f, 20.0f, new dil0((y9q0) null, (y9q0) null, new zgl0(), 6), 12.0f, 8.0f, 8.0f, 58.0f, g1t0.m(), 20.0f, g1t0.d(), 4.0f, false, true);
                }
                objP = mpoVar;
                fetVar.o0(objP);
            }
            mpo mpoVar2 = (mpo) objP;
            mm40 mm40VarQ = i120.Q(o7k0.e(o7k0.d(mm40Var, 1.0f), mpoVar2.f22187a), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.a(mpoVar2.b));
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP2;
            boolean z2 = (458752 & i2) == 131072;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new l3c0(function0, (byte) 19);
                fetVar.o0(objP3);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP3, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zcl zclVar5 = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarC, 8.0f, 0.0f, 8.0f, mpoVar2.f, 2);
            x5d x5dVarA = w5d.a(uc9.g, gqw0.m, fetVar, 6);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            a(s5x0.N(jm40Var, 0.0f, mpoVar2.d, 0.0f, mpoVar2.e, 5), str, mpoVar2.h, fetVar, i3 & 112);
            mm40 mm40VarE = o7k0.e(jm40Var, mpoVar2.g);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC2, shdVar4, 1021360023, a4xVar);
            while (itO.hasNext()) {
                b(new x7z(1.0f, true), (o6l0) itO.next(), mpoVar2, fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
            pz40 pz40VarF = androidx.compose.runtime.e.f(chl0Var, fetVar);
            qil0 qil0Var = mpoVar2.c;
            boolean z4 = (i2 & 3670016) == 1048576;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                function2 = function1;
                objP4 = new vpj0(function2, (byte) 3);
                fetVar.o0(objP4);
            } else {
                function2 = function1;
            }
            vfc.q(null, pz40VarF, qil0Var, (Function1) objP4, null, fetVar, 0, 17);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0((Object) mm40Var, (Object) npoVar, (Object) str, (Object) a4xVar, (Object) chl0Var, (Object) function0, (wdr) function2, i, (byte) 16);
        }
    }

    public static final void t(cp cpVar, int i) {
        ((v9m0) cpVar.u).c.setFirst(i == 1);
    }

    public static final void u(cp cpVar, int i, int i2) {
        ((v9m0) cpVar.u).c.setLast(i == i2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public static final p6m v(ctf0 ctf0Var, String str, boolean z) {
        if (!kotlin.text.c.x(str, ujn.h, false)) {
            if (str.length() == 0) {
                str = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str)) {
                    str = "";
                } else {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
                }
            }
        }
        return new p6m(new c280(str, R.drawable.ic_glyph_placeholder_player), z ? ctf0Var.b.a(R.string.win, Arrays.copyOf(new Object[0], 0)) : null);
    }

    public static final String w(String str, double d, double d2, hxu hxuVar) {
        str.getClass();
        hxuVar.getClass();
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        return cy7.e(pn40.p(str, !hxuVar.equals(hxu.h) ? hxuVar.f.b : d * d2));
    }

    public static final float z(long j, ma80 ma80Var) {
        ma80Var.getClass();
        int iOrdinal = ma80Var.ordinal();
        if (iOrdinal == 0) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (iOrdinal == 1) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        t9f.b();
        return 0.0f;
    }

    public ed40 x(md40 md40Var) {
        ByteBuffer byteBuffer = md40Var.g;
        byteBuffer.getClass();
        x0x.A(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return y(md40Var, byteBuffer);
    }

    public abstract ed40 y(md40 md40Var, ByteBuffer byteBuffer);
}
