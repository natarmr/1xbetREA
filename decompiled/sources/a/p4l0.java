package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p4l0 implements c5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26359a;

    public p4l0(List list) {
        this.f26359a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4l0) && this.f26359a.equals(((p4l0) obj).f26359a);
    }

    public final int hashCode() {
        return this.f26359a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f26359a, "UpdateChampList(items=", Separators.RPAREN);
    }
}
