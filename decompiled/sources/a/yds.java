package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class yds extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f42454a;

    public yds(ank0 ank0Var) {
        this.f42454a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yds) && this.f42454a.equals(((yds) obj).f42454a);
    }

    public final int hashCode() {
        return this.f42454a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("ScoreChange(score=", this.f42454a, Separators.RPAREN);
    }
}
