package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xeb implements afb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f40736a;
    public final mtl b;

    public xeb(a4x a4xVar, mtl mtlVar) {
        a4xVar.getClass();
        this.f40736a = a4xVar;
        this.b = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeb)) {
            return false;
        }
        xeb xebVar = (xeb) obj;
        return Intrinsics.d(this.f40736a, xebVar.f40736a) && Intrinsics.d(this.b, xebVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f40736a.hashCode() * 31;
        mtl mtlVar = this.b;
        return iHashCode + (mtlVar == null ? 0 : mtlVar.f22376a.hashCode());
    }

    public final String toString() {
        return "Champs(items=" + this.f40736a + ", bottomBar=" + this.b + Separators.RPAREN;
    }
}
