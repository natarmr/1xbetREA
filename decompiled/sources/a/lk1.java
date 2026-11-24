package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lk1;", "La/yx5;", "<init>", "()V", "a/rek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lk1 extends yx5 {
    public final e9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final a8z N1;
    public final yzn0 O1;
    public final r34 P1;
    public final zz2 Q1;
    public final r34 R1;
    public final cgx0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(lk1.class, "binding", "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAggregatorPublishersBinding;", 0), new ez40(lk1.class, "bundleOpenedFromType", "getBundleOpenedFromType()Lorg/xplatform/aggregator/api/presentation/model/AggregatorPublisherGamesOpenedFromType;", 0), new ez40(lk1.class, "bundlePartitionId", "getBundlePartitionId()J", 0), new ez40(lk1.class, "bundleBonusId", "getBundleBonusId()I", 0), new ez40(lk1.class, "bundleAccountId", "getBundleAccountId()J", 0), new ez40(lk1.class, "bundleShowFavorites", "getBundleShowFavorites()Z", 0)};
    public static final rek0 U1 = new rek0((byte) 18);

    public lk1() {
        super(R.layout.fragment_aggregator_publishers);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticTransparent, 12);
        this.L1 = ltt0.o(this, kk1.f18414a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(wk1.class), new nc(this, (byte) 22));
        this.O1 = new yzn0("BUNDLE_OPENED_FROM_TYPE");
        this.P1 = new r34("PARTITION_ID");
        this.Q1 = new zz2("BONUS_ID");
        this.R1 = new r34("ACCOUNT_ID");
        this.S1 = new cgx0("SHOW_FAVORITES");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(V1[0], this);
        objN.getClass();
        b1j.t(((vxq) objN).f38213a, new ugd(141839394, true, new o00(this, (byte) 16)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(mk1.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            mk1 mk1Var = (mk1) (ze3Var instanceof mk1 ? ze3Var : null);
            if (mk1Var != null) {
                iiy[] iiyVarArr = V1;
                int iIntValue = this.Q1.n(this, iiyVarArr[3]).intValue();
                this.R1.n(this, iiyVarArr[4]);
                long jLongValue = this.P1.n(this, iiyVarArr[2]).longValue();
                this.S1.n(this, iiyVarArr[5]);
                vw3 vw3Var = new vw3(iIntValue, jLongValue, (rj1) this.O1.n(this, iiyVarArr[1]));
                ehf0 ehf0Var = mk1Var.f21921a;
                cad cadVar = mk1Var.c;
                oeg0 oeg0Var = mk1Var.g;
                duj dujVar = mk1Var.b;
                m1e m1eVar = mk1Var.d;
                s91 s91Var = mk1Var.e;
                gst0 gst0Var = mk1Var.f;
                ctf0 ctf0Var = mk1Var.h;
                ieu ieuVar = mk1Var.i;
                ntu ntuVar = mk1Var.j;
                wyu wyuVar = mk1Var.k;
                bzt bztVar = mk1Var.l;
                uyu uyuVar = mk1Var.m;
                r9u r9uVar = mk1Var.n;
                rl1 rl1Var = mk1Var.o;
                oeg0Var.getClass();
                m1eVar.getClass();
                s91Var.getClass();
                gst0Var.getClass();
                ctf0Var.getClass();
                wyuVar.getClass();
                r9uVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(wk1.class, (t5i) new v7i(cadVar, ehf0Var, oeg0Var, vw3Var, dujVar, m1eVar, ctf0Var, ieuVar, ntuVar, wyuVar, bztVar, uyuVar, r9uVar, rl1Var).o));
                return;
            }
        }
        jf4.n(b1j.i(mk1.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        hxm0.m(q0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
