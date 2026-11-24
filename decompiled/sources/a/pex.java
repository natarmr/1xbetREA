package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26872a;
    public final String b;

    public pex(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f26872a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pex)) {
            return false;
        }
        pex pexVar = (pex) obj;
        return Intrinsics.d(this.f26872a, pexVar.f26872a) && Intrinsics.d(this.b, pexVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26872a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputDeviceData(name=");
        sb.append(this.f26872a);
        sb.append(", vendor=");
        return axq.m(sb, this.b, ')');
    }
}
