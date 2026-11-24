package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a940 implements d940 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f459a;

    public a940(List list) {
        list.getClass();
        this.f459a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a940) && Intrinsics.d(this.f459a, ((a940) obj).f459a);
    }

    public final int hashCode() {
        return this.f459a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f459a, "Data(messages=", Separators.RPAREN);
    }
}
