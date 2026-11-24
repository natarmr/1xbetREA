package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class x0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0m f40076a;
    public static final /* synthetic */ x0m[] b;

    static {
        x0m x0mVar = new x0m("NONE", 0);
        f40076a = x0mVar;
        b = new x0m[]{x0mVar, new x0m("FIRST_OPPONENT", 1), new x0m("SECOND_OPPONENT", 2)};
    }

    public static x0m valueOf(String str) {
        return (x0m) Enum.valueOf(x0m.class, str);
    }

    public static x0m[] values() {
        return (x0m[]) b.clone();
    }
}
