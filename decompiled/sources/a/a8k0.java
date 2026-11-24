package a;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IllformedLocaleException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class a8k0 implements c8k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f430a;

    public static final boolean A() {
        return Build.VERSION.SDK_INT < 30;
    }

    public static final boolean B(m2c0 m2c0Var) {
        m2c0Var.getClass();
        return m2c0Var.S == 0;
    }

    public static final String C(String... strArr) {
        return CollectionsKt.b0(tx3.z(strArr), "&", null, null, null, 62);
    }

    public static final lm40 D(yzj yzjVar, int i) {
        lm40 lm40Var = ((lm40) yzjVar).f20279a.f;
        if (lm40Var == null || (lm40Var.d & i) == 0) {
            return null;
        }
        while (lm40Var != null) {
            int i2 = lm40Var.c;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return lm40Var;
            }
            lm40Var = lm40Var.f;
        }
        return null;
    }

    public static final String E(ew70 ew70Var) {
        Integer num = ew70Var.f8509a;
        String str = null;
        String strM = num != null ? twn.m(num.intValue(), "cybertype=") : null;
        Long l = ew70Var.g;
        String strH = l != null ? h97.h(l.longValue(), "champid=") : null;
        Long l2 = ew70Var.d;
        String strH2 = l2 != null ? h97.h(l2.longValue(), "subsportid=") : null;
        Long l3 = ew70Var.c;
        String strH3 = l3 != null ? h97.h(l3.longValue(), "sportid=") : null;
        String str2 = ew70Var.b;
        if (str2 != null) {
            str = "islive=" + str2.equals("live");
        }
        return "://open/cyberchamp?".concat(C(strM, strH, strH2, strH3, str));
    }

    public static final pm80 F(int i, int i2, fet fetVar) {
        TypedValue typedValue;
        boolean z;
        Context context = (Context) fetVar.k(dy2.b);
        Resources resources = (Resources) fetVar.k(dy2.c);
        btf0 btf0Var = (btf0) fetVar.k(dy2.e);
        synchronized (btf0Var) {
            typedValue = (TypedValue) btf0Var.f3181a.b(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                btf0Var.f3181a.g(i, typedValue);
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && StringsKt.S(charSequence, ".xml")) {
            fetVar.e0(-1771798434);
            Resources.Theme theme = context.getTheme();
            int i3 = typedValue.changingConfigurations;
            u2x u2xVar = (u2x) fetVar.k(dy2.d);
            t2x t2xVar = new t2x(theme, i);
            WeakReference weakReference = (WeakReference) u2xVar.f34967a.get(t2xVar);
            s2x s2xVarM = weakReference != null ? (s2x) weakReference.get() : null;
            if (s2xVarM == null) {
                XmlResourceParser xml = resources.getXml(i);
                k5n0.y(xml);
                if (!Intrinsics.d(xml.getName(), "vector")) {
                    jf4.o("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                    return null;
                }
                s2xVarM = jpm0.m(theme, resources, xml, i3);
                u2xVar.f34967a.put(t2xVar, new WeakReference(s2xVarM));
            }
            s4u0 s4u0VarR = iom0.r(s2xVarM.f31526a, fetVar);
            fetVar.r(false);
            return s4u0VarR;
        }
        fetVar.e0(-1771643000);
        Object theme2 = context.getTheme();
        boolean zG = fetVar.g(charSequence);
        if ((((i2 & 14) ^ 6) <= 4 || !fetVar.e(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zG2 = zG | z | fetVar.g(theme2);
        Object objP = fetVar.P();
        if (zG2 || objP == ukd.f35823a) {
            try {
                Drawable drawable = resources.getDrawable(i, null);
                drawable.getClass();
                objP = new vz2(((BitmapDrawable) drawable).getBitmap());
                fetVar.o0(objP);
            } catch (Exception e) {
                throw new ss3("Error attempting to load resource: " + ((Object) charSequence), e);
            }
        }
        c78 c78Var = new c78((vz2) objP);
        fetVar.r(false);
        return c78Var;
    }

    public static final ak50 G(bch0 bch0Var, fet fetVar) {
        bch0Var.getClass();
        View view = (View) fetVar.k(dy2.f);
        Object obj = (wgu0) fetVar.k(bmd.t);
        boolean zG = fetVar.g(obj) | fetVar.g(view);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new ak50(view, bch0Var);
            fetVar.o0(objP);
        }
        return (ak50) objP;
    }

    public static final Object H(vzg0 vzg0Var, String str, Object obj) {
        Object objA;
        vzg0Var.getClass();
        return (((LinkedHashMap) vzg0Var.b.f38604a).containsKey(str) && (objA = vzg0Var.a(str)) != null) ? objA : obj;
    }

    public static final mm40 I(mm40 mm40Var, float f) {
        return f == 0.0f ? mm40Var : i4w0.U(mm40Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0L, null, false, 0L, 0L, 0, null, 1048319);
    }

    public static final void J(vzg0 vzg0Var, String str, Collection collection, jiy jiyVar, rzg0 rzg0Var) {
        vzg0Var.getClass();
        rzg0Var.getClass();
        lun.f20680a.getClass();
        Bundle bundleV = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
        new uzg0(bundleV, rzg0Var).C(jiyVar, collection);
        vzg0Var.e(str, bundleV);
    }

    public static final String K(ew70 ew70Var) {
        String str = ew70Var.e;
        Integer num = ew70Var.f8509a;
        Long l = ew70Var.c;
        Long l2 = ew70Var.g;
        String str2 = ew70Var.b;
        Long l3 = ew70Var.f;
        Long l4 = ew70Var.d;
        String str3 = null;
        if (Intrinsics.d(str, "cybersection")) {
            boolean z = false;
            boolean z2 = (num == null || l2 == null || l == null || str2 == null) ? false : true;
            boolean z3 = (num == null || l2 != null || l == null) ? false : true;
            boolean z4 = num != null && l2 == null && l == null;
            if (num != null && l2 == null && l != null && l3 != null && str2 != null) {
                z = true;
            }
            if (z2) {
                return E(ew70Var);
            }
            if (z) {
                return "://open/cybergame?".concat(C(str2 != null ? "type=".concat(str2) : null, l != null ? h97.h(l.longValue(), "sportid=") : null, l3 != null ? h97.h(l3.longValue(), "id=") : null, l4 != null ? h97.h(l4.longValue(), "subsportid=") : null));
            }
            if (z3) {
                return "://open/cyberdiscipline?".concat(C(num != null ? twn.m(num.intValue(), "cybertype=") : null, l4 != null ? h97.h(l4.longValue(), "subsportid=") : null, l != null ? h97.h(l.longValue(), "sportid=") : null));
            }
            if (z4) {
                return "://open/cyber?".concat(C(num != null ? twn.m(num.intValue(), "cybertype=") : null));
            }
            return "";
        }
        if (Intrinsics.d(str, "cyberTopChamps")) {
            String strM = num != null ? twn.m(num.intValue(), "cybertype=") : null;
            if (str2 != null) {
                str3 = "islive=" + str2.equals("live");
            }
            return "://open/cybertopchamps?".concat(C(strM, str3));
        }
        if (l3 != null || l4 != null) {
            return "://open/game?".concat(C(str2 != null ? "type=".concat(str2) : null, l != null ? h97.h(l.longValue(), "sportid=") : null, l3 != null ? h97.h(l3.longValue(), "id=") : null, l4 != null ? h97.h(l4.longValue(), "subsportid=") : null));
        }
        if (l2 != null && Intrinsics.d(str, "cyber")) {
            return E(ew70Var);
        }
        String strH = l4 != null ? h97.h(l4.longValue(), "subsportid=") : null;
        return "://open/champs?".concat(C(str2 != null ? "type=".concat(str2) : null, l != null ? h97.h(l.longValue(), "sportid=") : null, l3 != null ? h97.h(l3.longValue(), "id=") : null, strH, l2 != null ? h97.h(l2.longValue(), "champid=") : null));
    }

    public static final xyx L(n9d n9dVar) {
        n9dVar.getClass();
        String str = n9dVar.b;
        int i = n9dVar.c;
        String str2 = i < 0 ? "-" : "";
        long jAbs = Math.abs(i);
        return new xyx(str, str2.concat(String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jAbs / 60), Long.valueOf(jAbs % 60)}, 2))));
    }

    public static final kzz M(qhu qhuVar) {
        prz przVarB;
        qhuVar.getClass();
        Integer num = qhuVar.f28758a;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        LimitTypeEnum.b.getClass();
        LimitTypeEnum limitTypeEnumC = art.c(iIntValue);
        Double d = qhuVar.b;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Integer num2 = qhuVar.c;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Boolean bool = qhuVar.d;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Integer num3 = qhuVar.e;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        Integer num4 = qhuVar.f;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        Long l = qhuVar.g;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str = qhuVar.h;
        if (str != null) {
            prz.b.getClass();
            przVarB = bst.b(str);
        } else {
            przVarB = prz.INACTIVE;
        }
        return new kzz(limitTypeEnumC, dDoubleValue, iIntValue2, zBooleanValue, iIntValue3, iIntValue4, jLongValue, przVarB);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[PHI: r9
  0x0048: PHI (r9v6 float) = (r9v3 float), (r9v7 float) binds: [B:16:0x0054, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:6:0x001d A[PHI: r1
  0x001d: PHI (r1v5 float) = (r1v2 float), (r1v6 float) binds: [B:8:0x0029, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long N(int[] iArr, long j) {
        float f;
        float fIntBitsToFloat;
        float f2;
        float fIntBitsToFloat2;
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) >= 0.0f) {
            f = iArr[0] * (-1.0f);
            fIntBitsToFloat = Float.intBitsToFloat(i);
            if (f > fIntBitsToFloat) {
                f = fIntBitsToFloat;
            }
        } else {
            f = iArr[0] * (-1.0f);
            fIntBitsToFloat = Float.intBitsToFloat(i);
            if (f < fIntBitsToFloat) {
                f = fIntBitsToFloat;
            }
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= 0.0f) {
            f2 = iArr[1] * (-1.0f);
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            if (f2 > fIntBitsToFloat2) {
                f2 = fIntBitsToFloat2;
            }
        } else {
            f2 = iArr[1] * (-1.0f);
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            if (f2 < fIntBitsToFloat2) {
                f2 = fIntBitsToFloat2;
            }
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x017b  */
    /* JADX WARN: Code duplicated, block: B:106:0x018f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0199  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:127:0x020c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0218  */
    /* JADX WARN: Code duplicated, block: B:132:0x021d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0222  */
    /* JADX WARN: Code duplicated, block: B:137:0x0238  */
    /* JADX WARN: Code duplicated, block: B:140:0x024b  */
    /* JADX WARN: Code duplicated, block: B:142:0x025b  */
    /* JADX WARN: Code duplicated, block: B:143:0x025d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0260  */
    /* JADX WARN: Code duplicated, block: B:147:0x0264  */
    /* JADX WARN: Code duplicated, block: B:148:0x0269  */
    /* JADX WARN: Code duplicated, block: B:150:0x0279  */
    /* JADX WARN: Code duplicated, block: B:153:0x028a  */
    /* JADX WARN: Code duplicated, block: B:162:0x02be  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:179:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:182:0x0304  */
    /* JADX WARN: Code duplicated, block: B:189:0x032e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0330  */
    /* JADX WARN: Code duplicated, block: B:191:0x0333  */
    /* JADX WARN: Code duplicated, block: B:193:0x0336  */
    /* JADX WARN: Code duplicated, block: B:194:0x0339  */
    /* JADX WARN: Code duplicated, block: B:196:0x033d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0340  */
    /* JADX WARN: Code duplicated, block: B:200:0x034c  */
    /* JADX WARN: Code duplicated, block: B:201:0x034f  */
    /* JADX WARN: Code duplicated, block: B:204:0x035a  */
    /* JADX WARN: Code duplicated, block: B:206:0x0361  */
    /* JADX WARN: Code duplicated, block: B:207:0x0366  */
    /* JADX WARN: Code duplicated, block: B:210:0x0372  */
    /* JADX WARN: Code duplicated, block: B:211:0x0377  */
    /* JADX WARN: Code duplicated, block: B:213:0x037a  */
    /* JADX WARN: Code duplicated, block: B:251:0x043e  */
    /* JADX WARN: Code duplicated, block: B:253:0x0444  */
    /* JADX WARN: Code duplicated, block: B:256:0x0449  */
    /* JADX WARN: Code duplicated, block: B:319:0x050f  */
    /* JADX WARN: Code duplicated, block: B:322:0x0521  */
    /* JADX WARN: Code duplicated, block: B:328:0x0537  */
    /* JADX WARN: Code duplicated, block: B:342:0x056f  */
    /* JADX WARN: Code duplicated, block: B:371:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:377:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:384:0x060e  */
    /* JADX WARN: Code duplicated, block: B:385:0x0613  */
    /* JADX WARN: Code duplicated, block: B:389:0x063a  */
    /* JADX WARN: Code duplicated, block: B:392:0x064d A[LOOP:10: B:387:0x0634->B:392:0x064d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:396:0x0658  */
    /* JADX WARN: Code duplicated, block: B:397:0x065d  */
    /* JADX WARN: Code duplicated, block: B:400:0x0678  */
    /* JADX WARN: Code duplicated, block: B:402:0x067c  */
    /* JADX WARN: Code duplicated, block: B:405:0x0689  */
    /* JADX WARN: Code duplicated, block: B:407:0x068d  */
    /* JADX WARN: Code duplicated, block: B:410:0x069a  */
    /* JADX WARN: Code duplicated, block: B:416:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:614:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:698:0x0af0  */
    /* JADX WARN: Code duplicated, block: B:699:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:725:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:729:0x0b58  */
    /* JADX WARN: Code duplicated, block: B:742:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:0x0547 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:0x0543 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:0x057b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:760:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:0x0453 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:0x0531 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:0x0608 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:0x0650 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:0x0654 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0137  */
    /* JADX WARN: Code duplicated, block: B:79:0x013c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0141  */
    /* JADX WARN: Code duplicated, block: B:89:0x0157  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0163  */
    /* JADX WARN: Code duplicated, block: B:94:0x0166  */
    /* JADX WARN: Code duplicated, block: B:96:0x016a  */
    /* JADX WARN: Code duplicated, block: B:97:0x016c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0173 A[PHI: r4
  0x0173: PHI (r4v5 int) = (r4v4 int), (r4v6 int) binds: [B:98:0x0171, B:101:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r10v13, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30, types: [kotlin.ranges.a] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [a.h8e0, java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9, types: [a.j6i0] */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v11 */
    /* JADX WARN: Type inference failed for: r30v12 */
    /* JADX WARN: Type inference failed for: r30v13 */
    /* JADX WARN: Type inference failed for: r30v14 */
    /* JADX WARN: Type inference failed for: r30v15 */
    /* JADX WARN: Type inference failed for: r30v16 */
    /* JADX WARN: Type inference failed for: r30v17 */
    /* JADX WARN: Type inference failed for: r30v18 */
    /* JADX WARN: Type inference failed for: r30v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r31v11 */
    /* JADX WARN: Type inference failed for: r31v12 */
    /* JADX WARN: Type inference failed for: r31v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [kotlin.ranges.IntRange] */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v15 ??, still in use, count: 2, list:
          (r8v15 ??) from 0x05ce: PHI (r8 I:??) = (r8v12 ??), (r8v15 ??) binds: [B:368:0x05cc, B:792:0x05ce] A[DONT_GENERATE, DONT_INLINE]
          (r8v15 ?? I:??[OBJECT, ARRAY]) from 0x05c1: CHECK_CAST (a.gip0) (r8v15 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final a.h8e0 O(a.j6e0 r41, a.j6i0 r42) {
        /*
            Method dump skipped, instruction units count: 2996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a8k0.O(a.j6e0, a.j6i0):a.h8e0");
    }

    public static final wcp0 P(Pair pair, String str, List list) {
        Object obj = pair.b;
        Object obj2 = pair.f46059a;
        str.getClass();
        list.getClass();
        if (str.length() > 0) {
            String str2 = (String) CollectionsKt.firstOrNull(list);
            if (str2 == null) {
                str2 = "";
            }
            c5a0 c5a0Var = new c5a0(new c280(vsm0.s(((Number) obj2).longValue(), str2), R.drawable.ic_glyph_placeholder_player));
            String str3 = (String) CollectionsKt.W(1, list);
            return new pcp0(c5a0Var, new c5a0(new c280(vsm0.s(((Number) obj).longValue(), str3 != null ? str3 : ""), R.drawable.ic_glyph_placeholder_player)), str);
        }
        String str4 = (String) CollectionsKt.firstOrNull(list);
        if (str4 == null) {
            str4 = "";
        }
        c5a0 c5a0Var2 = new c5a0(new c280(vsm0.s(((Number) obj2).longValue(), str4), R.drawable.ic_glyph_placeholder_player));
        String str5 = (String) CollectionsKt.W(1, list);
        return new ucp0(c5a0Var2, new c5a0(new c280(vsm0.s(((Number) obj).longValue(), str5 != null ? str5 : ""), R.drawable.ic_glyph_placeholder_player)));
    }

    public static final void Q(List list, List list2) {
        List list3 = u0d.f34849a;
        ImageView imageView = (ImageView) CollectionsKt.U(list);
        ImageView imageView2 = (ImageView) list.get(1);
        String str = (String) CollectionsKt.firstOrNull(list2);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.W(1, list2);
        String str3 = str2 != null ? str2 : "";
        imageView.getClass();
        imageView2.getClass();
        qzw qzwVar = qzw.b;
        u0d.m(imageView, qzwVar, str, R.drawable.no_photo_short_statistic_placeholder);
        imageView2.setVisibility(0);
        u0d.m(imageView2, qzwVar, str3, R.drawable.no_photo_short_statistic_placeholder);
    }

    public static mm40 R(float f, l7m0 l7m0Var, int i) {
        boolean z = (i & 1) != 0;
        zsf zsfVar = ihn.f14788a;
        if ((i & 8) != 0) {
            f = 0.0f;
        }
        if ((i & 16) != 0) {
            l7m0Var = null;
        }
        zsfVar.getClass();
        return new oly(z, zsfVar, f, l7m0Var);
    }

    public static final void c(final mm40 mm40Var, final a4x a4xVar, xcz xczVar, final p0s p0sVar, final hh80 hh80Var, final ow3 ow3Var, yx7 yx7Var, qkq qkqVar, boolean z, vf80 vf80Var, ugd ugdVar, fet fetVar, final int i) {
        int i2;
        hh80 hh80Var2;
        ugd ugdVar2;
        final xcz xczVar2;
        final yx7 yx7Var2;
        final qkq qkqVar2;
        final boolean z2;
        final vf80 vf80Var2;
        xcz xczVarA;
        qkq qkqVar3;
        yx7 yx7Var3;
        vf80 vf80VarB;
        int i3;
        boolean z3;
        a4xVar.getClass();
        fetVar.g0(1790448912);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(p0sVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            hh80Var2 = hh80Var;
            i2 |= fetVar.g(hh80Var2) ? 16384 : 8192;
        } else {
            hh80Var2 = hh80Var;
        }
        int i4 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i4 |= fetVar.g(ow3Var) ? 1048576 : 524288;
        }
        int i5 = 12582912 | i4;
        if ((100663296 & i) == 0) {
            i5 = 46137344 | i4;
        }
        int i6 = 805306368 | i5;
        if (fetVar.U(i6 & 1, (306783379 & i6) != 306783378)) {
            fetVar.Z();
            int i7 = i & 1;
            Object obj = ukd.f35823a;
            if (i7 == 0 || fetVar.B()) {
                xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                yx7 yx7Var4 = gqw0.j;
                sjj sjjVarA = wzk0.a(fetVar);
                boolean zG = fetVar.g(sjjVarA);
                Object objP = fetVar.P();
                if (zG || objP == obj) {
                    objP = new iuj(sjjVarA);
                    fetVar.o0(objP);
                }
                qkqVar3 = (iuj) objP;
                yx7Var3 = yx7Var4;
                vf80VarB = xf80.b(fetVar);
                i3 = i6 & (-234881921);
                z3 = true;
            } else {
                fetVar.X();
                xczVarA = xczVar;
                yx7Var3 = yx7Var;
                qkqVar3 = qkqVar;
                vf80VarB = vf80Var;
                i3 = i6 & (-234881921);
                z3 = z;
            }
            fetVar.s();
            boolean zE = ((i3 & 7168) == 2048) | fetVar.e(a4xVar.size());
            Object objP2 = fetVar.P();
            if (zE || objP2 == obj) {
                objP2 = Integer.valueOf(kbc.f0(a4xVar.size(), p0sVar));
                fetVar.o0(objP2);
            }
            int iIntValue = ((Number) objP2).intValue();
            boolean z4 = z3;
            boolean zE2 = fetVar.e(iIntValue) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(a4xVar)));
            Object objP3 = fetVar.P();
            if (zE2 || objP3 == obj) {
                ugdVar2 = ugdVar;
                objP3 = new s7x((byte) 1, iIntValue, ugdVar2, a4xVar);
                fetVar.o0(objP3);
            } else {
                ugdVar2 = ugdVar;
            }
            int i8 = i3 >> 6;
            vf80 vf80Var3 = vf80VarB;
            xcz xczVar3 = xczVarA;
            b8k0.f(mm40Var, xczVar3, hh80Var2, false, ow3Var, yx7Var3, qkqVar3, z4, vf80Var3, (Function1) objP3, fetVar, (i3 & 14) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (i8 & 29360128), 0);
            xczVar2 = xczVar3;
            yx7Var2 = yx7Var3;
            qkqVar2 = qkqVar3;
            z2 = z4;
            vf80Var2 = vf80Var3;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            xczVar2 = xczVar;
            yx7Var2 = yx7Var;
            qkqVar2 = qkqVar;
            z2 = z;
            vf80Var2 = vf80Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final ugd ugdVar3 = ugdVar2;
            yfe0VarU.d = new Function2() { // from class: a.v7x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    a8k0.c(mm40Var, a4xVar, xczVar2, p0sVar, hh80Var, ow3Var, yx7Var2, qkqVar2, z2, vf80Var2, ugdVar3, (fet) obj2, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(ry6 ry6Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i) {
        int i2;
        ry6Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar.g0(-1292047103);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ry6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function3) ? 131072 : 65536;
        }
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            vbw0.h(u1c.M(1131493871, new w720(ry6Var, function0, b), fetVar), u1c.M(1189476144, new w720(ry6Var, function3, b2), fetVar), u1c.M(1247458417, new eyn(ry6Var, function1, function2, (byte) 21), fetVar), fetVar, (i2 & 14) | 3504, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp(ry6Var, function0, function1, function2, function3, i);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(247090968);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            qrq qrqVar = j1t0.f15753a;
            long j = qmk.r;
            y9q0 y9q0VarT = ibm0.t(new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.F, 16646109), fetVar);
            mm40Var2 = jm40.b;
            str2 = str;
            v8q0.a(str2, mm40Var2, 0L, new n05(qmk.p, j, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 10, 0, null, y9q0VarT, fetVar, ((i2 >> 3) & 14) | 48, 24960, 110580);
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var2, str2, i, (byte) 29);
        }
    }

    public static final void f(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var, boolean z) {
        ugd ugdVar3;
        ugd ugdVar4;
        boolean z2;
        fetVar.g0(-874563583);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | 16;
        boolean z3 = false;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
                z3 = z;
            } else if (fetVar.k(bmd.n) == k6z.b) {
                z3 = true;
            }
            fetVar.s();
            boolean zH = fetVar.h(z3);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new kp2((byte) 5, z3);
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
            ugdVar4 = ugdVar2;
            ugdVar4.F(mrv.k0(jm40Var, "SCORE"), fetVar, 54);
            mm40 mm40VarK0 = mrv.k0(jm40Var, Request.INFO);
            zcl zclVar = qmk.f28987a;
            ugdVar3 = ugdVar;
            ugdVar3.F(s5x0.N(mm40VarK0, 0.0f, 0.0f, 8.0f, 0.0f, 11), fetVar, 48);
            fetVar.r(true);
            z2 = z3;
        } else {
            ugdVar3 = ugdVar;
            ugdVar4 = ugdVar2;
            fetVar.X();
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gka(mm40Var, z2, ugdVar3, ugdVar4, i, (byte) 5);
        }
    }

    public static final void g(mm40 mm40Var, yl90 yl90Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        yl90Var.getClass();
        function1.getClass();
        fetVar.g0(-930209121);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(yl90Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(h36.f12370a.a(cqqVar), u1c.M(867768159, new o090((byte) 7, mm40Var, (p6t0) yl90Var, function1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 21, i, (Object) mm40Var, (Object) yl90Var, (Object) cqqVar, (Object) function1);
        }
    }

    public static final void h(mm40 mm40Var, pz40 pz40Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        fetVar.g0(1634191839);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = jgk0.b(new gg90(xczVarA, (byte) 9));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new dl2((byte) 6, null, l7m0Var, function1);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, xczVarA, (Function2) objP2);
            mm40 mm40VarQ = qjj.Q(mm40Var);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7), fetVar);
            boolean zG = ((i2 & 112) == 32) | fetVar.g(xczVarA) | ((i2 & 7168) == 2048);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                objP3 = new jl40((Object) pz40Var, (Object) xczVarA, (Object) function2, (byte) 24);
                fetVar.o0(objP3);
            }
            b8k0.e(mm40VarQ, xczVarA, ch80VarG, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s6a0(mm40Var, pz40Var, function1, function2, i);
        }
    }

    public static final void i(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1436091202);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fqj0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80Var = new lh80(xfn.a(fetVar).c, 8.0f, xfn.a(fetVar).c, 32.0f);
            boolean z = (((i2 & 112) ^ 48) > 32 && fetVar.g(fqj0Var)) || (i2 & 48) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new yq5(fqj0Var, b);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, i2 & 14, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gc30(mm40Var, fqj0Var, i, b);
        }
    }

    public static final void j(mm40 mm40Var, bbn bbnVar, float f, ezj ezjVar, gy40 gy40Var, Function2 function2, fet fetVar, int i) {
        int i2;
        ezjVar.getClass();
        gy40Var.getClass();
        function2.getClass();
        fetVar.g0(57713235);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bbnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar.g(ezjVar) : fetVar.i(ezjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(gy40Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (!fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.X();
        } else if (bbnVar instanceof zan) {
            fetVar.e0(1348492109);
            k(o7k0.d(mm40Var, 1.0f), ((zan) bbnVar).f44078a, f, ezjVar, gy40Var, function2, fetVar, i2 & 524160);
            fetVar.r(false);
        } else {
            if (!bbnVar.equals(abn.f587a)) {
                throw b1j.f(-372144535, fetVar, false);
            }
            fetVar.e0(1348925644);
            m(0, fetVar, o7k0.d(mm40Var, 1.0f));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cnh0(mm40Var, bbnVar, f, ezjVar, gy40Var, function2, i, (byte) 1);
        }
    }

    public static final void k(mm40 mm40Var, i4 i4Var, float f, ezj ezjVar, gy40 gy40Var, Function2 function2, fet fetVar, int i) {
        int i2;
        float f2;
        gy40 gy40Var2;
        fetVar.g0(-754895152);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(i4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f2 = f;
            i2 |= fetVar.d(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar.g(ezjVar) : fetVar.i(ezjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            gy40Var2 = gy40Var;
            i2 |= fetVar.g(gy40Var2) ? 16384 : 8192;
        } else {
            gy40Var2 = gy40Var;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarQ = i120.Q(lgb.J(s5x0.I(o7k0.d(mm40Var, 1.0f), gnh0.b), gnh0.c), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            v3c.r(s5x0.L(jm40.b, 0.0f, 8.0f, 1), new cjm(i4Var, xim.b), f2, gy40Var2, ezjVar, function2, fetVar, (i2 & 896) | ((i2 >> 3) & 7168) | (57344 & (i2 << 3)) | (i2 & 458752), 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dnh0(mm40Var, i4Var, f, ezjVar, gy40Var, function2, i, (byte) 1);
        }
    }

    public static final void l(Function1 function1, nzi0 nzi0Var, mm40 mm40Var, fet fetVar, int i) {
        function1.getClass();
        nzi0Var.getClass();
        fetVar.g0(872712048);
        byte b = 2;
        int i2 = i | (fetVar.i(function1) ? 4 : 2) | (fetVar.g(nzi0Var) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = ozi0.f26102a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wvi0((byte) 9);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new lzi0(nzi0Var, function1, b);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, mm40Var, function2, null, (Function1) objP3, fetVar, ((i2 >> 3) & 112) | 390, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(function1, (hej0) nzi0Var, mm40Var, i, (byte) 1);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(985662621);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(s5x0.I(mm40Var, gnh0.b), gnh0.f11587a), gnh0.c), vbc.d0(vqm.f37862a, fetVar, 6, 0)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void n(mm40 mm40Var, float f, long j, Function2 function2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i, int i2) {
        long backgroundContent;
        int i3;
        boolean z;
        ugd ugdVar4;
        ugd ugdVar5;
        ugd ugdVar6;
        yfe0 yfe0VarU;
        boolean z2;
        Object objP;
        int i4;
        fetVar.g0(1548018481);
        byte b = 4;
        int i5 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.d(f) ? 32 : 16);
        if ((i2 & 4) == 0) {
            backgroundContent = j;
            int i6 = fetVar.f(backgroundContent) ? 256 : 128;
            i3 = i5 | i6;
            if ((i & 3072) == 0) {
                if (fetVar.i(function2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                fetVar.Z();
                if ((i & 1) == 0 && !fetVar.B()) {
                    fetVar.X();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                } else if ((i2 & 4) != 0) {
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    i3 &= -897;
                }
                fetVar.s();
                mm40 mm40VarE0 = o2e.e0(i120.Q(lgb.J(mm40Var, vgg0.a(f)), backgroundContent, jd8.n), "SPORT_BASIC_EVENT_CARD");
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new x4a0(function2, b);
                    fetVar.o0(objP);
                }
                tj30 tj30Var = (tj30) objP;
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
                jpm0.o(fetVar, tj30Var, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                if (function2 == null) {
                    fetVar.e0(2025964095);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1727921666);
                    h97.q((i3 >> 9) & 14, fetVar, function2, false);
                }
                ugdVar4 = ugdVar;
                ugdVar4.invoke(fetVar, 6);
                ugdVar5 = ugdVar2;
                ugdVar5.invoke(fetVar, 6);
                ugdVar6 = ugdVar3;
                ugdVar6.invoke(fetVar, 6);
                fetVar.r(true);
            } else {
                ugdVar4 = ugdVar;
                ugdVar5 = ugdVar2;
                ugdVar6 = ugdVar3;
                fetVar.X();
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new f0l0(mm40Var, f, backgroundContent, function2, ugdVar4, ugdVar5, ugdVar6, i, i2);
            }
        }
        backgroundContent = j;
        i3 = i5 | i6;
        if ((i & 3072) == 0) {
            if (fetVar.i(function2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            fetVar.Z();
            if ((i & 1) == 0) {
                if ((i2 & 4) != 0) {
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                i3 &= -897;
            }
            fetVar.s();
            mm40 mm40VarE1 = o2e.e0(i120.Q(lgb.J(mm40Var, vgg0.a(f)), backgroundContent, jd8.n), "SPORT_BASIC_EVENT_CARD");
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP = fetVar.P();
            if (z2) {
                objP = new x4a0(function2, b);
                fetVar.o0(objP);
            } else {
                objP = new x4a0(function2, b);
                fetVar.o0(objP);
            }
            tj30 tj30Var2 = (tj30) objP;
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
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
            if (function2 == null) {
                fetVar.e0(2025964095);
                fetVar.r(false);
            } else {
                fetVar.e0(1727921666);
                h97.q((i3 >> 9) & 14, fetVar, function2, false);
            }
            ugdVar4 = ugdVar;
            ugdVar4.invoke(fetVar, 6);
            ugdVar5 = ugdVar2;
            ugdVar5.invoke(fetVar, 6);
            ugdVar6 = ugdVar3;
            ugdVar6.invoke(fetVar, 6);
            fetVar.r(true);
        } else {
            ugdVar4 = ugdVar;
            ugdVar5 = ugdVar2;
            ugdVar6 = ugdVar3;
            fetVar.X();
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f0l0(mm40Var, f, backgroundContent, function2, ugdVar4, ugdVar5, ugdVar6, i, i2);
        }
    }

    public static final void o(pwv0 pwv0Var, d0m0 d0m0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1978244122);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(pwv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(d0m0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            String name = vui.class.getName();
            Context applicationContext = ((Context) fetVar.k(dy2.b)).getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                throw new ss3((byte) 0);
            }
            riu0 riu0VarA = ms00.a(fetVar);
            if (riu0VarA == null) {
                throw new tiu0();
            }
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new sue0(application, d0m0Var, (byte) 27);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG = fetVar.g(riu0VarA) | fetVar.g(name);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                ojg ojgVar = new ojg((byte) 1);
                zfc zfcVar = new zfc(function0, (byte) 7);
                tre0 tre0Var = sre0.f32672a;
                ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                qbx qbxVarB = ojgVar.b();
                piu0 piu0VarG = riu0VarA.g();
                vbf vbfVar = vbf.b;
                piu0VarG.getClass();
                vbfVar.getClass();
                objP2 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
                fetVar.o0(objP2);
            }
            Object obj2 = ((kgd) objP2).b;
            if (obj2 == null) {
                hny.u("null cannot be cast to non-null type org.xplatform.statistic.stage.impl.core.di.dialog.StageNetBottomSheetComponent");
                return;
            }
            i3t0 i3t0Var = (i3t0) n4c.Y(sre0.f32672a.b(f0m0.class), null, new fiu0(Collections.singletonMap(f0m0.class, ((vui) obj2).g)), fetVar, 14);
            pz40 pz40VarY = i3t0Var.y(fetVar);
            pwv0Var.e(u1c.M(115723515, new rqc0(d0m0Var, (byte) 28), fetVar));
            pwv0Var.a(u1c.M(1049095505, new wfc(pz40VarY, i3t0Var, b), fetVar));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) pwv0Var, (Object) d0m0Var, i, (byte) 12);
        }
    }

    public static final lel0 p(List list, dfl0 dfl0Var) {
        String strV = v(list, "disciplineHeader", dfl0Var != null ? dfl0Var.c : null);
        String strV2 = v(list, "disciplineHeaderTablet", dfl0Var != null ? dfl0Var.d : null);
        String strV3 = v(list, "defaultChamp", dfl0Var != null ? dfl0Var.e : null);
        String strV4 = v(list, "defaultChampTablet", dfl0Var != null ? dfl0Var.f : null);
        String strV5 = v(list, "defaultChampHeaderTablet", dfl0Var != null ? dfl0Var.h : null);
        String strV6 = v(list, "defaultChampHeader", dfl0Var != null ? dfl0Var.g : null);
        return new lel0(v(list, "disciplineIcon", dfl0Var != null ? dfl0Var.f6006a : null), v(list, "popularImage", dfl0Var != null ? dfl0Var.b : null), strV, strV2, strV3, strV4, strV6, strV5, v(list, "gameBackground", dfl0Var != null ? dfl0Var.i : null), v(list, "disciplineIconBW", ""), v(list, "feedImageVertical", dfl0Var != null ? dfl0Var.k : null), v(list, "feedImageHorizontal", dfl0Var != null ? dfl0Var.l : null), v(list, "feedImageSquare", dfl0Var != null ? dfl0Var.m : null), v(list, "disciplineIcon3D", ""), v(list, "eventFocusDisciplineHeader", ""), v(list, "headerFocusDisciplineHeader", ""), v(list, "defaultOpponentHeader", ""), v(list, "defaultOpponentHeaderTablet", ""));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    public static final boolean q(List list) {
        boolean z;
        p9e0 p9e0Var = list != null ? (p9e0) CollectionsKt.W(0, list) : null;
        p9e0 p9e0Var2 = list != null ? (p9e0) CollectionsKt.W(1, list) : null;
        boolean zL = CollectionsKt.L(q3d.j(qie.POSITION_WITH_CHANGE, qie.POSITION, qie.ICON), p9e0Var != null ? p9e0Var.b : null);
        if (CollectionsKt.L(q3d.j(qie.TEAM, qie.PLAYER), p9e0Var2 != null ? p9e0Var2.b : null)) {
            String str = p9e0Var2 != null ? p9e0Var2.k : null;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        String str2 = p9e0Var2 != null ? p9e0Var2.j : null;
        return zL && z && ((list != null ? list.size() : 0) > 2) && !(str2 == null || str2.length() == 0);
    }

    public static final int r(float f) {
        return ((int) (f >= 0.0f ? Math.ceil(f) : Math.floor(f))) * (-1);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0049  */
    public static final Locale s() {
        Locale localeBuild;
        Locale locale = Locale.getDefault();
        locale.getClass();
        try {
            localeBuild = new Locale.Builder().setLocale(locale).build();
            localeBuild.getClass();
        } catch (IllformedLocaleException unused) {
            String language = locale.getLanguage();
            language.getClass();
            Locale localeForLanguageTag = Locale.forLanguageTag(kotlin.text.c.s(StringsKt.u0(language).toString(), '_', '-'));
            if (Intrinsics.d(localeForLanguageTag, Locale.ROOT)) {
                localeForLanguageTag = null;
            } else {
                String language2 = localeForLanguageTag.getLanguage();
                language2.getClass();
                if (StringsKt.W(language2)) {
                    localeForLanguageTag = null;
                }
            }
            if (localeForLanguageTag != null) {
                locale = localeForLanguageTag;
            }
            localeBuild = locale;
        }
        try {
            Locale localeBuild2 = new Locale.Builder().setLocale(localeBuild).setUnicodeLocaleKeyword("nu", "latn").build();
            localeBuild2.getClass();
            return localeBuild2;
        } catch (IllformedLocaleException unused2) {
            return localeBuild;
        }
    }

    public static final jiy t(l4 l4Var, bld bldVar, String str) {
        jiy jiyVarA = l4Var.a(bldVar, str);
        if (jiyVarA != null) {
            return jiyVarA;
        }
        ny9.a0(l4Var.c(), str);
        throw null;
    }

    public static final jiy u(l4 l4Var, bwn bwnVar, Object obj) {
        obj.getClass();
        jiy jiyVarB = l4Var.b(bwnVar, obj);
        if (jiyVarB != null) {
            return jiyVarB;
        }
        sgy sgyVarB = sre0.f32672a.b(obj.getClass());
        sgy sgyVarC = l4Var.c();
        sgyVarC.getClass();
        String strJ = sgyVarB.J();
        if (strJ == null) {
            strJ = String.valueOf(sgyVarB);
        }
        ny9.a0(sgyVarC, strJ);
        throw null;
    }

    public static final String v(List list, String str, String str2) {
        Object next;
        rel0 rel0Var;
        String str3;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((xel0) next).f40749a, str));
            xel0 xel0Var = (xel0) next;
            if (xel0Var != null && (rel0Var = xel0Var.b) != null && (str3 = rel0Var.f30341a) != null) {
                return str3;
            }
        }
        return str2 == null ? "" : str2;
    }

    public static final String w(String str, List list, cys0 cys0Var) {
        str.getClass();
        list.getClass();
        cys0Var.getClass();
        if (cys0Var != cys0.c || str.length() != 0) {
            return str;
        }
        y3n0 y3n0Var = (y3n0) CollectionsKt.firstOrNull(list);
        String str2 = y3n0Var != null ? y3n0Var.b : null;
        if (str2 == null) {
            str2 = "";
        }
        if (kotlin.text.c.x(str2, ujn.h, false)) {
            return str2;
        }
        if (str2.length() != 0) {
            List list2 = u0d.f34849a;
            if (!u0d.c(str2)) {
                return String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
            }
        }
        return "";
    }

    public static final int x(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    public static final Object y(vzg0 vzg0Var, String str, jiy jiyVar, rzg0 rzg0Var) {
        rzg0Var.getClass();
        Bundle bundle = (Bundle) vzg0Var.a(str);
        if (bundle == null) {
            return null;
        }
        try {
            return new tzg0(bundle, rzg0Var).w(jiyVar);
        } catch (fhi0 | IllegalArgumentException unused) {
            return null;
        }
    }

    public static final boolean z(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    @Override // a.c8k0
    public final float a(View view, ViewGroup viewGroup) {
        switch (this.f430a) {
            case 0:
                return view.getTranslationX() - viewGroup.getWidth();
            case 1:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
            case 2:
                return view.getTranslationX() + viewGroup.getWidth();
            default:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    @Override // a.c8k0
    public float b(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }
}
