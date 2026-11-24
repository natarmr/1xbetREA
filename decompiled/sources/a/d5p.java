package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d5p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d5p f5518a;
    public static final d5p b;
    public static final /* synthetic */ d5p[] c;

    static {
        d5p d5pVar = new d5p("TEAM", 0);
        f5518a = d5pVar;
        d5p d5pVar2 = new d5p("CHAMPIONSHIP", 1);
        b = d5pVar2;
        c = new d5p[]{d5pVar, d5pVar2};
    }

    public static d5p valueOf(String str) {
        return (d5p) Enum.valueOf(d5p.class, str);
    }

    public static d5p[] values() {
        return (d5p[]) c.clone();
    }
}
