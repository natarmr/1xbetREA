package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class w2g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w2g f38445a;
    public static final w2g b;
    public static final w2g c;
    public static final /* synthetic */ w2g[] d;

    static {
        w2g w2gVar = new w2g("Empty", 0);
        f38445a = w2gVar;
        w2g w2gVar2 = new w2g("Markets", 1);
        b = w2gVar2;
        w2g w2gVar3 = new w2g("Related", 2);
        c = w2gVar3;
        d = new w2g[]{w2gVar, w2gVar2, w2gVar3};
    }

    public static w2g valueOf(String str) {
        return (w2g) Enum.valueOf(w2g.class, str);
    }

    public static w2g[] values() {
        return (w2g[]) d.clone();
    }
}
