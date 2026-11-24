package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ngf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23482a;

    public ngf(List list) {
        list.getClass();
        this.f23482a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngf) && Intrinsics.d(this.f23482a, ((ngf) obj).f23482a);
    }

    public final int hashCode() {
        return this.f23482a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f23482a, "CrystalPlayerInfoModel(roundInfo=", Separators.RPAREN);
    }
}
