package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jvn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pek f17210a;
    public static final jvn b;
    public static final jvn c;
    public static final jvn d;
    public static final jvn e;
    public static final jvn f;
    public static final jvn g;
    public static final /* synthetic */ jvn[] h;
    public static final /* synthetic */ c0o i;

    static {
        jvn jvnVar = new jvn("US", 0);
        b = jvnVar;
        jvn jvnVar2 = new jvn("ENG", 1);
        c = jvnVar2;
        jvn jvnVar3 = new jvn("DEC", 2);
        d = jvnVar3;
        jvn jvnVar4 = new jvn("HONG", 3);
        e = jvnVar4;
        jvn jvnVar5 = new jvn("IND", 4);
        f = jvnVar5;
        jvn jvnVar6 = new jvn("MAL", 5);
        g = jvnVar6;
        jvn[] jvnVarArr = {jvnVar, jvnVar2, jvnVar3, jvnVar4, jvnVar5, jvnVar6};
        h = jvnVarArr;
        i = new c0o(jvnVarArr);
        f17210a = new pek();
    }

    public static jvn valueOf(String str) {
        return (jvn) Enum.valueOf(jvn.class, str);
    }

    public static jvn[] values() {
        return (jvn[]) h.clone();
    }

    public final String a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "American";
        }
        if (iOrdinal == 1) {
            return "English";
        }
        if (iOrdinal == 2) {
            return "Decimal";
        }
        if (iOrdinal == 3) {
            return "HongCong";
        }
        if (iOrdinal == 4) {
            return "Indonesian";
        }
        if (iOrdinal == 5) {
            return "Malasian";
        }
        t9f.b();
        return null;
    }

    public final int getId() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 2;
        }
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 3;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 4;
                }
                if (iOrdinal == 4) {
                    return 5;
                }
                if (iOrdinal == 5) {
                    return 6;
                }
                t9f.b();
                return 0;
            }
        }
        return i2;
    }
}
