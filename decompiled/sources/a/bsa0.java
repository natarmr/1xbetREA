package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bsa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sff0 f3120a;
    public final boolean b;
    public final wcb c;
    public final y78 d;

    public bsa0(sff0 sff0Var, boolean z, wcb wcbVar, y78 y78Var) {
        sff0Var.getClass();
        wcbVar.getClass();
        y78Var.getClass();
        this.f3120a = sff0Var;
        this.b = z;
        this.c = wcbVar;
        this.d = y78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsa0)) {
            return false;
        }
        bsa0 bsa0Var = (bsa0) obj;
        return Intrinsics.d(this.f3120a, bsa0Var.f3120a) && this.b == bsa0Var.b && Intrinsics.d(this.c, bsa0Var.c) && Intrinsics.d(this.d, bsa0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + brm0.e(this.f3120a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "PolybetEventConfig(remoteConfig=" + this.f3120a + ", bettingDisabled=" + this.b + ", champImagesHolder=" + this.c + ", gameUtilsProvider=" + this.d + Separators.RPAREN;
    }
}
