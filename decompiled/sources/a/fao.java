package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class fao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fao f9218a;
    public static final fao b;
    public static final fao c;
    public static final /* synthetic */ fao[] d;

    static {
        fao faoVar = new fao("NORMAL", 0);
        f9218a = faoVar;
        fao faoVar2 = new fao("INCREASED", 1);
        b = faoVar2;
        fao faoVar3 = new fao("DECREASED", 2);
        c = faoVar3;
        d = new fao[]{faoVar, faoVar2, faoVar3};
    }

    public static fao valueOf(String str) {
        return (fao) Enum.valueOf(fao.class, str);
    }

    public static fao[] values() {
        return (fao[]) d.clone();
    }
}
