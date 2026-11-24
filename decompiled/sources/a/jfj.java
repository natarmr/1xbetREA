package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class jfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jfj f16429a;
    public static final jfj b;
    public static final /* synthetic */ jfj[] c;

    static {
        jfj jfjVar = new jfj("TOP", 0);
        f16429a = jfjVar;
        jfj jfjVar2 = new jfj("BOTTOM", 1);
        b = jfjVar2;
        c = new jfj[]{jfjVar, jfjVar2};
    }

    public static jfj valueOf(String str) {
        return (jfj) Enum.valueOf(jfj.class, str);
    }

    public static jfj[] values() {
        return (jfj[]) c.clone();
    }
}
