package a;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.io.IOException;
import java.io.OutputStream;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class tyc implements qqg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34746a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public tyc(CharSequence charSequence, int i, Locale locale) {
        this.f34746a = (byte) 8;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            ycx.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            ycx.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new gvb(i, charSequence));
    }

    public static boolean K(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public static tyc M(OutputStream outputStream, int i) {
        return new tyc(outputStream, new byte[i]);
    }

    public static int m(int i, int i2) {
        return o(i2) + t(i);
    }

    public static int n(int i, int i2) {
        return o(i2) + t(i);
    }

    public static int o(int i) {
        if (i >= 0) {
            return r(i);
        }
        return 10;
    }

    public static int p(int i, z3 z3Var) {
        return q(z3Var) + t(i);
    }

    public static int q(z3 z3Var) {
        int iD = z3Var.d();
        return r(iD) + iD;
    }

    public static int r(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int s(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int t(int i) {
        return r(i << 3);
    }

    public void A() throws IOException {
        c0();
    }

    public int B() {
        hu5 hu5Var = (hu5) this.e;
        String str = (String) this.d;
        if (hu5Var == null) {
            return str.length();
        }
        return (hu5Var.b - hu5Var.d()) + (str.length() - (this.c - this.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(zje zjeVar) {
        way wayVar;
        k050 k050Var;
        if (zjeVar instanceof way) {
            wayVar = (way) zjeVar;
            int i = wayVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                wayVar.l = i - Integer.MIN_VALUE;
            } else {
                wayVar = new way(this, zjeVar);
            }
        } else {
            wayVar = new way(this, zjeVar);
        }
        Object obj = wayVar.j;
        wne wneVar = wne.f39444a;
        int i2 = wayVar.l;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.d;
            wayVar.i = k050Var2;
            wayVar.l = 1;
            if (k050Var2.d(wayVar) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = wayVar.i;
            z1x.P(obj);
        }
        try {
            if (this.b < 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object D(int i, byte[] bArr, zje zjeVar) {
        xay xayVar;
        k050 k050Var;
        Integer numL;
        vay[] vayVarArr = (vay[]) this.e;
        if (zjeVar instanceof xay) {
            xayVar = (xay) zjeVar;
            int i2 = xayVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xayVar.n = i2 - Integer.MIN_VALUE;
            } else {
                xayVar = new xay(this, zjeVar);
            }
        } else {
            xayVar = new xay(this, zjeVar);
        }
        Object obj = xayVar.l;
        wne wneVar = wne.f39444a;
        int i3 = xayVar.n;
        if (i3 == 0) {
            z1x.P(obj);
            k050Var = (k050) this.d;
            xayVar.j = bArr;
            xayVar.k = k050Var;
            xayVar.i = i;
            xayVar.n = 1;
            if (k050Var.d(xayVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = xayVar.i;
            k050 k050Var2 = xayVar.k;
            byte[] bArr2 = xayVar.j;
            z1x.P(obj);
            k050Var = k050Var2;
            bArr = bArr2;
        }
        try {
            int i4 = this.b;
            if (i4 >= 0) {
                int i5 = (i - i4) & 65535;
                if (i5 <= 15) {
                    int i6 = i4 + i5;
                    vayVarArr[i6 % 16] = new vay(bArr, i6);
                }
                return Unit.f46060a;
            }
            vayVarArr[i % 16] = new vay(bArr, i);
            int i7 = 0;
            for (vay vayVar : vayVarArr) {
                if (vayVar != null) {
                    i7++;
                }
            }
            if (i7 >= 5) {
                Integer numL2 = L();
                this.b = numL2 != null ? numL2.intValue() : this.b;
            }
            while (true) {
                int i8 = 0;
                for (vay vayVar2 : vayVarArr) {
                    if (vayVar2 != null) {
                        i8++;
                    }
                }
                if (i8 <= 15 || (numL = L()) == null) {
                    break;
                }
                int iIntValue = numL.intValue();
                vayVarArr[iIntValue % 16] = null;
                if (iIntValue == this.b) {
                    Integer numL3 = L();
                    this.b = numL3 != null ? numL3.intValue() : this.b + 1;
                }
            }
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    public boolean E(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!qsn.d()) {
                    return false;
                }
                qsn qsnVarA = qsn.a();
                if (qsnVarA.c() != 1 || qsnVarA.b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean F(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return xnm0.j(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean G(int i) {
        i(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (I(i) && I(i - 1) && I(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(H(i) || H(i + 1));
    }

    public boolean H(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.d(unicodeBlockOf, unicodeBlock) && Intrinsics.d(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.d(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && Intrinsics.d(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean I(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!qsn.d()) {
                return false;
            }
            qsn qsnVarA = qsn.a();
            if (qsnVarA.c() != 1 || qsnVarA.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean J(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return xnm0.j(Character.codePointAt((CharSequence) this.d, i));
    }

    public Integer L() {
        return (Integer) pgi0.r(pgi0.q(tx3.t((vay[]) this.e), new djx((byte) 10)));
    }

    public int N(int i) {
        i(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (I(iFollowing + (-1)) && I(iFollowing) && !H(iFollowing)) ? N(iFollowing) : iFollowing;
    }

    public Integer O() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        String str = (String) this.d;
        this.b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public float P() {
        x860 x860Var = (x860) this.e;
        float fH = x860Var.h(this.b, this.c, (String) this.d);
        if (!Float.isNaN(fH)) {
            this.b = x860Var.f40449a;
        }
        return fH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object Q(zje zjeVar) {
        yay yayVar;
        k050 k050Var;
        uay uayVar;
        if (zjeVar instanceof yay) {
            yayVar = (yay) zjeVar;
            int i = yayVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yayVar.l = i - Integer.MIN_VALUE;
            } else {
                yayVar = new yay(this, zjeVar);
            }
        } else {
            yayVar = new yay(this, zjeVar);
        }
        Object obj = yayVar.j;
        wne wneVar = wne.f39444a;
        int i2 = yayVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.d;
            yayVar.i = k050Var2;
            yayVar.l = 1;
            if (k050Var2.d(yayVar) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = yayVar.i;
            z1x.P(obj);
        }
        try {
            int i3 = this.b;
            if (i3 >= 0) {
                int i4 = i3 % 16;
                vay[] vayVarArr = (vay[]) this.e;
                vay vayVar = vayVarArr[i4];
                if (vayVar == null || vayVar.f37113a != i3) {
                    int i5 = this.c + 1;
                    this.c = i5;
                    if (i5 >= 3) {
                        Integer num = (Integer) pgi0.r(pgi0.h(pgi0.q(tx3.t(vayVarArr), new djx((byte) 11)), new dx2(i3, (byte) 22)));
                        this.b = num != null ? num.intValue() : this.b + 1;
                        this.c = 0;
                    }
                    uayVar = null;
                } else {
                    vayVarArr[i4] = null;
                    this.b = i3 + 1;
                    this.c = 0;
                    uayVar = new uay(vayVar.b);
                }
            } else {
                uayVar = null;
            }
            return uayVar;
        } finally {
            k050Var.c(null);
        }
    }

    public jqg0 R() {
        float fP = P();
        if (Float.isNaN(fP)) {
            return null;
        }
        int iV = V();
        return iV == 0 ? new jqg0(fP, 1) : new jqg0(fP, iV);
    }

    public String S() {
        String str = (String) this.d;
        if (y()) {
            return null;
        }
        int i = this.b;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iH = h();
        while (iH != -1 && iH != cCharAt) {
            iH = h();
        }
        if (iH == -1) {
            this.b = i;
            return null;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        return str.substring(i + 1, i2);
    }

    public String T() {
        return U(' ', false);
    }

    public String U(char c, boolean z) {
        String str = (String) this.d;
        if (y()) {
            return null;
        }
        char cCharAt = str.charAt(this.b);
        if ((!z && K(cCharAt)) || cCharAt == c) {
            return null;
        }
        int i = this.b;
        int iH = h();
        while (iH != -1 && iH != c && (z || !K(iH))) {
            iH = h();
        }
        return str.substring(i, this.b);
    }

    public int V() {
        String str = (String) this.d;
        if (y()) {
            return 0;
        }
        char cCharAt = str.charAt(this.b);
        int i = this.b;
        if (cCharAt == '%') {
            this.b = i + 1;
            return 9;
        }
        if (i > this.c - 2) {
            return 0;
        }
        try {
            int iB = kng0.B(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.b += 2;
            return iB;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public Object W(boolean z, long j) {
        Object objZ = null;
        long j2 = Long.MAX_VALUE;
        while (this.c > 0) {
            long j3 = j - ((long[]) this.d)[this.b];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objZ = Z();
            j2 = j3;
        }
        return objZ;
    }

    public synchronized Object X() {
        return this.c == 0 ? null : Z();
    }

    public synchronized Object Y(long j) {
        return W(true, j);
    }

    public Object Z() {
        x0x.K(this.c > 0);
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.b = (i + 1) % objArr.length;
        this.c--;
        return obj;
    }

    @Override // a.qqg0
    public void a(float f, float f2, float f3, float f4) {
        g((byte) 3);
        w(4);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        this.c = i + 4;
        fArr[i4] = f4;
    }

    public float a0() {
        g0();
        x860 x860Var = (x860) this.e;
        float fH = x860Var.h(this.b, this.c, (String) this.d);
        if (!Float.isNaN(fH)) {
            this.b = x860Var.f40449a;
        }
        return fH;
    }

    @Override // a.qqg0
    public void b(float f, float f2) {
        g((byte) 0);
        w(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    public int b0(int i) {
        i(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (I(iPreceding) && E(iPreceding) && !H(iPreceding)) ? b0(iPreceding) : iPreceding;
    }

    @Override // a.qqg0
    public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        g((byte) 2);
        w(6);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.c = i6;
        fArr[i5] = f5;
        this.c = i + 6;
        fArr[i6] = f6;
    }

    public void c0() throws IOException {
        ((OutputStream) this.e).write((byte[]) this.d, 0, this.c);
        this.c = 0;
    }

    @Override // a.qqg0
    public void close() {
        g((byte) 8);
    }

    @Override // a.qqg0
    public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        g((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        w(5);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        this.c = i + 5;
        fArr[i5] = f5;
    }

    public void d0(int i, int i2, String str) {
        if (i > i2) {
            ycx.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            ycx.a("start must be non-negative, but was " + i);
        }
        hu5 hu5Var = (hu5) this.e;
        if (hu5Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            hu5 hu5Var2 = new hu5((byte) 5);
            hu5Var2.b = iMax;
            hu5Var2.e = cArr;
            hu5Var2.c = length;
            hu5Var2.d = i4;
            this.e = hu5Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > hu5Var.b - hu5Var.d()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            d0(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > hu5Var.d()) {
            int iD = length2 - hu5Var.d();
            int i9 = hu5Var.b;
            do {
                i9 *= 2;
            } while (i9 - hu5Var.b < iD);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) hu5Var.e, 0, cArr2, 0, hu5Var.c);
            int i10 = hu5Var.b;
            int i11 = hu5Var.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) hu5Var.e, i11, cArr2, i13, (i12 + i11) - i11);
            hu5Var.e = cArr2;
            hu5Var.b = i9;
            hu5Var.d = i13;
        }
        int i14 = hu5Var.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) hu5Var.e;
            System.arraycopy(cArr3, i8, cArr3, hu5Var.d - i15, i15);
            hu5Var.c = i7;
            hu5Var.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iD2 = hu5Var.d() + i7;
            int iD3 = hu5Var.d() + i8;
            int i16 = hu5Var.d;
            int i17 = iD2 - i16;
            char[] cArr4 = (char[]) hu5Var.e;
            System.arraycopy(cArr4, i16, cArr4, hu5Var.c, i17);
            i7 = hu5Var.c + i17;
            hu5Var.c = i7;
            hu5Var.d = iD3;
        } else {
            hu5Var.d = hu5Var.d() + i8;
            hu5Var.c = i7;
        }
        str.getChars(0, str.length(), (char[]) hu5Var.e, i7);
        hu5Var.c = str.length() + hu5Var.c;
    }

    @Override // a.qqg0
    public void e(float f, float f2) {
        g((byte) 1);
        w(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e0(zje zjeVar) {
        zay zayVar;
        k050 k050Var;
        if (zjeVar instanceof zay) {
            zayVar = (zay) zjeVar;
            int i = zayVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zayVar.l = i - Integer.MIN_VALUE;
            } else {
                zayVar = new zay(this, zjeVar);
            }
        } else {
            zayVar = new zay(this, zjeVar);
        }
        Object obj = zayVar.j;
        wne wneVar = wne.f39444a;
        int i2 = zayVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.d;
            zayVar.i = k050Var2;
            zayVar.l = 1;
            if (k050Var2.d(zayVar) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = zayVar.i;
            z1x.P(obj);
        }
        try {
            vay[] vayVarArr = (vay[]) this.e;
            qx3.l(0, vayVarArr.length, null, vayVarArr);
            this.b = -1;
            this.c = 0;
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    public synchronized void f(Object obj, long j) {
        int i = this.c;
        if (i > 0) {
            if (j <= ((long[]) this.d)[((this.b + i) - 1) % ((Object[]) this.e).length]) {
                l();
            }
        }
        x();
        int i2 = this.b;
        int i3 = this.c;
        Object[] objArr = (Object[]) this.e;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.d)[length] = j;
        objArr[length] = obj;
        this.c = i3 + 1;
    }

    public synchronized int f0() {
        return this.c;
    }

    public void g(byte b) {
        int i = this.b;
        byte[] bArr = (byte[]) this.d;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.d = bArr2;
            bArr = bArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        bArr[i2] = b;
    }

    public boolean g0() {
        h0();
        int i = this.b;
        if (i == this.c || ((String) this.d).charAt(i) != ',') {
            return false;
        }
        this.b++;
        h0();
        return true;
    }

    public int h() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.b = i3;
        if (i3 < i2) {
            return ((String) this.d).charAt(i3);
        }
        return -1;
    }

    public void h0() {
        while (true) {
            int i = this.b;
            if (i >= this.c || !K(((String) this.d).charAt(i))) {
                return;
            } else {
                this.b++;
            }
        }
    }

    public void i(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbT = dw9.t("Invalid offset: ", i, ". Valid range is [", " , ", i2);
        sbT.append(i3);
        sbT.append("]");
        ycx.a(sbT.toString());
    }

    public void i0(int i, int i2) throws IOException {
        u0(i, 0);
        k0(i2);
    }

    public Boolean j(Object obj) {
        if (obj == null) {
            return null;
        }
        g0();
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        char cCharAt = ((String) this.d).charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.b++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public void j0(int i, int i2) throws IOException {
        u0(i, 0);
        k0(i2);
    }

    public float k(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        g0();
        return P();
    }

    public void k0(int i) throws IOException {
        if (i >= 0) {
            s0(i);
        } else {
            t0(i);
        }
    }

    public synchronized void l() {
        this.b = 0;
        this.c = 0;
        Arrays.fill((Object[]) this.e, (Object) null);
    }

    public void l0(int i, z3 z3Var) throws IOException {
        u0(i, 2);
        m0(z3Var);
    }

    public void m0(z3 z3Var) throws IOException {
        s0(z3Var.d());
        z3Var.g(this);
    }

    public void n0(int i) throws IOException {
        byte b = (byte) i;
        if (this.c == this.b) {
            c0();
        }
        byte[] bArr = (byte[]) this.d;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = b;
    }

    public void o0(pg9 pg9Var) throws IOException {
        int size = pg9Var.size();
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr = (byte[]) this.d;
        if (i3 >= size) {
            pg9Var.e(0, bArr, i2, size);
            this.c += size;
            return;
        }
        pg9Var.e(0, bArr, i2, i3);
        int i4 = size - i3;
        this.c = i;
        c0();
        if (i4 <= i) {
            pg9Var.e(i3, bArr, 0, i4);
            this.c = i4;
            return;
        }
        OutputStream outputStream = (OutputStream) this.e;
        if (i3 < 0) {
            c99.j(30, i3, "Source offset < 0: ");
            return;
        }
        if (i4 < 0) {
            c99.j(23, i4, "Length < 0: ");
            return;
        }
        int i5 = i3 + i4;
        if (i5 > pg9Var.size()) {
            c99.j(39, i5, "Source end offset exceeded: ");
        } else if (i4 > 0) {
            pg9Var.r(outputStream, i3, i4);
        }
    }

    public void p0(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr2 = (byte[]) this.d;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i2, length);
            this.c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i3);
        int i4 = length - i3;
        this.c = i;
        c0();
        if (i4 > i) {
            ((OutputStream) this.e).write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.c = i4;
        }
    }

    public void q0(int i) throws IOException {
        n0(i & 255);
        n0((i >> 8) & 255);
        n0((i >> 16) & 255);
        n0((i >> 24) & 255);
    }

    public void r0(long j) throws IOException {
        n0(((int) j) & 255);
        n0(((int) (j >> 8)) & 255);
        n0(((int) (j >> 16)) & 255);
        n0(((int) (j >> 24)) & 255);
        n0(((int) (j >> 32)) & 255);
        n0(((int) (j >> 40)) & 255);
        n0(((int) (j >> 48)) & 255);
        n0(((int) (j >> 56)) & 255);
    }

    public void s0(int i) throws IOException {
        while ((i & (-128)) != 0) {
            n0((i & 127) | 128);
            i >>>= 7;
        }
        n0(i);
    }

    public void t0(long j) throws IOException {
        while (((-128) & j) != 0) {
            n0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        n0((int) j);
    }

    public String toString() {
        switch (this.f34746a) {
            case 3:
                hu5 hu5Var = (hu5) this.e;
                String str = (String) this.d;
                if (hu5Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) hu5Var.e, 0, hu5Var.c);
                char[] cArr = (char[]) hu5Var.e;
                int i = hu5Var.d;
                sb.append(cArr, i, hu5Var.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(char c) {
        int i = this.b;
        boolean z = i < this.c && ((String) this.d).charAt(i) == c;
        if (z) {
            this.b++;
        }
        return z;
    }

    public void u0(int i, int i2) throws IOException {
        s0((i << 3) | i2);
    }

    public boolean v(String str) {
        int length = str.length();
        int i = this.b;
        boolean z = i <= this.c - length && ((String) this.d).substring(i, i + length).equals(str);
        if (z) {
            this.b += length;
        }
        return z;
    }

    public void w(int i) {
        float[] fArr = (float[]) this.e;
        if (fArr.length < this.c + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.e = fArr2;
        }
    }

    public void x() {
        int length = ((Object[]) this.e).length;
        if (this.c < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.b;
        int i3 = length - i2;
        System.arraycopy((long[]) this.d, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.e, this.b, objArr, 0, i3);
        int i4 = this.b;
        if (i4 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.e, 0, objArr, i3, this.b);
        }
        this.d = jArr;
        this.e = objArr;
        this.b = 0;
    }

    public boolean y() {
        return this.b == this.c;
    }

    public void z(qqg0 qqg0Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            byte b = ((byte[]) this.d)[i2];
            if (b == 0) {
                float[] fArr = (float[]) this.e;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                qqg0Var.b(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = (float[]) this.e;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                qqg0Var.e(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = (float[]) this.e;
                qqg0Var.c(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b == 3) {
                float[] fArr4 = (float[]) this.e;
                float f3 = fArr4[i];
                float f4 = fArr4[i + 1];
                int i5 = i + 3;
                float f5 = fArr4[i + 2];
                i += 4;
                qqg0Var.a(f3, f4, f5, fArr4[i5]);
            } else if (b != 8) {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = (float[]) this.e;
                qqg0Var.d(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                i += 5;
            } else {
                qqg0Var.close();
            }
        }
    }

    public tyc(byte b) {
        this.f34746a = b;
        switch (b) {
            case 7:
                this.d = new long[10];
                this.e = new Object[10];
                break;
            default:
                this.d = new k050();
                this.e = new vay[16];
                this.b = -1;
                break;
        }
    }

    public /* synthetic */ tyc(byte b, boolean z) {
        this.f34746a = b;
    }

    public tyc(OutputStream outputStream, byte[] bArr) {
        this.f34746a = (byte) 0;
        this.e = outputStream;
        this.d = bArr;
        this.c = 0;
        this.b = bArr.length;
    }

    public tyc(int i, int i2, float[] fArr, float[] fArr2) {
        this.f34746a = (byte) 4;
        this.b = i;
        x0x.A(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.d = fArr;
        this.e = fArr2;
        this.c = i2;
    }

    public tyc(cxn cxnVar, ywu ywuVar) {
        this.f34746a = (byte) 1;
        this.d = new SparseArray();
        this.e = cxnVar;
        TypedArray typedArray = (TypedArray) ywuVar.c;
        this.b = typedArray.getResourceId(28, 0);
        this.c = typedArray.getResourceId(54, 0);
    }

    public tyc(String str) {
        this.f34746a = (byte) 6;
        this.b = 0;
        this.c = 0;
        this.e = new x860();
        String strTrim = str.trim();
        this.d = strTrim;
        this.c = strTrim.length();
    }
}
