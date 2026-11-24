package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.toto_jackpot.impl.navigation.TotoJackpotScreens$TotoJackpotTirageDsFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class psr0 extends i3t0 {
    public static final /* synthetic */ int K = 0;
    public final cu A;
    public final i1e0 B;
    public final hrc C;
    public final ngu D;
    public final prc E;
    public final xex F;
    public final r9u G;
    public final c4m0 H;
    public bby I;
    public bby J;
    public final i1w0 o;
    public final duj p;
    public final gle0 q;
    public final ctf0 r;
    public final sa10 s;
    public final mne t;
    public final pru u;
    public final lsn v;
    public final lhf0 w;
    public final ivn x;
    public final rqt y;
    public final p4u z;

    public psr0(i1w0 i1w0Var, duj dujVar, gle0 gle0Var, ctf0 ctf0Var, sa10 sa10Var, m1e m1eVar, mne mneVar, pru pruVar, lsn lsnVar, lhf0 lhf0Var, cmt cmtVar, ivn ivnVar, rqt rqtVar, p4u p4uVar, x4u x4uVar, cu cuVar, i1e0 i1e0Var, hrc hrcVar, ngu nguVar, prc prcVar, xex xexVar, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        yqr0 yqr0Var = new yqr0((byte) 5);
        lsr0 lsr0Var = lsr0.f20595a;
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        super(null, yqr0Var, lsr0Var, cvm0.p(vs10Var, mneVar.f22085a), null);
        this.o = i1w0Var;
        this.p = dujVar;
        this.q = gle0Var;
        this.r = ctf0Var;
        this.s = sa10Var;
        this.t = mneVar;
        this.u = pruVar;
        this.v = lsnVar;
        this.w = lhf0Var;
        this.x = ivnVar;
        this.y = rqtVar;
        this.z = p4uVar;
        this.A = cuVar;
        this.B = i1e0Var;
        this.C = hrcVar;
        this.D = nguVar;
        this.E = prcVar;
        this.F = xexVar;
        this.G = r9uVar;
        c4m0 c4m0Var = this.H;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
        yje yjeVar = null;
        Class<psr0> cls = psr0.class;
        this.H = sac.T(new fnq(m1eVar.b(), new nsr0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new k5r0(2, this, cls, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 4, (byte) 8));
        byte b = 0;
        sac.V(jiu0.a(this), new ksr0(this, (byte) 1), null, dvjVar, new nsr0(this, yjeVar, b), 10);
        sac.T(new fnq(new h2c(((hqr0) ((pzu) cmtVar.b).b).f13498a, (byte) 10), new osr0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new k5r0(2, this, cls, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 4, (byte) 7));
        sac.T(new fnq(((hqr0) ((pzu) x4uVar.f40284a).b).b, new osr0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new k5r0(2, this, cls, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 4, (byte) 9));
        if (Intrinsics.d(((pzu) ivnVar.f15453a).G(), krr0.n)) {
            O(true);
        }
    }

    public static in8 M(List list, Map map) {
        int i;
        if (map.isEmpty()) {
            i = 0;
        } else {
            Iterator it = map.entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                if (!((Collection) ((Map.Entry) it.next()).getValue()).isEmpty()) {
                    i++;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            w3d.u(arrayList, ((xqr0) it2.next()).f);
        }
        int size = arrayList.size();
        return new in8(w6x.n(i, size, Separators.SLASH), i == size, i > 0);
    }

    public final void N(Throwable th) {
        this.p.b(th, new p6r0(this, (byte) 12));
    }

    public final void O(boolean z) {
        sac.V(jiu0.a(this), new mjr0(1, this, psr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, this.t.b, new din0(this, z, null, (byte) 6), 10);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0195  */
    /* JADX WARN: Code duplicated, block: B:55:0x0198  */
    /* JADX WARN: Code duplicated, block: B:56:0x019b  */
    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void x(ipr0 ipr0Var) {
        Object value;
        Object value2;
        ua20 ua20Var;
        ipr0Var.getClass();
        boolean zEquals = ipr0Var.equals(wor0.f39511a);
        i1w0 i1w0Var = this.o;
        if (zEquals) {
            hqr0 hqr0Var = (hqr0) ((pzu) this.E.b).b;
            p7m0 p7m0Var = hqr0Var.b;
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            p7m0Var.o(null, lunVar);
            hqr0Var.f13498a.n(krr0.n);
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (ipr0Var.equals(xor0.f41234a)) {
                E();
                return;
            }
            if (ipr0Var instanceof dpr0) {
                dpr0 dpr0Var = (dpr0) ipr0Var;
                int i = dpr0Var.f6480a;
                iqr0 iqr0Var = dpr0Var.b;
                ngu nguVar = this.D;
                nguVar.getClass();
                pzu pzuVar = nguVar.f23502a;
                Set set = (Set) pzuVar.U().get(Integer.valueOf(i));
                if (set == null) {
                    set = xun.f41520a;
                }
                LinkedHashSet linkedHashSetE = set.contains(iqr0Var) ? eui0.e(set, iqr0Var) : eui0.h(set, iqr0Var);
                hqr0 hqr0Var2 = (hqr0) pzuVar.b;
                hqr0Var2.getClass();
                p7m0 p7m0Var2 = hqr0Var2.b;
                p7m0Var2.n(xp20.k((Map) p7m0Var2.getValue(), new Pair(Integer.valueOf(i), linkedHashSetE)));
                return;
            }
            if (ipr0Var.equals(fpr0.f9942a)) {
                i1w0Var.d(new ksr0(this, (byte) 0));
                return;
            }
            if (!ipr0Var.equals(hpr0.f13456a)) {
                if (ipr0Var.equals(yor0.f43001a)) {
                    G(qqr0.f29179a);
                    return;
                }
                if (ipr0Var.equals(cpr0.f4762a)) {
                    cu cuVar = this.A;
                    BigDecimal bigDecimalB = ((ngu) cuVar.b).b();
                    BigDecimal bigDecimal = new BigDecimal(String.valueOf(((pzu) ((ivn) cuVar.c).f15453a).G().k));
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((hrc) cuVar.d).a());
                    bigDecimalValueOf.getClass();
                    BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalValueOf);
                    bigDecimalMultiply.getClass();
                    if (bigDecimalB.compareTo(bigDecimalMultiply) <= 0) {
                        G(rqr0.f30946a);
                        return;
                    }
                    int i2 = msr0.f22335a[this.u.a().f32117a.o.ordinal()];
                    if (i2 == 1) {
                        ua20Var = ua20.MEDIUM_CUSTOM_BACKGROUND;
                    } else if (i2 == 2) {
                        ygp ygpVar = ygp.m;
                        r9u r9uVar = this.G;
                        r9uVar.getClass();
                        j1q0 j1q0Var = r9uVar.f30104a;
                        j1q0Var.getClass();
                        if (j1q0Var.f15748a.d(ygpVar)) {
                            ua20Var = ua20.FULLSCREEN_SLIDER;
                        } else if (i2 == 3) {
                            ua20Var = ua20.LITE_NO_TABS;
                        } else {
                            ua20Var = ua20.MEDIUM_NO_GAME_INFO;
                        }
                    } else if (i2 == 3) {
                        ua20Var = ua20.LITE_NO_TABS;
                    } else {
                        ua20Var = ua20.MEDIUM_NO_GAME_INFO;
                    }
                    G(new pqr0(ua20Var));
                    return;
                }
                if (ipr0Var.equals(epr0.f8201a)) {
                    pzu pzuVar2 = this.B.f13993a;
                    List list = pzuVar2.G().m;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((xqr0) it.next()).f);
                    }
                    ArrayList arrayListR = r3d.r(arrayList);
                    int iA = wp20.a(r3d.q(arrayListR, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    Iterator it2 = arrayListR.iterator();
                    while (it2.hasNext()) {
                        linkedHashMap.put(Integer.valueOf(((crr0) it2.next()).k), cui0.b(CollectionsKt.U(kotlin.collections.a.d(i1e0.b))));
                    }
                    hqr0 hqr0Var3 = (hqr0) pzuVar2.b;
                    hqr0Var3.getClass();
                    hqr0Var3.b.o(null, linkedHashMap);
                    return;
                }
                if (ipr0Var.equals(zor0.f44729a)) {
                    p7m0 p7m0Var3 = ((hqr0) this.C.f13523a.b).b;
                    lun lunVar2 = lun.f20680a;
                    lunVar2.getClass();
                    p7m0Var3.o(null, lunVar2);
                    return;
                }
                boolean zEquals2 = ipr0Var.equals(bpr0.f2999a);
                oyg0 oyg0Var = this.f;
                ocj ocjVar = this.i;
                if (zEquals2) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var4.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value2, tqr0.a((tqr0) value2, null, null, false, null, null, 111)));
                    O(true);
                    return;
                }
                if (ipr0Var.equals(apr0.f1267a)) {
                    bby bbyVar = this.I;
                    if (bbyVar == null || bbyVar.isActive() || !Intrinsics.d(((pzu) this.x.f15453a).G(), krr0.n)) {
                        return;
                    }
                    O(true);
                    return;
                }
                if (!(ipr0Var instanceof gpr0)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value = p7m0Var5.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value, tqr0.a((tqr0) value, null, null, false, null, ((gpr0) ipr0Var).f11698a, 63)));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            FragmentScreen totoJackpotScreens$TotoJackpotTirageDsFragmentScreen = new TotoJackpotScreens$TotoJackpotTirageDsFragmentScreen();
            if (totoJackpotScreens$TotoJackpotTirageDsFragmentScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) totoJackpotScreens$TotoJackpotTirageDsFragmentScreen)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(totoJackpotScreens$TotoJackpotTirageDsFragmentScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }

    public final void Q() {
        ra10 ra10VarA = this.s.a(pb10.g, R.string.data_retrieval_error, R.string.try_again_text, new qir0(this, (byte) 6), ((tqr0) D()).e);
        String strA = this.r.b.a(R.string.toto_jackpot_title, Arrays.copyOf(new Object[0], 0));
        v3c.N(this.J);
        H(new a6p0(strA, ra10VarA, (byte) 27));
    }
}
