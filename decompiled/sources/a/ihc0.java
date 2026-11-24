package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ihc0 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final vzg0 o;
    public final uf3 p;
    public final b4j q;
    public final x20 r;
    public final oeg0 s;
    public final xex t;
    public final h4k u;
    public final mrt v;
    public final nou w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihc0(vzg0 vzg0Var, uf3 uf3Var, b4j b4jVar, x20 x20Var, oeg0 oeg0Var, mne mneVar, xex xexVar, h4k h4kVar, mrt mrtVar, nou nouVar, ctf0 ctf0Var, vgc0 vgc0Var, pru pruVar) {
        super(null, new mr0(pruVar, vgc0Var, vzg0Var, ctf0Var, (byte) 25), new wyb0((byte) 22), cvm0.p(mneVar.c, mneVar.f22085a), null);
        oeg0Var.getClass();
        ctf0Var.getClass();
        this.o = vzg0Var;
        this.p = uf3Var;
        this.q = b4jVar;
        this.r = x20Var;
        this.s = oeg0Var;
        this.t = xexVar;
        this.u = h4kVar;
        this.v = mrtVar;
        this.w = nouVar;
        sac.V(jiu0.a(this), new wyb0((byte) 23), null, mneVar.b, new er60((Object) this, (yje) null, (byte) 21), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        vgc0 vgc0Var;
        Object value2;
        String str;
        tgc0 tgc0Var = (tgc0) obj;
        tgc0Var.getClass();
        super.x(tgc0Var);
        boolean z = tgc0Var instanceof rgc0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        x20 x20Var = this.r;
        if (z) {
            int i = ((rgc0) tgc0Var).f30427a;
            vgc0.b.getClass();
            if (i == 0) {
                vgc0Var = vgc0.PROMO_SHOP;
            } else {
                if (i != 1) {
                    e9d0.o();
                    return;
                }
                vgc0Var = vgc0.PROMO_LIST;
            }
            vgc0 vgc0Var2 = vgc0Var;
            this.o.e("KEY_CURRENT_TAB", vgc0Var2);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, kgc0.a((kgc0) value2, vgc0Var2, "", 246)));
            int iOrdinal = vgc0Var2.ordinal();
            if (iOrdinal == 0) {
                str = "shop";
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                str = "my_promo";
            }
            b4j b4jVar = this.q;
            b4jVar.getClass();
            i8i.D("point", str, b4jVar.f1961a, "promo_codes_menu_call");
            if (i == 0) {
                b1j.v("shop", x20Var.f40143a, 3304L);
                return;
            } else {
                if (i != 1) {
                    return;
                }
                b1j.v("my_promo", x20Var.f40143a, 3304L);
                return;
            }
        }
        boolean z2 = tgc0Var instanceof pgc0;
        oeg0 oeg0Var = this.s;
        if (z2) {
            i1w0 i1w0VarC = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!(tgc0Var instanceof qgc0)) {
                if (!(tgc0Var instanceof sgc0)) {
                    if (tgc0Var instanceof ogc0) {
                        E();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, kgc0.a((kgc0) value, null, ((sgc0) tgc0Var).f32154a, 247)));
                return;
            }
            x20Var.f40143a.a(xun.f41520a, 3312L);
            i1w0 i1w0VarC2 = oeg0Var.c();
            i1w0VarC2.getClass();
            k0w0 k0w0Var = new k0w0(i1w0VarC2);
            k0w0Var.h(tf3.a(this.p, "rule_section_promo", null, 38));
            ListIterator listIteratorO = b1j.o(i1w0VarC2, k0w0Var.f17489a, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
