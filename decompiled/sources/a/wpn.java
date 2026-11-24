package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wpn implements xpn {
    public static final vpn Companion = new vpn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39552a;

    public /* synthetic */ wpn(int i, String str) {
        if ((i & 1) == 0) {
            this.f39552a = null;
        } else {
            this.f39552a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wpn) && Intrinsics.d(this.f39552a, ((wpn) obj).f39552a);
    }

    public final int hashCode() {
        String str = this.f39552a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("EditLoginRequest(login=", this.f39552a, Separators.RPAREN);
    }

    public wpn(String str) {
        this.f39552a = str;
    }
}
