package a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1998a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r34v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        int iL0;
        float f2;
        float f3;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i = 0;
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = hqd0.f13481a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i, i);
                int resourceId = ObtainAttributes.getResourceId(i, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f1998a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    int i3 = typedValue.type;
                    if (i3 < 28 || i3 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i, -65281);
                }
                if (ObtainAttributes.hasValue(r4)) {
                    f = ObtainAttributes.getFloat(r4, 1.0f);
                } else {
                    f = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r4;
                float f4 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i4 = i;
                int i5 = i4;
                while (i4 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i6 = i5 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i5] = attributeNameResource;
                        i5 = i6;
                    }
                    i4++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i5);
                float f5 = 0.0f;
                boolean z = (f4 < 0.0f || f4 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f != 1.0f || z) {
                    int iU = r7x.u((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (z) {
                        uv9 uv9VarA = uv9.a(color);
                        float f6 = uv9VarA.f36337a;
                        float f7 = uv9VarA.b;
                        smu0 smu0Var = smu0.k;
                        if (f7 >= 1.0d && Math.round(f4) > 0.0d && Math.round(f4) < 100.0d) {
                            float fMin = f6 < 0.0f ? 0.0f : Math.min(360.0f, f6);
                            float fZ = f7;
                            boolean z2 = r16 == true ? 1 : 0;
                            uv9 uv9Var = null;
                            while (true) {
                                if (Math.abs(f5 - f7) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    float f8 = f4;
                                    if (uv9Var != null) {
                                        iL0 = uv9Var.c(smu0Var);
                                        break;
                                    }
                                    iL0 = b34.l0(f8);
                                    break;
                                }
                                float f9 = 1000.0f;
                                iArrTrimStateSet = iArrTrimStateSet;
                                float f10 = 0.0f;
                                float f11 = 100.0f;
                                float f12 = 1000.0f;
                                uv9 uv9Var2 = null;
                                while (true) {
                                    if (Math.abs(f10 - f11) <= 0.01f) {
                                        depth2 = depth2;
                                        f4 = f4;
                                        break;
                                    }
                                    float fZ2 = rw2.z(f11, f10, 2.0f, f10);
                                    float f13 = f11;
                                    int iC = uv9.b(fZ2, fZ, fMin).c(smu0.k);
                                    float fN0 = b34.n0(Color.red(iC));
                                    float fN1 = b34.n0(Color.green(iC));
                                    float fN2 = b34.n0(Color.blue(iC));
                                    float[] fArr = b34.f[r16 == true ? 1 : 0];
                                    float f14 = ((fN2 * fArr[2]) + ((fN1 * fArr[r16 == true ? 1 : 0]) + (fN0 * fArr[0]))) / 100.0f;
                                    float fCbrt = f14 <= 0.008856452f ? f14 * 903.2963f : (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f4 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        uv9 uv9VarA2 = uv9.a(iC);
                                        f2 = fCbrt;
                                        f3 = fZ2;
                                        uv9 uv9VarB = uv9.b(uv9VarA2.c, uv9VarA2.b, fMin);
                                        float f15 = uv9VarA2.d - uv9VarB.d;
                                        float f16 = uv9VarA2.e - uv9VarB.e;
                                        float f17 = uv9VarA2.f - uv9VarB.f;
                                        depth2 = depth2;
                                        f4 = f4;
                                        float fPow = (float) (Math.pow(Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            uv9Var2 = uv9VarA2;
                                            f12 = fPow;
                                            f9 = fAbs;
                                        }
                                    } else {
                                        f2 = fCbrt;
                                        f3 = fZ2;
                                        depth2 = depth2;
                                        f4 = f4;
                                    }
                                    if (f9 == 0.0f && f12 == 0.0f) {
                                        break;
                                    }
                                    if (f2 < f4) {
                                        f11 = f13;
                                        f10 = f3;
                                    } else {
                                        f11 = f3;
                                    }
                                    depth2 = depth2;
                                    f4 = f4;
                                }
                                uv9 uv9Var3 = uv9Var2;
                                if (!z2) {
                                    if (uv9Var3 == null) {
                                        f7 = fZ;
                                    } else {
                                        uv9Var = uv9Var3;
                                        f5 = fZ;
                                    }
                                    fZ = rw2.z(f7, f5, 2.0f, f5);
                                } else {
                                    if (uv9Var3 != null) {
                                        iL0 = uv9Var3.c(smu0Var);
                                        break;
                                    }
                                    fZ = rw2.z(f7, f5, 2.0f, f5);
                                    z2 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iL0 = b34.l0(f4);
                        }
                        color = iL0;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iU << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i7 = i2 + 1;
                if (i7 > iArr.length) {
                    int[] iArr4 = new int[i2 <= 4 ? 8 : i2 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i2);
                    iArr = iArr4;
                }
                iArr[i2] = color;
                if (i7 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i2);
                    objArr = objArr2;
                }
                objArr[i2] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i2 = i7;
                r4 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i = 0;
            } else {
                int i8 = depth2;
                r4 = r4 == true ? 1 : 0;
                depth2 = i8;
                i = 0;
            }
        }
        int[] iArr5 = new int[i2];
        int[][] iArr6 = new int[i2][];
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        System.arraycopy(objArr, 0, iArr6, 0, i2);
        return new ColorStateList(iArr6, iArr5);
    }
}
