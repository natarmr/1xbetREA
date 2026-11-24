package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hah f12724a;
    public static final hah b;
    public static final hah c;
    public static final /* synthetic */ hah[] d;

    static {
        hah hahVar = new hah("ROUNDED", 0);
        f12724a = hahVar;
        hah hahVar2 = new hah("LINE", 1);
        b = hahVar2;
        hah hahVar3 = new hah("DOUBLE_LINE", 2);
        c = hahVar3;
        d = new hah[]{hahVar, hahVar2, hahVar3};
    }

    public static hah valueOf(String str) {
        return (hah) Enum.valueOf(hah.class, str);
    }

    public static hah[] values() {
        return (hah[]) d.clone();
    }
}
