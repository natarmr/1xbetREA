package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mdp0 implements sdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5a0 f21608a;
    public final String b;

    public mdp0(g5a0 g5a0Var, String str) {
        str.getClass();
        this.f21608a = g5a0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdp0)) {
            return false;
        }
        mdp0 mdp0Var = (mdp0) obj;
        return this.f21608a.equals(mdp0Var.f21608a) && Intrinsics.d(this.b, mdp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21608a.hashCode() * 31);
    }

    public final String toString() {
        return "Horizontal(playerLogo=" + this.f21608a + ", name=" + this.b + Separators.RPAREN;
    }
}
