package a;

import android.graphics.Bitmap;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class d4a extends w46 {
    public static final List o = q3d.j(1, 0);
    public static final List p = q3d.j(0, 1, 2);
    public static final List q = q3d.j(Float.valueOf(1.0f), Float.valueOf(1.5f));
    public final mne b;
    public final Size c;
    public bby d;
    public final ArrayList e;
    public final p7m0 f;
    public final p7m0 g;
    public final p7m0 h;
    public final ol60 i;
    public final p7m0 j;
    public final p7m0 k;
    public final p7m0 l;
    public final p7m0 m;
    public final p7m0 n;

    public d4a(i1w0 i1w0Var, mne mneVar, Size size) {
        i1w0Var.getClass();
        this.b = mneVar;
        this.c = size;
        this.e = new ArrayList();
        this.f = q7m0.a(new ez9(-1));
        this.g = q7m0.a(new wjq(0));
        this.h = q7m0.a(elu0.f8019a);
        this.i = new ol60(3);
        this.j = q7m0.a(e4a.f7172a);
        this.k = q7m0.a(null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        this.l = q7m0.a(new wub0(bitmapCreateBitmap, 0.0f, false, false));
        this.m = q7m0.a(new ike(false, R.drawable.ic_glyph_flash_auto, 0, 0, 1.0f, false, false, false, false, false, false, false));
        this.n = q7m0.a(new sa80(-360.0f, -360.0f, 0, 0));
    }

    public final void A() {
        Object next;
        p7m0 p7m0Var;
        Object value;
        ArrayList arrayList = this.e;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((j0a) next).h() != ((ez9) this.f.getValue()).f8661a);
        j0a j0aVar = (j0a) next;
        if (j0aVar == null) {
            w();
            return;
        }
        n2a n2aVarC = j0aVar.c();
        n2aVarC.getClass();
        f4a f4aVar = new f4a(n2aVarC);
        p7m0 p7m0Var2 = this.j;
        p7m0Var2.getClass();
        p7m0Var2.o(null, f4aVar);
        do {
            p7m0Var = this.m;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ike.a((ike) value, false, 0, 0, 0, 0.0f, j0aVar.m(), arrayList.size() > 1, j0aVar.m(), arrayList.size() > 1, true, 1055)));
    }

    public final void B() {
        p7m0 p7m0Var;
        Object value;
        p7m0 p7m0Var2 = this.j;
        p7m0Var2.getClass();
        p7m0Var2.o(null, e4a.f7172a);
        do {
            p7m0Var = this.m;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ike.a((ike) value, false, 0, 0, 0, 0.0f, false, false, false, false, false, 4094)));
    }

    public final void C(a1k0 a1k0Var) {
        sac.V(jiu0.a(this), new d69((byte) 7), null, this.b.b, new yp6(this, a1k0Var, null, (byte) 25), 10);
    }

    public final void w() {
        B();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        wub0 wub0Var = new wub0(bitmapCreateBitmap, 0.0f, false, false);
        p7m0 p7m0Var = this.l;
        p7m0Var.getClass();
        p7m0Var.o(null, wub0Var);
        ike ikeVar = new ike(false, R.drawable.ic_glyph_flash_auto, 0, 0, 1.0f, false, false, false, false, false, false, false);
        p7m0 p7m0Var2 = this.m;
        p7m0Var2.getClass();
        p7m0Var2.o(null, ikeVar);
        wjq wjqVar = new wjq(0);
        p7m0 p7m0Var3 = this.g;
        p7m0Var3.getClass();
        p7m0Var3.o(null, wjqVar);
        C(q0k0.f27904a);
    }

    public final void x() {
        p7m0 p7m0Var;
        Object value;
        yje yjeVar;
        bby bbyVar;
        p7m0 p7m0Var2 = this.j;
        p7m0Var2.getClass();
        p7m0Var2.o(null, g4a.f10655a);
        do {
            p7m0Var = this.m;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ike.a((ike) value, !((wub0) this.l.getValue()).c, 0, 0, 0, 0.0f, false, false, false, false, false, 4094)));
        bby bbyVar2 = this.d;
        if (bbyVar2 == null || !bbyVar2.isActive() || (bbyVar = this.d) == null) {
            yjeVar = null;
        } else {
            yjeVar = null;
            bbyVar.cancel(null);
        }
        this.d = sac.f0(jiu0.a(this), 2L, TimeUnit.SECONDS, this.b.b, null, new z3a(this, yjeVar, (byte) 0), 40);
    }

    public final void y(ArrayList arrayList) {
        Object next;
        j0a j0aVar;
        Object next2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (o.contains(Integer.valueOf(((j0a) obj).h()))) {
                arrayList2.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (hashSet.add(Integer.valueOf(((j0a) obj2).h()))) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            w();
            return;
        }
        ArrayList arrayList4 = this.e;
        arrayList4.addAll(0, arrayList3);
        p7m0 p7m0Var = this.f;
        if (((ez9) p7m0Var.getValue()).f8661a != -1) {
            Iterator it = arrayList4.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((j0a) next2).h() != ((ez9) p7m0Var.getValue()).f8661a);
            j0aVar = (j0a) next2;
            if (j0aVar == null) {
                j0aVar = (j0a) CollectionsKt.firstOrNull(arrayList4);
            }
        } else {
            Iterator it2 = arrayList4.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((j0a) next).h() != 1);
            j0aVar = (j0a) next;
            if (j0aVar == null) {
                j0aVar = (j0a) CollectionsKt.firstOrNull(arrayList4);
            }
        }
        if (j0aVar == null) {
            w();
            return;
        }
        ez9 ez9Var = new ez9(j0aVar.h());
        p7m0Var.getClass();
        p7m0Var.o(null, ez9Var);
        p7m0 p7m0Var2 = this.h;
        p7m0Var2.getClass();
        p7m0Var2.o(null, glu0.f11514a);
    }

    public final void z(boolean z) {
        p7m0 p7m0Var;
        Object value;
        p7m0 p7m0Var2;
        Object value2;
        if (z) {
            sac.V(jiu0.a(this), new y3a(this, (byte) 0), null, this.b.b, new z3a(this, null, (byte) 1), 10);
        } else {
            do {
                p7m0Var = this.l;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, wub0.a((wub0) value, false, 3)));
            do {
                p7m0Var2 = this.m;
                value2 = p7m0Var2.getValue();
            } while (!p7m0Var2.m(value2, ike.a((ike) value2, true, 0, 0, 0, 0.0f, false, false, false, false, false, 4094)));
        }
    }
}
