package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y48 implements c58 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f41988a;
    public final int b;
    public final String c;
    public final a4x d;

    public y48(a4x a4xVar, int i, String str, a4x a4xVar2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f41988a = a4xVar;
        this.b = i;
        this.c = str;
        this.d = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y48)) {
            return false;
        }
        y48 y48Var = (y48) obj;
        return Intrinsics.d(this.f41988a, y48Var.f41988a) && this.b == y48Var.b && this.c.equals(y48Var.c) && Intrinsics.d(this.d, y48Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, this.f41988a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Content(photosUiItems=" + this.f41988a + ", currentPhotoPosition=" + this.b + ", photoDescription=" + this.c + ", biographyUiItems=" + this.d + Separators.RPAREN;
    }
}
