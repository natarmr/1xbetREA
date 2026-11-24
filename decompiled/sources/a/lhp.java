package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lhp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lhp f20068a;
    public static final lhp b;
    public static final lhp c;
    public static final lhp d;
    public static final /* synthetic */ lhp[] e;
    public static final /* synthetic */ c0o f;

    static {
        lhp lhpVar = new lhp("DYNAMIC_RANGE", 0);
        f20068a = lhpVar;
        lhp lhpVar2 = new lhp("FPS_RANGE", 1);
        b = lhpVar2;
        lhp lhpVar3 = new lhp("VIDEO_STABILIZATION", 2);
        c = lhpVar3;
        lhp lhpVar4 = new lhp("IMAGE_FORMAT", 3);
        d = lhpVar4;
        lhp[] lhpVarArr = {lhpVar, lhpVar2, lhpVar3, lhpVar4, new lhp("RECORDING_QUALITY", 4)};
        e = lhpVarArr;
        f = new c0o(lhpVarArr);
    }

    public static lhp valueOf(String str) {
        return (lhp) Enum.valueOf(lhp.class, str);
    }

    public static lhp[] values() {
        return (lhp[]) e.clone();
    }
}
