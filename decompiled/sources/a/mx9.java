package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mx9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22542a;

    public /* synthetic */ mx9(String str) {
        this.f22542a = str;
    }

    public static String a(String str) {
        return hne.l(')', "CameraBackendId(value=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mx9) {
            return Intrinsics.d(this.f22542a, ((mx9) obj).f22542a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22542a.hashCode();
    }

    public final String toString() {
        return a(this.f22542a);
    }
}
