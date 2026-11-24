package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class eho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eho f7817a;
    public static final eho b;
    public static final eho c;
    public static final /* synthetic */ eho[] d;

    static {
        eho ehoVar = new eho("NONE", 0);
        f7817a = ehoVar;
        eho ehoVar2 = new eho("ACTIVE", 1);
        b = ehoVar2;
        eho ehoVar3 = new eho("SELECTED", 2);
        c = ehoVar3;
        d = new eho[]{ehoVar, ehoVar2, ehoVar3};
    }

    public static eho valueOf(String str) {
        return (eho) Enum.valueOf(eho.class, str);
    }

    public static eho[] values() {
        return (eho[]) d.clone();
    }
}
