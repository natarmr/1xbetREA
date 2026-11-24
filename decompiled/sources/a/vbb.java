package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vbb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tiw f37133a;
    public final d0t b;

    public vbb(tiw tiwVar, d0t d0tVar) {
        d0tVar.getClass();
        this.f37133a = tiwVar;
        this.b = d0tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbb)) {
            return false;
        }
        vbb vbbVar = (vbb) obj;
        return this.f37133a.equals(vbbVar.f37133a) && Intrinsics.d(this.b, vbbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37133a.hashCode() * 31);
    }

    public final String toString() {
        return "ChampGame(champ=" + this.f37133a + ", game=" + this.b + Separators.RPAREN;
    }
}
