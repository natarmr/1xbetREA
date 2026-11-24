package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jz20 implements lz20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f17389a;

    public jz20(udl0 udl0Var) {
        this.f17389a = udl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz20) && this.f17389a == ((jz20) obj).f17389a;
    }

    public final int hashCode() {
        return this.f17389a.hashCode();
    }

    public final String toString() {
        return "Loading(sportGameType=" + this.f17389a + Separators.RPAREN;
    }
}
