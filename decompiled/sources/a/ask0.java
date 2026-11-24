package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ask0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f1396a;
    public final List b;

    public ask0(btk0 btk0Var, List list) {
        list.getClass();
        this.f1396a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ask0)) {
            return false;
        }
        ask0 ask0Var = (ask0) obj;
        return this.f1396a.equals(ask0Var.f1396a) && Intrinsics.d(this.b, ask0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1396a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("CyberTopPlayers(status=", this.f1396a, ", content=", this.b, Separators.RPAREN);
    }
}
