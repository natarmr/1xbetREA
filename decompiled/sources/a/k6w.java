package a;

import java.util.Date;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class k6w extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ rrd j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6w(rrd rrdVar, long j, long j2, long j3, int i, yje yjeVar) {
        super(2, yjeVar);
        this.j = rrdVar;
        this.k = j;
        this.l = j2;
        this.m = j3;
        this.n = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new k6w(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k6w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            rrd rrdVar = this.j;
            pyu pyuVar = (pyu) rrdVar.c;
            String strA = ((btt0) rrdVar.i).a();
            int offset = TimeZone.getDefault().getOffset(new Date().getTime());
            long j = offset;
            double d = j / 3600000;
            double d2 = ((j / 60000) - (60.0d * d)) / 100.0d;
            wdi0 wdi0Var = new wdi0(this.k, this.l, this.m, this.n, offset < 0 ? d - Math.abs(d2) : d + d2);
            this.i = true;
            Object objC = ((r37) ((tpv) pyuVar.f27815a).invoke()).c(strA, wdi0Var, this);
            if (objC != wneVar) {
                objC = Unit.f46060a;
            }
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
