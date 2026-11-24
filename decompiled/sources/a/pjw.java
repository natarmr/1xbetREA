package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pjw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pjw f27109a;
    public static final pjw b;
    public static final /* synthetic */ pjw[] c;

    static {
        pjw pjwVar = new pjw("SUB_HEADER", 0);
        f27109a = pjwVar;
        pjw pjwVar2 = new pjw("GAMES", 1);
        pjw pjwVar3 = new pjw("TOP_EVENT", 2);
        b = pjwVar3;
        c = new pjw[]{pjwVar, pjwVar2, pjwVar3};
    }

    public static pjw valueOf(String str) {
        return (pjw) Enum.valueOf(pjw.class, str);
    }

    public static pjw[] values() {
        return (pjw[]) c.clone();
    }
}
