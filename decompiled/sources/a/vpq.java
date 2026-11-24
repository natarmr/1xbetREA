package a;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vpq implements jot0, opt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1a f37817a;
    public final yd40 b;
    public final i7m0 c;
    public final tpt0 d;
    public final b4w0 e;
    public pot0 f;
    public Rational g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final boolean k;
    public final ArrayList l;
    public final ArrayList m;
    public odd n;
    public odd o;
    public c4m0 p;
    public c4m0 q;

    public vpq(l1a l1aVar, yd40 yd40Var, i7m0 i7m0Var, tpt0 tpt0Var, b4w0 b4w0Var) {
        ArrayList arrayList;
        Object next;
        l1aVar.getClass();
        i7m0Var.getClass();
        tpt0Var.getClass();
        this.f37817a = l1aVar;
        this.b = yd40Var;
        this.c = i7m0Var;
        this.d = tpt0Var;
        this.e = b4w0Var;
        c1a c1aVar = l1aVar.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        key.getClass();
        Object obj = 0;
        ow9 ow9Var = (ow9) c1aVar;
        ow9Var.getClass();
        Object objC = ow9Var.c(key);
        this.h = (Integer) (objC == null ? obj : objC);
        CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
        key2.getClass();
        ow9 ow9Var2 = (ow9) c1aVar;
        ow9Var2.getClass();
        Object objC2 = ow9Var2.c(key2);
        this.i = (Integer) (objC2 == null ? obj : objC2);
        CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_MAX_REGIONS_AWB;
        key3.getClass();
        ow9 ow9Var3 = (ow9) c1aVar;
        ow9Var3.getClass();
        Object objC3 = ow9Var3.c(key3);
        this.j = (Integer) (objC3 != null ? objC3 : 0);
        c1a.a0.getClass();
        this.k = b1a.a(c1aVar);
        CameraCharacteristics.Key key4 = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key4.getClass();
        int[] iArr = (int[]) ((ow9) c1aVar).c(key4);
        ArrayList arrayList2 = null;
        if (iArr != null) {
            arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                List list = z40.b;
                arrayList.add(dj8.U(i));
            }
        } else {
            arrayList = null;
        }
        this.l = arrayList;
        c1a c1aVar2 = this.f37817a.b;
        CameraCharacteristics.Key key5 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key5.getClass();
        int[] iArr2 = (int[]) ((ow9) c1aVar2).c(key5);
        if (iArr2 != null) {
            ArrayList arrayList3 = new ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                Iterator it = q70.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((q70) next).f28225a != i2);
                arrayList3.add((q70) next);
            }
            arrayList2 = arrayList3;
        }
        this.m = arrayList2;
    }

    @Override // a.opt0
    public final void a(LinkedHashSet linkedHashSet) {
        Size sizeC;
        this.g = null;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            fot0 fot0Var = (fot0) it.next();
            if ((fot0Var instanceof oub0) && (sizeC = ((oub0) fot0Var).c()) != null) {
                this.g = new Rational(sizeC.getWidth(), sizeC.getHeight());
            }
        }
    }

    @Override // a.jot0
    public final void b(pot0 pot0Var) {
        this.f = pot0Var;
    }

    public final Rational c() {
        Rational rational = this.g;
        if (rational != null) {
            return rational;
        }
        b4w0 b4w0Var = this.e;
        return new Rational(b4w0Var.r().width(), b4w0Var.r().height());
    }

    @Override // a.jot0
    public final void reset() {
        this.g = null;
        odd oddVar = new odd();
        pot0 pot0Var = this.f;
        if (pot0Var == null) {
            dw9.z("Camera is not active.", oddVar);
            return;
        }
        c4m0 c4m0Var = this.p;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.q;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        odd oddVar2 = this.o;
        if (oddVar2 != null) {
            dw9.z("Cancelled by another cancelFocusAndMetering()", oddVar2);
        }
        this.o = oddVar;
        odd oddVar3 = this.n;
        if (oddVar3 != null) {
            dw9.z("Cancelled by cancelFocusAndMetering()", oddVar3);
        }
        i7m0 i7m0Var = this.c;
        synchronized (i7m0Var.d) {
            i7m0Var.l = null;
        }
        i7m0Var.f();
        vzb.g0(pot0Var.d(), oddVar);
    }
}
