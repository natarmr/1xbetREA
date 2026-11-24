package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class gds implements Serializable {
    public static final fds Companion = new fds();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11116a;

    public /* synthetic */ gds(String str) {
        this.f11116a = str;
    }

    public static String a(String str) {
        return kng0.l("LogoUrl(url=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gds) {
            return Intrinsics.d(this.f11116a, ((gds) obj).f11116a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11116a.hashCode();
    }

    public final String toString() {
        return a(this.f11116a);
    }
}
