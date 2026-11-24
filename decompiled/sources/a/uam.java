package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class uam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uam f35336a;
    public static final uam b;
    public static final /* synthetic */ uam[] c;

    static {
        uam uamVar = new uam("DEFAULT", 0);
        f35336a = uamVar;
        uam uamVar2 = new uam("EXTENDED", 1);
        b = uamVar2;
        c = new uam[]{uamVar, uamVar2};
    }

    public static uam valueOf(String str) {
        return (uam) Enum.valueOf(uam.class, str);
    }

    public static uam[] values() {
        return (uam[]) c.clone();
    }
}
