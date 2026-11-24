package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rab f30127a;
    public static final rab b;
    public static final rab c;
    public static final /* synthetic */ rab[] d;

    static {
        rab rabVar = new rab("CROSS", 0);
        f30127a = rabVar;
        rab rabVar2 = new rab("NOUGHT", 1);
        b = rabVar2;
        rab rabVar3 = new rab("EMPTY", 2);
        c = rabVar3;
        d = new rab[]{rabVar, rabVar2, rabVar3};
    }

    public static rab valueOf(String str) {
        return (rab) Enum.valueOf(rab.class, str);
    }

    public static rab[] values() {
        return (rab[]) d.clone();
    }
}
