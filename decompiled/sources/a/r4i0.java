package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r4i0 f29837a;
    public static final /* synthetic */ r4i0[] b;

    static {
        r4i0 r4i0Var = new r4i0("EditableText", 0);
        f29837a = r4i0Var;
        b = new r4i0[]{r4i0Var, new r4i0("StaticText", 1)};
    }

    public static r4i0 valueOf(String str) {
        return (r4i0) Enum.valueOf(r4i0.class, str);
    }

    public static r4i0[] values() {
        return (r4i0[]) b.clone();
    }
}
