package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kvk0 implements lvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i9h0 f18959a;

    public kvk0(i9h0 i9h0Var) {
        i9h0Var.getClass();
        this.f18959a = i9h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvk0) && this.f18959a == ((kvk0) obj).f18959a;
    }

    public final int hashCode() {
        return this.f18959a.hashCode();
    }

    public final String toString() {
        return "Loading(screenStyle=" + this.f18959a + Separators.RPAREN;
    }
}
