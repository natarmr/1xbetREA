package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sd00 implements td00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32011a;
    public final List b;

    public sd00(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f32011a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd00)) {
            return false;
        }
        sd00 sd00Var = (sd00) obj;
        return Intrinsics.d(this.f32011a, sd00Var.f32011a) && Intrinsics.d(this.b, sd00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32011a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("Success(contentItems=", ", uiItems=", this.f32011a, Separators.RPAREN, this.b);
    }
}
