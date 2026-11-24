package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eql implements gql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f8243a;

    public eql(a4x a4xVar) {
        a4xVar.getClass();
        this.f8243a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eql) && Intrinsics.d(this.f8243a, ((eql) obj).f8243a);
    }

    public final int hashCode() {
        return this.f8243a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f8243a, "Content(cards=", Separators.RPAREN);
    }
}
