package a;

import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.DisplayMetrics;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class azw {
    public static final void A(diu0 diu0Var, kd30 kd30Var, glz glzVar) {
        kd30Var.getClass();
        glzVar.getClass();
        wzg0 wzg0Var = (wzg0) diu0Var.u("androidx.lifecycle.savedstate.vm.tag");
        if (wzg0Var == null || wzg0Var.c) {
            return;
        }
        wzg0Var.a(kd30Var, glzVar);
        lkz lkzVar = glzVar.i;
        if (lkzVar == lkz.b || lkzVar.compareTo(lkz.d) >= 0) {
            kd30Var.V();
        } else {
            glzVar.a(new lz2((Object) glzVar, (Object) kd30Var, (byte) 4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object B(a.inn0 r7, a.zw5 r8) {
        /*
            boolean r0 = r8 instanceof a.z4i0
            if (r0 == 0) goto L13
            r0 = r8
            a.z4i0 r0 = (a.z4i0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.z4i0 r0 = new a.z4i0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            a.inn0 r7 = r0.i
            a.z1x.P(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L30:
            a.z1x.P(r8)
        L33:
            a.xoa0 r8 = a.xoa0.b
            r0.i = r7
            r0.k = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            a.woa0 r8 = (a.woa0) r8
            java.util.List r2 = r8.f39485a
            int r4 = r2.size()
            r5 = 0
        L49:
            if (r5 >= r4) goto L5b
            java.lang.Object r6 = r2.get(r5)
            a.dpa0 r6 = (a.dpa0) r6
            boolean r6 = a.x2x.I(r6)
            if (r6 != 0) goto L58
            goto L33
        L58:
            int r5 = r5 + 1
            goto L49
        L5b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.azw.B(a.inn0, a.zw5):java.lang.Object");
    }

    public static final lc00 C(List list, vvd0 vvd0Var, m9s m9sVar) {
        vvd0Var.getClass();
        g0e0 g0e0Var = vvd0Var.d;
        bvd0 bvd0Var = vvd0Var.f38093a;
        lc00 lc00VarB = kotlin.collections.a.b();
        ArrayList<ryd0> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            t9m0 t9m0Var = (t9m0) it.next();
            c0o c0oVar = ryd0.c;
            y2 y2VarH = ohs0.h(c0oVar, c0oVar);
            while (y2VarH.hasNext()) {
                Object next = y2VarH.next();
                if (((ryd0) next).f31310a == t9m0Var) {
                    obj = next;
                    break;
                }
            }
            ryd0 ryd0Var = (ryd0) obj;
            if (ryd0Var != null) {
                arrayList.add(ryd0Var);
            }
        }
        for (ryd0 ryd0Var2 : arrayList) {
            int iOrdinal = ryd0Var2.ordinal();
            short s = ryd0Var2.f31310a.f33572a;
            switch (iOrdinal) {
                case 0:
                    if (x2x.f0(bvd0Var)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 1:
                    if (x2x.e0(bvd0Var)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 2:
                    if (x2x.W(bvd0Var)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 3:
                    if (x2x.c0(bvd0Var.c)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 4:
                    if (x2x.a0(vvd0Var.e)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 5:
                    if (x2x.X(g0e0Var)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 6:
                    if (x2x.Z(g0e0Var)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 7:
                    if (x2x.b0(vvd0Var.c, m9sVar)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                default:
                    t9f.b();
                    return null;
            }
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final sgy F(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return sre0.f32672a.b(clsAnnotationType);
    }

    public static final Class G(sgy sgyVar) {
        sgyVar.getClass();
        Class clsJ = ((elc) sgyVar).j();
        clsJ.getClass();
        return clsJ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class H(sgy sgyVar) {
        sgyVar.getClass();
        Class clsJ = ((elc) sgyVar).j();
        if (clsJ.isPrimitive()) {
            String name = clsJ.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsJ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class I(sgy sgyVar) {
        sgyVar.getClass();
        Class clsJ = ((elc) sgyVar).j();
        if (clsJ.isPrimitive()) {
            return clsJ;
        }
        String name = clsJ.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final String J(Constructor constructor) {
        constructor.getClass();
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        return tx3.N(parameterTypes, "", "<init>(", ")V", b180.v, 24);
    }

    public static final String K(Field field) {
        String name = field.getName();
        name.getClass();
        StringBuilder sb = new StringBuilder(aey.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        type.getClass();
        sb.append(bqe0.b(type));
        return sb.toString();
    }

    public static final String L(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(tx3.N(parameterTypes, "", Separators.LPAREN, Separators.RPAREN, b180.w, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(bqe0.b(returnType));
        return sb.toString();
    }

    public static final sgy M(Class cls) {
        cls.getClass();
        return sre0.f32672a.b(cls);
    }

    public static final wzm N(List list, String str, String str2) {
        StringBuilder sb = new StringBuilder(ujn.h);
        String str3 = (String) CollectionsKt.firstOrNull(list);
        if (str3 == null) {
            str3 = "";
        }
        if (str3.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str3, ujn.h, false) || kotlin.text.c.x(str3, "https://", false)) {
            sb.setLength(0);
            sb.append(str3);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str3, '/'));
        }
        return new wzm(str, new c280(sb.toString(), R.drawable.no_photo_new), str2);
    }

    public static final int O(long j) {
        if (j == 1) {
            return R.drawable.ic_game_football_penalties_minus;
        }
        return j == 2 ? R.drawable.ic_game_hockey_bullits_minus : R.drawable.transparent;
    }

    public static final String P(long j) {
        return String.format(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        if (r3 == r9) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(a.inn0 r17, a.cgx0 r18, a.zz2 r19, a.woa0 r20, a.zw5 r21) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.azw.Q(a.inn0, a.cgx0, a.zz2, a.woa0, a.zw5):java.lang.Object");
    }

    public static final String R(String str) {
        str.getClass();
        return new Regex("(?:-circle_v\\d+|-circle|_v\\d+)(?=\\.)").replace(str, "");
    }

    public static final float S(long j, float f, w6k w6kVar) {
        if (daq0.a(j, daq0.c)) {
            return f;
        }
        long jB = daq0.b(j);
        if (eaq0.a(jB, 4294967296L)) {
            return w6kVar.X(j);
        }
        if (eaq0.a(jB, 8589934592L)) {
            return daq0.c(j) * f;
        }
        return Float.NaN;
    }

    public static final float T(long j, float f, w6k w6kVar) {
        float fC;
        long jB = daq0.b(j);
        if (eaq0.a(jB, 4294967296L)) {
            if (w6kVar.v0() <= 1.05d) {
                return w6kVar.X(j);
            }
            fC = daq0.c(j) / daq0.c(w6kVar.B(f));
        } else {
            if (!eaq0.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = daq0.c(j);
        }
        return fC * f;
    }

    public static final void U(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(fbc.U(j)), i, i2, 33);
        }
    }

    public static final void V(Spannable spannable, long j, w6k w6kVar, int i, int i2) {
        long jB = daq0.b(j);
        if (eaq0.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(si30.b(w6kVar.X(j)), false), i, i2, 33);
        } else if (eaq0.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(daq0.c(j)), i, i2, 33);
        }
    }

    public static final void W(Spannable spannable, rs00 rs00Var, int i, int i2) {
        if (rs00Var != null) {
            ArrayList arrayList = new ArrayList(r3d.q(rs00Var, 10));
            Iterator it = rs00Var.f31011a.iterator();
            while (it.hasNext()) {
                arrayList.add(((qs00) it.next()).f29235a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static final vz30 X(h040 h040Var) {
        ?? arrayList;
        h040Var.getClass();
        Integer num = h040Var.f12215a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = h040Var.b;
        if (str == null) {
            str = "";
        }
        List<x5i0> list = h040Var.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (x5i0 x5i0Var : list) {
                String str2 = x5i0Var.f40319a;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = x5i0Var.b;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new l5i0(str2, str3));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new vz30(str, arrayList, iIntValue);
    }

    public static final eh50 Y(hh50 hh50Var) {
        hh50Var.getClass();
        String str = hh50Var.f13046a;
        String str2 = str == null ? "" : str;
        String str3 = hh50Var.b;
        String str4 = str3 == null ? "" : str3;
        Long l = hh50Var.c;
        List list = null;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        List<dh50> list2 = hh50Var.d;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            for (dh50 dh50Var : list2) {
                dh50Var.getClass();
                Long l2 = dh50Var.f6077a;
                if (l2 == null) {
                    jf4.k(null);
                    return null;
                }
                long jLongValue2 = l2.longValue();
                String str5 = dh50Var.b;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = dh50Var.c;
                if (str6 == null) {
                    str6 = "";
                }
                arrayList.add(new ah50(jLongValue2, str5, StringsKt.p0(str6, Separators.SLASH, str6)));
            }
            list = arrayList;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        return new eh50(jLongValue, str2, str4, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public static final eqb0 Z(hqb0 hqb0Var, jch jchVar) {
        ?? arrayList;
        bih bihVar;
        Integer num;
        bih bihVar2;
        Long l;
        int i;
        String str;
        hqb0Var.getClass();
        List<oqb0> list = hqb0Var.f13477a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (oqb0 oqb0Var : list) {
                Integer num2 = oqb0Var.f25681a;
                boolean z = num2 != null && num2.intValue() == 1;
                Integer num3 = oqb0Var.b;
                int iIntValue = num3 != null ? num3.intValue() : 0;
                Integer num4 = oqb0Var.c;
                int iIntValue2 = num4 != null ? num4.intValue() : 0;
                String str2 = oqb0Var.d;
                if (str2 == null) {
                    str2 = "";
                }
                Integer num5 = oqb0Var.e;
                int iIntValue3 = num5 != null ? num5.intValue() : 0;
                Integer num6 = oqb0Var.f;
                int iIntValue4 = num6 != null ? num6.intValue() : 0;
                Integer num7 = oqb0Var.g;
                int iIntValue5 = num7 != null ? num7.intValue() : 0;
                String str3 = oqb0Var.h;
                if (str3 == null) {
                    int i2 = iIntValue5;
                    str = "";
                    i = i2;
                } else {
                    i = iIntValue5;
                    str = str3;
                }
                arrayList.add(new lqb0(z, iIntValue, iIntValue2, str2, iIntValue3, iIntValue4, i, str));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new eqb0((jchVar == null || (bihVar2 = jchVar.j) == null || (l = bihVar2.f2659a) == null) ? 0L : l.longValue(), arrayList, (jchVar == null || (bihVar = jchVar.j) == null || (num = bihVar.b) == null || num.intValue() != 0) ? false : true);
    }

    public static final void a(mdm mdmVar, fet fetVar, int i) {
        int i2;
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(1952545122);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mdmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 180.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(s5x0.L(jm40Var, 0.0f, 24.0f, 1), mdmVar2, true, null, fetVar2, ((i2 << 3) & 112) | 384, 8);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new duv(mdmVar2, i, b);
        }
    }

    public static final s5h0 a0(nz10 nz10Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (nz10Var instanceof mz10) {
            mz10 mz10Var = (mz10) nz10Var;
            gex gexVarW = wzb.W(mz10Var.g);
            ArrayList arrayList = mz10Var.f;
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(g1x.D((te90) it.next()));
            }
            return new s5h0(gexVarW, arrayList2, atm0.o(nz10Var, ctf0Var), new joa0(wzb.c0(mz10Var), wzb.g0(mz10Var)), 8);
        }
        if (!(nz10Var instanceof oz10)) {
            if (!(nz10Var instanceof kz10)) {
                t9f.b();
                return null;
            }
            kz10 kz10Var = (kz10) nz10Var;
            gex gexVarW2 = wzb.W(kz10Var.g);
            ArrayList arrayList3 = kz10Var.f;
            ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(g1x.D((te90) it2.next()));
            }
            return new s5h0(gexVarW2, arrayList4, atm0.o(nz10Var, ctf0Var), (loa0) null, 24);
        }
        oz10 oz10Var = (oz10) nz10Var;
        String str = oz10Var.m;
        String str2 = oz10Var.k;
        boolean z = ((StringsKt.W(str2) || str2.equals("0")) && (StringsKt.W(str) || str.equals("0"))) ? false : true;
        gex gexVarW3 = wzb.W(oz10Var.o);
        ArrayList arrayList5 = oz10Var.f;
        ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(g1x.D((te90) it3.next()));
        }
        return new s5h0(gexVarW3, arrayList6, atm0.o(nz10Var, ctf0Var), new v0s(wzb.k0(oz10Var), wzb.l0(oz10Var)), z ? new joa0(wzb.d0(oz10Var), wzb.h0(oz10Var)) : null);
    }

    public static final void b(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-334056923);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ia30(function1, (byte) 6);
                fetVar.o0(objP);
            }
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, (Function0) objP, fetVar2, (i2 << 3) & 112, 5);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar2, function1, i, (byte) 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(a.inn0 r12, a.p5q0 r13, a.woa0 r14, a.zw5 r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.azw.b0(a.inn0, a.p5q0, a.woa0, a.zw5):java.lang.Object");
    }

    public static vz2 c(int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap;
        ubg0 ubg0Var = a5d.e;
        Bitmap.Config configX = j2e.X(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, j2e.X(i3), true, ga3.c(ubg0Var));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configX);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new vz2(bitmapCreateBitmap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        if (r14 == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c0(a.inn0 r10, a.p5q0 r11, a.woa0 r12, int r13, a.zw5 r14) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.azw.c0(a.inn0, a.p5q0, a.woa0, int, a.zw5):java.lang.Object");
    }

    public static final void d(mm40 mm40Var, ygx ygxVar, xdr xdrVar, fet fetVar, int i) {
        int i2;
        xdrVar.getClass();
        fetVar.g0(495579449);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(ygxVar) : fetVar.i(ygxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarD, 8.0f, 4.0f, 8.0f, 4.0f);
            boolean z2 = (i2 & 896) == 256;
            int i3 = i2 & 112;
            if (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(ygxVar))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new vgx(xdrVar, ygxVar, b);
                fetVar.o0(objP);
            }
            yyw.i(mm40VarM, ygxVar, (Function0) objP, u1c.M(-1398385947, new wgx(ygxVar, (byte) 8), fetVar), u1c.M(691974526, new wgx(ygxVar, (byte) 9), fetVar), u1c.M(-764438529, new wgx(ygxVar, (byte) 10), fetVar), u1c.M(2074115712, new wgx(ygxVar, (byte) 11), fetVar), fetVar, i3 | 1797120);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xgx(mm40Var, ygxVar, xdrVar, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    public static final void e(mm40 mm40Var, jam0 jam0Var, ehm0 ehm0Var, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        Object objP;
        ehm0Var.getClass();
        function1.getClass();
        fetVar.g0(1938676960);
        int i5 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ehm0Var) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        byte b = 0;
        if (fetVar.U(i5 & 1, (i5 & 9363) != 9362)) {
            int iOrdinal = jam0Var.ordinal();
            if (iOrdinal == 4) {
                i2 = R.string.last_games;
            } else if (iOrdinal != 5) {
                i2 = iOrdinal != 6 ? 0 : R.string.head_2_head_meeting;
            } else {
                i2 = R.string.statistic_last_game_pager_next_games;
            }
            int iOrdinal2 = jam0Var.ordinal();
            if (iOrdinal2 == 4) {
                i3 = R.drawable.glyph_last_games;
            } else if (iOrdinal2 != 5) {
                if (iOrdinal2 != 6) {
                    i4 = 0;
                } else {
                    i3 = R.drawable.ic_glyph_versus_alt;
                }
                boolean z3 = ehm0Var.f7815a;
                z2 = (i5 & 57344) == 16384;
                objP = fetVar.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new m0z(function1, jam0Var, b);
                    fetVar.o0(objP);
                }
                tfx.p(i2, i4, z3, (Function0) objP, o7k0.y(mm40Var, null, 3), u1c.M(-1155071794, new odv(ehm0Var, function1, jam0Var, z), fetVar), fetVar, 196608);
            } else {
                i3 = R.drawable.glyph_versus;
            }
            i4 = i3;
            boolean z4 = ehm0Var.f7815a;
            if ((i5 & 57344) == 16384) {
            }
            objP = fetVar.P();
            if (z2) {
                objP = new m0z(function1, jam0Var, b);
                fetVar.o0(objP);
            } else {
                objP = new m0z(function1, jam0Var, b);
                fetVar.o0(objP);
            }
            tfx.p(i2, i4, z4, (Function0) objP, o7k0.y(mm40Var, null, 3), u1c.M(-1155071794, new odv(ehm0Var, function1, jam0Var, z), fetVar), fetVar, 196608);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 23, i, (wdr) function1, (Object) mm40Var, (Object) jam0Var, (Object) ehm0Var, z);
        }
    }

    public static final void f(ir8 ir8Var, mm40 mm40Var, lqw lqwVar, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z;
        zx7 zx7Var = gqw0.e;
        function1.getClass();
        fetVar.g0(1413476043);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(lqwVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = lqwVar instanceof hqw;
            cl5 cl5Var = ukd.f35823a;
            if (z2) {
                fetVar.e0(1005677914);
                a4x a4xVar = ((hqw) lqwVar).f13504a;
                z = (i2 & 7168) == 2048;
                Object objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new i1y(function1, (byte) 28);
                    fetVar.o0(objP);
                }
                gkb.c(a4xVar, mm40Var, (Function1) objP, 0, fetVar, i2 & 112, 8);
                fetVar.r(false);
            } else {
                boolean z3 = lqwVar instanceof iqw;
                jm40 jm40Var = jm40.b;
                if (z3) {
                    fetVar.e0(1140832510);
                    jcb.l(ir8Var.b(jm40Var, zx7Var), ((iqw) lqwVar).f15230a, false, null, fetVar, 0, 12);
                    fetVar.r(false);
                } else if (lqwVar instanceof jqw) {
                    fetVar.e0(1140836685);
                    mm40 mm40VarB = ir8Var.b(jm40Var, zx7Var);
                    mdm mdmVar = ((jqw) lqwVar).f16976a;
                    z = (i2 & 7168) == 2048;
                    Object objP2 = fetVar.P();
                    if (z || objP2 == cl5Var) {
                        objP2 = new dg00(function1, b);
                        fetVar.o0(objP2);
                    }
                    jcb.l(mm40VarB, mdmVar, false, (Function0) objP2, fetVar, 0, 4);
                    fetVar.r(false);
                } else {
                    if (!(lqwVar instanceof kqw)) {
                        throw b1j.f(1140818257, fetVar, false);
                    }
                    fetVar.e0(1006452604);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    float f = ((Configuration) fetVar.k(dy2.f6873a)).screenHeightDp;
                    zcl zclVar = qmk.f28987a;
                    s0x.t(iym0.r(f - 134.0f), 48, fetVar, mm40VarD);
                    fetVar.r(false);
                }
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg00(ir8Var, mm40Var, lqwVar, function1, i, (byte) 0);
        }
    }

    public static final void g(int i, fet fetVar, boolean z) {
        fetVar.g0(-703527060);
        int i2 = (fetVar.h(z) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            if (z) {
                fetVar.e0(665900049);
                pzw.v(fqj0VarD0, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(665856432);
                pzw.d(fqj0VarD0, fetVar, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new obg((byte) 23, i, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(mm40 mm40Var, l7m0 l7m0Var, boolean z, final xdr xdrVar, final xdr xdrVar2, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        boolean z2;
        int i4;
        jm40 jm40Var;
        int i5;
        final byte b;
        int i6;
        byte b2;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        xdrVar.getClass();
        xdrVar2.getClass();
        fetVar2.g0(1958133859);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(l7m0Var) ? 32 : 16;
        }
        boolean z3 = z;
        if ((i & 384) == 0) {
            i3 |= fetVar2.h(z3) ? 256 : 128;
        }
        int i8 = 2048;
        if ((i & 3072) == 0) {
            i3 |= fetVar2.i(xdrVar) ? 2048 : 1024;
        }
        int i9 = 16384;
        if ((i & 24576) == 0) {
            i3 |= fetVar2.i(xdrVar2) ? 16384 : 8192;
        }
        final byte b3 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40Var4 = i7 != 0 ? jm40Var2 : mm40Var2;
            for (Iterator it = ((Iterable) l7m0Var.getValue()).iterator(); it.hasNext(); it = it) {
                final ifm ifmVar = (ifm) it.next();
                if (ifmVar != null) {
                    boolean z4 = ifmVar instanceof cfm;
                    cl5 cl5Var = ukd.f35823a;
                    if (z4) {
                        fetVar2.e0(-44194947);
                        pz40 pz40VarF = androidx.compose.runtime.e.f(ifmVar, fetVar2);
                        boolean z5 = ((i3 & 7168) == i8 ? (byte) 1 : b3) | (fetVar2.g(ifmVar) ? 1 : 0);
                        Object objP = fetVar2.P();
                        if (z5 != 0 || objP == cl5Var) {
                            objP = new Function1() { // from class: a.cu20
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    byte b4 = b3;
                                    ifm ifmVar2 = ifmVar;
                                    xdr xdrVar3 = xdrVar;
                                    switch (b4) {
                                        case 0:
                                            wgl0 wgl0Var = (wgl0) obj;
                                            wgl0Var.getClass();
                                            xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), wgl0Var);
                                            break;
                                        case 1:
                                            xgl0 xgl0Var = (xgl0) obj;
                                            xgl0Var.getClass();
                                            xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), xgl0Var);
                                            break;
                                        case 2:
                                            wgl0 wgl0Var2 = (wgl0) obj;
                                            wgl0Var2.getClass();
                                            xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), wgl0Var2);
                                            break;
                                        default:
                                            xgl0 xgl0Var2 = (xgl0) obj;
                                            xgl0Var2.getClass();
                                            xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), xgl0Var2);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            fetVar2.o0(objP);
                        }
                        Function1 function1 = (Function1) objP;
                        boolean z6 = ((i3 & 57344) == i9 ? (byte) 1 : b3) | (fetVar2.g(ifmVar) ? 1 : 0);
                        Object objP2 = fetVar2.P();
                        if (z6 != 0 || objP2 == cl5Var) {
                            final byte b4 = 1;
                            objP2 = new Function1() { // from class: a.cu20
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    byte b5 = b4;
                                    ifm ifmVar2 = ifmVar;
                                    xdr xdrVar3 = xdrVar2;
                                    switch (b5) {
                                        case 0:
                                            wgl0 wgl0Var = (wgl0) obj;
                                            wgl0Var.getClass();
                                            xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), wgl0Var);
                                            break;
                                        case 1:
                                            xgl0 xgl0Var = (xgl0) obj;
                                            xgl0Var.getClass();
                                            xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), xgl0Var);
                                            break;
                                        case 2:
                                            wgl0 wgl0Var2 = (wgl0) obj;
                                            wgl0Var2.getClass();
                                            xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), wgl0Var2);
                                            break;
                                        default:
                                            xgl0 xgl0Var2 = (xgl0) obj;
                                            xgl0Var2.getClass();
                                            xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), xgl0Var2);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            fetVar2.o0(objP2);
                        }
                        Function1 function2 = (Function1) objP2;
                        mm40 mm40VarN = s5x0.N(mm40Var4, 0.0f, 0.0f, 0.0f, ((cfm) pz40VarF.getValue()).b(), 7);
                        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, b3);
                        int iHashCode = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM = fetVar2.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
                        jm40 jm40Var3 = jm40Var2;
                        i4 = i3;
                        l7x.q(s5x0.L(jm40Var2, ((cfm) pz40VarF.getValue()).d(), 0.0f, 2), androidx.compose.runtime.e.f(((cfm) pz40VarF.getValue()).getHeader(), fetVar2), null, fetVar, 0, 4);
                        fetVar2 = fetVar;
                        boolean zG = fetVar2.g(function2);
                        Object objP3 = fetVar2.P();
                        if (zG || objP3 == cl5Var) {
                            objP3 = new du20(1, function2, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 0);
                            fetVar2.o0(objP3);
                        }
                        ufx.d(jm40Var3, pz40VarF, z3, function1, (Function1) ((jhy) objP3), fetVar2, (i4 & 896) | 6);
                        jm40Var = jm40Var3;
                        fetVar2.r(true);
                        b2 = 0;
                        fetVar2.r(false);
                        i5 = 2048;
                        i6 = 16384;
                    } else {
                        i4 = i3;
                        jm40Var = jm40Var2;
                        if (ifmVar instanceof hfm) {
                            fetVar2.e0(-43494502);
                            pz40 pz40VarF2 = androidx.compose.runtime.e.f(ifmVar, fetVar2);
                            i5 = 2048;
                            boolean zG2 = fetVar2.g(ifmVar) | ((i4 & 7168) == 2048);
                            Object objP4 = fetVar2.P();
                            if (zG2 || objP4 == cl5Var) {
                                b = 2;
                                objP4 = new Function1() { // from class: a.cu20
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        byte b5 = b;
                                        ifm ifmVar2 = ifmVar;
                                        xdr xdrVar3 = xdrVar;
                                        switch (b5) {
                                            case 0:
                                                wgl0 wgl0Var = (wgl0) obj;
                                                wgl0Var.getClass();
                                                xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), wgl0Var);
                                                break;
                                            case 1:
                                                xgl0 xgl0Var = (xgl0) obj;
                                                xgl0Var.getClass();
                                                xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), xgl0Var);
                                                break;
                                            case 2:
                                                wgl0 wgl0Var2 = (wgl0) obj;
                                                wgl0Var2.getClass();
                                                xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), wgl0Var2);
                                                break;
                                            default:
                                                xgl0 xgl0Var2 = (xgl0) obj;
                                                xgl0Var2.getClass();
                                                xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), xgl0Var2);
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar2.o0(objP4);
                            } else {
                                b = 2;
                            }
                            Function1 function3 = (Function1) objP4;
                            boolean zG3 = ((i4 & 57344) == 16384) | fetVar2.g(ifmVar);
                            Object objP5 = fetVar2.P();
                            if (zG3 || objP5 == cl5Var) {
                                final byte b5 = 3;
                                objP5 = new Function1() { // from class: a.cu20
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        byte b6 = b5;
                                        ifm ifmVar2 = ifmVar;
                                        xdr xdrVar3 = xdrVar2;
                                        switch (b6) {
                                            case 0:
                                                wgl0 wgl0Var = (wgl0) obj;
                                                wgl0Var.getClass();
                                                xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), wgl0Var);
                                                break;
                                            case 1:
                                                xgl0 xgl0Var = (xgl0) obj;
                                                xgl0Var.getClass();
                                                xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), xgl0Var);
                                                break;
                                            case 2:
                                                wgl0 wgl0Var2 = (wgl0) obj;
                                                wgl0Var2.getClass();
                                                xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), wgl0Var2);
                                                break;
                                            default:
                                                xgl0 xgl0Var2 = (xgl0) obj;
                                                xgl0Var2.getClass();
                                                xdrVar3.F(Long.valueOf(ifmVar2.e()), Long.valueOf(ifmVar2.a()), xgl0Var2);
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar2.o0(objP5);
                            }
                            Function1 function4 = (Function1) objP5;
                            mm40 mm40VarN2 = s5x0.N(mm40Var4, 0.0f, 0.0f, 0.0f, ((hfm) pz40VarF2.getValue()).b(), 7);
                            boolean zG4 = fetVar2.g(function3);
                            Object objP6 = fetVar2.P();
                            if (zG4 || objP6 == cl5Var) {
                                objP6 = new du20(1, function3, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 1);
                                fetVar2.o0(objP6);
                            }
                            Function1 function5 = (Function1) ((jhy) objP6);
                            boolean zG5 = fetVar2.g(function4);
                            Object objP7 = fetVar2.P();
                            if (zG5 || objP7 == cl5Var) {
                                objP7 = new du20(1, function4, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 2);
                                fetVar2.o0(objP7);
                            }
                            i6 = 16384;
                            ufx.d(mm40VarN2, pz40VarF2, z, function5, (Function1) ((jhy) objP7), fetVar2, i4 & 896);
                            b2 = 0;
                            fetVar2.r(false);
                        } else {
                            z2 = 0;
                        }
                    }
                    z3 = z;
                    b3 = b2;
                    i3 = i4;
                    jm40Var2 = jm40Var;
                    i8 = i5;
                    i9 = i6;
                } else {
                    z2 = b3;
                }
                throw b1j.f(552762141, fetVar2, z2);
            }
            mm40Var3 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ag(mm40Var3, (Object) l7m0Var, z, xdrVar, xdrVar2, i, i2, (byte) 5);
        }
    }

    public static final void i(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(1968403572);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object value = l7m0Var.getValue();
            value.getClass();
            qd30 qd30Var = (qd30) value;
            if (qd30Var.b) {
                fetVar.e0(1850230331);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1850231255);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            k6z k6zVar2 = k6zVar;
            int i3 = (int) qd30Var.f;
            boolean zG = fetVar.g(qd30Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new rx00(qd30Var, (byte) 25);
                fetVar.o0(objP);
            }
            kwj kwjVarB = zk80.b(i3, (Function0) objP, fetVar, 0, 2);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new LinkedHashMap();
                fetVar.o0(objP2);
            }
            Map map = (Map) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP3);
            }
            vne vneVar = (vne) objP3;
            zcl zclVar = qmk.l;
            zcl zclVar2 = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarI = dw9.i(zclVar, zclVar, zclVar2, zclVar2, jm40Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            vxl vxlVar = vxl.f38204a;
            fyl fylVar = new fyl(qd30Var.d, null, null, s5x0.u(20.0f, 0.0f, 20.0f, 0.0f, 10), null, 22);
            boolean zI = fetVar.i(vneVar) | ((i2 & 112) == 32) | fetVar.g(kwjVarB);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj) {
                objP4 = new bwh(function1, vneVar, kwjVarB, (byte) 4);
                fetVar.o0(objP4);
            }
            ebc.r(mm40VarN, fylVar, vxlVar, (Function1) objP4, null, fetVar, 384, 40);
            obc.d(bmd.n.a(k6zVar2), u1c.M(-873072642, new mtz(kwjVarB, map, qd30Var, (byte) 16), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i, (byte) 17);
        }
    }

    public static final void j(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1250017233);
        byte b = 2;
        byte b2 = 16;
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic_match_progress_title, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = ((rd30) l7m0Var.getValue()).b().f2381a;
            j9m0 j9m0Var = ((rd30) l7m0Var.getValue()).b().b;
            boolean zA = ((rd30) l7m0Var.getValue()).a();
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ia30(function1, (byte) 5);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, (Function0) objP, null, null, u1c.M(801437537, new dqz(l7m0Var, function1, b), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i, b2);
        }
    }

    public static final void k(mm40 mm40Var, yd80 yd80Var, fet fetVar, int i) {
        yd80 yd80Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-246959502);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(yd80Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            x7z x7zVar = new x7z(1.0f, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            String str = yd80Var.f42421a;
            y9q0 y9q0VarM = g1t0.m();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, mm40VarD2, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(y9q0VarM, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 24960, 110588);
            yd80Var2 = yd80Var;
            v8q0.a(yd80Var.b, o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.m(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            l(6, fetVar2, o7k0.y(jm40Var, null, 3), yd80Var2.c, yd80Var2.d, yd80Var2.e);
            fetVar2.r(true);
        } else {
            yd80Var2 = yd80Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(mm40Var, yd80Var2, i, (byte) 28);
        }
    }

    public static final void l(int i, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        fetVar.g0(-1108179122);
        int i2 = i | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(str3) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            m((i2 << 3) & 896, fetVar, null, xsm0.s(R.string.P1, fetVar), str);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(s5x0.L(jm40Var, 2.0f, 0.0f, 2), 30.0f);
            agi0 agi0Var = agi0.f827a;
            mbc.o(agi0Var, mm40VarE, false, fetVar, 390, 0);
            m(i2 & 896, fetVar, null, xsm0.s(R.string.X, fetVar), str2);
            mbc.o(agi0Var, o7k0.e(s5x0.L(jm40Var, 2.0f, 0.0f, 2), 30.0f), false, fetVar, 390, 0);
            m((i2 >> 3) & 896, fetVar, null, xsm0.s(R.string.P2, fetVar), str3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cm5(mm40Var, str, str2, str3, i, (byte) 3);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        String str3;
        String str4;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1416135940);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= fetVar2.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= fetVar2.g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 36.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            long j = g1t0.e().f42262a.b;
            long j2 = qmk.o;
            y9q0 y9q0VarE = g1t0.e();
            zfn zfnVar = zaq0.b;
            kc5.N(str3, mm40VarD, 0L, null, null, 0L, j2, j, null, null, 0L, gqw0.e, 2, false, 1, 0, false, null, y9q0.a(y9q0VarE, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), 0.0f, fetVar2, ((i2 >> 3) & 14) | 48, 1600512, 0, 3055420);
            v8q0.a(str4, s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0.a(g1t0.m(), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar2, (i2 >> 6) & 14, 24576, 113660);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var2, str, str2, i, (byte) 9);
        }
    }

    public static final void n(mm40 mm40Var, a4x a4xVar, a4x a4xVar2, Function1 function1, Function1 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        a4xVar.getClass();
        a4xVar2.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(2102874423);
        int i2 = i | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(a4xVar2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            pz40 pz40Var = s6t0.f31722a;
            long backgroundGroup = s6t0.b().f33626a.getBackgroundGroup();
            zfn zfnVar = bmd.n;
            k6z k6zVar = (k6z) fetVar.k(zfnVar);
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarK = s5x0.K(mm40Var2, qmk.a(fetVar).c, 8.0f);
            boolean zF = fetVar.f(backgroundGroup);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new r2a0(b, backgroundGroup);
                fetVar.o0(objP);
            }
            mm40 mm40VarN = s5x0.N(rq8.K(mm40VarK, (Function1) objP), 8.0f, 0.0f, 8.0f, 8.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            obc.d(zfnVar.a(k6z.f17794a), u1c.M(-1247478547, new ajw(function1, a4xVar, k6zVar, function2, a4xVar2), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw(mm40Var2, a4xVar, a4xVar2, function1, function2, i);
        }
    }

    public static final void o(q2a0 q2a0Var, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(485654221);
        int i2 = (fetVar.g(q2a0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 210.0f), 0.0f, 6.0f, 0.0f, 12.0f, 5);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            fetVar.e0(-612934318);
            for (o2a0 o2a0Var : q2a0Var.f27992a) {
                fetVar.b0(1202312986, o2a0Var.i);
                g1x.j(null, o2a0Var, q2a0Var.b, q2a0Var.c, fetVar, 0);
                fetVar.r(false);
            }
            fetVar2 = fetVar;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cz90(q2a0Var, i, (byte) 13);
        }
    }

    public static final void p(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        a4xVar.getClass();
        fetVar.g0(202893384);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarL, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f, 10.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -946538612, a4xVar);
            while (itO.hasNext()) {
                q((nlc0) itO.next(), fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 19);
        }
    }

    public static final void q(nlc0 nlc0Var, fet fetVar, int i) {
        long commerce;
        fet fetVar2 = fetVar;
        fetVar2.g0(-896475234);
        int i2 = i | (fetVar2.g(nlc0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11);
            if (0.6f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(nlc0Var.f23720a, mm40VarN.e(new x7z(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true)), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar, 0, 0, 130044);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14);
            if (0.4f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE = mm40VarN2.e(new x7z(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true));
            String str = nlc0Var.b;
            if (nlc0Var.c) {
                fetVar.e0(-2042224690);
                commerce = ((ThemeColors) fetVar.k(zaq0.b)).getCommerce();
                fetVar.r(false);
            } else {
                fetVar.e0(-2042291061);
                commerce = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                fetVar.r(false);
            }
            v8q0.a(str, mm40VarE, commerce, null, 0L, null, null, null, 0L, new f2q0(fetVar.k(bmd.n) == k6z.f17794a ? 6 : 5), 0L, 0, false, 0, 0, null, y9q0.a(g1t0.d(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lma0(nlc0Var, i, (byte) 25);
        }
    }

    public static final void r(mm40 mm40Var, ArrayList arrayList, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(-54571573);
        int i2 = i | 6 | (fetVar.g(arrayList) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(jm40Var, 16.0f);
            qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new td8(arrayList, function1, (byte) 3);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarJ, null, null, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 494);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cue0(mm40Var2, arrayList, function1, i, (byte) 0);
        }
    }

    public static final void s(mch0 mch0Var, qdz qdzVar, fet fetVar, int i) {
        mch0Var.getClass();
        qdzVar.getClass();
        fetVar.g0(-173352234);
        int i2 = (fetVar.g(mch0Var) ? 4 : 2) | i | (fetVar.g(qdzVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            zcl zclVar = qmk.f28987a;
            z(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), mch0Var.c, fetVar, 0);
            pzw.p(mch0Var, qdzVar, fetVar, i2 & 126);
            z(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), mch0Var.d, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kch0(mch0Var, qdzVar, i, b);
        }
    }

    public static final void t(ugg0 ugg0Var, mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(-929591015);
        int i2 = (fetVar.g(ugg0Var) ? 4 : 2) | i | 48;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar.invoke(fetVar, 6);
            u(0, fetVar, jr8.f16991a.a(lgb.J(jm40Var, ugg0Var)));
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(ugg0Var, mm40Var, ugdVar, i);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1033325053);
        byte b = 4;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            boolean z = ((Configuration) fetVar.k(dy2.f6873a)).getLayoutDirection() == 1;
            zfn zfnVar = m8m0.f21378a;
            List listJ = q3d.j(new y3d(((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU()), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary10()), new y3d(((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU()));
            x7x x7xVarR = b8k0.r(b8k0.V("", fetVar, 0), -1.0f, 1.0f, ro4.b0(ro4.m0(2500, 0, ihn.d, 2), kkf0.f18436a, 0L, 4), "", fetVar, 29064, 0);
            boolean zG = fetVar.g(x7xVarR) | fetVar.h(z) | fetVar.g(listJ);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new lrc0(x7xVarR, z, listJ, b);
                fetVar.o0(objP);
            }
            p8a.k(mm40Var, (Function1) objP, fetVar, i2 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, b2);
        }
    }

    public static final void v(mm40 mm40Var, ial0 ial0Var, Function2 function2, fet fetVar) {
        obc.e(new l5d0[]{eal0.f7472a.a(gqw0.d), dw9.k(5, eal0.b), gap.f10979a.a(fetVar.k(bmd.n))}, u1c.M(-1099553939, new aak0(mm40Var, ial0Var, function2, (byte) 19), fetVar), fetVar, 48);
    }

    public static final void w(final h1z h1zVar, final boolean z, final mdm mdmVar, final Function1 function1, final Function0 function0, fet fetVar, final int i) {
        int i2;
        Function1 function2;
        Function0 function3;
        fetVar.g0(-1233888106);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(h1zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.h(z) ? 32 : 16) | (fetVar.g(mdmVar) ? 256 : 128);
        if ((i & 3072) == 0) {
            function2 = function1;
            i3 |= fetVar.i(function2) ? 2048 : 1024;
        } else {
            function2 = function1;
        }
        if ((i & 24576) == 0) {
            function3 = function0;
            i3 |= fetVar.i(function3) ? 16384 : 8192;
        } else {
            function3 = function0;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarW, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            int i4 = ((i3 >> 6) & 14) | ((i3 << 6) & 7168);
            int i5 = i3 << 3;
            x0x.f(mdmVar, h1zVar.c, z, function2, function3, fetVar, i4 | (57344 & i5) | (i5 & 458752));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.o0z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    azw.w(h1zVar, z, mdmVar, function1, function0, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void x(mdm mdmVar, h1z h1zVar, int i, boolean z, Function1 function1, Function1 function2, Function0 function0, fet fetVar, int i2) {
        int i3;
        k6z k6zVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(139201246);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mdmVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b = 16;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(h1zVar) ? 32 : 16;
        }
        int i4 = i3 | (fetVar2.e(i) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i4 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= fetVar2.i(function2) ? 131072 : 65536;
        }
        if (fetVar2.U(i4 & 1, (599187 & i4) != 599186)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new pcy(b);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(i, (Function0) objP, fetVar2, ((i4 >> 6) & 14) | 384, 2);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            if (z) {
                fetVar2.e0(628427621);
                k6zVar = (k6z) fetVar2.k(bmd.n);
                fetVar2.r(false);
            } else {
                fetVar2.e0(628428545);
                fetVar2.r(false);
                k6zVar = k6z.f17794a;
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarW, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                String str = h1zVar.b.b;
                bwh0 bwh0Var = bwh0.f3325a;
                objP3 = dyb.o0(q3d.j(new yvh0(str, bwh0Var), new yvh0(h1zVar.d.b, bwh0Var)));
                fetVar2.o0(objP3);
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-77381400, new cbr(objP3, (Object) kwjVarB, (Object) vneVar, (Object) function2, (byte) 13), fetVar2), fetVar2, 56);
            mm40 mm40VarN2 = s5x0.N(hp4.B(o7k0.d(jm40Var, 1.0f)), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
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
            q5x.e(kwjVarB, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), null, null, 0, 0.0f, gqw0.j, null, false, null, null, null, null, u1c.M(1591529473, new z2w(h1zVar, mdmVar, z, function1, function0), fetVar2), fetVar2, 102236208, 27648, 7868);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0z(mdmVar, h1zVar, i, z, function1, function2, function0, i2);
        }
    }

    public static final void y(ehm0 ehm0Var, boolean z, mdm mdmVar, jam0 jam0Var, h1z h1zVar, Function1 function1, Function0 function0, Function1 function2, fet fetVar, int i) {
        fetVar.g0(-920947780);
        int i2 = i | (fetVar.g(ehm0Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.g(mdmVar) ? 256 : 128) | (fetVar.e(jam0Var.ordinal()) ? 2048 : 1024) | (fetVar.g(h1zVar) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (!fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            fetVar.X();
        } else if (h1zVar.c.isEmpty() && h1zVar.e.isEmpty()) {
            fetVar.e0(296253866);
            a(mdmVar, fetVar, (i2 >> 6) & 14);
            fetVar.r(false);
        } else if (jam0Var == jam0.g) {
            fetVar.e0(296418538);
            w(h1zVar, z, mdmVar, function1, function0, fetVar, ((i2 >> 6) & 7168) | ((i2 >> 12) & 14) | (i2 & 112) | (i2 & 896) | 24576);
            fetVar.r(false);
        } else {
            fetVar.e0(296765304);
            x(mdmVar, h1zVar, ehm0Var.c, z, function1, function2, function0, fetVar, ((i2 >> 6) & 14) | ((i2 >> 9) & 112) | ((i2 << 6) & 7168) | ((i2 >> 3) & 57344) | 1769472);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ntm(ehm0Var, z, mdmVar, jam0Var, h1zVar, function1, function0, function2, i);
        }
    }

    public static final void z(mm40 mm40Var, lch0 lch0Var, fet fetVar, int i) {
        lch0 lch0Var2 = lch0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1489349331);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(lch0Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, staticColors.m73getBlack400d7_KjU(), vgg0.a(8.0f)), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            String str = lch0Var2.b;
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            pge pgeVar = gqw0.B;
            jm40 jm40Var = jm40.b;
            lgb.v(o7k0.n(jm40Var, 16.0f), o7k0.n(jm40Var, 16.0f), str, R.drawable.icon_globe_new, jM130getWhite600d7_KjU, pgeVar, fetVar2, 196608, 0);
            v8q0.a(lch0Var2.f19800a, dw9.h(1.0f, s5x0.L(jm40Var, 8.0f, 0.0f, 2), true), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarN = o7k0.n(jm40Var, 8.0f);
            lch0Var2 = lch0Var;
            long j = lch0Var2.c;
            zcl zclVar2 = qmk.m;
            zq8.a(0, fetVar2, i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(mm40Var, lch0Var2, i, (byte) 24);
        }
    }

    public boolean D(i5d0 i5d0Var) {
        return false;
    }

    public Object E() {
        throw new IllegalStateException("");
    }
}
