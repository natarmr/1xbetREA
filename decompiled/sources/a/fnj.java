package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fnj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9839a;

    public fnj(String str) {
        str.getClass();
        this.f9839a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fnj) && Intrinsics.d(this.f9839a, ((fnj) obj).f9839a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f9839a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("Info(innerScreenName=", this.f9839a, ", hasBackStack=false)");
    }
}
