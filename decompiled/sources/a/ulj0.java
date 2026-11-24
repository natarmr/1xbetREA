package a;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ulj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f35875a;

    public ulj0(Bitmap bitmap) {
        bitmap.getClass();
        this.f35875a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ulj0) && Intrinsics.d(this.f35875a, ((ulj0) obj).f35875a);
    }

    public final int hashCode() {
        return (this.f35875a.hashCode() * 31) - 1422469692;
    }

    public final String toString() {
        return "ShareButtonClicked(bitmap=" + this.f35875a + ", applicationAuthority=org.xbet.client1.provider)";
    }
}
