package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dc80 implements hc80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5840a;
    public final List b;

    public dc80(Throwable th, List list) {
        th.getClass();
        list.getClass();
        this.f5840a = th;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc80)) {
            return false;
        }
        dc80 dc80Var = (dc80) obj;
        return Intrinsics.d(this.f5840a, dc80Var.f5840a) && Intrinsics.d(this.b, dc80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5840a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorWithGames(error=" + this.f5840a + ", games=" + this.b + Separators.RPAREN;
    }
}
