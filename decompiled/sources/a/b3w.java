package a;

import android.gov.nist.core.Separators;
import android.widget.TextView;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.bethistory.domain.model.GeneralBetInfoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/b3w;", "La/nw5;", "La/c3w;", "<init>", "()V", "a/rqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b3w extends nw5<c3w> {
    public final khf0 e2 = new khf0("BUNDLE_ITEM");
    public final phf0 f2 = new phf0("BUNDLE_TITLE");
    public final nae0 g2 = ltt0.p(this, a3w.f195a);
    public static final /* synthetic */ iiy[] i2 = {new ez40(b3w.class, "bundleItem", "getBundleItem()Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;", 0), new ez40(b3w.class, "title", "getTitle()Ljava/lang/String;", 0), new j0d0(b3w.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/HistoryInfoDialogBinding;", 0)};
    public static final rqt h2 = new rqt();

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void O0() {
        TextView textView = L0().d;
        String strN = this.f2.n(this, i2[1]);
        if (strN.length() == 0) {
            strN = w6x.q(U0().b, " - ", U0().c);
        }
        textView.setText(strN);
        TextView textView2 = L0().b;
        int i = U0().f46409a;
        pn40 pn40Var = pn40.f27267a;
        double d = U0().d;
        String str = U0().g;
        p3u0 p3u0Var = p3u0.c;
        textView2.setText(i + " (" + pn40.d(d, str, p3u0Var) + Separators.RPAREN);
        L0().c.setText(pn40.d(U0().e, U0().g, p3u0Var));
        L0().e.setText(pn40.d(U0().f, U0().g, p3u0Var));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent;
    }

    @Override // a.nw5
    public final String S0() {
        String strH = H(R.string.dialog_bet_info_title);
        strH.getClass();
        return strH;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final c3w L0() {
        Object objN = this.g2.n(i2[2], this);
        objN.getClass();
        return (c3w) objN;
    }

    public final GeneralBetInfoModel U0() {
        return (GeneralBetInfoModel) this.e2.n(this, i2[0]);
    }
}
