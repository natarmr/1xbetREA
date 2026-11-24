package a;

import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/pjx;", "La/nw5;", "La/n6q;", "<init>", "()V", "a/sqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pjx extends nw5<n6q> {
    public final phf0 e2 = new phf0("EXTRA_REQUEST_KEY");
    public final es f2 = new es("INSTRUMENT_LIST");
    public final nae0 g2 = ltt0.p(this, ojx.f25381a);
    public static final /* synthetic */ iiy[] i2 = {new ez40(pjx.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(pjx.class, "instrumentList", "getInstrumentList()Ljava/util/List;", 0), new j0d0(pjx.class, "binding", "getBinding()Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetInstrumentsDialogBinding;", 0)};
    public static final sqt h2 = new sqt();

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.g2.n(i2[2], this);
        objN.getClass();
        return (n6q) objN;
    }

    @Override // a.nw5
    public final void O0() {
        adw adwVar = new adw(this, (byte) 18);
        k4f k4fVar = new k4f();
        ((dp) k4fVar.e).b(new gbn(new v1x((byte) 17), new pkv(3, (byte) 29), new adw(adwVar, (byte) 17), btv.B));
        iiy[] iiyVarArr = i2;
        k4fVar.f = this.f2.n(this, iiyVarArr[1]);
        iiy iiyVar = iiyVarArr[2];
        nae0 nae0Var = this.g2;
        Object objN = nae0Var.n(iiyVar, this);
        objN.getClass();
        ((n6q) objN).b.setAdapter(k4fVar);
        wn8 wn8Var = new wn8(epv0.U(R.drawable.divider_with_spaces, o0()), (byte) 1);
        Object objN2 = nae0Var.n(iiyVarArr[2], this);
        objN2.getClass();
        ((n6q) objN2).b.m(wn8Var);
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent_instruments;
    }

    @Override // a.nw5
    public final String S0() {
        String strH = H(R.string.bet_type);
        strH.getClass();
        return strH;
    }
}
