package a;

import android.graphics.Point;

/* JADX INFO: loaded from: classes.dex */
public final class xyj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41708a;
    public final String b;
    public final Point c;
    public final n0o0 d = maz.b(new sz2(this, 7));

    public xyj(String str, String str2, Point point) {
        this.f41708a = str;
        this.b = str2;
        this.c = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyj)) {
            return false;
        }
        xyj xyjVar = (xyj) obj;
        return this.f41708a.equals(xyjVar.f41708a) && this.b.equals(xyjVar.b) && this.c.equals(xyjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(ua80.b(-61246432, 31, this.f41708a), 31, this.b);
    }

    public final String toString() {
        return "DefaultUserAgent(prefix=VKAndroidSDK, appVersion=" + this.f41708a + ", appBuild=" + this.b + ", displaySize=" + this.c + ')';
    }
}
