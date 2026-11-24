package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class fqn {
    public static final eqn Companion = new eqn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9984a;
    public final String b;

    public /* synthetic */ fqn(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f9984a = null;
        } else {
            this.f9984a = str;
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
        if (!(obj instanceof fqn)) {
            return false;
        }
        fqn fqnVar = (fqn) obj;
        return Intrinsics.d(this.f9984a, fqnVar.f9984a) && Intrinsics.d(this.b, fqnVar.b);
    }

    public final int hashCode() {
        String str = this.f9984a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("EditProfileErrorResponse(message=", this.f9984a, ", key=", this.b, Separators.RPAREN);
    }
}
