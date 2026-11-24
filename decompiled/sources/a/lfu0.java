package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lfu0 {
    public static final jfu0 Companion = new jfu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f19976a;
    public final String b;

    public /* synthetic */ lfu0(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.f19976a = null;
        } else {
            this.f19976a = bool;
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
        if (!(obj instanceof lfu0)) {
            return false;
        }
        lfu0 lfu0Var = (lfu0) obj;
        return Intrinsics.d(this.f19976a, lfu0Var.f19976a) && Intrinsics.d(this.b, lfu0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.f19976a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "VideoResponse(enabled=" + this.f19976a + ", id=" + this.b + Separators.RPAREN;
    }
}
