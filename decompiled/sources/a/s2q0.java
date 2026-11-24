package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class s2q0 {
    public static final r2q0 Companion = new r2q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31515a;
    public final String b;

    public /* synthetic */ s2q0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f31515a = null;
        } else {
            this.f31515a = str;
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
        if (!(obj instanceof s2q0)) {
            return false;
        }
        s2q0 s2q0Var = (s2q0) obj;
        return Intrinsics.d(this.f31515a, s2q0Var.f31515a) && Intrinsics.d(this.b, s2q0Var.b);
    }

    public final int hashCode() {
        String str = this.f31515a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("TextAttr(type=", this.f31515a, ", href=", this.b, Separators.RPAREN);
    }
}
