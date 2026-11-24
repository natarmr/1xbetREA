package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class yam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yam f42306a;
    public static final yam b;
    public static final /* synthetic */ yam[] c;

    static {
        yam yamVar = new yam("DEFAULT", 0);
        f42306a = yamVar;
        yam yamVar2 = new yam("ACCENT", 1);
        b = yamVar2;
        c = new yam[]{yamVar, yamVar2};
    }

    public static yam valueOf(String str) {
        return (yam) Enum.valueOf(yam.class, str);
    }

    public static yam[] values() {
        return (yam[]) c.clone();
    }
}
