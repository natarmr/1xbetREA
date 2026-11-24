package a;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class t190 extends w46 {
    public final i1w0 b;
    public final vzg0 c;
    public final jrc d;
    public final jrc e;
    public final jrc f;
    public final joc g;
    public final iqt h;
    public final rou i;
    public final m1e j;
    public final pru k;
    public final duj l;
    public final mne m;
    public final yfu n;
    public final reu o;
    public final we50 p;
    public final p7m0 q;
    public final n0o0 r;
    public final p7m0 s;
    public final p7m0 t;
    public final ol60 u;
    public final p7m0 v;
    public c4m0 w;
    public c4m0 x;

    public t190(i1w0 i1w0Var, vzg0 vzg0Var, jrc jrcVar, ctf0 ctf0Var, jrc jrcVar2, jrc jrcVar3, joc jocVar, iqt iqtVar, rou rouVar, m1e m1eVar, pru pruVar, duj dujVar, mne mneVar, yfu yfuVar, reu reuVar, we50 we50Var) {
        Object value;
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = i1w0Var;
        this.c = vzg0Var;
        this.d = jrcVar;
        this.e = jrcVar2;
        this.f = jrcVar3;
        this.g = jocVar;
        this.h = iqtVar;
        this.i = rouVar;
        this.j = m1eVar;
        this.k = pruVar;
        this.l = dujVar;
        this.m = mneVar;
        this.n = yfuVar;
        this.o = reuVar;
        this.p = we50Var;
        p7m0 p7m0VarA = q7m0.a(Boolean.TRUE);
        this.q = p7m0VarA;
        final byte b = 0;
        this.r = maz.b(new Function0(this) { // from class: a.g190
            public final /* synthetic */ t190 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object value2;
                byte b2 = b;
                t190 t190Var = this.b;
                switch (b2) {
                    case 0:
                        vzg0 vzg0Var2 = t190Var.c;
                        Integer num = (Integer) vzg0Var2.a("SAVED_PROCEED_TITLE");
                        int iIntValue = num != null ? num.intValue() : R.string.next;
                        Integer num2 = (Integer) vzg0Var2.a("SAVED_VP_SIZE");
                        return q7m0.a(new n190(iIntValue, num2 != null ? num2.intValue() : R.dimen.size_160, false));
                    default:
                        p7m0 p7m0Var = t190Var.q;
                        do {
                            value2 = p7m0Var.getValue();
                            ((Boolean) value2).getClass();
                        } while (!p7m0Var.m(value2, Boolean.FALSE));
                        return Unit.f46060a;
                }
            }
        });
        this.s = q7m0.a(new l190(iun.f15405a, false));
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.restore_password_by_phone, Arrays.copyOf(new Object[0], 0));
        bwh0 bwh0Var = bwh0.f3325a;
        this.t = q7m0.a(new m190(0, dyb.g0(new yvh0(strA, bwh0Var), new yvh0(lsm0Var.a(R.string.restore_by_email, Arrays.copyOf(new Object[0], 0)), bwh0Var)), axh0.f1625a));
        this.u = new ol60(3);
        this.v = q7m0.a(Boolean.FALSE);
        yje yjeVar = null;
        byte b2 = 2;
        sac.V(jiu0.a(this), q190.f27942a, null, mneVar.f22085a, new o190(this, yjeVar, b2), 10);
        do {
            value = p7m0VarA.getValue();
            ((Boolean) value).getClass();
        } while (!p7m0VarA.m(value, Boolean.TRUE));
        final byte b3 = 1;
        sac.V(jiu0.a(this), new yr80(this, b2), new Function0(this) { // from class: a.g190
            public final /* synthetic */ t190 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object value2;
                byte b4 = b3;
                t190 t190Var = this.b;
                switch (b4) {
                    case 0:
                        vzg0 vzg0Var2 = t190Var.c;
                        Integer num = (Integer) vzg0Var2.a("SAVED_PROCEED_TITLE");
                        int iIntValue = num != null ? num.intValue() : R.string.next;
                        Integer num2 = (Integer) vzg0Var2.a("SAVED_VP_SIZE");
                        return q7m0.a(new n190(iIntValue, num2 != null ? num2.intValue() : R.dimen.size_160, false));
                    default:
                        p7m0 p7m0Var = t190Var.q;
                        do {
                            value2 = p7m0Var.getValue();
                            ((Boolean) value2).getClass();
                        } while (!p7m0Var.m(value2, Boolean.FALSE));
                        return Unit.f46060a;
                }
            }
        }, this.m.b, new c670(this, yjeVar, (byte) 11), 8);
    }

    public final List w(boolean z) {
        String str = ((d190) this.e.f16997a.f10448a).c;
        int i = ((d190) this.g.f16851a.f10448a).d;
        ((d190) this.d.f16997a.f10448a).getClass();
        vzf0 vzf0Var = new vzf0(i, str);
        uzf0 uzf0Var = new uzf0();
        pru pruVar = this.k;
        boolean z2 = !pruVar.a().N.f || pruVar.a().k.f;
        if (z) {
            return kotlin.collections.a.c(vzf0Var);
        }
        return z2 ? kotlin.collections.a.c(uzf0Var) : q3d.j(vzf0Var, uzf0Var);
    }

    public final void x() {
        d190 d190Var = (d190) this.f.f16997a.f10448a;
        d190Var.c = "";
        d190Var.d = Integer.MIN_VALUE;
        d190Var.e = pwf0.f27709a;
        i1w0 i1w0Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
