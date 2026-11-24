package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y7f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42149a;
    public final Integer b;
    public final sff0 c;

    public y7f0(List list, Integer num, sff0 sff0Var) {
        list.getClass();
        this.f42149a = list;
        this.b = num;
        this.c = sff0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7f0)) {
            return false;
        }
        y7f0 y7f0Var = (y7f0) obj;
        return Intrinsics.d(this.f42149a, y7f0Var.f42149a) && Intrinsics.d(this.b, y7f0Var.b) && this.c.equals(y7f0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f42149a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbR = cs0.r(this.b, "RegistrationTypeChoiceDefaultStateModel(registrationTypes=", ", onlyOneSocialType=", ", remoteConfigModel=", this.f42149a);
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
