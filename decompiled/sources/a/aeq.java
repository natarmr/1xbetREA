package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class aeq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aeq f741a;
    public static final aeq b;
    public static final aeq c;
    public static final aeq d;
    public static final /* synthetic */ aeq[] e;

    static {
        aeq aeqVar = new aeq("NONE", 0);
        f741a = aeqVar;
        aeq aeqVar2 = new aeq("FINGERPRINT", 1);
        b = aeqVar2;
        aeq aeqVar3 = new aeq("FINGERPRINT_ERROR", 2);
        c = aeqVar3;
        aeq aeqVar4 = new aeq("FINGERPRINT_AUTHENTICATED", 3);
        d = aeqVar4;
        e = new aeq[]{aeqVar, aeqVar2, aeqVar3, aeqVar4};
    }

    public static aeq valueOf(String str) {
        return (aeq) Enum.valueOf(aeq.class, str);
    }

    public static aeq[] values() {
        return (aeq[]) e.clone();
    }
}
