package a;

/* JADX INFO: loaded from: classes2.dex */
public final enum nsb0 extends rsb0 {
    public nsb0() {
        super("ALWAYS_TRUE", 0);
    }

    @Override // a.lsb0
    public final boolean apply(Object obj) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Predicates.alwaysTrue()";
    }
}
