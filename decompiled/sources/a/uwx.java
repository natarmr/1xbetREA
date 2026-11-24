package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class uwx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uwx f36413a;
    public static final uwx b;
    public static final uwx c;
    public static final uwx d;
    public static final /* synthetic */ uwx[] e;

    static {
        uwx uwxVar = new uwx("FIRST", 0);
        f36413a = uwxVar;
        uwx uwxVar2 = new uwx("MIDDLE", 1);
        b = uwxVar2;
        uwx uwxVar3 = new uwx("LAST", 2);
        c = uwxVar3;
        uwx uwxVar4 = new uwx("SINGLE", 3);
        d = uwxVar4;
        e = new uwx[]{uwxVar, uwxVar2, uwxVar3, uwxVar4};
    }

    public static uwx valueOf(String str) {
        return (uwx) Enum.valueOf(uwx.class, str);
    }

    public static uwx[] values() {
        return (uwx[]) e.clone();
    }
}
