package a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La/hz6;", "La/nw5;", "La/vik;", "La/i620;", "<init>", "()V", "a/cl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hz6 extends nw5<vik> implements i620 {
    public final o900 e2 = new o900();
    public final khf0 f2 = new khf0("KEY_FAKE_VIEW_POSITION");
    public final phf0 g2 = new phf0("BONUS_BOUGHT_REQUEST_KEY");
    public final zz2 h2 = new zz2("HIGHLITED_DOT_REQUEST_KEY", 0);
    public ViewPropertyAnimator i2;
    public wjk j2;
    public ii k2;
    public jki l2;
    public final kiu0 m2;
    public final n0o0 n2;
    public final nae0 o2;
    public static final /* synthetic */ iiy[] q2 = {new ez40(hz6.class, "fakeViewPosition", "getFakeViewPosition()Landroid/graphics/Rect;", 0), new ez40(hz6.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(hz6.class, "highlighted", "getHighlighted()I", 0), new j0d0(hz6.class, "binding", "getBinding()Lorg/xplatform/bonus_games/impl/databinding/DialogGameBetShopBinding;", 0)};
    public static final cl5 p2 = new cl5((byte) 5);

    public hz6() {
        dz6 dz6Var = new dz6(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new p46(new p46(this, (byte) 14), (byte) 15));
        this.m2 = agc.G(this, sre0.f32672a.b(b07.class), new rt6(a8zVarA, (byte) 2), new rt6(a8zVarA, (byte) 3), dz6Var);
        this.n2 = maz.b(new dz6(this, (byte) 1));
        this.o2 = ltt0.p(this, fz6.f10394a);
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundDark;
    }

    @Override // a.nw5
    public final void P0() {
        kki kkiVar;
        Fragment fragment = this.y;
        Fragment fragment2 = fragment != null ? fragment.y : null;
        kjc0 kjc0Var = fragment2 instanceof kjc0 ? (kjc0) fragment2 : null;
        if (kjc0Var == null || (kkiVar = kjc0Var.M1) == null) {
            return;
        }
        switch (kkiVar.f18441a) {
            case 0:
                this.k2 = ((fki) kkiVar.e).f9693a.j();
                this.l2 = (jki) ((n5d0) kkiVar.f).get();
                break;
            case 1:
            default:
                this.k2 = ((iyi) kkiVar.e).f15590a.j();
                this.l2 = (jki) ((n5d0) kkiVar.f).get();
                break;
            case 2:
                this.k2 = ((nli) kkiVar.e).f23729a.j();
                this.l2 = (jki) ((n5d0) kkiVar.f).get();
                break;
        }
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.rootView;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final vik L0() {
        Object objN = this.o2.n(q2[3], this);
        objN.getClass();
        return (vik) objN;
    }

    public final b07 U0() {
        return (b07) this.m2.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        if (context instanceof wjk) {
            this.j2 = (wjk) context;
        }
    }

    public final void V0(k390 k390Var, int i) {
        vcc.f0(i120.V(new Pair("BONUS_BOUGHT_RESULT_KEY_USER_ID", Long.valueOf(k390Var.f17607a)), new Pair("BONUS_BOUGHT_RESULT_KEY_ACCOUNT_ID", Long.valueOf(k390Var.b)), new Pair("BONUS_BOUGHT_RESULT_KEY_ACCOUNT_BALANCE", Double.valueOf(k390Var.c)), new Pair("BONUS_BOUGHT_RESULT_KEY_BONUS_BALANCE", Integer.valueOf(k390Var.d)), new Pair("BONUS_BOUGHT_RESULT_KEY_ROTATION_COUNT", Integer.valueOf(k390Var.e)), new Pair("BONUS_BOUGHT_RESULT_KEY_BOUGHT_COUNT", Integer.valueOf(i))), this, this.g2.n(this, q2[1]));
    }

    public final void W0(View view, int i, Function0 function0) {
        Dialog dialogD0 = D0();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        L0().h.getGlobalVisibleRect(rect2);
        view.getGlobalVisibleRect(rect);
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect();
        rect3.set((Rect) this.f2.n(this, q2[0]));
        rect3.offset(-rect2.left, -rect2.top);
        TextView textView = L0().e.b;
        textView.setText(String.valueOf(i));
        textView.setX(rect.left);
        textView.setY(rect.top);
        textView.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorY = textView.animate().x(rect3.left).y(rect3.top);
        viewPropertyAnimatorY.setListener(new x73(null, new gj4(dialogD0, function0, (byte) 16), 11));
        viewPropertyAnimatorY.start();
        this.i2 = viewPropertyAnimatorY;
    }

    @Override // a.nw5, a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        wjk wjkVar = this.j2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
        this.j2 = null;
        super.Z();
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        wjk wjkVar = this.j2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
    }

    @Override // a.nw5, a.sik, androidx.fragment.app.Fragment
    public final void h0() {
        super.h0();
        ViewPropertyAnimator viewPropertyAnimator = this.i2;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        ol60 ol60Var = U0().p;
        yje yjeVar = null;
        yp6 yp6Var = new yp6(this, yjeVar, (byte) 5);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        tkz tkzVarQ = x0x.Q(clzVarW.x());
        td6 td6Var = new td6(ol60Var, clzVarW, yp6Var, (yje) null);
        byte b = 3;
        qjj.W(tkzVarQ, null, null, td6Var, 3);
        L0().e.b.setSelected(true);
        RecyclerView recyclerView = L0().f;
        recyclerView.setAdapter((c6s) this.n2.getValue());
        byte b2 = 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        Drawable drawable = recyclerView.getContext().getDrawable(R.drawable.divider_bet_game_count);
        if (drawable != null) {
            uwk uwkVar = new uwk(recyclerView.getContext(), 0);
            uwkVar.f36397a = drawable;
            recyclerView.m(uwkVar);
        }
        b07 b07VarU0 = U0();
        byte b3 = 2;
        sac.V(jiu0.a(b07VarU0), new ur6(1, b07VarU0, b07.class, "handleShopLoadError", "handleShopLoadError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, null, new mz6(b07VarU0, yjeVar, b3), 14);
        L0().b.setLayoutManager(new LinearLayoutManager(D(), 0, false));
        this.e2.b(L0().b);
        L0().d.setHighlighted(this.h2.n(this, q2[2]).intValue());
        L0().b.o(new gz6(this, b2));
        dyb.N(L0().c, ymx.INTERVAL_500, new os5(this, (byte) 16));
        ccq0.V(this, "REQUEST_SHOW_INSUFFICIENT_DIALOG_KEY", new dz6(this, (byte) 4));
        ccq0.V(this, "PROMO_REQUEST_DIALOG_RESTART_GAME_KEY", new dz6(this, b3));
        ccq0.T(this, "PROMO_REQUEST_DIALOG_RESTART_GAME_KEY", new dz6(this, b));
    }
}
