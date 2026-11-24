package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class gan0 {
    public static final fan0 Companion = new fan0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f10977a;
    public final String b;

    public /* synthetic */ gan0(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.f10977a = null;
        } else {
            this.f10977a = bool;
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
        if (!(obj instanceof gan0)) {
            return false;
        }
        gan0 gan0Var = (gan0) obj;
        return Intrinsics.d(this.f10977a, gan0Var.f10977a) && Intrinsics.d(this.b, gan0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.f10977a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SubscriptionVideoResponse(enabled=" + this.f10977a + ", id=" + this.b + Separators.RPAREN;
    }
}
