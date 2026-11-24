package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lso extends p4 {
    public final kp9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lso(kp9 kp9Var, wsy wsyVar) {
        super(wsyVar);
        if (wsyVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.c = kp9Var;
    }

    @Override // a.p4
    public final String toString() {
        return getType() + ": Ext {" + this.c + "}";
    }
}
