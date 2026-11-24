package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xvp0 implements yvp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41573a;

    public xvp0(String str) {
        str.getClass();
        this.f41573a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvp0) && Intrinsics.d(this.f41573a, ((xvp0) obj).f41573a);
    }

    public final int hashCode() {
        return this.f41573a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnOpenTelegramBot(link=", this.f41573a, Separators.RPAREN);
    }
}
