package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ajr {
    public static final zir Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f990a;
    public static final ajr b;
    public static final ajr c;
    public static final ajr d;
    public static final /* synthetic */ ajr[] e;

    static {
        ajr ajrVar = new ajr("Dark", 0);
        b = ajrVar;
        ajr ajrVar2 = new ajr("Light", 1);
        c = ajrVar2;
        ajr ajrVar3 = new ajr("Night", 2);
        d = ajrVar3;
        e = new ajr[]{ajrVar, ajrVar2, ajrVar3};
        Companion = new zir();
        f990a = maz.a(wez.f39042a, new s9r((byte) 17));
    }

    public static ajr valueOf(String str) {
        return (ajr) Enum.valueOf(ajr.class, str);
    }

    public static ajr[] values() {
        return (ajr[]) e.clone();
    }
}
