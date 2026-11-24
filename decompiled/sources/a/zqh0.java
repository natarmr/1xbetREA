package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zqh0 implements crh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44807a;

    public zqh0(List list) {
        list.getClass();
        this.f44807a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqh0) && Intrinsics.d(this.f44807a, ((zqh0) obj).f44807a);
    }

    public final int hashCode() {
        return this.f44807a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f44807a, "Data(items=", Separators.RPAREN);
    }
}
