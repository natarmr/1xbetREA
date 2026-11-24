package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bqn0 implements nqn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3040a;

    public bqn0(boolean z) {
        this.f3040a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqn0) && this.f3040a == ((bqn0) obj).f3040a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3040a);
    }

    public final String toString() {
        return defpackage.c.d("ChangeEnableCards(enable=", Separators.RPAREN, this.f3040a);
    }
}
