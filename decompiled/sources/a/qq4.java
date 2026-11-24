package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29149a;
    public final List b;

    public qq4(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f29149a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq4)) {
            return false;
        }
        qq4 qq4Var = (qq4) obj;
        return Intrinsics.d(this.f29149a, qq4Var.f29149a) && Intrinsics.d(this.b, qq4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29149a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("AuthenticatorNotificationsV2Model(activeItems=", ", historyItems=", this.f29149a, Separators.RPAREN, this.b);
    }
}
