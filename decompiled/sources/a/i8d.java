package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i8d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i8d f14333a;
    public static final i8d b;
    public static final i8d c;
    public static final i8d d;
    public static final i8d e;
    public static final /* synthetic */ i8d[] f;

    static {
        i8d i8dVar = new i8d("INITIALIZED", 0);
        f14333a = i8dVar;
        i8d i8dVar2 = new i8d("IN_PROGRESS", 1);
        b = i8dVar2;
        i8d i8dVar3 = new i8d("COMPLETED", 2);
        c = i8dVar3;
        i8d i8dVar4 = new i8d("COMPLETED_WITH_NAVIGATION", 3);
        d = i8dVar4;
        i8d i8dVar5 = new i8d("FAILED", 4);
        e = i8dVar5;
        f = new i8d[]{i8dVar, i8dVar2, i8dVar3, i8dVar4, i8dVar5};
    }

    public static i8d valueOf(String str) {
        return (i8d) Enum.valueOf(i8d.class, str);
    }

    public static i8d[] values() {
        return (i8d[]) f.clone();
    }
}
