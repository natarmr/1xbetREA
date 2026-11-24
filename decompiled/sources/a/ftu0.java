package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ftu0 {
    public static final etu0 Companion = new etu0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new o1u0(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10132a;
    public final List b;

    public /* synthetic */ ftu0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f10132a = null;
        } else {
            this.f10132a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftu0)) {
            return false;
        }
        ftu0 ftu0Var = (ftu0) obj;
        return Intrinsics.d(this.f10132a, ftu0Var.f10132a) && Intrinsics.d(this.b, ftu0Var.b);
    }

    public final int hashCode() {
        String str = this.f10132a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("Section(title=", this.f10132a, ", info=", this.b, Separators.RPAREN);
    }
}
