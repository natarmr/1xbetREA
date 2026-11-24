package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class kpp extends bnn0 implements Function2 {
    public kzj i;
    public jzj j;
    public Object k;
    public wif l;
    public List m;
    public long n;
    public byte o;
    public /* synthetic */ Object p;
    public final /* synthetic */ m9s q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ uii s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpp(m9s m9sVar, boolean z, uii uiiVar, String str, yje yjeVar) {
        super(2, yjeVar);
        this.q = m9sVar;
        this.r = z;
        this.s = uiiVar;
        this.t = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        kpp kppVar = new kpp(this.q, this.r, this.s, this.t, yjeVar);
        kppVar.p = obj;
        return kppVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kpp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:33:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:61:0x015a  */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0197  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d5 A[RETURN] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kzj kzjVarM;
        Object objQ;
        long j;
        jzj jzjVar;
        fof fofVar;
        wif wifVar;
        Object objAwait;
        fof fofVar2;
        List list;
        Object objAwait2;
        wif wifVar2;
        fof fofVarI;
        long j2;
        fof fofVarI2;
        ArrayList arrayList;
        List list2;
        jpf jpfVar;
        mrf mrfVar;
        Unit unit;
        vne vneVar = (vne) this.p;
        wne wneVar = wne.f39444a;
        byte b = this.o;
        uii uiiVar = this.s;
        m9s m9sVar = this.q;
        if (b == 0) {
            z1x.P(obj);
            long j3 = m9sVar.f21426a;
            kzj kzjVarM2 = qjj.M(vneVar, null, new jpp(uiiVar, j3, null, (byte) 1), 3);
            kzjVarM = qjj.M(vneVar, null, new jpp(uiiVar, j3, null, (byte) 0), 3);
            kzj kzjVarM3 = qjj.M(vneVar, null, new ir((Object) this.s, (Object) this.t, j3, (yje) null, (byte) 10), 3);
            cqg cqgVar = m9sVar.I;
            fof fofVar3 = cqgVar instanceof fof ? (fof) cqgVar : null;
            this.p = null;
            this.i = kzjVarM;
            this.j = kzjVarM3;
            this.k = fofVar3;
            this.n = j3;
            this.o = (byte) 1;
            objQ = kzjVarM2.q(this);
            if (objQ != wneVar) {
                j = j3;
                jzjVar = kzjVarM3;
                fofVar = fofVar3;
            }
            return wneVar;
        }
        if (b == 1) {
            long j4 = this.n;
            fofVar = (fof) this.k;
            jzj jzjVar2 = this.j;
            kzjVarM = this.i;
            z1x.P(obj);
            j = j4;
            jzjVar = jzjVar2;
            objQ = obj;
        } else {
            if (b == 2) {
                long j5 = this.n;
                wif wifVar3 = this.l;
                fof fofVar4 = (fof) this.k;
                jzjVar = this.j;
                z1x.P(obj);
                j = j5;
                objAwait = obj;
                fofVar2 = fofVar4;
                wifVar = wifVar3;
                list = (List) objAwait;
                this.p = null;
                this.i = null;
                this.j = null;
                this.k = fofVar2;
                this.l = wifVar;
                this.m = list;
                this.n = j;
                this.o = (byte) 3;
                objAwait2 = jzjVar.await(this);
                if (objAwait2 != wneVar) {
                    wifVar2 = wifVar;
                    fofVarI = fofVar2;
                    j2 = j;
                }
                return wneVar;
            }
            if (b != 3) {
                if (b != 4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mrf mrfVar2 = (mrf) this.k;
                z1x.P(obj);
                return mrfVar2;
            }
            long j6 = this.n;
            list = this.m;
            wif wifVar4 = this.l;
            fof fofVar5 = (fof) this.k;
            z1x.P(obj);
            wifVar2 = wifVar4;
            fofVarI = fofVar5;
            j2 = j6;
            objAwait2 = obj;
        }
        ljg ljgVar = (ljg) objAwait2;
        wifVar2.getClass();
        list.getClass();
        ljgVar.getClass();
        m9sVar.getClass();
        if (fofVarI == null) {
            fofVarI2 = tdc.I();
        } else {
            fofVarI2 = fofVarI;
        }
        boolean z = ((fofVarI2.e && mbc.V(fofVarI2) && ibc.p0(fofVarI2) && fofVarI2.f9878a.i.isEmpty() && vcc.T(fofVarI2, list) && list.isEmpty() && xbc.V(wifVar2) && x2x.b0(ljgVar, m9sVar)) || (m9sVar.j.length() == 0 && m9sVar.d.isEmpty() && m9sVar.n.isEmpty())) ? false : true;
        if (this.r) {
            list2 = list;
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                jpfVar = (jpf) obj2;
                if (jpfVar.b.equals("-") || !jpfVar.c.equals("-")) {
                    if (jpfVar.d == 0 || jpfVar.e != 0) {
                        arrayList.add(obj2);
                    }
                }
            }
            list2 = arrayList;
        }
        if (fofVarI == null) {
            fofVarI = tdc.I();
        }
        mrfVar = new mrf(fofVarI, wifVar2, list2, ljgVar, iun.f15405a, z);
        gzt gztVar = (gzt) uiiVar.f;
        this.p = null;
        this.i = null;
        this.j = null;
        this.k = mrfVar;
        this.l = null;
        this.m = null;
        this.n = j2;
        this.o = (byte) 4;
        p7m0 p7m0Var = (p7m0) ((qz40) ((a8z) gztVar.f12198a.b.b).getValue());
        p7m0Var.getClass();
        p7m0Var.o(null, mrfVar);
        unit = Unit.f46060a;
        wne wneVar2 = wne.f39444a;
        if (unit != wneVar) {
            return wneVar;
        }
        return mrfVar;
        wifVar = (wif) objQ;
        this.p = null;
        this.i = null;
        this.j = jzjVar;
        this.k = fofVar;
        this.l = wifVar;
        this.n = j;
        this.o = (byte) 2;
        objAwait = kzjVarM.await(this);
        if (objAwait != wneVar) {
            fofVar2 = fofVar;
            list = (List) objAwait;
            this.p = null;
            this.i = null;
            this.j = null;
            this.k = fofVar2;
            this.l = wifVar;
            this.m = list;
            this.n = j;
            this.o = (byte) 3;
            objAwait2 = jzjVar.await(this);
            if (objAwait2 != wneVar) {
                wifVar2 = wifVar;
                fofVarI = fofVar2;
                j2 = j;
                ljg ljgVar2 = (ljg) objAwait2;
                wifVar2.getClass();
                list.getClass();
                ljgVar2.getClass();
                m9sVar.getClass();
                if (fofVarI == null) {
                    fofVarI2 = tdc.I();
                } else {
                    fofVarI2 = fofVarI;
                }
                if (fofVarI2.e) {
                }
                if (this.r) {
                    list2 = list;
                } else {
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                        jpfVar = (jpf) obj2;
                        if (jpfVar.b.equals("-")) {
                        }
                        if (jpfVar.d == 0) {
                        }
                        arrayList.add(obj2);
                    }
                    list2 = arrayList;
                }
                if (fofVarI == null) {
                    fofVarI = tdc.I();
                }
                mrfVar = new mrf(fofVarI, wifVar2, list2, ljgVar2, iun.f15405a, z);
                gzt gztVar2 = (gzt) uiiVar.f;
                this.p = null;
                this.i = null;
                this.j = null;
                this.k = mrfVar;
                this.l = null;
                this.m = null;
                this.n = j2;
                this.o = (byte) 4;
                p7m0 p7m0Var2 = (p7m0) ((qz40) ((a8z) gztVar2.f12198a.b.b).getValue());
                p7m0Var2.getClass();
                p7m0Var2.o(null, mrfVar);
                unit = Unit.f46060a;
                wne wneVar3 = wne.f39444a;
                if (unit != wneVar) {
                    return mrfVar;
                }
            }
        }
        return wneVar;
    }
}
