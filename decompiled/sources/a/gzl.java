package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class gzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gzl f12184a;
    public static final gzl b;
    public static final gzl c;
    public static final /* synthetic */ gzl[] d;

    static {
        gzl gzlVar = new gzl("ADD", 0);
        f12184a = gzlVar;
        gzl gzlVar2 = new gzl("TEAM_1", 1);
        b = gzlVar2;
        gzl gzlVar3 = new gzl("TEAM_2", 2);
        c = gzlVar3;
        d = new gzl[]{gzlVar, gzlVar2, gzlVar3};
    }

    public static gzl valueOf(String str) {
        return (gzl) Enum.valueOf(gzl.class, str);
    }

    public static gzl[] values() {
        return (gzl[]) d.clone();
    }
}
