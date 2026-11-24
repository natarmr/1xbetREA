package a;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class l0a implements n0a, kft0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1a f19189a;
    public final fhn b;
    public final r2a c;
    public final ux9 d;
    public final i2a e;
    public final erm0 f;
    public final n0o0 g;
    public final n0o0 h;

    public l0a(l1a l1aVar, fhn fhnVar, r2a r2aVar, sy9 sy9Var, ux9 ux9Var, vpq vpqVar, i2a i2aVar, ewn ewnVar, erm0 erm0Var, jnx jnxVar, trm0 trm0Var) {
        String str;
        l1aVar.getClass();
        fhnVar.getClass();
        r2aVar.getClass();
        sy9Var.getClass();
        ux9Var.getClass();
        vpqVar.getClass();
        i2aVar.getClass();
        ewnVar.getClass();
        erm0Var.getClass();
        jnxVar.getClass();
        trm0Var.getClass();
        this.f19189a = l1aVar;
        this.b = fhnVar;
        this.c = r2aVar;
        this.d = ux9Var;
        this.e = i2aVar;
        this.f = erm0Var;
        c1a c1aVar = l1aVar.b;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        ow9 ow9Var = (ow9) c1aVar;
        ow9Var.getClass();
        Object objC = ow9Var.c(key);
        Integer num = (Integer) (objC != null ? objC : -1);
        final byte b = 1;
        final byte b2 = 2;
        if (num.intValue() == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (num.intValue() == 4) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else if (num.intValue() == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (num.intValue() == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (num.intValue() == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else {
            str = "Unknown value: " + num;
        }
        if (l8x.h0()) {
            Log.i("CXCP", "Device Level: ".concat(str));
        }
        final byte b3 = 0;
        maz.b(new Function0(this) { // from class: a.k0a
            public final /* synthetic */ l0a b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                l0a l0aVar = this.b;
                switch (b4) {
                    case 0:
                        l1a l1aVar2 = l0aVar.f19189a;
                        Set<g0a> set = (Set) ((ow9) l1aVar2.b).h.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (g0a g0aVar : set) {
                            String str2 = g0aVar.f10449a;
                            fhn fhnVar2 = new fhn(str2, (byte) 3);
                            ow9 ow9Var2 = (ow9) l1aVar2.b;
                            ow9Var2.getClass();
                            if (!((Set) ow9Var2.h.getValue()).contains(g0aVar)) {
                                throw new IllegalStateException((((Object) g0a.b(str2)) + " is not a valid physical camera on " + ow9Var2).toString());
                            }
                            linkedHashSet.add(new vm90(new l1a(fhnVar2, ow9Var2.c.a(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        b1a b1aVar = c1a.a0;
                        c1a c1aVar2 = l0aVar.f19189a.b;
                        b1aVar.getClass();
                        return Boolean.valueOf(b1a.c(c1aVar2));
                    default:
                        l1a l1aVar3 = l0aVar.f19189a;
                        l1aVar3.getClass();
                        mw9 mw9Var = new mw9();
                        String str3 = l1aVar3.f19240a.b;
                        return mw9Var;
                }
            }
        });
        this.g = maz.b(new Function0(this) { // from class: a.k0a
            public final /* synthetic */ l0a b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                l0a l0aVar = this.b;
                switch (b4) {
                    case 0:
                        l1a l1aVar2 = l0aVar.f19189a;
                        Set<g0a> set = (Set) ((ow9) l1aVar2.b).h.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (g0a g0aVar : set) {
                            String str2 = g0aVar.f10449a;
                            fhn fhnVar2 = new fhn(str2, (byte) 3);
                            ow9 ow9Var2 = (ow9) l1aVar2.b;
                            ow9Var2.getClass();
                            if (!((Set) ow9Var2.h.getValue()).contains(g0aVar)) {
                                throw new IllegalStateException((((Object) g0a.b(str2)) + " is not a valid physical camera on " + ow9Var2).toString());
                            }
                            linkedHashSet.add(new vm90(new l1a(fhnVar2, ow9Var2.c.a(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        b1a b1aVar = c1a.a0;
                        c1a c1aVar2 = l0aVar.f19189a.b;
                        b1aVar.getClass();
                        return Boolean.valueOf(b1a.c(c1aVar2));
                    default:
                        l1a l1aVar3 = l0aVar.f19189a;
                        l1aVar3.getClass();
                        mw9 mw9Var = new mw9();
                        String str3 = l1aVar3.f19240a.b;
                        return mw9Var;
                }
            }
        });
        this.h = maz.b(new Function0(this) { // from class: a.k0a
            public final /* synthetic */ l0a b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b2;
                l0a l0aVar = this.b;
                switch (b4) {
                    case 0:
                        l1a l1aVar2 = l0aVar.f19189a;
                        Set<g0a> set = (Set) ((ow9) l1aVar2.b).h.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (g0a g0aVar : set) {
                            String str2 = g0aVar.f10449a;
                            fhn fhnVar2 = new fhn(str2, (byte) 3);
                            ow9 ow9Var2 = (ow9) l1aVar2.b;
                            ow9Var2.getClass();
                            if (!((Set) ow9Var2.h.getValue()).contains(g0aVar)) {
                                throw new IllegalStateException((((Object) g0a.b(str2)) + " is not a valid physical camera on " + ow9Var2).toString());
                            }
                            linkedHashSet.add(new vm90(new l1a(fhnVar2, ow9Var2.c.a(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        b1a b1aVar = c1a.a0;
                        c1a c1aVar2 = l0aVar.f19189a.b;
                        b1aVar.getClass();
                        return Boolean.valueOf(b1a.c(c1aVar2));
                    default:
                        l1a l1aVar3 = l0aVar.f19189a;
                        l1aVar3.getClass();
                        mw9 mw9Var = new mw9();
                        String str3 = l1aVar3.f19240a.b;
                        return mw9Var;
                }
            }
        });
    }

    @Override // a.j0a
    public final String A() {
        return ((Boolean) this.g.getValue()).booleanValue() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // a.j0a
    public final int B(int i) {
        c1a c1aVar = this.f19189a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object objC = ((ow9) c1aVar).c(key);
        objC.getClass();
        return hp4.H(hp4.K(i), ((Number) objC).intValue(), 1 == h());
    }

    @Override // a.n0a
    public final Set G() {
        Set setL0;
        Integer[] numArrG = this.f.d.g();
        return (numArrG == null || (setL0 = tx3.l0(numArrG)) == null) ? xun.f41520a : setL0;
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        tre0 tre0Var = sre0.f32672a;
        if (sgyVar.equals(tre0Var.b(mw9.class))) {
            mw9 mw9Var = (mw9) this.h.getValue();
            mw9Var.getClass();
            return mw9Var;
        }
        boolean zEquals = sgyVar.equals(tre0Var.b(l1a.class));
        l1a l1aVar = this.f19189a;
        if (zEquals) {
            l1aVar.getClass();
            return l1aVar;
        }
        if (!sgyVar.equals(tre0Var.b(c1a.class))) {
            return ((ow9) l1aVar.b).H(sgyVar);
        }
        c1a c1aVar = l1aVar.b;
        c1aVar.getClass();
        return c1aVar;
    }

    @Override // a.n0a
    public final boolean M() {
        b1a b1aVar = c1a.a0;
        c1a c1aVar = this.f19189a.b;
        b1aVar.getClass();
        return b1a.b(c1aVar);
    }

    @Override // a.n0a
    public final Set a() {
        return ((dgn) mbc.T(this.f19189a.b).b).a();
    }

    @Override // a.j0a
    public final wh00 b() {
        return this.c.c;
    }

    @Override // a.j0a
    public final int d() {
        return B(0);
    }

    @Override // a.n0a
    public final String e() {
        return this.b.b;
    }

    @Override // a.n0a
    public final void f(vx9 vx9Var) {
        vx9Var.getClass();
        ux9 ux9Var = this.d;
        ux9Var.getClass();
        synchronized (ux9Var.f36429a) {
            ux9Var.f36429a.remove(vx9Var);
            ux9Var.c = xp20.n(ux9Var.f36429a);
        }
    }

    @Override // a.n0a
    public final Rect g() {
        c1a c1aVar = this.f19189a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Rect rect = (Rect) ((ow9) c1aVar).c(key);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // a.j0a
    public final int h() {
        c1a c1aVar = this.f19189a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object objC = ((ow9) c1aVar).c(key);
        objC.getClass();
        int iIntValue = ((Number) objC).intValue();
        if (iIntValue == 0) {
            return 0;
        }
        int i = 1;
        if (iIntValue != 1) {
            i = 2;
            if (iIntValue != 2) {
                if (!l8x.j0()) {
                    return -1;
                }
                Log.w("CXCP", "Unrecognized lens facing: " + iIntValue + '!');
                return -1;
            }
        }
        return i;
    }

    @Override // a.n0a
    public final List i(int i) {
        List listG0;
        Size[] sizeArrA = this.f.a(i);
        return (sizeArrA == null || (listG0 = tx3.g0(sizeArrA)) == null) ? iun.f15405a : listG0;
    }

    @Override // a.n0a
    public final Object j() {
        Object objH = ((ow9) this.f19189a.b).H(sre0.f32672a.b(CameraCharacteristics.class));
        objH.getClass();
        return (CameraCharacteristics) objH;
    }

    @Override // a.j0a
    public final boolean m() {
        return lgb.c0(this.f19189a);
    }

    @Override // a.n0a
    public final kpd0 o() {
        return this.e.a();
    }

    @Override // a.n0a
    public final List p(int i) {
        List listG0;
        Size[] sizeArrB = this.f.b(i);
        return (sizeArrB == null || (listG0 = tx3.g0(sizeArrB)) == null) ? iun.f15405a : listG0;
    }

    @Override // a.n0a
    public final Set s() {
        Set setK0;
        c1a c1aVar = this.f19189a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((ow9) c1aVar).c(key);
        return (iArr == null || (setK0 = tx3.k0(iArr)) == null) ? xun.f41520a : setK0;
    }

    @Override // a.n0a
    public final boolean t() {
        c1a c1aVar = this.f19189a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        key.getClass();
        int[] iArr = (int[]) ((ow9) c1aVar).c(key);
        return iArr != null && tx3.w(iArr, 1);
    }

    public final String toString() {
        return "CameraInfoAdapter<" + this.b + ".cameraId>";
    }

    @Override // a.n0a
    public final void z(Executor executor, yub0 yub0Var) {
        executor.getClass();
        this.d.b(yub0Var, executor);
    }
}
