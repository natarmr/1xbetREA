package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/mug0;", "La/nw5;", "La/nug0;", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mug0 extends nw5<nug0> {
    public final cgx0 e2 = new cgx0("BUNDLE_AUTO_SALE");
    public final yzn0 f2 = new yzn0("BUNDLE_BET_HISTORY_ITEM");
    public final khf0 g2 = new khf0("BUNDLE_LAST_SALE");
    public final chf0 h2 = new chf0("BUNDLE_SALE_SUM", (byte) 13);
    public final phf0 i2 = new phf0("EXTRA_REQUEST_KEY");
    public final nae0 j2 = ltt0.p(this, kug0.f18908a);
    public fiu0 k2;
    public final kiu0 l2;
    public static final /* synthetic */ iiy[] n2 = {new ez40(mug0.class, "bundleAutoSale", "getBundleAutoSale()Z", 0), new ez40(mug0.class, "bundleItem", "getBundleItem()Lorg/xplatform/bethistory/domain/model/HistoryItemModel;", 0), new ez40(mug0.class, "bundleLastSaleData", "getBundleLastSaleData()Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;", 0), new ez40(mug0.class, "bundleSaleSum", "getBundleSaleSum()D", 0), new ez40(mug0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new j0d0(mug0.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/SaleDialogBinding;", 0)};
    public static final lme0 m2 = new lme0((byte) 11);

    public mug0() {
        a7g0 a7g0Var = new a7g0(this, (byte) 8);
        a8z a8zVarA = maz.a(wez.b, new yxf0(new yxf0(this, (byte) 9), (byte) 10));
        this.l2 = agc.G(this, sre0.f32672a.b(rug0.class), new fxf0(a8zVarA, (byte) 12), new fxf0(a8zVarA, (byte) 13), a7g0Var);
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(oug0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            oug0 oug0Var = (oug0) (ze3Var instanceof oug0 ? ze3Var : null);
            if (oug0Var != null) {
                iiy[] iiyVarArr = n2;
                n3w n3wVar = (n3w) this.f2.n(this, iiyVarArr[1]);
                Boolean boolN = this.e2.n(this, iiyVarArr[0]);
                SaleDataModel saleDataModel = (SaleDataModel) this.g2.n(this, iiyVarArr[2]);
                Double dN = this.h2.n(this, iiyVarArr[3]);
                ctf0 ctf0Var = oug0Var.f25875a;
                m1e m1eVar = oug0Var.b;
                ctf0Var.getClass();
                m1eVar.getClass();
                this.k2 = new fiu0(Collections.singletonMap(rug0.class, (fri) new xzp(ctf0Var, n3wVar, boolN, saleDataModel, dN, m1eVar).g));
                return;
            }
        }
        jf4.n(b1j.i(oug0.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent;
    }

    @Override // a.nw5
    public final String S0() {
        if (this.e2.n(this, n2[0]).booleanValue()) {
            String strH = H(R.string.confirm_autosale_title);
            strH.getClass();
            return strH;
        }
        String strH2 = H(R.string.confirm_sale_title);
        strH2.getClass();
        return strH2;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final nug0 L0() {
        Object objN = this.j2.n(n2[5], this);
        objN.getClass();
        return (nug0) objN;
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        kiu0 kiu0Var = this.l2;
        xae0 xae0VarN = vtb.N(((rug0) kiu0Var.getValue()).c);
        lug0 lug0Var = new lug0(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new kmg0(xae0VarN, clzVarW, lug0Var, (yje) null), 3);
        vae0 vae0VarM = vtb.M(((rug0) kiu0Var.getValue()).d);
        lug0 lug0Var2 = new lug0(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new kmg0(vae0VarM, clzVarW2, lug0Var2, (yje) null), 3);
        L0().b.setOnClickListener(new jpe0(this, (byte) 5));
    }
}
