package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class jol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jol f16863a;
    public static final jol b;
    public static final /* synthetic */ jol[] c;

    static {
        jol jolVar = new jol("DEFAULT", 0);
        f16863a = jolVar;
        jol jolVar2 = new jol("AT_LEAST_TWO_SYMBOLS", 1);
        b = jolVar2;
        c = new jol[]{jolVar, jolVar2};
    }

    public static jol valueOf(String str) {
        return (jol) Enum.valueOf(jol.class, str);
    }

    public static jol[] values() {
        return (jol[]) c.clone();
    }
}
