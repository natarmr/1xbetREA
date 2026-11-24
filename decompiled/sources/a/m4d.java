package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4d f21163a;
    public final boolean b;
    public final mbc c;

    public m4d(s4d s4dVar, boolean z, mbc mbcVar) {
        this.f21163a = s4dVar;
        this.b = z;
        this.c = mbcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4d)) {
            return false;
        }
        m4d m4dVar = (m4d) obj;
        return this.f21163a == m4dVar.f21163a && this.b == m4dVar.b && this.c.equals(m4dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f21163a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ColorPresetButtonUiModel(colorScheme=" + this.f21163a + ", isSelected=" + this.b + ", color=" + this.c + Separators.RPAREN;
    }
}
