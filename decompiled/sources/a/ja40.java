package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ja40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16172a;
    public final n0x b;

    public ja40(n0x n0xVar, String str) {
        this.f16172a = str;
        this.b = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja40)) {
            return false;
        }
        ja40 ja40Var = (ja40) obj;
        return this.f16172a.equals(ja40Var.f16172a) && this.b.equals(ja40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16172a.hashCode() * 31);
    }

    public final String toString() {
        return "MetaCharacterCardSkillUiModel(name=" + this.f16172a + ", image=" + this.b + Separators.RPAREN;
    }
}
