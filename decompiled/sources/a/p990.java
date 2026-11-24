package a;

import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class p990 extends w46 {
    public final boolean A;
    public final String B;
    public final a8z C;
    public final n0o0 D;
    public final n0o0 E;
    public long F;
    public bby G;
    public final i1w0 b;
    public final hse0 c;
    public final sp d;
    public final w5z e;
    public final e1u f;
    public final ahu g;
    public final z7z h;
    public final suk i;
    public final x1u j;
    public final vd1 k;
    public final z7z l;
    public final duj m;
    public final z7z n;
    public final l7k o;
    public final mne p;
    public final z7z q;
    public final nou r;
    public final z7z s;
    public final rou t;
    public final z7z u;
    public final z7z v;
    public final pru w;
    public final z7z x;
    public final ol60 y;
    public final p7m0 z;

    public p990(i1w0 i1w0Var, hse0 hse0Var, sp spVar, w5z w5zVar, e1u e1uVar, ahu ahuVar, z7z z7zVar, suk sukVar, x1u x1uVar, vd1 vd1Var, z7z z7zVar2, duj dujVar, z7z z7zVar3, l7k l7kVar, mne mneVar, z7z z7zVar4, nou nouVar, z7z z7zVar5, rou rouVar, z7z z7zVar6, z7z z7zVar7, pru pruVar, z7z z7zVar8, k790 k790Var) {
        i1w0Var.getClass();
        hse0Var.getClass();
        z7zVar.getClass();
        z7zVar2.getClass();
        z7zVar3.getClass();
        z7zVar4.getClass();
        z7zVar5.getClass();
        z7zVar6.getClass();
        z7zVar7.getClass();
        z7zVar8.getClass();
        this.b = i1w0Var;
        this.c = hse0Var;
        this.d = spVar;
        this.e = w5zVar;
        this.f = e1uVar;
        this.g = ahuVar;
        this.h = z7zVar;
        this.i = sukVar;
        this.j = x1uVar;
        this.k = vd1Var;
        this.l = z7zVar2;
        this.m = dujVar;
        this.n = z7zVar3;
        this.o = l7kVar;
        this.p = mneVar;
        this.q = z7zVar4;
        this.r = nouVar;
        this.s = z7zVar5;
        this.t = rouVar;
        this.u = z7zVar6;
        this.v = z7zVar7;
        this.w = pruVar;
        this.x = z7zVar8;
        this.y = new ol60(3);
        this.z = q7m0.a(d990.b);
        this.A = k790Var.f17810a;
        this.B = k790Var.c;
        this.C = maz.a(wez.b, new i280((byte) 27));
        final byte b = 0;
        this.D = maz.b(new Function0(this) { // from class: a.s890
            public final /* synthetic */ p990 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (b) {
                    case 0:
                        Object obj = this.b.x.get();
                        obj.getClass();
                        return sa10.b((sa10) obj, pb10.g, R.string.data_retrieval_error, 0, null, 28);
                    default:
                        p990 p990Var = this.b;
                        Object obj2 = p990Var.x.get();
                        obj2.getClass();
                        return ((sa10) obj2).a(pb10.g, R.string.data_retrieval_error, R.string.try_again_text, new cz60(0, p990Var, p990.class, "onRefreshLottieClick", "onRefreshLottieClick()V", 0, (byte) 17), 10000L);
                }
            }
        });
        final byte b2 = 1;
        this.E = maz.b(new Function0(this) { // from class: a.s890
            public final /* synthetic */ p990 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (b2) {
                    case 0:
                        Object obj = this.b.x.get();
                        obj.getClass();
                        return sa10.b((sa10) obj, pb10.g, R.string.data_retrieval_error, 0, null, 28);
                    default:
                        p990 p990Var = this.b;
                        Object obj2 = p990Var.x.get();
                        obj2.getClass();
                        return ((sa10) obj2).a(pb10.g, R.string.data_retrieval_error, R.string.try_again_text, new cz60(0, p990Var, p990.class, "onRefreshLottieClick", "onRefreshLottieClick()V", 0, (byte) 17), 10000L);
                }
            }
        });
        this.F = k790Var.b;
    }

    public final void A() {
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

    public final void B() {
        bby bbyVar = this.G;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.G = sac.V(jiu0.a(this), new r890(this, (byte) 0), null, this.p.b, new g990(this, null, b), 10);
        }
    }

    public final void C() {
        sac.T(new dnq(sac.L(6, this.w.a().u1 * 1000, 0L), new gbv(this, null, (byte) 19), (byte) 0), (vne) this.C.getValue(), k990.h);
    }

    public final String w() {
        return w6x.r(new Object[0], 0, ((ctf0) this.q.get()).b, R.string.deeplink_scheme, "://open");
    }

    public final void x() {
        sac.V(jiu0.a(this), new r890(this, (byte) 1), null, this.p.b, new g990(this, null, (byte) 0), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(String str, zje zjeVar) {
        h990 h990Var;
        if (zjeVar instanceof h990) {
            h990Var = (h990) zjeVar;
            int i = h990Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                h990Var.l = i - Integer.MIN_VALUE;
            } else {
                h990Var = new h990(this, zjeVar);
            }
        } else {
            h990Var = new h990(this, zjeVar);
        }
        Object objC = h990Var.j;
        wne wneVar = wne.f39444a;
        int i2 = h990Var.l;
        ol60 ol60Var = this.y;
        if (i2 == 0) {
            z1x.P(objC);
            if (str.length() == 0) {
                ol60Var.f(b990.f2198a);
            } else {
                String strW = w();
                h990Var.i = str;
                h990Var.l = 1;
                objC = this.f.c(strW, h990Var);
                if (objC == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = h990Var.i;
        z1x.P(objC);
        ol60Var.f(new u890(str, (Map) objC));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(String str, zje zjeVar) {
        i990 i990Var;
        if (zjeVar instanceof i990) {
            i990Var = (i990) zjeVar;
            int i = i990Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                i990Var.l = i - Integer.MIN_VALUE;
            } else {
                i990Var = new i990(this, zjeVar);
            }
        } else {
            i990Var = new i990(this, zjeVar);
        }
        Object objC = i990Var.j;
        wne wneVar = wne.f39444a;
        int i2 = i990Var.l;
        ol60 ol60Var = this.y;
        if (i2 == 0) {
            z1x.P(objC);
            if (str.length() == 0) {
                ol60Var.f(b990.f2198a);
            } else {
                String strW = w();
                i990Var.i = str;
                i990Var.l = 1;
                objC = this.f.c(strW, i990Var);
                if (objC == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = i990Var.i;
        z1x.P(objC);
        ol60Var.f(new w890(str, (Map) objC));
        return Unit.f46060a;
    }
}
