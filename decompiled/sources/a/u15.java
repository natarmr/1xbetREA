package a;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes.dex */
public final class u15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34886a;
    public final Class b;
    public final Object c;

    public u15(String str, Class cls, CaptureRequest.Key key) {
        this.f34886a = str;
        if (cls == null) {
            hny.u("Null valueClass");
            throw null;
        }
        this.b = cls;
        this.c = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u15)) {
            return false;
        }
        u15 u15Var = (u15) obj;
        if (!this.f34886a.equals(u15Var.f34886a) || !this.b.equals(u15Var.b)) {
            return false;
        }
        Object obj2 = u15Var.c;
        Object obj3 = this.c;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        int iHashCode = (((this.f34886a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Option{id=" + this.f34886a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}
