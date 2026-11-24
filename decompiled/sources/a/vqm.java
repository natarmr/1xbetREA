package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vqm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vqm f37862a;
    public static final vqm b;
    public static final vqm c;
    public static final vqm d;
    public static final /* synthetic */ vqm[] e;

    static {
        vqm vqmVar = new vqm("PRIMARY", 0);
        f37862a = vqmVar;
        vqm vqmVar2 = new vqm("LIGHT", 1);
        b = vqmVar2;
        vqm vqmVar3 = new vqm("DARK", 2);
        c = vqmVar3;
        vqm vqmVar4 = new vqm("LIGHT40", 3);
        d = vqmVar4;
        e = new vqm[]{vqmVar, vqmVar2, vqmVar3, vqmVar4, new vqm("GAMES", 4)};
    }

    public static vqm valueOf(String str) {
        return (vqm) Enum.valueOf(vqm.class, str);
    }

    public static vqm[] values() {
        return (vqm[]) e.clone();
    }
}
