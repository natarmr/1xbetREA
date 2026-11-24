package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class rsb0 implements lsb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nsb0 f31024a;
    public static final /* synthetic */ rsb0[] b;

    static {
        nsb0 nsb0Var = new nsb0();
        f31024a = nsb0Var;
        b = new rsb0[]{nsb0Var, new rsb0() { // from class: a.osb0
            @Override // a.lsb0
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new rsb0() { // from class: a.psb0
            @Override // a.lsb0
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new rsb0() { // from class: a.qsb0
            @Override // a.lsb0
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static rsb0 valueOf(String str) {
        return (rsb0) Enum.valueOf(rsb0.class, str);
    }

    public static rsb0[] values() {
        return (rsb0[]) b.clone();
    }
}
