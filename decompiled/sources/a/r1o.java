package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r1o implements u1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dyw f29691a;
    public final o1x b;
    public final Throwable c;

    public r1o(dyw dywVar, o1x o1xVar, Throwable th) {
        this.f29691a = dywVar;
        this.b = o1xVar;
        this.c = th;
    }

    @Override // a.u1x
    public final dyw b() {
        return this.f29691a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1o)) {
            return false;
        }
        r1o r1oVar = (r1o) obj;
        return Intrinsics.d(this.f29691a, r1oVar.f29691a) && Intrinsics.d(this.b, r1oVar.b) && this.c.equals(r1oVar.c);
    }

    @Override // a.u1x
    public final o1x getRequest() {
        return this.b;
    }

    public final int hashCode() {
        dyw dywVar = this.f29691a;
        int iHashCode = dywVar == null ? 0 : dywVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f29691a + ", request=" + this.b + ", throwable=" + this.c + Separators.RPAREN;
    }
}
