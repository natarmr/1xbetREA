package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/mp7;", "La/yx5;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mp7 extends yx5 {
    public final s0r K1;
    public final n0o0 L1;
    public final a8z M1;
    public final phf0 N1;
    public final phf0 O1;
    public final zz2 P1;
    public final phf0 Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(mp7.class, "binding", "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentBetWithoutRiskBinding;", 0), new ez40(mp7.class, "title", "getTitle()Ljava/lang/String;", 0), new ez40(mp7.class, "bannerId", "getBannerId()Ljava/lang/String;", 0), new ez40(mp7.class, "lotteryId", "getLotteryId()I", 0), new ez40(mp7.class, "imgUrl", "getImgUrl()Ljava/lang/String;", 0)};
    public static final bj5 S1 = new bj5();

    public mp7() {
        super(R.layout.fragment_bet_without_risk);
        this.K1 = ltt0.o(this, lp7.f20427a);
        this.L1 = maz.b(new kp7(this, (byte) 0));
        this.M1 = xbc.b0(this, sre0.f32672a.b(hq7.class), new kp7(this, (byte) 1));
        this.N1 = new phf0("BANNER_TITLE_EXTRA");
        this.O1 = new phf0("BANNER_ID_EXTRA");
        this.P1 = new zz2("LOTTERY_ID_EXTRA");
        this.Q1 = new phf0("IMG_URL_EXTRA");
        this.R1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(U1[0], this);
        objN.getClass();
        h97.t(((myq) objN).b, new owp0(this), new ugd(-90747076, true, new m87(this, (byte) 5)));
    }

    @Override // a.yx5
    public final void C0() {
        wdk0 wdk0Var = ((bai) this.L1.getValue()).f2258a;
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.R1;
    }
}
