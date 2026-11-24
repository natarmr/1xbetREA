package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13940a;
    public final String b;
    public final String c;

    public i0a(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f13940a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0a)) {
            return false;
        }
        i0a i0aVar = (i0a) obj;
        return Intrinsics.d(this.f13940a, i0aVar.f13940a) && this.b.equals(i0aVar.b) && Intrinsics.d(this.c, i0aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f13940a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInfo(cameraName=");
        sb.append(this.f13940a);
        sb.append(", cameraType=");
        sb.append(this.b);
        sb.append(", cameraOrientation=");
        return axq.m(sb, this.c, ')');
    }
}
