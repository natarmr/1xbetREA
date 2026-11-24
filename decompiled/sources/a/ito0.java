package a;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ito0 implements iwq {
    public final g2v b;
    public dgu c;
    public snf0 d;
    public final ArrayList e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f15364a = new ArrayDeque();
    public boolean f = false;

    public ito0(g2v g2vVar) {
        ofm0.m();
        this.b = g2vVar;
        this.e = new ArrayList();
    }

    @Override // a.iwq
    public final void a(jwq jwqVar) {
        ((lmv) j120.T()).execute(new hto0(this, (byte) 1));
    }

    public final void b() {
        ofm0.m();
        ozw ozwVar = new ozw(3, "Camera is closed.", null);
        ArrayDeque<o55> arrayDeque = this.f15364a;
        for (o55 o55Var : arrayDeque) {
            o55Var.c.execute(new apj0(o55Var, ozwVar));
        }
        arrayDeque.clear();
        for (snf0 snf0Var : new ArrayList(this.e)) {
            snf0Var.getClass();
            ofm0.m();
            if (!snf0Var.d.b.isDone()) {
                ofm0.m();
                snf0Var.g = true;
                qbb qbbVar = snf0Var.i;
                Objects.requireNonNull(qbbVar);
                qbbVar.cancel(true);
                snf0Var.e.d(ozwVar);
                snf0Var.f.b(null);
                ofm0.m();
                o55 o55Var2 = snf0Var.f32492a;
                o55Var2.c.execute(new apj0(o55Var2, ozwVar));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        wu9 wu9Var;
        vx9 vx9Var;
        o3x o3xVar;
        ofm0.m();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.d != null) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.f) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        dgu dguVar = this.c;
        dguVar.getClass();
        ofm0.m();
        if (((esg0) dguVar.c).U() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        o55 o55Var = (o55) this.f15364a.poll();
        if (o55Var == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        snf0 snf0Var = new snf0(o55Var, this);
        byte b = 0;
        boolean z = true;
        z1x.y(null, !(this.d != null));
        this.d = snf0Var;
        ofm0.m();
        snf0Var.c.b.a(new hto0(this, b), bnk.a());
        this.e.add(snf0Var);
        ofm0.m();
        snf0Var.d.b.a(new oh60(this, snf0Var, (byte) 28), bnk.a());
        dgu dguVar2 = this.c;
        ofm0.m();
        wu9 wu9Var2 = snf0Var.c;
        dguVar2.getClass();
        ofm0.m();
        s7a s7aVar = (s7a) ((nzw) dguVar2.f6058a).e(nzw.d, new s7a(Arrays.asList(new t9a())));
        Objects.requireNonNull(s7aVar);
        int i = dgu.e;
        dgu.e = i + 1;
        r15 r15Var = (r15) dguVar2.d;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(s7aVar.hashCode());
        List<t9a> list = s7aVar.f31740a;
        Objects.requireNonNull(list);
        for (t9a t9aVar : list) {
            ucs0 ucs0Var = new ucs0((byte) 2);
            t7a t7aVar = (t7a) dguVar2.b;
            byte b2 = b;
            ucs0Var.b = t7aVar.c;
            ucs0Var.g(t7aVar.b);
            ucs0Var.e(o55Var.k);
            o3x o3xVar2 = r15Var.c;
            int i2 = r15Var.g;
            ArrayList arrayList2 = r15Var.h;
            Objects.requireNonNull(o3xVar2);
            dgu dguVar3 = dguVar2;
            ((HashSet) ucs0Var.c).add(o3xVar2);
            if (arrayList2.size() > 1 && (o3xVar = r15Var.d) != null) {
                ((HashSet) ucs0Var.c).add(o3xVar);
            }
            o3x o3xVar3 = r15Var.e;
            if ((o3xVar3 != null ? (byte) 1 : b2) != 0) {
                Objects.requireNonNull(o3xVar3);
                ((HashSet) ucs0Var.c).add(o3xVar3);
            }
            if (m2x.x(i2) || i2 == 32) {
                if (((ImageCaptureRotationOptionQuirk) khk.f18297a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                    u15 u15Var = t7a.f;
                } else {
                    ((wy40) ucs0Var.d).y(t7a.f, Integer.valueOf(o55Var.g));
                }
                u15 u15Var2 = t7a.g;
                Rect rect = o55Var.e;
                Size size = r15Var.f;
                RectF rectF = jls0.f16733a;
                if (rect.left == 0 && rect.top == 0) {
                    wu9Var = wu9Var2;
                    if (rect.width() == size.getWidth()) {
                        rect.height();
                        size.getHeight();
                    }
                } else {
                    wu9Var = wu9Var2;
                }
                ((wy40) ucs0Var.d).y(u15Var2, Integer.valueOf(o55Var.h));
            } else {
                wu9Var = wu9Var2;
            }
            ucs0Var.g(t9aVar.f33552a.b);
            ((tz40) ucs0Var.f).f8147a.put(strValueOf, Integer.valueOf(b2));
            ((tz40) ucs0Var.f).f8147a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i));
            ucs0Var.f(r15Var.f29660a);
            if (arrayList2.size() > 1 && (vx9Var = r15Var.b) != null) {
                ucs0Var.f(vx9Var);
            }
            arrayList.add(ucs0Var.j());
            z = true;
            b = b2;
            dguVar2 = dguVar3;
            s7aVar = s7aVar;
            wu9Var2 = wu9Var;
        }
        byte b3 = b;
        boolean z2 = z;
        xr xrVar = new xr(arrayList, snf0Var);
        dzb0 dzb0Var = new dzb0(s7aVar, o55Var, snf0Var, wu9Var2, i);
        dgu dguVar4 = this.c;
        dguVar4.getClass();
        ofm0.m();
        ((r15) dguVar4.d).j.accept(dzb0Var);
        ofm0.m();
        mzw mzwVar = (mzw) this.b.f10580a;
        synchronized (mzwVar.s) {
            try {
                if (mzwVar.s.get() == null) {
                    mzwVar.s.set(Integer.valueOf(mzwVar.I()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mzw mzwVar2 = (mzw) this.b.f10580a;
        ofm0.m();
        qbb qbbVarK0 = ro4.k0(mzwVar2.e().h(arrayList, mzwVar2.r, mzwVar2.t), new a1d((Object) new ohq((byte) 20), (byte) 26), bnk.a());
        qbbVarK0.a(new mfr(qbbVarK0, new fuj0(this, xrVar), b3), j120.T());
        ofm0.m();
        if (snf0Var.i != null) {
            z2 = b3;
        }
        z1x.y("CaptureRequestFuture can only be set once.", z2);
        snf0Var.i = qbbVarK0;
    }
}
