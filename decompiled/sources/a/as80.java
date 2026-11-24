package a;

import android.app.Application;
import android.os.Bundle;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/as80;", "La/yx5;", "La/d1j;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class as80 extends yx5 implements d1j {
    public final wtq K1;
    public final e9o0 L1;
    public final s0r M1;
    public fiu0 N1;
    public ii O1;
    public wdk0 P1;
    public ynb Q1;
    public final khf0 R1;
    public final cu S1;
    public final cu U1;
    public final phf0 V1;
    public final kiu0 W1;
    public final boolean X1;
    public static final /* synthetic */ iiy[] Z1 = {new j0d0(as80.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentPartTypeOneBinding;", 0), new ez40(as80.class, "aggregatorScreenModel", "getAggregatorScreenModel()Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;", 0), new ez40(as80.class, "chosenFilters", "getChosenFilters()[J", 0), new ez40(as80.class, "chosenProviders", "getChosenProviders()[J", 0), new ez40(as80.class, "uniqueID", "getUniqueID()Ljava/lang/String;", 0)};
    public static final fl70 Y1 = new fl70();

    public as80() {
        super(R.layout.fragment_part_type_one);
        this.K1 = wtq.f39753a;
        this.L1 = new e9o0(R.attr.uikitBackgroundContent, R.attr.uikitBackgroundContent, 12);
        this.M1 = ltt0.o(this, zr80.f44841a);
        this.R1 = new khf0("AGGREGATOR_SCREEN_ITEM");
        this.S1 = new cu("AGGREGATOR_CHOSEN_FILTERS_ID");
        this.U1 = new cu("AGGREGATOR_CHOSEN_PROVIDERS_ID");
        this.V1 = new phf0("AGGREGATOR_ITEM_UNIQ_ID");
        xr80 xr80Var = new xr80(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 28), (byte) 29));
        this.W1 = agc.G(this, sre0.f32672a.b(jt80.class), new ph70(a8zVarA, (byte) 26), new ph70(a8zVarA, (byte) 27), xr80Var);
        this.X1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        bdx.O(n0().k(), K(), new yr80(this, (byte) 0));
        LinkedHashMap linkedHashMap = uo0.f35987a;
        iiy[] iiyVarArr = Z1;
        String strN = this.V1.n(this, iiyVarArr[4]);
        strN.getClass();
        uo0.c = strN;
        n0().r().u0("GAME_CLOSED_KEY", this, new ex60(this, (byte) 6));
        ccq0.T(this, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY", new xr80(this, (byte) 1));
        Object objN = this.M1.n(iiyVarArr[0], this);
        objN.getClass();
        pkd.h(((q2r) objN).b, new owp0(this), null, new ugd(632014627, true, new tx(this, (byte) 29)));
        jt80 jt80VarH0 = H0();
        AggregatorScreenModel aggregatorScreenModelG0 = G0();
        long j = G0().c;
        iiy iiyVar = iiyVarArr[2];
        cu cuVar = this.S1;
        px3 px3Var = new px3(cuVar.n(this, iiyVar), (byte) 1);
        iiy iiyVar2 = iiyVarArr[3];
        cu cuVar2 = this.U1;
        jt80VarH0.x(new vq80(aggregatorScreenModelG0, new r3q(j, px3Var, new px3(cuVar2.n(this, iiyVar2), (byte) 1), G0().g)));
        cuVar2.r(this, iiyVarArr[3], new long[0]);
        cuVar.r(this, iiyVarArr[2], new long[0]);
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = uo0.f35987a;
        String strN = this.V1.n(this, Z1[4]);
        strN.getClass();
        uo0.c = strN;
        long j = G0().c;
        hgh0 hgh0Var = new hgh0(r7x.B(uzb0.f36529a));
        Application application = n0().getApplication();
        application.getClass();
        n7i n7iVarB = uo0.b(j, hgh0Var, application);
        this.N1 = new fiu0(Collections.singletonMap(jt80.class, n7iVarB.Z));
        this.O1 = n7iVarB.T;
        this.P1 = n7iVarB.U;
        ynb ynbVarI = ((yzn0) n7iVarB.V.b).i();
        x1x.x(ynbVarI);
        this.Q1 = ynbVarI;
    }

    public final AggregatorScreenModel G0() {
        return (AggregatorScreenModel) this.R1.n(this, Z1[1]);
    }

    public final jt80 H0() {
        return (jt80) this.W1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().x(wq80.f39578a);
    }

    @Override // a.d1j
    /* JADX INFO: renamed from: i, reason: from getter */
    public final wtq getK1() {
        return this.K1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.X1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.L1;
    }
}
