package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u800 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35212a;
    public final List b;

    public u800(String str, List list) {
        list.getClass();
        this.f35212a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u800)) {
            return false;
        }
        u800 u800Var = (u800) obj;
        return this.f35212a.equals(u800Var.f35212a) && Intrinsics.d(this.b, u800Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35212a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("LineUpTeamModel(title=", this.f35212a, ", players=", this.b, Separators.RPAREN);
    }
}
