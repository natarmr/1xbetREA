package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class m1p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1p f21019a;
    public static final m1p b;
    public static final m1p c;
    public static final m1p d;
    public static final m1p e;
    public static final m1p f;
    public static final m1p g;
    public static final m1p h;
    public static final m1p i;
    public static final /* synthetic */ m1p[] j;

    static {
        m1p m1pVar = new m1p("S1", 0);
        f21019a = m1pVar;
        m1p m1pVar2 = new m1p("S2", 1);
        b = m1pVar2;
        m1p m1pVar3 = new m1p("S3", 2);
        c = m1pVar3;
        m1p m1pVar4 = new m1p("I1", 3);
        d = m1pVar4;
        m1p m1pVar5 = new m1p("I2", 4);
        e = m1pVar5;
        m1p m1pVar6 = new m1p("I3", 5);
        f = m1pVar6;
        m1p m1pVar7 = new m1p("F1", 6);
        g = m1pVar7;
        m1p m1pVar8 = new m1p("F2", 7);
        h = m1pVar8;
        m1p m1pVar9 = new m1p("F3", 8);
        i = m1pVar9;
        j = new m1p[]{m1pVar, m1pVar2, m1pVar3, m1pVar4, m1pVar5, m1pVar6, m1pVar7, m1pVar8, m1pVar9};
    }

    public static m1p valueOf(String str) {
        return (m1p) Enum.valueOf(m1p.class, str);
    }

    public static m1p[] values() {
        return (m1p[]) j.clone();
    }
}
