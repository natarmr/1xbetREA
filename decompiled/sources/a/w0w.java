package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class w0w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0w f38369a;
    public static final w0w b;
    public static final w0w c;
    public static final w0w d;
    public static final w0w e;
    public static final w0w f;
    public static final w0w g;
    public static final w0w h;
    public static final /* synthetic */ w0w[] i;

    static {
        w0w w0wVar = new w0w("NONE", 0);
        f38369a = w0wVar;
        w0w w0wVar2 = new w0w("LOST", 1);
        b = w0wVar2;
        w0w w0wVar3 = new w0w("WIN", 2);
        c = w0wVar3;
        w0w w0wVar4 = new w0w("RETURN_FULL", 3);
        d = w0wVar4;
        w0w w0wVar5 = new w0w("RETURN", 4);
        e = w0wVar5;
        w0w w0wVar6 = new w0w("WIN_RETURN_HALF", 5);
        f = w0wVar6;
        w0w w0wVar7 = new w0w("RETURN_HALF", 6);
        g = w0wVar7;
        w0w w0wVar8 = new w0w("RESULT", 7);
        h = w0wVar8;
        i = new w0w[]{w0wVar, w0wVar2, w0wVar3, w0wVar4, w0wVar5, w0wVar6, w0wVar7, w0wVar8};
    }

    public static w0w valueOf(String str) {
        return (w0w) Enum.valueOf(w0w.class, str);
    }

    public static w0w[] values() {
        return (w0w[]) i.clone();
    }
}
