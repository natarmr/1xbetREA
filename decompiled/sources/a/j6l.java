package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j6l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j6l f15993a;
    public static final j6l b;
    public static final /* synthetic */ j6l[] c;

    static {
        j6l j6lVar = new j6l("RADIANT", 0);
        f15993a = j6lVar;
        j6l j6lVar2 = new j6l("DIRE", 1);
        b = j6lVar2;
        c = new j6l[]{j6lVar, j6lVar2};
    }

    public static j6l valueOf(String str) {
        return (j6l) Enum.valueOf(j6l.class, str);
    }

    public static j6l[] values() {
        return (j6l[]) c.clone();
    }
}
