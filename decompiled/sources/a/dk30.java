package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dk30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dk30 f6214a;
    public static final dk30 b;
    public static final /* synthetic */ dk30[] c;

    static {
        dk30 dk30Var = new dk30("Width", 0);
        f6214a = dk30Var;
        dk30 dk30Var2 = new dk30("Height", 1);
        b = dk30Var2;
        c = new dk30[]{dk30Var, dk30Var2};
    }

    public static dk30 valueOf(String str) {
        return (dk30) Enum.valueOf(dk30.class, str);
    }

    public static dk30[] values() {
        return (dk30[]) c.clone();
    }
}
