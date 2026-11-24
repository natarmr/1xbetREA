package a;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class uz1 extends bnn0 implements Function2 {
    public wz1 i;
    public myr0 j;
    public boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ wz1 m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz1(boolean z, wz1 wz1Var, long j, yje yjeVar) {
        super(2, yjeVar);
        this.l = z;
        this.m = wz1Var;
        this.n = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new uz1(this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uz1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        a4x a4xVar;
        Object next;
        z1s0 z1s0Var;
        wz1 wz1Var;
        myr0 myr0Var;
        wne wneVar = wne.f39444a;
        boolean z = this.k;
        byte b = 1;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            boolean z2 = this.l;
            long j = this.n;
            wz1 wz1Var2 = this.m;
            if (!z2) {
                wz1Var2.r.f29324a.a("tournament_call", xp20.f(new Pair("tournament_id", Long.valueOf(j)), new Pair("screen", "tournaments")));
                wz1Var2.A.f44833a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p("tournaments", (byte) 0)}), 3095L);
            }
            bie bieVar = ((dz1) wz1Var2.D()).l;
            vge vgeVar = bieVar instanceof vge ? (vge) bieVar : null;
            if (vgeVar != null && (a4xVar = vgeVar.f37377a) != null) {
                Iterator<E> it = a4xVar.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((myr0) next).f22617a != j);
                myr0 myr0Var2 = (myr0) next;
                if (myr0Var2 != null) {
                    boolean z3 = myr0Var2.d instanceof jyr0;
                    if (wz1Var2.z.f15225a.a() || (z1s0Var = myr0Var2.b) == z1s0.f43637a) {
                        wz1Var2.Q(myr0Var2);
                    } else if (z1s0Var == z1s0.b && z3) {
                        wz1Var2.Q(myr0Var2);
                    } else if (z2) {
                        ytt yttVar = wz1Var2.G;
                        aue0 aue0Var = aue0.d;
                        this.i = wz1Var2;
                        this.j = myr0Var2;
                        this.k = true;
                        if (yttVar.a(aue0Var, this) == wneVar) {
                            return wneVar;
                        }
                        wz1Var = wz1Var2;
                        myr0Var = myr0Var2;
                    } else {
                        sac.V(jiu0.a(wz1Var2), tz1.f34783a, null, wz1Var2.y.b, new l1(wz1Var2, myr0Var2, yjeVar, (byte) 29), 10);
                    }
                }
            }
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        myr0Var = this.j;
        wz1Var = this.i;
        z1x.P(obj);
        wz1Var.t.b().d(new mz1(wz1Var, myr0Var, b));
        return Unit.f46060a;
    }
}
