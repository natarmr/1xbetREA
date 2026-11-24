package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y2j implements d3j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n85 f41906a;

    public y2j(n85 n85Var) {
        n85Var.getClass();
        this.f41906a = n85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2j) && Intrinsics.d(this.f41906a, ((y2j) obj).f41906a);
    }

    public final int hashCode() {
        return this.f41906a.hashCode();
    }

    public final String toString() {
        return "AvailableNotActive(available=" + this.f41906a + Separators.RPAREN;
    }
}
