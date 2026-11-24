package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zhr f21357a;

    static {
        yhr yhrVar = zhr.Companion;
    }

    public m870(zhr zhrVar) {
        zhrVar.getClass();
        this.f21357a = zhrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m870) && Intrinsics.d(this.f21357a, ((m870) obj).f21357a);
    }

    public final int hashCode() {
        return this.f21357a.hashCode();
    }

    public final String toString() {
        return "OnShowGameBonus(event=" + this.f21357a + Separators.RPAREN;
    }
}
