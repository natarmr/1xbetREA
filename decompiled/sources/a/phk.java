package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class phk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final phk f27001a;
    public static final phk b;
    public static final phk c;
    public static final /* synthetic */ phk[] d;

    static {
        phk phkVar = new phk("SmallMobile", 0);
        f27001a = phkVar;
        phk phkVar2 = new phk("Mobile", 1);
        b = phkVar2;
        phk phkVar3 = new phk("Tablet", 2);
        c = phkVar3;
        d = new phk[]{phkVar, phkVar2, phkVar3};
    }

    public static phk valueOf(String str) {
        return (phk) Enum.valueOf(phk.class, str);
    }

    public static phk[] values() {
        return (phk[]) d.clone();
    }
}
