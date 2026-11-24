package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f1c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8758a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public f1c(String str, String str2, boolean z, boolean z2, String str3, String str4, boolean z3, boolean z4) {
        str.getClass();
        this.f8758a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = str4;
        this.g = z3;
        this.h = z4;
    }

    public static f1c a(f1c f1cVar, String str, boolean z, boolean z2, boolean z3, int i) {
        String str2 = f1cVar.f8758a;
        if ((i & 2) != 0) {
            str = f1cVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z = f1cVar.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = f1cVar.d;
        }
        boolean z5 = z2;
        String str4 = f1cVar.e;
        String str5 = f1cVar.f;
        boolean z6 = f1cVar.g;
        if ((i & 128) != 0) {
            z3 = f1cVar.h;
        }
        f1cVar.getClass();
        str2.getClass();
        str3.getClass();
        return new f1c(str2, str3, z4, z5, str4, str5, z6, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1c)) {
            return false;
        }
        f1c f1cVar = (f1c) obj;
        return Intrinsics.d(this.f8758a, f1cVar.f8758a) && this.b.equals(f1cVar.b) && this.c == f1cVar.c && this.d == f1cVar.d && this.e.equals(f1cVar.e) && this.f.equals(f1cVar.f) && this.g == f1cVar.g && this.h == f1cVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(ua80.b(ua80.b(brm0.e(brm0.e(ua80.b(this.f8758a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("UiState(email=", this.f8758a, ", inputCode=", this.b, ", enableButton=");
        ua80.u(", networkConnected=", ", title=", sbN, this.c, this.d);
        f140.v(sbN, this.e, ", actionButtonText=", this.f, ", cantGetCodeVisible=");
        return ohs0.p(", loading=", Separators.RPAREN, sbN, this.g, this.h);
    }
}
