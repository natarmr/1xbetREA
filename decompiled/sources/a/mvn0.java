package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mvn0 implements ovn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3q f22466a;

    public mvn0(t3q t3qVar) {
        t3qVar.getClass();
        this.f22466a = t3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvn0) && Intrinsics.d(this.f22466a, ((mvn0) obj).f22466a);
    }

    public final int hashCode() {
        return this.f22466a.hashCode();
    }

    public final String toString() {
        return "OnSportClick(sport=" + this.f22466a + Separators.RPAREN;
    }
}
