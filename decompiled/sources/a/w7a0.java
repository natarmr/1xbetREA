package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w7a0 implements x7a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f38663a;

    public w7a0(imm immVar) {
        this.f38663a = immVar;
    }

    @Override // a.x7a0
    public final imm a() {
        return this.f38663a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7a0) && this.f38663a.equals(((w7a0) obj).f38663a);
    }

    public final int hashCode() {
        return this.f38663a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f38663a, "Loading(navigationBarModel=", Separators.RPAREN);
    }
}
