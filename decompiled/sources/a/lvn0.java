package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lvn0 implements ovn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3q f20723a;

    public lvn0(t3q t3qVar) {
        t3qVar.getClass();
        this.f20723a = t3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvn0) && Intrinsics.d(this.f20723a, ((lvn0) obj).f20723a);
    }

    public final int hashCode() {
        return this.f20723a.hashCode();
    }

    public final String toString() {
        return "OnSelectSport(sport=" + this.f20723a + Separators.RPAREN;
    }
}
