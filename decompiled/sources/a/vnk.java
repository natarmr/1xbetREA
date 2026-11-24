package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vnk implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37721a;

    public /* synthetic */ vnk(String str) {
        this.f37721a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vnk) {
            return Intrinsics.d(this.f37721a, ((vnk) obj).f37721a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37721a.hashCode();
    }

    public final String toString() {
        return kng0.l("Title(value=", this.f37721a, Separators.RPAREN);
    }
}
