package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class jgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jgm f16488a;
    public static final jgm b;
    public static final /* synthetic */ jgm[] c;

    static {
        jgm jgmVar = new jgm("Start", 0);
        f16488a = jgmVar;
        jgm jgmVar2 = new jgm("End", 1);
        b = jgmVar2;
        c = new jgm[]{jgmVar, jgmVar2};
    }

    public static jgm valueOf(String str) {
        return (jgm) Enum.valueOf(jgm.class, str);
    }

    public static jgm[] values() {
        return (jgm[]) c.clone();
    }
}
