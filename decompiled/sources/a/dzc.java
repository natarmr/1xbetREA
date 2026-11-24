package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dzc f6937a;
    public static final dzc b;
    public static final dzc c;
    public static final dzc d;
    public static final /* synthetic */ dzc[] e;

    static {
        dzc dzcVar = new dzc("NONE", 0);
        f6937a = dzcVar;
        dzc dzcVar2 = new dzc("CHANGE_UP", 1);
        b = dzcVar2;
        dzc dzcVar3 = new dzc("CHANGE_DOWN", 2);
        c = dzcVar3;
        dzc dzcVar4 = new dzc("BLOCKED", 3);
        d = dzcVar4;
        e = new dzc[]{dzcVar, dzcVar2, dzcVar3, dzcVar4};
    }

    public static dzc valueOf(String str) {
        return (dzc) Enum.valueOf(dzc.class, str);
    }

    public static dzc[] values() {
        return (dzc[]) e.clone();
    }
}
