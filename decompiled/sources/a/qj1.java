package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qj1;", "La/yx5;", "<init>", "()V", "a/qek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qj1 extends yx5 {
    public fiu0 K1;
    public ii L1;
    public q5j M1;
    public wdk0 N1;
    public final kiu0 O1;
    public final s0r P1;
    public final r34 Q1;
    public final r34 R1;
    public final phf0 S1;
    public final zz2 U1;
    public final yzn0 V1;
    public final cgx0 W1;
    public static final /* synthetic */ iiy[] Y1 = {new j0d0(qj1.class, "binding", "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentPublisherGamesBinding;", 0), new ez40(qj1.class, "partitionId", "getPartitionId()J", 0), new ez40(qj1.class, "productId", "getProductId()J", 0), new ez40(qj1.class, "title", "getTitle()Ljava/lang/String;", 0), new ez40(qj1.class, "subCategoryId", "getSubCategoryId()I", 0), new ez40(qj1.class, "openedFromType", "getOpenedFromType()Lorg/xplatform/aggregator/api/presentation/model/AggregatorPublisherGamesOpenedFromType;", 0), new ez40(qj1.class, "showNavBar", "getShowNavBar()Z", 0)};
    public static final qek0 X1 = new qek0();

    public qj1() {
        super(R.layout.fragment_publisher_games);
        nc ncVar = new nc(this, (byte) 21);
        a8z a8zVarA = maz.a(wez.b, new f80(new f80(this, (byte) 8), (byte) 9));
        this.O1 = agc.G(this, sre0.f32672a.b(bk1.class), new t51(a8zVarA, (byte) 2), new t51(a8zVarA, (byte) 3), ncVar);
        this.P1 = ltt0.o(this, pj1.f27066a);
        this.Q1 = new r34("BUNDLE_PARTITION");
        this.R1 = new r34("BUNDLE_PRODUCT");
        this.S1 = new phf0("BUNDLE_TITLE");
        this.U1 = new zz2("BUNDLE_SUB_CATEGORY");
        this.V1 = new yzn0("BUNDLE_OPENED_FROM_TYPE");
        this.W1 = new cgx0("BUNDLE_SHOW_NAV_BAR");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.P1.n(Y1[0], this);
        objN.getClass();
        pkd.h(((j3r) objN).f15850a, new owp0(this), null, new ugd(1797333094, true, new tx(this, (byte) 4)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(oj1.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            oj1 oj1Var = (oj1) (ze3Var instanceof oj1 ? ze3Var : null);
            if (oj1Var != null) {
                iiy[] iiyVarArr = Y1;
                Long lN = this.Q1.n(this, iiyVarArr[1]);
                Long lN2 = this.R1.n(this, iiyVarArr[2]);
                rj1 rj1Var = (rj1) this.V1.n(this, iiyVarArr[5]);
                Integer numN = this.U1.n(this, iiyVarArr[4]);
                u58 u58Var = oj1Var.b;
                ehf0 ehf0Var = oj1Var.f25338a;
                cad cadVar = oj1Var.i;
                oeg0 oeg0Var = oj1Var.j;
                gii0 gii0Var = oj1Var.c;
                r9u r9uVar = oj1Var.d;
                ii iiVar = oj1Var.l;
                m1e m1eVar = oj1Var.e;
                wsf0 wsf0Var = oj1Var.g;
                s91 s91Var = oj1Var.f;
                duj dujVar = oj1Var.h;
                ctf0 ctf0Var = oj1Var.k;
                ntu ntuVar = oj1Var.m;
                pru pruVar = oj1Var.n;
                cyu cyuVar = oj1Var.o;
                gst0 gst0Var = oj1Var.p;
                wdk0 wdk0Var = oj1Var.q;
                ix0 ix0Var = oj1Var.r;
                lrc lrcVar = oj1Var.s;
                nr00 nr00Var = oj1Var.t;
                poq0 poq0Var = oj1Var.u;
                b4j b4jVar = oj1Var.v;
                je jeVar = oj1Var.w;
                peg0 peg0Var = oj1Var.x;
                ytt yttVar = oj1Var.y;
                ba50 ba50Var = oj1Var.z;
                iiVar.getClass();
                oeg0Var.getClass();
                gii0Var.getClass();
                r9uVar.getClass();
                m1eVar.getClass();
                s91Var.getClass();
                ctf0Var.getClass();
                gst0Var.getClass();
                wdk0Var.getClass();
                ba50Var.getClass();
                t7i t7iVar = new t7i(cadVar, ehf0Var, wsf0Var, lrcVar, nr00Var, poq0Var, peg0Var, iiVar, oeg0Var, u58Var, m1eVar, lN, lN2, rj1Var, numN, dujVar, ctf0Var, ntuVar, pruVar, cyuVar, gst0Var, wdk0Var, ix0Var, b4jVar, jeVar, yttVar);
                iyk iykVar = new iyk(2);
                iykVar.b(bk1.class, (r5i) t7iVar.x);
                iykVar.b(yb0.class, (r5i) t7iVar.y);
                this.K1 = new fiu0(iykVar.a());
                this.L1 = iiVar;
                this.M1 = new q5j();
                this.N1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(oj1.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        if (((rj1) this.V1.n(this, Y1[5])) != rj1.f30569a) {
            ((bk1) this.O1.getValue()).x(s7d0.f31745a);
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        if (((rj1) this.V1.n(this, Y1[5])) != rj1.f30569a) {
            ((bk1) this.O1.getValue()).x(t7d0.f33461a);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getR1() {
        return this.W1.n(this, Y1[6]).booleanValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return new e9o0(R.attr.uikitStaticTransparent, getR1() ? R.attr.uikitBackgroundContent : R.attr.uikitStaticTransparent, 12);
    }
}
