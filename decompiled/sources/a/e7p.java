package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e7p implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s9p f7338a;
    public final kvl b;
    public final boolean c;

    public e7p(s9p s9pVar, kvl kvlVar, boolean z) {
        this.f7338a = s9pVar;
        this.b = kvlVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7p)) {
            return false;
        }
        e7p e7pVar = (e7p) obj;
        return this.f7338a.equals(e7pVar.f7338a) && this.b.equals(e7pVar.b) && this.c == e7pVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f7338a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteClearUiItemModel(groupModel=");
        sb.append(this.f7338a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", isLastItem=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
