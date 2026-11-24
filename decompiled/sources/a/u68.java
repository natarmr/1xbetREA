package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class u68 extends owq {
    public final /* synthetic */ byte b = 0;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u68(hf60 hf60Var, u99 u99Var) {
        super(u99Var);
        this.c = hf60Var;
    }

    @Override // a.owq, a.emk0
    public final long Y(f99 f99Var, long j) throws Exception {
        switch (this.b) {
            case 0:
                try {
                    return super.Y(f99Var, j);
                } catch (Exception e) {
                    this.c = e;
                    throw e;
                }
            default:
                try {
                    return super.Y(f99Var, j);
                } catch (IOException e2) {
                    ((hf60) this.c).d = e2;
                    throw e2;
                }
        }
    }

    public /* synthetic */ u68(emk0 emk0Var) {
        super(emk0Var);
    }
}
