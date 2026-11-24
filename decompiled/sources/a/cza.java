package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cza f5216a;
    public static final cza b;
    public static final cza c;
    public static final /* synthetic */ cza[] d;

    static {
        cza czaVar = new cza("FIRST", 0);
        f5216a = czaVar;
        cza czaVar2 = new cza("SECOND", 1);
        b = czaVar2;
        cza czaVar3 = new cza("COMPANY", 2);
        c = czaVar3;
        d = new cza[]{czaVar, czaVar2, czaVar3};
    }

    public static cza valueOf(String str) {
        return (cza) Enum.valueOf(cza.class, str);
    }

    public static cza[] values() {
        return (cza[]) d.clone();
    }
}
