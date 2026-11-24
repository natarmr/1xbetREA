package a;

import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.kh3[], still in use, count: 1, list:
  (r0v1 a.kh3[]) from 0x0087: CONSTRUCTOR (r0v1 a.kh3[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:136) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes3.dex */
public final class kh3 {
    RESOLVE(qsf0.e, "resolve"),
    CONFIG(gsd.h, "remoteAppConfig"),
    CHECK_GEO(c3c.d, "geo"),
    SPORT_DICTIONARY(f5l0.f, "sportDictionary"),
    COUNTRIES_DICTIONARY(upe.e, "countriesDictionary"),
    USER(hst0.e, "user"),
    STRINGS(utm0.d, "strings"),
    USER_CONSENT(yqt0.d, "requestUserConsent"),
    OTHER(tc80.i, "other");

    public static final /* synthetic */ c0o m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18270a;
    public final String b;

    static {
        m = new c0o(kh3VarArr);
    }

    public kh3(c0o c0oVar, String str) {
        super(str, i);
        this.f18270a = c0oVar;
        this.b = str;
    }

    public static kh3 valueOf(String str) {
        return (kh3) Enum.valueOf(kh3.class, str);
    }

    public static kh3[] values() {
        return (kh3[]) l.clone();
    }
}
