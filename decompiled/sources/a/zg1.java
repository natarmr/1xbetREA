package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zg1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;
    public final /* synthetic */ diu0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg1(po6 po6Var, long j, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.l = po6Var;
        this.j = j;
        this.k = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        diu0 diu0Var = this.l;
        switch (b) {
            case 0:
                return new zg1((mh1) diu0Var, this.k, this.j, yjeVar, (byte) 0);
            case 1:
                return new zg1((po6) diu0Var, this.j, this.k, yjeVar);
            case 2:
                return new zg1((nob) diu0Var, this.k, this.j, yjeVar, (byte) 2);
            default:
                return new zg1((d650) diu0Var, this.k, this.j, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((zg1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        int i = 0;
        int i2 = 1;
        long j = this.j;
        int i3 = this.k;
        diu0 diu0Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                mh1 mh1Var = (mh1) diu0Var;
                i3t0.A(mh1Var, mh1Var.r, new p2j(mh1.E0, i3, j), null, null, 6);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                po6 po6Var = (po6) diu0Var;
                po6Var.o.f29314a.b.e.put(Long.valueOf(j), Integer.valueOf(i3));
                ArrayList arrayListA = po6Var.f.a();
                ArrayList arrayListL = o050.L(arrayListA, arrayListA, po6Var.r.f37705a.a(), po6Var.n.d(), false, po6Var.B);
                boolean zIsEmpty = arrayListL.isEmpty();
                p7m0 p7m0Var = po6Var.R;
                yv7 yv7Var = new yv7(CollectionsKt.q0(po6Var.x(), arrayListL), zIsEmpty);
                p7m0Var.getClass();
                p7m0Var.o(null, yv7Var);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                nob nobVar = (nob) diu0Var;
                ArrayList arrayListN0 = CollectionsKt.N0(nobVar.b.f13600a.n());
                lye lyeVar = (lye) nobVar.c.f24624a.f10647a;
                lyeVar.i = j;
                lyeVar.j = i3;
                ArrayList arrayList = new ArrayList(r3d.q(arrayListN0, 10));
                int i4 = 0;
                for (Object obj2 : arrayListN0) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        q3d.p();
                        throw null;
                    }
                    hf6 hf6Var = (hf6) obj2;
                    boolean z = i3 == hf6Var.f12958a ? i2 : i;
                    boolean z2 = i4 == arrayListN0.size() - i2 ? i2 : i;
                    ctf0 ctf0Var = nobVar.d;
                    ctf0Var.getClass();
                    arrayList.add(new lob(z, z2, hf6Var.e ? ctf0Var.b.a(R.string.lobby_, Arrays.copyOf(new Object[i], i)) : ctf0.e(ctf0Var, ctf0Var.b.a(R.string.block_v2, Arrays.copyOf(new Object[i], i)), new Object[]{Integer.valueOf(hf6Var.b)}), hf6Var.f12958a));
                    i4 = i5;
                    i = 0;
                    i2 = 1;
                }
                p7m0 p7m0Var2 = nobVar.e;
                p7m0Var2.getClass();
                p7m0Var2.o(null, arrayList);
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                f3j f3jVar = ((d650) diu0Var).X;
                String strJ = sre0.f32672a.b(o450.class).J();
                if (strJ == null) {
                    strJ = "";
                }
                f3jVar.getClass();
                ((b4j) f3jVar.l).e(i3, strJ);
                ((je) f3jVar.m).c(i3, strJ);
                hm1 hm1Var = new hm1(1, null, kotlin.collections.a.c(Long.valueOf(j)));
                i1w0 i1w0VarC = ((oeg0) f3jVar.j).c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new vef(f3jVar, hm1Var, (byte) 18))), i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg1(diu0 diu0Var, int i, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
        this.k = i;
        this.j = j;
    }
}
