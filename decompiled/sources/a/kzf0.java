package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kzf0 {
    public static final jzf0 Companion = new jzf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19150a;
    public final String b;

    public /* synthetic */ kzf0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f19150a = null;
        } else {
            this.f19150a = str;
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
        if (!(obj instanceof kzf0)) {
            return false;
        }
        kzf0 kzf0Var = (kzf0) obj;
        return Intrinsics.d(this.f19150a, kzf0Var.f19150a) && Intrinsics.d(this.b, kzf0Var.b);
    }

    public final int hashCode() {
        String str = this.f19150a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("RequestPayload(phone=", this.f19150a, ", countryCode=", this.b, Separators.RPAREN);
    }

    public kzf0(String str, String str2) {
        this.f19150a = str;
        this.b = str2;
    }
}
