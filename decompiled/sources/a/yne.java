package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yne f42936a;
    public static final yne b;
    public static final yne c;
    public static final yne d;
    public static final /* synthetic */ yne[] e;

    static {
        yne yneVar = new yne("DEFAULT", 0);
        f42936a = yneVar;
        yne yneVar2 = new yne("LAZY", 1);
        b = yneVar2;
        yne yneVar3 = new yne("ATOMIC", 2);
        c = yneVar3;
        yne yneVar4 = new yne("UNDISPATCHED", 3);
        d = yneVar4;
        e = new yne[]{yneVar, yneVar2, yneVar3, yneVar4};
    }

    public static yne valueOf(String str) {
        return (yne) Enum.valueOf(yne.class, str);
    }

    public static yne[] values() {
        return (yne[]) e.clone();
    }
}
