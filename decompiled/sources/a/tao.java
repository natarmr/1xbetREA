package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tao f33622a;
    public static final tao b;
    public static final tao c;
    public static final /* synthetic */ tao[] d;

    static {
        tao taoVar = new tao("UNDEFINED", 0);
        f33622a = taoVar;
        tao taoVar2 = new tao("MEASURE_NEW_DATA", 1);
        b = taoVar2;
        tao taoVar3 = new tao("MEASURE_ALL", 2);
        c = taoVar3;
        d = new tao[]{taoVar, taoVar2, taoVar3};
    }

    public static tao valueOf(String str) {
        return (tao) Enum.valueOf(tao.class, str);
    }

    public static tao[] values() {
        return (tao[]) d.clone();
    }
}
