package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class uzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uzl f36540a;
    public static final uzl b;
    public static final /* synthetic */ uzl[] c;

    static {
        uzl uzlVar = new uzl("ACTIVE", 0);
        f36540a = uzlVar;
        uzl uzlVar2 = new uzl("INACTIVE", 1);
        b = uzlVar2;
        c = new uzl[]{uzlVar, uzlVar2};
    }

    public static uzl valueOf(String str) {
        return (uzl) Enum.valueOf(uzl.class, str);
    }

    public static uzl[] values() {
        return (uzl[]) c.clone();
    }
}
