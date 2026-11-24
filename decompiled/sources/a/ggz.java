package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ggz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ggz f11273a;
    public static final ggz b;
    public static final /* synthetic */ ggz[] c;

    static {
        ggz ggzVar = new ggz("PRIZE", 0);
        f11273a = ggzVar;
        ggz ggzVar2 = new ggz("HLTV", 1);
        b = ggzVar2;
        c = new ggz[]{ggzVar, ggzVar2};
    }

    public static ggz valueOf(String str) {
        return (ggz) Enum.valueOf(ggz.class, str);
    }

    public static ggz[] values() {
        return (ggz[]) c.clone();
    }
}
