package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jz30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17391a;
    public final jnw b;

    public jz30(String str, jnw jnwVar) {
        this.f17391a = str;
        this.b = jnwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz30)) {
            return false;
        }
        jz30 jz30Var = (jz30) obj;
        return this.f17391a.equals(jz30Var.f17391a) && this.b.equals(jz30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17391a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuItemPlayerUiModel(title=" + this.f17391a + ", tennisPlayerMenuType=" + this.b + Separators.RPAREN;
    }
}
