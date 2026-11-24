package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/ebj;", "La/stl;", "La/lik;", "<init>", "()V", "a/usd", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ebj extends stl<lik> {
    public final nae0 g2 = new pmi(this, dbj.f5807a);
    public final phf0 h2 = new phf0("ERROR_MESSAGE_KEY");
    public static final /* synthetic */ iiy[] j2 = {new j0d0(ebj.class, "binding", "getBinding()Lorg/xplatform/registration/core/databinding/DialogDataRetrievalErrorBinding;", 0), new ez40(ebj.class, "errorMessage", "getErrorMessage()Ljava/lang/String;", 0)};
    public static final usd i2 = new usd();

    @Override // a.stl
    public final yfu0 Q0() {
        Object objN = this.g2.n(j2[0], this);
        objN.getClass();
        return (lik) objN;
    }

    @Override // a.stl
    public final void S0() {
        iiy[] iiyVarArr = j2;
        Object objN = this.g2.n(iiyVarArr[0], this);
        objN.getClass();
        ((lik) objN).b.setText(this.h2.n(this, iiyVarArr[1]));
    }
}
