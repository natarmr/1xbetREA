package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u00 implements w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34830a;
    public final boolean b;
    public final String c;

    public u00(String str, boolean z, String str2) {
        str.getClass();
        this.f34830a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u00)) {
            return false;
        }
        u00 u00Var = (u00) obj;
        return Intrinsics.d(this.f34830a, u00Var.f34830a) && this.b == u00Var.b && Intrinsics.d(this.c, u00Var.c);
    }

    public final int hashCode() {
        int iE = brm0.e(this.f34830a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return axq.n(brm0.u("TitleWithInfo(title=", this.f34830a, ", isCollapsed=", this.b, ", infoLabel="), this.c, Separators.RPAREN);
    }
}
