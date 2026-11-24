package a;

/* JADX INFO: loaded from: classes2.dex */
public final class d4x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5478a;
    public final Object b;
    public final Object c;

    public d4x(Object obj, Object obj2, Object obj3) {
        this.f5478a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f5478a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.c);
        return new IllegalArgumentException(sb.toString());
    }
}
