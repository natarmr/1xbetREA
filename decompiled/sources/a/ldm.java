package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ldm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ldm f19857a;
    public static final ldm b;
    public static final /* synthetic */ ldm[] c;

    static {
        ldm ldmVar = new ldm("THEME", 0);
        f19857a = ldmVar;
        ldm ldmVar2 = new ldm("STATIC_WHITE", 1);
        b = ldmVar2;
        c = new ldm[]{ldmVar, ldmVar2};
    }

    public static ldm valueOf(String str) {
        return (ldm) Enum.valueOf(ldm.class, str);
    }

    public static ldm[] values() {
        return (ldm[]) c.clone();
    }
}
