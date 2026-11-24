package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qgf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f28682a;
    public final String b;
    public final imm c;

    public qgf0(a4x a4xVar, String str, imm immVar) {
        a4xVar.getClass();
        this.f28682a = a4xVar;
        this.b = str;
        this.c = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgf0)) {
            return false;
        }
        qgf0 qgf0Var = (qgf0) obj;
        return Intrinsics.d(this.f28682a, qgf0Var.f28682a) && this.b.equals(qgf0Var.b) && this.c.equals(qgf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f28682a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "RemoteConfigTestUiState(keyList=" + this.f28682a + ", searchQuery=" + this.b + ", dsNavigationBarUiModel=" + this.c + Separators.RPAREN;
    }
}
