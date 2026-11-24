package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class fu9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10152a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public fu9(int i, String str, String str2, boolean z, boolean z2) {
        this.f10152a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu9)) {
            return false;
        }
        fu9 fu9Var = (fu9) obj;
        return this.f10152a == fu9Var.f10152a && this.b.equals(fu9Var.b) && this.c.equals(fu9Var.c) && this.d == fu9Var.d && this.e == fu9Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(ua80.b(ua80.b(Integer.hashCode(this.f10152a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f10152a, "CallbackOperatorRatingUiState(starsRatingValue=", ", commentText=", this.b, ", supportingCommentText=");
        brm0.C(this.c, ", showCommentError=", ", acceptButtonDisabled=", sbR, this.d);
        return rw2.p(sbR, this.e, Separators.RPAREN);
    }
}
