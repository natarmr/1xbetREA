package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.subgames.api.SubGamesParams;

/* JADX INFO: loaded from: classes5.dex */
public final class tym0 implements zym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubGamesParams f34763a;

    public tym0(SubGamesParams subGamesParams) {
        this.f34763a = subGamesParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tym0) && this.f34763a.equals(((tym0) obj).f34763a);
    }

    public final int hashCode() {
        return this.f34763a.hashCode();
    }

    public final String toString() {
        return "Content(subGamesParams=" + this.f34763a + Separators.RPAREN;
    }
}
