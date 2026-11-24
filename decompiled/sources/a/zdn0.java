package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zdn0 implements den0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aan0 f44220a;

    public zdn0(aan0 aan0Var) {
        this.f44220a = aan0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zdn0) && this.f44220a.equals(((zdn0) obj).f44220a);
    }

    public final int hashCode() {
        return this.f44220a.hashCode();
    }

    public final String toString() {
        return "OnFavoriteIconClicked(model=" + this.f44220a + Separators.RPAREN;
    }
}
