package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w4f f38539a;
    public static final w4f b;
    public static final w4f c;
    public static final /* synthetic */ w4f[] d;

    static {
        w4f w4fVar = new w4f("IDLE", 0);
        f38539a = w4fVar;
        w4f w4fVar2 = new w4f("CONNECTED", 1);
        b = w4fVar2;
        w4f w4fVar3 = new w4f("DISCONNECTED", 2);
        c = w4fVar3;
        d = new w4f[]{w4fVar, w4fVar2, w4fVar3};
    }

    public static w4f valueOf(String str) {
        return (w4f) Enum.valueOf(w4f.class, str);
    }

    public static w4f[] values() {
        return (w4f[]) d.clone();
    }
}
