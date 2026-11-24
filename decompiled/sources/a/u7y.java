package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u7y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7y f35208a;
    public final t2y b;
    public final List c;
    public final long d;
    public final boolean e;

    public u7y(o7y o7yVar, t2y t2yVar, List list, long j, boolean z) {
        list.getClass();
        this.f35208a = o7yVar;
        this.b = t2yVar;
        this.c = list;
        this.d = j;
        this.e = z;
    }

    public static u7y a(u7y u7yVar, o7y o7yVar, List list, long j, boolean z, int i) {
        if ((i & 1) != 0) {
            o7yVar = u7yVar.f35208a;
        }
        o7y o7yVar2 = o7yVar;
        t2y t2yVar = u7yVar.b;
        if ((i & 4) != 0) {
            list = u7yVar.c;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = u7yVar.e;
        }
        u7yVar.getClass();
        list2.getClass();
        return new u7y(o7yVar2, t2yVar, list2, j, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7y)) {
            return false;
        }
        u7y u7yVar = (u7y) obj;
        return this.f35208a.equals(u7yVar.f35208a) && this.b.equals(u7yVar.b) && Intrinsics.d(this.c, u7yVar.c) && this.d == u7yVar.d && this.e == u7yVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.b(dw9.a((this.b.hashCode() + (this.f35208a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JackpotState(screen=");
        sb.append(this.f35208a);
        sb.append(", imageUrls=");
        sb.append(this.b);
        sb.append(", periods=");
        sb.append(this.c);
        sb.append(", countDownTimeMillis=");
        sb.append(this.d);
        return f140.n(sb, ", serverError=", this.e, Separators.RPAREN);
    }
}
