package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9u0 f9254a;
    public final String b;
    public final String c;

    public fbf(r9u0 r9u0Var, String str, String str2) {
        r9u0Var.getClass();
        str.getClass();
        str2.getClass();
        this.f9254a = r9u0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbf)) {
            return false;
        }
        fbf fbfVar = (fbf) obj;
        return this.f9254a == fbfVar.f9254a && Intrinsics.d(this.b, fbfVar.b) && Intrinsics.d(this.c, fbfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f9254a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerificationPasswordModel(verifyResult=");
        sb.append(this.f9254a);
        sb.append(", newPassword=");
        sb.append(this.b);
        sb.append(", newPasswordDuplicate=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
