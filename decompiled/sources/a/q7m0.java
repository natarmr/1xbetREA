package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pfw f28258a;
    public static final pfw b;

    static {
        byte b2 = 6;
        f28258a = new pfw("NONE", b2);
        b = new pfw("PENDING", b2);
    }

    public static final p7m0 a(Object obj) {
        if (obj == null) {
            obj = k860.f17859a;
        }
        return new p7m0(obj);
    }
}
