package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ubm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ubm f35388a;
    public static final ubm b;
    public static final /* synthetic */ ubm[] c;

    static {
        ubm ubmVar = new ubm("DEFAULT", 0);
        f35388a = ubmVar;
        ubm ubmVar2 = new ubm("CIRCLE", 1);
        b = ubmVar2;
        c = new ubm[]{ubmVar, ubmVar2};
    }

    public static ubm valueOf(String str) {
        return (ubm) Enum.valueOf(ubm.class, str);
    }

    public static ubm[] values() {
        return (ubm[]) c.clone();
    }
}
