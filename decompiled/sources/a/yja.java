package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42730a;

    public yja(List list) {
        list.getClass();
        this.f42730a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yja) && Intrinsics.d(this.f42730a, ((yja) obj).f42730a);
    }

    public final int hashCode() {
        return this.f42730a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f42730a, "CardMatchReviewModel(eventList=", Separators.RPAREN);
    }
}
