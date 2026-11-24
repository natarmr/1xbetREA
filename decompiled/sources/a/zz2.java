package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class zz2 implements nae0, d28 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45232a;
    public Object b;
    public Object c;

    public zz2(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(Separators.COMMA);
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.c = string;
        this.b = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.b, i)) {
            i++;
        }
        this.f45232a = i;
    }

    public static int E(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = ((bez) list.get(i3)).f2476a - i;
            if (i4 < 0) {
                i2 = i3 + 1;
            } else {
                if (i4 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static zz2 g(int i, Resources.Theme theme, Resources resources) {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = b5d.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new zz2((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayS = zsm0.s(resources, theme, attributeSetAsAttributeSet, hqd0.e);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayS.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayS.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayS.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayS.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayS.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayS.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", Payload.TYPE) != null ? typedArrayS.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayS.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayS.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayS.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayS.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayS.getFloat(5, 0.0f) : 0.0f;
        typedArrayS.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayS2 = zsm0.s(resources, theme, attributeSetAsAttributeSet, hqd0.f);
                boolean zHasValue = typedArrayS2.hasValue(0);
                boolean zHasValue2 = typedArrayS2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayS2.getColor(0, 0);
                float f11 = typedArrayS2.getFloat(1, 0.0f);
                typedArrayS2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        ieu ieuVar = arrayList2.size() > 0 ? new ieu(arrayList2, arrayList) : null;
        if (ieuVar == null) {
            ieuVar = z ? new ieu(color, color2, color3) : new ieu(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = (int[]) ieuVar.b;
                float[] fArr = (float[]) ieuVar.c;
                if (i3 != 1) {
                    tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) ieuVar.b, (float[]) ieuVar.c);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) ieuVar.b;
            float[] fArr2 = (float[]) ieuVar.c;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new zz2(radialGradient, (ColorStateList) null, 0);
    }

    public static void h(zz2 zz2Var, s68 s68Var) {
        int length = ((int[]) zz2Var.c).length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            ((int[]) zz2Var.c)[i2] = i;
            epv0.V(zz2Var.f45232a, (int[]) zz2Var.b, i, s68Var);
            i += 1080;
        }
    }

    public void A(Object obj, Object obj2) {
        int i = (this.f45232a + 1) * 2;
        Object[] objArr = (Object[]) this.b;
        if (i > objArr.length) {
            this.b = Arrays.copyOf(objArr, r3x.e(objArr.length, i));
        }
        e3c.q(obj, obj2);
        Object[] objArr2 = (Object[]) this.b;
        int i2 = this.f45232a;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f45232a = i2 + 1;
    }

    public void B(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.f45232a) * 2;
            Object[] objArr = (Object[]) this.b;
            if (size > objArr.length) {
                this.b = Arrays.copyOf(objArr, r3x.e(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            A(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(IndexedValue indexedValue, zje zjeVar) {
        zjq zjqVar;
        k050 k050Var;
        if (zjeVar instanceof zjq) {
            zjqVar = (zjq) zjeVar;
            int i = zjqVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                zjqVar.m = i - Integer.MIN_VALUE;
            } else {
                zjqVar = new zjq(this, zjeVar);
            }
        } else {
            zjqVar = new zjq(this, zjeVar);
        }
        Object obj = zjqVar.k;
        wne wneVar = wne.f39444a;
        int i2 = zjqVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            k050Var = (k050) this.c;
            zjqVar.i = indexedValue;
            zjqVar.j = k050Var;
            zjqVar.m = 1;
            if (k050Var.d(zjqVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = zjqVar.j;
            IndexedValue indexedValue2 = zjqVar.i;
            z1x.P(obj);
            k050Var = k050Var2;
            indexedValue = indexedValue2;
        }
        try {
            this.f45232a = indexedValue.f46061a;
            ((akq) this.b).a((wh80) indexedValue.b);
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    public void D() {
        qx3.o((int[]) this.b, 0, 0, 6);
        ((xw3) this.c).clear();
    }

    public void F(int[] iArr, int i) {
        xw3 xw3Var = (xw3) this.c;
        int iE = E(i, xw3Var);
        if (iE < 0) {
            if (iArr == null) {
                return;
            }
            xw3Var.add(-(iE + 1), new bez(iArr, i));
        } else if (iArr == null) {
            xw3Var.e(iE);
        } else {
            ((bez) xw3Var.get(iE)).b = iArr;
        }
    }

    public void G(int i) {
        ImageView imageView = (ImageView) this.b;
        if (i != 0) {
            Drawable drawableU = epv0.U(i, imageView.getContext());
            if (drawableU != null) {
                qhl.a(drawableU);
            }
            imageView.setImageDrawable(drawableU);
        } else {
            imageView.setImageDrawable(null);
        }
        c();
    }

    public void H(int i, int i2) {
        if (i < 0) {
            adx.a("Negative lanes are not supported");
        }
        m(i);
        ((int[]) this.b)[i - this.f45232a] = i2 + 1;
    }

    public void I(Fragment fragment, iiy iiyVar, int i) {
        fragment.getClass();
        iiyVar.getClass();
        Bundle bundle = fragment.g;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.s0(bundle);
        }
        bundle.putInt((String) this.b, i);
        this.c = Integer.valueOf(i);
    }

    public void J(int i, int i2, int i3, long j) {
        char c;
        int i4;
        char c2;
        int i5;
        char c3 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i6 = 33554431;
            char c4 = 25;
            long j2 = (j & nge0.b) | (((long) (i & 33554431)) << 25);
            long[] jArr = (long[]) this.b;
            long[] jArr2 = (long[]) this.c;
            int i7 = this.f45232a;
            jArr2[0] = j2;
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j3 = jArr2[i8];
                int i9 = ((int) j3) & i6;
                int i10 = ((int) (j3 >> c4)) & i6;
                int i11 = ((int) (j3 >> c3)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j4 = jArr[i13];
                    if ((((int) (j4 >> c4)) & i6) == i9) {
                        long j5 = jArr[i10];
                        int i14 = i10 + 1;
                        c = c3;
                        i4 = i6;
                        long j6 = jArr[i14];
                        c2 = c4;
                        i5 = i12;
                        jArr[i10] = (((long) (((int) j5) + i3)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i2)) << 32);
                        jArr[i14] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                        jArr[i13] = (((j4 >> 63) & 1) << 60) | j4;
                        if ((((int) (j4 >> c)) & 1023) > 0) {
                            jArr2[i8] = (nge0.b & j4) | (((long) ((i10 + 3) & i4)) << c2);
                            i8++;
                        }
                    } else {
                        c = c3;
                        i4 = i6;
                        c2 = c4;
                        i5 = i12;
                    }
                    i10 += 3;
                    i12 = i5;
                    c4 = c2;
                    i6 = i4;
                    c3 = c;
                }
                c4 = c4;
                i6 = i6;
                c3 = c3;
            }
        }
    }

    public void K(String str, Object... objArr) {
        if (this.f45232a <= 2) {
            Log.v((String) this.b, p(str, objArr));
        }
    }

    public void a(int i, waz wazVar) {
        if (i < 0) {
            adx.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        zmx zmxVar = new zmx(this.f45232a, i, wazVar);
        this.f45232a += i;
        ((xz40) this.b).b(zmxVar);
    }

    public void b(int i, iyf iyfVar) {
        int i2;
        int[] iArr = (int[]) this.b;
        iyf[] iyfVarArr = (iyf[]) this.c;
        if (iyfVarArr[i] != null) {
            iyfVarArr[i] = null;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = this.f45232a;
                if (i3 >= i2) {
                    break;
                }
                if (i == iArr[i3]) {
                    iArr[i3] = 999;
                    i4++;
                }
                if (i3 != i4) {
                    iArr[i3] = iArr[i4];
                }
                i4++;
                i3++;
            }
            this.f45232a = i2 - 1;
        }
        iyfVarArr[i] = iyfVar;
        int i5 = this.f45232a;
        this.f45232a = i5 + 1;
        iArr[i5] = i;
        Arrays.sort(iArr);
    }

    public void c() {
        goq0 goq0Var;
        ImageView imageView = (ImageView) this.b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            qhl.a(drawable);
        }
        if (drawable == null || (goq0Var = (goq0) this.c) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = td3.b;
        dtf0.i(drawable, goq0Var, drawableState);
    }

    public boolean d(int i, int i2) {
        int iT = t(i);
        return iT == i2 || iT == -1 || iT == -2;
    }

    public wcf0 e(boolean z) {
        d4x d4xVar;
        d4x d4xVar2;
        if (z && (d4xVar2 = (d4x) this.c) != null) {
            throw d4xVar2.a();
        }
        wcf0 wcf0VarD = wcf0.d(this.f45232a, (Object[]) this.b, this);
        if (!z || (d4xVar = (d4x) this.c) == null) {
            return wcf0VarD;
        }
        throw d4xVar.a();
    }

    public wcf0 f() {
        return e(true);
    }

    public void i(String str, Exception exc, Object... objArr) {
        Log.e((String) this.b, p(str, objArr), exc);
    }

    @Override // a.d28
    public c28 j(guo guoVar, long j) {
        long j2;
        long position = guoVar.getPosition();
        int iMin = (int) Math.min(112800L, guoVar.getLength() - position);
        fq80 fq80Var = (fq80) this.c;
        fq80Var.J(iMin);
        guoVar.n(fq80Var.f9961a, 0, iMin);
        int i = fq80Var.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (fq80Var.a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = fq80Var.f9961a;
            int i2 = fq80Var.b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jR = ltt0.r(fq80Var, i2, this.f45232a);
            if (jR != j2) {
                long jB = ((coq0) this.b).b(jR);
                if (jB > j) {
                    return j5 == j2 ? new c28(-1, jB, position) : new c28(0, -9223372036854775807L, position + j4);
                }
                j5 = jB;
                if (100000 + j5 > j) {
                    return new c28(0, -9223372036854775807L, position + ((long) i2));
                }
                j4 = i2;
            }
            fq80Var.M(i3);
            j3 = i3;
        }
        return j5 != j2 ? new c28(-2, j5, position + j3) : c28.d;
    }

    public void k(String str, Object... objArr) {
        Log.e((String) this.b, p(str, objArr));
    }

    public void l(int i, int i2) {
        if (i > 131072) {
            adx.a("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = (int[]) this.b;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            qx3.h(i2, 0, 12, (int[]) this.b, iArr2);
            this.b = iArr2;
        }
    }

    public void m(int i) {
        xw3 xw3Var = (xw3) this.c;
        int i2 = this.f45232a;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int iMax = Math.max(i - (((int[]) this.b).length / 2), 0);
            this.f45232a = iMax;
            int i4 = iMax - i2;
            int[] iArr = (int[]) this.b;
            if (i4 >= 0) {
                if (i4 < iArr.length) {
                    qx3.d(0, i4, iArr.length, iArr, iArr);
                }
                int[] iArr2 = (int[]) this.b;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), ((int[]) this.b).length, 0);
            } else {
                int i5 = -i4;
                if (iArr.length + i5 < 131072) {
                    l(iArr.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr.length) {
                        qx3.d(i5, 0, iArr.length - i5, iArr, iArr);
                    }
                    int[] iArr3 = (int[]) this.b;
                    Arrays.fill(iArr3, 0, Math.min(iArr3.length, i5), 0);
                }
            }
        } else {
            l(i3 + 1, 0);
        }
        while (!xw3Var.isEmpty() && ((bez) xw3Var.first()).f2476a < this.f45232a) {
            xw3Var.removeFirst();
        }
        while (!xw3Var.isEmpty() && ((bez) xw3Var.last()).f2476a > this.f45232a + ((int[]) this.b).length) {
            xw3Var.removeLast();
        }
    }

    public int o(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!d(i, i2));
        return i;
    }

    public String p(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return ((String) this.c).concat(str);
    }

    public zmx q(int i) {
        if (i < 0 || i >= this.f45232a) {
            adx.e("Index " + i + ", size " + this.f45232a);
        }
        zmx zmxVar = (zmx) this.c;
        if (zmxVar != null) {
            int i2 = zmxVar.f44646a;
            if (i < zmxVar.b + i2 && i2 <= i) {
                return zmxVar;
            }
        }
        xz40 xz40Var = (xz40) this.b;
        zmx zmxVar2 = (zmx) xz40Var.f41739a[q5x.A(i, xz40Var)];
        this.c = zmxVar2;
        return zmxVar2;
    }

    public Object r(int i) {
        SparseArray sparseArray = (SparseArray) this.b;
        if (this.f45232a == -1) {
            this.f45232a = 0;
        }
        while (true) {
            int i2 = this.f45232a;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f45232a--;
        }
        while (this.f45232a < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f45232a + 1)) {
            this.f45232a++;
        }
        return sparseArray.valueAt(this.f45232a);
    }

    public int[] s(int i) {
        xw3 xw3Var = (xw3) this.c;
        bez bezVar = (bez) CollectionsKt.W(E(i, xw3Var), xw3Var);
        if (bezVar != null) {
            return bezVar.b;
        }
        return null;
    }

    public int t(int i) {
        int i2 = this.f45232a;
        if (i < i2) {
            return -1;
        }
        int[] iArr = (int[]) this.b;
        if (i >= iArr.length + i2) {
            return -1;
        }
        return iArr[i - i2] - 1;
    }

    @Override // a.d28
    public void u() {
        fq80 fq80Var = (fq80) this.c;
        byte[] bArr = vtt0.b;
        fq80Var.K(bArr, bArr.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable v(zje zjeVar) {
        yjq yjqVar;
        k050 k050Var;
        if (zjeVar instanceof yjq) {
            yjqVar = (yjq) zjeVar;
            int i = yjqVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yjqVar.l = i - Integer.MIN_VALUE;
            } else {
                yjqVar = new yjq(this, zjeVar);
            }
        } else {
            yjqVar = new yjq(this, zjeVar);
        }
        Object obj = yjqVar.j;
        wne wneVar = wne.f39444a;
        int i2 = yjqVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.c;
            yjqVar.i = k050Var2;
            yjqVar.l = 1;
            if (k050Var2.d(yjqVar) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = yjqVar.i;
            z1x.P(obj);
        }
        try {
            List listB = ((akq) this.b).b();
            int size = (this.f45232a - listB.size()) + 1;
            ArrayList arrayList = new ArrayList(r3d.q(listB, 10));
            int i3 = 0;
            for (Object obj2 : listB) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                arrayList.add(new IndexedValue(i3 + size, (wh80) obj2));
                i3 = i4;
            }
            k050Var.c(null);
            return arrayList;
        } catch (Throwable th) {
            k050Var.c(null);
            throw th;
        }
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Integer n(Fragment fragment, iiy iiyVar) {
        int iIntValue = this.f45232a;
        fragment.getClass();
        iiyVar.getClass();
        Integer num = (Integer) this.c;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Bundle bundle = fragment.g;
            Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt((String) this.b, iIntValue)) : null;
            this.c = numValueOf;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int x(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.b;
        int i9 = this.f45232a;
        int i10 = i9 + 3;
        this.f45232a = i10;
        int length = jArr.length;
        if (length <= i10) {
            int iMax = Math.max(length * 2, i10);
            this.b = Arrays.copyOf(jArr, iMax);
            this.c = Arrays.copyOf((long[]) this.c, iMax);
        }
        long[] jArr2 = (long[]) this.b;
        jArr2[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            xcx.b("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            xcx.b("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        jArr2[i12] = (nge0.f23481a & j) | (((long) Math.min((i9 - i7) / 3, 1023)) << 50);
        return i9;
    }

    public boolean y() {
        ColorStateList colorStateList;
        return ((Shader) this.b) == null && (colorStateList = (ColorStateList) this.c) != null && colorStateList.isStateful();
    }

    public void z(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.b;
        Context context = imageView.getContext();
        int[] iArr = mqd0.f;
        ywu ywuVarY = ywu.y(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ywuVarY.c;
        rgu0.n(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) ywuVarY.c, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = epv0.U(resourceId, imageView.getContext())) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                qhl.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(ywuVarY.m(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(qhl.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            ywuVarY.A();
        }
    }

    public zz2(r68 r68Var, ArrayList arrayList, int i) {
        this.c = r68Var;
        this.b = arrayList;
        this.f45232a = i;
    }

    public zz2(ImageView imageView) {
        this.f45232a = 0;
        this.b = imageView;
    }

    public zz2(String str) {
        this.b = str;
        this.f45232a = Integer.MIN_VALUE;
    }

    public zz2(String str, int i) {
        this.b = str;
        this.f45232a = i;
    }

    public zz2(Shader shader, ColorStateList colorStateList, int i) {
        this.b = shader;
        this.c = colorStateList;
        this.f45232a = i;
    }

    public zz2(byte b) {
        switch (b) {
            case 10:
                int[] iArr = new int[101];
                this.b = iArr;
                iyf[] iyfVarArr = new iyf[101];
                this.c = iyfVarArr;
                Arrays.fill(iArr, 999);
                Arrays.fill(iyfVarArr, (Object) null);
                this.f45232a = 0;
                break;
            case 11:
                this.b = new int[16];
                this.c = new xw3();
                break;
            case 12:
            case 13:
            default:
                this.b = new akq();
                this.c = new k050();
                this.f45232a = -1;
                break;
            case 14:
                this.b = new xz40(new zmx[16]);
                break;
        }
    }

    public zz2(jgb jgbVar, List list) {
        list.getClass();
        this.c = jgbVar;
        this.b = list;
    }

    public zz2(int i) {
        this.b = new Object[i * 2];
        this.f45232a = 0;
    }

    public zz2(androidx.media3.common.b bVar, int i, String str) {
        this.b = bVar;
        this.f45232a = i;
        this.c = str;
    }
}
