package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35550a;
    public final String b;
    public final boolean c;

    public uew(String str, long j, boolean z) {
        this.f35550a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uew)) {
            return false;
        }
        uew uewVar = (uew) obj;
        return this.f35550a == uewVar.f35550a && this.b.equals(uewVar.b) && this.c == uewVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f35550a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(axq.o(this.f35550a, "HltvAwardsToolbarChipsUiModel(id=", ", name=", this.b), ", isSelected=", this.c, Separators.RPAREN);
    }
}
