package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c9a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3953a;
    public final String b;

    public c9a0(int i, String str) {
        this.f3953a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9a0)) {
            return false;
        }
        c9a0 c9a0Var = (c9a0) obj;
        return this.f3953a == c9a0Var.f3953a && this.b.equals(c9a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f3953a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f3953a, "PlayerModel(id=", ", name=", this.b, Separators.RPAREN);
    }
}
