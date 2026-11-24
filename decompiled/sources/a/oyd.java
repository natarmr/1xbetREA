package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/oyd;", "La/nw5;", "La/pyd;", "<init>", "()V", "a/std", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oyd extends nw5<pyd> {
    public final yzn0 e2 = new yzn0("BUNDLE_HISTORY_ITEM");
    public final chf0 f2 = new chf0((Object) "BUNDLE_SALE_SUM", (byte) 13);
    public final phf0 g2 = new phf0("EXTRA_REQUEST_KEY");
    public fiu0 h2;
    public final kiu0 i2;
    public final nae0 j2;
    public static final /* synthetic */ iiy[] l2 = {new ez40(oyd.class, "bundleItem", "getBundleItem()Lorg/xplatform/bethistory/domain/model/HistoryItemModel;", 0), new ez40(oyd.class, "bundleSaleSum", "getBundleSaleSum()D", 0), new ez40(oyd.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new j0d0(oyd.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/ConfirmSaleDialogBinding;", 0)};
    public static final std k2 = new std();

    public oyd() {
        jwd jwdVar = new jwd(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new svc(new svc(this, (byte) 10), (byte) 11));
        this.i2 = agc.G(this, sre0.f32672a.b(syd.class), new wpb(a8zVarA, (byte) 18), new wpb(a8zVarA, (byte) 19), jwdVar);
        this.j2 = ltt0.p(this, myd.f22598a);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(lyd.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            lyd lydVar = (lyd) (ze3Var instanceof lyd ? ze3Var : null);
            if (lydVar != null) {
                iiy[] iiyVarArr = l2;
                n3w n3wVar = (n3w) this.e2.n(this, iiyVarArr[0]);
                Double dN = this.f2.n(this, iiyVarArr[1]);
                ctf0 ctf0Var = lydVar.f20856a;
                ctf0Var.getClass();
                this.h2 = new fiu0(Collections.singletonMap(syd.class, (uci) new mii0(ctf0Var, n3wVar, dN).e));
                return;
            }
        }
        jf4.n(b1j.i(lyd.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent;
    }

    @Override // a.nw5
    public final String S0() {
        String strH = H(R.string.confirm_sale_title);
        strH.getClass();
        return strH;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final pyd L0() {
        Object objN = this.j2.n(l2[3], this);
        objN.getClass();
        return (pyd) objN;
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        kiu0 kiu0Var = this.i2;
        xae0 xae0VarN = vtb.N(((syd) kiu0Var.getValue()).c);
        yje yjeVar = null;
        nyd nydVar = new nyd(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cxd(xae0VarN, clzVarW, nydVar, (yje) null), 3);
        vae0 vae0VarM = vtb.M(((syd) kiu0Var.getValue()).d);
        nyd nydVar2 = new nyd(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cxd(vae0VarM, clzVarW2, nydVar2, (yje) null), 3);
        L0().b.setOnClickListener(new q10(this, (byte) 11));
    }
}
