package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pbm0 implements sbm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tdb f26715a;

    public pbm0(tdb tdbVar) {
        this.f26715a = tdbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbm0) && this.f26715a.equals(((pbm0) obj).f26715a);
    }

    public final int hashCode() {
        return this.f26715a.hashCode();
    }

    public final String toString() {
        return "OnMenuItemPressed(menuItem=" + this.f26715a + Separators.RPAREN;
    }
}
