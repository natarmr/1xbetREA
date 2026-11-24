package a;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.javax.sip.message.Response;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q7x {
    public static final gbn A(Function1 function1) {
        return new gbn(new jfa0((byte) 10), new iv60(3, (byte) 18), new rpa0(function1, (byte) 7), xk60.u);
    }

    public static tft0 B(tft0 tft0Var) {
        tft0Var.getClass();
        szj szjVarE = kud.e(tft0Var, false);
        if (szjVarE != null) {
            return szjVarE;
        }
        kzj0 kzj0VarC = C(tft0Var);
        return kzj0VarC != null ? kzj0VarC : tft0Var.k0(false);
    }

    public static final kzj0 C(tft0 tft0Var) {
        xmx xmxVar;
        iys0 iys0VarS = tft0Var.S();
        xmx xmxVar2 = iys0VarS instanceof xmx ? (xmx) iys0VarS : null;
        if (xmxVar2 != null) {
            LinkedHashSet<wsy> linkedHashSet = xmxVar2.b;
            ArrayList arrayList = new ArrayList(r3d.q(linkedHashSet, 10));
            boolean z = false;
            for (wsy wsyVarB : linkedHashSet) {
                if (e0t0.e(wsyVarB)) {
                    wsyVarB = B(wsyVarB.j0());
                    z = true;
                }
                arrayList.add(wsyVarB);
            }
            if (z) {
                wsy wsyVarB2 = xmxVar2.f41149a;
                if (wsyVarB2 == null) {
                    wsyVarB2 = null;
                } else if (e0t0.e(wsyVarB2)) {
                    wsyVarB2 = B(wsyVarB2.j0());
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                xmxVar = new xmx(linkedHashSet2);
                xmxVar.f41149a = wsyVarB2;
            } else {
                xmxVar = null;
            }
            if (xmxVar != null) {
                return xmxVar.a();
            }
        }
        return null;
    }

    public static final Object D(oyg0 oyg0Var, Object obj, String str) {
        Object objA;
        oyg0Var.getClass();
        vzg0 vzg0Var = oyg0Var.f26059a;
        return (vzg0Var == null || !((LinkedHashMap) vzg0Var.b.f38604a).containsKey(str) || (objA = vzg0Var.a(str)) == null) ? obj : objA;
    }

    public static int E(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }

    public static final void F(oyg0 oyg0Var, Object obj, String str) {
        oyg0Var.getClass();
        vzg0 vzg0Var = oyg0Var.f26059a;
        if (vzg0Var == null || Intrinsics.d(vzg0Var.a(str), obj)) {
            return;
        }
        vzg0Var.e(str, obj);
    }

    public static final void G(a3e a3eVar, pn3 pn3Var) {
        int i = pn3Var.c;
        if (i != -1 && i != a3eVar.i) {
            a3eVar.i = i;
        }
        int i2 = pn3Var.d;
        if (i2 != -1 && i2 != a3eVar.j) {
            a3eVar.j = i2;
        }
        int i3 = pn3Var.e;
        if (i3 != -1 && i3 != a3eVar.t) {
            a3eVar.t = i3;
        }
        int i4 = pn3Var.f;
        if (i4 != -1 && i4 != a3eVar.l) {
            a3eVar.l = i4;
        }
        int i5 = pn3Var.g;
        if (i5 != -1 && i5 != a3eVar.k) {
            a3eVar.k = i5;
        }
        int i6 = pn3Var.h;
        if (i6 != -1 && i6 != a3eVar.v) {
            a3eVar.v = i6;
        }
        float f = pn3Var.i;
        if (f != 0.5f && f != a3eVar.F) {
            a3eVar.F = f;
        }
        float f2 = pn3Var.j;
        if (f2 == 0.5f || f2 == a3eVar.E) {
            return;
        }
        a3eVar.E = f2;
    }

    public static int H(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static final w85 I(p95 p95Var) {
        Integer num = p95Var.f26591a;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        String str = p95Var.b;
        if (str == null) {
            jf4.k(null);
            return null;
        }
        String str2 = p95Var.c;
        if (str2 != null) {
            return new w85(iIntValue, str, str2);
        }
        jf4.k(null);
        return null;
    }

    public static final List J(z1e0 z1e0Var) {
        List<d2e0> list = z1e0Var.b;
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (d2e0 d2e0Var : list) {
            String str = d2e0Var.f5353a;
            String str2 = d2e0Var.b;
            a2e0 a2e0Var = (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? null : new a2e0(d2e0Var.f5353a, str2);
            if (a2e0Var != null) {
                arrayList.add(a2e0Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:12:0x001c A[RETURN] */
    public static final udl0 K(String str) {
        for (udl0 udl0Var : udl0.values()) {
            if (udl0Var.f35485a.equals(str)) {
                if (udl0Var == null) {
                    return udl0.CLASSIC;
                }
                return udl0Var;
            }
        }
        udl0Var = null;
        if (udl0Var == null) {
            return udl0.CLASSIC;
        }
        return udl0Var;
    }

    public static final kzj0 L(kzj0 kzj0Var, kzj0 kzj0Var2) {
        kzj0Var.getClass();
        kzj0Var2.getClass();
        return bdx.k0(kzj0Var) ? kzj0Var : new p(kzj0Var, kzj0Var2);
    }

    public static final void a(mm40 mm40Var, doh dohVar, Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(559129161);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(dohVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 138.0f), 1.0f);
            long jM139getBackgroundContent0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, jM139getBackgroundContent0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            boolean z = (i2 & 896) == 256;
            int i3 = i2 & 112;
            boolean z2 = z | (i3 == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new wqv(function1, dohVar, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            jm40 jm40Var = jm40.b;
            vdx.f(dw9.h(1.0f, s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), true), dohVar, 3, fetVar, i3 | 384);
            tke.B(s5x0.N(o7k0.p(jm40Var, 138.0f, 138.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), dohVar.b, fetVar, 0);
            if (dohVar.l) {
                fetVar.e0(1462445046);
                ghm0.g(s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), dohVar, fetVar, i3);
                fetVar.r(false);
            } else {
                fetVar.e0(1462597845);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var, (Object) dohVar, (Object) function1, i, (byte) 16);
        }
    }

    public static final void b(gyx gyxVar, x6f x6fVar, x6f x6fVar2, fet fetVar, int i) throws Throwable {
        float f;
        fet fetVar2 = fetVar;
        gyxVar.getClass();
        fetVar2.g0(-2121478202);
        x6f x6fVar3 = x6fVar2;
        int i2 = i | (fetVar2.g(gyxVar) ? 4 : 2) | (fetVar2.i(x6fVar) ? 32 : 16) | (fetVar2.i(x6fVar3) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new qdz();
                fetVar2.o0(objP);
            }
            qdz qdzVar = (qdz) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "ITEM_STATISTICS_BLOCK_TEST_TAG");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            Throwable th = null;
            ozb.z(new psv("", R.string.item_statistics), null, fetVar2, 0);
            boo0 boo0Var = gyxVar.f12153a;
            a4x a4xVar = gyxVar.b;
            cem0.g(null, boo0Var, x6fVar, fetVar2, (i2 << 3) & 896, 1);
            fetVar2.e0(-1924858718);
            int i3 = 0;
            for (Object obj : a4xVar) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th2 = th;
                    q3d.p();
                    throw th2;
                }
                tvv tvvVar = (tvv) obj;
                if (i3 != a4xVar.size() - 1) {
                    zcl zclVar = qmk.f28987a;
                    f = 4.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = 0.0f;
                }
                float f2 = f;
                fetVar2.b0(-1451101588, Long.valueOf(tvvVar.f34621a));
                fet fetVar3 = fetVar2;
                qdz qdzVar2 = qdzVar;
                ebc.B(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f2, 7), tvvVar, x6fVar3, qdzVar2, fetVar3, 3072 | (i2 & 896));
                fetVar2 = fetVar3;
                fetVar2.r(false);
                x6fVar3 = x6fVar2;
                qdzVar = qdzVar2;
                i3 = i4;
                a4xVar = a4xVar;
                th = th;
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(gyxVar, x6fVar, x6fVar2, i, (byte) 16);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(97367781);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(s5x0.L(o7k0.e(mm40VarD, 14.0f), xfn.a(fetVar).e, 0.0f, 2), vgg0.a(8.0f));
            vqm vqmVar = vqm.d;
            zq8.a(0, fetVar, xbc.c0(mm40VarJ, vbc.d0(vqmVar, fetVar, 6, 0)));
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(s5x0.L(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 1), 66.0f), vgg0.a(12.0f)), vbc.d0(vqmVar, fetVar, 6, 0)));
            dw9.x(lgb.J(s5x0.L(o7k0.e(o7k0.d(jm40Var, 1.0f), 14.0f), xfn.a(fetVar).e, 0.0f, 2), vgg0.a(8.0f)), vbc.d0(vqmVar, fetVar, 6, 0), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 20);
        }
    }

    public static final void d(mm40 mm40Var, eb10 eb10Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        fetVar.g0(73823858);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(eb10Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.e0(-2069695807);
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            jcb.l(mm40Var2, eb10Var.f7497a, false, null, fetVar2, i2 & 14, 12);
            fetVar2.r(false);
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((byte) 11, i, mm40Var2, (Object) eb10Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void e(mm40 mm40Var, lgs lgsVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        ?? r15;
        fet fetVar3 = fetVar;
        fetVar3.g0(-541458712);
        int i2 = i | 6 | (fetVar3.g(lgsVar) ? 32 : 16);
        if (fetVar3.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            String str = lgsVar.f20022a;
            y9q0 y9q0VarT = ibm0.t(g1t0.l(), fetVar3);
            long j = qmk.r;
            long j2 = qmk.p;
            v8q0.a(str, null, 0L, gfk0.b(j2, j), 0L, null, null, null, 0L, null, 0L, 2, false, 10, 0, null, y9q0VarT, fetVar, 0, 24960, 110582);
            fet fetVar4 = fetVar;
            if (lgsVar.b.length() > 0) {
                fetVar4.e0(1194843277);
                aad.e(lgsVar.b, jm40Var, ibm0.t(g1t0.g(), fetVar4), null, 2, false, 5, 0, null, gfk0.b(j2, qmk.q), fetVar4, 1597488, 424);
                r15 = 0;
                fetVar4.r(false);
            } else {
                r15 = 0;
                fetVar4.e0(1195255856);
                fetVar4.r(false);
            }
            String str2 = lgsVar.c;
            if (str2 == null) {
                fetVar4.e0(1195297209);
                fetVar4.r(r15);
            } else {
                fetVar4.e0(1195297210);
                dj8.f(r15, fetVar4, null, str2);
                fetVar4.r(r15);
            }
            fetVar4.r(true);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((byte) 25, i, mm40Var2, (Object) lgsVar);
        }
    }

    public static final void f(int i, qw3 qw3Var, fet fetVar, a4x a4xVar, xcz xczVar, mm40 mm40Var, lh80 lh80Var, Function2 function2) {
        int i2;
        a4x a4xVar2;
        a4xVar.getClass();
        xczVar.getClass();
        function2.getClass();
        fetVar.g0(2101063327);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(lh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(qw3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 188.0f), 1.0f);
            boolean z = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                a4xVar2 = a4xVar;
                objP = new qv40(a4xVar2, function2, b);
                fetVar.o0(objP);
            } else {
                a4xVar2 = a4xVar;
            }
            b8k0.f(mm40VarD, xczVar, lh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, ((i2 >> 3) & 1008) | (i2 & 57344), Response.NOT_ACCEPTABLE_HERE);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) a4xVar2, (Object) xczVar, (Object) lh80Var, (Object) qw3Var, (Object) function2, i, (byte) 25);
        }
    }

    public static final void g(mm40 mm40Var, z77 z77Var, Function1 function1, fet fetVar, int i) {
        Object l57Var;
        Boolean bool;
        int i2;
        int i3;
        xcz xczVar;
        z77Var.getClass();
        function1.getClass();
        fetVar.g0(1425512174);
        int i4 = i | (fetVar.g(z77Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar);
            wom womVarF = mom.f(fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            int i5 = i4 & 896;
            boolean z = i5 == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new xv50(function1, (byte) 11);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z2 = i5 == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                fetVar.o0(function1);
                objP3 = function1;
            }
            Function1 function2 = (Function1) objP3;
            Boolean boolValueOf = Boolean.valueOf(z77Var.e());
            int i6 = i4 & 112;
            boolean zI = (i6 == 32) | fetVar.i(w2dVarW0) | fetVar.g(xczVarA) | (i5 == 256);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj) {
                bool = boolValueOf;
                i2 = i6;
                i3 = i5;
                l57Var = new l57(z77Var, w2dVarW0, xczVarA, function1, null, (byte) 1);
                fetVar.o0(l57Var);
            } else {
                bool = boolValueOf;
                i2 = i6;
                l57Var = objP4;
                i3 = i5;
            }
            m0x0.t(fetVar, bool, (Function2) l57Var);
            Boolean boolValueOf2 = Boolean.valueOf(z77Var.g());
            boolean zI2 = (i2 == 32) | fetVar.i(w2dVarW0) | fetVar.i(vneVar) | fetVar.g(xczVarA) | (i3 == 256);
            Object objP5 = fetVar.P();
            if (zI2 || objP5 == obj) {
                Object m57Var = new m57(z77Var, w2dVarW0, vneVar, function1, xczVarA, null, (byte) 1);
                xczVar = xczVarA;
                fetVar.o0(m57Var);
                objP5 = m57Var;
            } else {
                xczVar = xczVarA;
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) objP5);
            boolean zG = fetVar.g(w2dVarW0);
            Object objP6 = fetVar.P();
            if (zG || objP6 == obj) {
                objP6 = jgk0.b(new ok7(w2dVarW0, (byte) 3));
                fetVar.o0(objP6);
            }
            v2n0.c(knm0.r(mm40Var), w2dVarW0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0.0f, u1c.M(395191181, new rbd(w2dVarW0, z77Var, function2, (l7m0) objP6, (byte) 1), fetVar), null, u1c.M(-938228824, new us4(z77Var, womVarF, w2dVarW0, function0, function2, xczVar, function1), fetVar), fetVar, 1600576, 32);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j57(mm40Var, z77Var, function1, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fa  */
    public static final void h(bb00 bb00Var, Function1 function1, fet fetVar, int i) {
        byte b;
        cl5 cl5Var;
        boolean z;
        Object objP;
        Function1 function2;
        Function1 function3 = function1;
        fet fetVar2 = fetVar;
        bb00Var.getClass();
        int i2 = bb00Var.c;
        function3.getClass();
        fetVar2.g0(1133046498);
        int i3 = i | (fetVar2.g(bb00Var) ? 4 : 2) | (fetVar2.i(function3) ? 32 : 16);
        byte b2 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP2 == cl5Var2) {
                pz40 pz40Var = s6t0.f31722a;
                imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(bb00Var.b, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
                fetVar2.o0(immVar);
                objP2 = immVar;
            }
            imm immVar2 = (imm) objP2;
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objP3 = fetVar2.P();
            if (z2 || objP3 == cl5Var2) {
                objP3 = new cv70(bb00Var, b2);
                fetVar2.o0(objP3);
            }
            kwj kwjVarB = zk80.b(i2, (Function0) objP3, fetVar2, 0, 2);
            Integer numValueOf = Integer.valueOf(i2);
            boolean zG = (i4 == 4) | fetVar2.g(kwjVarB);
            Object objP4 = fetVar2.P();
            yje yjeVar = null;
            if (zG || objP4 == cl5Var2) {
                objP4 = new dv70(kwjVarB, bb00Var, yjeVar, b2);
                fetVar2.o0(objP4);
            }
            m0x0.t(fetVar2, numValueOf, (Function2) objP4);
            Integer numValueOf2 = Integer.valueOf(kwjVarB.q());
            int i5 = i3 & 112;
            boolean zG2 = (i5 == 32) | fetVar2.g(kwjVarB);
            Object objP5 = fetVar2.P();
            byte b3 = 3;
            if (zG2 || objP5 == cl5Var2) {
                objP5 = new fc30(function3, kwjVarB, yjeVar, b3);
                fetVar2.o0(objP5);
            }
            m0x0.t(fetVar2, numValueOf2, (Function2) objP5);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(knm0.r(yyw.X(jm40Var, null, fetVar2, 1)), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean z3 = i5 == 32;
            Object objP6 = fetVar2.P();
            if (z3 || objP6 == cl5Var2) {
                objP6 = new ma70(function3, (byte) 9);
                fetVar2.o0(objP6);
            }
            hlm.c(mm40VarD, immVar2, null, (Function0) objP6, null, null, null, null, null, null, null, null, fetVar2, 54, 0, 4084);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, qmk.a(fetVar2).f, 12.0f, qmk.a(fetVar2).f, 0.0f, 8);
            a4x a4xVar = bb00Var.d;
            boolean z4 = bb00Var.g;
            boolean zG3 = fetVar2.g(kwjVarB);
            Object objP7 = fetVar2.P();
            if (zG3) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP7 == cl5Var) {
                }
                Function0 function0 = (Function0) objP7;
                if (i5 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                if (!z || objP == cl5Var) {
                    function2 = function1;
                    objP = new i160(function2, (byte) 18);
                    fetVar2.o0(objP);
                } else {
                    function2 = function1;
                }
                ibc.o(mm40VarN, a4xVar, gxh0.f12078a, z4, function0, (Function1) objP, fetVar, 384, 0);
                mbc.o(zfi0.f44303a, o7k0.d(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f), false, fetVar, 6, 4);
                b = 1;
                function3 = function1;
                q5x.e(kwjVarB, dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(1465213003, new ec30(bb00Var, function2, (byte) 3), fetVar), fetVar, 0, 24576, 16380);
                fetVar2 = fetVar;
                fetVar2.r(true);
            }
            objP7 = new w48(kwjVarB, (byte) 5);
            fetVar2.o0(objP7);
            Function0 function4 = (Function0) objP7;
            if (i5 == 32) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar2.P();
            if (z) {
                function2 = function1;
                objP = new i160(function2, (byte) 18);
                fetVar2.o0(objP);
            } else {
                function2 = function1;
                objP = new i160(function2, (byte) 18);
                fetVar2.o0(objP);
            }
            ibc.o(mm40VarN, a4xVar, gxh0.f12078a, z4, function4, (Function1) objP, fetVar, 384, 0);
            mbc.o(zfi0.f44303a, o7k0.d(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f), false, fetVar, 6, 4);
            b = 1;
            function3 = function1;
            q5x.e(kwjVarB, dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(1465213003, new ec30(bb00Var, function2, (byte) 3), fetVar), fetVar, 0, 24576, 16380);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oa00(bb00Var, function3, i, b);
        }
    }

    public static final void i(mm40 mm40Var, rr90 rr90Var, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i) {
        rr90Var.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        fetVar.g0(-814618449);
        int i2 = i | (fetVar.g(rr90Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ev80((byte) 26);
                fetVar.o0(objP);
            }
            ay3.f(rr90Var, mm40Var, null, null, null, (Function1) objP, u1c.M(-1895733828, new n82(function1, function0, function2, (byte) 22), fetVar), fetVar, ((i2 >> 3) & 14) | 1769520, 28);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) mm40Var, (Object) rr90Var, (Object) function1, (Object) function0, (Object) function2, i, (byte) 16);
        }
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        long jM170getSecondary600d7_KjU;
        function0.getClass();
        fetVar.g0(2124479827);
        int i2 = i | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                fetVar.e0(1515653370);
                jM170getSecondary600d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
            } else {
                fetVar.e0(1515654366);
                jM170getSecondary600d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary60();
            }
            fetVar.r(false);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            dww.c(a8k0.F(R.drawable.ic_glyph_pin, 0, fetVar), null, y860.W(o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), 20.0f), null, null, false, null, function0, 28), jM170getSecondary600d7_KjU, fetVar, 56, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5a(mm40Var2, z, function0, i, (byte) 4);
        }
    }

    public static final void k(mm40 mm40Var, ArrayList arrayList, Function2 function2, fet fetVar, int i) {
        int i2;
        function2.getClass();
        fetVar.g0(1393013583);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(arrayList) : fetVar.i(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = Boolean.valueOf(arrayList.size() == 1);
                fetVar.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new t330((byte) 8);
                fetVar.o0(objP2);
            }
            nnw0.g(mm40Var, null, false, u1c.M(-527135195, new wv50(zBooleanValue, xczVarA, idx.P(xczVarA, (xdr) objP2, fetVar, 24576, 14), arrayList, function2, (byte) 5), fetVar), fetVar, (i3 & 14) | 3072, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, arrayList, function2, i, (byte) 26);
        }
    }

    public static final void l(mm40 mm40Var, d8f0 d8f0Var, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        d8f0Var.getClass();
        function0.getClass();
        fetVar.g0(-876563929);
        int i2 = i | 6 | (fetVar.g(d8f0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            jiq0.y(jm40Var, d8f0Var.b, function0, null, null, fetVar, i2 & 910, 24);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, d8f0Var, function0, i, (byte) 16);
        }
    }

    public static final void m(mm40 mm40Var, final gdg0 gdg0Var, final vcg0 vcg0Var, fet fetVar, final int i, final int i2) {
        int i3;
        gdg0Var.getClass();
        fetVar.g0(-1235811748);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        int i5 = i3 | (fetVar.g(gdg0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 |= fetVar.e(vcg0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= fetVar.g(null) ? 2048 : 1024;
        }
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            r7x.j(mm40Var, u1c.M(1333924172, new csw(gdg0Var, n7x.K(vcg0Var)), fetVar), nnw0.h, fetVar, (i5 & 14) | 48);
        } else {
            fetVar.X();
        }
        final mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(gdg0Var, vcg0Var, i, i2) { // from class: a.fdg0
                public final /* synthetic */ vcg0 b;
                public final /* synthetic */ short c;
                public final /* synthetic */ boolean d;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.b = vcg0Var;
                    this.c = i;
                    this.d = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q7x.m(this.f9357a, null, this.b, (fet) obj, x8x.L(this.c | 1), this.d ? 1 : 0);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void n(mm40 mm40Var, bbn bbnVar, float f, ezj ezjVar, gy40 gy40Var, Function2 function2, Function0 function0, Function0 function1, Function0 function3, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        Function0 function4;
        mm40 mm40Var3;
        ezjVar.getClass();
        gy40Var.getClass();
        function2.getClass();
        function0.getClass();
        function1.getClass();
        function3.getClass();
        fetVar.g0(622035895);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(bbnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? fetVar.g(ezjVar) : fetVar.i(ezjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.g(gy40Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function4 = function0;
            i3 |= fetVar.i(function4) ? 1048576 : 524288;
        } else {
            function4 = function0;
        }
        if ((12582912 & i) == 0) {
            i3 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= fetVar.i(function3) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            mm40Var3 = i4 != 0 ? jm40.b : mm40Var2;
            if (bbnVar instanceof zan) {
                fetVar.e0(-1711985872);
                mm40 mm40VarD = o7k0.d(mm40Var3, 1.0f);
                zan zanVar = (zan) bbnVar;
                i4 i4Var = zanVar.f44078a;
                String str = zanVar.b;
                if (str == null) {
                    str = "";
                }
                o(mm40VarD, i4Var, new hjm(str, null, null, null, null, null, false, zanVar.c, vro0.f37910a, false, zanVar.d, null, 2614), f, ezjVar, gy40Var, function2, function4, function1, function3, fetVar, (i3 << 3) & 2147482624);
                fetVar.r(false);
            } else {
                if (!bbnVar.equals(abn.f587a)) {
                    throw b1j.f(776056454, fetVar, false);
                }
                fetVar.e0(-1710941048);
                q(o7k0.d(mm40Var3, 1.0f), f, fetVar, (i3 >> 3) & 112);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vdz(mm40Var3, bbnVar, f, ezjVar, gy40Var, function2, function0, function1, function3, i, i2);
        }
    }

    public static final void o(mm40 mm40Var, i4 i4Var, hjm hjmVar, float f, ezj ezjVar, gy40 gy40Var, Function2 function2, Function0 function0, Function0 function1, Function0 function3, fet fetVar, int i) {
        int i2;
        Function0 function4;
        Function0 function5;
        fet fetVar2 = fetVar;
        fetVar2.g0(-616164298);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(i4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(hjmVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? fetVar2.g(ezjVar) : fetVar2.i(ezjVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.g(gy40Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar2.i(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            function4 = function1;
            i2 |= fetVar2.i(function4) ? 67108864 : 33554432;
        } else {
            function4 = function1;
        }
        if ((805306368 & i) == 0) {
            function5 = function3;
            i2 |= fetVar2.i(function5) ? 536870912 : 268435456;
        } else {
            function5 = function3;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (306783379 & i2) != 306783378)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            fetVar2.e0(-1617677676);
            int i4 = i3 >> 12;
            nkb.h(null, hjmVar, kjm.f18392a, function0, function4, function5, fetVar2, (i4 & 7168) | 384 | (i4 & 57344) | (i4 & 458752), 1);
            fetVar2 = fetVar2;
            fetVar2.r(false);
            int i5 = i3 >> 3;
            v3c.r(null, new cjm(i4Var, xim.d), f, gy40Var, ezjVar, function2, fetVar2, (i5 & 896) | ((i3 >> 6) & 7168) | (i3 & 57344) | (i5 & 458752), 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ymh0(mm40Var, i4Var, hjmVar, f, ezjVar, gy40Var, function2, function0, function1, function3, i, (byte) 0);
        }
    }

    public static final void p(Function1 function1, hzi0 hzi0Var, mm40 mm40Var, fet fetVar, int i) {
        function1.getClass();
        hzi0Var.getClass();
        fetVar.g0(888884767);
        int i2 = i | (fetVar.i(function1) ? 4 : 2) | (fetVar.g(hzi0Var) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = gzi0.f12180a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wvi0((byte) 7);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new ezi0(hzi0Var, function1);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, null, function2, null, (Function1) objP3, fetVar, 390, 10);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(function1, (hej0) hzi0Var, mm40Var, i, (byte) 0);
        }
    }

    public static final void q(mm40 mm40Var, float f, fet fetVar, int i) {
        int i2;
        fetVar.g0(1405307041);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            nkb.h(null, new ijm(), kjm.f18392a, null, null, null, fetVar, 384, 57);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            qw3 qw3Var = new qw3(xmh0.b, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new w0h0((byte) 28);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 805330950, 490);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dql(mm40Var, f, i, (byte) 3);
        }
    }

    public static final f7k0 r(int i, int i2) {
        rmk.a(i);
        rmk rmkVar = new rmk(i);
        rmk.a(i2);
        return new f7k0(rmkVar, new rmk(i2));
    }

    public static final void s(long j, boolean z, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-1225695077);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.c(j);
                fetVar.o0(objP);
            }
            egk0 egk0Var = (egk0) objP;
            yhh.a(j, false, 0L, null, u1c.M(1000643388, new qvv(egk0Var, b), fetVar), fetVar, (i2 & 14) | 24624, 12);
            function1.invoke(Boolean.valueOf(egk0Var.l() > 0));
            long jL = egk0Var.l();
            String str = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jL / 60), Long.valueOf(jL % 60)}, 2));
            qrq qrqVar = j1t0.b;
            long j2 = qmk.r;
            v8q0.a(str, null, (z || egk0Var.l() > 0) ? StaticColors.INSTANCE.m123getWhite0d7_KjU() : StaticColors.INSTANCE.m129getWhite400d7_KjU(), null, j2, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, j2, null, qrqVar, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131050);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d5m(i, j, function1, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object t(hzb0 hzb0Var, Function0 function0, yje yjeVar) {
        fzb0 fzb0Var;
        if (yjeVar instanceof fzb0) {
            fzb0Var = (fzb0) yjeVar;
            int i = fzb0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fzb0Var.k = i - Integer.MIN_VALUE;
            } else {
                fzb0Var = new fzb0(yjeVar);
            }
        } else {
            fzb0Var = new fzb0(yjeVar);
        }
        Object obj = fzb0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = fzb0Var.k;
        byte b = 1;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                if (fzb0Var.getContext().get(gqw0.o1) != hzb0Var) {
                    jf4.n("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                fzb0Var.i = function0;
                fzb0Var.k = 1;
                n5a n5aVar = new n5a(1, pnx.b(fzb0Var));
                n5aVar.r();
                hzb0Var.c(new azf(n5aVar, b));
                if (n5aVar.p() == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function0 = fzb0Var.i;
                z1x.P(obj);
            }
            function0.invoke();
            return Unit.f46060a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    public static final float u(String str) {
        String strR = kotlin.text.c.r(str, Separators.PERCENT, "", false);
        if (StringsKt.O(strR, Separators.COLON, false)) {
            Float fJ = kotlin.text.b.j((String) CollectionsKt.U(StringsKt__StringsKt.split$default(strR, new String[]{Separators.COLON}, false, 0, 6, null)));
            if (fJ != null) {
                return fJ.floatValue();
            }
            return 0.0f;
        }
        Float fJ2 = kotlin.text.b.j(strR);
        if (fJ2 != null) {
            return fJ2.floatValue();
        }
        return 0.0f;
    }

    public static float v(float f, float f2, float f3, float f4) {
        double d = f - f3;
        double d2 = f2 - f4;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public static float w(int i, int i2, int i3, int i4) {
        double d = i - i3;
        double d2 = i2 - i4;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public static final Rect x(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static ugd y(rs20 rs20Var, long j, long j2, y9q0 y9q0Var, y9q0 y9q0Var2) {
        return new ugd(1410954898, true, new ee40(rs20Var, j, j2, y9q0Var, y9q0Var2, jm40.b, (byte) 0));
    }

    public static final int z(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }
}
