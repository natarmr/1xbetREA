package a;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ww extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public bby A;
    public final zg o;
    public final mne p;
    public final rou q;
    public final nr r;
    public final m0u s;
    public final ctf0 t;
    public final h0q0 u;
    public final a7q v;
    public final je w;
    public final i1w0 x;
    public bby y;
    public bby z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(zg zgVar, mne mneVar, rou rouVar, nr nrVar, m0u m0uVar, ctf0 ctf0Var, h0q0 h0q0Var, a7q a7qVar, je jeVar, i1w0 i1w0Var) {
        super(new q8((byte) 17), cvm0.p(mneVar.c, mneVar.f22085a), new uc(ctf0Var, (byte) 2), (yzn0) null);
        ctf0Var.getClass();
        this.o = zgVar;
        this.p = mneVar;
        this.q = rouVar;
        this.r = nrVar;
        this.s = m0uVar;
        this.t = ctf0Var;
        this.u = h0q0Var;
        this.v = a7qVar;
        this.w = jeVar;
        this.x = i1w0Var;
    }

    public static bby M(ww wwVar, t0 t0Var, Function1 function1, int i) {
        Object value;
        dvj dvjVar = wwVar.p.b;
        Function1 function2 = t0Var;
        if ((i & 2) != 0) {
            function2 = vw.f38126a;
        }
        p7m0 p7m0Var = wwVar.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            wwVar.f.getClass();
        } while (!p7m0Var.m(value, lw.a((lw) value, true, null, false, false, null, null, false, 126)));
        return wwVar.I(dvjVar, function2, new za(function1, wwVar, null, (byte) 5));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        xv xvVar = (xv) obj;
        xvVar.getClass();
        super.x(xvVar);
        byte b = 0;
        if (xvVar instanceof uv) {
            i1w0 i1w0Var = this.x;
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
        } else {
            yje yjeVar = null;
            if (xvVar instanceof vv) {
                bby bbyVar = this.A;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.A = i3t0.K(this, this.p.b, null, new tw(this, yjeVar, b), 2);
                    return;
                }
                return;
            }
            boolean z = xvVar instanceof tv;
            ctf0 ctf0Var = this.t;
            if (!z) {
                if (!(xvVar instanceof wv)) {
                    if (!(xvVar instanceof sv)) {
                        if (xvVar instanceof rv) {
                            E();
                            return;
                        } else {
                            t9f.b();
                            return;
                        }
                    }
                    long j = ((sv) xvVar).f32843a;
                    bby bbyVar2 = this.z;
                    if (bbyVar2 == null || !bbyVar2.isActive()) {
                        this.z = M(this, null, new uw(this, j, yjeVar, (byte) 0), 3);
                        return;
                    }
                    return;
                }
                String str = ((wv) xvVar).f39814a;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (Character.isLetterOrDigit(cCharAt) || cCharAt == ' ' || cCharAt == '-' || cCharAt == '\'') {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                boolean z2 = string.length() > 30;
                H(new sw(string, z2, z2 ? ctf0Var.b.a(R.string.wallet_name_too_long, Arrays.copyOf(new Object[0], 0)) : ""));
                return;
            }
            String string2 = StringsKt.u0(((tv) xvVar).f34574a).toString();
            if (string2.length() <= 30) {
                if (string2.length() == 0) {
                    return;
                }
                bby bbyVar3 = this.y;
                if ((bbyVar3 == null || !bbyVar3.isActive()) && !((lw) D()).b.o) {
                    this.y = M(this, new t0(1, this, ww.class, "handleAddAccountError", "handleAddAccountError(Ljava/lang/Throwable;)V", 0, (byte) 24), new za(this, string2, null, (byte) 4), 1);
                    return;
                }
                return;
            }
            String strA = ctf0Var.b.a(R.string.wallet_name_too_long, Arrays.copyOf(new Object[0], 0));
            p7m0 p7m0Var = this.i.f25029a;
            while (true) {
                Object value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                String str2 = strA;
                if (p7m0Var.m(value, lw.a((lw) value, false, null, false, true, strA, null, false, 39))) {
                    return;
                } else {
                    strA = str2;
                }
            }
        }
    }
}
