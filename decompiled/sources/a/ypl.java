package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ypl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ypl f43036a;
    public static final ypl b;
    public static final ypl c;
    public static final ypl d;
    public static final ypl e;
    public static final /* synthetic */ ypl[] f;

    static {
        ypl yplVar = new ypl("BACKGROUND_S", 0);
        f43036a = yplVar;
        ypl yplVar2 = new ypl("BACKGROUND_L", 1);
        b = yplVar2;
        ypl yplVar3 = new ypl("BLACK_GRADIENT", 2);
        c = yplVar3;
        ypl yplVar4 = new ypl("COLOR_GRADIENT_S", 3);
        d = yplVar4;
        ypl yplVar5 = new ypl("COLOR_GRADIENT_L", 4);
        e = yplVar5;
        f = new ypl[]{yplVar, yplVar2, yplVar3, yplVar4, yplVar5};
    }

    public static ypl valueOf(String str) {
        return (ypl) Enum.valueOf(ypl.class, str);
    }

    public static ypl[] values() {
        return (ypl[]) f.clone();
    }
}
