package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w3q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w3q f38514a;
    public static final w3q b;
    public static final w3q c;
    public static final w3q d;
    public static final /* synthetic */ w3q[] e;

    static {
        w3q w3qVar = new w3q("FILTERS", 0);
        f38514a = w3qVar;
        w3q w3qVar2 = new w3q("PROVIDERS", 1);
        b = w3qVar2;
        w3q w3qVar3 = new w3q("SHIMMERS", 2);
        c = w3qVar3;
        w3q w3qVar4 = new w3q("SORTING", 3);
        d = w3qVar4;
        e = new w3q[]{w3qVar, w3qVar2, w3qVar3, w3qVar4};
    }

    public static w3q valueOf(String str) {
        return (w3q) Enum.valueOf(w3q.class, str);
    }

    public static w3q[] values() {
        return (w3q[]) e.clone();
    }
}
