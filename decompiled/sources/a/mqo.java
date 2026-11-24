package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mqo implements nqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22235a;

    public mqo(List list) {
        list.getClass();
        this.f22235a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqo) && Intrinsics.d(this.f22235a, ((mqo) obj).f22235a);
    }

    public final int hashCode() {
        return this.f22235a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f22235a, "Success(eventsList=", Separators.RPAREN);
    }
}
