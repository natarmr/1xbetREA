package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gxo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gxo f12086a;
    public static final gxo b;
    public static final gxo c;
    public static final /* synthetic */ gxo[] d;

    static {
        gxo gxoVar = new gxo("FIRST", 0);
        f12086a = gxoVar;
        gxo gxoVar2 = new gxo("SECOND", 1);
        b = gxoVar2;
        gxo gxoVar3 = new gxo("THIRD", 2);
        c = gxoVar3;
        d = new gxo[]{gxoVar, gxoVar2, gxoVar3};
    }

    public static gxo valueOf(String str) {
        return (gxo) Enum.valueOf(gxo.class, str);
    }

    public static gxo[] values() {
        return (gxo[]) d.clone();
    }
}
