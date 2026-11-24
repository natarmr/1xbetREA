package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ekt0 {
    public static final dkt0 Companion = new dkt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Byte f7969a;
    public final Boolean b;

    public /* synthetic */ ekt0(int i, Byte b, Boolean bool) {
        if ((i & 1) == 0) {
            this.f7969a = null;
        } else {
            this.f7969a = b;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekt0)) {
            return false;
        }
        ekt0 ekt0Var = (ekt0) obj;
        return Intrinsics.d(this.f7969a, ekt0Var.f7969a) && Intrinsics.d(this.b, ekt0Var.b);
    }

    public final int hashCode() {
        Byte b = this.f7969a;
        int iHashCode = (b == null ? 0 : b.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PreviousFeedback(rate=" + this.f7969a + ", resolved=" + this.b + Separators.RPAREN;
    }
}
