package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class zvp {
    public static final yvp Companion = new yvp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f45069a;
    public final String b;

    public /* synthetic */ zvp(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f45069a = null;
        } else {
            this.f45069a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvp)) {
            return false;
        }
        zvp zvpVar = (zvp) obj;
        return Intrinsics.d(this.f45069a, zvpVar.f45069a) && Intrinsics.d(this.b, zvpVar.b);
    }

    public final int hashCode() {
        Long l = this.f45069a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f45069a, "FighterImageResponse(feedId=", ", imageS3=", this.b, Separators.RPAREN);
    }
}
