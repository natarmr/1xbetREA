package a;

import android.app.Activity;
import android.graphics.Path;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import android.view.View;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.game.GameStatistic;
import org.xplatform.betting.core.zip.model.zip.game.StatInfo;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tfx {
    public static final ArrayList A(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new cqe0(annotation));
        }
        return arrayList;
    }

    public static final vfx B(View view) {
        view.getClass();
        i0h0 i0h0VarP = hxm0.p(view);
        wfx wfxVar = i0h0VarP instanceof wfx ? (wfx) i0h0VarP : null;
        if (wfxVar == null) {
            throw new byw(kng0.l("Activity '", i0h0VarP.getClass().getSimpleName(), "' не реализует InsetsHolderProvider"));
        }
        vfx vfxVar = ((ApplicationActivity) wfxVar).f1;
        if (vfxVar != null) {
            return vfxVar;
        }
        Intrinsics.h("insetsHolder");
        throw null;
    }

    public static final dfa0 C(c4h c4hVar, c4h c4hVar2) {
        return new dfa0(dyb.r0(q3d.j(uvw.E(Float.valueOf(c4hVar.e), Float.valueOf(c4hVar2.e), ""), uvw.F(Integer.valueOf(c4hVar.h), Integer.valueOf(c4hVar2.h)), uvw.F(Integer.valueOf(c4hVar.i), Integer.valueOf(c4hVar2.i)))), c4hVar.c);
    }

    public static final String D(n410 n410Var, List list) {
        n410Var.getClass();
        list.getClass();
        String str = n410Var.d;
        if (str.length() != 0) {
            return str;
        }
        String strK = zsm0.k(n410Var.c, list, q3d.j(String.valueOf(n410Var.f22877a), String.valueOf(n410Var.b)));
        if (kotlin.text.c.x(strK, ujn.h, false)) {
            return strK;
        }
        if (strK.length() == 0) {
            return "";
        }
        List list2 = u0d.f34849a;
        if (u0d.c(strK)) {
            return "";
        }
        return String.format(Locale.ENGLISH, StringsKt.O(strK, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, strK}, 2));
    }

    public static final mm40 E(mm40 mm40Var) {
        mm40Var.getClass();
        zcl zclVar = qmk.f28987a;
        return o050.P(j120.K(s5x0.N(o050.S(mm40Var), 0.0f, 0.0f, 0.0f, 56.0f, 7), s5x0.u(0.0f, 0.0f, 0.0f, 56.0f, 7)));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        if (a.rek.g(r0).equals(a.rek.g(r1)) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.kgy F(a.mer r5, a.k3u0 r6) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tfx.F(a.mer, a.k3u0):a.kgy");
    }

    public static int G(int i, CharSequence charSequence) {
        char cCharAt;
        char cCharAt2;
        while (i < charSequence.length() && ((cCharAt2 = charSequence.charAt(i)) == ' ' || cCharAt2 == '\t')) {
            i++;
        }
        if (i < charSequence.length() && charSequence.charAt(i) == '\n') {
            while (true) {
                i++;
                if (i >= charSequence.length() || ((cCharAt = charSequence.charAt(i)) != ' ' && cCharAt != '\t')) {
                    break;
                }
            }
        }
        return i;
    }

    public static final vfx H(fet fetVar) {
        Object obj = (Activity) fetVar.k(cr00.f4820a);
        boolean zG = fetVar.g(obj);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = null;
            wfx wfxVar = obj instanceof wfx ? (wfx) obj : null;
            if (wfxVar != null) {
                vfx vfxVar = ((ApplicationActivity) wfxVar).f1;
                if (vfxVar == null) {
                    Intrinsics.h("insetsHolder");
                    throw null;
                }
                objP = vfxVar;
            }
            fetVar.o0(objP);
        }
        return (vfx) objP;
    }

    public static final rzg0 I(ib50 ib50Var, fet fetVar) {
        ib50Var.getClass();
        Set set = ib50Var.f14471a;
        set.getClass();
        boolean zG = fetVar.g(set);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = szg0.a(new qb50(set, (byte) 0));
            fetVar.o0(objP);
        }
        return (rzg0) objP;
    }

    public static final String J(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String lowerCase = sb.toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v1 */
    public static final tas K(h6h0 h6h0Var) {
        ArrayList arrayList;
        Long l;
        vas vasVar;
        ?? arrayList2;
        ArrayList arrayList3;
        Integer num;
        Integer num2;
        vas vasVar2;
        String str;
        StatInfo statInfo;
        Map map;
        Boolean bool;
        h6h0Var.getClass();
        String str2 = h6h0Var.e;
        q3h0 q3h0Var = h6h0Var.q;
        Integer num3 = h6h0Var.d;
        String str3 = h6h0Var.f12529a;
        List<bf90> list = h6h0Var.b;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (bf90 bf90Var : list) {
                bf90Var.getClass();
                Integer num4 = bf90Var.f2492a;
                int iIntValue = num4 != null ? num4.intValue() : 0;
                String str4 = bf90Var.d;
                if (str4 == null) {
                    str4 = "";
                }
                Integer num5 = bf90Var.b;
                int iIntValue2 = num5 != null ? num5.intValue() : 0;
                Integer num6 = bf90Var.c;
                arrayList.add(new df90(iIntValue, new tf90(str4, iIntValue2, num6 != null ? num6.intValue() : 0)));
            }
        } else {
            arrayList = null;
        }
        Integer num7 = h6h0Var.f;
        Integer num8 = h6h0Var.g;
        Integer num9 = h6h0Var.i;
        m380 m380Var = h6h0Var.h;
        if (m380Var != null) {
            vasVar = new vas(m380Var.f21102a, m380Var.b);
            l = null;
        } else {
            l = null;
            vasVar = null;
        }
        String str5 = h6h0Var.j;
        rnq0 rnq0Var = h6h0Var.k;
        Long l2 = rnq0Var != null ? rnq0Var.f30801a : l;
        Integer num10 = rnq0Var != null ? rnq0Var.b : null;
        Integer numValueOf = (rnq0Var == null || (bool = rnq0Var.c) == null) ? null : Integer.valueOf(bool.booleanValue() ? 0 : -1);
        vas vasVar3 = vasVar;
        String str6 = h6h0Var.l;
        xfm0 xfm0Var = h6h0Var.p;
        if (xfm0Var == null || (map = xfm0Var.f40797a) == null) {
            arrayList2 = iun.f15405a;
        } else {
            arrayList2 = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList2.add(nkb.x((Map.Entry) it.next()));
            }
        }
        Map map2 = h6h0Var.o;
        if (map2 != null) {
            arrayList3 = new ArrayList();
            Iterator it2 = map2.entrySet().iterator();
            arrayList2 = arrayList2;
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str7 = (String) entry.getKey();
                ?? r24 = arrayList2;
                List list2 = (List) entry.getValue();
                if (list2.isEmpty()) {
                    vasVar2 = vasVar3;
                    str = str5;
                    statInfo = null;
                } else {
                    Integer intOrNull = StringsKt.toIntOrNull(str7);
                    Integer numValueOf2 = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0);
                    ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        zmo0 zmo0Var = (zmo0) it3.next();
                        Iterator it4 = it3;
                        b7m0 b7m0Var = zmo0Var.f44636a;
                        z6m0 z6m0VarP0 = b7m0Var != null ? ucx.p0(b7m0Var) : z6m0.c;
                        vas vasVar4 = vasVar3;
                        String str8 = zmo0Var.b;
                        if (str8 == null) {
                            str8 = "";
                        }
                        String str9 = str5;
                        String str10 = zmo0Var.c;
                        if (str10 == null) {
                            str10 = "";
                        }
                        String str11 = zmo0Var.d;
                        if (str11 == null) {
                            str11 = "";
                        }
                        arrayList4.add(new GameStatistic(z6m0VarP0, str8, str10, str11));
                        it3 = it4;
                        vasVar3 = vasVar4;
                        str5 = str9;
                    }
                    vasVar2 = vasVar3;
                    str = str5;
                    statInfo = new StatInfo(numValueOf2, arrayList4);
                }
                if (statInfo != null) {
                    arrayList3.add(statInfo);
                }
                num8 = num8;
                num3 = num3;
                it2 = it2;
                arrayList2 = r24;
                num7 = num7;
                vasVar3 = vasVar2;
                str5 = str;
            }
        } else {
            arrayList3 = null;
        }
        ?? r25 = arrayList2;
        Integer num11 = num3;
        Integer num12 = num7;
        Integer num13 = num8;
        vas vasVar5 = vasVar3;
        String str12 = str5;
        Boolean bool2 = h6h0Var.m;
        return new tas(str2, num11, str3, arrayList, num12, num13, num9, vasVar5, str12, l2, num10, numValueOf, str6, r25, arrayList3, bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null, h6h0Var.r, h6h0Var.t, new ubr((q3h0Var == null || (num2 = q3h0Var.f28053a) == null) ? 0 : num2.intValue(), (q3h0Var == null || (num = q3h0Var.b) == null) ? 0 : num.intValue()));
    }

    public static final void L(List list, w03 w03Var) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        w03 w03Var2 = w03Var;
        Path path = w03Var2.f38329a;
        int i = path.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        w03Var2.i();
        w03Var2.j(i);
        z290 z290Var = list2.isEmpty() ? h290.c : (z290) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i2 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i2 < size) {
            z290 z290Var2 = (z290) list2.get(i2);
            if (z290Var2 instanceof h290) {
                w03Var2.c();
                path = path;
                size = size;
                f11 = f11;
                i2 = i2;
                z290Var2 = z290Var2;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (z290Var2 instanceof t290) {
                    t290 t290Var = (t290) z290Var2;
                    float f18 = t290Var.c;
                    f14 += f18;
                    float f19 = t290Var.d;
                    f15 += f19;
                    path.rMoveTo(f18, f19);
                    path = path;
                    f16 = f14;
                    f17 = f15;
                } else if (z290Var2 instanceof l290) {
                    l290 l290Var = (l290) z290Var2;
                    float f20 = l290Var.c;
                    float f21 = l290Var.d;
                    w03Var2.f(f20, f21);
                    f15 = f21;
                    f17 = f15;
                    f14 = f20;
                    f16 = f14;
                } else if (z290Var2 instanceof s290) {
                    s290 s290Var = (s290) z290Var2;
                    float f22 = s290Var.d;
                    float f23 = s290Var.c;
                    path.rLineTo(f23, f22);
                    f14 += f23;
                    f15 += f22;
                } else if (z290Var2 instanceof k290) {
                    k290 k290Var = (k290) z290Var2;
                    float f24 = k290Var.d;
                    float f25 = k290Var.c;
                    w03Var2.e(f25, f24);
                    f14 = f25;
                    f15 = f24;
                } else if (z290Var2 instanceof r290) {
                    float f26 = ((r290) z290Var2).c;
                    path.rLineTo(f26, f11);
                    f14 += f26;
                } else if (z290Var2 instanceof j290) {
                    float f27 = ((j290) z290Var2).c;
                    w03Var2.e(f27, f15);
                    f14 = f27;
                } else if (z290Var2 instanceof x290) {
                    float f28 = ((x290) z290Var2).c;
                    path.rLineTo(f11, f28);
                    f15 += f28;
                } else if (z290Var2 instanceof y290) {
                    float f29 = ((y290) z290Var2).c;
                    w03Var2.e(f14, f29);
                    f15 = f29;
                } else {
                    if (z290Var2 instanceof q290) {
                        q290 q290Var = (q290) z290Var2;
                        path.rCubicTo(q290Var.c, q290Var.d, q290Var.e, q290Var.f, q290Var.g, q290Var.h);
                        f3 = q290Var.e + f14;
                        f4 = q290Var.f + f15;
                        f14 += q290Var.g;
                        f10 = q290Var.h;
                    } else {
                        if (z290Var2 instanceof i290) {
                            i290 i290Var = (i290) z290Var2;
                            path.cubicTo(i290Var.c, i290Var.d, i290Var.e, i290Var.f, i290Var.g, i290Var.h);
                            f3 = i290Var.e;
                            f5 = i290Var.f;
                            f6 = i290Var.g;
                            f7 = i290Var.h;
                        } else if (z290Var2 instanceof v290) {
                            if (z290Var.f43659a) {
                                f8 = f14 - f12;
                                f9 = f15 - f13;
                            } else {
                                f8 = f11;
                                f9 = f8;
                            }
                            v290 v290Var = (v290) z290Var2;
                            path.rCubicTo(f8, f9, v290Var.c, v290Var.d, v290Var.e, v290Var.f);
                            f3 = v290Var.c + f14;
                            f4 = v290Var.d + f15;
                            f14 += v290Var.e;
                            f10 = v290Var.f;
                        } else if (z290Var2 instanceof n290) {
                            if (z290Var.f43659a) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            n290 n290Var = (n290) z290Var2;
                            path.cubicTo(f14, f15, n290Var.c, n290Var.d, n290Var.e, n290Var.f);
                            f3 = n290Var.c;
                            f5 = n290Var.d;
                            f6 = n290Var.e;
                            f7 = n290Var.f;
                        } else if (z290Var2 instanceof u290) {
                            u290 u290Var = (u290) z290Var2;
                            float f30 = u290Var.f;
                            float f31 = u290Var.e;
                            float f32 = u290Var.d;
                            float f33 = u290Var.c;
                            path.rQuadTo(f33, f32, f31, f30);
                            float f34 = f33 + f14;
                            float f35 = f32 + f15;
                            f14 += f31;
                            f15 += f30;
                            f12 = f34;
                            f13 = f35;
                        } else if (z290Var2 instanceof m290) {
                            m290 m290Var = (m290) z290Var2;
                            float f36 = m290Var.f;
                            float f37 = m290Var.e;
                            float f38 = m290Var.d;
                            f3 = m290Var.c;
                            path.quadTo(f3, f38, f37, f36);
                            f15 = f36;
                            f14 = f37;
                            f13 = f38;
                            f12 = f3;
                        } else if (z290Var2 instanceof w290) {
                            if (z290Var.b) {
                                f = f14 - f12;
                                f2 = f15 - f13;
                            } else {
                                f = f11;
                                f2 = f;
                            }
                            w290 w290Var = (w290) z290Var2;
                            float f39 = w290Var.d;
                            float f40 = w290Var.c;
                            path.rQuadTo(f, f2, f40, f39);
                            f3 = f + f14;
                            f4 = f2 + f15;
                            f14 += f40;
                            f15 += f39;
                            f13 = f4;
                            f12 = f3;
                        } else if (z290Var2 instanceof o290) {
                            if (z290Var.b) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            o290 o290Var = (o290) z290Var2;
                            float f41 = o290Var.d;
                            float f42 = o290Var.c;
                            path.quadTo(f14, f15, f42, f41);
                            path = path;
                            size = size;
                            f11 = f11;
                            i2 = i2;
                            f13 = f15;
                            z290Var2 = z290Var2;
                            f15 = f41;
                            f12 = f14;
                            f14 = f42;
                        } else if (z290Var2 instanceof p290) {
                            p290 p290Var = (p290) z290Var2;
                            float f43 = p290Var.h + f14;
                            float f44 = p290Var.i + f15;
                            size = size;
                            f11 = 0.0f;
                            path = path;
                            i2 = i2;
                            y(w03Var, f14, f15, f43, f44, p290Var.c, p290Var.d, p290Var.e, p290Var.f, p290Var.g);
                            f12 = f43;
                            f14 = f12;
                            f13 = f44;
                            f15 = f13;
                            z290Var2 = z290Var2;
                        } else {
                            path = path;
                            size = size;
                            f11 = f11;
                            i2 = i2;
                            if (!(z290Var2 instanceof g290)) {
                                t9f.b();
                                return;
                            }
                            g290 g290Var = (g290) z290Var2;
                            float f45 = g290Var.i;
                            float f46 = g290Var.h;
                            z290Var2 = z290Var2;
                            y(w03Var, f14, f15, f46, f45, g290Var.c, g290Var.d, g290Var.e, g290Var.f, g290Var.g);
                            f13 = f45;
                            f15 = f13;
                            f12 = f46;
                            f14 = f12;
                        }
                        path = path;
                        f14 = f6;
                        f15 = f7;
                        f13 = f5;
                        f12 = f3;
                    }
                    f15 += f10;
                    f13 = f4;
                    f12 = f3;
                }
                z290Var2 = z290Var2;
            }
            i2++;
            list2 = list;
            w03Var2 = w03Var;
            size = size;
            path = path;
            z290Var = z290Var2;
            f11 = f11;
        }
    }

    public static final dxh0 M(zvh0 zvh0Var) {
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

    public static final s8l0 N(dok0 dok0Var, long j, ctf0 ctf0Var) {
        String strA;
        r8l0 p8l0Var;
        String string;
        dok0Var.getClass();
        ctf0Var.getClass();
        long jA = dok0Var.a();
        aok0 aok0Var = aok0.f1205a;
        boolean zEquals = dok0Var.equals(aok0Var);
        bok0 bok0Var = bok0.f2937a;
        if (zEquals) {
            strA = ctf0Var.b.a(R.string.filter_all, Arrays.copyOf(new Object[0], 0));
        } else if (dok0Var instanceof cok0) {
            strA = ((cok0) dok0Var).b;
        } else {
            if (!dok0Var.equals(bok0Var)) {
                t9f.b();
                return null;
            }
            strA = ctf0Var.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0));
        }
        if (dok0Var.equals(aok0Var)) {
            p8l0Var = new p8l0(R.drawable.ic_all);
        } else if (dok0Var instanceof cok0) {
            long j2 = ((cok0) dok0Var).f4705a;
            if (j2 != 0) {
                bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                rz4.s(j2, ".svg", bzuVarD);
                string = ((StringBuilder) bzuVarD.b).toString();
            } else {
                string = "";
            }
            p8l0Var = new q8l0(string);
        } else {
            if (!dok0Var.equals(bok0Var)) {
                t9f.b();
                return null;
            }
            p8l0Var = new p8l0(R.drawable.ic_sports_filter);
        }
        return new s8l0(jA, strA, p8l0Var, j == dok0Var.a());
    }

    public static final void O(CaptureRequest.Builder builder, Object obj, Object obj2) {
        builder.getClass();
        if (obj == null || !(obj instanceof CaptureRequest.Key)) {
            return;
        }
        try {
            builder.set((CaptureRequest.Key) obj, obj2);
        } catch (IllegalArgumentException e) {
            Log.w("CXCP", "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", e);
        }
    }

    public static final void P(CaptureRequest.Builder builder, Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            O(builder, entry.getKey(), entry.getValue());
        }
    }

    public static final void a(mm40 mm40Var, mvy mvyVar, xdr xdrVar, fet fetVar, int i) {
        xdrVar.getClass();
        fetVar.g0(1559857940);
        int i2 = (fetVar.g(mvyVar) ? 32 : 16) | i | (fetVar.i(xdrVar) ? 256 : 128);
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
            if (mvyVar instanceof kvy) {
                fetVar.e0(322109264);
                gfx.e(jm40.b, (kvy) mvyVar, xdrVar, fetVar, (i2 & 896) | 6 | (i2 & 112));
                fetVar.r(false);
            } else {
                if (!mvyVar.equals(lvy.f20734a)) {
                    throw b1j.f(322107030, fetVar, false);
                }
                fetVar.e0(322116258);
                ufx.b(6, fetVar);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, mvyVar, xdrVar, i, (byte) 21);
        }
    }

    public static final void b(g2h g2hVar, l2h l2hVar, fet fetVar, int i) {
        fetVar.g0(-802508683);
        int i2 = (fetVar.g(g2hVar) ? 4 : 2) | i | (fetVar.g(l2hVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zEquals = l2hVar.equals(k2h.f17571a);
            yx7 yx7Var = gqw0.j;
            zsf zsfVar = ihn.f14788a;
            b34.h(zEquals, null, kzn.c(ro4.m0(250, 0, zsfVar, 2), yx7Var, 12).a(kzn.d(ro4.m0(150, 0, null, 6), 0.0f, 2)), kzn.i(ro4.m0(250, 0, zsfVar, 2), yx7Var, 12).a(kzn.e(ro4.m0(100, 0, null, 6), 2)), null, u1c.M(1214430365, new p0z((Object) g2hVar, (byte) 1), fetVar), fetVar, 196608, 18);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(g2hVar, l2hVar, i, (byte) 13);
        }
    }

    public static final void c(mm40 mm40Var, h2h h2hVar, long j, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1353399423);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(h2hVar) ? 32 : 16) | (fetVar2.f(j) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar2, i120.Q(lgb.J(o7k0.n(jm40Var, 16.0f), vgg0.f37379a), j, jd8.n));
            String str = h2hVar.b;
            zfn zfnVar = zaq0.b;
            v8q0.a(str, dw9.h(1.0f, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar2, 0, 24960, 110584);
            v8q0.a(h2hVar.c, o7k0.u(jm40Var, 0.0f, 240.0f, 1), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar2, 0, 24960, 109560);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new my2((byte) 8, i, j, mm40Var, (Object) h2hVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0101  */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    public static final void d(final ir8 ir8Var, float f, float f2, float f3, final ugd ugdVar, fet fetVar, final int i, final int i2) {
        int i3;
        final float f4;
        final float f5;
        float f6;
        boolean z;
        Object objP;
        fetVar.g0(-1648367194);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 1) == 0 && fetVar.d(f)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 2) == 0 && fetVar.d(f2)) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 4) == 0 && fetVar.d(f3)) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if ((i2 & 1) != 0) {
                    zcl zclVar = qmk.f28987a;
                    i3 &= -113;
                    f = 8.0f;
                }
                if ((i2 & 2) != 0) {
                    zcl zclVar2 = qmk.f28987a;
                    i3 &= -897;
                    f6 = 8.0f;
                } else {
                    f6 = f2;
                }
                if ((i2 & 4) != 0) {
                    zcl zclVar3 = qmk.f28987a;
                    i3 &= -7169;
                    f5 = 8.0f;
                }
                fetVar.s();
                mm40 mm40VarL = s5x0.L(ir8Var.b(jm40.b, gqw0.e), 0.0f, f6, 1);
                z = ((((i3 & 112) ^ 48) <= 32 && fetVar.d(f)) || (i3 & 48) == 32) | ((((i3 & 7168) ^ 3072) <= 2048 && fetVar.d(f5)) || (i3 & 3072) == 2048);
                objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new kt20(f, f5);
                    fetVar.o0(objP);
                }
                tj30 tj30Var = (tj30) objP;
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
                jpm0.o(fetVar, tj30Var, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                twn.v((i3 >> 12) & 14, ugdVar, fetVar, true);
                f4 = f6;
            } else {
                fetVar.X();
                if ((i2 & 1) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -7169;
                }
                f6 = f2;
            }
            f5 = f3;
            fetVar.s();
            mm40 mm40VarL2 = s5x0.L(ir8Var.b(jm40.b, gqw0.e), 0.0f, f6, 1);
            z = ((((i3 & 112) ^ 48) <= 32 && fetVar.d(f)) || (i3 & 48) == 32) | ((((i3 & 7168) ^ 3072) <= 2048 && fetVar.d(f5)) || (i3 & 3072) == 2048);
            objP = fetVar.P();
            if (z) {
                objP = new kt20(f, f5);
                fetVar.o0(objP);
            } else {
                objP = new kt20(f, f5);
                fetVar.o0(objP);
            }
            tj30 tj30Var2 = (tj30) objP;
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            twn.v((i3 >> 12) & 14, ugdVar, fetVar, true);
            f4 = f6;
        } else {
            fetVar.X();
            f4 = f2;
            f5 = f3;
        }
        final float f7 = f;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.jt20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tfx.d(ir8Var, f7, f4, f5, ugdVar, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void e(mm40 mm40Var, udl0 udl0Var, boolean z, fet fetVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        int iOrdinal = udl0Var.ordinal();
        if (iOrdinal == 0) {
            fetVar.e0(303033129);
            if (z) {
                fetVar.e0(804119131);
                obb.c(i & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                fetVar.e0(804180821);
                acb.e(i & 14, fetVar, mm40Var);
                fetVar.r(false);
            }
            fetVar.r(false);
            return;
        }
        if (iOrdinal == 1) {
            fetVar.e0(303039055);
            jd8.c(i & 14, fetVar, mm40Var);
            fetVar.r(false);
        } else if (iOrdinal == 2) {
            fetVar.e0(303041233);
            gkb.f(i & 14, fetVar, mm40Var);
            fetVar.r(false);
        } else {
            if (iOrdinal != 3) {
                throw b1j.f(303031596, fetVar, false);
            }
            fetVar.e0(303043308);
            g1x.b(i & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        int i2;
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(-1397685727);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = mm40Var;
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_more_vertically, 6, fetVar), fetVar), null, y860.W(epv0.N(mm40Var2, z ? 1.0f : 0.5f), null, null, z, null, function0, 24), obc.O(R.color.static_white, fetVar), fetVar, 56, 0);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var2, z, function0, i, (byte) 10);
        }
    }

    public static final void g(mm40 mm40Var, r180 r180Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-717113892);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(r180Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            v8q0.a(r180Var.f29666a, o7k0.d(mm40Var, 1.0f), 0L, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, 0, 24960, 109556);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, r180Var, i, (byte) 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(String str, j43 j43Var, fet fetVar, int i) {
        byte b;
        fet fetVar2;
        boolean z;
        j43 j43Var2 = j43Var;
        fet fetVar3 = fetVar;
        fetVar3.g0(-277113418);
        int i2 = i | (fetVar3.g(str) ? 4 : 2) | (fetVar3.g(j43Var2) ? 32 : 16);
        if (fetVar3.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarD);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            long jT = idm0.t(8);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar3.k(zfnVar)).getClass();
            n05 n05Var = new n05(jT, g1t0.g().f42262a.b, idm0.t(1));
            ((g1t0) fetVar3.k(zfnVar)).getClass();
            v8q0.a(str, null, 0L, n05Var, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.n(g1t0.g(), fetVar3), fetVar, i2 & 14, 24576, 114678);
            j43Var2 = j43Var;
            fet fetVar4 = fetVar;
            if (j43Var2.d) {
                fetVar4.e0(1756502508);
                mm40 mm40VarP = o7k0.p(jm40Var, 72.0f, 18.0f);
                zcl zclVar2 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                z = true;
                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, fetVar4, 0, 1), fetVar4, false);
            } else {
                z = true;
                fetVar4.e0(1756789537);
                plc.d(null, j43Var2, new fxe(), fetVar4, i2 & 112, 1);
                fetVar4.r(false);
            }
            fetVar4.r(z);
            fetVar2 = fetVar4;
            b = z;
        } else {
            b = 1;
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m680(str, j43Var2, i, b);
        }
    }

    public static final void i(mm40 mm40Var, i680 i680Var, fet fetVar, int i) {
        i680Var.getClass();
        fetVar.g0(1665848791);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(i680Var) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 2.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            h(rsm0.w(R.string.edit_coupon_maximum_coef, 0, fetVar), i680Var.f14228a, fetVar, 0);
            h(rsm0.w(R.string.edit_coupon_optional_coef, 0, fetVar), i680Var.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l680(mm40Var, i680Var, i, b);
        }
    }

    public static final void j(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(-1375133703);
        int i2 = i | 6 | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 12.0f, 8.0f, 0.0f, 8);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarN, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 16.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(jm40Var, 124.0f), 18.0f)), fqj0Var));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 1.0f), 22.0f)), fqj0Var));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 1.0f), 36.0f)), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 1.0f), 40.0f)), fqj0Var, fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new buv(mm40Var, fqj0Var, i, (byte) 3);
        }
    }

    public static final void k(mm40 mm40Var, boolean z, boolean z2, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        function0.getClass();
        fetVar.g0(1896848275);
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
            yfe0VarU.d = new and0(mm40Var, z, z2, function0, i, (byte) 3);
        }
    }

    public static final void l(ajg0 ajg0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(486607059);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ajg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
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
            uvw.a(null, ajg0Var.f975a, fetVar, 0);
            zcl zclVar = qmk.f28987a;
            bww.s(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), ajg0Var.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(ajg0Var, i, (byte) 10);
        }
    }

    public static final void m(final xhj0 xhj0Var, final Function1 function1, fet fetVar, int i) {
        xhj0Var.getClass();
        function1.getClass();
        fetVar.g0(-1292729693);
        int i2 = (fetVar.g(xhj0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        final byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 60.0f);
            String str = xhj0Var.f40895a;
            zfn zfnVar = zaq0.b;
            rqm rqmVar = new rqm((vui0) new uui0(str, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()), xhj0Var.b, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), null, 48), (pui0) new nui0(Integer.valueOf(R.drawable.ic_glyph_coefficient), null, new m0x(R.drawable.ic_glyph_coefficient, null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), null, null, 0.0f, 242), (pvi0) new evi0("", new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary())), (d4d) null, (tvi0) null, (wui0) null, true, (e900) null, 376);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new Function0() { // from class: a.whj0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = b;
                        xhj0 xhj0Var2 = xhj0Var;
                        Function1 function2 = function1;
                        switch (b2) {
                            case 0:
                                xhj0Var2.getClass();
                                function2.invoke(new gbj0(xhj0Var2));
                                break;
                            default:
                                xhj0Var2.getClass();
                                function2.invoke(new gbj0(xhj0Var2));
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
                objP2 = new Function0() { // from class: a.whj0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        xhj0 xhj0Var2 = xhj0Var;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                xhj0Var2.getClass();
                                function2.invoke(new gbj0(xhj0Var2));
                                break;
                            default:
                                xhj0Var2.getClass();
                                function2.invoke(new gbj0(xhj0Var2));
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
            yfe0VarU.d = new kqh0((Object) xhj0Var, function1, i, (byte) 20);
        }
    }

    public static final void n(mm40 mm40Var, hzj0 hzj0Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        hzj0Var.getClass();
        function1.getClass();
        fetVar.g0(-1970594179);
        byte b = 16;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(hzj0Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(h36.f12370a.a(cqqVar), u1c.M(-1547218499, new fzi0(b, mm40Var, hzj0Var, function1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var, (Object) hzj0Var, (Object) cqqVar, function1, i, (byte) 19);
        }
    }

    public static final void o(mm40 mm40Var, lik0 lik0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        lik0Var.getClass();
        function1.getClass();
        fetVar.g0(-678437537);
        int i2 = i | 6 | (fetVar.g(lik0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, f, 0.0f, 2), 1.0f);
            int iOrdinal = lik0Var.e.ordinal();
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, (iOrdinal == 1 || iOrdinal == 2) ? 8.0f : 0.0f, 0.0f, 0.0f, 13);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dik0.f6144a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new huh0(lik0Var, function1, (byte) 23);
                fetVar.o0(objP2);
            }
            y860.f(xdrVar, mm40VarN, (Function1) objP2, fetVar, 6, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var2, lik0Var, function1, i, (byte) 3);
        }
    }

    public static final void p(final int i, int i2, final boolean z, Function0 function0, mm40 mm40Var, final ugd ugdVar, fet fetVar, int i3) {
        int i4;
        final int i5;
        Function0 function1;
        function0.getClass();
        fetVar.g0(-25181021);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i2;
            i4 |= fetVar.e(i5) ? 32 : 16;
        } else {
            i5 = i2;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            function1 = function0;
            i4 |= fetVar.i(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if ((i3 & 24576) == 0) {
            i4 |= fetVar.g(mm40Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= fetVar.i(ugdVar) ? 131072 : 65536;
        }
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            final l7m0 l7m0VarB = d43.b(z ? 180.0f : 0.0f, null, "Rotate animation", null, fetVar, 3072, 22);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lca lcaVarO = jar0.O(fetVar);
            lca lcaVarA = lcaVarO.a(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), lcaVarO.b, lcaVarO.c, lcaVarO.d);
            zcl zclVar = qmk.f28987a;
            final Function0 function2 = function1;
            hew0.e(mm40VarD, vgg0.a(16.0f), lcaVarA, null, u1c.M(-1177051023, new xdr() { // from class: a.uam0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((y5d) obj).getClass();
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                        jm40 jm40Var = jm40.b;
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                        int iHashCode = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM = fetVar2.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD2);
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
                        Object objP = fetVar2.P();
                        cl5 cl5Var = ukd.f35823a;
                        if (objP == cl5Var) {
                            objP = dw9.j(fetVar2);
                        }
                        mm40 mm40VarW = y860.W(jm40Var, (gy40) objP, null, false, null, function2, 28);
                        thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                        int iHashCode2 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM2 = fetVar2.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, thg0VarA, shdVar);
                        jpm0.o(fetVar2, bh90VarM2, shdVar2);
                        vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                        jpm0.o(fetVar2, mm40VarC1, shdVar4);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 12.0f, 12.0f, 0.0f, 12.0f, 4), 24.0f);
                        pm80 pm80VarF = a8k0.F(i5, 0, fetVar2);
                        zfn zfnVar = zaq0.b;
                        dww.c(pm80VarF, null, mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
                        v8q0.a(rsm0.w(i, 0, fetVar2), dw9.h(1.0f, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 24960, 110588);
                        mm40 mm40VarQ = i120.Q(o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), 24.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.f37379a);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode3 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM3 = fetVar2.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC, shdVar);
                        jpm0.o(fetVar2, bh90VarM3, shdVar2);
                        vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                        jpm0.o(fetVar2, mm40VarC2, shdVar4);
                        pm80 pm80VarF2 = a8k0.F(R.drawable.accordion_drawable_down, 0, fetVar2);
                        mm40 mm40VarB = jr8.f16991a.b(o7k0.n(jm40Var, 16.0f), gqw0.e);
                        l7m0 l7m0Var = l7m0VarB;
                        boolean zG = fetVar2.g(l7m0Var);
                        Object objP2 = fetVar2.P();
                        if (zG || objP2 == cl5Var) {
                            objP2 = new ufp(l7m0Var, (byte) 25);
                            fetVar2.o0(objP2);
                        }
                        dww.c(pm80VarF2, null, i4w0.T(mm40VarB, (Function1) objP2), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
                        fetVar2.r(true);
                        fetVar2.r(true);
                        b34.e(y5d.f42040a, z, i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), null, null, null, u1c.M(-1781621149, new uis(ugdVar, (byte) 9), fetVar2), fetVar2, 1572870, 28);
                        fetVar2.r(true);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 196608, 24);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rbh0(i, i2, z, function0, mm40Var, ugdVar, i3);
        }
    }

    public static final void q(vdp0 vdp0Var, mm40 mm40Var, l7m0 l7m0Var, Function2 function2, fet fetVar, int i) {
        l7m0Var.getClass();
        fetVar.g0(74564180);
        int i2 = (fetVar.g(vdp0Var) ? 4 : 2) | i | 48 | (fetVar.g(l7m0Var) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new f7f0(l7m0Var, (byte) 23);
                fetVar.o0(objP);
            }
            l5d0 l5d0VarA = fgp0.c.a(v3c.Y(objArr, (Function0) objP, fetVar).getValue());
            zfn zfnVar = icp0.b;
            zcl zclVar = qmk.f28987a;
            obc.e(new l5d0[]{l5d0VarA, zfnVar.a(new ycl(2.0f))}, u1c.M(-22714988, new a5k0(vdp0Var, function2), fetVar), fetVar, 48);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 3, i, vdp0Var, mm40Var2, l7m0Var, function2);
        }
    }

    public static final void r(lc00 lc00Var, m9s m9sVar, el40 el40Var, hj40 hj40Var, ctf0 ctf0Var) throws Throwable {
        m9sVar.getClass();
        hj40Var.getClass();
        ctf0Var.getClass();
        yi40 yi40Var = yi40.f42669a;
        String str = m9sVar.i;
        String str2 = (String) CollectionsKt.firstOrNull(m9sVar.m);
        if (str2 == null) {
            str2 = "";
        }
        t(lc00Var, yi40Var, str, str2, el40Var, el40Var.f7980a, hj40Var.c, ctf0Var);
    }

    public static final void s(lc00 lc00Var, m9s m9sVar, el40 el40Var, hj40 hj40Var, ctf0 ctf0Var) throws Throwable {
        m9sVar.getClass();
        hj40Var.getClass();
        ctf0Var.getClass();
        yi40 yi40Var = yi40.b;
        String str = m9sVar.j;
        String str2 = (String) CollectionsKt.firstOrNull(m9sVar.n);
        if (str2 == null) {
            str2 = "";
        }
        t(lc00Var, yi40Var, str, str2, el40Var, el40Var.b, hj40Var.f, ctf0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(lc00 lc00Var, yi40 yi40Var, String str, String str2, el40 el40Var, fl40 fl40Var, List list, ctf0 ctf0Var) throws Throwable {
        int i;
        long j;
        boolean z;
        boolean z2;
        String strA;
        boolean z3;
        Integer numValueOf;
        Throwable th;
        Object next;
        nj40 nj40Var;
        String str3 = str2;
        boolean zS = vdx.S(el40Var, fl40Var);
        List list2 = fl40Var.f9722a;
        cl40 cl40Var = fl40Var.b;
        if (zS) {
            return;
        }
        String strName = yi40Var.name();
        d4d d4dVar = d4d.STATIC_WHITE60;
        w6n w6nVar = w6n.k;
        if (!kotlin.text.c.x(str3, ujn.h, false)) {
            if (str3.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str3)) {
                    str3 = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                }
            }
            str3 = "";
        }
        s2m s2mVar = new s2m(new u6n(d4dVar, w6nVar, new c280(str3, R.drawable.ic_glyph_circle_globe)), str);
        Throwable th2 = null;
        m0x m0xVar = new m0x(gfx.W(cl40Var), null, 6);
        int iW = gfx.W(cl40Var);
        long jM130getWhite600d7_KjU = StaticColors.INSTANCE.m130getWhite600d7_KjU();
        int iOrdinal = cl40Var.ordinal();
        if (iOrdinal == 0) {
            i = R.string.mlbb_side_blue;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                t9f.b();
                return;
            }
            i = R.string.mlbb_side_red;
        }
        p2m p2mVar = new p2m(iW, jM130getWhite600d7_KjU, m0xVar, ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0)));
        int iOrdinal2 = cl40Var.ordinal();
        if (iOrdinal2 == 0) {
            j = ijg.L0;
        } else {
            if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                t9f.b();
                return;
            }
            j = ijg.l0;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String strJ = J(((xi40) it.next()).e);
            if (strJ.length() == 0) {
                nj40Var = nj40.f;
                th = th2;
            } else {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        th = th2;
                        next = th;
                        break;
                    } else {
                        next = it2.next();
                        th = th2;
                        if (J(((jj40) next).b).equals(strJ)) {
                            break;
                        } else {
                            th2 = th;
                        }
                    }
                }
                jj40 jj40Var = (jj40) next;
                nj40Var = jj40Var != null ? jj40Var.e : nj40.f;
            }
            arrayList.add(nj40Var);
            th2 = th;
        }
        Throwable th3 = th2;
        boolean z4 = vdx.D(el40Var.f7980a) && vdx.D(el40Var.b);
        if (z4 && !arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z = false;
                    break;
                } else if (((nj40) it3.next()) != nj40.f) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        Iterator it4 = list2.iterator();
        int i2 = 0;
        while (it4.hasNext()) {
            Object next2 = it4.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw th3;
            }
            xi40 xi40Var = (xi40) next2;
            boolean z5 = z;
            n0x n0xVar = new n0x(xi40Var.c);
            Iterator it5 = it4;
            n0x n0xVar2 = new n0x(xi40Var.d);
            if (z4) {
                z3 = z4;
                if (arrayList.get(i2) != nj40.f) {
                    int iOrdinal3 = ((nj40) arrayList.get(i2)).ordinal();
                    if (iOrdinal3 == 0) {
                        numValueOf = Integer.valueOf(R.drawable.ic_glyph_cyber_ml_position_exp);
                    } else if (iOrdinal3 == 1) {
                        numValueOf = Integer.valueOf(R.drawable.ic_glyph_cyber_ml_position_jungle);
                    } else if (iOrdinal3 == 2) {
                        numValueOf = Integer.valueOf(R.drawable.ic_glyph_cyber_ml_position_mid);
                    } else if (iOrdinal3 == 3) {
                        numValueOf = Integer.valueOf(R.drawable.ic_glyph_cyber_ml_position_gold);
                    } else if (iOrdinal3 != 4) {
                        if (iOrdinal3 != 5) {
                            t9f.b();
                            return;
                        }
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_glyph_cyber_ml_position_roam);
                    }
                } else {
                    numValueOf = z5 ? Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad) : th3;
                }
            } else {
                numValueOf = th3;
                z3 = z4;
            }
            long j2 = xi40Var.f;
            Long lValueOf = Long.valueOf(j2);
            if (j2 <= 0) {
                lValueOf = th3;
            }
            arrayList2.add(new oi40(n0xVar, n0xVar2, numValueOf, lValueOf));
            z = z5;
            it4 = it5;
            z4 = z3;
            i2 = i3;
        }
        i4 i4VarR0 = dyb.r0(arrayList2);
        ri40 ri40VarV = v(R.drawable.ic_glyph_cyber_ml_tower, fl40Var.c);
        ri40 ri40VarV2 = v(R.drawable.ic_glyph_cyber_ml_lord, fl40Var.d);
        ri40 ri40VarV3 = v(R.drawable.ic_glyph_cyber_ml_turtle, fl40Var.e);
        float f = fl40Var.f;
        if (f > 0.0f) {
            DecimalFormat decimalFormat = new DecimalFormat("#.#");
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator('.');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            z2 = true;
            strA = ctf0Var.b.a(R.string.mlbb_gold_thousands, Arrays.copyOf(new Object[]{decimalFormat.format(new BigDecimal(String.valueOf(f)))}, 1));
        } else {
            z2 = true;
            strA = "0";
        }
        lc00Var.add(new si40(strName, s2mVar, p2mVar, j, i4VarR0, dyb.r0(q3d.j(ri40VarV, ri40VarV2, ri40VarV3, new ri40(strA, R.drawable.ic_glyph_cyber_ml_gold, f > 0.0f ? z2 : false)))));
    }

    public static final void u(lc00 lc00Var, cl40 cl40Var, m9s m9sVar, el40 el40Var, hj40 hj40Var, ctf0 ctf0Var) throws Throwable {
        m9sVar.getClass();
        hj40Var.getClass();
        ctf0Var.getClass();
        if (el40Var.f7980a.b != cl40Var && (el40Var.b.b == cl40Var || cl40Var == cl40.BLUE)) {
            s(lc00Var, m9sVar, el40Var, hj40Var, ctf0Var);
        } else {
            r(lc00Var, m9sVar, el40Var, hj40Var, ctf0Var);
        }
    }

    public static final ri40 v(int i, int i2) {
        return new ri40(i2 > 0 ? String.valueOf(i2) : "0", i, i2 > 0);
    }

    public static final qgm0 w(b1u0 b1u0Var, List list, ctf0 ctf0Var, long j, boolean z) {
        String str;
        list.getClass();
        ctf0Var.getClass();
        String str2 = b1u0Var.c;
        String strM = qim0.m(b1u0Var, list);
        if (kotlin.text.c.x(strM, ujn.h, false)) {
            str = strM;
        } else {
            if (strM.length() != 0) {
                List list2 = u0d.f34849a;
                if (!u0d.c(strM)) {
                    strM = String.format(Locale.ENGLISH, StringsKt.O(strM, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, strM}, 2));
                    str = strM;
                }
            }
            str = "";
        }
        ngm0 ngm0Var = new ngm0(j, str2, str, z ? ctf0Var.b.a(R.string.valorant_win, Arrays.copyOf(new Object[0], 0)) : "");
        lsm0 lsm0Var = ctf0Var.b;
        return new qgm0(ngm0Var, dyb.g0(new vem0(lsm0Var.a(R.string.valorant_open_kill, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new vem0(lsm0Var.a(R.string.valorant_open_death, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new vem0(lsm0Var.a(R.string.valorant_multi_kills, Arrays.copyOf(new Object[0], 0)), new eko0(j))));
    }

    public static boolean x(kp9 kp9Var, kp9 kp9Var2) {
        kp9Var.getClass();
        kp9Var2.getClass();
        if (!(kp9Var2 instanceof u9y) || !(kp9Var instanceof mer)) {
            return false;
        }
        u9y u9yVar = (u9y) kp9Var2;
        u9yVar.z().size();
        mer merVar = (mer) kp9Var;
        merVar.z().size();
        List listZ = u9yVar.a().z();
        listZ.getClass();
        List listZ2 = merVar.o1().z();
        listZ2.getClass();
        for (Pair pair : CollectionsKt.T0(listZ, listZ2)) {
            k3u0 k3u0Var = (k3u0) pair.f46059a;
            k3u0 k3u0Var2 = (k3u0) pair.b;
            k3u0Var.getClass();
            boolean z = F((mer) kp9Var2, k3u0Var) instanceof jgy;
            k3u0Var2.getClass();
            if (z != (F(merVar, k3u0Var2) instanceof jgy)) {
                return true;
            }
        }
        return false;
    }

    public static final void y(w03 w03Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            y(w03Var, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            w03Var.f38329a.cubicTo((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            dSin2 = dSin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[RETURN] */
    public static final cqe0 z(Annotation[] annotationArr, swq swqVar) {
        annotationArr.getClass();
        swqVar.getClass();
        for (Annotation annotation : annotationArr) {
            if (Intrinsics.d(bqe0.a(azw.G(azw.F(annotation))).a(), swqVar)) {
                if (annotation != null) {
                    return new cqe0(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new cqe0(annotation);
        }
        return null;
    }
}
