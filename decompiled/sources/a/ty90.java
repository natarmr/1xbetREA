package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ty90 implements wy90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34742a;

    public ty90(String str) {
        this.f34742a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty90) && this.f34742a.equals(((ty90) obj).f34742a);
    }

    public final int hashCode() {
        return this.f34742a.hashCode();
    }

    public final String toString() {
        return kng0.l("HeroAbility(abilityImage=", this.f34742a, Separators.RPAREN);
    }
}
