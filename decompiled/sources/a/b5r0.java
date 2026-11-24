package a;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/b5r0;", "La/iw5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b5r0 extends iw5 {
    public boolean l2;
    public boolean m2;
    public wjk n2;
    public ndk0 o2;
    public static final /* synthetic */ iiy[] u2 = {new ez40(b5r0.class, "params", "getParams()Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;", 0)};
    public static final j6m0 t2 = new j6m0((byte) 22);
    public static final String v2 = b5r0.class.getName();
    public final khf0 k2 = new khf0("TOP_GAMES_BY_STAT_SCREEN_PARAMS");
    public final n0o0 p2 = maz.b(new a5r0(this, 0));
    public final a8z q2 = xbc.a0(this, sre0.f32672a.b(m5r0.class), null, new a5r0(this, 1), 14);
    public final gw5 r2 = new gw5(this, 5);
    public final vr3 s2 = new vr3(this, 4);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(2055244464);
        k3t0 k3t0VarQ0 = Q0();
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP);
        }
        vne vneVar = (vne) objP;
        boolean zI = fetVar.i(this);
        Object objP2 = fetVar.P();
        if (zI || objP2 == obj) {
            Object w6q0Var = new w6q0(1, this, b5r0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feed/topgamesbystat/presentation/models/TopGamesByStatBottomSheetSideEffect;)V", 0, (byte) 20);
            fetVar.o0(w6q0Var);
            objP2 = w6q0Var;
        }
        Function1 function1 = (Function1) ((jhy) objP2);
        Unit unit = Unit.f46060a;
        boolean zI2 = fetVar.i(vneVar) | fetVar.i(k3t0VarQ0) | fetVar.g(function1) | fetVar.g(null);
        Object objP3 = fetVar.P();
        if (zI2 || objP3 == obj) {
            objP3 = new ggc0(vneVar, k3t0VarQ0, function1, (byte) 13);
            fetVar.o0(objP3);
        }
        m0x0.o(unit, (Function1) objP3, fetVar);
        pz40 pz40VarY = ((i3t0) Q0()).y(fetVar);
        boolean zI3 = fetVar.i(this);
        Object objP4 = fetVar.P();
        if (zI3 || objP4 == obj) {
            objP4 = new a5r0(this, (byte) 2);
            fetVar.o0(objP4);
        }
        Function0 function0 = (Function0) objP4;
        boolean zI4 = fetVar.i(this);
        Object objP5 = fetVar.P();
        if (zI4 || objP5 == obj) {
            objP5 = new a5r0(this, (byte) 3);
            fetVar.o0(objP5);
        }
        v3c.z(function0, (Function0) objP5, null, fetVar, 0, 4);
        bw5 bw5Var = new bw5(cw5.a(iw5.O0(1, fetVar), false, false, false, null, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 31), (xdr) null, (ugd) null, u1c.M(1888653089, new nhl0(pz40VarY, this, (byte) 23), fetVar), 14);
        fetVar.r(false);
        return bw5Var;
    }

    public final nxi P0() {
        return (nxi) this.p2.getValue();
    }

    public final k3t0 Q0() {
        return (k3t0) this.q2.getValue();
    }

    public final void R0(xdk0 xdk0Var) {
        ViewGroup viewGroup;
        Object objPrevious;
        Window window;
        ndk0 ndk0Var = this.o2;
        if (ndk0Var != null) {
            ndk0Var.dismiss();
        }
        wdk0 wdk0Var = P0().p;
        List listP = C().c.p();
        ArrayList arrayListU = twn.u(listP);
        for (Object obj : listP) {
            if (obj instanceof sik) {
                arrayListU.add(obj);
            }
        }
        ListIterator listIterator = arrayListU.listIterator(arrayListU.size());
        while (true) {
            viewGroup = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            sik sikVar = (sik) objPrevious;
            if ((sikVar instanceof i620) && sikVar.Q()) {
                break;
            }
        }
        sik sikVar2 = (sik) objPrevious;
        if (sikVar2 == null) {
            sikVar2 = this;
        }
        Dialog dialogA0 = sikVar2.A0();
        if (dialogA0 != null && (window = dialogA0.getWindow()) != null) {
            viewGroup = (ViewGroup) window.findViewById(R.id.content);
        }
        this.o2 = wdk0.k(wdk0Var, xdk0Var, this, null, viewGroup, false, null, 1012);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        if (context instanceof wjk) {
            this.n2 = (wjk) context;
        }
        wjk wjkVar = this.n2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
    }

    @Override // a.iw5, a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        BottomSheetBehavior bottomSheetBehaviorL0 = L0();
        bottomSheetBehaviorL0.a0.remove(this.r2);
        C().B0(this.s2);
        x1x.x(P0().c.d());
        ujd.a(this);
        super.Z();
        wjk wjkVar = this.n2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        wjk wjkVar = this.n2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
        super.e0();
    }

    @Override // a.iw5, a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        L0().N(3);
        L0().K = true;
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        L0().y(this.r2);
        C().k0(this.s2, false);
        ujd ujdVarD = P0().c.d();
        x1x.x(ujdVarD);
        ujdVarD.c(this, new ks2(), new nop0((Object) this, (byte) 25));
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        u4r0 u4r0Var;
        dialogInterface.getClass();
        if (this.m2 || !Q()) {
            u4r0Var = null;
        } else {
            u4r0Var = this.l2 ? u4r0.SWIPE : u4r0.IGNORE;
        }
        if (u4r0Var != null) {
            Q0().x(new p4r0(u4r0Var));
        }
        super.onDismiss(dialogInterface);
    }
}
