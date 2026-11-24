package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jd90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jd90 f16318a;
    public static final /* synthetic */ jd90[] b;

    /* JADX INFO: Fake field, exist only in values array */
    jd90 EF0;

    static {
        jd90 jd90Var = new jd90("PHOTO", 0);
        jd90 jd90Var2 = new jd90("FILE", 1);
        jd90 jd90Var3 = new jd90("NONE", 2);
        f16318a = jd90Var3;
        b = new jd90[]{jd90Var, jd90Var2, jd90Var3};
    }

    public static jd90 valueOf(String str) {
        return (jd90) Enum.valueOf(jd90.class, str);
    }

    public static jd90[] values() {
        return (jd90[]) b.clone();
    }
}
