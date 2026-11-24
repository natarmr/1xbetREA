package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i8a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14328a;
    public final int b;
    public final drd c;

    public i8a(List list, int i, drd drdVar) {
        drdVar.getClass();
        this.f14328a = list;
        this.b = i;
        this.c = drdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8a)) {
            return false;
        }
        i8a i8aVar = (i8a) obj;
        return this.f14328a.equals(i8aVar.f14328a) && this.b == i8aVar.b && Intrinsics.d(this.c, i8aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f14328a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MainCaptureParams(configs=" + this.f14328a + ", requestTemplate=" + ((Object) onf0.b(this.b)) + ", sessionConfigOptions=" + this.c + ')';
    }
}
