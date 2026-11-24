package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final am f1086a;
    public static final am b;
    public static final /* synthetic */ am[] c;

    static {
        am amVar = new am("START", 0);
        f1086a = amVar;
        am amVar2 = new am("END", 1);
        b = amVar2;
        c = new am[]{amVar, amVar2};
    }

    public static am valueOf(String str) {
        return (am) Enum.valueOf(am.class, str);
    }

    public static am[] values() {
        return (am[]) c.clone();
    }
}
