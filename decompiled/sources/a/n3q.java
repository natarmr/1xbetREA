package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class n3q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n3q f22862a;
    public static final n3q b;
    public static final n3q c;
    public static final /* synthetic */ n3q[] d;

    static {
        n3q n3qVar = new n3q("LAST_GAME", 0);
        f22862a = n3qVar;
        n3q n3qVar2 = new n3q("FUTURE_GAME", 1);
        b = n3qVar2;
        n3q n3qVar3 = new n3q("GAMES", 2);
        c = n3qVar3;
        d = new n3q[]{n3qVar, n3qVar2, n3qVar3};
    }

    public static n3q valueOf(String str) {
        return (n3q) Enum.valueOf(n3q.class, str);
    }

    public static n3q[] values() {
        return (n3q[]) d.clone();
    }
}
