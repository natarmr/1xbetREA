package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xia implements zia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40935a;

    public xia(String str) {
        str.getClass();
        this.f40935a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xia) && Intrinsics.d(this.f40935a, ((xia) obj).f40935a);
    }

    public final int hashCode() {
        return this.f40935a.hashCode();
    }

    public final String toString() {
        return kng0.l("OptionBet(text=", this.f40935a, Separators.RPAREN);
    }
}
