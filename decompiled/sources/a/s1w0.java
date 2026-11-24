package a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.PathInterpolator;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q3u0 f31475a = q3u0.f28068a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ghn a(TypedArray typedArray, Resources resources, Resources.Theme theme, int i, ghn ghnVar) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes;
        ghn zsfVar;
        TypedArray typedArrayObtainAttributes2;
        TypedArray typedArrayObtainAttributes3;
        TypedArray typedArrayObtainAttributes4;
        TypedArray typedArrayObtainAttributes5;
        TypedArray typedArrayObtainAttributes6;
        TypedArray typedArrayObtainAttributes7;
        final byte b = 0;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return ghnVar;
        }
        ghn ghnVar2 = (ghn) c83.e.get(Integer.valueOf(resourceId));
        if (ghnVar2 != null) {
            return ghnVar2;
        }
        XmlResourceParser xml = resources.getXml(resourceId);
        j5n0.C(xml);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        int[] iArr = cy2.j;
        String name = xml.getName();
        if (name != null) {
            final byte b2 = 4;
            final byte b3 = 1;
            final byte b4 = 2;
            final byte b5 = 3;
            switch (name.hashCode()) {
                case -2140409460:
                    if (name.equals("pathInterpolator")) {
                        int[] iArr2 = cy2.o;
                        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0)) == null) {
                            typedArrayObtainAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                        }
                        try {
                            String string = typedArrayObtainAttributes.getString(4);
                            if (string != null) {
                                zsfVar = new a83(new PathInterpolator(gfx.E(string)));
                            } else {
                                zsfVar = (typedArrayObtainAttributes.hasValue(2) && typedArrayObtainAttributes.hasValue(3)) ? new zsf(typedArrayObtainAttributes.getFloat(0, 0.0f), typedArrayObtainAttributes.getFloat(1, 0.0f), typedArrayObtainAttributes.getFloat(2, 1.0f), typedArrayObtainAttributes.getFloat(3, 1.0f)) : new a83(new PathInterpolator(typedArrayObtainAttributes.getFloat(0, 0.0f), typedArrayObtainAttributes.getFloat(1, 0.0f)));
                            }
                            return zsfVar;
                        } finally {
                            typedArrayObtainAttributes.recycle();
                        }
                    }
                    break;
                case -2120889007:
                    if (name.equals("anticipateInterpolator")) {
                        if (theme == null || (typedArrayObtainAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0)) == null) {
                            typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr);
                        }
                        try {
                            final float f = typedArrayObtainAttributes2.getFloat(0, 2.0f);
                            return new ghn() { // from class: a.b83
                                @Override // a.ghn
                                public final float a(float f2) {
                                    double dPow;
                                    switch (b) {
                                        case 0:
                                            float f3 = f;
                                            return (((1.0f + f3) * f2) - f3) * f2 * f2;
                                        case 1:
                                            dPow = Math.pow(f2, f * 2.0f);
                                            break;
                                        case 2:
                                            float f4 = f2 - 1.0f;
                                            float f5 = f;
                                            return ((((f5 + 1.0f) * f4) + f5) * f4 * f4) + 1.0f;
                                        case 3:
                                            dPow = Math.sin(((double) (2.0f * f)) * 3.141592653589793d * ((double) f2));
                                            break;
                                        default:
                                            return 1.0f - ((float) Math.pow(1.0f - f2, 2.0f * f));
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                            typedArrayObtainAttributes2.recycle();
                        }
                    }
                    break;
                case -1248486260:
                    if (name.equals("linearInterpolator")) {
                        return ihn.d;
                    }
                    break;
                case -935873468:
                    if (name.equals("accelerateInterpolator")) {
                        int[] iArr3 = cy2.k;
                        if (theme == null || (typedArrayObtainAttributes3 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0)) == null) {
                            typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                        }
                        try {
                            final float f2 = typedArrayObtainAttributes3.getFloat(0, 1.0f);
                            return f2 == 1.0f ? c83.b : new ghn() { // from class: a.b83
                                @Override // a.ghn
                                public final float a(float f3) {
                                    double dPow;
                                    switch (b3) {
                                        case 0:
                                            float f4 = f2;
                                            return (((1.0f + f4) * f3) - f4) * f3 * f3;
                                        case 1:
                                            dPow = Math.pow(f3, f2 * 2.0f);
                                            break;
                                        case 2:
                                            float f5 = f3 - 1.0f;
                                            float f6 = f2;
                                            return ((((f6 + 1.0f) * f5) + f6) * f5 * f5) + 1.0f;
                                        case 3:
                                            dPow = Math.sin(((double) (2.0f * f2)) * 3.141592653589793d * ((double) f3));
                                            break;
                                        default:
                                            return 1.0f - ((float) Math.pow(1.0f - f3, 2.0f * f2));
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                            typedArrayObtainAttributes3.recycle();
                        }
                    }
                    break;
                case -425326737:
                    if (name.equals("bounceInterpolator")) {
                        return c83.c;
                    }
                    break;
                case 1192587314:
                    if (name.equals("overshootInterpolator")) {
                        int[] iArr4 = cy2.n;
                        if (theme == null || (typedArrayObtainAttributes4 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0)) == null) {
                            typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                        }
                        try {
                            final float f3 = typedArrayObtainAttributes4.getFloat(0, 2.0f);
                            return new ghn() { // from class: a.b83
                                @Override // a.ghn
                                public final float a(float f4) {
                                    double dPow;
                                    switch (b4) {
                                        case 0:
                                            float f5 = f3;
                                            return (((1.0f + f5) * f4) - f5) * f4 * f4;
                                        case 1:
                                            dPow = Math.pow(f4, f3 * 2.0f);
                                            break;
                                        case 2:
                                            float f6 = f4 - 1.0f;
                                            float f7 = f3;
                                            return ((((f7 + 1.0f) * f6) + f7) * f6 * f6) + 1.0f;
                                        case 3:
                                            dPow = Math.sin(((double) (2.0f * f3)) * 3.141592653589793d * ((double) f4));
                                            break;
                                        default:
                                            return 1.0f - ((float) Math.pow(1.0f - f4, 2.0f * f3));
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                            typedArrayObtainAttributes4.recycle();
                        }
                    }
                    break;
                case 1472030440:
                    if (name.equals("anticipateOvershootInterpolator")) {
                        if (theme == null || (typedArrayObtainAttributes5 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0)) == null) {
                            typedArrayObtainAttributes5 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr);
                        }
                        try {
                            return new a83(new AnticipateOvershootInterpolator(typedArrayObtainAttributes5.getFloat(0, 2.0f), typedArrayObtainAttributes5.getFloat(1, 1.5f)));
                        } finally {
                            typedArrayObtainAttributes5.recycle();
                        }
                    }
                    break;
                case 1962594083:
                    if (name.equals("decelerateInterpolator")) {
                        int[] iArr5 = cy2.l;
                        if (theme == null || (typedArrayObtainAttributes6 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr5, 0, 0)) == null) {
                            typedArrayObtainAttributes6 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr5);
                        }
                        try {
                            final float f4 = typedArrayObtainAttributes6.getFloat(0, 1.0f);
                            return f4 == 1.0f ? c83.d : new ghn() { // from class: a.b83
                                @Override // a.ghn
                                public final float a(float f5) {
                                    double dPow;
                                    switch (b2) {
                                        case 0:
                                            float f6 = f4;
                                            return (((1.0f + f6) * f5) - f6) * f5 * f5;
                                        case 1:
                                            dPow = Math.pow(f5, f4 * 2.0f);
                                            break;
                                        case 2:
                                            float f7 = f5 - 1.0f;
                                            float f8 = f4;
                                            return ((((f8 + 1.0f) * f7) + f8) * f7 * f7) + 1.0f;
                                        case 3:
                                            dPow = Math.sin(((double) (2.0f * f4)) * 3.141592653589793d * ((double) f5));
                                            break;
                                        default:
                                            return 1.0f - ((float) Math.pow(1.0f - f5, 2.0f * f4));
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                            typedArrayObtainAttributes6.recycle();
                        }
                    }
                    break;
                case 2019672672:
                    if (name.equals("accelerateDecelerateInterpolator")) {
                        return c83.f3893a;
                    }
                    break;
                case 2038238413:
                    if (name.equals("cycleInterpolator")) {
                        int[] iArr6 = cy2.m;
                        if (theme == null || (typedArrayObtainAttributes7 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr6, 0, 0)) == null) {
                            typedArrayObtainAttributes7 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr6);
                        }
                        try {
                            final float f5 = typedArrayObtainAttributes7.getFloat(0, 1.0f);
                            return new ghn() { // from class: a.b83
                                @Override // a.ghn
                                public final float a(float f6) {
                                    double dPow;
                                    switch (b5) {
                                        case 0:
                                            float f7 = f5;
                                            return (((1.0f + f7) * f6) - f7) * f6 * f6;
                                        case 1:
                                            dPow = Math.pow(f6, f5 * 2.0f);
                                            break;
                                        case 2:
                                            float f8 = f6 - 1.0f;
                                            float f9 = f5;
                                            return ((((f9 + 1.0f) * f8) + f9) * f8 * f8) + 1.0f;
                                        case 3:
                                            dPow = Math.sin(((double) (2.0f * f5)) * 3.141592653589793d * ((double) f6));
                                            break;
                                        default:
                                            return 1.0f - ((float) Math.pow(1.0f - f6, 2.0f * f5));
                                    }
                                    return (float) dPow;
                                }
                            };
                        } finally {
                            typedArrayObtainAttributes7.recycle();
                        }
                    }
                    break;
            }
        }
        itt0.k(kng0.k("Unknown interpolator: ", xml.getName()));
        return null;
    }

    public static final dmy b(TypedArray typedArray, float f, ghn ghnVar, q3u0 q3u0Var, int i) {
        int iOrdinal = q3u0Var.ordinal();
        if (iOrdinal == 0) {
            return new dmy(f, Float.valueOf(typedArray.getFloat(i, 0.0f)), ghnVar);
        }
        if (iOrdinal == 1) {
            return new dmy(f, Integer.valueOf(typedArray.getInt(i, 0)), ghnVar);
        }
        if (iOrdinal == 2) {
            return new dmy(f, new y3d(fbc.d(typedArray.getColor(i, 0))), ghnVar);
        }
        if (iOrdinal == 3) {
            return new dmy(f, q4u0.a(typedArray.getString(i)), ghnVar);
        }
        t9f.b();
        return null;
    }

    public static final p0d0 c(TypedArray typedArray, String str, int i, int i2, int i3, ghn ghnVar, Function2 function2) {
        int i4 = typedArray.getInt(i, 4);
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i5 = typedValuePeekValue != null ? typedValuePeekValue.type : 4;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        q3u0 q3u0VarD = d(new int[]{i5, typedValuePeekValue2 != null ? typedValuePeekValue2.type : 4}, i4);
        ArrayList arrayList = new ArrayList();
        if (q3u0VarD == null && (z || z2)) {
            q3u0VarD = q3u0.f28068a;
        }
        if (z) {
            q3u0VarD.getClass();
            arrayList.add(b(typedArray, 0.0f, ghnVar, q3u0VarD, i2));
        }
        if (z2) {
            q3u0VarD.getClass();
            arrayList.add(b(typedArray, 1.0f, ghnVar, q3u0VarD, i3));
        }
        q3u0 q3u0Var = (q3u0) function2.invoke(q3u0VarD, arrayList);
        if (arrayList.size() > 1) {
            v3d.t(new jzt0((byte) 5), arrayList);
        }
        int iOrdinal = q3u0Var.ordinal();
        if (iOrdinal == 0) {
            return new t0d0(str, arrayList);
        }
        if (iOrdinal == 1) {
            return new u0d0(str);
        }
        if (iOrdinal == 2) {
            return new s0d0(str, arrayList);
        }
        if (iOrdinal == 3) {
            return new v0d0(str, arrayList);
        }
        t9f.b();
        return null;
    }

    public static final q3u0 d(int[] iArr, int i) {
        if (i == 0) {
            return q3u0.f28068a;
        }
        if (i == 1) {
            return q3u0.b;
        }
        if (i == 2) {
            return q3u0.d;
        }
        if (i == 3) {
            return q3u0.c;
        }
        for (int i2 : iArr) {
            if (28 > i2 || i2 >= 32) {
                return null;
            }
        }
        return q3u0.c;
    }

    public static final d83 e(XmlResourceParser xmlResourceParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes;
        int[] iArr = cy2.f;
        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0)) == null) {
            typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        }
        try {
            int i = typedArrayObtainAttributes.getInt(0, 0);
            ArrayList arrayList = new ArrayList();
            xmlResourceParser.next();
            while (!j5n0.B(xmlResourceParser) && (xmlResourceParser.getEventType() != 3 || !Intrinsics.d(xmlResourceParser.getName(), "set"))) {
                if (xmlResourceParser.getEventType() == 2) {
                    String name = xmlResourceParser.getName();
                    if (Intrinsics.d(name, "set")) {
                        arrayList.add(e(xmlResourceParser, resources, theme, attributeSet));
                    } else if (Intrinsics.d(name, "objectAnimator")) {
                        arrayList.add(f(xmlResourceParser, resources, theme, attributeSet));
                    }
                }
                xmlResourceParser.next();
            }
            return new d83(arrayList, i != 0 ? ja80.b : ja80.f16178a);
        } finally {
            typedArrayObtainAttributes.recycle();
        }
    }

    public static final q960 f(XmlResourceParser xmlResourceParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes;
        TypedArray typedArrayObtainAttributes2;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        ArrayList arrayList2;
        ghn ghnVar;
        int i4;
        TypedArray typedArrayObtainAttributes3;
        TypedArray typedArray;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        int[] iArr = cy2.e;
        if (theme2 == null || (typedArrayObtainAttributes = theme2.obtainStyledAttributes(attributeSet2, iArr, 0, 0)) == null) {
            typedArrayObtainAttributes = resources2.obtainAttributes(attributeSet2, iArr);
        }
        TypedArray typedArray2 = typedArrayObtainAttributes;
        try {
            int[] iArr2 = cy2.i;
            if (theme2 == null || (typedArrayObtainAttributes2 = theme2.obtainStyledAttributes(attributeSet2, iArr2, 0, 0)) == null) {
                typedArrayObtainAttributes2 = resources2.obtainAttributes(attributeSet2, iArr2);
            }
            TypedArray typedArray3 = typedArrayObtainAttributes2;
            try {
                ghn ghnVarA = a(typedArray2, resources2, theme2, 0, c83.f3893a);
                ArrayList arrayList3 = new ArrayList();
                int i5 = 1;
                String string = typedArray3.getString(1);
                int i6 = 3;
                if (string != null) {
                    String string2 = typedArray3.getString(2);
                    string2.getClass();
                    String string3 = typedArray3.getString(3);
                    string3.getClass();
                    arrayList3.add(new q0d0(string2, string3, q4u0.a(string), ghnVarA));
                    arrayList = arrayList3;
                    i = 1;
                    i3 = 3;
                    i2 = 2;
                } else {
                    int i7 = 2;
                    String string4 = typedArray3.getString(0);
                    if (string4 != null) {
                        arrayList3.add(c(typedArray2, string4, 7, 5, 6, ghnVarA, new i9v0((byte) 20)));
                    }
                    xmlResourceParser.next();
                    while (!j5n0.B(xmlResourceParser) && (xmlResourceParser.getEventType() != i6 || !Intrinsics.d(xmlResourceParser.getName(), "objectAnimator"))) {
                        if (xmlResourceParser.getEventType() == i7 && Intrinsics.d(xmlResourceParser.getName(), "propertyValuesHolder")) {
                            int[] iArr3 = cy2.g;
                            if (theme2 == null || (typedArrayObtainAttributes3 = theme2.obtainStyledAttributes(attributeSet2, iArr3, 0, 0)) == null) {
                                typedArrayObtainAttributes3 = resources2.obtainAttributes(attributeSet2, iArr3);
                            }
                            try {
                                String string5 = typedArrayObtainAttributes3.getString(i6);
                                string5.getClass();
                                ghnVar = ghnVarA;
                                i4 = i6;
                                arrayList2 = arrayList3;
                                typedArray = typedArrayObtainAttributes3;
                                try {
                                    p0d0 p0d0VarC = c(typedArray, string5, 2, 0, 1, ghnVar, new tvl0(xmlResourceParser, resources2, theme2, attributeSet2, ghnVar, (byte) 9));
                                    typedArray.recycle();
                                    arrayList2.add(p0d0VarC);
                                } catch (Throwable th) {
                                    th = th;
                                    typedArray.recycle();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                typedArray = typedArrayObtainAttributes3;
                            }
                        } else {
                            arrayList2 = arrayList3;
                            ghnVar = ghnVarA;
                            i4 = i6;
                        }
                        xmlResourceParser.next();
                        resources2 = resources;
                        theme2 = theme;
                        attributeSet2 = attributeSet;
                        arrayList3 = arrayList2;
                        i5 = i5;
                        i6 = i4;
                        ghnVarA = ghnVar;
                        i7 = i7;
                    }
                    arrayList = arrayList3;
                    i = i5;
                    i2 = i7;
                    i3 = i6;
                }
                q960 q960Var = new q960(typedArray2.getInt(i, 300), typedArray2.getInt(i2, 0), typedArray2.getInt(i3, 0), typedArray2.getInt(4, 0) == i2 ? kkf0.b : kkf0.f18436a, arrayList);
                typedArray3.recycle();
                typedArray2.recycle();
                return q960Var;
            } catch (Throwable th3) {
                typedArray3.recycle();
                throw th3;
            }
        } catch (Throwable th4) {
            typedArray2.recycle();
            throw th4;
        }
    }
}
