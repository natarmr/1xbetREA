package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mhe implements eie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21788a;
    public final a4x b;

    public mhe(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f21788a = z;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhe)) {
            return false;
        }
        mhe mheVar = (mhe) obj;
        return this.f21788a == mheVar.f21788a && Intrinsics.d(this.b, mheVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f21788a) * 31);
    }

    public final String toString() {
        return "LoadedTeams(refreshing=" + this.f21788a + ", content=" + this.b + Separators.RPAREN;
    }
}
