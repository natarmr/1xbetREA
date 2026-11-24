package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La/zp6;", "La/stl;", "La/k620;", "La/i620;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zp6 extends stl<k620> implements i620 {
    public fiu0 g2;
    public wdk0 h2;
    public final nae0 i2 = ltt0.p(this, wp6.f39529a);
    public final kiu0 j2;
    public final cgx0 k2;
    public wjk l2;
    public static final /* synthetic */ iiy[] n2 = {new j0d0(zp6.class, "binding", "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/MakeBetBottomDsBinding;", 0), new ez40(zp6.class, "isPromoBetEnabled", "isPromoBetEnabled()Z", 0)};
    public static final yk5 m2 = new yk5();

    public zp6() {
        zo4 zo4Var = new zo4(this, (byte) 20);
        a8z a8zVarA = maz.a(wez.b, new p46(new p46(this, (byte) 5), (byte) 6));
        this.j2 = agc.G(this, sre0.f32672a.b(o720.class), new qw4(a8zVarA, (byte) 24), new qw4(a8zVarA, (byte) 25), zo4Var);
        this.k2 = new cgx0("KEY_PROMO_BET_ENABLED");
    }

    @Override // a.stl
    public final void S0() throws Exception {
        Window window;
        Dialog dialog = this.S1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.clearFlags(2);
        }
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.N(3);
        }
        Q0().f.setUserInputEnabled(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(wn7.i);
        iiy[] iiyVarArr = n2;
        iiy iiyVar = iiyVarArr[1];
        cgx0 cgx0Var = this.k2;
        if (cgx0Var.n(this, iiyVar).booleanValue()) {
            arrayList.add(wn7.h);
        }
        Q0().f.setAdapter(new ft6(this, arrayList));
        Q0().d.setVisibility(cgx0Var.n(this, iiyVarArr[1]).booleanValue() ? 0 : 8);
        if (cgx0Var.n(this, iiyVarArr[1]).booleanValue()) {
            DsSegmentedGroup dsSegmentedGroup = Q0().d;
            vvh0 vvh0Var = new vvh0();
            vvh0Var.a(H(R.string.bet_type_simple));
            DsSegmentedGroup.a(dsSegmentedGroup, vvh0Var, false, 6);
            vvh0 vvh0Var2 = new vvh0();
            vvh0Var2.a(H(R.string.bet_type_promo));
            DsSegmentedGroup.a(dsSegmentedGroup, vvh0Var2, false, 6);
            dsSegmentedGroup.setSelectedPosition(0);
            new sbx0((byte) 13).b(Q0().f);
            Q0().f.c(new xp6(this, (byte) 0));
        }
        DsSegmentedGroup.f(Q0().d, new os5(this, (byte) 11));
        xae0 xae0VarN = vtb.N(((o720) this.j2.getValue()).c);
        yp6 yp6Var = new yp6(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new td6(xae0VarN, clzVarW, yp6Var, (yje) null), 3);
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(v720.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            v720 v720Var = (v720) (ze3Var instanceof v720 ? ze3Var : null);
            if (v720Var != null) {
                zki zkiVarA = v720Var.a(a4n0.f(this));
                this.g2 = zkiVarA.d();
                this.h2 = zkiVarA.s;
                return;
            }
        }
        jf4.n(b1j.i(v720.class, "Cannot create dependency "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        if (context instanceof wjk) {
            this.l2 = (wjk) context;
        }
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final k620 Q0() {
        Object objN = this.i2.n(n2[0], this);
        objN.getClass();
        return (k620) objN;
    }

    @Override // a.stl, a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        this.c2 = null;
        super.Z();
        wjk wjkVar = this.l2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
    }
}
