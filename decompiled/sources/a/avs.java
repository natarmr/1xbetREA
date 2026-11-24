package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class avs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f1542a;
    public final l7m0 b;
    public final l7m0 c;
    public final l7m0 d;

    public avs(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, l7m0 l7m0Var4) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        l7m0Var3.getClass();
        l7m0Var4.getClass();
        this.f1542a = l7m0Var;
        this.b = l7m0Var2;
        this.c = l7m0Var3;
        this.d = l7m0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avs)) {
            return false;
        }
        avs avsVar = (avs) obj;
        return Intrinsics.d(this.f1542a, avsVar.f1542a) && Intrinsics.d(this.b, avsVar.b) && Intrinsics.d(this.c, avsVar.c) && Intrinsics.d(this.d, avsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h97.c(this.c, h97.c(this.b, this.f1542a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "GameToolbarUiModel(title=" + this.f1542a + ", menuEnabled=" + this.b + ", quickBetVisible=" + this.c + ", quickBetEnabled=" + this.d + Separators.RPAREN;
    }
}
