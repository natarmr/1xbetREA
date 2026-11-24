package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qwc extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ rwc j;
    public final /* synthetic */ mvc k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwc(rwc rwcVar, mvc mvcVar, boolean z, int i, String str, boolean z2, String str2, String str3, yje yjeVar) {
        super(2, yjeVar);
        this.j = rwcVar;
        this.k = mvcVar;
        this.l = z;
        this.m = i;
        this.n = str;
        this.o = z2;
        this.p = str2;
        this.q = str3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new qwc(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qwc) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objG;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            rwc rwcVar = this.j;
            us3 us3Var = rwcVar.f;
            knf0 knf0Var = rwcVar.e;
            go3 go3VarC = us3Var.c();
            do20 do20Var = rwcVar.b;
            String strC = knf0Var.c();
            knf0Var.getClass();
            String str = this.k.f22451a;
            knf0Var.getClass();
            String string = go3VarC.toString();
            this.i = true;
            objG = ((et5) ((sza) do20Var.f6397a).invoke()).g(strC, "application/vnd.xenvelop+json", this.l, this.m, str, 1357, this.n, 22, this.o, string, new fk9(false), this);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objG = obj;
        }
        Iterable iterable = (Iterable) ((dx5) objG).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(gkb.a0((xvc) it.next(), this.p, this.q));
        }
        return arrayList;
    }
}
