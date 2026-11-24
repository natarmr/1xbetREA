package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iwb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15480a;
    public final List b;
    public final List c;

    public iwb(List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f15480a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwb)) {
            return false;
        }
        iwb iwbVar = (iwb) obj;
        return Intrinsics.d(this.f15480a, iwbVar.f15480a) && Intrinsics.d(this.b, iwbVar.b) && Intrinsics.d(this.c, iwbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f15480a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(w6x.t("CharacteristicsModel(strengths=", ", style=", this.f15480a, ", weaknesses=", this.b), this.c, Separators.RPAREN);
    }
}
