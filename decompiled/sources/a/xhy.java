package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class xhy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40917a;
    public final yhy b;
    public final zhy c;

    public xhy(zhy zhyVar, yhy yhyVar) {
        this.f40917a = (byte) 0;
        this.c = zhyVar;
        this.b = yhyVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x017f  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws ClassNotFoundException {
        String str;
        iiy yryVar;
        byte b = this.f40917a;
        zhy zhyVar = this.c;
        yhy yhyVar = this.b;
        switch (b) {
            case 0:
                Class cls = zhyVar.b;
                if (!aao0.c) {
                    mre0 mre0Var = yhyVar.e;
                    iiy iiyVar = yhy.g[1];
                    Object objInvoke = mre0Var.invoke();
                    objInvoke.getClass();
                    cr30 cr30Var = (cr30) objInvoke;
                    Iterable<cr30> iterableC = cr30Var instanceof qfk ? kotlin.collections.a.c(cr30Var) : cr30Var instanceof pbb ? tx3.g0(((pbb) cr30Var).c) : iun.f15405a;
                    ArrayList arrayList = new ArrayList(r3d.q(iterableC, 10));
                    for (cr30 cr30Var2 : iterableC) {
                        cr30Var2.getClass();
                        qfk qfkVar = (qfk) cr30Var2;
                        arrayList.add(m8x.r0(qfkVar.h, (h950) qfkVar.b.b, false, 6));
                    }
                    return arrayList;
                }
                Metadata metadata = (Metadata) cls.getAnnotation(Metadata.class);
                e9x e9xVarR = metadata != null ? d9x.R(metadata) : null;
                if (e9xVarR instanceof ery) {
                    return kotlin.collections.a.c(((ery) e9xVarR).f8303a);
                }
                if (e9xVarR instanceof gry) {
                    return kotlin.collections.a.c(((gry) e9xVarR).f11803a);
                }
                if (!(e9xVarR instanceof fry)) {
                    return iun.f15405a;
                }
                List list = ((fry) e9xVarR).f10041a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Class<?> clsLoadClass = bqe0.d(cls).loadClass(kotlin.text.c.s((String) it.next(), '/', '.'));
                    clsLoadClass.getClass();
                    ghy ghyVar = (ghy) ck9.b.c(clsLoadClass);
                    ghyVar.getClass();
                    w3d.u(arrayList2, (List) ((yhy) ((zhy) ghyVar).c.getValue()).c.getValue());
                }
                return arrayList2;
            case 1:
                mre0 mre0Var2 = yhyVar.d;
                iiy iiyVar2 = yhy.g[0];
                jre0 jre0Var = (jre0) mre0Var2.invoke();
                if (jre0Var != null) {
                    cry cryVar = jre0Var.b;
                    str = (String) cryVar.h;
                    if (((bry) cryVar.c) != bry.MULTIFILE_CLASS_PART) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                ClassLoader classLoaderD = bqe0.d(zhyVar.b);
                String strReplace = str.replace('/', '.');
                strReplace.getClass();
                return classLoaderD.loadClass(strReplace);
            default:
                boolean z = aao0.f538a;
                zhy zhyVar2 = this.c;
                if (z) {
                    zgy zgyVar = new zgy(zhyVar2, (byte) 1);
                    mre0 mre0Var3 = yhyVar.e;
                    iiy iiyVar3 = yhy.g[1];
                    Object objInvoke2 = mre0Var3.invoke();
                    objInvoke2.getClass();
                    Collection<vjj> collectionT = uvw.t((cr30) objInvoke2, null, 3);
                    ArrayList arrayList3 = new ArrayList();
                    for (vjj vjjVar : collectionT) {
                        ock ockVar = vjjVar instanceof mp9 ? (ock) vjjVar.i0(zgyVar, Unit.f46060a) : null;
                        if (ockVar != null) {
                            arrayList3.add(ockVar);
                        }
                    }
                    return CollectionsKt.L0(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (cqy cqyVar : (List) yhyVar.c.getValue()) {
                    for (dqy dqyVar : cqyVar.b) {
                        dqyVar.getClass();
                        ArrayList arrayList5 = dqyVar.h;
                        String str2 = dqyVar.b;
                        byte b2 = arrayList5.isEmpty() ? dqyVar.f != null ? (byte) 1 : (byte) 0 : (byte) -1;
                        String strC = jwb.C(dqyVar, zhyVar2);
                        if (strC == null) {
                            throw new poe(kng0.k("No field or getter signature for property: ", str2));
                        }
                        Object obj = op9.NO_RECEIVER;
                        if (j24.r.m(j24.f15764a[37], dqyVar)) {
                            if (b2 == -1) {
                                yryVar = new yry(zhyVar2, strC, obj, dqyVar, rgy.k);
                            } else if (b2 == 0) {
                                yryVar = new ury(zhyVar2, strC, obj, dqyVar, rgy.k);
                            } else if (b2 != 1) {
                                yryVar = null;
                            } else {
                                yryVar = new wry(zhyVar2, strC, obj, dqyVar, rgy.k);
                            }
                        } else if (b2 == -1) {
                            yryVar = new qsy(zhyVar2, strC, obj, dqyVar, rgy.k);
                        } else if (b2 == 0) {
                            yryVar = new ksy(zhyVar2, strC, obj, dqyVar, rgy.k);
                        } else if (b2 != 1) {
                            yryVar = null;
                        } else {
                            yryVar = new nsy(zhyVar2, strC, obj, dqyVar, rgy.k);
                        }
                        if (yryVar == null) {
                            StringBuilder sbN = b1j.n("Unsupported property: name=", str2, " signature=", strC, " container=");
                            sbN.append(zhyVar2);
                            throw new poe(sbN.toString());
                        }
                        arrayList4.add(yryVar);
                    }
                    for (bqy bqyVar : cqyVar.f4817a) {
                        bqyVar.getClass();
                        hfy hfyVar = j0x.u(bqyVar).f39041a;
                        if (hfyVar == null) {
                            ohq.t(bqyVar.b, "No signature for function: ");
                            return null;
                        }
                        arrayList4.add(new bsy(zhyVar2, hfyVar.toString(), op9.NO_RECEIVER, bqyVar, rgy.k));
                    }
                }
                return CollectionsKt.L0(arrayList4);
        }
    }

    public /* synthetic */ xhy(yhy yhyVar, zhy zhyVar, byte b) {
        this.f40917a = b;
        this.b = yhyVar;
        this.c = zhyVar;
    }
}
