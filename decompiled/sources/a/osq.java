package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class osq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25794a;

    public osq(nsq... nsqVarArr) {
        if (nsqVarArr.length <= 0) {
            this.f25794a = tx3.g0(nsqVarArr);
        } else {
            nsq nsqVar = nsqVarArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof osq) {
            return Intrinsics.d(this.f25794a, ((osq) obj).f25794a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25794a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f25794a, "Settings(settings=", Separators.RPAREN);
    }
}
