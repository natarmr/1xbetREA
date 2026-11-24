package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bgg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ggg0 f2555a;

    public bgg0(ggg0 ggg0Var) {
        this.f2555a = ggg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bgg0) && this.f2555a.equals(((bgg0) obj).f2555a);
    }

    public final int hashCode() {
        return this.f2555a.hashCode();
    }

    public final String toString() {
        return "RoundStatImageItemUiModel(roundStatItemType=" + this.f2555a + Separators.RPAREN;
    }
}
