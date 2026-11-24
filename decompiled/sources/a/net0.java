package a;

/* JADX INFO: loaded from: classes.dex */
public final class net0 extends kq80 {
    public final b4x c;

    public net0(String str, rcf0 rcf0Var) {
        super(str, null, false, 1);
        this.c = b4x.o(rcf0Var);
    }

    @Override // a.kq80, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        b4x b4xVar = this.c;
        if (b4xVar.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + b4xVar;
    }
}
