package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1i f17524a;
    public static final k1i b;
    public static final k1i c;
    public static final /* synthetic */ k1i[] d;

    static {
        k1i k1iVar = new k1i("STATIC_PRETITLE", 0);
        f17524a = k1iVar;
        k1i k1iVar2 = new k1i("STATIC_TITLE", 1);
        b = k1iVar2;
        k1i k1iVar3 = new k1i("STATIC_SUBTITLE", 2);
        c = k1iVar3;
        d = new k1i[]{k1iVar, k1iVar2, k1iVar3};
    }

    public static k1i valueOf(String str) {
        return (k1i) Enum.valueOf(k1i.class, str);
    }

    public static k1i[] values() {
        return (k1i[]) d.clone();
    }
}
