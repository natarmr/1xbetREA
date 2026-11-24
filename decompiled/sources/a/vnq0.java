package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vnq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37732a;
    public final String b;

    public vnq0(String str, String str2) {
        str2.getClass();
        this.f37732a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnq0)) {
            return false;
        }
        vnq0 vnq0Var = (vnq0) obj;
        return this.f37732a.equals(vnq0Var.f37732a) && Intrinsics.d(this.b, vnq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37732a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TimerUiModel(timerValue=", this.f37732a, ", timerSubtitle=", this.b, Separators.RPAREN);
    }
}
