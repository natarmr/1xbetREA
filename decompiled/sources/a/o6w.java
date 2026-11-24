package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o6w implements p6w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f24758a;
    public final String b;
    public final mtl c;

    public o6w(a4x a4xVar, String str, mtl mtlVar) {
        a4xVar.getClass();
        str.getClass();
        this.f24758a = a4xVar;
        this.b = str;
        this.c = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6w)) {
            return false;
        }
        o6w o6wVar = (o6w) obj;
        return Intrinsics.d(this.f24758a, o6wVar.f24758a) && Intrinsics.d(this.b, o6wVar.b) && Intrinsics.d(this.c, o6wVar.c);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f24758a.hashCode() * 31, 31, this.b);
        mtl mtlVar = this.c;
        return iB + (mtlVar == null ? 0 : mtlVar.f22376a.hashCode());
    }

    public final String toString() {
        return "Sports(items=" + this.f24758a + ", sportsSelectedTitle=" + this.b + ", bottomBar=" + this.c + Separators.RPAREN;
    }
}
