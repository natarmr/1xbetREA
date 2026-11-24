package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class k21 extends bnn0 implements Function2 {
    public Serializable i;
    public n21 j;
    public mlr k;
    public long l;
    public boolean m;
    public final /* synthetic */ n21 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k21(n21 n21Var, long j, boolean z, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.n = n21Var;
        this.o = j;
        this.p = z;
        this.q = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new k21(this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        mlr mlrVar;
        n21 n21Var;
        long j;
        String str;
        wne wneVar = wne.f39444a;
        boolean z = this.m;
        if (!z) {
            z1x.P(obj);
            n21 n21Var2 = this.n;
            Serializable serializableI = n21Var2.u.i(this.o);
            e0g0 e0g0Var = j0g0.b;
            if (!(serializableI instanceof g0g0)) {
                mlr mlrVar2 = (mlr) serializableI;
                xr xrVar = n21Var2.y;
                boolean z2 = !this.p;
                eyg0 eyg0Var = n21Var2.I;
                long j2 = mlrVar2.f22006a;
                long j3 = this.q;
                String strK = eyg0Var.k(n21Var2.M(new Long(j3), j2));
                this.i = serializableI;
                this.j = n21Var2;
                this.k = mlrVar2;
                this.l = j3;
                this.m = true;
                if (xrVar.m(mlrVar2, z2, 0, strK, this) == wneVar) {
                    return wneVar;
                }
                mlrVar = mlrVar2;
                n21Var = n21Var2;
                j = j3;
            }
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = this.l;
        mlrVar = this.k;
        n21Var = this.j;
        z1x.P(obj);
        x20 x20Var = n21Var.A;
        long j4 = mlrVar.f22006a;
        x20Var.getClass();
        String str2 = "null";
        if (j == 75) {
            str = "live_1x";
        } else if (j == 17) {
            str = "slots_popular";
        } else if (j == -1) {
            str = "recommended";
        } else {
            str = j == 37 ? "live_aggregator_popular" : "null";
        }
        x20Var.f40143a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j4), new j1p("add_favor", (byte) 0), new j1p(str, (byte) 1)}), 3295L);
        yo4 yo4Var = n21Var.v;
        long j5 = mlrVar.f22006a;
        yo4Var.getClass();
        kt2 kt2Var = yo4Var.f42966a;
        Pair pair = new Pair("action", "add_favor");
        if (j == 75) {
            str2 = "live_1x";
        } else if (j == 17) {
            str2 = "slots_popular";
        } else if (j == -1) {
            str2 = "recommended";
        } else if (j == 37) {
            str2 = "live_aggregator_popular";
        }
        kt2Var.a("promo_games_recomended_call", xp20.f(pair, new Pair(Payload.TYPE, str2), new Pair("game_id", Long.valueOf(j5))));
        return Unit.f46060a;
    }
}
