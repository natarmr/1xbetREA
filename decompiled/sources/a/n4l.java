package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class n4l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22903a;
    public final int b;
    public final int c;

    public n4l(String str, int i, int i2) {
        this.f22903a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4l)) {
            return false;
        }
        n4l n4lVar = (n4l) obj;
        return this.f22903a.equals(n4lVar.f22903a) && this.b == n4lVar.b && this.c == n4lVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f22903a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, kng0.p(this.b, "DotaHeroSkillItemUiModel(imageSkill=", this.f22903a, ", maxLevel=", ", currentLevel="));
    }
}
