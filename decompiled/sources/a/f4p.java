package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f4p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f4p f8926a;
    public static final f4p b;
    public static final f4p c;
    public static final f4p d;
    public static final /* synthetic */ f4p[] e;

    static {
        f4p f4pVar = new f4p("NO_ERROR", 0);
        f8926a = f4pVar;
        f4p f4pVar2 = new f4p("CONTENT_ERROR", 1);
        b = f4pVar2;
        f4p f4pVar3 = new f4p("RECOMMENDED_GAMES_EMPTY", 2);
        c = f4pVar3;
        f4p f4pVar4 = new f4p("CONTENT_EMPTY_ERROR", 3);
        f4p f4pVar5 = new f4p("CONTENT_EMPTY_SEARCH_ERROR", 4);
        d = f4pVar5;
        e = new f4p[]{f4pVar, f4pVar2, f4pVar3, f4pVar4, f4pVar5};
    }

    public static f4p valueOf(String str) {
        return (f4p) Enum.valueOf(f4p.class, str);
    }

    public static f4p[] values() {
        return (f4p[]) e.clone();
    }
}
