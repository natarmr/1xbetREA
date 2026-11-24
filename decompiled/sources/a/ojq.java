package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ojq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25371a;
    public final String b;

    public ojq(String str, String str2) {
        this.f25371a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojq)) {
            return false;
        }
        ojq ojqVar = (ojq) obj;
        return Intrinsics.d(this.f25371a, ojqVar.f25371a) && Intrinsics.d(this.b, ojqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25371a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfo(manufacturer=");
        sb.append(this.f25371a);
        sb.append(", model=");
        return axq.m(sb, this.b, ')');
    }
}
