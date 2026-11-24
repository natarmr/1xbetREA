package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dpy extends ppy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6488a;
    public final String b;

    public dpy(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f6488a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpy)) {
            return false;
        }
        dpy dpyVar = (dpy) obj;
        return Intrinsics.d(this.f6488a, dpyVar.f6488a) && Intrinsics.d(this.b, dpyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6488a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.f6488a);
        sb.append('.');
        return axq.m(sb, this.b, ')');
    }
}
