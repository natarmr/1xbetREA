package a;

import java.util.ListIterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class yjv extends x2t0 {
    public final xfu h;
    public final ouu i;
    public final v88 j;
    public final std k;
    public final i1w0 l;
    public final oct m;
    public final peg0 n;
    public final vqc o;
    public final xex p;
    public final duj q;
    public final s31 r;
    public final ix0 s;

    public yjv(oeu oeuVar, xfu xfuVar, ouu ouuVar, v88 v88Var, std stdVar, i1w0 i1w0Var, oct octVar, peg0 peg0Var, vqc vqcVar, xex xexVar, duj dujVar, s31 s31Var, ix0 ix0Var) {
        super(new ldv((byte) 7));
        this.h = xfuVar;
        this.i = ouuVar;
        this.j = v88Var;
        this.k = stdVar;
        this.l = i1w0Var;
        this.m = octVar;
        this.n = peg0Var;
        this.o = vqcVar;
        this.p = xexVar;
        this.q = dujVar;
        this.r = s31Var;
        this.s = ix0Var;
    }

    public final void i(rkv rkvVar) {
        int iOrdinal = rkvVar.ordinal();
        s31 s31Var = this.r;
        switch (iOrdinal) {
            case 0:
                i8i.D("point", "Deposit", s31Var.f31532a, "gesture_call");
                break;
            case 1:
                i8i.D("point", "BetHistory", s31Var.f31532a, "gesture_call");
                break;
            case 2:
                i8i.D("point", "Favor", s31Var.f31532a, "gesture_call");
                break;
            case 3:
                i8i.D("point", "Express", s31Var.f31532a, "gesture_call");
                break;
            case 4:
                i8i.D("point", "Cyber", s31Var.f31532a, "gesture_call");
                break;
            case 5:
                i8i.D("point", "games", s31Var.f31532a, "gesture_call");
                break;
            case 6:
                i8i.D("point", "Slots", s31Var.f31532a, "gesture_call");
                break;
            default:
                t9f.b();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(zje zjeVar) {
        wjv wjvVar;
        if (zjeVar instanceof wjv) {
            wjvVar = (wjv) zjeVar;
            int i = wjvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjvVar.k = i - Integer.MIN_VALUE;
            } else {
                wjvVar = new wjv(this, zjeVar);
            }
        } else {
            wjvVar = new wjv(this, zjeVar);
        }
        Object objH = wjvVar.i;
        wne wneVar = wne.f39444a;
        int i2 = wjvVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objH);
                xex xexVar = this.p;
                wjvVar.k = 1;
                objH = xexVar.H(wjvVar);
                if (objH == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objH);
            }
            if (((Boolean) objH).booleanValue()) {
                g(ckv.f4527a);
            } else {
                i1w0 i1w0Var = this.l;
                i1w0Var.getClass();
                k0w0 k0w0Var = new k0w0(i1w0Var);
                k0w0Var.h(oct.f(this.m, 0L, null, 0, null, null, 31));
                ListIterator listIterator = i1w0Var.c().d(k0w0Var.f17489a).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        break;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                i(rkv.GAMES);
            }
        } catch (Throwable th) {
            this.q.a(th);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
    
        if (r13 == r1) goto L46;
     */
    @Override // a.j3t0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.bkv r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yjv.a(a.bkv, a.zje):java.lang.Object");
    }
}
