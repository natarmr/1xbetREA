package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f29176a;
    public final wro b;
    public final pde c;

    public qqo(imm immVar, wro wroVar, pde pdeVar) {
        immVar.getClass();
        wroVar.getClass();
        this.f29176a = immVar;
        this.b = wroVar;
        this.c = pdeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqo)) {
            return false;
        }
        qqo qqoVar = (qqo) obj;
        return Intrinsics.d(this.f29176a, qqoVar.f29176a) && Intrinsics.d(this.b, qqoVar.b) && this.c.equals(qqoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f29176a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ExpressEventsUiState(navBarModel=" + this.f29176a + ", segmentControlModel=" + this.b + ", content=" + this.c + Separators.RPAREN;
    }
}
