package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j4e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j4e f15879a;
    public static final j4e b;
    public static final j4e c;
    public static final j4e d;
    public static final /* synthetic */ j4e[] e;

    static {
        j4e j4eVar = new j4e("FIXED", 0);
        f15879a = j4eVar;
        j4e j4eVar2 = new j4e("WRAP_CONTENT", 1);
        b = j4eVar2;
        j4e j4eVar3 = new j4e("MATCH_CONSTRAINT", 2);
        c = j4eVar3;
        j4e j4eVar4 = new j4e("MATCH_PARENT", 3);
        d = j4eVar4;
        e = new j4e[]{j4eVar, j4eVar2, j4eVar3, j4eVar4};
    }

    public static j4e valueOf(String str) {
        return (j4e) Enum.valueOf(j4e.class, str);
    }

    public static j4e[] values() {
        return (j4e[]) e.clone();
    }
}
