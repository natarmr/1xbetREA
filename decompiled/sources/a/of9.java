package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class of9 {
    public static final nf9 Companion = new nf9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he9 f25153a;
    public final he9 b;
    public final he9 c;
    public final he9 d;
    public final he9 e;
    public final he9 f;

    public /* synthetic */ of9(int i, he9 he9Var, he9 he9Var2, he9 he9Var3, he9 he9Var4, he9 he9Var5, he9 he9Var6) {
        if ((i & 1) == 0) {
            this.f25153a = null;
        } else {
            this.f25153a = he9Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = he9Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = he9Var3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = he9Var4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = he9Var5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = he9Var6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of9)) {
            return false;
        }
        of9 of9Var = (of9) obj;
        return Intrinsics.d(this.f25153a, of9Var.f25153a) && Intrinsics.d(this.b, of9Var.b) && Intrinsics.d(this.c, of9Var.c) && Intrinsics.d(this.d, of9Var.d) && Intrinsics.d(this.e, of9Var.e) && Intrinsics.d(this.f, of9Var.f);
    }

    public final int hashCode() {
        he9 he9Var = this.f25153a;
        int iHashCode = (he9Var == null ? 0 : he9Var.hashCode()) * 31;
        he9 he9Var2 = this.b;
        int iHashCode2 = (iHashCode + (he9Var2 == null ? 0 : he9Var2.hashCode())) * 31;
        he9 he9Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (he9Var3 == null ? 0 : he9Var3.hashCode())) * 31;
        he9 he9Var4 = this.d;
        int iHashCode4 = (iHashCode3 + (he9Var4 == null ? 0 : he9Var4.hashCode())) * 31;
        he9 he9Var5 = this.e;
        int iHashCode5 = (iHashCode4 + (he9Var5 == null ? 0 : he9Var5.hashCode())) * 31;
        he9 he9Var6 = this.f;
        return iHashCode5 + (he9Var6 != null ? he9Var6.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonsResponse(excludedButton=" + this.f25153a + ", participateButton=" + this.b + ", participateThroughProviderButton=" + this.c + ", rulesButton=" + this.d + ", youAlreadyParticipatingButton=" + this.e + ", detailsButton=" + this.f + Separators.RPAREN;
    }
}
