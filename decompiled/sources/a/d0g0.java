package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class d0g0 {
    public static final c0g0 Companion = new c0g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5266a;
    public final Long b;

    public /* synthetic */ d0g0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f5266a = null;
        } else {
            this.f5266a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0g0)) {
            return false;
        }
        d0g0 d0g0Var = (d0g0) obj;
        return Intrinsics.d(this.f5266a, d0g0Var.f5266a) && Intrinsics.d(this.b, d0g0Var.b);
    }

    public final int hashCode() {
        String str = this.f5266a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "RestrictionResponse(contentType=" + this.f5266a + ", lengthLimit=" + this.b + Separators.RPAREN;
    }
}
