package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class npv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23930a;
    public zov0 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npv0)) {
            return false;
        }
        npv0 npv0Var = (npv0) obj;
        return Intrinsics.d(this.f23930a, npv0Var.f23930a) && this.b == npv0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23930a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f23930a + ", state=" + this.b + Separators.RPAREN;
    }
}
