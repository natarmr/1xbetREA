package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gts implements its {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fts f11896a;
    public final fts b;

    public gts(fts ftsVar, fts ftsVar2) {
        this.f11896a = ftsVar;
        this.b = ftsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gts)) {
            return false;
        }
        gts gtsVar = (gts) obj;
        return this.f11896a.equals(gtsVar.f11896a) && this.b.equals(gtsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11896a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(video=" + this.f11896a + ", zone=" + this.b + Separators.RPAREN;
    }
}
