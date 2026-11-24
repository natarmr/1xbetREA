package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dlg implements qlg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6279a;

    public dlg(List list) {
        list.getClass();
        this.f6279a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlg) && Intrinsics.d(this.f6279a, ((dlg) obj).f6279a);
    }

    public final int hashCode() {
        return this.f6279a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f6279a, "UpdateDisciplineList(list=", Separators.RPAREN);
    }
}
