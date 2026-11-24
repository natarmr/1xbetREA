package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ovv0 implements svv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tvv0 f25944a;

    public ovv0(tvv0 tvv0Var) {
        this.f25944a = tvv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovv0) && this.f25944a == ((ovv0) obj).f25944a;
    }

    public final int hashCode() {
        return this.f25944a.hashCode();
    }

    public final String toString() {
        return "Disarm(reason=" + this.f25944a + Separators.RPAREN;
    }
}
