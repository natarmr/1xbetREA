package a;

import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/fit;", "La/iw5;", "<init>", "()V", "a/ddk", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fit extends iw5 {
    public final phf0 k2 = new phf0("EXTRA_REQUEST_KEY_TYPE");
    public final lhf0 l2 = new lhf0("EXTRA_REQUEST_COUPON_ID", (byte) 7);
    public static final /* synthetic */ iiy[] n2 = {new ez40(fit.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(fit.class, "generateCouponTypeUiModelList", "getGenerateCouponTypeUiModelList()Ljava/util/List;", 0)};
    public static final ddk m2 = new ddk();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-80513415);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), wha0.c, (ugd) null, u1c.M(21520682, new z30((Object) this, this.l2.n(this, n2[1]).size() - 1, (byte) 3), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0(int i) {
        iiy[] iiyVarArr = n2;
        iiy iiyVar = iiyVarArr[0];
        phf0 phf0Var = this.k2;
        if (phf0Var.n(this, iiyVar).length() > 0) {
            vcc.f0(i120.V(new Pair(phf0Var.n(this, iiyVarArr[0]), Integer.valueOf(i))), this, phf0Var.n(this, iiyVarArr[0]));
        }
        y0();
    }
}
