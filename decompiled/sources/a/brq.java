package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class brq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final brq f3090a;
    public static final brq b;
    public static final brq c;
    public static final /* synthetic */ brq[] d;

    static {
        brq brqVar = new brq("Flat", 0);
        f3090a = brqVar;
        brq brqVar2 = new brq("HalfOpened", 1);
        b = brqVar2;
        brq brqVar3 = new brq("Closed", 2);
        c = brqVar3;
        d = new brq[]{brqVar, brqVar2, brqVar3};
    }

    public static brq valueOf(String str) {
        return (brq) Enum.valueOf(brq.class, str);
    }

    public static brq[] values() {
        return (brq[]) d.clone();
    }
}
