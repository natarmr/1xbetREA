package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bxc implements exc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3369a;

    public bxc(List list) {
        list.getClass();
        this.f3369a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxc) && Intrinsics.d(this.f3369a, ((bxc) obj).f3369a);
    }

    public final int hashCode() {
        return this.f3369a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f3369a, "Content(itemList=", Separators.RPAREN);
    }
}
