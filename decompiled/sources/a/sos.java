package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class sos {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sos f32559a;
    public static final sos b;
    public static final sos c;
    public static final /* synthetic */ sos[] d;

    static {
        sos sosVar = new sos("FINISH", 0);
        f32559a = sosVar;
        sos sosVar2 = new sos("NOT_FOUND", 1);
        b = sosVar2;
        sos sosVar3 = new sos("ERROR", 2);
        c = sosVar3;
        d = new sos[]{sosVar, sosVar2, sosVar3};
    }

    public static sos valueOf(String str) {
        return (sos) Enum.valueOf(sos.class, str);
    }

    public static sos[] values() {
        return (sos[]) d.clone();
    }
}
