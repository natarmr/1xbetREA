package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f4822a;
    public final List b;

    public cr20(j jVar, List list) {
        jVar.getClass();
        list.getClass();
        this.f4822a = jVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr20)) {
            return false;
        }
        cr20 cr20Var = (cr20) obj;
        return Intrinsics.d(this.f4822a, cr20Var.f4822a) && Intrinsics.d(this.b, cr20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4822a.hashCode() * 31);
    }

    public final String toString() {
        return "MarkdownParseResult(tree=" + this.f4822a + ", openMarkers=" + this.b + ')';
    }
}
