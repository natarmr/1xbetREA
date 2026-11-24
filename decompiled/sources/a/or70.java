package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class or70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25722a;
    public final String b;
    public final boolean c;

    public or70(String str, int i, boolean z) {
        this.f25722a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or70)) {
            return false;
        }
        or70 or70Var = (or70) obj;
        return this.f25722a == or70Var.f25722a && this.b.equals(or70Var.b) && this.c == or70Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f25722a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f25722a, "OnlineCallLanguageUiModel(id=", ", name=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
