package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v3q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v3q f36742a;
    public static final v3q b;
    public static final /* synthetic */ v3q[] c;

    static {
        v3q v3qVar = new v3q("Type", 0);
        f36742a = v3qVar;
        v3q v3qVar2 = new v3q("Period", 1);
        b = v3qVar2;
        c = new v3q[]{v3qVar, v3qVar2};
    }

    public static v3q valueOf(String str) {
        return (v3q) Enum.valueOf(v3q.class, str);
    }

    public static v3q[] values() {
        return (v3q[]) c.clone();
    }
}
