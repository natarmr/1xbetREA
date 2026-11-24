package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k4j0 implements n4j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17672a;

    public final boolean equals(Object obj) {
        if (obj instanceof k4j0) {
            return this.f17672a == ((k4j0) obj).f17672a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17672a);
    }

    public final String toString() {
        return defpackage.c.d("QuickBetsToggleChangeState(value=", Separators.RPAREN, this.f17672a);
    }
}
