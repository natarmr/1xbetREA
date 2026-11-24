package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g3j extends x2t0 {
    public final /* synthetic */ byte h = 1;
    public final oeg0 i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3j(rl1 rl1Var, ctf0 ctf0Var, kd30 kd30Var, q5j q5jVar, crt crtVar, oeg0 oeg0Var, peg0 peg0Var, b4j b4jVar, je jeVar) {
        super(new bmh((byte) 19));
        ctf0Var.getClass();
        oeg0Var.getClass();
        this.j = rl1Var;
        this.k = ctf0Var;
        this.l = kd30Var;
        this.m = q5jVar;
        this.n = crtVar;
        this.i = oeg0Var;
        this.o = peg0Var;
        this.p = b4jVar;
        this.q = jeVar;
    }

    @Override // a.j3t0
    public final Object a(Object obj, bnn0 bnn0Var) {
        switch (this.h) {
            case 0:
                s2j s2jVar = (s2j) obj;
                je jeVar = (je) this.q;
                b4j b4jVar = (b4j) this.p;
                if (s2jVar instanceof o2j) {
                    o2j o2jVar = (o2j) s2jVar;
                    String str = o2jVar.f24532a;
                    long j = o2jVar.b;
                    b4jVar.d(str);
                    jeVar.b(str);
                    ((crt) this.n).b(wuo0.c.getId(), j);
                    Unit unit = Unit.f46060a;
                    wne wneVar = wne.f39444a;
                    return unit;
                }
                boolean z = s2jVar instanceof r2j;
                byte b = 1;
                oeg0 oeg0Var = this.i;
                if (z) {
                    r2j r2jVar = (r2j) s2jVar;
                    String str2 = r2jVar.f29736a;
                    String str3 = r2jVar.b;
                    b4jVar.f(str2, str3);
                    jeVar.d(str2, str3);
                    oeg0Var.c().d(new e3j(this, b));
                } else {
                    if (!(s2jVar instanceof p2j)) {
                        if (!Intrinsics.d(s2jVar, q2j.f28000a)) {
                            t9f.b();
                            return null;
                        }
                        Unit unitN = ((kd30) this.l).N();
                        wne wneVar2 = wne.f39444a;
                        if (unitN != wneVar2) {
                            unitN = Unit.f46060a;
                        }
                        return unitN == wneVar2 ? unitN : Unit.f46060a;
                    }
                    p2j p2jVar = (p2j) s2jVar;
                    String str4 = p2jVar.f26252a;
                    int i = p2jVar.b;
                    long j2 = p2jVar.c;
                    b4jVar.e(i, str4);
                    jeVar.c(i, str4);
                    hm1 hm1Var = new hm1(1, null, kotlin.collections.a.c(Long.valueOf(j2)));
                    i1w0 i1w0VarC = oeg0Var.c();
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new vef(this, hm1Var, (byte) 19))), i1w0VarC, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0VarC.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            default:
                return k((ims) obj, bnn0Var);
        }
    }

    public Object i(jms jmsVar) {
        Object objN = n(((ya30) d()).c, ((ya30) d()).f42275a, ((ya30) d()).g, ((ya30) d()).h, jmsVar);
        return objN == wne.f39444a ? objN : Unit.f46060a;
    }

    public Object j(jms jmsVar) {
        Object objN = n(((ya30) d()).d, ((ya30) d()).b, ((ya30) d()).g, ((ya30) d()).h, jmsVar);
        return objN == wne.f39444a ? objN : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (i(r3) == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (j(r3) == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
    
        if (r0 == r4) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(a.ims r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g3j.k(a.ims, a.zje):java.lang.Object");
    }

    public void l(long j, long j2, String str) {
        List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((yxg) it.next()).f43419a));
        }
        if (arrayList.contains(Long.valueOf(j))) {
            ((ih5) this.p).p(((ya30) d()).i ? r1g.CYBERSPORT_GAME_SCREEN_LIVE : r1g.CYBERSPORT_GAME_SCREEN_LINE, j);
            ((zr1) this.q).z(j, (((ya30) d()).i ? r1g.CYBERSPORT_GAME_SCREEN_LIVE : r1g.CYBERSPORT_GAME_SCREEN_LINE).f29679a);
            ((uzg) ((hzg) this.o)).n(j, j2, str, k1g.OPEN_REGULAR);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object m(long j, long j2, long j3, zje zjeVar, boolean z) {
        kms kmsVar;
        long j4;
        long j5;
        boolean z2;
        Object g0g0Var;
        if (zjeVar instanceof kms) {
            kmsVar = (kms) zjeVar;
            int i = kmsVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                kmsVar.n = i - Integer.MIN_VALUE;
            } else {
                kmsVar = new kms(this, zjeVar);
            }
        } else {
            kmsVar = new kms(this, zjeVar);
        }
        kms kmsVar2 = kmsVar;
        Object obj = kmsVar2.l;
        wne wneVar = wne.f39444a;
        int i2 = kmsVar2.n;
        if (i2 == 0) {
            z1x.P(obj);
            try {
                e0g0 e0g0Var = j0g0.b;
                hcp0 hcp0Var = (hcp0) this.j;
                kmsVar2.k = z;
                kmsVar2.i = j2;
                kmsVar2.j = j3;
                kmsVar2.n = 1;
                if (hcp0Var.p(j, z, j2, j3, kmsVar2) == wneVar) {
                    return wneVar;
                }
                j4 = j2;
                j5 = j3;
                z2 = z;
            } catch (Throwable th) {
                th = th;
                j4 = j2;
                j5 = j3;
                z2 = z;
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = kmsVar2.j;
            j4 = kmsVar2.i;
            z2 = kmsVar2.k;
            try {
                z1x.P(obj);
            } catch (Throwable th2) {
                th = th2;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        }
        g0g0Var = Unit.f46060a;
        e0g0 e0g0Var4 = j0g0.b;
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            ((ivn) this.l).f(thA, new g7p((Object) this, (byte) 24));
        }
        s31 s31Var = (s31) this.m;
        if (j5 <= 0) {
            s31Var.d(z2, j4);
        } else {
            s31Var.getClass();
            s31Var.f31532a.a("team_favor_add", xp20.f(new Pair("action", z2 ? "off" : "on"), new Pair("sport_id", Long.valueOf(j4)), new Pair("sub_sport_id", Long.valueOf(j5))));
            je jeVar = (je) this.n;
            jeVar.getClass();
            jeVar.f16351a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j4), new i1p((byte) 0, j5), new j1p(z2 ? "off" : "on", (byte) 0)}), 3163L);
        }
        return Unit.f46060a;
    }

    public Object n(long j, boolean z, long j2, long j3, jms jmsVar) {
        Object obj = this.k;
        if (((iqt) obj).f15225a.a()) {
            Object objM = m(j, j2, j3, jmsVar, z);
            return objM == wne.f39444a ? objM : Unit.f46060a;
        }
        h(new va30(((ya30) d()).c == j), new wej(0, (iqt) obj, iqt.class, "invoke", "invoke()Z", 0, (byte) 19));
        i1w0 i1w0VarC = this.i.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0VarC.a((oe50) pawVar.next());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3j(hcp0 hcp0Var, iqt iqtVar, ivn ivnVar, s31 s31Var, je jeVar, hzg hzgVar, oeg0 oeg0Var, ih5 ih5Var, zr1 zr1Var) {
        super(new o9s((byte) 16));
        oeg0Var.getClass();
        this.j = hcp0Var;
        this.k = iqtVar;
        this.l = ivnVar;
        this.m = s31Var;
        this.n = jeVar;
        this.o = hzgVar;
        this.i = oeg0Var;
        this.p = ih5Var;
        this.q = zr1Var;
    }
}
