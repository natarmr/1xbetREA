package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.e8v0[], still in use, count: 1, list:
  (r0v1 a.e8v0[]) from 0x0080: CONSTRUCTOR (r0v1 a.e8v0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:129) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
@ahi0(with = f8v0.class)
public final class e8v0 {
    UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN),
    /* JADX INFO: Fake field, exist only in values array */
    FLYWEIGHT("FLYWEIGHT"),
    /* JADX INFO: Fake field, exist only in values array */
    BANTAMWEIGHT("BANTAMWEIGHT"),
    /* JADX INFO: Fake field, exist only in values array */
    FEATHERWEIGHT("FEATHERWEIGHT"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHTWEIGHT("LIGHTWEIGHT"),
    /* JADX INFO: Fake field, exist only in values array */
    WELTERWEIGHT("WELTERWEIGHT"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDDLEWEIGHT("MIDDLEWEIGHT"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHT_HEAVYWEIGHT("LIGHT_HEAVYWEIGHT"),
    /* JADX INFO: Fake field, exist only in values array */
    HEAVYWEIGHT("HEAVYWEIGHT"),
    /* JADX INFO: Fake field, exist only in values array */
    MENS_POUND_FOR_POUND("MENS_POUND_FOR_POUND"),
    /* JADX INFO: Fake field, exist only in values array */
    WOMENS_SW("WOMENS_SW"),
    /* JADX INFO: Fake field, exist only in values array */
    WOMENS_FLW("WOMENS_FLW"),
    /* JADX INFO: Fake field, exist only in values array */
    WOMENS_BW("WOMENS_BW"),
    /* JADX INFO: Fake field, exist only in values array */
    WOMENS_POUND_FOR_POUND("WOMENS_POUND_FOR_POUND");

    public static final d8v0 Companion = new d8v0();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7392a;

    static {
        d = new c0o(new e8v0[]{r0, new e8v0("FLYWEIGHT"), new e8v0("BANTAMWEIGHT"), new e8v0("FEATHERWEIGHT"), new e8v0("LIGHTWEIGHT"), new e8v0("WELTERWEIGHT"), new e8v0("MIDDLEWEIGHT"), new e8v0("LIGHT_HEAVYWEIGHT"), new e8v0("HEAVYWEIGHT"), new e8v0("MENS_POUND_FOR_POUND"), new e8v0("WOMENS_SW"), new e8v0("WOMENS_FLW"), new e8v0("WOMENS_BW"), new e8v0("WOMENS_POUND_FOR_POUND")});
    }

    public e8v0(String str) {
        super(str, i);
        this.f7392a = str;
    }

    public static e8v0 valueOf(String str) {
        return (e8v0) Enum.valueOf(e8v0.class, str);
    }

    public static e8v0[] values() {
        return (e8v0[]) c.clone();
    }
}
