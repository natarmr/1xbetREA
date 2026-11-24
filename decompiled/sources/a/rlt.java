package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rlt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rlt f30714a;
    public static final rlt b;
    public static final rlt c;
    public static final /* synthetic */ rlt[] d;

    static {
        rlt rltVar = new rlt("REF_BLOCKED", 0);
        f30714a = rltVar;
        rlt rltVar2 = new rlt("LOCATION_BLOCKED", 1);
        b = rltVar2;
        rlt rltVar3 = new rlt("NO_BLOCK", 2);
        c = rltVar3;
        d = new rlt[]{rltVar, rltVar2, rltVar3};
    }

    public static rlt valueOf(String str) {
        return (rlt) Enum.valueOf(rlt.class, str);
    }

    public static rlt[] values() {
        return (rlt[]) d.clone();
    }
}
