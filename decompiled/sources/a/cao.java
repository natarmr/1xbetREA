package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cao f4021a;
    public static final cao b;
    public static final cao c;
    public static final /* synthetic */ cao[] d;

    static {
        cao caoVar = new cao("NORMAL", 0);
        f4021a = caoVar;
        cao caoVar2 = new cao("GREEN", 1);
        b = caoVar2;
        cao caoVar3 = new cao("RED", 2);
        c = caoVar3;
        d = new cao[]{caoVar, caoVar2, caoVar3};
    }

    public static cao valueOf(String str) {
        return (cao) Enum.valueOf(cao.class, str);
    }

    public static cao[] values() {
        return (cao[]) d.clone();
    }
}
