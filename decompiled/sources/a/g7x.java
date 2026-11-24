package a;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g7x {
    public static ColorStateList A(int i, Context context, TypedArray typedArray) {
        int resourceId;
        ColorStateList colorStateListN0;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListN0 = jiq0.n0(resourceId, context)) == null) ? typedArray.getColorStateList(i) : colorStateListN0;
    }

    public static ColorStateList B(Context context, ywu ywuVar, int i) {
        int resourceId;
        ColorStateList colorStateListN0;
        TypedArray typedArray = (TypedArray) ywuVar.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListN0 = jiq0.n0(resourceId, context)) == null) ? ywuVar.m(i) : colorStateListN0;
    }

    public static int C(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable D(int i, Context context, TypedArray typedArray) {
        int resourceId;
        Drawable drawableU;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableU = epv0.U(resourceId, context)) == null) ? typedArray.getDrawable(i) : drawableU;
    }

    public static final ArrayList E(dvk0 dvk0Var) {
        List list = dvk0Var.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof luk0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final sgy F(fhy fhyVar) {
        if (fhyVar instanceof sgy) {
            return (sgy) fhyVar;
        }
        Object obj = null;
        if (!(fhyVar instanceof miy)) {
            ohq.u(fhyVar, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        List upperBounds = ((miy) fhyVar).getUpperBounds();
        for (Object obj2 : upperBounds) {
            fhy fhyVarO = ((kiy) obj2).o();
            xgy xgyVar = fhyVarO instanceof xgy ? (xgy) fhyVarO : null;
            if (xgyVar != null && xgyVar.V() != rlc.INTERFACE && xgyVar.V() != rlc.ANNOTATION_CLASS) {
                obj = obj2;
                break;
            }
        }
        kiy kiyVar = (kiy) obj;
        if (kiyVar == null) {
            kiyVar = (kiy) CollectionsKt.firstOrNull(upperBounds);
        }
        return kiyVar != null ? G(kiyVar) : sre0.f32672a.b(Object.class);
    }

    public static final sgy G(kiy kiyVar) {
        kiyVar.getClass();
        fhy fhyVarO = kiyVar.o();
        if (fhyVarO != null) {
            return F(fhyVarO);
        }
        ohq.u(kiyVar, "Cannot calculate JVM erasure for type: ");
        return null;
    }

    public static float H(int i, String[] strArr) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        v4i0.h(f, "Motion easing control point value must be between 0 and 1; instead got: ");
        return 0.0f;
    }

    public static final int I(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static String J(String str) {
        bzu bzuVar;
        str.getClass();
        if (StringsKt.O(str, "playerlogo", false)) {
            bzuVar = new bzu((byte) 23);
            bzuVar.g(str);
        } else {
            bzuVar = new bzu((byte) 23);
            bzuVar.g("playerlogo");
            bzuVar.g(str);
        }
        return ((StringBuilder) bzuVar.b).toString();
    }

    public static final Pair K(vhh0 vhh0Var) {
        if (vhh0Var instanceof shh0) {
            shh0 shh0Var = (shh0) vhh0Var;
            return new Pair(shh0Var.f32212a, shh0Var.b);
        }
        if (!(vhh0Var instanceof rhh0)) {
            return new Pair("", "");
        }
        rhh0 rhh0Var = (rhh0) vhh0Var;
        return new Pair(rhh0Var.f30490a, rhh0Var.b);
    }

    public static final String L(k0e0 k0e0Var, List list) {
        k0e0Var.getClass();
        list.getClass();
        String str = k0e0Var.d;
        if (str.length() != 0) {
            return str;
        }
        String strK = zsm0.k(k0e0Var.c, list, q3d.j(String.valueOf(k0e0Var.f17462a), String.valueOf(k0e0Var.b)));
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

    public static final boolean M(dvk0 dvk0Var) {
        btk0 btk0Var;
        ArrayList<luk0> arrayListE = E(dvk0Var);
        ArrayList arrayList = new ArrayList(r3d.q(arrayListE, 10));
        for (luk0 luk0Var : arrayListE) {
            if (luk0Var != null) {
                if (luk0Var instanceof ztk0) {
                    btk0Var = dvk0Var.k.f27666a;
                } else if (luk0Var instanceof cuk0) {
                    btk0Var = dvk0Var.o.f25833a;
                } else if (luk0Var instanceof euk0) {
                    btk0Var = dvk0Var.l.f31083a;
                } else if (luk0Var instanceof huk0) {
                    btk0Var = dvk0Var.n.f3282a;
                } else if (luk0Var instanceof iuk0) {
                    btk0Var = dvk0Var.i.f8473a;
                } else if (luk0Var instanceof juk0) {
                    btk0Var = dvk0Var.m.f10220a;
                } else if (luk0Var instanceof kuk0) {
                    btk0Var = dvk0Var.p.f17256a;
                } else if (luk0Var instanceof utk0) {
                    btk0Var = dvk0Var.q.f11738a;
                } else if (luk0Var instanceof ytk0) {
                    btk0Var = dvk0Var.r.f11886a;
                } else if (luk0Var instanceof auk0) {
                    btk0Var = dvk0Var.s.f20633a;
                } else if (luk0Var instanceof xtk0) {
                    btk0Var = dvk0Var.t.f8380a;
                } else if (luk0Var instanceof duk0) {
                    btk0Var = dvk0Var.u.f29303a;
                } else if (luk0Var instanceof buk0) {
                    btk0Var = dvk0Var.v.f24105a;
                } else if (luk0Var instanceof wtk0) {
                    btk0Var = dvk0Var.w.f6659a;
                } else if (luk0Var instanceof guk0) {
                    btk0Var = dvk0Var.x.f1530a;
                } else if (luk0Var instanceof vtk0) {
                    btk0Var = dvk0Var.y.f4942a;
                } else if (luk0Var instanceof fuk0) {
                    btk0Var = dvk0Var.z.f32777a;
                }
                arrayList.add(Boolean.valueOf(O(btk0Var)));
            }
            t9f.b();
            return false;
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public static final boolean N(dvk0 dvk0Var) {
        dvk0Var.getClass();
        List list = dvk0Var.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof puk0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (!((Boolean) it2.next()).booleanValue()) {
                            return false;
                        }
                    }
                }
                return true;
            }
            puk0 puk0Var = (puk0) it.next();
            if (puk0Var != null) {
                if (puk0Var instanceof muk0) {
                    if (dvk0Var.f == null) {
                        z = true;
                    }
                } else if (puk0Var instanceof nuk0) {
                    if (dvk0Var.g == null) {
                        z = true;
                    }
                } else if (puk0Var instanceof ouk0) {
                    if (dvk0Var.h == null) {
                        z = true;
                    }
                }
                arrayList2.add(Boolean.valueOf(z));
            }
            t9f.b();
            return false;
        }
    }

    public static final boolean O(btk0 btk0Var) {
        btk0Var.getClass();
        return (btk0Var instanceof zsk0) && !(btk0Var instanceof xsk0);
    }

    public static final boolean P(btk0 btk0Var) {
        return (btk0Var instanceof zsk0) && (btk0Var instanceof vsk0);
    }

    public static final boolean Q(btk0 btk0Var) {
        return (btk0Var instanceof zsk0) && (btk0Var instanceof wsk0);
    }

    public static final boolean R(List list, List list2) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list2) {
            if (((ueo) obj).d == 3) {
                arrayListU.add(obj);
            }
        }
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj2 : list) {
            linkedHashMap.put(Integer.valueOf(((su6) obj2).v), obj2);
        }
        if (arrayListU.isEmpty()) {
            return false;
        }
        Iterator it = arrayListU.iterator();
        while (it.hasNext()) {
            if (linkedHashMap.containsKey(Integer.valueOf((int) ((ueo) it.next()).f35538a))) {
                return true;
            }
        }
        return false;
    }

    public static boolean S(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean T(String str, String str2) {
        return str.startsWith(str2.concat(Separators.LPAREN)) && str.endsWith(Separators.RPAREN);
    }

    public static final long U(x6x x6xVar, ma80 ma80Var, v6x v6xVar, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = x6xVar.g;
        if (ma80Var != null) {
            int i = v6xVar.f36896a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (ma80Var == ma80.b) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jE = ne60.e(V(x6xVar, ma80Var, v6xVar), j2);
        if (z || !x6xVar.i) {
            return jE;
        }
        return 0L;
    }

    public static final long V(x6x x6xVar, ma80 ma80Var, v6x v6xVar) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (ma80Var == null) {
            return x6xVar.c;
        }
        int i = v6xVar.f36896a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (x6xVar.c >> 32));
        } else {
            if (i != 2) {
                return x6xVar.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (x6xVar.c & 4294967295L));
        }
        if (ma80Var == ma80.b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static TimeInterpolator W(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            jf4.o("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!T(strValueOf, "cubic-bezier") && !T(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!T(strValueOf, "cubic-bezier")) {
            if (T(strValueOf, "path")) {
                return new PathInterpolator(gfx.E(vqd.k(1, 5, strValueOf)));
            }
            jf4.o("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(Separators.COMMA);
        if (strArrSplit.length == 4) {
            return new PathInterpolator(H(0, strArrSplit), H(1, strArrSplit), H(2, strArrSplit), H(3, strArrSplit));
        }
        ohq.h(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        return null;
    }

    public static lul0 X(Context context) {
        TypedValue typedValueQ = n6x.Q(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = rpd0.H;
        TypedArray typedArrayObtainStyledAttributes = typedValueQ == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueQ.resourceId, iArr);
        lul0 lul0Var = new lul0();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            lul0Var.b(f);
            lul0Var.a(f2);
            typedArrayObtainStyledAttributes.recycle();
            return lul0Var;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final boolean Y(vhh0 vhh0Var) {
        return (vhh0Var instanceof shh0) || (vhh0Var instanceof rhh0);
    }

    public static final nas Z(su10 su10Var) {
        sip sipVar = sip.c;
        su10Var.getClass();
        return t(su10Var, sipVar, 0L, 0L, 0L, "", 0L);
    }

    public static final void a(final j6q0 j6q0Var, final q7q0 q7q0Var, final boolean z, final boolean z2, final boolean z3, final Function1 function1, fet fetVar, final int i) {
        int i2;
        boolean z4;
        long jM130getWhite600d7_KjU;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        zx7 zx7Var = gqw0.e;
        fetVar2.g0(689110688);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar2.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(j6q0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(q7q0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.h(z2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= fetVar2.h(z3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= fetVar2.i(function1) ? 1048576 : 524288;
        }
        if (fetVar2.U(i2 & 1, (i2 & 599187) != 599186)) {
            boolean z5 = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = Boolean.valueOf(Intrinsics.d(q7q0Var, q7q0.f28265a));
                fetVar2.o0(objP);
            }
            if (((Boolean) objP).booleanValue()) {
                fetVar2.e0(810422921);
                jM130getWhite600d7_KjU = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                z4 = false;
            } else {
                z4 = false;
                fetVar2.e0(810424167);
                jM130getWhite600d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m130getWhite600d7_KjU();
            }
            fetVar2.r(z4);
            int i4 = i2;
            l7m0 l7m0VarB = m5k0.b(jM130getWhite600d7_KjU, null, fetVar, 0, 14);
            fetVar2 = fetVar;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP2;
            if (j6q0Var instanceof g6q0) {
                fetVar2.e0(-646450090);
                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2);
                long j = ((y3d) l7m0VarB.getValue()).f41946a;
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = o7k0.n(s5x0.L(jm40Var, 2.0f, 0.0f, 2), 20.0f);
                boolean z6 = (i4 & 3670016) == 1048576;
                Object objP3 = fetVar2.P();
                if (z6 || objP3 == cl5Var) {
                    objP3 = new pme0(function1, (byte) 23);
                    fetVar2.o0(objP3);
                }
                dww.c(pm80VarF, null, o2e.e0(y860.W(mm40VarN, gy40Var, null, z2, null, (Function0) objP3, 24), "CHEVRON_DOWN_ICON"), j, fetVar2, 56, 0);
                fetVar2.r(false);
            } else {
                boolean z7 = j6q0Var instanceof h6q0;
                pcy pcyVar = e7z.u1;
                if (z7) {
                    fetVar2.e0(-645737865);
                    mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
                    boolean z8 = (i4 & 3670016) == 1048576;
                    Object objP4 = fetVar2.P();
                    if (z8 || objP4 == cl5Var) {
                        objP4 = new pme0(function1, (byte) 24);
                        fetVar2.o0(objP4);
                    }
                    mm40 mm40VarW = y860.W(mm40VarC, gy40Var, null, z2, null, (Function0) objP4, 24);
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar4);
                    jpm0.o(fetVar2, bh90VarM, shdVar3);
                    vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, shdVar);
                    pm80 pm80VarF2 = a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar2);
                    long j2 = ((y3d) l7m0VarB.getValue()).f41946a;
                    zcl zclVar2 = qmk.f28987a;
                    dww.c(pm80VarF2, null, o7k0.n(s5x0.N(jm40Var, 22.0f, 0.0f, 2.0f, 0.0f, 10), 20.0f), j2, fetVar2, 56, 0);
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    if (!Intrinsics.d(j6q0Var, i6q0.f14254a)) {
                        throw b1j.f(810430363, fetVar2, false);
                    }
                    fetVar2.e0(-644841252);
                    mm40 mm40VarC2 = o7k0.c(jm40Var, 1.0f);
                    boolean z9 = (i4 & 3670016) == 1048576;
                    Object objP5 = fetVar2.P();
                    if (z9 || objP5 == cl5Var) {
                        objP5 = new pme0(function1, (byte) 25);
                        fetVar2.o0(objP5);
                    }
                    mm40 mm40VarW2 = y860.W(mm40VarC2, gy40Var, null, z2, null, (Function0) objP5, 24);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, shdVar4);
                    jpm0.o(fetVar2, bh90VarM2, shdVar3);
                    vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar);
                    boolean z10 = (i4 & 7168) == 2048;
                    Object objP6 = fetVar2.P();
                    if (z10 || objP6 == cl5Var) {
                        objP6 = Integer.valueOf(z ? R.drawable.ic_glyph_show : R.drawable.ic_glyph_hide);
                        fetVar2.o0(objP6);
                    }
                    int iIntValue = ((Number) objP6).intValue();
                    pm80 pm80VarF3 = a8k0.F(iIntValue, 0, fetVar2);
                    long j3 = ((y3d) l7m0VarB.getValue()).f41946a;
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(o7k0.n(s5x0.N(jm40Var, 22.0f, 0.0f, 2.0f, 0.0f, 10), 20.0f), "RIGHT_CONTAINER_ICON");
                    boolean zE = fetVar2.e(iIntValue);
                    Object objP7 = fetVar2.P();
                    if (zE || objP7 == cl5Var) {
                        objP7 = new dx2(iIntValue, (byte) 29);
                        fetVar2.o0(objP7);
                    }
                    dww.c(pm80VarF3, null, pai0.a(mm40VarE0, false, (Function1) objP7), j3, fetVar2, 56, 0);
                    fetVar2.r(true);
                    fetVar2.r(false);
                }
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.xbg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g7x.a(j6q0Var, q7q0Var, z, z2, z3, function1, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final nas a0(su10 su10Var, sip sipVar, long j) {
        su10Var.getClass();
        return t(su10Var, sipVar, 0L, 0L, 0L, "", j);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0201  */
    /* JADX WARN: Code duplicated, block: B:104:0x0213  */
    /* JADX WARN: Code duplicated, block: B:105:0x0215  */
    /* JADX WARN: Code duplicated, block: B:109:0x021e  */
    /* JADX WARN: Code duplicated, block: B:112:0x025d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0261  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:120:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:121:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x02da  */
    /* JADX WARN: Code duplicated, block: B:128:0x02de  */
    /* JADX WARN: Code duplicated, block: B:131:0x031b  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0128  */
    /* JADX WARN: Code duplicated, block: B:86:0x014a  */
    /* JADX WARN: Code duplicated, block: B:87:0x014d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0157  */
    /* JADX WARN: Code duplicated, block: B:94:0x0194  */
    /* JADX WARN: Code duplicated, block: B:95:0x0198  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01eb  */
    public static final void b(n6q0 n6q0Var, boolean z, boolean z2, boolean z3, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z4;
        byte b;
        pcy pcyVar;
        boolean z5;
        Object objP;
        boolean z6;
        Object objP2;
        int i3;
        boolean z7;
        Object objP3;
        fet fetVar2 = fetVar;
        ljc ljcVar = jd8.n;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        zx7 zx7Var = gqw0.e;
        fetVar2.g0(-1931576272);
        int i4 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i2 = (fetVar2.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(n6q0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= fetVar2.h(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.h(z3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        if (fetVar2.U(i2 & 1, (i2 & 74899) != 74898)) {
            Object objP4 = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP4 == cl5Var) {
                objP4 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP4;
            if (n6q0Var == null) {
                b = -1;
            } else {
                if (n6q0Var instanceof k6q0) {
                    b = 0;
                } else if (n6q0Var instanceof l6q0) {
                    b = 1;
                } else if (n6q0Var instanceof m6q0) {
                    b = 4;
                } else {
                    b = -2;
                }
                if (b != 0) {
                    pcyVar = e7z.u1;
                    if (b != 1) {
                        fetVar2.e0(383983417);
                        mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
                        if ((i2 & 458752) == 131072) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objP = fetVar2.P();
                        if (z5 || objP == cl5Var) {
                            objP = new pme0(function1, (byte) 26);
                            fetVar2.o0(objP);
                        }
                        mm40 mm40VarW = y860.W(mm40VarC, gy40Var, null, z2, null, (Function0) objP, 24);
                        tj30 tj30VarC = zq8.c(zx7Var, false);
                        int iHashCode = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM = fetVar2.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC, shdVar4);
                        jpm0.o(fetVar2, bh90VarM, shdVar3);
                        vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
                        jpm0.o(fetVar2, mm40VarC0, shdVar);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarJ = lgb.J(o7k0.n(s5x0.L(jm40Var, 6.0f, 0.0f, 2), 32.0f), vgg0.a(6.0f));
                        zfn zfnVar = zaq0.b;
                        mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), ljcVar);
                        tj30 tj30VarC2 = zq8.c(zx7Var, false);
                        int iHashCode2 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM2 = fetVar2.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC2, shdVar4);
                        jpm0.o(fetVar2, bh90VarM2, shdVar3);
                        vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                        jpm0.o(fetVar2, mm40VarC1, shdVar);
                        if ((i2 & 896) == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objP2 = fetVar2.P();
                        if (z6 || objP2 == cl5Var) {
                            if (z) {
                                i3 = R.drawable.ic_glyph_show;
                            } else {
                                i3 = R.drawable.ic_glyph_hide;
                            }
                            objP2 = Integer.valueOf(i3);
                            fetVar2.o0(objP2);
                        }
                        dww.c(a8k0.F(((Number) objP2).intValue(), 0, fetVar2), null, o7k0.n(s5x0.L(jm40Var, 2.0f, 0.0f, 2), 20.0f), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
                        ohs0.x(fetVar2, true, true, false);
                    } else {
                        if (b != 2) {
                            fetVar2.e0(385450120);
                            mm40 mm40VarC2 = o7k0.c(jm40Var, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(mm40VarC2, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                            if ((i2 & 458752) == 131072) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            objP3 = fetVar2.P();
                            if (z7 || objP3 == cl5Var) {
                                objP3 = new pme0(function1, (byte) 27);
                                fetVar2.o0(objP3);
                            }
                            mm40 mm40VarW2 = y860.W(mm40VarN, gy40Var, null, z2, null, (Function0) objP3, 24);
                            tj30 tj30VarC3 = zq8.c(zx7Var, false);
                            int iHashCode3 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM3 = fetVar2.m();
                            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarW2);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, tj30VarC3, shdVar4);
                            jpm0.o(fetVar2, bh90VarM3, shdVar3);
                            vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                            jpm0.o(fetVar2, mm40VarC3, shdVar);
                            mm40 mm40VarQ2 = i120.Q(lgb.J(o7k0.n(s5x0.L(jm40Var, 2.0f, 0.0f, 2), 32.0f), vgg0.a(6.0f)), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), ljcVar);
                            tj30 tj30VarC4 = zq8.c(zx7Var, false);
                            int iHashCode4 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM4 = fetVar2.m();
                            mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarQ2);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, tj30VarC4, shdVar4);
                            jpm0.o(fetVar2, bh90VarM4, shdVar3);
                            vqd.u(iHashCode4, fetVar2, shdVar2, fetVar2);
                            jpm0.o(fetVar2, mm40VarC4, shdVar);
                            n6q0Var.getClass();
                            hny.b();
                            return;
                        }
                        if (b != 3) {
                            fetVar2.e0(386833929);
                            n6q0Var.getClass();
                            hny.b();
                            return;
                        } else {
                            if (b == 4) {
                                throw b1j.f(-818907335, fetVar2, false);
                            }
                            fetVar2.e0(390752050);
                            zcl zclVar3 = qmk.f28987a;
                            m6q0 m6q0Var = (m6q0) n6q0Var;
                            int i5 = i2 << 3;
                            c(m6q0Var.f21285a, m6q0Var.b, z4, z3, fetVar2, (i5 & 458752) | (i2 & 14) | (57344 & i5));
                            fetVar2 = fetVar2;
                            fetVar2.r(false);
                        }
                    }
                } else {
                    fetVar2.e0(383546813);
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2);
                    long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                    zcl zclVar4 = qmk.f28987a;
                    dww.c(pm80VarF, null, o7k0.n(s5x0.L(jm40Var, 10.0f, 0.0f, 2), 20.0f), secondary, fetVar2, 56, 0);
                    fetVar2.r(false);
                }
            }
            if (b != 0) {
                pcyVar = e7z.u1;
                if (b != 1) {
                    fetVar2.e0(383983417);
                    mm40 mm40VarC5 = o7k0.c(jm40Var, 1.0f);
                    if ((i2 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objP = fetVar2.P();
                    if (z5) {
                        objP = new pme0(function1, (byte) 26);
                        fetVar2.o0(objP);
                    } else {
                        objP = new pme0(function1, (byte) 26);
                        fetVar2.o0(objP);
                    }
                    mm40 mm40VarW3 = y860.W(mm40VarC5, gy40Var, null, z2, null, (Function0) objP, 24);
                    tj30 tj30VarC5 = zq8.c(zx7Var, false);
                    int iHashCode5 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM5 = fetVar2.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar2, mm40VarW3);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC5, shdVar4);
                    jpm0.o(fetVar2, bh90VarM5, shdVar3);
                    vqd.u(iHashCode5, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC6, shdVar);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarJ2 = lgb.J(o7k0.n(s5x0.L(jm40Var, 6.0f, 0.0f, 2), 32.0f), vgg0.a(6.0f));
                    zfn zfnVar2 = zaq0.b;
                    mm40 mm40VarQ3 = i120.Q(mm40VarJ2, ((ThemeColors) fetVar2.k(zfnVar2)).getBackgroundContent(), ljcVar);
                    tj30 tj30VarC6 = zq8.c(zx7Var, false);
                    int iHashCode6 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM6 = fetVar2.m();
                    mm40 mm40VarC7 = kbc.c0(fetVar2, mm40VarQ3);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC6, shdVar4);
                    jpm0.o(fetVar2, bh90VarM6, shdVar3);
                    vqd.u(iHashCode6, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC7, shdVar);
                    if ((i2 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objP2 = fetVar2.P();
                    if (z6) {
                        if (z) {
                            i3 = R.drawable.ic_glyph_show;
                        } else {
                            i3 = R.drawable.ic_glyph_hide;
                        }
                        objP2 = Integer.valueOf(i3);
                        fetVar2.o0(objP2);
                    } else {
                        if (z) {
                            i3 = R.drawable.ic_glyph_show;
                        } else {
                            i3 = R.drawable.ic_glyph_hide;
                        }
                        objP2 = Integer.valueOf(i3);
                        fetVar2.o0(objP2);
                    }
                    dww.c(a8k0.F(((Number) objP2).intValue(), 0, fetVar2), null, o7k0.n(s5x0.L(jm40Var, 2.0f, 0.0f, 2), 20.0f), ((ThemeColors) fetVar2.k(zfnVar2)).getPrimary(), fetVar2, 56, 0);
                    ohs0.x(fetVar2, true, true, false);
                } else {
                    if (b != 2) {
                        fetVar2.e0(385450120);
                        mm40 mm40VarC8 = o7k0.c(jm40Var, 1.0f);
                        zcl zclVar6 = qmk.f28987a;
                        mm40 mm40VarN2 = s5x0.N(mm40VarC8, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                        if ((i2 & 458752) == 131072) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        objP3 = fetVar2.P();
                        if (z7) {
                            objP3 = new pme0(function1, (byte) 27);
                            fetVar2.o0(objP3);
                        } else {
                            objP3 = new pme0(function1, (byte) 27);
                            fetVar2.o0(objP3);
                        }
                        mm40 mm40VarW4 = y860.W(mm40VarN2, gy40Var, null, z2, null, (Function0) objP3, 24);
                        tj30 tj30VarC7 = zq8.c(zx7Var, false);
                        int iHashCode7 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM7 = fetVar2.m();
                        mm40 mm40VarC9 = kbc.c0(fetVar2, mm40VarW4);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC7, shdVar4);
                        jpm0.o(fetVar2, bh90VarM7, shdVar3);
                        vqd.u(iHashCode7, fetVar2, shdVar2, fetVar2);
                        jpm0.o(fetVar2, mm40VarC9, shdVar);
                        mm40 mm40VarQ4 = i120.Q(lgb.J(o7k0.n(s5x0.L(jm40Var, 2.0f, 0.0f, 2), 32.0f), vgg0.a(6.0f)), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), ljcVar);
                        tj30 tj30VarC8 = zq8.c(zx7Var, false);
                        int iHashCode8 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM8 = fetVar2.m();
                        mm40 mm40VarC10 = kbc.c0(fetVar2, mm40VarQ4);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC8, shdVar4);
                        jpm0.o(fetVar2, bh90VarM8, shdVar3);
                        vqd.u(iHashCode8, fetVar2, shdVar2, fetVar2);
                        jpm0.o(fetVar2, mm40VarC10, shdVar);
                        n6q0Var.getClass();
                        hny.b();
                        return;
                    }
                    if (b != 3) {
                        fetVar2.e0(386833929);
                        n6q0Var.getClass();
                        hny.b();
                        return;
                    } else {
                        if (b == 4) {
                            throw b1j.f(-818907335, fetVar2, false);
                        }
                        fetVar2.e0(390752050);
                        zcl zclVar7 = qmk.f28987a;
                        m6q0 m6q0Var2 = (m6q0) n6q0Var;
                        int i6 = i2 << 3;
                        c(m6q0Var2.f21285a, m6q0Var2.b, z4, z3, fetVar2, (i6 & 458752) | (i2 & 14) | (57344 & i6));
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    }
                }
            } else {
                fetVar2.e0(383546813);
                pm80 pm80VarF2 = a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2);
                long secondary2 = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                zcl zclVar8 = qmk.f28987a;
                dww.c(pm80VarF2, null, o7k0.n(s5x0.L(jm40Var, 10.0f, 0.0f, 2), 20.0f), secondary2, fetVar2, 56, 0);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s5n(n6q0Var, z, z2, z3, function1, i);
        }
    }

    public static final qk80 b0(jzy jzyVar) {
        jzyVar.getClass();
        String str = jzyVar.b;
        String str2 = jzyVar.e;
        String str3 = jzyVar.f;
        String str4 = jzyVar.k;
        String str5 = jzyVar.l;
        String str6 = jzyVar.m;
        String str7 = jzyVar.n;
        int i = jzyVar.f17436a;
        String str8 = jzyVar.c;
        String str9 = jzyVar.d;
        return new qk80(i, jzyVar.g, jzyVar.h, jzyVar.i, jzyVar.j, str, str2, str3, str4, str5, str6, str7, str8, str9, jzyVar.o, jzyVar.p);
    }

    public static final void c(String str, y3d y3dVar, boolean z, boolean z2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1392152153);
        int i3 = i & 6;
        mm40 mm40VarC = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(mm40VarC) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(12.0f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(y3dVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            cqq cqqVar = (cqq) fetVar.k(h36.f12370a);
            if (z2) {
                mm40VarC = o7k0.c(mm40VarC, 1.0f);
            }
            mm40 mm40Var = mm40VarC;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean zG = fetVar.g(cqqVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new f7n(cqqVar);
                fetVar.o0(objP2);
            }
            mm40 mm40VarN = s5x0.N(y860.W(mm40Var, gy40Var, null, z, null, (Function0) objP2, 24), 0.0f, 0.0f, 12.0f, 0.0f, 11);
            tj30 tj30VarC = zq8.c(gqw0.f, false);
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
            s((i2 >> 3) & 1008, y3dVar, fetVar, null, str);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw5(str, y3dVar, z, z2, i);
        }
    }

    public static final ke90 c0(qe90 qe90Var) {
        qe90Var.getClass();
        String str = qe90Var.f28573a;
        String str2 = str == null ? "" : str;
        String str3 = qe90Var.b;
        String str4 = str3 == null ? "" : str3;
        Integer num = qe90Var.d;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = qe90Var.c;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        String str5 = qe90Var.e;
        String str6 = str5 == null ? "" : str5;
        String str7 = qe90Var.f;
        String str8 = str7 == null ? "" : str7;
        String str9 = qe90Var.g;
        return new ke90(str2, str4, iIntValue2, iIntValue, str6, str8, str9 == null ? "" : str9);
    }

    public static final void d(mm40 mm40Var, ugd ugdVar, xdr xdrVar, xdr xdrVar2, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        ugd ugdVar4;
        ugd ugdVar5;
        pfx pfxVarI;
        fetVar.g0(45291530);
        int i2 = i | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(xdrVar2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).e;
            int i3 = q33Var.e().d;
            Integer numValueOf = Integer.valueOf(i3);
            Integer numValueOf2 = null;
            if (i3 == 0) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                fetVar.e0(660859474);
                View view = (View) fetVar.k(dy2.f);
                WeakHashMap weakHashMap2 = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(view);
                if (xiv0VarA != null && (pfxVarI = xiv0VarA.f40966a.i(2)) != null) {
                    numValueOf2 = Integer.valueOf(pfxVarI.d);
                }
                fetVar.r(false);
                numValueOf = numValueOf2;
            } else {
                fetVar.e0(575501827);
                fetVar.r(false);
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            boolean zE = fetVar.e(iIntValue);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new mq8(iIntValue, (byte) 3);
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
            ugdVar.F(mrv.k0(jm40Var, "MEDIA_ID"), fetVar, 54);
            if (xdrVar == null) {
                fetVar.e0(-1667015701);
                fetVar.r(false);
            } else {
                fetVar.e0(-2131984682);
                w6x.v(((i2 >> 3) & 112) | 6, xdrVar, mrv.k0(jm40Var, "COMPANY_LOGO_ID"), fetVar, false);
            }
            if (xdrVar2 == null) {
                fetVar.e0(-1666937333);
                fetVar.r(false);
            } else {
                fetVar.e0(-2131982154);
                w6x.v(((i2 >> 6) & 112) | 6, xdrVar2, mrv.k0(jm40Var, "PARTNER_LOGO_ID"), fetVar, false);
            }
            ugdVar4 = ugdVar2;
            ugdVar4.F(mrv.k0(jm40Var, "STEP_PROGRESS_BAR_ID"), fetVar, 54);
            mm40 mm40VarK0 = mrv.k0(jm40Var, "APP_VERSION_ID");
            ugdVar5 = ugdVar3;
            ugdVar5.F(mm40VarK0, fetVar, 54);
            fetVar.r(true);
        } else {
            ugdVar4 = ugdVar2;
            ugdVar5 = ugdVar3;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nq00(mm40Var, ugdVar, xdrVar, xdrVar2, ugdVar4, ugdVar5, i, (byte) 0);
        }
    }

    public static final bxb0 d0(hxb0 hxb0Var) {
        hxb0Var.getClass();
        String str = hxb0Var.f13808a;
        gxb0 gxb0Var = hxb0Var.c;
        String strK = "";
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        String str2 = gxb0Var != null ? gxb0Var.b : null;
        if (str2 == null) {
            str2 = "";
        }
        String strConcat = "cyberstatistic/v1/image/".concat(str2);
        if (strConcat.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strConcat, ujn.h, false) || kotlin.text.c.x(strConcat, "https://", false)) {
            sb.setLength(0);
            sb.append(strConcat);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strConcat, '/'));
        }
        String string = sb.toString();
        String str3 = gxb0Var != null ? gxb0Var.f12072a : null;
        if (str3 == null) {
            str3 = "";
        }
        axb0 axb0Var = new axb0(string, str3);
        Long l = hxb0Var.b;
        if (l != null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setGroupingSeparator(' ');
            strK = kng0.k("$ ", new DecimalFormat("#,###", decimalFormatSymbols).format(l.longValue()));
        }
        return new bxb0(str, axb0Var, strK);
    }

    public static final void e(yhg0 yhg0Var, mm40 mm40Var, String str, y9q0 y9q0Var, fet fetVar, int i, int i2) {
        yhg0Var.getClass();
        str.getClass();
        y9q0Var.getClass();
        v8q0.a(str, yhg0Var.a(1.0f, (i2 & 1) != 0 ? jm40.b : mm40Var, true), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, (i >> 6) & 14, (i << 12) & 29360128, 131064);
    }

    public static final jal0 e0(rpp0 rpp0Var, boolean z, List list, b280 b280Var, boolean z2, List list2) {
        d280 c280Var;
        cap capVar = cap.f4022a;
        list.getClass();
        boolean z3 = true;
        if (rpp0Var instanceof qpp0) {
            qpp0 qpp0Var = (qpp0) rpp0Var;
            long j = z ? qpp0Var.e : qpp0Var.f;
            qpp0 qpp0Var2 = (qpp0) rpp0Var;
            String str = z ? qpp0Var2.g : qpp0Var2.h;
            if (b280Var != null) {
                c280Var = b280Var;
            } else {
                String str2 = (String) CollectionsKt.firstOrNull(list);
                c280Var = new c280(vsm0.s(j, str2 != null ? str2 : ""), R.drawable.ic_glyph_placeholder_player);
            }
            if (!z2 && b280Var == null) {
                z3 = false;
            }
            return new ial0(str, b5x.d0(c280Var, j, list2, z3, capVar));
        }
        if (!(rpp0Var instanceof ppp0)) {
            t9f.b();
            return null;
        }
        ppp0 ppp0Var = (ppp0) rpp0Var;
        String str3 = z ? ppp0Var.g : ppp0Var.h;
        ppp0 ppp0Var2 = (ppp0) rpp0Var;
        Pair pair = z ? ppp0Var2.e : ppp0Var2.f;
        Object obj = pair.f46059a;
        String str4 = (String) CollectionsKt.firstOrNull(list);
        if (str4 == null) {
            str4 = "";
        }
        Object obj2 = pair.b;
        j5a0 j5a0VarD0 = b5x.d0(new c280(vsm0.s(((Number) obj).longValue(), str4), R.drawable.ic_glyph_placeholder_player), ((Number) obj).longValue(), list2, z2, cap.b);
        String str5 = (String) CollectionsKt.W(1, list);
        Number number = (Number) obj2;
        return new hal0(str3, j5a0VarD0, b5x.d0(new c280(vsm0.s(number.longValue(), str5 != null ? str5 : ""), R.drawable.ic_glyph_placeholder_player), number.longValue(), list2, z2, capVar));
    }

    public static final void f(mm40 mm40Var, a4x a4xVar, Function0 function0, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        Object bg0Var;
        xcz xczVar;
        a4xVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-912159113);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            Object obj2 = (vne) objP;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = jgk0.b(new a7s(xczVarA, (byte) 21));
                fetVar.o0(objP2);
            }
            Object obj3 = (l7m0) objP2;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.L(jm40Var, 0.0f, 8.0f, 1), 1.0f), 40.0f);
            lh80 lh80VarT = s5x0.t(qmk.a(fetVar).e, 0.0f, 2);
            yx7 yx7Var = gqw0.l;
            qw3 qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
            boolean zG = (i3 == 32) | ((i2 & 896) == 256) | fetVar.g(obj3) | ((i2 & 7168) == 2048) | fetVar.i(obj2) | fetVar.g(xczVarA);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                bg0Var = new bg0(a4xVar, function0, obj3, function1, obj2, xczVarA, (byte) 10);
                xczVar = xczVarA;
                fetVar.o0(bg0Var);
            } else {
                bg0Var = objP3;
                xczVar = xczVarA;
            }
            b8k0.f(mm40VarE, xczVar, lh80VarT, false, qw3Var, yx7Var, null, false, null, (Function1) bg0Var, fetVar, 196608, 456);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gwy(mm40Var2, a4xVar, function0, function1, i, (byte) 2);
        }
    }

    public static final void g(boolean z, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-1448924254);
        int i2 = (fetVar.h(z) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.K(jm40.b, 16.0f, 8.0f), 1.0f);
            wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(rsm0.w(R.string.rating, 0, fetVar)), !z, false, true);
            boolean z2 = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new ma70(function1, (byte) 5);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarD, wulVar, (Function0) objP, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rt9(z, function1, i, (byte) 6);
        }
    }

    public static final void h(mm40 mm40Var, tpa0 tpa0Var, Function1 function1, fet fetVar, int i) {
        long jC;
        fet fetVar2 = fetVar;
        tpa0Var.getClass();
        function1.getClass();
        fetVar2.g0(1749234237);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(tpa0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 16.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true);
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
            String str = tpa0Var.f34322a;
            if (tpa0Var.d) {
                fetVar2.e0(-2023741590);
                jC = afn0.m(fetVar2).getWarning();
                fetVar2.r(false);
            } else {
                jC = rz4.c(fetVar2, -2023740594, fetVar2, false);
            }
            v8q0.a(str, x7zVarI, jC, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new i0a0(function1, (byte) 21);
                fetVar2.o0(objP);
            }
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, y860.W(mm40VarN, null, null, false, null, (Function0) objP, 28), afn0.m(fetVar2).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            rqm rqmVar = tpa0Var.b;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new i0a0(function1, (byte) 23);
                fetVar2.o0(objP2);
            }
            obc.q(null, rqmVar, false, null, (Function0) objP2, null, null, null, fetVar2, 0, 237);
            rqm rqmVar2 = tpa0Var.c;
            boolean z4 = i3 == 256;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new i0a0(function1, (byte) 24);
                fetVar2.o0(objP3);
            }
            obc.q(null, rqmVar2, false, null, (Function0) objP3, null, null, null, fetVar2, 0, 237);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var, tpa0Var, function1, i, (byte) 16);
        }
    }

    public static final void i(mm40 mm40Var, boolean z, int i, wyc0 wyc0Var, Function0 function0, xdr xdrVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        xdr xdrVar2;
        xdr xdrVar3;
        int i3;
        mm40 mm40Var3;
        boolean z2;
        boolean z3;
        fetVar.g0(-1868749072);
        int i4 = i2 | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.e(wyc0Var.ordinal()) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192) | 65536;
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                xdrVar3 = z ? rsr0.d : null;
                i3 = i4 & (-458753);
                mm40Var3 = jm40.b;
            } else {
                fetVar.X();
                xdrVar3 = xdrVar;
                i3 = i4 & (-458753);
                mm40Var3 = mm40Var;
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.J(mm40Var3, 6.0f), "PROMOCODE_BUTTON");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            boolean z4 = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                mul mulVar = mul.e;
                oe9 oe9Var = oe9.c;
                te9 te9Var = new te9(i);
                int iOrdinal = wyc0Var.ordinal();
                if (iOrdinal == 0) {
                    z2 = true;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    z2 = false;
                }
                objP = new wul(mulVar, oe9Var, te9Var, z2, false, false);
                fetVar.o0(objP);
            }
            wul wulVar = (wul) objP;
            boolean z5 = (57344 & i3) == 16384;
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new l3c0(function0, (byte) 2);
                fetVar.o0(objP2);
            }
            qzb.n(null, wulVar, (Function0) objP2, fetVar, 0, 1);
            if (xdrVar3 == null) {
                fetVar.e0(372661579);
                z3 = false;
            } else {
                z3 = false;
                fetVar.e0(843305334);
                xdrVar3.F(jr8.f16991a, fetVar, 6);
            }
            fetVar.r(z3);
            fetVar.r(true);
            xdrVar2 = xdrVar3;
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            xdrVar2 = xdrVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(mm40Var2, z, i, wyc0Var, function0, xdrVar2, i2, (byte) 2);
        }
    }

    public static final void j(mm40 mm40Var, azc0 azc0Var, wyc0 wyc0Var, Function1 function1, Function0 function0, Function2 function2, Function2 function3, fet fetVar, int i, int i2) {
        Function0 function4;
        int i3;
        Function2 function5;
        mm40 mm40Var2;
        Function2 function6;
        Function0 function7;
        Function2 function8;
        Function2 function2M;
        Function2 function2M2;
        Function0 function9;
        int i4;
        mm40 mm40Var3;
        long background;
        boolean z;
        boolean z2;
        wyc0Var.getClass();
        function1.getClass();
        fetVar.g0(-2738205);
        int i5 = i | 6;
        if ((i & 48) == 0) {
            i5 |= fetVar.g(azc0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= fetVar.e(wyc0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= fetVar.i(function1) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i5 | 24576;
            function4 = function0;
        } else {
            function4 = function0;
            i3 = i5 | (fetVar.i(function4) ? 16384 : 8192);
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                function5 = function2;
                int i7 = fetVar.i(function5) ? 131072 : 65536;
                i3 |= i7;
            } else {
                function5 = function2;
            }
            i3 |= i7;
        } else {
            function5 = function2;
        }
        int i8 = i3 | 524288;
        if (fetVar.U(i8 & 1, (599187 & i8) != 599186)) {
            fetVar.Z();
            int i9 = i & 1;
            byte b = 5;
            jm40 jm40Var = jm40.b;
            if (i9 == 0 || fetVar.B()) {
                if (i6 != 0) {
                    function4 = null;
                }
                if ((i2 & 32) != 0) {
                    if (azc0Var.d) {
                        fetVar.e0(30807723);
                        function2M = u1c.M(-598609274, new rwc0(azc0Var, wyc0Var, function4, b), fetVar);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(31263546);
                        fetVar.r(false);
                        function2M = null;
                    }
                    i8 &= -458753;
                } else {
                    function2M = function5;
                }
                String str = azc0Var.c;
                if (str == null || str.length() <= 0) {
                    fetVar.e0(31796250);
                    fetVar.r(false);
                    function2M2 = null;
                } else {
                    fetVar.e0(31390399);
                    function2M2 = u1c.M(-2003420844, new nrc0(azc0Var, (byte) 4), fetVar);
                    fetVar.r(false);
                }
                function9 = function4;
                i4 = i8 & (-3670017);
                mm40Var3 = jm40Var;
            } else {
                fetVar.X();
                if ((i2 & 32) != 0) {
                    i8 &= -458753;
                }
                function9 = function4;
                function2M = function5;
                function2M2 = function3;
                i4 = i8 & (-3670017);
                mm40Var3 = mm40Var;
            }
            fetVar.s();
            String str2 = (String) azc0Var.f1710a.getValue();
            if (str2 == null) {
                str2 = "";
            }
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            byte b2 = 15;
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new cbc0(b2);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = epv0.N(o7k0.d(o7k0.e(s5x0.L(mm40Var3, 16.0f, 0.0f, 2), 48.0f), 1.0f), wyc0Var == wyc0.b ? 0.5f : 1.0f);
            zcl zclVar2 = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                background = cs0.e(fetVar, 1663612074, fetVar, false);
            } else {
                fetVar.e0(1663613069);
                background = afn0.m(fetVar).getBackground();
                fetVar.r(false);
            }
            mm40 mm40Var4 = mm40Var3;
            Function2 function10 = function2M;
            long j = background;
            zcl zclVar3 = qmk.i;
            mm40 mm40VarQ = i120.Q(i120.S(mm40VarE, 1.0f, j, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), afn0.m(fetVar).getBackground(), jd8.n);
            nw3 nw3Var = uc9.e;
            thg0 thg0VarA = shg0.a(nw3Var, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            Function0 function11 = e7z.u1;
            if (z3) {
                fetVar.l(function11);
            } else {
                fetVar.r0();
            }
            Function2 function12 = function2M2;
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            String str3 = str2;
            mm40 mm40VarM = s5x0.M(dw9.h(1.0f, o7k0.c(jm40Var, 1.0f), true), 48.0f, 6.0f, function10 != null ? 6.0f : 48.0f, 6.0f);
            x5d x5dVarA = w5d.a(nw3Var, gqw0.n, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function11);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var, 1.0f), 22.0f);
            boolean zG = fetVar.g(pz40Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new ryc0(pz40Var, (byte) 1);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(j120.b0(mm40VarE2, (Function1) objP2), "PROMOCODE_TEXT_FIELD");
            afn0.v(fetVar).getClass();
            y9q0 y9q0VarA = y9q0.a(g1t0.j(), afn0.m(fetVar).getTextPrimary(), 0L, null, null, null, 0L, null, null, str3.length() == 0 ? 5 : 3, 0, 0L, null, null, 16744446);
            int iOrdinal = wyc0Var.ordinal();
            if (iOrdinal != 0) {
                z = true;
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                z2 = false;
            } else {
                z = true;
                z2 = true;
            }
            skk0 skk0Var = new skk0(afn0.m(fetVar).getPrimary());
            uly ulyVar = new uly(0, null, 1, 0, 123);
            boolean z4 = (i4 & 7168) == 2048 ? z : false;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == obj) {
                objP3 = new rpa0(function1, (byte) 27);
                fetVar.o0(objP3);
            }
            mm40Var2 = mm40Var4;
            int i10 = i4;
            z96.b(str3, (Function1) objP3, mm40VarE0, z2, y9q0VarA, ulyVar, null, true, 0, 0, null, null, skk0Var, u1c.M(-1071456518, new in80(str3, azc0Var, (byte) 10), fetVar), fetVar, 102236160, 196608, 16016);
            if (((Boolean) pz40Var.getValue()).booleanValue() || str3.length() > 0) {
                fetVar.e0(1981737317);
                if (function12 == null) {
                    fetVar.e0(1304314684);
                } else {
                    fetVar.e0(1981737317);
                    function12.invoke(fetVar, 0);
                }
                fetVar.r(false);
                fetVar.r(false);
            } else {
                fetVar.e0(1304336261);
                fetVar.r(false);
            }
            fetVar.r(true);
            if (function10 == null) {
                fetVar.e0(-1505077230);
                fetVar.r(false);
            } else {
                fetVar.e0(1475469775);
                h97.q((i10 >> 15) & 14, fetVar, function10, false);
            }
            fetVar.r(true);
            function8 = function10;
            function6 = function12;
            function7 = function9;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            function6 = function3;
            function7 = function4;
            function8 = function5;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pol(mm40Var2, azc0Var, wyc0Var, function1, function7, function8, function6, i, i2, (byte) 2);
        }
    }

    public static final void k(mm40 mm40Var, final List list, final boolean z, xcz xczVar, final Function1 function1, final Function2 function2, fet fetVar, int i) {
        list.getClass();
        function1.getClass();
        fetVar.g0(1925223599);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(xczVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            final float f = xfn.a(fetVar).d;
            final float f2 = xfn.a(fetVar).f39080a;
            int i4 = (i3 & 7168) ^ 3072;
            int i5 = i3 & 57344;
            boolean z2 = ((i4 > 2048 && fetVar.g(xczVar)) || (i3 & 3072) == 2048) | (i5 == 16384);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new qkb0((Object) xczVar, (Object) function1, (yje) null, (byte) 3);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, xczVar, (Function2) objP);
            int i6 = i3 & 112;
            boolean z3 = i6 == 32 || ((i3 & 64) != 0 && fetVar.g(list));
            Object objP2 = fetVar.P();
            Object obj2 = objP2;
            if (z3 || objP2 == obj) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((z0f0) obj3) instanceof tqq) {
                        arrayList.add(obj3);
                    }
                }
                int iA = wp20.a(r3d.q(arrayList, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(((z0f0) it.next()).getKey(), new cqq());
                }
                fetVar.o0(linkedHashMap);
                obj2 = linkedHashMap;
            }
            final Map map = (Map) obj2;
            boolean zI = (i6 == 32 || ((i3 & 64) != 0 && fetVar.i(list))) | ((i4 > 2048 && fetVar.g(xczVar)) || (i3 & 3072) == 2048) | fetVar.i(map);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new iq3(list, xczVar, map, (yje) null);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, list, (Function2) objP3);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i7 = i3 & 896;
            boolean z4 = ((i4 > 2048 && fetVar.g(xczVar)) || (i3 & 3072) == 2048) | (i7 == 256);
            Object objP4 = fetVar.P();
            if (z4 || objP4 == obj) {
                objP4 = new qa2(z, xczVar, null, (byte) 8);
                fetVar.o0(objP4);
            }
            int i8 = i3 >> 6;
            m0x0.t(fetVar, boolValueOf, (Function2) objP4);
            boolean z5 = !z;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
            boolean zD = (i6 == 32 || ((i3 & 64) != 0 && fetVar.i(list))) | ((458752 & i3) == 131072) | (i7 == 256) | fetVar.d(f) | fetVar.i(map) | (i5 == 16384) | fetVar.d(f2);
            Object objP5 = fetVar.P();
            if (zD || objP5 == obj) {
                Object obj4 = new Function1() { // from class: a.r3f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        hcz hczVar = (hcz) obj5;
                        hczVar.getClass();
                        Function2 function3 = function2;
                        byte b = 1;
                        if (function3 != null) {
                            hcz.e(hczVar, "REGISTRATION_TABS", null, new ugd(1559465450, true, new tcc(function3, (byte) 2)), 2);
                        }
                        if (z) {
                            hcz.e(hczVar, null, null, epv0.e, 3);
                        } else {
                            k8e0 k8e0Var = new k8e0((byte) 18);
                            List list2 = list;
                            hczVar.f(list2.size(), new pwe0(k8e0Var, list2, b), new d1c0(list2, (byte) 13), new ugd(2039820996, true, new s3f0(list2, list2, map, function1, f2, f)));
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(obj4);
                objP5 = obj4;
            }
            b8k0.e(mm40Var, xczVar, lh80VarU, null, null, null, z5, null, (Function1) objP5, fetVar, 100663296 | (i3 & 14) | (i8 & 112), 120);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(mm40Var, (Object) list, z, (Object) xczVar, function1, (wdr) function2, i, (byte) 28);
        }
    }

    public static final void l(mm40 mm40Var, p6q0 p6q0Var, q7q0 q7q0Var, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        long jM113getRed0d7_KjU;
        fet fetVar2 = fetVar;
        p6q0Var.getClass();
        q7q0Var.getClass();
        function1.getClass();
        fetVar2.g0(-156992751);
        int i2 = i | 6 | (fetVar2.g(p6q0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(q7q0Var) ? 256 : 128;
        }
        int i3 = i2 | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.h(z2) ? 16384 : 8192) | (fetVar2.h(z3) ? 131072 : 65536) | (fetVar2.i(function1) ? 8388608 : 4194304);
        boolean z5 = false;
        if (fetVar2.U(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z6 = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z6 || objP == cl5Var) {
                objP = Boolean.valueOf(q7q0Var.equals(q7q0.f28265a));
                fetVar2.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            boolean z7 = p6q0Var instanceof o6q0;
            jm40 jm40Var = jm40.b;
            if (z7) {
                fetVar2.e0(248801771);
                if (z) {
                    fetVar2.e0(248842350);
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_circle_warning, 0, fetVar2);
                    if (zBooleanValue) {
                        fetVar2.e0(-546156104);
                        jM113getRed0d7_KjU = ((ThemeColors) fetVar2.k(zaq0.b)).getWarning();
                    } else {
                        fetVar2.e0(-546154924);
                        jM113getRed0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m113getRed0d7_KjU();
                    }
                    fetVar2.r(false);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(o7k0.n(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 16.0f), "RIGHT_CONTAINER_ICON");
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = new wtf0((byte) 11);
                        fetVar2.o0(objP2);
                    }
                    z5 = false;
                    mm40Var2 = jm40Var;
                    dww.c(pm80VarF, null, pai0.a(mm40VarE0, false, (Function1) objP2), jM113getRed0d7_KjU, fetVar2, 56, 0);
                    fetVar2.r(false);
                } else {
                    mm40Var2 = jm40Var;
                    fetVar2.e0(249443409);
                    fetVar2.r(false);
                }
                fetVar2.r(z5);
            } else {
                mm40Var2 = jm40Var;
                if (p6q0Var instanceof j6q0) {
                    fetVar2.e0(249509842);
                    int i4 = i3 & 1022;
                    int i5 = i3 >> 3;
                    a((j6q0) p6q0Var, q7q0Var, z2, z3, z4, function1, fetVar2, i4 | (i5 & 7168) | (57344 & i5) | 196608 | (i5 & 3670016));
                    fetVar2.r(false);
                } else {
                    if (!(p6q0Var instanceof n6q0)) {
                        throw b1j.f(-546164604, fetVar2, false);
                    }
                    fetVar2.e0(249933891);
                    int i6 = i3 & 126;
                    int i7 = i3 >> 6;
                    b((n6q0) p6q0Var, z2, z3, z4, function1, fetVar2, (i7 & 458752) | i6 | (i7 & 896) | (i7 & 7168) | 24576);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                }
            }
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a36(mm40Var2, p6q0Var, q7q0Var, z, z2, z3, z4, function1, i);
        }
    }

    public static final void m(final l7m0 l7m0Var, final oms0 oms0Var, final boolean z, final Function0 function0, fet fetVar, final int i) {
        int i2;
        fetVar.g0(1476178940);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(oms0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else {
            if (!((Boolean) l7m0Var.getValue()).booleanValue()) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    final byte b = 0;
                    yfe0VarU.d = new Function2() { // from class: a.sx50
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b2 = b;
                            int i3 = i;
                            switch (b2) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    g7x.m(l7m0Var, oms0Var, z, function0, (fet) obj, x8x.L(i3 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    g7x.m(l7m0Var, oms0Var, z, function0, (fet) obj, x8x.L(i3 | 1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                ys8 ys8Var = new ys8((Object) oms0Var, z, (Object) function0, (yje) null, (byte) 23);
                fetVar.o0(ys8Var);
                objP = ys8Var;
            }
            m0x0.v(oms0Var, boolValueOf, (Function2) objP, fetVar);
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            final byte b2 = 1;
            yfe0VarU2.d = new Function2() { // from class: a.sx50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    int i3 = i;
                    switch (b3) {
                        case 0:
                            ((Integer) obj2).getClass();
                            g7x.m(l7m0Var, oms0Var, z, function0, (fet) obj, x8x.L(i3 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            g7x.m(l7m0Var, oms0Var, z, function0, (fet) obj, x8x.L(i3 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void n(mm40 mm40Var, wui0 wui0Var, fet fetVar, int i) {
        int i2;
        float f;
        fetVar.g0(15504195);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(wui0Var.ordinal()) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                wui0 wui0Var2 = wui0.b;
                if (wui0Var == wui0Var2 || wui0Var == wui0.f39793a) {
                    zcl zclVar = qmk.f28987a;
                    f = 16.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = 0.0f;
                }
                float f2 = (wui0Var == wui0Var2 || wui0Var == wui0.f39793a) ? 16.0f : 0.0f;
                wui0 wui0Var3 = wui0.d;
                objP = vgg0.b(f, f2, (wui0Var == wui0Var3 || wui0Var == wui0.f39793a) ? 16.0f : 0.0f, (wui0Var == wui0Var3 || wui0Var == wui0.f39793a) ? 16.0f : 0.0f);
                fetVar.o0(objP);
            }
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.e(mm40Var, 60.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), (ugg0) objP);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.n(s5x0.K(jm40Var, 12.0f, 10.0f), 40.0f), vgg0.f37379a), vbc.d0(null, fetVar, 0, 1)));
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(o7k0.c(jm40Var, 1.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14), true);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jr8Var.b(jm40Var, zx7Var), 128.0f), 16.0f);
            zcl zclVar4 = qmk.e;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            if (wui0Var == wui0.b || wui0Var == wui0.c) {
                fetVar.e0(-1317715103);
                mbc.o(zfi0.f44303a, jr8Var.b(jm40Var, gqw0.g), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(-1317519586);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qph(mm40Var, wui0Var, i, (byte) 10);
        }
    }

    public static final void o(mm40 mm40Var, srj0 srj0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        srj0 srj0Var2 = srj0Var;
        fet fetVar2 = fetVar;
        srj0Var2.getClass();
        fetVar2.g0(-1833134990);
        int i2 = i | 6 | (fetVar2.g(srj0Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
            String str = srj0Var2.b;
            y9q0 y9q0VarG = g1t0.g();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarG, fetVar, 0, 0, 131066);
            srj0Var2 = srj0Var;
            v8q0.a(srj0Var.f32679a, s5x0.L(new x7z(1.0f, true), 8.0f, 0.0f, 2), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            v8q0.a(srj0Var2.c, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
            d9x.e(o7k0.e(o7k0.d(mm40Var2, 1.0f), 4.0f), srj0Var2.d, srj0Var2.e, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var2, (Object) srj0Var2, i, (byte) 25);
        }
    }

    public static final void p(mm40 mm40Var, n580 n580Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        n580Var.getClass();
        fetVar.g0(-1409197540);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(n580Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 52.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zx7 zx7Var = gqw0.e;
            fetVar2 = fetVar;
            hxm0.h(jr8.f16991a.b(mm40VarD, zx7Var), n580Var.f22931a, zx7Var, 0, fetVar2, 384, 8);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) mm40Var, (Object) n580Var, i, (byte) 27);
        }
    }

    public static final void q(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1, boolean z) {
        mm40 mm40Var2;
        a4xVar.getClass();
        fetVar.g0(-1265848315);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new ife(a4xVar, (byte) 8);
                fetVar.o0(objP);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP, fetVar, 0, 3);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarC = vgg0.c(12.0f, 12.0f, 0.0f, 0.0f, 12);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ugg0VarC);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarJ = lgb.J(ny9.O(1.5f, o7k0.d(s5x0.M(jm40Var, 12.0f, 12.0f, 12.0f, 8.0f), 1.0f), false), vgg0.a(12.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            q5x.e(kwjVarB, jr8.f16991a.a(jm40Var), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1811263422, new ywl0(a4xVar, z, function1, (byte) 0), fetVar), fetVar, 0, 24576, 16380);
            fetVar.r(true);
            if (a4xVar.size() > 1) {
                fetVar.e0(2069157370);
                wkw wkwVar = new wkw(gqw0.n);
                smm smmVar = smm.f32453a;
                pz40 pz40Var = s6t0.f31722a;
                n1i.a(wkwVar, kwjVarB, smmVar, new y3d(s6t0.b().f33626a.getPrimary()), fetVar, 384, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(2069446631);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var2, (Object) a4xVar, z, (wdr) function1, i, (byte) 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v34 */
    public static final void r(mm40 mm40Var, l7m0 l7m0Var, boolean z, String str, int i, Function1 function1, Function0 function0, fet fetVar, int i2) {
        boolean z2;
        String str2;
        mm40 mm40Var2;
        fet fetVar2;
        long secondary80;
        ?? r0;
        Object objJ;
        long secondary81;
        long secondary82;
        Object objB;
        Object objJ2;
        float f;
        fet fetVar3 = fetVar;
        fetVar3.g0(604284757);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar3.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z2 = z;
            i3 |= fetVar3.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i2 & 3072) == 0) {
            str2 = str;
            i3 |= fetVar3.g(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar3.e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar3.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar3.i(function0) ? 1048576 : 524288;
        }
        if (fetVar3.U(i3 & 1, (599187 & i3) != 599186)) {
            oms0 oms0VarZ = phu0.Z(Boolean.valueOf(z2), "textSelectionTransition", fetVar3, ((i3 >> 6) & 14) | 48, 0);
            p4 p4Var = oms0VarZ.f25519a;
            boolean zBooleanValue = ((Boolean) ((hgk0) oms0VarZ.d).getValue()).booleanValue();
            fetVar3.e0(1624570354);
            if (zBooleanValue) {
                secondary80 = rz4.c(fetVar3, 1883962043, fetVar3, false);
            } else {
                fetVar3.e0(1884020571);
                secondary80 = afn0.m(fetVar3).getSecondary80();
                fetVar3.r(false);
            }
            fetVar3.r(false);
            y4d y4dVarF = y3d.f(secondary80);
            boolean zG = fetVar3.g(y4dVarF);
            Object objP = fetVar3.P();
            byte b = 2;
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = kng0.d(qja.j, new s43(y4dVarF, b), fetVar3);
            }
            lxs0 lxs0Var = (lxs0) objP;
            if (oms0VarZ.h()) {
                r0 = 0;
                objJ = vqd.j(fetVar3, 1666827533, false, p4Var);
            } else {
                fetVar3.e0(1666573488);
                boolean zG2 = fetVar3.g(oms0VarZ);
                objJ = fetVar3.P();
                if (zG2 || objJ == obj) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar3.o0(objY0);
                        objJ = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                r0 = 0;
                fetVar3.r(false);
            }
            boolean zBooleanValue2 = ((Boolean) objJ).booleanValue();
            fetVar3.e0(1624570354);
            if (zBooleanValue2) {
                secondary81 = rz4.c(fetVar3, 1883962043, fetVar3, r0);
            } else {
                fetVar3.e0(1884020571);
                secondary81 = afn0.m(fetVar3).getSecondary80();
                fetVar3.r(r0);
            }
            y3d y3dVarF = dw9.f(fetVar3, r0, secondary81);
            boolean zG3 = fetVar3.g(oms0VarZ);
            Object objP2 = fetVar3.P();
            if (zG3 || objP2 == obj) {
                objP2 = jgk0.b(new tx50(oms0VarZ, r0));
                fetVar3.o0(objP2);
            }
            boolean zBooleanValue3 = ((Boolean) ((l7m0) objP2).getValue()).booleanValue();
            fetVar3.e0(1624570354);
            if (zBooleanValue3) {
                secondary82 = rz4.c(fetVar3, 1883962043, fetVar3, r0);
            } else {
                fetVar3.e0(1884020571);
                secondary82 = afn0.m(fetVar3).getSecondary80();
                fetVar3.r(r0);
            }
            y3d y3dVarF2 = dw9.f(fetVar3, r0, secondary82);
            boolean zG4 = fetVar3.g(oms0VarZ);
            Object objP3 = fetVar3.P();
            if (zG4 || objP3 == obj) {
                objB = jgk0.b(new tx50(oms0VarZ, (byte) 1));
                fetVar3.o0(objB);
            } else {
                objB = objP3;
            }
            ((ams0) ((l7m0) objB).getValue()).getClass();
            fetVar3.e0(1656746078);
            uts0 uts0VarM0 = ro4.m0(300, 0, null, 6);
            fetVar3.r(false);
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVarF, y3dVarF2, uts0VarM0, lxs0Var, fetVar3, 196608);
            lxs0 lxs0Var2 = hp4.l;
            if (oms0VarZ.h()) {
                objJ2 = vqd.j(fetVar3, 1666827533, false, p4Var);
            } else {
                fetVar3.e0(1666573488);
                boolean zG5 = fetVar3.g(oms0VarZ);
                objJ2 = fetVar3.P();
                if (zG5 || objJ2 == obj) {
                    rfk0 rfk0VarJ2 = vdx.J();
                    Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                    rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                    try {
                        Object objY1 = p4Var.y0();
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        fetVar3.o0(objY1);
                        objJ2 = objY1;
                    } catch (Throwable th2) {
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        throw th2;
                    }
                }
                fetVar3.r(false);
            }
            boolean zBooleanValue4 = ((Boolean) objJ2).booleanValue();
            fetVar3.e0(-723683651);
            if (zBooleanValue4) {
                zcl zclVar = qmk.f28987a;
                f = 32.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            ycl yclVarG = dw9.g(fetVar3, false, f);
            boolean zG6 = fetVar3.g(oms0VarZ);
            Object objP4 = fetVar3.P();
            if (zG6 || objP4 == obj) {
                objP4 = jgk0.b(new tx50(oms0VarZ, (byte) 2));
                fetVar3.o0(objP4);
            }
            boolean zBooleanValue5 = ((Boolean) ((l7m0) objP4).getValue()).booleanValue();
            fetVar3.e0(-723683651);
            ycl yclVarG2 = dw9.g(fetVar3, false, zBooleanValue5 ? 32.0f : 20.0f);
            boolean zG7 = fetVar3.g(oms0VarZ);
            Object objP5 = fetVar3.P();
            if (zG7 || objP5 == obj) {
                objP5 = jgk0.b(new tx50(oms0VarZ, (byte) 3));
                fetVar3.o0(objP5);
            }
            ((ams0) ((l7m0) objP5).getValue()).getClass();
            fetVar3.e0(-2041683414);
            uts0 uts0VarM1 = ro4.m0(300, 0, null, 6);
            fetVar3.r(false);
            cms0 cms0VarE2 = phu0.E(oms0VarZ, yclVarG, yclVarG2, uts0VarM1, lxs0Var2, fetVar3, 196608);
            byte b2 = 14;
            int i4 = i3 >> 9;
            m(l7m0Var, oms0VarZ, z, function0, fetVar, ((i3 >> 3) & 14) | (i3 & 896) | (i4 & 7168));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP6;
            boolean z3 = ((i3 & 57344) == 16384) | ((458752 & i3) == 131072);
            Object objP7 = fetVar.P();
            if (z3 || objP7 == obj) {
                objP7 = new re1(function1, i, b2);
                fetVar.o0(objP7);
            }
            mm40 mm40VarU = o7k0.u(y860.W(mm40VarC, gy40Var, null, false, null, (Function0) objP7, 28), 0.0f, 192.0f, 1);
            zx7 zx7Var = gqw0.g;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarU);
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
            mm40 mm40VarU2 = o7k0.u(jm40Var, 0.0f, 192.0f, 1);
            long j = ((y3d) cms0VarE.getValue()).f41946a;
            qrq qrqVar = j1t0.f15753a;
            long j2 = qmk.u;
            y9q0 y9q0VarA = y9q0.a(new y9q0(0L, j2, null, qrqVar, 0L, null, 0, 0, qmk.H, 16646109), 0L, 0L, null, null, null, 0L, null, null, 0, 0, qmk.y, null, null, 16646143);
            float f2 = ((ycl) cms0VarE2.getValue()).f42389a;
            float f3 = pkd.f27129a;
            kc5.N(str2, mm40VarU2, j, null, null, 0L, j2, ((w6k) fetVar.k(bmd.h)).o(f2), null, null, 0L, zx7Var, 2, false, 1, 0, true, null, y9q0VarA, 0.0f, fetVar, i4 & 14, 102263808, 0, 2793272);
            fet fetVar4 = fetVar;
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
            yfe0VarU.d = new n0z(mm40Var2, l7m0Var, z, str, i, function1, function0, i2);
        }
    }

    public static final void s(int i, y3d y3dVar, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        long commerce;
        str.getClass();
        fetVar.g0(1715301767);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y3dVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(jm40Var, null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(mm40VarW, 0.0f, 64.0f, 1);
            if (y3dVar == null) {
                fetVar.e0(-862434609);
                commerce = ((ThemeColors) fetVar.k(zaq0.b)).getCommerce();
                fetVar.r(false);
            } else {
                fetVar.e0(-862435446);
                fetVar.r(false);
                commerce = y3dVar.f41946a;
            }
            long j = qmk.r;
            psq psqVar = new psq(500);
            qrq qrqVar = j1t0.b;
            long jV = idm0.v(0.0f, 4294967296L);
            long j2 = qmk.F;
            v8q0.a(str2, mm40VarU, commerce, null, j, new lsq(0), psqVar, qrqVar, jV, null, j2, 2, false, 1, 0, null, y9q0.a(new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, j2, 16646109), 0L, 0L, null, null, null, 0L, null, null, 6, 0, 0L, null, null, 16744447), fetVar, ((i2 >> 3) & 14) | 1572864, 24960, 108040);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var2, (Object) str, (Object) y3dVar, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0266  */
    /* JADX WARN: Code duplicated, block: B:104:0x0279  */
    /* JADX WARN: Code duplicated, block: B:106:0x027d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0282  */
    /* JADX WARN: Code duplicated, block: B:112:0x0291  */
    /* JADX WARN: Code duplicated, block: B:114:0x0295  */
    /* JADX WARN: Code duplicated, block: B:115:0x029c  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:132:0x02db  */
    /* JADX WARN: Code duplicated, block: B:133:0x02de  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:193:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:194:0x0403  */
    /* JADX WARN: Code duplicated, block: B:196:0x0407  */
    /* JADX WARN: Code duplicated, block: B:197:0x040c  */
    /* JADX WARN: Code duplicated, block: B:202:0x0419  */
    /* JADX WARN: Code duplicated, block: B:212:0x0452  */
    /* JADX WARN: Code duplicated, block: B:215:0x045b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0472 A[LOOP:9: B:216:0x046c->B:218:0x0472, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:220:0x0483  */
    /* JADX WARN: Code duplicated, block: B:223:0x0489  */
    /* JADX WARN: Code duplicated, block: B:224:0x048e  */
    /* JADX WARN: Code duplicated, block: B:230:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:235:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0225  */
    /* JADX WARN: Code duplicated, block: B:87:0x022a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0236  */
    /* JADX WARN: Code duplicated, block: B:91:0x0242  */
    /* JADX WARN: Code duplicated, block: B:94:0x024a  */
    /* JADX WARN: Code duplicated, block: B:95:0x024f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0253  */
    /* JADX WARN: Code duplicated, block: B:98:0x0258  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r63v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    public static final nas t(su10 su10Var, sip sipVar, long j, long j2, long j3, String str, long j4) {
        ArrayList arrayList;
        ArrayList arrayList2;
        tas tasVar;
        Long l;
        Long l2;
        String str2;
        Long l3;
        ArrayList arrayList3;
        vas vasVar;
        vas vasVar2;
        m380 m380Var;
        m380 m380Var2;
        nnq0 nnq0Var;
        Long l4;
        Integer num;
        ?? BooleanValue;
        l5h0 l5h0Var;
        ?? arrayList4;
        Map map;
        ArrayList arrayList5;
        Boolean bool;
        ?? BooleanValue2;
        int iIntValue;
        int iIntValue2;
        Integer num2;
        Integer num3;
        ArrayList arrayList6;
        Iterator it;
        Map map2;
        Boolean bool2;
        ArrayList arrayList7;
        long j5;
        long jLongValue;
        String str3;
        Integer numValueOf;
        Long l5;
        String str4;
        Long l6;
        long jLongValue2;
        Long l7;
        long jLongValue3;
        ufs ufsVarA0;
        boolean zBooleanValue;
        Integer numValueOf2;
        String str5;
        Boolean bool3;
        Integer num4;
        Boolean bool4;
        Long l8;
        ArrayList arrayList8;
        ArrayList arrayList9;
        List list = su10Var.C;
        Long l9 = su10Var.f32800a;
        dss dssVar = su10Var.F;
        Long l10 = su10Var.r;
        Boolean bool5 = su10Var.v;
        Boolean bool6 = su10Var.u;
        mbr mbrVar = su10Var.H;
        h06 h06Var = su10Var.B;
        h06 h06Var2 = su10Var.A;
        Long l11 = su10Var.b;
        Long l12 = su10Var.c;
        gxs gxsVar = su10Var.G;
        pkl0 pkl0Var = su10Var.x;
        wz5 wz5Var = su10Var.z;
        l26 l26Var = su10Var.y;
        long jLongValue4 = 0;
        if (list != null) {
            ArrayList arrayList10 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                cas casVar = (cas) it2.next();
                Long l13 = casVar.f4027a;
                long jLongValue5 = l13 != null ? l13.longValue() : 0L;
                List list2 = casVar.c;
                Iterator it3 = it2;
                if (list2 != null) {
                    int i = 10;
                    arrayList9 = new ArrayList(r3d.q(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        List list3 = (List) it4.next();
                        Iterator it5 = it4;
                        h06 h06Var3 = h06Var2;
                        ArrayList arrayList11 = new ArrayList(r3d.q(list3, i));
                        Iterator it6 = list3.iterator();
                        while (it6.hasNext()) {
                            gas gasVar = (gas) it6.next();
                            Long l14 = casVar.f4027a;
                            Iterator it7 = it6;
                            arrayList11.add(u1c.U(gasVar, l14 != null ? l14.longValue() : 0L, su10Var.N, su10Var.f32800a, su10Var.t, l26Var != null ? l26Var.f19293a : null));
                            it6 = it7;
                        }
                        arrayList9.add(arrayList11);
                        it4 = it5;
                        h06Var2 = h06Var3;
                        i = 10;
                    }
                } else {
                    arrayList9 = null;
                }
                h06 h06Var4 = h06Var2;
                arrayList10.add(new u9s(arrayList9, Long.valueOf(jLongValue5), casVar.d));
                it2 = it3;
                mbrVar = mbrVar;
                h06Var = h06Var;
                h06Var2 = h06Var4;
            }
            arrayList = arrayList10;
        } else {
            arrayList = null;
        }
        mbr mbrVar2 = mbrVar;
        h06 h06Var5 = h06Var;
        h06 h06Var6 = h06Var2;
        List list4 = su10Var.M;
        if (list4 != null) {
            ArrayList arrayList12 = new ArrayList(r3d.q(list4, 10));
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                zxm0 zxm0Var = (zxm0) it8.next();
                zxm0Var.getClass();
                List list5 = zxm0Var.d;
                Long l15 = zxm0Var.f45167a;
                if (list5 != null) {
                    ArrayList arrayList13 = new ArrayList(r3d.q(list5, 10));
                    Iterator it9 = list5.iterator();
                    while (it9.hasNext()) {
                        cas casVar2 = (cas) it9.next();
                        Long l16 = casVar2.f4027a;
                        long jLongValue6 = l16 != null ? l16.longValue() : 0L;
                        List list6 = casVar2.c;
                        Iterator it10 = it9;
                        if (list6 != null) {
                            int i2 = 10;
                            arrayList8 = new ArrayList(r3d.q(list6, 10));
                            Iterator it11 = list6.iterator();
                            while (it11.hasNext()) {
                                List list7 = (List) it11.next();
                                Iterator it12 = it11;
                                Long l17 = l12;
                                ArrayList arrayList14 = new ArrayList(r3d.q(list7, i2));
                                Iterator it13 = list7.iterator();
                                while (it13.hasNext()) {
                                    gas gasVar2 = (gas) it13.next();
                                    Long l18 = casVar2.f4027a;
                                    Iterator it14 = it13;
                                    arrayList14.add(u1c.U(gasVar2, l18 != null ? l18.longValue() : 0L, su10Var.N, zxm0Var.f45167a, su10Var.t, l26Var != null ? l26Var.f19293a : null));
                                    it13 = it14;
                                }
                                arrayList8.add(arrayList14);
                                it11 = it12;
                                l12 = l17;
                                i2 = 10;
                            }
                        } else {
                            arrayList8 = null;
                        }
                        Long l19 = l12;
                        arrayList13.add(new u9s(arrayList8, Long.valueOf(jLongValue6), casVar2.d));
                        it9 = it10;
                        l15 = l15;
                        l11 = l11;
                        l12 = l19;
                    }
                    arrayList7 = arrayList13;
                } else {
                    arrayList7 = null;
                }
                Long l20 = l15;
                Long l21 = l11;
                Long l22 = l12;
                long jLongValue7 = l20 != null ? l20.longValue() : 0L;
                if (l22 != null) {
                    jLongValue = l22.longValue();
                } else {
                    if (l20 != null) {
                        jLongValue = l20.longValue();
                    } else {
                        j5 = 0;
                    }
                    Long l23 = su10Var.d;
                    String str6 = su10Var.k;
                    String str7 = su10Var.n;
                    String str8 = su10Var.i;
                    if (gxsVar != null) {
                        str3 = gxsVar.b;
                    } else {
                        str3 = null;
                    }
                    Integer num5 = su10Var.w;
                    String str9 = su10Var.m;
                    if (l21 != null) {
                        numValueOf = Integer.valueOf((int) l21.longValue());
                    } else {
                        numValueOf = null;
                    }
                    Boolean bool7 = su10Var.t;
                    String str10 = zxm0Var.b;
                    if (wz5Var != null) {
                        l5 = wz5Var.f40006a;
                    } else {
                        l5 = null;
                    }
                    if (wz5Var != null) {
                        str4 = wz5Var.b;
                    } else {
                        str4 = null;
                    }
                    oas oasVarK0 = ucx.k0(h06Var6);
                    oas oasVarK1 = ucx.k0(h06Var5);
                    l6 = su10Var.g;
                    if (l6 != null) {
                        jLongValue2 = l6.longValue() - (System.currentTimeMillis() / 1000);
                        if (jLongValue2 <= 0) {
                            jLongValue2 = 0;
                        }
                    } else {
                        jLongValue2 = 0;
                    }
                    if (l26Var != null) {
                        l7 = l26Var.f19293a;
                    } else {
                        l7 = null;
                    }
                    if (pkl0Var != null || (l8 = pkl0Var.f27140a) == null) {
                        jLongValue3 = 0;
                    } else {
                        jLongValue3 = l8.longValue();
                    }
                    if (mbrVar2 != null) {
                        ufsVarA0 = acb.a0(mbrVar2);
                    } else {
                        ufsVarA0 = null;
                    }
                    if (bool6 != 0) {
                        zBooleanValue = bool6.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    boolean zD = Intrinsics.d(bool5, Boolean.TRUE);
                    Boolean bool8 = su10Var.q;
                    if (l10 != null) {
                        numValueOf2 = Integer.valueOf((int) l10.longValue());
                    } else {
                        numValueOf2 = null;
                    }
                    if (dssVar != null) {
                        str5 = dssVar.b;
                    } else {
                        str5 = null;
                    }
                    if (gxsVar != null) {
                        bool3 = gxsVar.f12093a;
                    } else {
                        bool3 = null;
                    }
                    qud qudVar = boh.b;
                    if (wz5Var != null) {
                        num4 = wz5Var.d;
                    } else {
                        num4 = null;
                    }
                    if (pkl0Var != null) {
                        bool4 = pkl0Var.d;
                    } else {
                        bool4 = null;
                    }
                    qudVar.getClass();
                    arrayList12.add(new nas(jLongValue7, j5, l23, str6, str7, str8, str3, bool3, num5, str9, numValueOf, bool7, str10, null, null, arrayList7, l5, sipVar, str4, null, l6, Long.valueOf(jLongValue2), l7, jLongValue3, oasVarK0, oasVarK1, zD, null, ufsVarA0, Boolean.valueOf(zBooleanValue), null, null, bool8, numValueOf2, str5, null, qud.d(num4, bool4), su10Var.h));
                    it8 = it8;
                    l11 = l21;
                    l12 = l22;
                }
                j5 = jLongValue;
                Long l24 = su10Var.d;
                String str11 = su10Var.k;
                String str12 = su10Var.n;
                String str13 = su10Var.i;
                if (gxsVar != null) {
                    str3 = gxsVar.b;
                } else {
                    str3 = null;
                }
                Integer num6 = su10Var.w;
                String str14 = su10Var.m;
                if (l21 != null) {
                    numValueOf = Integer.valueOf((int) l21.longValue());
                } else {
                    numValueOf = null;
                }
                Boolean bool9 = su10Var.t;
                String str15 = zxm0Var.b;
                if (wz5Var != null) {
                    l5 = wz5Var.f40006a;
                } else {
                    l5 = null;
                }
                if (wz5Var != null) {
                    str4 = wz5Var.b;
                } else {
                    str4 = null;
                }
                oas oasVarK2 = ucx.k0(h06Var6);
                oas oasVarK3 = ucx.k0(h06Var5);
                l6 = su10Var.g;
                if (l6 != null) {
                    jLongValue2 = l6.longValue() - (System.currentTimeMillis() / 1000);
                    if (jLongValue2 <= 0) {
                        jLongValue2 = 0;
                    }
                } else {
                    jLongValue2 = 0;
                }
                if (l26Var != null) {
                    l7 = l26Var.f19293a;
                } else {
                    l7 = null;
                }
                if (pkl0Var != null) {
                    jLongValue3 = 0;
                } else {
                    jLongValue3 = 0;
                }
                if (mbrVar2 != null) {
                    ufsVarA0 = acb.a0(mbrVar2);
                } else {
                    ufsVarA0 = null;
                }
                if (bool6 != 0) {
                    zBooleanValue = bool6.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                boolean zD2 = Intrinsics.d(bool5, Boolean.TRUE);
                Boolean bool10 = su10Var.q;
                if (l10 != null) {
                    numValueOf2 = Integer.valueOf((int) l10.longValue());
                } else {
                    numValueOf2 = null;
                }
                if (dssVar != null) {
                    str5 = dssVar.b;
                } else {
                    str5 = null;
                }
                if (gxsVar != null) {
                    bool3 = gxsVar.f12093a;
                } else {
                    bool3 = null;
                }
                qud qudVar2 = boh.b;
                if (wz5Var != null) {
                    num4 = wz5Var.d;
                } else {
                    num4 = null;
                }
                if (pkl0Var != null) {
                    bool4 = pkl0Var.d;
                } else {
                    bool4 = null;
                }
                qudVar2.getClass();
                arrayList12.add(new nas(jLongValue7, j5, l24, str11, str12, str13, str3, bool3, num6, str14, numValueOf, bool9, str15, null, null, arrayList7, l5, sipVar, str4, null, l6, Long.valueOf(jLongValue2), l7, jLongValue3, oasVarK2, oasVarK3, zD2, null, ufsVarA0, Boolean.valueOf(zBooleanValue), null, null, bool10, numValueOf2, str5, null, qud.d(num4, bool4), su10Var.h));
                it8 = it8;
                l11 = l21;
                l12 = l22;
            }
            arrayList2 = arrayList12;
        } else {
            arrayList2 = null;
        }
        Long l25 = l11;
        Long l26 = l12;
        d5h0 d5h0Var = su10Var.J;
        if (d5h0Var != null) {
            String str16 = d5h0Var.d;
            tbr tbrVar = d5h0Var.k;
            Integer num7 = d5h0Var.c;
            String str17 = d5h0Var.f5506a;
            List list8 = d5h0Var.b;
            if (list8 != null) {
                ArrayList arrayList15 = new ArrayList(r3d.q(list8, 10));
                Iterator it15 = list8.iterator();
                while (it15.hasNext()) {
                    nf90 nf90Var = (nf90) it15.next();
                    nf90Var.getClass();
                    Integer num8 = nf90Var.f23424a;
                    String str18 = str16;
                    int iIntValue3 = num8 != null ? num8.intValue() : 0;
                    String str19 = str17;
                    String strValueOf = num8 != null ? String.valueOf(num8.intValue()) : null;
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    Iterator it16 = it15;
                    Integer num9 = nf90Var.b;
                    int iIntValue4 = num9 != null ? num9.intValue() : 0;
                    Integer num10 = nf90Var.c;
                    arrayList15.add(new df90(iIntValue3, new tf90(strValueOf, iIntValue4, num10 != null ? num10.intValue() : 0)));
                    it15 = it16;
                    str16 = str18;
                    num7 = num7;
                    str17 = str19;
                }
                arrayList3 = arrayList15;
            } else {
                arrayList3 = null;
            }
            String str20 = str16;
            Integer num11 = num7;
            String str21 = str17;
            Integer num12 = d5h0Var.e;
            Integer num13 = d5h0Var.f;
            Integer num14 = d5h0Var.g;
            szm0 szm0Var = d5h0Var.h;
            if (szm0Var != null) {
                vasVar2 = new vas(szm0Var.f33077a, szm0Var.b);
            } else {
                iso isoVar = d5h0Var.r;
                if (isoVar != null) {
                    tdf tdfVar = isoVar.b;
                    vasVar2 = new vas((tdfVar == null || (m380Var2 = tdfVar.f33766a) == null) ? null : m380Var2.f21102a, (tdfVar == null || (m380Var = tdfVar.f33766a) == null) ? null : m380Var.b);
                } else {
                    vasVar = null;
                }
                String str22 = d5h0Var.i;
                nnq0Var = d5h0Var.j;
                if (nnq0Var != null) {
                    l4 = nnq0Var.f23835a;
                } else {
                    l4 = null;
                }
                if (nnq0Var != null) {
                    num = nnq0Var.b;
                } else {
                    num = null;
                }
                if (nnq0Var != null || (bool2 = nnq0Var.c) == null) {
                    BooleanValue = 0;
                } else {
                    BooleanValue = bool2.booleanValue();
                }
                Integer numValueOf3 = Integer.valueOf((int) BooleanValue);
                String str23 = d5h0Var.l;
                l5h0Var = d5h0Var.p;
                if (l5h0Var != null || (map2 = l5h0Var.f19456a) == null) {
                    arrayList4 = iun.f15405a;
                } else {
                    arrayList4 = new ArrayList(map2.size());
                    Iterator it17 = map2.entrySet().iterator();
                    while (it17.hasNext()) {
                        arrayList4.add(nkb.x((Map.Entry) it17.next()));
                    }
                }
                ?? r63 = arrayList4;
                map = d5h0Var.q;
                if (map != null) {
                    arrayList6 = new ArrayList(map.size());
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList6.add(kcx.Y((Map.Entry) it.next()));
                    }
                    arrayList5 = arrayList6;
                } else {
                    arrayList5 = null;
                }
                bool = d5h0Var.m;
                if (bool != null) {
                    BooleanValue2 = bool.booleanValue();
                } else {
                    BooleanValue2 = 0;
                }
                Integer numValueOf4 = Integer.valueOf((int) BooleanValue2);
                Integer num15 = d5h0Var.o;
                Integer num16 = d5h0Var.s;
                if (tbrVar != null || (num3 = tbrVar.f33679a) == null) {
                    iIntValue = 0;
                } else {
                    iIntValue = num3.intValue();
                }
                if (tbrVar != null || (num2 = tbrVar.b) == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = num2.intValue();
                }
                tasVar = new tas(str20, num11, str21, arrayList3, num12, num13, num14, vasVar, str22, l4, num, numValueOf3, str23, r63, arrayList5, numValueOf4, num15, num16, new ubr(iIntValue, iIntValue2));
            }
            vasVar = vasVar2;
            String str24 = d5h0Var.i;
            nnq0Var = d5h0Var.j;
            if (nnq0Var != null) {
                l4 = nnq0Var.f23835a;
            } else {
                l4 = null;
            }
            if (nnq0Var != null) {
                num = nnq0Var.b;
            } else {
                num = null;
            }
            if (nnq0Var != null) {
                BooleanValue = 0;
            } else {
                BooleanValue = 0;
            }
            Integer numValueOf5 = Integer.valueOf((int) BooleanValue);
            String str25 = d5h0Var.l;
            l5h0Var = d5h0Var.p;
            if (l5h0Var != null) {
                arrayList4 = iun.f15405a;
            } else {
                arrayList4 = iun.f15405a;
            }
            ?? r64 = arrayList4;
            map = d5h0Var.q;
            if (map != null) {
                arrayList6 = new ArrayList(map.size());
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList6.add(kcx.Y((Map.Entry) it.next()));
                }
                arrayList5 = arrayList6;
            } else {
                arrayList5 = null;
            }
            bool = d5h0Var.m;
            if (bool != null) {
                BooleanValue2 = bool.booleanValue();
            } else {
                BooleanValue2 = 0;
            }
            Integer numValueOf6 = Integer.valueOf((int) BooleanValue2);
            Integer num17 = d5h0Var.o;
            Integer num18 = d5h0Var.s;
            if (tbrVar != null) {
                iIntValue = 0;
            } else {
                iIntValue = 0;
            }
            if (tbrVar != null) {
                iIntValue2 = 0;
            } else {
                iIntValue2 = 0;
            }
            tasVar = new tas(str20, num11, str21, arrayList3, num12, num13, num14, vasVar, str24, l4, num, numValueOf5, str25, r64, arrayList5, numValueOf6, num17, num18, new ubr(iIntValue, iIntValue2));
        } else {
            tasVar = null;
        }
        long jLongValue8 = l9 != null ? l9.longValue() : 0L;
        if (l26 != null) {
            jLongValue4 = l26.longValue();
        } else if (l9 != null) {
            jLongValue4 = l9.longValue();
        }
        long j6 = jLongValue4;
        Long l27 = su10Var.e;
        String str26 = su10Var.k;
        String str27 = su10Var.n;
        String str28 = su10Var.i;
        String str29 = gxsVar != null ? gxsVar.b : null;
        Integer num19 = su10Var.w;
        String str30 = su10Var.m;
        long j7 = jLongValue8;
        Integer numValueOf7 = l25 != null ? Integer.valueOf((int) l25.longValue()) : null;
        Boolean bool11 = su10Var.t;
        String str31 = su10Var.f;
        long jLongValue9 = (wz5Var == null || (l3 = wz5Var.f40006a) == null) ? j3 : l3.longValue();
        String str32 = (wz5Var == null || (str2 = wz5Var.b) == null) ? str : str2;
        oas oasVarK4 = ucx.k0(h06Var6);
        oas oasVarK5 = ucx.k0(h06Var5);
        Long l28 = su10Var.g;
        Long lValueOf = l28 != null ? Long.valueOf(l28.longValue() - j4) : null;
        long jLongValue10 = (l26Var == null || (l2 = l26Var.f19293a) == null) ? j2 : l2.longValue();
        long jLongValue11 = (pkl0Var == null || (l = pkl0Var.f27140a) == null) ? j : l.longValue();
        ufs ufsVarA1 = mbrVar2 != null ? acb.a0(mbrVar2) : null;
        boolean zBooleanValue2 = bool6 != 0 ? bool6.booleanValue() : false;
        Boolean bool12 = su10Var.I;
        Boolean bool13 = su10Var.q;
        boolean zD3 = Intrinsics.d(bool5, Boolean.TRUE);
        Integer numValueOf8 = l10 != null ? Integer.valueOf((int) l10.longValue()) : null;
        String str33 = dssVar != null ? dssVar.b : null;
        Boolean bool14 = gxsVar != null ? gxsVar.f12093a : null;
        qud qudVar3 = boh.b;
        Integer num20 = wz5Var != null ? wz5Var.d : null;
        Boolean bool15 = pkl0Var != null ? pkl0Var.d : null;
        qudVar3.getClass();
        return new nas(j7, j6, l27, str26, str27, str28, str29, bool14, num19, str30, numValueOf7, bool11, str31, null, arrayList2, arrayList, Long.valueOf(jLongValue9), sipVar, str32, tasVar, l28, lValueOf, Long.valueOf(jLongValue10), jLongValue11, oasVarK4, oasVarK5, zD3, null, ufsVarA1, Boolean.valueOf(zBooleanValue2), bool12, null, bool13, numValueOf8, str33, null, qud.d(num20, bool15), su10Var.h);
    }

    public static final ial0 u(long j, String str, String str2, boolean z, List list) {
        cap capVar = cap.f4022a;
        str.getClass();
        return new ial0(str, b5x.d0(new c280(vsm0.s(j, str2), R.drawable.ic_glyph_placeholder_player), j, list, z, capVar));
    }

    public static final boolean v(x6x x6xVar) {
        return !x6xVar.h && x6xVar.d;
    }

    public static final boolean w(x6x x6xVar) {
        return x6xVar.h && !x6xVar.d;
    }

    public static final void x(int i) {
        if (i >= 1) {
            return;
        }
        c99.s(twn.m(i, "Expected positive parallelism level, but got "));
    }

    public static dd40 y(sgy sgyVar, String str) {
        dd40 dd40Var;
        sgyVar.getClass();
        HashMap map = dd40.c;
        synchronized (map) {
            try {
                Object dd40Var2 = map.get(str);
                if (dd40Var2 == null) {
                    dd40Var2 = new dd40(sgyVar, str);
                    map.put(str, dd40Var2);
                }
                dd40Var = (dd40) dd40Var2;
                if (!Intrinsics.d(dd40Var.b, sgyVar)) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dd40Var;
    }

    public static final eug0 z(q16 q16Var) throws b95, ayw {
        q16Var.getClass();
        String str = q16Var.f27936a;
        eug0 eug0Var = (eug0) q16Var.d;
        boolean z = q16Var.b;
        if (q16Var.c == i2o.BetSaleUnknownError) {
            if (str == null) {
                str = "";
            }
            throw new b95(str);
        }
        if (z || eug0Var == null) {
            return (eug0) q16Var.a();
        }
        throw new ayw(d7x.O(eug0Var), str);
    }
}
