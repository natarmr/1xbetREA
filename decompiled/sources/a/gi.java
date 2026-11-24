package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class gi {
    public static final fi Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f11322a;
    public static final gi b;
    public static final gi c;
    public static final gi d;
    public static final gi e;
    public static final /* synthetic */ gi[] f;

    static {
        gi giVar = new gi("FIRST", 0);
        b = giVar;
        gi giVar2 = new gi("SECOND", 1);
        c = giVar2;
        gi giVar3 = new gi("THIRD", 2);
        d = giVar3;
        gi giVar4 = new gi("CHECK_BOX", 3);
        e = giVar4;
        f = new gi[]{giVar, giVar2, giVar3, giVar4};
        Companion = new fi();
        f11322a = maz.a(wez.f39042a, new q8((byte) 7));
    }

    public static gi valueOf(String str) {
        return (gi) Enum.valueOf(gi.class, str);
    }

    public static gi[] values() {
        return (gi[]) f.clone();
    }
}
