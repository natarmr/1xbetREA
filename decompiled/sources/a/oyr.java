package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oyr implements ryr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f26071a;
    public final boolean b;

    public oyr(ank0 ank0Var, boolean z) {
        this.f26071a = ank0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyr)) {
            return false;
        }
        oyr oyrVar = (oyr) obj;
        return this.f26071a.equals(oyrVar.f26071a) && this.b == oyrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f26071a.f1159a.hashCode() * 31);
    }

    public final String toString() {
        return "GameInfo(info=" + this.f26071a + ", timerEnabled=" + this.b + Separators.RPAREN;
    }
}
