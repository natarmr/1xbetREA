package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hwb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hwb f13762a;
    public static final hwb b;
    public static final hwb c;
    public static final /* synthetic */ hwb[] d;

    static {
        hwb hwbVar = new hwb("ATTACK", 0);
        f13762a = hwbVar;
        hwb hwbVar2 = new hwb("DEFEND", 1);
        b = hwbVar2;
        hwb hwbVar3 = new hwb("NOT_SET", 2);
        c = hwbVar3;
        d = new hwb[]{hwbVar, hwbVar2, hwbVar3};
    }

    public static hwb valueOf(String str) {
        return (hwb) Enum.valueOf(hwb.class, str);
    }

    public static hwb[] values() {
        return (hwb[]) d.clone();
    }
}
