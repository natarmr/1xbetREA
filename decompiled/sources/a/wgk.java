package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wgk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39121a;
    public final String b;
    public final String c;
    public final String d;

    public wgk(String str, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        this.f39121a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgk)) {
            return false;
        }
        wgk wgkVar = (wgk) obj;
        return Intrinsics.d(this.f39121a, wgkVar.f39121a) && this.b.equals(wgkVar.b) && Intrinsics.d(this.c, wgkVar.c) && this.d.equals(wgkVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f39121a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceIdResult(deviceId=");
        sb.append(this.f39121a);
        sb.append(", gsfId=");
        sb.append(this.b);
        sb.append(", androidId=");
        sb.append(this.c);
        sb.append(", mediaDrmId=");
        return axq.m(sb, this.d, ')');
    }
}
