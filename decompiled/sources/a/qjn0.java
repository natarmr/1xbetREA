package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qjn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28848a;
    public final boolean b;

    public qjn0(List list, boolean z) {
        list.getClass();
        this.f28848a = list;
        this.b = z;
    }

    public static qjn0 a(qjn0 qjn0Var, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = qjn0Var.f28848a;
        }
        if ((i & 2) != 0) {
            z = qjn0Var.b;
        }
        qjn0Var.getClass();
        list.getClass();
        return new qjn0(list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjn0)) {
            return false;
        }
        qjn0 qjn0Var = (qjn0) obj;
        return Intrinsics.d(this.f28848a, qjn0Var.f28848a) && this.b == qjn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f28848a.hashCode() * 31);
    }

    public final String toString() {
        return "SupportMenuScreenStateModel(menuItems=" + this.f28848a + ", isLoading=" + this.b + Separators.RPAREN;
    }
}
