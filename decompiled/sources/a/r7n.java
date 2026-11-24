package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class r7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7n f29985a;
    public static final r7n b;
    public static final r7n c;
    public static final /* synthetic */ r7n[] d;

    static {
        r7n r7nVar = new r7n("INCREMENTING_STANDARD", 0);
        f29985a = r7nVar;
        r7n r7nVar2 = new r7n("INCREMENTING_EXTENDED", 1);
        b = r7nVar2;
        r7n r7nVar3 = new r7n("DECREMENTING", 2);
        c = r7nVar3;
        d = new r7n[]{r7nVar, r7nVar2, r7nVar3};
    }

    public static r7n valueOf(String str) {
        return (r7n) Enum.valueOf(r7n.class, str);
    }

    public static r7n[] values() {
        return (r7n[]) d.clone();
    }
}
