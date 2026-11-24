package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ol4 implements xl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu4 f25435a;
    public final String b;
    public final String c;

    public ol4(uu4 uu4Var, String str, String str2) {
        uu4Var.getClass();
        str.getClass();
        this.f25435a = uu4Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol4)) {
            return false;
        }
        ol4 ol4Var = (ol4) obj;
        return Intrinsics.d(this.f25435a, ol4Var.f25435a) && Intrinsics.d(this.b, ol4Var.b) && this.c.equals(ol4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f25435a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Confirm(authorizationData=");
        sb.append(this.f25435a);
        sb.append(", verificationQuestionType=");
        sb.append(this.b);
        sb.append(", deviceId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
