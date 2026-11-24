package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bzc f3459a;
    public static final bzc b;
    public static final bzc c;
    public static final bzc d;
    public static final /* synthetic */ bzc[] e;

    static {
        bzc bzcVar = new bzc("NONE", 0);
        f3459a = bzcVar;
        bzc bzcVar2 = new bzc("CHANGE_UP", 1);
        b = bzcVar2;
        bzc bzcVar3 = new bzc("CHANGE_DOWN", 2);
        c = bzcVar3;
        bzc bzcVar4 = new bzc("BLOCKED", 3);
        bzc bzcVar5 = new bzc("SAME", 4);
        d = bzcVar5;
        e = new bzc[]{bzcVar, bzcVar2, bzcVar3, bzcVar4, bzcVar5};
    }

    public static bzc valueOf(String str) {
        return (bzc) Enum.valueOf(bzc.class, str);
    }

    public static bzc[] values() {
        return (bzc[]) e.clone();
    }
}
