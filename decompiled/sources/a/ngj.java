package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Collections;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/ngj;", "La/stl;", "La/rzq;", "<init>", "()V", "a/usd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ngj extends stl<rzq> {
    public final nae0 g2 = ltt0.p(this, lgj.f20010a);
    public wdk0 h2;
    public ii i2;
    public fiu0 j2;
    public final kiu0 k2;
    public final kiu0 l2;
    public final n0o0 m2;
    public static final /* synthetic */ iiy[] o2 = {new j0d0(ngj.class, "binding", "getBinding()Lorg/xplatform/feature/dayexpress/impl/databinding/FragmentDayExpressDetailBinding;", 0)};
    public static final usd n2 = new usd();

    public ngj() {
        jgj jgjVar = new jgj(this, (byte) 1);
        q7g q7gVar = new q7g(this, (byte) 20);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new q7g(q7gVar, (byte) 21));
        tre0 tre0Var = sre0.f32672a;
        this.k2 = agc.G(this, tre0Var.b(xgj.class), new r7g(a8zVarA, (byte) 22), new r7g(a8zVarA, (byte) 23), jgjVar);
        a8z a8zVarA2 = maz.a(wezVar, new q7g(new jgj(this, (byte) 2), (byte) 22));
        this.l2 = agc.G(this, tre0Var.b(pgj.class), new r7g(a8zVarA2, (byte) 24), new r7g(a8zVarA2, (byte) 25), new lhf(this, a8zVarA2, (byte) 12));
        this.m2 = maz.b(new bmh((byte) 28));
    }

    @Override // a.stl
    public final void S0() {
        RecyclerView recyclerView = Q0().c;
        recyclerView.setLayoutManager(new LinearLayoutManager(o0()));
        recyclerView.setAdapter((igj) this.m2.getValue());
        final byte b = 0;
        Q0().b.setOnClickListener(new View.OnClickListener(this) { // from class: a.kgj
            public final /* synthetic */ ngj b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                ngj ngjVar = this.b;
                switch (b2) {
                    case 0:
                        usd usdVar = ngj.n2;
                        xgj xgjVarW0 = ngjVar.W0();
                        xgjVarW0.i = false;
                        qjj.W(jiu0.a(xgjVarW0), xgjVarW0.e.b, null, new ya(xgjVarW0, null, (byte) 24), 2);
                        break;
                    default:
                        usd usdVar2 = ngj.n2;
                        xgj xgjVarW1 = ngjVar.W0();
                        xgjVarW1.i = true;
                        qjj.W(jiu0.a(xgjVarW1), xgjVarW1.e.b, null, new ya(xgjVarW1, null, (byte) 24), 2);
                        break;
                }
            }
        });
        final byte b2 = 1;
        Q0().e.setOnClickListener(new View.OnClickListener(this) { // from class: a.kgj
            public final /* synthetic */ ngj b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                ngj ngjVar = this.b;
                switch (b3) {
                    case 0:
                        usd usdVar = ngj.n2;
                        xgj xgjVarW0 = ngjVar.W0();
                        xgjVarW0.i = false;
                        qjj.W(jiu0.a(xgjVarW0), xgjVarW0.e.b, null, new ya(xgjVarW0, null, (byte) 24), 2);
                        break;
                    default:
                        usd usdVar2 = ngj.n2;
                        xgj xgjVarW1 = ngjVar.W0();
                        xgjVarW1.i = true;
                        qjj.W(jiu0.a(xgjVarW1), xgjVarW1.e.b, null, new ya(xgjVarW1, null, (byte) 24), 2);
                        break;
                }
            }
        });
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ogj.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ogj ogjVar = (ogj) (ze3Var instanceof ogj ? ze3Var : null);
            if (ogjVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                sue sueVar = ogjVar.f25221a;
                wdk0 wdk0Var = ogjVar.b;
                ii iiVar = ogjVar.c;
                ouu ouuVar = ogjVar.d;
                mne mneVar = ogjVar.e;
                ctf0 ctf0Var = ogjVar.f;
                sueVar.getClass();
                wdk0Var.getClass();
                iiVar.getClass();
                ctf0Var.getClass();
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = i1w0VarF;
                esg0Var.b = ouuVar;
                esg0Var.c = sueVar;
                esg0Var.d = mneVar;
                esg0Var.e = ctf0Var;
                esg0Var.f = new yei(esg0Var, (byte) 6);
                this.h2 = wdk0Var;
                this.i2 = iiVar;
                this.j2 = new fiu0(Collections.singletonMap(xgj.class, (yei) esg0Var.f));
                return;
            }
        }
        jf4.n(b1j.i(ogj.class, "Cannot create dependency "));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        p7m0 p7m0Var = W0().g;
        yje yjeVar = null;
        mgj mgjVar = new mgj(this, yjeVar, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g8g(p7m0Var, clzVarW, mgjVar, (yje) null), 3);
        ol60 ol60Var = W0().h;
        mgj mgjVar2 = new mgj(this, yjeVar, (byte) 2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g8g(ol60Var, clzVarW2, mgjVar2, (yje) null, (byte) 0), 3);
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final rzq Q0() {
        Object objN = this.g2.n(o2[0], this);
        objN.getClass();
        return (rzq) objN;
    }

    @Override // a.stl, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_EXPRESS_DIALOG_EXPRESS", new jgj(this, (byte) 3));
        p7m0 p7m0Var = ((pgj) this.l2.getValue()).b;
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new g8g((gmq) p7m0Var, this, new mgj(this, null, (byte) 0), (yje) null), 3);
    }

    public final xgj W0() {
        return (xgj) this.k2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K = true;
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.N(3);
        }
    }
}
