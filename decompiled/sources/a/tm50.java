package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class tm50 {
    public static final sm50 Companion = new sm50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34177a;
    public final String b;

    public /* synthetic */ tm50(int i, String str, String str2) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, rm50.f30730a.getDescriptor());
            throw null;
        }
        this.f34177a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm50)) {
            return false;
        }
        tm50 tm50Var = (tm50) obj;
        return Intrinsics.d(this.f34177a, tm50Var.f34177a) && Intrinsics.d(this.b, tm50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34177a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthRequest(guid=", this.f34177a, ", token=", this.b, Separators.RPAREN);
    }

    public tm50(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f34177a = str;
        this.b = str2;
    }
}
