package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m3e0 implements s3e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9a0 f21111a;

    static {
        b9a0 b9a0Var = b9a0.g;
    }

    public m3e0(b9a0 b9a0Var) {
        this.f21111a = b9a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3e0) && this.f21111a.equals(((m3e0) obj).f21111a);
    }

    public final int hashCode() {
        return this.f21111a.hashCode();
    }

    public final String toString() {
        return "PlayerCell(playerModel=" + this.f21111a + Separators.RPAREN;
    }
}
