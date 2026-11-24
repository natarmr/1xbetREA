package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qic f28784a;
    public static final qic b;
    public static final qic c;
    public static final /* synthetic */ qic[] d;

    static {
        qic qicVar = new qic("HIGHER", 0);
        f28784a = qicVar;
        qic qicVar2 = new qic("LOWER", 1);
        b = qicVar2;
        qic qicVar3 = new qic("UNCHOSEN", 2);
        c = qicVar3;
        d = new qic[]{qicVar, qicVar2, qicVar3};
    }

    public static qic valueOf(String str) {
        return (qic) Enum.valueOf(qic.class, str);
    }

    public static qic[] values() {
        return (qic[]) d.clone();
    }
}
