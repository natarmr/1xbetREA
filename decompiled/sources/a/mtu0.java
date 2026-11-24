package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class mtu0 {
    public static final wsu0 Companion = new wsu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22385a;
    public final String b;

    public /* synthetic */ mtu0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f22385a = null;
        } else {
            this.f22385a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtu0)) {
            return false;
        }
        mtu0 mtu0Var = (mtu0) obj;
        return Intrinsics.d(this.f22385a, mtu0Var.f22385a) && Intrinsics.d(this.b, mtu0Var.b);
    }

    public final int hashCode() {
        String str = this.f22385a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("VirtualSportRulesResponse(key=", this.f22385a, ", value=", this.b, Separators.RPAREN);
    }
}
