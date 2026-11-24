package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class yxo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yxo f43432a;
    public static final yxo b;
    public static final yxo c;
    public static final /* synthetic */ yxo[] d;

    static {
        yxo yxoVar = new yxo("OLD_PASSWORD", 0);
        f43432a = yxoVar;
        yxo yxoVar2 = new yxo("NEW_PASSWORD", 1);
        b = yxoVar2;
        yxo yxoVar3 = new yxo("REPEAT_PASSWORD", 2);
        c = yxoVar3;
        d = new yxo[]{yxoVar, yxoVar2, yxoVar3};
    }

    public static yxo valueOf(String str) {
        return (yxo) Enum.valueOf(yxo.class, str);
    }

    public static yxo[] values() {
        return (yxo[]) d.clone();
    }
}
