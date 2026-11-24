package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class vhb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vhb f37421a;
    public static final vhb b;
    public static final vhb c;
    public static final vhb d;
    public static final /* synthetic */ vhb[] e;

    static {
        vhb vhbVar = new vhb("NONE", 0);
        f37421a = vhbVar;
        vhb vhbVar2 = new vhb("CLIENT_HTTP", 1);
        b = vhbVar2;
        vhb vhbVar3 = new vhb("SERVER_HTTP", 2);
        c = vhbVar3;
        vhb vhbVar4 = new vhb("CONNECTION_LOST", 3);
        d = vhbVar4;
        e = new vhb[]{vhbVar, vhbVar2, vhbVar3, vhbVar4};
    }

    public static vhb valueOf(String str) {
        return (vhb) Enum.valueOf(vhb.class, str);
    }

    public static vhb[] values() {
        return (vhb[]) e.clone();
    }
}
