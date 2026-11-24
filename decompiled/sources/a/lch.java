package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lch implements och {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19799a;

    public lch(List list) {
        list.getClass();
        this.f19799a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lch) && Intrinsics.d(this.f19799a, ((lch) obj).f19799a);
    }

    public final int hashCode() {
        return this.f19799a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f19799a, "Content(itemList=", Separators.RPAREN);
    }
}
