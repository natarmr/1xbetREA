package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class k3p0 implements n3p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kjl f17630a;

    public k3p0(kjl kjlVar) {
        this.f17630a = kjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3p0) && this.f17630a.equals(((k3p0) obj).f17630a);
    }

    public final int hashCode() {
        return this.f17630a.f18391a.hashCode();
    }

    public final String toString() {
        return "AddTeam(model=" + this.f17630a + Separators.RPAREN;
    }
}
