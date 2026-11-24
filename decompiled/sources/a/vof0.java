package a;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.resident.presentation.views.ResidentDoorLineView;
import org.xplatform.resident.presentation.views.ResidentSmokeView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/vof0;", "La/yx5;", "<init>", "()V", "resident"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vof0 extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(vof0.class, "binding", "getBinding()Lorg/xplatform/resident/databinding/FragmentResidentBinding;", 0)};
    public final i9o0 K1;
    public fiu0 L1;
    public final s0r M1;
    public final kiu0 N1;

    public vof0() {
        super(R.layout.fragment_resident);
        this.K1 = i9o0.f14396a;
        this.M1 = ltt0.o(this, rof0.f30833a);
        nof0 nof0Var = new nof0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new lce0(new lce0(this, (byte) 17), (byte) 18));
        this.N1 = agc.G(this, sre0.f32672a.b(aqf0.class), new wbe0(a8zVarA, (byte) 18), new wbe0(a8zVarA, (byte) 19), nof0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        H0().e.setOnSafeClickListener(new oof0(this, (byte) 0));
        H0().c.setOnDoorClickListener(new oof0(this, (byte) 1));
        dyb.b0(H0().b, ymx.INTERVAL_600, new oof0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        wri wriVar;
        Fragment fragment = this.y;
        kqf0 kqf0Var = fragment instanceof kqf0 ? (kqf0) fragment : null;
        if (kqf0Var == null || (wriVar = (wri) kqf0Var.W1.getValue()) == null) {
            return;
        }
        this.L1 = new fiu0(Collections.singletonMap(aqf0.class, wriVar.p0));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = I0().C;
        yje yjeVar = null;
        byte b = 0;
        sof0 sof0Var = new sof0(this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w7f0(p7m0Var, clzVarW, sof0Var, (yje) null), 3);
        p7m0 p7m0Var2 = I0().D;
        tof0 tof0Var = new tof0(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new w7f0(p7m0Var2, clzVarW2, tof0Var, (yje) null), 3);
        p7m0 p7m0Var3 = I0().E;
        byte b2 = 1;
        sof0 sof0Var2 = new sof0(this, yjeVar, b2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new w7f0(p7m0Var3, clzVarW3, sof0Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var4 = I0().F;
        sof0 sof0Var3 = new sof0(this, yjeVar, (byte) 2);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new w7f0((gmq) p7m0Var4, clzVarW4, sof0Var3, (yje) null, (char) 0), 3);
        p7m0 p7m0Var5 = I0().G;
        tof0 tof0Var2 = new tof0(this, yjeVar, b2);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new w7f0(p7m0Var5, clzVarW5, tof0Var2, (yje) null, (byte) 0), 3);
    }

    public final void G0() {
        H0().i.setVisibility(8);
        H0().f.setVisibility(8);
        H0().d.setVisibility(0);
        H0().d.setState(wqf0.f39589a);
        H0().e.setVisibility(8);
        H0().c.a();
        H0().c.setVisibility(0);
        I0().C();
    }

    public final e4r H0() {
        Object objN = this.M1.n(O1[0], this);
        objN.getClass();
        return (e4r) objN;
    }

    public final aqf0 I0() {
        return (aqf0) this.N1.getValue();
    }

    public final void J0(int i, boolean z) {
        H0().c.setVisibility(0);
        H0().c.setStateAppliedListener(new nof0(this, (byte) 2));
        if (z) {
            ResidentDoorLineView residentDoorLineView = H0().c;
            ArrayList arrayList = residentDoorLineView.f46883a;
            if (i < 0 || i >= arrayList.size()) {
                residentDoorLineView.c.invoke();
            } else {
                mof0 mof0Var = (mof0) arrayList.get(i);
                mof0Var.setOnDoorAppliedListener(residentDoorLineView.c);
                mof0Var.a(lof0.b, residentDoorLineView.d);
            }
        } else {
            ResidentDoorLineView residentDoorLineView2 = H0().c;
            ArrayList arrayList2 = residentDoorLineView2.f46883a;
            if (i < 0 || i >= arrayList2.size()) {
                residentDoorLineView2.c.invoke();
            } else {
                mof0 mof0Var2 = (mof0) arrayList2.get(i);
                mof0Var2.setOnDoorAppliedListener(residentDoorLineView2.c);
                mof0Var2.a(lof0.f20388a, residentDoorLineView2.d);
            }
        }
        H0().e.setVisibility(8);
    }

    public final void K0(ArrayList arrayList) {
        H0().e.setVisibility(0);
        H0().e.setOnSafeAppliedListener(new oof0(this, (byte) 3));
        H0().e.setSafesState(arrayList);
        H0().c.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object L0(ArrayList arrayList, boolean z, mrf0 mrf0Var, Function0 function0, zje zjeVar) {
        uof0 uof0Var;
        Object obj;
        if (zjeVar instanceof uof0) {
            uof0Var = (uof0) zjeVar;
            int i = uof0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                uof0Var.l = i - Integer.MIN_VALUE;
            } else {
                uof0Var = new uof0(this, zjeVar);
            }
        } else {
            uof0Var = new uof0(this, zjeVar);
        }
        Object obj2 = uof0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = uof0Var.l;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(obj2);
            mrf0 mrf0Var2 = (mrf0) CollectionsKt.f0(arrayList);
            boolean z2 = mrf0Var.d == qrf0.f;
            if (!z || mrf0Var2 == null || mrf0Var.c != mrf0Var2.c || z2) {
                function0.invoke();
            } else {
                uof0Var.i = (rer) function0;
                uof0Var.l = 1;
                if (qcc.O(1000L, uof0Var) == wneVar) {
                    return wneVar;
                }
                obj = function0;
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Object obj3 = (Function0) uof0Var.i;
        z1x.P(obj2);
        obj = obj3;
        H0().d.setVisibility(0);
        H0().d.setState(wqf0.e);
        H0().f.setMaxSmokeShowListener(new nof0(this, b));
        H0().f.setSmokeStartedListener(new b0c0(0, I0(), aqf0.class, "onSecondLifeStart", "onSecondLifeStart()V", 0, (byte) 20));
        H0().f.setSmokeFinishedListener(new gvb0(obj, this, (byte) 24));
        ResidentSmokeView residentSmokeView = H0().f;
        sje sjeVar = residentSmokeView.f46886a;
        ImageView imageView = residentSmokeView.b;
        Drawable drawable = imageView.getDrawable();
        drawable.getClass();
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        Iterator it = l1e0.o(0, animationDrawable.getNumberOfFrames()).iterator();
        int duration = 0;
        while (((kkx) it).c) {
            duration += animationDrawable.getDuration(((bkx) it).nextInt());
        }
        long j = duration;
        Drawable drawable2 = imageView.getDrawable();
        drawable2.getClass();
        AnimationDrawable animationDrawable2 = (AnimationDrawable) drawable2;
        Iterator it2 = l1e0.o(0, 2).iterator();
        int duration2 = 0;
        while (((kkx) it2).c) {
            duration2 += animationDrawable2.getDuration(((bkx) it2).nextInt());
        }
        qjj.W(sjeVar, null, null, new xrf0(residentSmokeView, j, (yje) null), 3);
        qjj.W(sjeVar, null, null, new xrf0(duration2, residentSmokeView, (yje) null), 3);
        residentSmokeView.setVisibility(0);
        Drawable drawable3 = imageView.getDrawable();
        drawable3.getClass();
        ((AnimationDrawable) drawable3).start();
        return Unit.f46060a;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
