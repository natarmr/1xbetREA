package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32203a;
    public final String b;
    public final boolean c;

    public sha0(String str, int i, boolean z) {
        this.f32203a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sha0)) {
            return false;
        }
        sha0 sha0Var = (sha0) obj;
        return this.f32203a == sha0Var.f32203a && this.b.equals(sha0Var.b) && this.c == sha0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f32203a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f32203a, "PlayersStatisticCricketFilterItemUiModel(id=", ", title=", this.b, ", isSelected="), this.c, Separators.RPAREN);
    }
}
