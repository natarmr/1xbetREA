package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a7z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a7z f398a;
    public static final a7z b;
    public static final a7z c;
    public static final a7z d;
    public static final a7z e;
    public static final /* synthetic */ a7z[] f;

    static {
        a7z a7zVar = new a7z("Measuring", 0);
        f398a = a7zVar;
        a7z a7zVar2 = new a7z("LookaheadMeasuring", 1);
        b = a7zVar2;
        a7z a7zVar3 = new a7z("LayingOut", 2);
        c = a7zVar3;
        a7z a7zVar4 = new a7z("LookaheadLayingOut", 3);
        d = a7zVar4;
        a7z a7zVar5 = new a7z("Idle", 4);
        e = a7zVar5;
        f = new a7z[]{a7zVar, a7zVar2, a7zVar3, a7zVar4, a7zVar5};
    }

    public static a7z valueOf(String str) {
        return (a7z) Enum.valueOf(a7z.class, str);
    }

    public static a7z[] values() {
        return (a7z[]) f.clone();
    }
}
