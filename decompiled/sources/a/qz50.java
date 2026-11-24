package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qz50 implements tz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f29565a;
    public final List b;

    public qz50(Throwable th, List list) {
        th.getClass();
        list.getClass();
        this.f29565a = th;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz50)) {
            return false;
        }
        qz50 qz50Var = (qz50) obj;
        return Intrinsics.d(this.f29565a, qz50Var.f29565a) && Intrinsics.d(this.b, qz50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29565a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorWithGames(error=" + this.f29565a + ", games=" + this.b + Separators.RPAREN;
    }
}
