package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hql f13489a;
    public static final hql b;
    public static final hql c;
    public static final /* synthetic */ hql[] d;

    static {
        hql hqlVar = new hql("PREPARE", 0);
        f13489a = hqlVar;
        hql hqlVar2 = new hql("ACTIVE", 1);
        b = hqlVar2;
        hql hqlVar3 = new hql("ENDED", 2);
        c = hqlVar3;
        d = new hql[]{hqlVar, hqlVar2, hqlVar3};
    }

    public static hql valueOf(String str) {
        return (hql) Enum.valueOf(hql.class, str);
    }

    public static hql[] values() {
        return (hql[]) d.clone();
    }
}
