package a;

import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ure;", "La/u0i;", "<init>", "()V", "a/usd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ure extends u0i {
    public final phf0 f2 = new phf0("EXTRA_REQUEST_KEY");
    public final yzn0 g2 = new yzn0("EXTRA_SINGLE_BET_GAME");
    public final yzn0 h2 = new yzn0("EXTRA_BET_ZIP");
    public static final /* synthetic */ iiy[] j2 = {new ez40(ure.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(ure.class, "game", "getGame()Lorg/xplatform/betting/core/coupon/models/SingleBetGame;", 0), new ez40(ure.class, "bet", "getBet()Lorg/xplatform/betting/core/coupon/models/SimpleBetZip;", 0)};
    public static final usd i2 = new usd();

    @Override // a.u0i
    public final void N0() {
        iiy[] iiyVarArr = j2;
        iiy iiyVar = iiyVarArr[0];
        phf0 phf0Var = this.f2;
        vcc.f0(i120.V(new Pair(phf0Var.n(this, iiyVarArr[0]), new nre(hwe.b, (zxj0) this.h2.n(this, iiyVarArr[2]), (m0k0) this.g2.n(this, iiyVarArr[1])))), this, phf0Var.n(this, iiyVar));
        y0();
    }

    @Override // a.u0i
    public final void O0() {
        iiy[] iiyVarArr = j2;
        iiy iiyVar = iiyVarArr[0];
        phf0 phf0Var = this.f2;
        vcc.f0(i120.V(new Pair(phf0Var.n(this, iiyVarArr[0]), new nre(hwe.f13766a, (zxj0) this.h2.n(this, iiyVarArr[2]), (m0k0) this.g2.n(this, iiyVarArr[1])))), this, phf0Var.n(this, iiyVar));
        y0();
    }
}
