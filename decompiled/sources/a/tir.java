package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class tir {
    public static final sir Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f34019a;
    public static final tir b;
    public static final /* synthetic */ tir[] c;

    static {
        tir tirVar = new tir("Started", 0);
        b = tirVar;
        c = new tir[]{tirVar, new tir("Finished", 1)};
        Companion = new sir();
        f34019a = maz.a(wez.f39042a, new s9r((byte) 15));
    }

    public static tir valueOf(String str) {
        return (tir) Enum.valueOf(tir.class, str);
    }

    public static tir[] values() {
        return (tir[]) c.clone();
    }
}
