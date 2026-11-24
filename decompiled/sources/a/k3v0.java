package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class k3v0 {
    public static final j3v0 Companion = new j3v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17638a;

    public /* synthetic */ k3v0(int i, String str) {
        if ((i & 1) == 0) {
            this.f17638a = null;
        } else {
            this.f17638a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3v0) && Intrinsics.d(this.f17638a, ((k3v0) obj).f17638a);
    }

    public final int hashCode() {
        String str = this.f17638a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenInBrowserData(url=", this.f17638a, Separators.RPAREN);
    }
}
