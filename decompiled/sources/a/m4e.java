package a;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m4e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f21165a;
    public final boolean b;

    public m4e(boolean z, Uri uri) {
        uri.getClass();
        this.f21165a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m4e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        m4e m4eVar = (m4e) obj;
        return Intrinsics.d(this.f21165a, m4eVar.f21165a) && this.b == m4eVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f21165a.hashCode() * 31);
    }
}
