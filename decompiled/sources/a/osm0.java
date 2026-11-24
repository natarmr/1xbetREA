package a;

import android.os.Build;
import android.text.Spanned;
import android.util.Range;
import android.view.View;
import android.webkit.WebView;
import com.huawei.hms.framework.common.BundleUtil;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class osm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static nhf0 f25789a;

    public static final void a(mm40 mm40Var, wdp0 wdp0Var, ugd ugdVar, fet fetVar) {
        zcl zclVar = qmk.f28987a;
        thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 0);
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
        jpm0.o(fetVar, thg0VarA, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        ugdVar.j(zhg0.f44392a, wdp0Var, fetVar, 390);
        fetVar.r(true);
    }

    public static final void b(int i, fet fetVar) {
        fetVar.g0(1095413164);
        if (fetVar.U(i & 1, i != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).d, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 12.0f), 152.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(o7k0.d(o7k0.e(jm40Var, 224.0f), 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13)), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 32.0f, 0.0f, 0.0f, 13), 12.0f), 152.0f)), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(o7k0.d(o7k0.e(jm40Var, 132.0f), 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zgp0(i, (byte) 17);
        }
    }

    public static final void c(mm40 mm40Var, hyl hylVar, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-1880776323);
        byte b = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(hylVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xar0(function1, b);
                fetVar.o0(objP);
            }
            ebc.r(mm40Var, hylVar, null, (Function1) objP, null, fetVar, i2 & 126, 44);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, hylVar, function1, i, (byte) 27);
        }
    }

    public static final void d(int i, int i2, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(291209225);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            pm80 pm80VarF = a8k0.F(i, (i3 >> 3) & 14, fetVar);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            j0x.b(pm80VarF, null, o7k0.d(o7k0.e(jm40Var, 54.0f), 1.0f), null, gqw0.h1, 0.0f, null, fetVar2, 24632, 104);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, i2, (byte) 25);
        }
    }

    public static final long e(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = ils0.c;
        return jFloatToRawIntBits;
    }

    public static final void f(lc00 lc00Var, m9s m9sVar, ctf0 ctf0Var) {
        String str;
        String str2;
        m9sVar.getClass();
        ctf0Var.getClass();
        qqs qqsVar = m9sVar.h;
        List list = qqsVar.c;
        if (qqsVar.l.length() > 0) {
            return;
        }
        lc00Var.add(new psv("ASSAULT_SQUAD_HEADER_KEY", R.string.round_statistics));
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ctf0Var.b.a(R.string.synthetic_round_v2, Arrays.copyOf(new Object[]{((ve90) it.next()).f37273a}, 1)));
        }
        lc00Var.add(new r0o0(arrayList));
        String str3 = m9sVar.i;
        String str4 = (String) CollectionsKt.U(m9sVar.m);
        str4.getClass();
        String str5 = "";
        if (kotlin.text.c.x(str4, ujn.h, false)) {
            str = str4;
        } else {
            if (str4.length() != 0) {
                List list2 = u0d.f34849a;
                if (!u0d.c(str4)) {
                    str4 = String.format(Locale.ENGLISH, StringsKt.O(str4, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str4}, 2));
                    str = str4;
                }
            }
            str = "";
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ve90) it2.next()).b);
        }
        lc00Var.add(new t0o0(R.drawable.cybergame_synthetic_assault_squad_first_bg, "ASSAULT_SQUAD_FIRST_TEAM_KEY", str3, str, arrayList2));
        String str6 = m9sVar.j;
        String str7 = (String) CollectionsKt.U(m9sVar.n);
        str7.getClass();
        if (kotlin.text.c.x(str7, ujn.h, false)) {
            str2 = str7;
        } else {
            if (str7.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str7)) {
                    str5 = String.format(Locale.ENGLISH, StringsKt.O(str7, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str7}, 2));
                }
            }
            str2 = str5;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((ve90) it3.next()).c);
        }
        lc00Var.add(new t0o0(R.drawable.cybergame_synthetic_assault_squad_second_bg, "ASSAULT_SQUAD_SECOND_TEAM_KEY", str6, str2, arrayList3));
    }

    public static final Object g(Object obj, boolean z) {
        mfy mfyVar;
        obj.getClass();
        if (z) {
            obj = (kgy) obj;
            if ((obj instanceof jgy) && (mfyVar = ((jgy) obj).i) != null) {
                String strReplace = mfyVar.d.f32934a.f34663a.replace('.', '/');
                if (strReplace != null) {
                    return new igy(strReplace);
                }
                rey.a(7);
                throw null;
            }
        }
        return obj;
    }

    public static InvocationHandler h() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                ohq.p(e);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.lhf0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final int i(int i, String str) {
        ?? r5;
        ?? r6;
        int spanEnd;
        qsn qsnVarK = k();
        Integer num = null;
        if (qsnVarK != null) {
            z1x.y("Not initialized yet", qsnVarK.c() == 1);
            z1x.x(str, "charSequence cannot be null");
            ?? r4 = (lhf0) qsnVarK.e.b;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                v0t0[] v0t0VarArr = (v0t0[]) spanned.getSpans(i, i + 1, v0t0.class);
                if (v0t0VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(v0t0VarArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((ctn) r4.E(r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new ctn(i))).c;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((ctn) r4.E(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new ctn(i))).c;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
                r5 = r6;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    public static final int j(int i, String str) {
        qsn qsnVarK = k();
        Integer num = null;
        if (qsnVarK != null) {
            Integer numValueOf = Integer.valueOf(qsnVarK.b(Math.max(0, i - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final qsn k() {
        if (!qsn.d()) {
            return null;
        }
        qsn qsnVarA = qsn.a();
        if (qsnVarA.c() == 1) {
            return qsnVarA;
        }
        return null;
    }

    public static final boolean l(ivo0 ivo0Var) {
        ivo0Var.getClass();
        ivo0Var.getClass();
        return !(ivo0Var.f15455a.length() == 0 && ivo0Var.b == 0.0d);
    }

    public static final void m(View view, jie0 jie0Var, pz40 pz40Var, boolean z, float f) {
        tly tlyVar = new tly(f, jie0Var.f16571a, z && view.hasWindowFocus());
        if (Intrinsics.d(pz40Var.getValue(), tlyVar)) {
            return;
        }
        pz40Var.setValue(tlyVar);
    }

    public static final void n(View view, jie0 jie0Var, pz40 pz40Var) {
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(view);
        if (xiv0VarA == null) {
            return;
        }
        uiv0 uiv0Var = xiv0VarA.f40966a;
        boolean zU = uiv0Var.u(8);
        float f = uiv0Var.i(8).d;
        if (zU && f > 0.0f) {
            jie0Var.f16571a = f;
        }
        m(view, jie0Var, pz40Var, zU, f);
    }

    public static final void o(n0a n0aVar, rrd rrdVar, wsf0 wsf0Var) {
        kk9 kk9VarS;
        nhf0 nhf0Var = f25789a;
        if (nhf0Var == null) {
            jf4.n("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        String strE = n0aVar.e();
        strE.getClass();
        s0a s0aVarB = ((j2a) nhf0Var.f23530a).b(strE);
        zo zoVar = new zo(s0aVarB.h(), ky9.f19096a);
        c5k c5kVar = c5k.c;
        t3a t3aVar = new t3a(s0aVarB, null, zoVar, null, c5kVar, c5kVar, (wy9) nhf0Var.b, (trm0) nhf0Var.d, (ipt0) nhf0Var.c);
        wju0 wju0Var = (wju0) rrdVar.b;
        synchronized (t3aVar.l) {
            t3aVar.h = wju0Var;
        }
        List list = (List) rrdVar.c;
        synchronized (t3aVar.l) {
            t3aVar.i = list;
        }
        synchronized (t3aVar.l) {
        }
        Range range = (Range) rrdVar.d;
        synchronized (t3aVar.l) {
            t3aVar.j = range;
        }
        List list2 = (List) rrdVar.g;
        l8x.U("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list2 + ", featureGroup = " + wsf0Var);
        synchronized (t3aVar.l) {
            ap apVar = t3aVar.f33257a;
            hy9 hy9Var = t3aVar.k;
            apVar.f(hy9Var);
            ap apVar2 = t3aVar.b;
            if (apVar2 != null) {
                apVar2.f(hy9Var);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(t3aVar.e);
            linkedHashSet.addAll(list2);
            HashMap mapJ = t3a.j(linkedHashSet, wsf0Var);
            try {
                try {
                    kk9VarS = t3aVar.s(linkedHashSet, t3aVar.b != null);
                    t3a.B(mapJ);
                } catch (IllegalArgumentException e) {
                    throw new n3a(e);
                }
            } catch (Throwable th) {
                t3a.B(mapJ);
                throw th;
            }
        }
        kk9VarS.getClass();
    }

    public static final anq0 p(l9s l9sVar, long j) {
        vzj0 vzj0Var;
        znq0 znq0Var;
        Object next;
        znq0 znq0VarA;
        l9sVar.getClass();
        long j2 = j / 1000;
        long jU = l9sVar.u() - j2;
        long j3 = jU < 0 ? 0L : jU;
        if (l9sVar instanceof k9s) {
            vzj0Var = ((k9s) l9sVar).Z;
        } else {
            if (!(l9sVar instanceof j9s)) {
                t9f.b();
                return null;
            }
            vzj0Var = null;
        }
        if (vzj0Var == null || (znq0VarA = vzj0Var.a()) == null) {
            znq0Var = null;
        } else {
            long j4 = znq0VarA.f44687a - j2;
            znq0Var = new znq0(j4 >= 0 ? j4 : 0L);
        }
        List listF = l9sVar.F();
        rem0 rem0Var = rem0.c;
        Iterator it = listF.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((sem0) next).f32081a != rem0Var);
        sem0 sem0Var = (sem0) next;
        String str = sem0Var != null ? sem0Var.b : null;
        if (str == null) {
            str = "";
        }
        return new anq0(l9sVar.I(), l9sVar.J(), str, 0L, l9sVar.R(), l9sVar.u(), j3, znq0Var, l9sVar.e() ? l9sVar.x() : true, l9sVar.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List q(ctf0 ctf0Var, List list) {
        list.getClass();
        ctf0Var.getClass();
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        List listD0 = CollectionsKt.D0(list, 3);
        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
        int i = 0;
        for (Object obj : listD0) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            wwl0 wwl0Var = (wwl0) obj;
            v12 v12VarI0 = unh0.i0(i, listD0);
            wwl0Var.getClass();
            String str = wwl0Var.c;
            ArrayList arrayList2 = new ArrayList();
            String str2 = wwl0Var.e;
            String str3 = wwl0Var.d;
            if (str.length() > 0) {
                arrayList2.add(ctf0Var.b.a(R.string.stadium_capacity_title_v2, Arrays.copyOf(new Object[]{str}, 1)));
            }
            if (str3.length() > 0) {
                arrayList2.add(ctf0Var.b.a(R.string.stadium_open_title_v2, Arrays.copyOf(new Object[]{str3}, 1)));
            }
            if (str2.length() > 0) {
                arrayList2.add(ctf0Var.b.a(R.string.stadium_architector_title_v2, Arrays.copyOf(new Object[]{str2}, 1)));
            }
            String str4 = wwl0Var.f39890a + BundleUtil.UNDERLINE_TAG + o6u0.class.getSimpleName();
            long j = wwl0Var.f39890a;
            String str5 = wwl0Var.b;
            pz40 pz40Var = s6t0.f31722a;
            b2l0 b2l0Var = new b2l0(str5, s6t0.b().f33626a.getTextPrimary());
            t1l0 t1l0Var = new t1l0(p1l0.SPORT_ICON, null, null, Integer.valueOf(R.drawable.ic_glyph_map_pin), new y3d(s6t0.b().f33626a.getSecondary()), null, 230);
            zcl zclVar = qmk.f28987a;
            arrayList.add(new o6u0(str4, j, str5, new zrm((f2l0) b2l0Var, (u1l0) t1l0Var, (g3l0) (0 == true ? 1 : 0), d4d.BACKGROUND_CONTENT, (n3l0) new l3l0(16.0f), 36), arrayList2, v12VarI0));
            i = i2;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        String strA = ctf0Var.b.a(R.string.venues, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var2 = s6t0.f31722a;
        lc00VarB.add(new eok0(new hjm(strA, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186), null, i9h0.f14386a));
        lc00VarB.addAll(arrayList);
        ar40 ar40Var = ar40.f1327a;
        lc00VarB.add(m2x.t(ctf0Var, R.string.all_venues, ar40Var, ar40Var));
        return kotlin.collections.a.a(lc00VarB);
    }

    public static jlw0 r(rew0 rew0Var, h0q0 h0q0Var, ArrayList arrayList, boolean z) {
        jlw0 jlw0VarA;
        pvm0.E("reduce", arrayList, 1);
        pvm0.F(2, "reduce", arrayList);
        jlw0 jlw0VarS = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
        if (!(jlw0VarS instanceof giw0)) {
            jf4.o("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            jlw0VarA = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
            if (jlw0VarA instanceof kgw0) {
                jf4.o("Failed to parse initial value");
                return null;
            }
        } else {
            if (rew0Var.k() == 0) {
                jf4.n("Empty array with no initial value error");
                return null;
            }
            jlw0VarA = null;
        }
        giw0 giw0Var = (giw0) jlw0VarS;
        int iK = rew0Var.k();
        int i = z ? 0 : iK - 1;
        int i2 = z ? iK - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (jlw0VarA == null) {
            jlw0VarA = rew0Var.l(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (rew0Var.o(i)) {
                jlw0VarA = giw0Var.a(h0q0Var, Arrays.asList(jlw0VarA, rew0Var.l(i), new ihw0(Double.valueOf(i)), rew0Var));
                if (jlw0VarA instanceof kgw0) {
                    jf4.n("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return jlw0VarA;
    }

    public static rew0 s(rew0 rew0Var, h0q0 h0q0Var, xkw0 xkw0Var, Boolean bool, Boolean bool2) {
        rew0 rew0Var2 = new rew0();
        Iterator itJ = rew0Var.j();
        while (itJ.hasNext()) {
            int iIntValue = ((Integer) itJ.next()).intValue();
            if (rew0Var.o(iIntValue)) {
                jlw0 jlw0VarA = xkw0Var.a(h0q0Var, Arrays.asList(rew0Var.l(iIntValue), new ihw0(Double.valueOf(iIntValue)), rew0Var));
                if (jlw0VarA.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || jlw0VarA.zze().equals(bool2)) {
                    rew0Var2.m(iIntValue, jlw0VarA);
                }
            }
        }
        return rew0Var2;
    }
}
