package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ebv0 implements mbv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7538a;

    public ebv0(List list) {
        list.getClass();
        this.f7538a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebv0) && Intrinsics.d(this.f7538a, ((ebv0) obj).f7538a);
    }

    public final int hashCode() {
        return this.f7538a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f7538a, "UpdateStages(stages=", Separators.RPAREN);
    }
}
