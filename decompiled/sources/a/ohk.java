package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ohk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ohk f25268a;
    public static final ohk b;
    public static final ohk c;
    public static final /* synthetic */ ohk[] d;

    static {
        ohk ohkVar = new ohk("SmallMobile", 0);
        f25268a = ohkVar;
        ohk ohkVar2 = new ohk("Mobile", 1);
        b = ohkVar2;
        ohk ohkVar3 = new ohk("Tablet", 2);
        c = ohkVar3;
        d = new ohk[]{ohkVar, ohkVar2, ohkVar3};
    }

    public static ohk valueOf(String str) {
        return (ohk) Enum.valueOf(ohk.class, str);
    }

    public static ohk[] values() {
        return (ohk[]) d.clone();
    }
}
