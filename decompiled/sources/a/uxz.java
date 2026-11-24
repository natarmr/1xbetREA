package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uxz implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vrz f36463a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public uxz(vrz vrzVar, String str, String str2, String str3, String str4) {
        str4.getClass();
        this.f36463a = vrzVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxz)) {
            return false;
        }
        uxz uxzVar = (uxz) obj;
        return this.f36463a.equals(uxzVar.f36463a) && this.b.equals(uxzVar.b) && this.c.equals(uxzVar.c) && this.d.equals(uxzVar.d) && Intrinsics.d(this.e, uxzVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f36463a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsKenyaBottomSheetScreenParams(selectedLimitType=");
        sb.append(this.f36463a);
        sb.append(", initialLimitValue=");
        sb.append(this.b);
        sb.append(", limitValue=");
        f140.v(sb, this.c, ", pendingValue=", this.d, ", currency=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
