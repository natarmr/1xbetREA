package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class psk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f27520a;
    public final List b;

    public psk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f27520a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psk0)) {
            return false;
        }
        psk0 psk0Var = (psk0) obj;
        return this.f27520a.equals(psk0Var.f27520a) && Intrinsics.d(this.b, psk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27520a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("Teams(status=", this.f27520a, ", content=", this.b, Separators.RPAREN);
    }
}
