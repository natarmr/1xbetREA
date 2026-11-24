package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ezk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ezk f8675a;
    public static final ezk b;
    public static final ezk c;
    public static final ezk d;
    public static final /* synthetic */ ezk[] e;

    static {
        ezk ezkVar = new ezk("MAIN_DOMAIN", 0);
        f8675a = ezkVar;
        ezk ezkVar2 = new ezk("STAGE_DOMAIN", 1);
        b = ezkVar2;
        ezk ezkVar3 = new ezk("GAME_STAGE_DOMAIN", 2);
        c = ezkVar3;
        ezk ezkVar4 = new ezk("LUXURY_DOMAIN", 3);
        d = ezkVar4;
        e = new ezk[]{ezkVar, ezkVar2, ezkVar3, ezkVar4};
    }

    public static ezk valueOf(String str) {
        return (ezk) Enum.valueOf(ezk.class, str);
    }

    public static ezk[] values() {
        return (ezk[]) e.clone();
    }
}
