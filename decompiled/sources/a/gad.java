package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class gad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gad f10960a;
    public static final gad b;
    public static final gad c;
    public static final /* synthetic */ gad[] d;

    static {
        gad gadVar = new gad("FIRST_TEAM", 0);
        f10960a = gadVar;
        gad gadVar2 = new gad("SECOND_TEAM", 1);
        b = gadVar2;
        gad gadVar3 = new gad("NONE", 2);
        c = gadVar3;
        d = new gad[]{gadVar, gadVar2, gadVar3};
    }

    public static gad valueOf(String str) {
        return (gad) Enum.valueOf(gad.class, str);
    }

    public static gad[] values() {
        return (gad[]) d.clone();
    }
}
