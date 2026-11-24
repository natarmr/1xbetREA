package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class n9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bj5 f23131a;
    public static final n9b b;
    public static final n9b c;
    public static final n9b d;
    public static final /* synthetic */ n9b[] e;

    static {
        n9b n9bVar = new n9b("ACTIVE", 0);
        b = n9bVar;
        n9b n9bVar2 = new n9b("WIN", 1);
        c = n9bVar2;
        n9b n9bVar3 = new n9b("LOSE", 2);
        d = n9bVar3;
        e = new n9b[]{n9bVar, n9bVar2, n9bVar3};
        f23131a = new bj5();
    }

    public static n9b valueOf(String str) {
        return (n9b) Enum.valueOf(n9b.class, str);
    }

    public static n9b[] values() {
        return (n9b[]) e.clone();
    }
}
