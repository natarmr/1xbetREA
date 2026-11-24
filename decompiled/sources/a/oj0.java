package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class oj0 implements jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25336a;

    public oj0(List list) {
        list.getClass();
        this.f25336a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj0) && Intrinsics.d(this.f25336a, ((oj0) obj).f25336a);
    }

    public final int hashCode() {
        return this.f25336a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f25336a, "UpdateCategoryList(list=", Separators.RPAREN);
    }
}
