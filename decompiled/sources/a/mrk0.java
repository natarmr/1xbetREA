package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mrk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wav0 f22277a;

    public mrk0(wav0 wav0Var) {
        this.f22277a = wav0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mrk0) && this.f22277a.equals(((mrk0) obj).f22277a);
    }

    public final int hashCode() {
        return this.f22277a.hashCode();
    }

    public final String toString() {
        return "WhoWinCardDelegateAction(action=" + this.f22277a + Separators.RPAREN;
    }
}
