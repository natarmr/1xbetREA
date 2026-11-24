package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vyc f38240a;
    public static final vyc b;
    public static final vyc c;
    public static final /* synthetic */ vyc[] d;

    static {
        vyc vycVar = new vyc("NORMAL", 0);
        f38240a = vycVar;
        vyc vycVar2 = new vyc("GREEN", 1);
        b = vycVar2;
        vyc vycVar3 = new vyc("RED", 2);
        c = vycVar3;
        d = new vyc[]{vycVar, vycVar2, vycVar3};
    }

    public static vyc valueOf(String str) {
        return (vyc) Enum.valueOf(vyc.class, str);
    }

    public static vyc[] values() {
        return (vyc[]) d.clone();
    }
}
