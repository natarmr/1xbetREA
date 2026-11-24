package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x52 implements y52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40292a;

    public x52(List list) {
        this.f40292a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x52) && this.f40292a.equals(((x52) obj).f40292a);
    }

    public final int hashCode() {
        return this.f40292a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f40292a, "Success(ids=", Separators.RPAREN);
    }
}
