package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class n3d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n3d f22843a;
    public static final n3d b;
    public static final /* synthetic */ n3d[] c;
    public static final /* synthetic */ c0o d;

    static {
        n3d n3dVar = new n3d("SHIMMER", 0);
        f22843a = n3dVar;
        n3d n3dVar2 = new n3d("DEFAULT_ITEM", 1);
        b = n3dVar2;
        n3d[] n3dVarArr = {n3dVar, n3dVar2};
        c = n3dVarArr;
        d = new c0o(n3dVarArr);
    }

    public static n3d valueOf(String str) {
        return (n3d) Enum.valueOf(n3d.class, str);
    }

    public static n3d[] values() {
        return (n3d[]) c.clone();
    }
}
