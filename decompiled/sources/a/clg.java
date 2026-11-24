package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class clg implements qlg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4557a;

    public clg(List list) {
        list.getClass();
        this.f4557a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clg) && Intrinsics.d(this.f4557a, ((clg) obj).f4557a);
    }

    public final int hashCode() {
        return this.f4557a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f4557a, "UpdateChampList(list=", Separators.RPAREN);
    }
}
