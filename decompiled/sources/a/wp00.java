package a;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class wp00 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ bq00 j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp00(bq00 bq00Var, String str, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.j = bq00Var;
        this.k = str;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        String str = this.k;
        bq00 bq00Var = this.j;
        switch (b) {
            case 0:
                return new wp00(bq00Var, str, yjeVar, (byte) 0);
            default:
                return new wp00(bq00Var, str, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((wp00) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = bq00.n0;
                bq00 bq00Var = this.j;
                boolean z = ((cp00) bq00Var.D()).c.b == eh3.VIDEO && Build.VERSION.SDK_INT >= 29;
                boolean z2 = ((cp00) bq00Var.D()).c.b == eh3.REMOTE_IMAGE;
                if (z || z2) {
                    i3t0.K(bq00Var, null, null, new yp00(bq00Var, this.k, z, z2, null, (byte) 0), 3);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = bq00.n0;
                bq00 bq00Var2 = this.j;
                qm3 qm3Var = bq00Var2.q.a().R0.d;
                boolean z3 = qm3Var == qm3.VIDEO && Build.VERSION.SDK_INT >= 29;
                boolean z4 = qm3Var == qm3.REMOTE_IMAGE;
                if (z3 || z4) {
                    i3t0.K(bq00Var2, null, null, new yp00(bq00Var2, this.k, z3, z4, null, (byte) 1), 3);
                }
                break;
        }
        return Unit.f46060a;
    }
}
