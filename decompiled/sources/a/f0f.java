package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f0f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0f f8714a;
    public static final f0f b;
    public static final f0f c;
    public static final /* synthetic */ f0f[] d;

    static {
        f0f f0fVar = new f0f("NORMAL", 0);
        f8714a = f0fVar;
        f0f f0fVar2 = new f0f("BLOCK", 1);
        b = f0fVar2;
        f0f f0fVar3 = new f0f("BUILDER", 2);
        c = f0fVar3;
        d = new f0f[]{f0fVar, f0fVar2, f0fVar3};
    }

    public static f0f valueOf(String str) {
        return (f0f) Enum.valueOf(f0f.class, str);
    }

    public static f0f[] values() {
        return (f0f[]) d.clone();
    }
}
