package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e3w f7156a;
    public static final e3w b;
    public static final e3w c;
    public static final /* synthetic */ e3w[] d;

    static {
        e3w e3wVar = new e3w("TEXT", 0);
        f7156a = e3wVar;
        e3w e3wVar2 = new e3w("POSITIVE", 1);
        b = e3wVar2;
        e3w e3wVar3 = new e3w("NEGATIVE", 2);
        c = e3wVar3;
        d = new e3w[]{e3wVar, e3wVar2, e3wVar3};
    }

    public static e3w valueOf(String str) {
        return (e3w) Enum.valueOf(e3w.class, str);
    }

    public static e3w[] values() {
        return (e3w[]) d.clone();
    }
}
