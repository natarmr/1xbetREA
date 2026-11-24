package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zhv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44412a;
    public final List b;

    public zhv(String str, List list) {
        list.getClass();
        this.f44412a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhv)) {
            return false;
        }
        zhv zhvVar = (zhv) obj;
        return Intrinsics.d(this.f44412a, zhvVar.f44412a) && Intrinsics.d(this.b, zhvVar.b);
    }

    public final int hashCode() {
        String str = this.f44412a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return ohs0.o("GroupStageStateModel(selectedGroup=", this.f44412a, ", groups=", this.b, Separators.RPAREN);
    }
}
