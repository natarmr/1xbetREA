package a;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class m1l0 extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final ctf0 o;
    public final i1w0 p;
    public final duj q;
    public final cmt r;
    public final f4u s;
    public final drm0 t;
    public final ouu u;
    public final bzs0 v;
    public final gle0 w;
    public final mne x;
    public bby y;

    public m1l0(vzg0 vzg0Var, ctf0 ctf0Var, i1w0 i1w0Var, duj dujVar, cmt cmtVar, f4u f4uVar, drm0 drm0Var, ouu ouuVar, bzs0 bzs0Var, g2v g2vVar, gle0 gle0Var, m1e m1eVar, mne mneVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        j1l0 j1l0Var = new j1l0(m1eVar, (byte) 0);
        o20 o20Var = new o20(ctf0Var, g2vVar, (byte) 25);
        dvj dvjVar = mneVar.b;
        super(vzg0Var, j1l0Var, o20Var, cvm0.p(dvjVar, dvjVar));
        this.o = ctf0Var;
        this.p = i1w0Var;
        this.q = dujVar;
        this.r = cmtVar;
        this.s = f4uVar;
        this.t = drm0Var;
        this.u = ouuVar;
        this.v = bzs0Var;
        this.w = gle0Var;
        this.x = mneVar;
        J(new fnq(m1eVar.b(), new l1l0(this, null, (byte) 0), (byte) 4), dvjVar, new ejk0((byte) 21));
    }

    public final void M(Throwable th) {
        boolean z2 = th instanceof zhi0;
        ctf0 ctf0Var = this.o;
        if (!z2) {
            this.q.a(th);
            N(R.string.error, ctf0Var.b.a(R.string.service_currently_unavailable, Arrays.copyOf(new Object[0], 0)), R.string.back_text, n12.b);
        } else {
            if (((zhi0) th).c != i2o.UnknownError) {
                N(R.string.error, ctf0Var.b.a(R.string.service_currently_unavailable, Arrays.copyOf(new Object[0], 0)), R.string.back_text, n12.b);
                return;
            }
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            N(R.string.error, message, R.string.understand_action, n12.b);
        }
    }

    public final void N(int i, String str, int i2, n12 n12Var) {
        ctf0 ctf0Var = this.o;
        G(new b1l0(new DialogFields((CharSequence) ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0)), (CharSequence) str, (CharSequence) ctf0Var.b.a(i2, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12Var, false, 1528)));
    }

    public final void O(int i) {
        N(R.string.error, this.o.b.a(i, Arrays.copyOf(new Object[0], 0)), R.string.ok, n12.b);
    }

    public final void P() {
        I(this.x.b, new k1l0(this, (byte) 2), new hhb0(this, null, (byte) 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        jwt0 jwt0Var;
        Object value;
        Object value2;
        Object value3;
        v0l0 v0l0Var = (v0l0) obj;
        v0l0Var.getClass();
        super.x(v0l0Var);
        boolean z2 = v0l0Var instanceof p0l0;
        p0w0 p0w0Var = p0w0.f26173a;
        Object[] objArr = 0;
        i1w0 i1w0Var = this.p;
        if (z2) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (v0l0Var instanceof r0l0) {
                i1w0Var.d(new k1l0(this, objArr == true ? 1 : 0));
                return;
            }
            boolean z3 = v0l0Var instanceof q0l0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z3) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, c1l0.a((c1l0) value3, null, null, false, null, true, false, false, 447)));
                P();
                return;
            }
            if (v0l0Var instanceof u0l0) {
                x5q0 x5q0Var = ((u0l0) v0l0Var).f34859a;
                if (x5q0Var instanceof w5q0) {
                    String str = ((w5q0) x5q0Var).f38596a;
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = str.charAt(i);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    String string = sb.toString();
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                        q7x.F(oyg0Var, string, "CASHBACK_INPUT");
                    } while (!p7m0Var2.m(value2, c1l0.a((c1l0) value2, null, string, false, null, false, false, false, 509)));
                    return;
                }
                return;
            }
            if (v0l0Var instanceof s0l0) {
                H(new cxi0((byte) 18, ((s0l0) v0l0Var).f31414a));
                return;
            }
            byte b = 1;
            if (v0l0Var instanceof t0l0) {
                Double dI = kotlin.text.b.i(((c1l0) D()).b);
                Double d = ((c1l0) D()).f3578a;
                if (dI == null || d == null) {
                    O(R.string.data_retrieval_error);
                    return;
                }
                double dDoubleValue = dI.doubleValue();
                double dDoubleValue2 = d.doubleValue();
                this.v.getClass();
                if (dDoubleValue < 10.0d) {
                    jwt0Var = jwt0.c;
                } else if (dDoubleValue > dDoubleValue2) {
                    jwt0Var = jwt0.b;
                } else {
                    jwt0Var = dDoubleValue % 10.0d == 0.0d ? jwt0.f17271a : jwt0.d;
                }
                if (jwt0Var != jwt0.f17271a) {
                    int iOrdinal = jwt0Var.ordinal();
                    if (iOrdinal == 1) {
                        O(R.string.sport_cashback_max_sum_error);
                        return;
                    } else if (iOrdinal == 2) {
                        O(R.string.sport_cashback_min_sum_error);
                        return;
                    } else {
                        if (iOrdinal != 3) {
                            return;
                        }
                        O(R.string.sport_cashback_muiltiply_ten_error);
                        return;
                    }
                }
                bby bbyVar = this.y;
                if (bbyVar == null || !bbyVar.isActive()) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value = p7m0Var3.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value, c1l0.a((c1l0) value, null, null, true, null, false, false, false, 507)));
                    this.y = sac.V(jiu0.a(this), new k1l0(this, b), new goi0(this, (byte) 13), null, new kbh0(this, dI, null, (byte) 28), 12);
                    return;
                }
                return;
            }
            if (!v0l0Var.equals(n0l0.f22704a)) {
                if (v0l0Var instanceof o0l0) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (b8k0.Q((c1l0) D())) {
                P();
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    this.u.q(new bb50(false), true);
                    return;
                }
                i1w0Var.a((oe50) pawVar2.next());
            }
        }
    }
}
