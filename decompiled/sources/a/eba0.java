package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class eba0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7511a;

    public final boolean equals(Object obj) {
        if (obj instanceof eba0) {
            return this.f7511a.equals(((eba0) obj).f7511a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7511a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f7511a, "StatisticsCells(value=", Separators.RPAREN);
    }
}
