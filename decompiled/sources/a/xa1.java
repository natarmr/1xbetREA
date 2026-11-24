package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class xa1 implements ya1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av0 f40531a;

    public xa1(av0 av0Var) {
        this.f40531a = av0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa1) && this.f40531a == ((xa1) obj).f40531a;
    }

    public final int hashCode() {
        return this.f40531a.hashCode();
    }

    public final String toString() {
        return "SelectGameMode(mode=" + this.f40531a + Separators.RPAREN;
    }
}
