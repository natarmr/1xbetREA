package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class v8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v8m f36992a;
    public static final v8m b;
    public static final /* synthetic */ v8m[] c;

    static {
        v8m v8mVar = new v8m("TEAM", 0);
        f36992a = v8mVar;
        v8m v8mVar2 = new v8m("PLAYER", 1);
        b = v8mVar2;
        c = new v8m[]{v8mVar, v8mVar2};
    }

    public static v8m valueOf(String str) {
        return (v8m) Enum.valueOf(v8m.class, str);
    }

    public static v8m[] values() {
        return (v8m[]) c.clone();
    }
}
