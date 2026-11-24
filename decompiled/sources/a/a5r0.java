package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.feed.topgamesbystat.presentation.params.TopGamesByStatBottomSheetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a5r0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f286a;
    public final /* synthetic */ b5r0 b;

    public /* synthetic */ a5r0(b5r0 b5r0Var, byte b) {
        this.f286a = b;
        this.b = b5r0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f286a;
        b5r0 b5r0Var = this.b;
        switch (b) {
            case 0:
                j6m0 j6m0Var = b5r0.t2;
                ComponentCallbacks2 application = b5r0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(v4r0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof v4r0)) {
                        ze3Var = null;
                    }
                    v4r0 v4r0Var = (v4r0) ze3Var;
                    if (v4r0Var != null) {
                        TopGamesByStatBottomSheetScreenParams topGamesByStatBottomSheetScreenParams = (TopGamesByStatBottomSheetScreenParams) b5r0Var.k2.n(b5r0Var, b5r0.u2[0]);
                        itr itrVar = v4r0Var.f36794a;
                        d1p d1pVar = v4r0Var.c;
                        iip iipVar = v4r0Var.b;
                        iw20 iw20Var = v4r0Var.d;
                        ugf0 ugf0Var = v4r0Var.e;
                        sue sueVar = v4r0Var.o;
                        n5r0 n5r0Var = v4r0Var.g;
                        kt2 kt2Var = v4r0Var.f;
                        r9u r9uVar = v4r0Var.h;
                        y78 y78Var = v4r0Var.i;
                        m1e m1eVar = v4r0Var.j;
                        ctf0 ctf0Var = v4r0Var.k;
                        g2v g2vVar = v4r0Var.l;
                        mne mneVar = v4r0Var.m;
                        wdk0 wdk0Var = v4r0Var.n;
                        itrVar.getClass();
                        d1pVar.getClass();
                        iipVar.getClass();
                        sueVar.getClass();
                        n5r0Var.getClass();
                        r9uVar.getClass();
                        m1eVar.getClass();
                        kt2Var.getClass();
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        return new nxi(d1pVar, itrVar, iipVar, iw20Var, ugf0Var, n5r0Var, sueVar, r9uVar, y78Var, m1eVar, kt2Var, ctf0Var, g2vVar, mneVar, wdk0Var, topGamesByStatBottomSheetScreenParams);
                    }
                }
                jf4.n(b1j.i(v4r0.class, "Cannot create dependency "));
                return null;
            case 1:
                j6m0 j6m0Var2 = b5r0.t2;
                return new q0h0((mxi) b5r0Var.P0().q.get());
            case 2:
                j6m0 j6m0Var3 = b5r0.t2;
                b5r0Var.Q0().x(l4r0.f19423a);
                return Unit.f46060a;
            default:
                j6m0 j6m0Var4 = b5r0.t2;
                b5r0Var.Q0().x(i4r0.f14160a);
                return Unit.f46060a;
        }
    }
}
