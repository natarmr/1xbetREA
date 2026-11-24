package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tnv implements bov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34255a;

    public final boolean equals(Object obj) {
        if (obj instanceof tnv) {
            return this.f34255a.equals(((tnv) obj).f34255a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34255a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstTeamWinTitle(value=", this.f34255a, Separators.RPAREN);
    }
}
