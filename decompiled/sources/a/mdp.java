package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mdp f21607a;
    public static final mdp b;
    public static final /* synthetic */ mdp[] c;

    static {
        mdp mdpVar = new mdp("FAVORITE", 0);
        f21607a = mdpVar;
        mdp mdpVar2 = new mdp("VIEWED", 1);
        b = mdpVar2;
        c = new mdp[]{mdpVar, mdpVar2};
    }

    public static mdp valueOf(String str) {
        return (mdp) Enum.valueOf(mdp.class, str);
    }

    public static mdp[] values() {
        return (mdp[]) c.clone();
    }
}
