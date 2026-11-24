package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ovq implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25935a;
    public final int b;
    public final String c;
    public final String d;

    public ovq(int i, String str, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.f25935a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ovq ovqVar = (ovq) obj;
        ovqVar.getClass();
        int i = this.f25935a - ovqVar.f25935a;
        return i == 0 ? this.b - ovqVar.b : i;
    }
}
