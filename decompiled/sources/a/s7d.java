package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class s7d {
    public static final r7d Companion = new r7d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31744a;
    public final String b;

    public /* synthetic */ s7d(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f31744a = null;
        } else {
            this.f31744a = str;
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
        if (!(obj instanceof s7d)) {
            return false;
        }
        s7d s7dVar = (s7d) obj;
        return Intrinsics.d(this.f31744a, s7dVar.f31744a) && Intrinsics.d(this.b, s7dVar.b);
    }

    public final int hashCode() {
        String str = this.f31744a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("Command(type=", this.f31744a, ", variantId=", this.b, Separators.RPAREN);
    }
}
