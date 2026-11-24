package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zzu0 implements a0v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45272a;
    public final pg b;
    public final jjm c;

    public zzu0(int i, pg pgVar, jjm jjmVar) {
        this.f45272a = i;
        this.b = pgVar;
        this.c = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzu0)) {
            return false;
        }
        zzu0 zzu0Var = (zzu0) obj;
        return this.f45272a == zzu0Var.f45272a && this.b == zzu0Var.b && Intrinsics.d(this.c, zzu0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.f45272a) * 31)) * 31;
        jjm jjmVar = this.c;
        return iHashCode + (jjmVar == null ? 0 : jjmVar.hashCode());
    }

    public final String toString() {
        return "HeaderUiItem(titleResId=" + this.f45272a + ", titleType=" + this.b + ", model=" + this.c + Separators.RPAREN;
    }
}
