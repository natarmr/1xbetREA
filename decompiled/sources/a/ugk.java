package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ugk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugk f35628a;
    public static final ugk b;
    public static final ugk c;
    public static final ugk d;
    public static final /* synthetic */ ugk[] e;

    static {
        ugk ugkVar = new ugk("PHONE", 0);
        f35628a = ugkVar;
        ugk ugkVar2 = new ugk("TABLET", 1);
        b = ugkVar2;
        ugk ugkVar3 = new ugk("FOLDABLE", 2);
        c = ugkVar3;
        ugk ugkVar4 = new ugk("OTHER", 3);
        d = ugkVar4;
        e = new ugk[]{ugkVar, ugkVar2, ugkVar3, ugkVar4};
    }

    public static ugk valueOf(String str) {
        return (ugk) Enum.valueOf(ugk.class, str);
    }

    public static ugk[] values() {
        return (ugk[]) e.clone();
    }
}
