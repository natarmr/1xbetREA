package a;

import android.util.Log;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;

/* JADX INFO: loaded from: classes.dex */
public final class ebi implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cbi f7519a;
    public final dbi b;
    public final qv2 c;
    public final byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public ebi(cbi cbiVar, dbi dbiVar, qv2 qv2Var, int i) {
        this.f7519a = cbiVar;
        this.b = dbiVar;
        this.c = qv2Var;
        this.d = i;
    }

    @Override // a.o5d0
    public final Object get() {
        dqt0 dqt0Var;
        cbi cbiVar = this.f7519a;
        qv2 qv2Var = this.c;
        dbi dbiVar = this.b;
        byte b = this.d;
        switch (b) {
            case 0:
                kpt0 kpt0Var = (kpt0) ((n5d0) qv2Var.c).get();
                tpt0 tpt0Var = (tpt0) ((n5d0) dbiVar.k).get();
                if (((n5d0) qv2Var.d).get() == null) {
                    return new mot0(kpt0Var, tpt0Var, (pot0) ((n5d0) qv2Var.m).get(), (n5d0) qv2Var.k, (n5d0) qv2Var.j, (n5d0) qv2Var.i);
                }
                hny.b();
                return null;
            case 1:
                iot0 iot0Var = (iot0) qv2Var.b;
                r2a r2aVar = (r2a) ((n5d0) dbiVar.y).get();
                iot0Var.getClass();
                r2aVar.getClass();
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                }
                return new kpt0(new got0(iot0Var, (byte) 0), r2aVar, iot0Var.b, new got0(iot0Var, (byte) 1));
            case 2:
                ((iot0) qv2Var.b).getClass();
                return null;
            case 3:
                return new rzj((n5d0) qv2Var.l, (tpt0) ((n5d0) dbiVar.k).get());
            case 4:
                return new xot0((n5d0) qv2Var.i, (n5d0) qv2Var.f, (kpt0) ((n5d0) qv2Var.c).get(), (n5d0) qv2Var.k, (tpt0) ((n5d0) dbiVar.k).get(), (l4a) cbiVar.f4062a.f);
            case 5:
                n5d0 n5d0Var = (n5d0) qv2Var.g;
                n5d0 n5d0Var2 = (n5d0) qv2Var.h;
                n5d0Var.getClass();
                n5d0Var2.getClass();
                if (i9a.f) {
                    Object obj = n5d0Var2.get();
                    obj.getClass();
                    return (f8a) obj;
                }
                Object obj2 = n5d0Var.get();
                obj2.getClass();
                return (f8a) obj2;
            case 6:
                v7a v7aVar = (v7a) ((n5d0) qv2Var.e).get();
                vjq vjqVar = (vjq) ((n5d0) dbiVar.r).get();
                dgr0 dgr0Var = (dgr0) ((n5d0) dbiVar.q).get();
                ufu0 ufu0Var = (ufu0) ((n5d0) dbiVar.u).get();
                tpt0 tpt0Var2 = (tpt0) ((n5d0) dbiVar.k).get();
                p7d p7dVar = (p7d) ((n5d0) dbiVar.m).get();
                i2a i2aVar = (i2a) ((n5d0) dbiVar.j).get();
                zy9 zy9VarA = ((cbi) dbiVar.c).a();
                jnx jnxVar = (jnx) ((n5d0) dbiVar.D).get();
                i2aVar.getClass();
                jnxVar.getClass();
                if (i2aVar.a().a(UseTorchAsFlashQuirk.class)) {
                    h0q0 h0q0Var = new h0q0();
                    h0q0Var.f12247a = i2aVar;
                    h0q0Var.b = zy9VarA;
                    h0q0Var.c = jnxVar;
                    h0q0Var.d = maz.b(new rbt0(h0q0Var, (byte) 3));
                    dqt0Var = h0q0Var;
                } else {
                    dqt0Var = ujn.x;
                }
                return new g9a(v7aVar, vjqVar, dgr0Var, ufu0Var, tpt0Var2, p7dVar, dqt0Var, (l1a) ((n5d0) dbiVar.e).get(), (n5d0) qv2Var.f, (kpt0) ((n5d0) qv2Var.c).get());
            case 7:
                return new v7a((l1a) ((n5d0) dbiVar.e).get(), (kpt0) ((n5d0) qv2Var.c).get(), (f4w0) ((n5d0) dbiVar.f).get(), (tpt0) ((n5d0) dbiVar.k).get(), dbiVar.A());
            case 8:
                return new cpt0((kpt0) ((n5d0) qv2Var.c).get(), dbiVar.A());
            case 9:
                return new i9a((l1a) ((n5d0) dbiVar.e).get(), (n5d0) qv2Var.g, (tpt0) ((n5d0) dbiVar.k).get(), (dgr0) ((n5d0) dbiVar.q).get());
            case 10:
                tpt0 tpt0Var3 = (tpt0) ((n5d0) dbiVar.k).get();
                m1a m1aVar = (m1a) cbiVar.f4062a.c;
                x1x.y(m1aVar);
                i2a i2aVar2 = (i2a) ((n5d0) dbiVar.j).get();
                i2aVar2.getClass();
                kpd0 kpd0VarA = i2aVar2.a();
                return new spt0(tpt0Var3, m1aVar, (kpd0VarA.a(ConfigureSurfaceToSecondarySessionFailQuirk.class) || kpd0VarA.a(PreviewOrientationIncorrectQuirk.class) || kpd0VarA.a(TextureViewIsClosedQuirk.class)) ? new ieu((byte) 18) : jtv.r, (zii0) ((n5d0) qv2Var.j).get());
            case 11:
                return ((iot0) qv2Var.b).c;
            default:
                c99.h(b);
                return null;
        }
    }
}
