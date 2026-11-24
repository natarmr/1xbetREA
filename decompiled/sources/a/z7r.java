package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z7r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z7r f43932a;
    public static final z7r b;
    public static final z7r c;
    public static final z7r d;
    public static final z7r e;
    public static final /* synthetic */ z7r[] f;

    static {
        z7r z7rVar = new z7r("ON_CONFIGURE", 0);
        f43932a = z7rVar;
        z7r z7rVar2 = new z7r("ON_CREATE", 1);
        b = z7rVar2;
        z7r z7rVar3 = new z7r("ON_UPGRADE", 2);
        c = z7rVar3;
        z7r z7rVar4 = new z7r("ON_DOWNGRADE", 3);
        d = z7rVar4;
        z7r z7rVar5 = new z7r("ON_OPEN", 4);
        e = z7rVar5;
        f = new z7r[]{z7rVar, z7rVar2, z7rVar3, z7rVar4, z7rVar5};
    }

    public static z7r valueOf(String str) {
        return (z7r) Enum.valueOf(z7r.class, str);
    }

    public static z7r[] values() {
        return (z7r[]) f.clone();
    }
}
