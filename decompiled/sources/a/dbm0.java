package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dbm0 implements ebm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5813a;
    public final h3h0 b;

    public dbm0(String str, h3h0 h3h0Var) {
        str.getClass();
        this.f5813a = str;
        this.b = h3h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbm0)) {
            return false;
        }
        dbm0 dbm0Var = (dbm0) obj;
        return Intrinsics.d(this.f5813a, dbm0Var.f5813a) && this.b == dbm0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5813a.hashCode() * 31);
    }

    public final String toString() {
        return "Title(title=" + this.f5813a + ", scoreColorType=" + this.b + Separators.RPAREN;
    }
}
