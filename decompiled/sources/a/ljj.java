package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ljj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ljj f20154a;
    public static final ljj b;
    public static final /* synthetic */ ljj[] c;

    static {
        ljj ljjVar = new ljj("CLOSED", 0);
        f20154a = ljjVar;
        ljj ljjVar2 = new ljj("ANALYTICS", 1);
        b = ljjVar2;
        c = new ljj[]{ljjVar, ljjVar2};
    }

    public static ljj valueOf(String str) {
        return (ljj) Enum.valueOf(ljj.class, str);
    }

    public static ljj[] values() {
        return (ljj[]) c.clone();
    }
}
