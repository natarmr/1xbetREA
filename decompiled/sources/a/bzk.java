package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bzk implements dzk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f3472a;

    public bzk(Throwable th) {
        th.getClass();
        this.f3472a = th;
    }

    public static /* synthetic */ bzk copy$default(bzk bzkVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = bzkVar.f3472a;
        }
        return bzkVar.copy(th);
    }

    public final Throwable component1() {
        return this.f3472a;
    }

    public final bzk copy(Throwable th) {
        th.getClass();
        return new bzk(th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzk) && Intrinsics.d(this.f3472a, ((bzk) obj).f3472a);
    }

    public final Throwable getThrowable() {
        return this.f3472a;
    }

    public int hashCode() {
        return this.f3472a.hashCode();
    }

    public String toString() {
        return ohs0.q("AllFailed(throwable=", Separators.RPAREN, this.f3472a);
    }
}
