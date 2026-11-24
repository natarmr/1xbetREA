package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bdt implements pdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2416a;

    public bdt(List list) {
        list.getClass();
        this.f2416a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdt) && Intrinsics.d(this.f2416a, ((bdt) obj).f2416a);
    }

    public final int hashCode() {
        return this.f2416a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f2416a, "Data(items=", Separators.RPAREN);
    }
}
