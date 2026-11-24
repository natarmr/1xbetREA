package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class o6t extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ p6t j;
    public final /* synthetic */ int k;
    public final /* synthetic */ jvn l;
    public final /* synthetic */ long m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6t(p6t p6tVar, int i, jvn jvnVar, long j, boolean z, int i2, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.j = p6tVar;
        this.k = i;
        this.l = jvnVar;
        this.m = j;
        this.n = z;
        this.o = i2;
        this.p = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new o6t(this.j, this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o6t) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            p6t p6tVar = this.j;
            a1d a1dVar = p6tVar.f26474a;
            knf0 knf0Var = p6tVar.c;
            knf0Var.getClass();
            knf0Var.getClass();
            int iB = knf0Var.b();
            String strC = knf0Var.c();
            knf0Var.getClass();
            jvn jvnVar = this.l;
            jvnVar.getClass();
            jo20 jo20Var = new jo20();
            jo20Var.put("cfView", Integer.valueOf(jvnVar.getId()));
            int i = this.o;
            if (i > 0) {
                jo20Var.put("country", Integer.valueOf(i));
            }
            jo20Var.put("fcountry", Integer.valueOf(iB));
            jo20Var.put("gr", 1357);
            jo20Var.put(ParameterNames.ID, Integer.valueOf(this.k));
            if (strC.length() == 0) {
                strC = "en";
            }
            jo20Var.put("lng", strC);
            jo20Var.put("ref", 1);
            if (this.n) {
                long j = this.m;
                if (j > 0) {
                    jo20Var.put("userId", Long.valueOf(j));
                }
            }
            jo20 jo20VarJ = w6x.j(22, jo20Var, "whence");
            this.i = true;
            obj = ((m6t) ((wgn) a1dVar.b).invoke()).a(jo20VarJ, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        Iterable iterable = (Iterable) ((dx5) obj).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(v3c.g0((a4t) it.next(), sip.b, this.p));
        }
        return r3d.r(arrayList);
    }
}
