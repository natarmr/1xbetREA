package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v7d implements w7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36918a;
    public final bjk b;
    public final bjk c;

    public v7d(boolean z, bjk bjkVar, bjk bjkVar2) {
        this.f36918a = z;
        this.b = bjkVar;
        this.c = bjkVar2;
    }

    @Override // a.w7d
    public final bjk a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7d)) {
            return false;
        }
        v7d v7dVar = (v7d) obj;
        return this.f36918a == v7dVar.f36918a && this.b.equals(v7dVar.b) && this.c.equals(v7dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f36918a) * 31)) * 31);
    }

    public final String toString() {
        return "Default(isAuthRequire=" + this.f36918a + ", dialogParams=" + this.b + ", authDialogParams=" + this.c + Separators.RPAREN;
    }
}
