package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bla0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2786a;

    public bla0(List list) {
        list.getClass();
        this.f2786a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bla0) && Intrinsics.d(this.f2786a, ((bla0) obj).f2786a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(this.f2786a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return twn.r(this.f2786a, "PlayersStatisticsCricketResultsState(results=", ", isLoading=false, isError=false)");
    }
}
