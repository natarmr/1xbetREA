package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class okm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final okm f25411a;
    public static final okm b;
    public static final okm c;
    public static final okm d;
    public static final /* synthetic */ okm[] e;
    public static final /* synthetic */ c0o f;

    static {
        okm okmVar = new okm("LOTTIE", 0);
        f25411a = okmVar;
        okm okmVar2 = new okm("ICON", 1);
        b = okmVar2;
        okm okmVar3 = new okm("EMPTY", 2);
        c = okmVar3;
        okm okmVar4 = new okm("NONE", 3);
        d = okmVar4;
        okm[] okmVarArr = {okmVar, okmVar2, okmVar3, okmVar4};
        e = okmVarArr;
        f = new c0o(okmVarArr);
    }

    public static okm valueOf(String str) {
        return (okm) Enum.valueOf(okm.class, str);
    }

    public static okm[] values() {
        return (okm[]) e.clone();
    }
}
