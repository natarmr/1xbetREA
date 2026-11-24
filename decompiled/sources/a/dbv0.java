package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dbv0 implements mbv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5822a;
    public final ms2 b;

    public dbv0(String str, ms2 ms2Var) {
        ms2Var.getClass();
        this.f5822a = str;
        this.b = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbv0)) {
            return false;
        }
        dbv0 dbv0Var = (dbv0) obj;
        return this.f5822a.equals(dbv0Var.f5822a) && Intrinsics.d(this.b, dbv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5822a.hashCode() * 31);
    }

    public final String toString() {
        return "Initialize(screen=" + this.f5822a + ", entryPoint=" + this.b + Separators.RPAREN;
    }
}
