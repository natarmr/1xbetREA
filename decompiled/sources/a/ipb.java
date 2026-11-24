package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ipb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cl5 f15154a;
    public static final ipb b;
    public static final ipb c;
    public static final ipb d;
    public static final ipb e;
    public static final /* synthetic */ ipb[] f;

    static {
        ipb ipbVar = new ipb("BOOLEAN", 0);
        b = ipbVar;
        ipb ipbVar2 = new ipb("LIST_ANY", 1);
        c = ipbVar2;
        ipb ipbVar3 = new ipb("INT", 2);
        d = ipbVar3;
        ipb ipbVar4 = new ipb("OTHER_TYPES", 3);
        e = ipbVar4;
        f = new ipb[]{ipbVar, ipbVar2, ipbVar3, ipbVar4};
        f15154a = new cl5((byte) 22);
    }

    public static ipb valueOf(String str) {
        return (ipb) Enum.valueOf(ipb.class, str);
    }

    public static ipb[] values() {
        return (ipb[]) f.clone();
    }
}
