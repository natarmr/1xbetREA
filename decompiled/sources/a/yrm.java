package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class yrm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yrm f43128a;
    public static final yrm b;
    public static final yrm c;
    public static final /* synthetic */ yrm[] d;
    public static final /* synthetic */ c0o e;

    static {
        yrm yrmVar = new yrm("POPULAR", 0);
        f43128a = yrmVar;
        yrm yrmVar2 = new yrm("NEW", 1);
        b = yrmVar2;
        yrm yrmVar3 = new yrm("NONE", 2);
        c = yrmVar3;
        yrm[] yrmVarArr = {yrmVar, yrmVar2, yrmVar3};
        d = yrmVarArr;
        e = new c0o(yrmVarArr);
    }

    public static yrm valueOf(String str) {
        return (yrm) Enum.valueOf(yrm.class, str);
    }

    public static yrm[] values() {
        return (yrm[]) d.clone();
    }
}
