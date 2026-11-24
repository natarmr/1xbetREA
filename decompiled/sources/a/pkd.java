package a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pkd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f27129a;
    public static final List b;

    static {
        zcl zclVar = qmk.f28987a;
        f27129a = 620.0f;
        b = q3d.j("androidx.collection.IntListKt", "androidx.collection.MutableIntList", "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", "androidx.compose.ui.platform.AndroidComposeView", "androidx.media3.common.Timeline$Window", "androidx.media3.common.MediaItem", "androidx.media3.ui.PlayerControlView", "androidx.media3.ui.PlayerView", "androidx.constraintlayout.widget.ConstraintHelper", "androidx.constraintlayout.widget.Group");
    }

    public static final mm40 a(mm40 mm40Var, float f) {
        mm40Var.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            return rq8.M(mm40Var, new f54(f, (byte) 8));
        }
        zcl zclVar = new zcl(f);
        ugg0 ugg0Var = vgg0.f37379a;
        return h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var);
    }

    public static final float b(float f, fet fetVar) {
        return ((w6k) fetVar.k(bmd.h)).w0(f);
    }

    public static final boolean c(fet fetVar) {
        return ((Boolean) fetVar.k(zaq0.f44080a)).booleanValue();
    }

    public static final boolean d(fet fetVar) {
        return (((Configuration) fetVar.k(dy2.f6873a)).screenLayout & 15) >= 3;
    }

    public static final float e(int i, fet fetVar) {
        return ((w6k) fetVar.k(bmd.h)).r0(i);
    }

    public static final bik f(fet fetVar) {
        Context context = (Context) fetVar.k(dy2.b);
        context.getClass();
        agd agdVar = (agd) context;
        boolean zG = fetVar.g(agdVar);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zG || objP == obj) {
            mjv0.f21914a.getClass();
            njv0 njv0Var = ljv0.b;
            njv0Var.getClass();
            kjv0 kjv0VarA = njv0Var.a(agdVar);
            float f = agdVar.getResources().getDisplayMetrics().density;
            tq8 tq8Var = kjv0VarA.f18406a;
            float fWidth = tq8Var.c().width() / f;
            tq8Var.c().height();
            objP = androidx.compose.runtime.e.e((fWidth > f27129a ? 1 : (fWidth == f27129a ? 0 : -1)) >= 0 ? yhk.f42641a : whk.f39170a);
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        boolean zI = fetVar.i(agdVar) | fetVar.g(pz40Var);
        Object objP2 = fetVar.P();
        if (zI || objP2 == obj) {
            objP2 = new jtb(agdVar, pz40Var, null, (byte) 11);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, agdVar, (Function2) objP2);
        return (bik) pz40Var.getValue();
    }

    public static final k6z g(String str, fet fetVar) {
        str.getClass();
        k6z k6zVar = (k6z) fetVar.k(bmd.n);
        Character chI = ttm0.I(0, str);
        boolean zG = fetVar.g(chI) | fetVar.e(k6zVar.ordinal());
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            if (chI != null) {
                byte directionality = Character.getDirectionality(chI.charValue());
                if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                    k6zVar = k6z.b;
                } else if (directionality != 3 && directionality != 6) {
                    k6zVar = k6z.f17794a;
                }
            }
            fetVar.o0(k6zVar);
            objP = k6zVar;
        }
        return (k6z) objP;
    }

    public static final void h(ComposeView composeView, vgu0 vgu0Var, shd shdVar, ugd ugdVar) {
        composeView.getClass();
        composeView.setViewCompositionStrategy(vgu0Var);
        composeView.setContent(new ugd(-2076413773, true, new nkd(shdVar, ugdVar, (byte) 2)));
    }

    public static final void i(ComposeView composeView, Function2 function2, ugd ugdVar) {
        composeView.getClass();
        composeView.setViewCompositionStrategy(qek0.h);
        composeView.setContent(new ugd(-514184665, true, new nkd(function2, ugdVar, (byte) 1)));
    }

    public static void k(ComposeView composeView, cy40 cy40Var, ugd ugdVar) {
        qek0 qek0Var = qek0.h;
        cy40Var.getClass();
        composeView.setViewCompositionStrategy(qek0Var);
        composeView.setContent(new ugd(-1121994973, true, new okd(cy40Var, ugdVar, (byte) 0)));
    }

    public static final mm40 l(mm40 mm40Var, yjj0 yjj0Var, long j, fet fetVar, int i) {
        mm40Var.getClass();
        if ((i & 2) != 0) {
            j = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary20();
        }
        x7x x7xVarR = b8k0.r(b8k0.V("", fetVar, 0), 0.0f, 500.0f, ro4.b0(ro4.m0(2500, 0, ihn.d, 2), kkf0.f18436a, 0L, 4), "", fetVar, 29112, 0);
        mm40 mm40VarQ = i120.Q(lgb.J(mm40Var, yjj0Var), j, jd8.n);
        boolean zG = fetVar.g(x7xVarR);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new x1d(x7xVarR, (byte) 6);
            fetVar.o0(objP);
        }
        return rq8.K(mm40VarQ, (Function1) objP);
    }
}
