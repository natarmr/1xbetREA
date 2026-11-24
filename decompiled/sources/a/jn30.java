package a;

import android.text.TextUtils;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jn30 {
    public static final jn30 C;
    public final Integer A;
    public final b4x B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f16793a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final CharSequence v;
    public final Integer w;
    public final Integer x;
    public final CharSequence y;
    public final CharSequence z;

    static {
        hbi hbiVar = new hbi();
        v3x v3xVar = b4x.b;
        hbiVar.A = rcf0.e;
        C = new jn30(hbiVar);
        hne.s(0, 1, 2, 3, 4);
        hne.s(5, 6, 8, 9, 10);
        hne.s(11, 12, 13, 14, 15);
        hne.s(16, 17, 18, 19, 20);
        hne.s(21, 22, 23, 24, 25);
        hne.s(26, 27, 28, 29, 30);
        hne.s(31, 32, 33, 34, 35);
        vtt0.H(1000);
    }

    public jn30(hbi hbiVar) {
        Boolean boolValueOf = (Boolean) hbiVar.k;
        Integer numValueOf = (Integer) hbiVar.j;
        Integer numValueOf2 = (Integer) hbiVar.z;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.f16793a = (CharSequence) hbiVar.b;
        this.b = (CharSequence) hbiVar.c;
        this.c = (CharSequence) hbiVar.d;
        this.d = (CharSequence) hbiVar.f12771a;
        this.e = (CharSequence) hbiVar.e;
        this.f = (byte[]) hbiVar.f;
        this.g = (Integer) hbiVar.g;
        this.h = (Integer) hbiVar.h;
        this.i = (Integer) hbiVar.i;
        this.j = numValueOf;
        this.k = boolValueOf;
        Integer num = (Integer) hbiVar.l;
        this.l = num;
        this.m = num;
        this.n = (Integer) hbiVar.m;
        this.o = (Integer) hbiVar.n;
        this.p = (Integer) hbiVar.o;
        this.q = (Integer) hbiVar.p;
        this.r = (Integer) hbiVar.q;
        this.s = (CharSequence) hbiVar.r;
        this.t = (CharSequence) hbiVar.s;
        this.u = (CharSequence) hbiVar.t;
        this.v = (CharSequence) hbiVar.u;
        this.w = (Integer) hbiVar.v;
        this.x = (Integer) hbiVar.w;
        this.y = (CharSequence) hbiVar.x;
        this.z = (CharSequence) hbiVar.y;
        this.A = numValueOf2;
        this.B = (b4x) hbiVar.A;
    }

    public final hbi a() {
        hbi hbiVar = new hbi();
        hbiVar.b = this.f16793a;
        hbiVar.c = this.b;
        hbiVar.d = this.c;
        hbiVar.f12771a = this.d;
        hbiVar.e = this.e;
        hbiVar.f = this.f;
        hbiVar.g = this.g;
        hbiVar.h = this.h;
        hbiVar.i = this.i;
        hbiVar.j = this.j;
        hbiVar.k = this.k;
        hbiVar.l = this.m;
        hbiVar.m = this.n;
        hbiVar.n = this.o;
        hbiVar.o = this.p;
        hbiVar.p = this.q;
        hbiVar.q = this.r;
        hbiVar.r = this.s;
        hbiVar.s = this.t;
        hbiVar.t = this.u;
        hbiVar.v = this.w;
        hbiVar.u = this.v;
        hbiVar.w = this.x;
        hbiVar.x = this.y;
        hbiVar.y = this.z;
        hbiVar.z = this.A;
        hbiVar.A = this.B;
        return hbiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jn30.class != obj.getClass()) {
            return false;
        }
        jn30 jn30Var = (jn30) obj;
        return TextUtils.equals(this.f16793a, jn30Var.f16793a) && TextUtils.equals(this.b, jn30Var.b) && TextUtils.equals(this.c, jn30Var.c) && TextUtils.equals(this.d, jn30Var.d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.e, jn30Var.e) && Arrays.equals(this.f, jn30Var.f) && Objects.equals(this.g, jn30Var.g) && Objects.equals(this.h, jn30Var.h) && Objects.equals(this.i, jn30Var.i) && Objects.equals(this.j, jn30Var.j) && Objects.equals(this.k, jn30Var.k) && Objects.equals(this.m, jn30Var.m) && Objects.equals(this.n, jn30Var.n) && Objects.equals(this.o, jn30Var.o) && Objects.equals(this.p, jn30Var.p) && Objects.equals(this.q, jn30Var.q) && Objects.equals(this.r, jn30Var.r) && TextUtils.equals(this.s, jn30Var.s) && TextUtils.equals(this.t, jn30Var.t) && TextUtils.equals(this.u, jn30Var.u) && TextUtils.equals(this.v, jn30Var.v) && Objects.equals(this.w, jn30Var.w) && Objects.equals(this.x, jn30Var.x) && TextUtils.equals(this.y, jn30Var.y) && TextUtils.equals(null, null) && TextUtils.equals(this.z, jn30Var.z) && Objects.equals(this.A, jn30Var.A) && Objects.equals(this.B, jn30Var.B);
    }

    public final int hashCode() {
        return Objects.hash(this.f16793a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, null, this.z, this.A, true, this.B);
    }
}
