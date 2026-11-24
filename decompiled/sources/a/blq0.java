package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class blq0 implements clq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uaq0 f2807a;

    public blq0(uaq0 uaq0Var) {
        this.f2807a = uaq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blq0) && this.f2807a == ((blq0) obj).f2807a;
    }

    public final int hashCode() {
        return this.f2807a.hashCode();
    }

    public final String toString() {
        return "ExitWithThemeChange(oldTheme=" + this.f2807a + Separators.RPAREN;
    }
}
