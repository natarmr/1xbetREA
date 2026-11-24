package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hgm f13022a;
    public static final hgm b;
    public static final hgm c;
    public static final hgm d;
    public static final /* synthetic */ hgm[] e;

    static {
        hgm hgmVar = new hgm("Victory", 0);
        f13022a = hgmVar;
        hgm hgmVar2 = new hgm("Defeat", 1);
        b = hgmVar2;
        hgm hgmVar3 = new hgm("Draw", 2);
        c = hgmVar3;
        hgm hgmVar4 = new hgm("None", 3);
        d = hgmVar4;
        e = new hgm[]{hgmVar, hgmVar2, hgmVar3, hgmVar4};
    }

    public static hgm valueOf(String str) {
        return (hgm) Enum.valueOf(hgm.class, str);
    }

    public static hgm[] values() {
        return (hgm[]) e.clone();
    }
}
