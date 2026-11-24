package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class u4l0 implements b5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7r0 f35056a;

    public u4l0(m7r0 m7r0Var) {
        this.f35056a = m7r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4l0) && this.f35056a == ((u4l0) obj).f35056a;
    }

    public final int hashCode() {
        return this.f35056a.hashCode();
    }

    public final String toString() {
        return "AllSportGamesClick(type=" + this.f35056a + Separators.RPAREN;
    }
}
