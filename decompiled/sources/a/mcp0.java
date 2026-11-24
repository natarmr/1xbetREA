package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mcp0 implements ncp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21563a;

    public mcp0(String str) {
        str.getClass();
        this.f21563a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mcp0) && Intrinsics.d(this.f21563a, ((mcp0) obj).f21563a);
    }

    public final int hashCode() {
        return this.f21563a.hashCode();
    }

    public final String toString() {
        return kng0.l("WithNameOnly(name=", this.f21563a, Separators.RPAREN);
    }
}
