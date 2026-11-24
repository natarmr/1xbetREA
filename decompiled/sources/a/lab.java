package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class lab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kj5 f19698a;
    public static final lab b;
    public static final lab c;
    public static final lab d;
    public static final lab e;
    public static final /* synthetic */ lab[] f;

    static {
        lab labVar = new lab("ACTIVE", 0);
        b = labVar;
        lab labVar2 = new lab("WON", 1);
        c = labVar2;
        lab labVar3 = new lab("LOSE", 2);
        d = labVar3;
        lab labVar4 = new lab("UNDEFINED", 3);
        e = labVar4;
        f = new lab[]{labVar, labVar2, labVar3, labVar4};
        f19698a = new kj5();
    }

    public static lab valueOf(String str) {
        return (lab) Enum.valueOf(lab.class, str);
    }

    public static lab[] values() {
        return (lab[]) f.clone();
    }
}
