package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pif f27040a;
    public static final pif b;
    public static final pif c;
    public static final pif d;
    public static final /* synthetic */ pif[] e;

    static {
        pif pifVar = new pif("PLANTED", 0);
        f27040a = pifVar;
        pif pifVar2 = new pif("DEFUSED", 1);
        b = pifVar2;
        pif pifVar3 = new pif("EXPLODED", 2);
        c = pifVar3;
        pif pifVar4 = new pif("ABSENT", 3);
        d = pifVar4;
        e = new pif[]{pifVar, pifVar2, pifVar3, pifVar4};
    }

    public static pif valueOf(String str) {
        return (pif) Enum.valueOf(pif.class, str);
    }

    public static pif[] values() {
        return (pif[]) e.clone();
    }
}
