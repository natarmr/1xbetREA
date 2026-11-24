package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class vu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av0 f38030a;

    public vu0(av0 av0Var) {
        this.f38030a = av0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu0) && this.f38030a == ((vu0) obj).f38030a;
    }

    public final int hashCode() {
        return this.f38030a.hashCode();
    }

    public final String toString() {
        return "SendResult(mode=" + this.f38030a + Separators.RPAREN;
    }
}
