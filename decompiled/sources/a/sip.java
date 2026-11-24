package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bek f32274a;
    public static final sip b;
    public static final sip c;
    public static final /* synthetic */ sip[] d;

    static {
        sip sipVar = new sip("LINE", 0);
        b = sipVar;
        sip sipVar2 = new sip("LIVE", 1);
        c = sipVar2;
        d = new sip[]{sipVar, sipVar2};
        f32274a = new bek();
    }

    public static sip valueOf(String str) {
        return (sip) Enum.valueOf(sip.class, str);
    }

    public static sip[] values() {
        return (sip[]) d.clone();
    }
}
