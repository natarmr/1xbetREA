package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x2j implements d3j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n85 f40170a;

    public x2j(n85 n85Var) {
        n85Var.getClass();
        this.f40170a = n85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2j) && Intrinsics.d(this.f40170a, ((x2j) obj).f40170a);
    }

    public final int hashCode() {
        return this.f40170a.hashCode();
    }

    public final String toString() {
        return "AvailableActive(available=" + this.f40170a + Separators.RPAREN;
    }
}
