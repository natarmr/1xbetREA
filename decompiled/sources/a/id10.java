package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class id10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ String n;
    public Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ List q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id10(abu abuVar, List list, long j, long j2, String str, long j3, yje yjeVar) {
        super(2, yjeVar);
        this.p = abuVar;
        this.q = list;
        this.k = j;
        this.l = j2;
        this.n = str;
        this.m = j3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                id10 id10Var = new id10((abu) obj2, this.q, this.k, this.l, this.n, this.m, yjeVar);
                id10Var.o = obj;
                return id10Var;
            default:
                return new id10((ywu) obj2, this.k, this.l, this.m, this.n, (ArrayList) this.q, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((id10) create((v1z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((id10) create((we60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object objA;
        rc10 rc10Var;
        rc10 rc10Var2;
        ywu ywuVar;
        Object objB;
        ArrayList arrayList;
        byte b = this.i;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                v1z v1zVar = (v1z) this.o;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    abu abuVar = (abu) obj2;
                    ieu ieuVar = (ieu) abuVar.b;
                    String strA = ((btt0) abuVar.c).a();
                    Long l = v1zVar.f36657a;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    List list = this.q;
                    String strB0 = list != null ? CollectionsKt.b0(list, Separators.COMMA, null, null, null, 62) : null;
                    this.o = null;
                    this.j = true;
                    objA = ((ic10) ((rx00) ieuVar.c).invoke()).a(strA, 617, 15, jLongValue, this.k, this.l, "all", "all", this.n, strB0, this.m, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                qc10 qc10Var = (qc10) objA;
                String str = qc10Var.b;
                Iterable<mc10> iterable = qc10Var.f28466a;
                if (str != null && str.length() > 0) {
                    throw new zhi0(str, qc10Var.c, (Integer) null, 12);
                }
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                for (mc10 mc10Var : iterable) {
                    mc10Var.getClass();
                    Long l2 = mc10Var.f21530a;
                    long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                    String str2 = mc10Var.c;
                    String str3 = str2 == null ? "" : str2;
                    String str4 = mc10Var.e;
                    String str5 = str4 == null ? "" : str4;
                    Integer num = mc10Var.h;
                    if (num != null && num.intValue() == 0) {
                        rc10Var2 = rc10.f30217a;
                    } else {
                        if (num != null && num.intValue() == 1) {
                            rc10Var = rc10.b;
                        } else {
                            if (num == null || num.intValue() != 2) {
                                jf4.k(null);
                                return null;
                            }
                            rc10Var = rc10.c;
                        }
                        rc10Var2 = rc10Var;
                    }
                    Long l3 = mc10Var.i;
                    if (l3 == null) {
                        jf4.k(null);
                        return null;
                    }
                    String strValueOf = String.valueOf(l3.longValue());
                    nwd nwdVar = q4f.f28094a;
                    Double d = mc10Var.b;
                    arrayList2.add(new nc10(str3, str5, rc10Var2, strValueOf, jLongValue2, d != null ? d.doubleValue() : 0.0d));
                }
                return arrayList2;
            default:
                ywu ywuVar2 = (ywu) obj2;
                knf0 knf0Var = (knf0) ywuVar2.c;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    fck0 fck0Var = (fck0) ywuVar2.b;
                    String strA2 = ((btt0) ywuVar2.d).a();
                    knf0Var.getClass();
                    knf0Var.getClass();
                    String strC = knf0Var.c();
                    this.o = ywuVar2;
                    this.j = true;
                    ywuVar = ywuVar2;
                    objB = ((bor0) ((qir0) fck0Var.c).invoke()).b(strA2, 1, 22, this.k, this.l, this.m, this.n, strC, 0, "application/vnd.xenvelop+json", this);
                    if (objB == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ywu ywuVar3 = (ywu) this.o;
                    z1x.P(obj);
                    ywuVar = ywuVar3;
                    objB = obj;
                }
                List list2 = ((sor0) ((dx5) objB).a()).f32558a;
                ArrayList arrayList3 = (ArrayList) this.q;
                ywuVar.getClass();
                if (list2 != null && !list2.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (CollectionsKt.L(arrayList3, ((lor0) obj3).k)) {
                            arrayList4.add(obj3);
                        }
                    }
                    list2 = arrayList4;
                }
                if (list2 != null) {
                    ArrayList arrayList5 = new ArrayList(r3d.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(n8n0.n((lor0) it.next()));
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                return arrayList == null ? iun.f15405a : arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id10(ywu ywuVar, long j, long j2, long j3, String str, ArrayList arrayList, yje yjeVar) {
        super(2, yjeVar);
        this.p = ywuVar;
        this.k = j;
        this.l = j2;
        this.m = j3;
        this.n = str;
        this.q = arrayList;
    }
}
