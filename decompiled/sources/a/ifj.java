package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ifj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ifj f14690a;
    public static final ifj b;
    public static final /* synthetic */ ifj[] c;

    static {
        ifj ifjVar = new ifj("DATE", 0);
        f14690a = ifjVar;
        ifj ifjVar2 = new ifj("TIME", 1);
        b = ifjVar2;
        c = new ifj[]{ifjVar, ifjVar2};
    }

    public static ifj valueOf(String str) {
        return (ifj) Enum.valueOf(ifj.class, str);
    }

    public static ifj[] values() {
        return (ifj[]) c.clone();
    }
}
