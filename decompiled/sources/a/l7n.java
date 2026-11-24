package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class l7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l7n f19567a;
    public static final l7n b;
    public static final /* synthetic */ l7n[] c;
    public static final /* synthetic */ c0o d;

    static {
        l7n l7nVar = new l7n("COUNTDOWN", 0);
        f19567a = l7nVar;
        l7n l7nVar2 = new l7n("FORWARD", 1);
        b = l7nVar2;
        l7n[] l7nVarArr = {l7nVar, l7nVar2};
        c = l7nVarArr;
        d = new c0o(l7nVarArr);
    }

    public static l7n valueOf(String str) {
        return (l7n) Enum.valueOf(l7n.class, str);
    }

    public static l7n[] values() {
        return (l7n[]) c.clone();
    }
}
