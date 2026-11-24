package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class aft0 {
    public static final zet0 Companion = new zet0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f795a;
    public final String b;

    public /* synthetic */ aft0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, yet0.f42507a.getDescriptor());
            throw null;
        }
        this.f795a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aft0)) {
            return false;
        }
        aft0 aft0Var = (aft0) obj;
        return Intrinsics.d(this.f795a, aft0Var.f795a) && Intrinsics.d(this.b, aft0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f795a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("UnregisterVerifyRequest(unregistrationGuid=", this.f795a, ", secret=", this.b, Separators.RPAREN);
    }

    public aft0(String str, String str2) {
        this.f795a = str;
        this.b = str2;
    }
}
