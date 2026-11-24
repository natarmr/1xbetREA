package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class v75 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36906a;
    public final ctf0 b;
    public final pt0 c;
    public final boolean d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;

    public v75(s75 s75Var, sff0 sff0Var, boolean z, ctf0 ctf0Var) {
        pt0 pt0Var;
        ctf0Var.getClass();
        this.f36906a = z;
        this.b = ctf0Var;
        hl1 hl1Var = sff0Var.b;
        int iOrdinal = hl1Var.l.ordinal();
        final byte b = 1;
        if (iOrdinal == 0) {
            pt0Var = pt0.f27539a;
        } else if (iOrdinal == 1) {
            pt0Var = pt0.b;
        } else if (iOrdinal == 2) {
            pt0Var = pt0.c;
        } else if (iOrdinal == 3) {
            pt0Var = pt0.d;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                throw null;
            }
            pt0Var = pt0.e;
        }
        this.c = pt0Var;
        this.d = hl1Var.C;
        final byte b2 = 0;
        n0o0 n0o0VarH = bkb.H(0);
        this.e = bkb.H(s75Var.f31733a);
        this.f = bkb.G(a().d, new Function1(this) { // from class: a.u75
            public final /* synthetic */ v75 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                v75 v75Var = this.b;
                switch (b3) {
                    case 0:
                        m65 m65Var = (m65) obj;
                        m65Var.getClass();
                        boolean z2 = m65Var.b;
                        pt0 pt0Var2 = v75Var.c;
                        xll xllVar = xll.f41078a;
                        if (z2) {
                            return new aml(pt0Var2, xllVar, true);
                        }
                        List<mlr> list = ((m65) v75Var.a().c()).c;
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (mlr mlrVar : list) {
                            arrayList.add(ccq0.Z(mlrVar, v75Var.b, v75Var.f36906a, v75Var.d, ((m65) v75Var.a().c()).e.contains(Long.valueOf(mlrVar.f22006a)), v75Var.c, null));
                        }
                        return new zll(pt0Var2, xllVar, arrayList);
                    default:
                        ((l7m0) obj).getClass();
                        if (((m65) v75Var.a().c()).f21251a) {
                            return new y75((mdm) ((fee) v75Var.h.getValue()).b());
                        }
                        return ((m65) v75Var.a().c()).d ? new x75((mdm) ((fee) v75Var.i.getValue()).b()) : new w75((bml) ((fee) v75Var.f.getValue()).b());
                }
            }
        });
        this.g = maz.b(new yw9(a().d, new Function1(this) { // from class: a.u75
            public final /* synthetic */ v75 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                v75 v75Var = this.b;
                switch (b3) {
                    case 0:
                        m65 m65Var = (m65) obj;
                        m65Var.getClass();
                        boolean z2 = m65Var.b;
                        pt0 pt0Var2 = v75Var.c;
                        xll xllVar = xll.f41078a;
                        if (z2) {
                            return new aml(pt0Var2, xllVar, true);
                        }
                        List<mlr> list = ((m65) v75Var.a().c()).c;
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (mlr mlrVar : list) {
                            arrayList.add(ccq0.Z(mlrVar, v75Var.b, v75Var.f36906a, v75Var.d, ((m65) v75Var.a().c()).e.contains(Long.valueOf(mlrVar.f22006a)), v75Var.c, null));
                        }
                        return new zll(pt0Var2, xllVar, arrayList);
                    default:
                        ((l7m0) obj).getClass();
                        if (((m65) v75Var.a().c()).f21251a) {
                            return new y75((mdm) ((fee) v75Var.h.getValue()).b());
                        }
                        return ((m65) v75Var.a().c()).d ? new x75((mdm) ((fee) v75Var.i.getValue()).b()) : new w75((bml) ((fee) v75Var.f.getValue()).b());
                }
            }
        }, (byte) 20));
        this.h = bkb.G(((fee) n0o0VarH.getValue()).d, new ij4((byte) 16));
        this.i = bkb.G(((fee) n0o0VarH.getValue()).d, new ij4((byte) 17));
    }

    public final fee a() {
        return (fee) this.e.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        s75 s75Var = (s75) obj;
        s75Var.getClass();
        a().d(s75Var.f31733a);
        return new t75(this.b.b.a(R.string.available_games_title, Arrays.copyOf(new Object[0], 0)), (z75) ((fee) this.g.getValue()).b());
    }
}
