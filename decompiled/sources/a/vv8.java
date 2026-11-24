package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vv8 implements zv8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38087a;
    public final cv8 b;
    public final jjm c;

    public vv8(String str, cv8 cv8Var, jjm jjmVar) {
        kjm kjmVar = kjm.f18392a;
        jjmVar.getClass();
        this.f38087a = str;
        this.b = cv8Var;
        this.c = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv8)) {
            return false;
        }
        vv8 vv8Var = (vv8) obj;
        if (!this.f38087a.equals(vv8Var.f38087a) || !this.b.equals(vv8Var.b) || !Intrinsics.d(this.c, vv8Var.c)) {
            return false;
        }
        kjm kjmVar = kjm.f18392a;
        return true;
    }

    @Override // a.zv8
    public final String getId() {
        return this.f38087a;
    }

    public final int hashCode() {
        return kjm.b.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f38087a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Header(id=" + this.f38087a + ", position=" + this.b + ", dsHeaderUiModel=" + this.c + ", dsHeaderSizeType=" + kjm.b + Separators.RPAREN;
    }
}
