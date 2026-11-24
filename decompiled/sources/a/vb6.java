package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vb6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37126a;
    public final dqv0 b;

    public vb6(String str, dqv0 dqv0Var) {
        str.getClass();
        this.f37126a = str;
        this.b = dqv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb6)) {
            return false;
        }
        vb6 vb6Var = (vb6) obj;
        return Intrinsics.d(this.f37126a, vb6Var.f37126a) && this.b.equals(vb6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37126a.hashCode() * 31);
    }

    public final String toString() {
        return "BestGamesWorkerResponseContainerModel(requestId=" + this.f37126a + ", response=" + this.b + Separators.RPAREN;
    }
}
