package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class br20 {
    public static final Set i = tx3.l0(new ar20[]{cy2.x, cy2.j0, cy2.y, cy2.N, cy2.e0, cy2.X, cy2.f0, cy2.g0, cy2.i0});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4w0 f3057a;
    public ar20 b;
    public ar20 c;
    public CharSequence d = "";
    public int e;
    public int f;
    public int g;
    public int h;

    public br20(l4w0 l4w0Var) {
        this.f3057a = l4w0Var;
    }

    public final ar20 a() {
        fr20 fr20Var;
        ar20 ar20Var;
        int i2;
        int i3;
        String str;
        fr20 fr20Var2 = cy2.j0;
        ar20 ar20Var2 = cy2.L;
        ar20 ar20Var3 = cy2.x;
        int[] iArr = l4w0.k;
        l4w0 l4w0Var = this.f3057a;
        ArrayList arrayList = l4w0Var.i;
        k4w0 k4w0Var = l4w0Var.j;
        int i4 = l4w0Var.g;
        CharSequence charSequence = l4w0Var.c;
        int[] iArr2 = l4w0.q;
        int[] iArr3 = l4w0.p;
        int[] iArr4 = l4w0.s;
        while (true) {
            int i5 = l4w0Var.d;
            l4w0Var.f = i5;
            l4w0Var.e = i5;
            int i6 = l4w0.k[l4w0Var.b];
            l4w0Var.f19430a = i6;
            int i7 = (iArr4[i6] & 1) == 1 ? i6 : -1;
            while (true) {
                if (i5 < i4) {
                    charSequence.getClass();
                    char cCharAt = charSequence.charAt(i5);
                    boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                    int i8 = cCharAt;
                    if (zIsHighSurrogate) {
                        int i9 = i5 + 1;
                        i8 = cCharAt;
                        if (i9 < charSequence.length()) {
                            char cCharAt2 = charSequence.charAt(i9);
                            i8 = cCharAt;
                            if (Character.isLowSurrogate(cCharAt2)) {
                                i8 = ((cCharAt << '\n') + cCharAt2) - 56613888;
                            }
                        }
                    }
                    i2 = i8;
                    i5 += i2 >= 65536 ? 2 : 1;
                    int i10 = iArr2[iArr3[l4w0Var.f19430a] + l4w0.n[(l4w0.m[(l4w0.l[i2 >> 10] << 6) | ((i2 >> 4) & 63)] << 4) | (i2 & 15)]];
                    fr20Var = fr20Var2;
                    if (i10 != -1) {
                        l4w0Var.f19430a = i10;
                        int i11 = iArr4[i10];
                        ar20Var = ar20Var2;
                        if ((i11 & 1) == 1) {
                            i5 = i5;
                            i7 = i10;
                            if ((i11 & 8) == 8) {
                            }
                        }
                        fr20Var2 = fr20Var;
                        ar20Var2 = ar20Var;
                    } else {
                        ar20Var = ar20Var2;
                    }
                } else {
                    fr20Var = fr20Var2;
                    ar20Var = ar20Var2;
                    if (!l4w0Var.h) {
                        l4w0Var.e = i5;
                        l4w0Var.d = i5;
                        charSequence = l4w0Var.c;
                        i4 = l4w0Var.g;
                    }
                    i2 = -1;
                }
            }
            l4w0Var.d = i5;
            if (i2 == -1 && l4w0Var.f == l4w0Var.e) {
                l4w0Var.h = true;
                return null;
            }
            if (i7 >= 0) {
                i7 = l4w0.o[i7];
            }
            int i12 = 0;
            switch (i7) {
                case 1:
                    l4w0Var.d(l4w0Var.c());
                    if (!arrayList.isEmpty()) {
                        l4w0Var.b = ((Number) hne.k(1, arrayList)).intValue();
                    } else {
                        l4w0Var.b = 4;
                    }
                    break;
                case 2:
                    return cy2.z;
                case 3:
                    return ar20Var3;
                case 4:
                    return fr20Var;
                case 5:
                    int iV = StringsKt.V(l4w0Var.c.subSequence(l4w0Var.f, i5).toString(), Separators.RETURN, 0, false, 6);
                    if (iV >= 2) {
                        l4w0Var.d(l4w0Var.c() - iV);
                        return ar20Var;
                    }
                    if (iV > 0) {
                        l4w0Var.d(l4w0Var.c() - iV);
                        return fr20Var;
                    }
                    int i13 = 1;
                    while (i13 < l4w0Var.c() && l4w0Var.b(i13) != '\n') {
                        i13++;
                    }
                    if (i13 != l4w0Var.c()) {
                        l4w0Var.d(l4w0Var.c() - i13);
                    } else {
                        l4w0Var.b = 0;
                        l4w0Var.d(l4w0Var.c() - 1);
                    }
                    return cy2.M;
                case 6:
                    return uxs0.a(l4w0Var.b(0));
                case 7:
                    return cy2.K;
                case 8:
                    return cy2.J;
                case 9:
                    ar20 ar20Var4 = cy2.T;
                    int i14 = l4w0Var.b;
                    return (i14 == 4 || i14 == 6) ? ar20Var4 : k4w0Var.b;
                case 10:
                    int i15 = l4w0Var.b;
                    return (i15 == 4 || i15 == 6) ? cy2.U : k4w0Var.b;
                case 11:
                    if (l4w0Var.b(0) != k4w0Var.f17689a) {
                        return k4w0Var.b;
                    }
                    l4w0Var.b = ((Number) hne.k(1, arrayList)).intValue();
                    return uxs0.a(l4w0Var.b(0));
                case 12:
                    int i16 = l4w0Var.f;
                    charSequence.getClass();
                    int length = charSequence.length();
                    if (i16 < 0 || i16 > length) {
                        throw new IndexOutOfBoundsException();
                    }
                    while (true) {
                        if (i16 >= length) {
                            i3 = 1;
                        } else if (i12 < 1) {
                            int i17 = i16 + 1;
                            i16 = (Character.isHighSurrogate(charSequence.charAt(i16)) && i17 < length && Character.isLowSurrogate(charSequence.charAt(i17))) ? i16 + 2 : i17;
                            i12++;
                        } else {
                            i3 = 1;
                        }
                    }
                    if (i12 < i3) {
                        throw new IndexOutOfBoundsException();
                    }
                    l4w0Var.d = i16;
                    return ar20Var;
                case 13:
                    int i18 = l4w0Var.b;
                    return (i18 == 4 || i18 == 6) ? ar20Var3 : k4w0Var.b;
                case 14:
                    ar20 ar20Var5 = cy2.V;
                    int i19 = l4w0Var.b;
                    return (i19 == 4 || i19 == 6) ? ar20Var5 : k4w0Var.b;
                case 15:
                    return cy2.h0;
                case 16:
                    return l4w0Var.a(cy2.g0);
                case 17:
                    return l4w0Var.a(cy2.f0);
                case 18:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                case 32:
                case 33:
                case 34:
                    break;
                default:
                    String[] strArr = l4w0.r;
                    try {
                        str = strArr[1];
                        break;
                    } catch (Exception unused) {
                        str = strArr[0];
                    }
                    throw new Error(str);
            }
            fr20Var2 = fr20Var;
            ar20Var2 = ar20Var;
        }
    }

    public final void b() {
        ar20 ar20Var;
        do {
            l4w0 l4w0Var = this.f3057a;
            this.h = l4w0Var.c() + l4w0Var.f;
            ar20 ar20VarA = a();
            this.c = ar20VarA;
            ar20Var = this.b;
            if (!Intrinsics.d(ar20VarA, ar20Var) || ar20Var == null) {
                return;
            }
        } while (i.contains(ar20Var));
    }
}
