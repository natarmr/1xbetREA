package a;

/* JADX INFO: loaded from: classes.dex */
public final class aot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1219a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public aot0(String str, String str2, String str3, String str4, String str5) {
        this.f1219a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aot0) && ((aot0) obj).f1219a.equals(this.f1219a);
    }

    public final int hashCode() {
        return this.f1219a.hashCode();
    }

    public final String toString() {
        return this.f1219a;
    }
}
