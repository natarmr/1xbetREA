package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cr90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4834a;
    public final boolean b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;
    public final Throwable g;
    public final Integer h;

    public cr90(boolean z, boolean z2, String str, String str2, List list, boolean z3, Throwable th, Integer num) {
        list.getClass();
        this.f4834a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = z3;
        this.g = th;
        this.h = num;
    }

    public static cr90 a(cr90 cr90Var, String str, String str2, ArrayList arrayList, boolean z, Throwable th, Integer num, int i) {
        boolean z2 = cr90Var.f4834a;
        boolean z3 = (i & 2) != 0 ? cr90Var.b : true;
        if ((i & 4) != 0) {
            str = cr90Var.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = cr90Var.d;
        }
        String str4 = str2;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = cr90Var.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            z = cr90Var.f;
        }
        boolean z4 = z;
        if ((i & 64) != 0) {
            th = cr90Var.g;
        }
        Throwable th2 = th;
        cr90Var.getClass();
        Integer num2 = (i & 256) != 0 ? cr90Var.h : num;
        cr90Var.getClass();
        list2.getClass();
        return new cr90(z2, z3, str3, str4, list2, z4, th2, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr90)) {
            return false;
        }
        cr90 cr90Var = (cr90) obj;
        return this.f4834a == cr90Var.f4834a && this.b == cr90Var.b && this.c.equals(cr90Var.c) && this.d.equals(cr90Var.d) && Intrinsics.d(this.e, cr90Var.e) && this.f == cr90Var.f && Intrinsics.d(this.g, cr90Var.g) && Intrinsics.d(this.h, cr90Var.h);
    }

    public final int hashCode() {
        int iE = brm0.e(dw9.a(ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f4834a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Throwable th = this.g;
        int iE2 = brm0.e((iE + (th == null ? 0 : th.hashCode())) * 31, 31, false);
        Integer num = this.h;
        return iE2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PickerStateModel(customPhoneCodeInputAllowed=", ", enterCodeActive=", ", phoneCodeByManually=", this.f4834a, this.b);
        f140.v(sbQ, this.c, ", searchValue=", this.d, ", content=");
        rz4.z(sbQ, ", isContentUpdate=", this.e, ", phoneCodeByManuallyError=", this.f);
        sbQ.append(this.g);
        sbQ.append(", isKeyVisible=false, bottomSheetStateByUser=");
        sbQ.append(this.h);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
