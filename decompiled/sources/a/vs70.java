package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vs70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f37936a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public vs70(i4 i4Var, String str, String str2, boolean z, boolean z2) {
        i4Var.getClass();
        this.f37936a = i4Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs70)) {
            return false;
        }
        vs70 vs70Var = (vs70) obj;
        return Intrinsics.d(this.f37936a, vs70Var.f37936a) && this.b.equals(vs70Var.b) && this.c.equals(vs70Var.c) && this.d == vs70Var.d && this.e == vs70Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(ua80.b(ua80.b(this.f37936a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnlineCallOperatorRatingUiState(stars=");
        sb.append(this.f37936a);
        sb.append(", commentText=");
        sb.append(this.b);
        sb.append(", supportingCommentText=");
        brm0.C(this.c, ", showCommentError=", ", acceptButtonDisabled=", sb, this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
