package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class m9t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m9t f21427a;
    public static final m9t b;
    public static final m9t c;
    public static final m9t d;
    public static final m9t e;
    public static final /* synthetic */ m9t[] f;

    static {
        m9t m9tVar = new m9t("EMPTY", 0);
        f21427a = m9tVar;
        m9t m9tVar2 = new m9t("START", 1);
        b = m9tVar2;
        m9t m9tVar3 = new m9t("BONUS_ICONS_ANIMATION", 2);
        c = m9tVar3;
        m9t m9tVar4 = new m9t("ANIMATION", 3);
        d = m9tVar4;
        m9t m9tVar5 = new m9t("SHOW_TOOLTIP", 4);
        e = m9tVar5;
        f = new m9t[]{m9tVar, m9tVar2, m9tVar3, m9tVar4, m9tVar5};
    }

    public static m9t valueOf(String str) {
        return (m9t) Enum.valueOf(m9t.class, str);
    }

    public static m9t[] values() {
        return (m9t[]) f.clone();
    }
}
