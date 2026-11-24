package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uos0 extends yos0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qos0 f36029a;

    public uos0(qos0 qos0Var) {
        qos0Var.getClass();
        this.f36029a = qos0Var;
    }

    @Override // a.yos0
    public final qos0 a() {
        return this.f36029a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uos0) && Intrinsics.d(this.f36029a, ((uos0) obj).f36029a);
    }

    public final int hashCode() {
        return this.f36029a.hashCode();
    }

    public final String toString() {
        return "NeedDownload(fileKey=" + this.f36029a + Separators.RPAREN;
    }
}
