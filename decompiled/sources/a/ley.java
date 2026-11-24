package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ley {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ley f19927a;
    public static final ley b;
    public static final ley c;
    public static final ley d;
    public static final ley e;
    public static final /* synthetic */ ley[] f;

    static {
        ley leyVar = new ley("HIDDEN", 0);
        f19927a = leyVar;
        ley leyVar2 = new ley("VISIBLE", 1);
        b = leyVar2;
        ley leyVar3 = new ley("DEPRECATED_LIST_METHODS", 2);
        c = leyVar3;
        ley leyVar4 = new ley("NOT_CONSIDERED", 3);
        d = leyVar4;
        ley leyVar5 = new ley("DROP", 4);
        e = leyVar5;
        f = new ley[]{leyVar, leyVar2, leyVar3, leyVar4, leyVar5};
    }

    public static ley valueOf(String str) {
        return (ley) Enum.valueOf(ley.class, str);
    }

    public static ley[] values() {
        return (ley[]) f.clone();
    }
}
