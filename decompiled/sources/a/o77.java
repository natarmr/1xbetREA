package a;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/o77;", "La/nw5;", "La/r77;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o77 extends nw5<r77> {
    public final es e2 = new es("BUNDLE_BET_HISTORY_TYPE_LIST");
    public final cgx0 f2 = new cgx0("HIDE_HISTORY");
    public final phf0 g2 = new phf0("BUNDLE_TOTO_NAME");
    public final phf0 h2 = new phf0("BUNDLE_REQUEST_KEY");
    public final yzn0 i2 = new yzn0("TYPE_HISTORY_SCREEN");
    public final nae0 j2 = ltt0.p(this, n77.f23027a);
    public static final /* synthetic */ iiy[] l2 = {new ez40(o77.class, "betHistoryTypesList", "getBetHistoryTypesList()Ljava/util/List;", 0), new ez40(o77.class, "hasHistoryHide", "getHasHistoryHide()Z", 0), new ez40(o77.class, "totoName", "getTotoName()Ljava/lang/String;", 0), new ez40(o77.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(o77.class, "typeHistoryScreen", "getTypeHistoryScreen()Lorg/xplatform/bethistory/domain/model/TypeHistoryScreen;", 0), new j0d0(o77.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/BetHistoryTypeDialogNewBinding;", 0)};
    public static final kl5 k2 = new kl5();

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void O0() {
        Object next;
        iiy[] iiyVarArr = l2;
        iiy iiyVar = iiyVarArr[0];
        es esVar = this.e2;
        Iterator it = esVar.n(this, iiyVar).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((m77) next).b);
        m77 m77Var = (m77) next;
        s77 s77Var = m77Var != null ? m77Var.f21305a : null;
        int i = 8;
        if (s77Var != null) {
            LinearLayout linearLayout = L0().c;
            if (s77Var == s77.EVENTS && this.f2.n(this, iiyVarArr[1]).booleanValue()) {
                i = 0;
            }
            linearLayout.setVisibility(i);
            dyb.O(L0().c, new os5(this, (byte) 20));
        } else {
            L0().e.setVisibility(8);
        }
        q77 q77Var = new q77(esVar.n(this, iiyVarArr[0]), this.g2.n(this, iiyVarArr[2]), new ur6(1, this, o77.class, "onItemClick", "onItemClick(Lorg/xplatform/bethistory/history/presentation/dialog/BetHistoryTypeData;)V", 0, (byte) 22), (sys0) this.i2.n(this, iiyVarArr[4]));
        L0().d.setLayoutManager(new LinearLayoutManager(B()));
        L0().d.setAdapter(q77Var);
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.rootBetHistoryTypeDialog;
    }

    @Override // a.nw5
    public final String S0() {
        String string = G().getString(R.string.history_type_title);
        string.getClass();
        return string;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final r77 L0() {
        Object objN = this.j2.n(l2[5], this);
        objN.getClass();
        return (r77) objN;
    }
}
