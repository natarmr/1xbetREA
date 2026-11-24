package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class e9p implements h9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7432a;

    public e9p(List list) {
        this.f7432a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9p) && this.f7432a.equals(((e9p) obj).f7432a);
    }

    public final int hashCode() {
        return this.f7432a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f7432a, "Loaded(items=", Separators.RPAREN);
    }
}
