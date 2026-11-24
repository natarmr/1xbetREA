package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class abd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j700 f572a;

    public abd0(j700 j700Var) {
        this.f572a = j700Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abd0) && this.f572a == ((abd0) obj).f572a;
    }

    public final int hashCode() {
        return this.f572a.hashCode();
    }

    public final String toString() {
        return "Group(lineLiveScreenType=" + this.f572a + Separators.RPAREN;
    }
}
