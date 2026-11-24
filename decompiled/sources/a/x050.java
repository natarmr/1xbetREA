package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x050 implements r150 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40055a;

    public x050(String str) {
        str.getClass();
        this.f40055a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x050) && Intrinsics.d(this.f40055a, ((x050) obj).f40055a);
    }

    public final int hashCode() {
        return this.f40055a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnCLickDailyTaskAction(key=", this.f40055a, Separators.RPAREN);
    }
}
