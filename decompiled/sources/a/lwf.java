package a;

import android.animation.ObjectAnimator;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.text.Charsets;
import okhttp3.RequestBody;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class lwf implements lz4, w58, vke, psd, kotlin.coroutines.f, tlu0, k3p, lkq, k3z, qgk0, vpt0, qv90, l3u0, mhi0, idk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20761a;
    public static final lwf b = new lwf(1);
    public static final lwf c = new lwf(3);
    public static final lwf d = new lwf(4);
    public static final lwf e = new lwf(5);
    public static final ek5 f = new ek5(13);
    public static final lwf g = new lwf(7);
    public static final /* synthetic */ lwf h = new lwf(8);
    public static final lwf i = new lwf(9);
    public static final lwf j = new lwf(10);
    public static final lwf k = new lwf(11);
    public static final lwf l = new lwf(12);
    public static final lwf m = new lwf(13);
    public static final /* synthetic */ lwf n = new lwf(14);
    public static final lwf o = new lwf(15);
    public static final lwf p = new lwf(16);
    public static final lwf q = new lwf(17);
    public static final ek5 r = new ek5(29);
    public static final pn20 s = new pn20(2);
    public static final /* synthetic */ lwf t = new lwf(20);
    public static final lwf u = new lwf(21);
    public static final lwf v = new lwf(22);
    public static final lwf w = new lwf(23);
    public static final lwf x = new lwf(24);
    public static final lwf y = new lwf(25);
    public static final lwf z = new lwf(27);
    public static final lwf A = new lwf(28);
    public static final dji0 B = new dji0(null, null, null, null, null);
    public static final lwf Y = new lwf(29);

    public /* synthetic */ lwf(byte b2) {
        this.f20761a = b2;
    }

    public static gm40 a(k3d0 k3d0Var) {
        int i2 = k3d0Var == null ? -1 : u4d0.f35041a[k3d0Var.ordinal()];
        if (i2 == 1) {
            return gm40.b;
        }
        if (i2 == 2) {
            return gm40.d;
        }
        if (i2 != 3) {
            return i2 != 4 ? gm40.b : gm40.c;
        }
        return gm40.e;
    }

    public static void c(View view) {
        f33 f33Var = new f33((byte) 3);
        clz clzVarL = s7n0.l(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, (view.getContext().getResources().getDisplayMetrics().heightPixels + ((int) view.getContext().getResources().getDimension(R.dimen.padding_triple))) - view.getTop());
        objectAnimatorOfFloat.addListener(unh0.h0(clzVarL, null, new kk0(view, clzVarL, f33Var, (byte) 5), 11));
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.start();
    }

    @Override // a.mhi0
    public Object G() {
        return B;
    }

    @Override // a.lz4
    public int b() {
        return 1;
    }

    @Override // a.mhi0
    public Unit b0(Object obj, k7t0 k7t0Var) throws IOException {
        byte[] bytes = vby.d.d(dji0.Companion.serializer(), (dji0) obj).getBytes(Charsets.UTF_8);
        bytes.getClass();
        k7t0Var.f17840a.write(bytes);
        return Unit.f46060a;
    }

    @Override // a.tlu0
    public View e(View view, AttributeSet attributeSet) {
        view.getClass();
        attributeSet.getClass();
        return view;
    }

    @Override // a.qv90
    public boolean f(wm40 wm40Var, sfk sfkVar) {
        wm40Var.getClass();
        return !sfkVar.getAnnotations().z0(rv90.f31158a);
    }

    @Override // a.mhi0
    public Object f0(FileInputStream fileInputStream) throws soe {
        try {
            uby ubyVar = vby.d;
            String strM = kotlin.text.c.m(wha0.S(fileInputStream));
            ubyVar.getClass();
            return (dji0) ubyVar.b(dji0.Companion.serializer(), strM);
        } catch (Exception e2) {
            throw new soe("Cannot parse session configs", e2);
        }
    }

    @Override // a.vpt0
    public boolean h() {
        return false;
    }

    @Override // a.lkq
    public wsy h0(a4d0 a4d0Var, String str, kzj0 kzj0Var, kzj0 kzj0Var2) {
        a4d0Var.getClass();
        str.getClass();
        kzj0Var.getClass();
        kzj0Var2.getClass();
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // a.vke
    public Object o(Object obj) {
        return (RequestBody) obj;
    }

    public String toString() {
        switch (this.f20761a) {
            case 22:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    @Override // a.l3u0
    public Object z0(ndy ndyVar, float f2) {
        boolean z2 = ndyVar.w() == 1;
        if (z2) {
            ndyVar.a();
        }
        float fQ = (float) ndyVar.q();
        float fQ2 = (float) ndyVar.q();
        while (ndyVar.l()) {
            ndyVar.H();
        }
        if (z2) {
            ndyVar.d();
        }
        return new m1h0((fQ / 100.0f) * f2, (fQ2 / 100.0f) * f2);
    }
}
