package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lex0 extends cgx0 {
    public final o0x0 f;

    public /* synthetic */ lex0(o0x0 o0x0Var) {
        super(false, null, null, (byte) 0);
        this.f = o0x0Var;
    }

    @Override // a.cgx0
    public final String y() {
        try {
            return (String) this.f.call();
        } catch (Exception e) {
            ohq.p(e);
            return null;
        }
    }
}
