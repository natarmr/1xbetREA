package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tet0 {
    public static final set0 Companion = new set0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33839a;
    public final String b;

    public /* synthetic */ tet0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f33839a = null;
        } else {
            this.f33839a = str;
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
        if (!(obj instanceof tet0)) {
            return false;
        }
        tet0 tet0Var = (tet0) obj;
        return Intrinsics.d(this.f33839a, tet0Var.f33839a) && Intrinsics.d(this.b, tet0Var.b);
    }

    public final int hashCode() {
        String str = this.f33839a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("UnregisterAuthenticatorResponse(unregistrationGuid=", this.f33839a, ", secret=", this.b, Separators.RPAREN);
    }
}
