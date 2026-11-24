package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l2a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19297a;
    public final String b;

    public l2a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f19297a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2a)) {
            return false;
        }
        l2a l2aVar = (l2a) obj;
        return Intrinsics.d(this.f19297a, l2aVar.f19297a) && Intrinsics.d(this.b, l2aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19297a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CameraResult(photoPathForContentProvider=", this.f19297a, ", absolutePhotoPath=", this.b, Separators.RPAREN);
    }
}
