package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4666a;

    public cno0(List list) {
        list.getClass();
        this.f4666a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cno0) && Intrinsics.d(this.f4666a, ((cno0) obj).f4666a);
    }

    public final int hashCode() {
        return this.f4666a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f4666a, "TabloStatisticItemModel(statistics=", Separators.RPAREN);
    }
}
