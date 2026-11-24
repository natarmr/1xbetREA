package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38767a;

    public w98(List list) {
        list.getClass();
        this.f38767a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w98) && Intrinsics.d(this.f38767a, ((w98) obj).f38767a);
    }

    public final int hashCode() {
        return this.f38767a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f38767a, "BlockStagesModel(items=", Separators.RPAREN);
    }
}
