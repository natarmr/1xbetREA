package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineListParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ptk;", "La/yx5;", "<init>", "()V", "a/ddk", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ptk extends yx5 {
    public vqc K1;
    public fiu0 L1;
    public final boolean M1;
    public final khf0 N1;
    public final kiu0 O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final z9f R1;
    public final a8z S1;
    public static final /* synthetic */ iiy[] V1 = {new ez40(ptk.class, "params", "getParams()Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;", 0), new j0d0(ptk.class, "binding", "getBinding()Lorg/xplatform/cyber/section/impl/databinding/CybergamesFragmentDisciplineListBinding;", 0)};
    public static final ddk U1 = new ddk();

    public ptk() {
        super(R.layout.cybergames_fragment_discipline_list);
        final byte b = 1;
        this.M1 = true;
        this.N1 = new khf0("params");
        final byte b2 = 0;
        Function0 function0 = new Function0(this) { // from class: a.mtk
            public final /* synthetic */ ptk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                ptk ptkVar = this.b;
                switch (b3) {
                    case 0:
                        fiu0 fiu0Var = ptkVar.L1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        z9f z9fVar = ptkVar.R1;
                        z9fVar.getClass();
                        ltk ltkVar = new ltk();
                        ltkVar.d.b(new gbn(new svj((byte) 14), new e9k(3, (byte) 5), new iok(z9fVar, (byte) 0), zdh.r));
                        return ltkVar;
                }
            }
        };
        v9k v9kVar = new v9k(this, (byte) 16);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new v9k(v9kVar, (byte) 17));
        tre0 tre0Var = sre0.f32672a;
        this.O1 = agc.G(this, tre0Var.b(xtk.class), new b9k(a8zVarA, (byte) 6), new b9k(a8zVarA, (byte) 7), function0);
        a8z a8zVarA2 = maz.a(wezVar, new v9k(new wej(0, this, ptk.class, "requireParentFragment", "requireParentFragment()Landroidx/fragment/app/Fragment;", 0, (byte) 8), (byte) 18));
        this.P1 = agc.G(this, tre0Var.b(luk.class), new b9k(a8zVarA2, (byte) 8), new b9k(a8zVarA2, (byte) 9), new lhf(this, a8zVarA2, (byte) 17));
        this.Q1 = ltt0.o(this, ntk.f24104a);
        this.R1 = new z9f(this, (byte) 13);
        this.S1 = maz.a(wezVar, new Function0(this) { // from class: a.mtk
            public final /* synthetic */ ptk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                ptk ptkVar = this.b;
                switch (b3) {
                    case 0:
                        fiu0 fiu0Var = ptkVar.L1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        z9f z9fVar = ptkVar.R1;
                        z9fVar.getClass();
                        ltk ltkVar = new ltk();
                        ltkVar.d.b(new gbn(new svj((byte) 14), new e9k(3, (byte) 5), new iok(z9fVar, (byte) 0), zdh.r));
                        return ltkVar;
                }
            }
        });
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        vqc vqcVarH0 = H0();
        RecyclerView recyclerView = G0().c;
        ltk ltkVar = (ltk) this.S1.getValue();
        ltkVar.getClass();
        vqcVarH0.b = ltkVar;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(ltkVar);
        recyclerView.setItemAnimator(null);
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.space_4);
        recyclerView.m(new qmk0(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 1, null, null, 448));
        vvw.o(recyclerView, true, 1);
        recyclerView.o(new qtk());
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(uyg.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            uyg uygVar = (uyg) (ze3Var instanceof uyg ? ze3Var : null);
            if (uygVar != null) {
                DisciplineListParams disciplineListParams = (DisciplineListParams) this.N1.n(this, V1[0]);
                duj dujVar = uygVar.f36486a;
                cad cadVar = uygVar.c;
                gii0 gii0Var = uygVar.d;
                oeg0 oeg0Var = uygVar.b;
                kt2 kt2Var = uygVar.e;
                pmi pmiVar = uygVar.f;
                cyu cyuVar = uygVar.j;
                zr1 zr1Var = uygVar.k;
                g2v g2vVar = uygVar.g;
                m1e m1eVar = uygVar.h;
                pyg pygVar = uygVar.i;
                xri xriVar = uygVar.l;
                iip iipVar = uygVar.m;
                oeg0Var.getClass();
                pygVar.getClass();
                xriVar.getClass();
                iipVar.getClass();
                gii0Var.getClass();
                kt2Var.getClass();
                m1eVar.getClass();
                daf dafVar = new daf(cadVar, pygVar, iipVar, dujVar, disciplineListParams, cyuVar, zr1Var, kt2Var, pmiVar, g2vVar, m1eVar);
                this.K1 = new vqc((byte) 26);
                this.L1 = new fiu0(Collections.singletonMap(xtk.class, (uci) dafVar.m));
                return;
            }
        }
        jf4.n(b1j.i(uyg.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = ((xtk) this.O1.getValue()).l;
        otk otkVar = new otk(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new xsj(p7m0Var, clzVarW, otkVar, (yje) null), 3);
        p7m0 p7m0Var2 = ((luk) this.P1.getValue()).b;
        otk otkVar2 = new otk(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new xsj((gmq) p7m0Var2, clzVarW2, otkVar2, (yje) null, (byte) 0), 3);
    }

    public final uth G0() {
        Object objN = this.Q1.n(V1[1], this);
        objN.getClass();
        return (uth) objN;
    }

    public final vqc H0() {
        vqc vqcVar = this.K1;
        if (vqcVar != null) {
            return vqcVar;
        }
        Intrinsics.h("disciplineListRecyclerFragmentDelegate");
        throw null;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        H0();
        G0().c.setAdapter(null);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }
}
