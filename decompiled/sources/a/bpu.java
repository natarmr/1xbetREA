package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class bpu extends bnn0 implements Function2 {
    public kzj i;
    public jzj j;
    public toe k;
    public toe l;
    public long m;
    public byte n;
    public /* synthetic */ Object o;
    public final /* synthetic */ long p;
    public final /* synthetic */ edu q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpu(long j, yje yjeVar, edu eduVar) {
        super(2, yjeVar);
        this.p = j;
        this.q = eduVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        bpu bpuVar = new bpu(this.p, yjeVar, this.q);
        bpuVar.o = obj;
        return bpuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bpu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kzj kzjVarM;
        jzj jzjVarM;
        long j;
        toe toeVar;
        Object objAwait;
        long j2;
        toe toeVar2;
        Object objAwait2;
        toe toeVar3;
        toe toeVar4;
        vne vneVar = (vne) this.o;
        wne wneVar = wne.f39444a;
        byte b = this.n;
        if (b == 0) {
            z1x.P(obj);
            long j3 = this.p;
            edu eduVar = this.q;
            if (j3 == 0) {
                j3 = ((gst0) eduVar.b).f11847a.a().f18785a;
            }
            kzj kzjVarM2 = qjj.M(vneVar, null, new zou(eduVar, j3, null, (byte) 1), 3);
            kzjVarM = qjj.M(vneVar, null, new apu(j3, null, eduVar), 3);
            jzjVarM = qjj.M(vneVar, null, new zou(eduVar, j3, null, (byte) 0), 3);
            this.o = null;
            this.i = kzjVarM;
            this.j = jzjVarM;
            this.m = j3;
            this.n = (byte) 1;
            obj = kzjVarM2.q(this);
            if (obj != wneVar) {
                j = j3;
            }
            return wneVar;
        }
        if (b == 1) {
            j = this.m;
            jzjVarM = this.j;
            kzjVarM = this.i;
            z1x.P(obj);
        } else {
            if (b == 2) {
                j2 = this.m;
                toe toeVar5 = this.k;
                jzj jzjVar = this.j;
                z1x.P(obj);
                objAwait = obj;
                toeVar = toeVar5;
                jzjVarM = jzjVar;
                toeVar2 = (toe) objAwait;
                this.o = null;
                this.i = null;
                this.j = null;
                this.k = toeVar;
                this.l = toeVar2;
                this.m = j2;
                this.n = (byte) 3;
                objAwait2 = jzjVarM.await(this);
                if (objAwait2 != wneVar) {
                    toe toeVar6 = toeVar;
                    obj = objAwait2;
                    toeVar3 = toeVar6;
                    toeVar4 = toeVar2;
                }
                return wneVar;
            }
            if (b != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            toeVar4 = this.l;
            toeVar3 = this.k;
            z1x.P(obj);
        }
        return new dlc0(toeVar3, toeVar4, (hl) obj);
        toeVar = (toe) obj;
        this.o = null;
        this.i = null;
        this.j = jzjVarM;
        this.k = toeVar;
        this.m = j;
        this.n = (byte) 2;
        objAwait = kzjVarM.await(this);
        if (objAwait != wneVar) {
            j2 = j;
            toeVar2 = (toe) objAwait;
            this.o = null;
            this.i = null;
            this.j = null;
            this.k = toeVar;
            this.l = toeVar2;
            this.m = j2;
            this.n = (byte) 3;
            objAwait2 = jzjVarM.await(this);
            if (objAwait2 != wneVar) {
                toe toeVar7 = toeVar;
                obj = objAwait2;
                toeVar3 = toeVar7;
                toeVar4 = toeVar2;
                return new dlc0(toeVar3, toeVar4, (hl) obj);
            }
        }
        return wneVar;
    }
}
