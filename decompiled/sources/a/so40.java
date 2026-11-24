package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class so40 implements uo40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32527a;

    public so40(String str) {
        str.getClass();
        this.f32527a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so40) && Intrinsics.d(this.f32527a, ((so40) obj).f32527a);
    }

    public final int hashCode() {
        return this.f32527a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnMoneyLimitValueChange(newValue=", this.f32527a, Separators.RPAREN);
    }
}
