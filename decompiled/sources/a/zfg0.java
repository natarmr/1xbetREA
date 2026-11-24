package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zfg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgg0 f44299a;
    public final bgg0 b;
    public final bgg0 c;

    public zfg0(bgg0 bgg0Var, bgg0 bgg0Var2, bgg0 bgg0Var3) {
        this.f44299a = bgg0Var;
        this.b = bgg0Var2;
        this.c = bgg0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfg0)) {
            return false;
        }
        zfg0 zfg0Var = (zfg0) obj;
        return this.f44299a.equals(zfg0Var.f44299a) && this.b.equals(zfg0Var.b) && this.c.equals(zfg0Var.c);
    }

    public final int hashCode() {
        return this.c.f2555a.hashCode() + ((this.b.f2555a.hashCode() + (this.f44299a.f2555a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RoundStatColumnItemUiModel(top=" + this.f44299a + ", middle=" + this.b + ", bottom=" + this.c + Separators.RPAREN;
    }
}
