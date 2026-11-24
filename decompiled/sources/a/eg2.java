package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eg2 implements gg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f7741a;

    public final boolean equals(Object obj) {
        if (obj instanceof eg2) {
            return this.f7741a.equals(((eg2) obj).f7741a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7741a.hashCode();
    }

    public final String toString() {
        return twn.n("ResultGameCardAction(action=", this.f7741a, Separators.RPAREN);
    }
}
