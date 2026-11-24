package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d7v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final art f5612a;
    public static final d7v b;
    public static final d7v c;
    public static final d7v d;
    public static final /* synthetic */ d7v[] e;

    static {
        d7v d7vVar = new d7v("ALL", 0);
        b = d7vVar;
        d7v d7vVar2 = new d7v("BONUSES", 1);
        c = d7vVar2;
        d7v d7vVar3 = new d7v("FREE_SPINS", 2);
        d = d7vVar3;
        e = new d7v[]{d7vVar, d7vVar2, d7vVar3};
        f5612a = new art();
    }

    public static d7v valueOf(String str) {
        return (d7v) Enum.valueOf(d7v.class, str);
    }

    public static d7v[] values() {
        return (d7v[]) e.clone();
    }
}
