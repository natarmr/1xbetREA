package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tlk0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34151a;

    public tlk0(List list) {
        list.getClass();
        this.f34151a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlk0) && Intrinsics.d(this.f34151a, ((tlk0) obj).f34151a);
    }

    public final int hashCode() {
        return this.f34151a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f34151a, "SoulcaliburModel(rounds=", Separators.RPAREN);
    }
}
