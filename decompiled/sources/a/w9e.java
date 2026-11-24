package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w9e f38776a;
    public static final w9e b;
    public static final w9e c;
    public static final /* synthetic */ w9e[] d;

    static {
        w9e w9eVar = new w9e("NONE", 0);
        f38776a = w9eVar;
        w9e w9eVar2 = new w9e("ENABLE", 1);
        b = w9eVar2;
        w9e w9eVar3 = new w9e("DISABLE", 2);
        c = w9eVar3;
        d = new w9e[]{w9eVar, w9eVar2, w9eVar3};
    }

    public static w9e valueOf(String str) {
        return (w9e) Enum.valueOf(w9e.class, str);
    }

    public static w9e[] values() {
        return (w9e[]) d.clone();
    }
}
