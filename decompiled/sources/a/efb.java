package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class efb implements ifb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7714a;
    public final List b;

    public efb(List list, List list2) {
        list2.getClass();
        this.f7714a = list;
        this.b = list2;
    }

    @Override // a.ifb
    public final List a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efb)) {
            return false;
        }
        efb efbVar = (efb) obj;
        return this.f7714a.equals(efbVar.f7714a) && Intrinsics.d(this.b, efbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7714a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("GroupStage(groups=", ", games=", this.f7714a, Separators.RPAREN, this.b);
    }
}
