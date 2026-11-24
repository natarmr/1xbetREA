package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tsk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f34465a;
    public final List b;

    public tsk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f34465a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsk0)) {
            return false;
        }
        tsk0 tsk0Var = (tsk0) obj;
        return this.f34465a.equals(tsk0Var.f34465a) && Intrinsics.d(this.b, tsk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34465a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("WhoWin(status=", this.f34465a, ", content=", this.b, Separators.RPAREN);
    }
}
