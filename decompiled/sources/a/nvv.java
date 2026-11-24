package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class nvv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24205a;

    public nvv(String str) {
        this.f24205a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvv) && this.f24205a.equals(((nvv) obj).f24205a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_sport_league_of_legends_106) + (this.f24205a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.ic_sport_league_of_legends_106, "HeroInfoImage(imageUrl=", this.f24205a, ", placeholderRes=", Separators.RPAREN);
    }
}
