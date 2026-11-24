package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vul f38053a;
    public static final vul b;
    public static final /* synthetic */ vul[] c;

    static {
        vul vulVar = new vul("HORIZONTAL", 0);
        f38053a = vulVar;
        vul vulVar2 = new vul("VERTICAL", 1);
        b = vulVar2;
        c = new vul[]{vulVar, vulVar2};
    }

    public static vul valueOf(String str) {
        return (vul) Enum.valueOf(vul.class, str);
    }

    public static vul[] values() {
        return (vul[]) c.clone();
    }
}
