package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rgs0 implements sgs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f30453a;

    public rgs0(i4 i4Var) {
        i4Var.getClass();
        this.f30453a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgs0) && Intrinsics.d(this.f30453a, ((rgs0) obj).f30453a);
    }

    public final int hashCode() {
        return this.f30453a.hashCode();
    }

    public final String toString() {
        return "Success(transactionItems=" + this.f30453a + Separators.RPAREN;
    }
}
