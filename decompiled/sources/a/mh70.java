package a;

import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.core.presentation.views.OneXGamesInputEditText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/mh70;", "La/yx5;", "<init>", "()V", "a/jh70", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mh70 extends yx5 {
    public final i9o0 K1;
    public o6i L1;
    public final kiu0 M1;
    public final s0r N1;
    public iha O1;
    public boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(mh70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/FragmentGamesBetBinding;", 0)};
    public static final jh70 Q1 = new jh70();

    public mh70() {
        super(R.layout.fragment_games_bet);
        this.K1 = i9o0.f14396a;
        hh70 hh70Var = new hh70(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 2), (byte) 3));
        this.M1 = agc.G(this, sre0.f32672a.b(ji70.class), new co60(a8zVarA, (byte) 28), new co60(a8zVarA, (byte) 29), hh70Var);
        this.N1 = ltt0.o(this, kh70.f18276a);
        this.P1 = true;
    }

    public static void G0(mh70 mh70Var) {
        mh70Var.P1 = true;
        j120.Y(mh70Var);
        mh70Var.H0().i.requestFocus();
        mh70Var.H0().f.clearFocus();
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVarO = sac.O(this);
        if (h5tVarO != null) {
            h5tVarO.c(this);
        }
    }

    public final h0r H0() {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        return (h0r) objN;
    }

    public final ji70 I0() {
        return (ji70) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        iha ihaVar = this.O1;
        if (ihaVar != null) {
            View viewFindViewById = ((kxq) ihaVar.c).findViewById(android.R.id.content);
            viewFindViewById.getClass();
            viewFindViewById.getViewTreeObserver().removeOnGlobalLayoutListener((qly) ihaVar.f);
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        G0(this);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        OneXGamesInputEditText oneXGamesInputEditText = H0().f;
        ConstraintLayout constraintLayout = H0().i;
        ck60 ck60Var = new ck60(this, oneXGamesInputEditText, constraintLayout, (byte) 6);
        byte b = 2;
        if (Build.VERSION.SDK_INT >= 30) {
            yox yoxVar = new yox(ck60Var);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(constraintLayout, yoxVar);
        } else {
            kxq kxqVarB = B();
            if (kxqVarB != null) {
                View viewFindViewById = kxqVarB.findViewById(android.R.id.content);
                viewFindViewById.getClass();
                viewFindViewById.post(new oh60(this, ck60Var, (byte) 2));
            }
        }
        TextView textView = H0().b;
        OneXGamesInputEditText oneXGamesInputEditText2 = H0().f;
        oneXGamesInputEditText2.setFilters(new InputFilter[]{new tjj(13, 2)});
        oneXGamesInputEditText2.setOnFocusChangeListener(new yf70(this, textView, (byte) 1));
        hxm0.y(oneXGamesInputEditText2, new hh70(this, (byte) 1));
        H0().g.setOnClickListener(new l910(this, (byte) 9));
        AppCompatButton appCompatButton = H0().p;
        ymx ymxVar = ymx.INTERVAL_100;
        dyb.N(appCompatButton, ymxVar, new ih70(this, (byte) 1));
        dyb.N(H0().n, ymxVar, new ih70(this, b));
        dyb.N(H0().s, ymxVar, new ih70(this, (byte) 3));
        dyb.N(H0().j, ymxVar, new ih70(this, (byte) 4));
        vf70 vf70Var = new vf70();
        String simpleName = vf70.class.getSimpleName();
        if (C().J(simpleName) == null) {
            androidx.fragment.app.e eVarC = C();
            eVarC.getClass();
            zb5 zb5Var = new zb5(eVarC);
            zb5Var.o(R.id.flButtonContainer, vf70Var, simpleName);
            zb5Var.f();
        }
        p7m0 p7m0Var = I0().w;
        nf60 nf60Var = new nf60(this, null, (byte) 19);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(p7m0Var, clzVarW, nf60Var, (yje) null, (byte) 0), 3);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
