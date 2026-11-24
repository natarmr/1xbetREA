package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class sxr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ sxr0[] f32993a = {new sxr0("WINNER", 0), new sxr0("LOSER", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    sxr0 EF5;

    public static sxr0 valueOf(String str) {
        return (sxr0) Enum.valueOf(sxr0.class, str);
    }

    public static sxr0[] values() {
        return (sxr0[]) f32993a.clone();
    }
}
