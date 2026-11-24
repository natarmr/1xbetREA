package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s6j implements t6j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31705a;

    public s6j(List list) {
        list.getClass();
        this.f31705a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6j) && Intrinsics.d(this.f31705a, ((s6j) obj).f31705a);
    }

    public final int hashCode() {
        return this.f31705a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f31705a, "SetPrizes(listPrize=", Separators.RPAREN);
    }
}
