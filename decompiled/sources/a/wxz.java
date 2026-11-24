package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wxz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vrz f39952a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public wxz(vrz vrzVar, String str, String str2, String str3, String str4, boolean z) {
        str2.getClass();
        str4.getClass();
        this.f39952a = vrzVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxz)) {
            return false;
        }
        wxz wxzVar = (wxz) obj;
        return this.f39952a.equals(wxzVar.f39952a) && this.b.equals(wxzVar.b) && Intrinsics.d(this.c, wxzVar.c) && this.d.equals(wxzVar.d) && Intrinsics.d(this.e, wxzVar.e) && this.f == wxzVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(this.f39952a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsKenyaBottomSheetState(selectedLimitType=");
        sb.append(this.f39952a);
        sb.append(", initialLimitValue=");
        sb.append(this.b);
        sb.append(", limitValue=");
        f140.v(sb, this.c, ", pendingValue=", this.d, ", currency=");
        return defpackage.c.c(this.e, ", isSaveButtonEnabled=", Separators.RPAREN, sb, this.f);
    }
}
