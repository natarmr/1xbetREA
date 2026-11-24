package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xplatform.bethistory.domain.model.GeneralBetInfoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class e6w extends bnn0 implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ List Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ boolean f1;
    public boolean i;
    public final /* synthetic */ rrd j;
    public final /* synthetic */ s77 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ String o;
    public final /* synthetic */ int p;
    public final /* synthetic */ long q;
    public final /* synthetic */ long r;
    public final /* synthetic */ long s;
    public final /* synthetic */ int t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ long v;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6w(rrd rrdVar, s77 s77Var, boolean z, boolean z2, boolean z3, String str, int i, long j, long j2, long j3, int i2, boolean z4, long j4, String str2, String str3, boolean z5, List list, List list2, boolean z6, List list3, boolean z7, boolean z8, yje yjeVar) {
        super(2, yjeVar);
        this.j = rrdVar;
        this.k = s77Var;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = str;
        this.p = i;
        this.q = j;
        this.r = j2;
        this.s = j3;
        this.t = i2;
        this.u = z4;
        this.v = j4;
        this.w = str2;
        this.x = str3;
        this.y = z5;
        this.z = list;
        this.A = list2;
        this.B = z6;
        this.Y = list3;
        this.Z = z7;
        this.f1 = z8;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new e6w(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.Y, this.Z, this.f1, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e6w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object objA;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        String str = this.o;
        rrd rrdVar = this.j;
        if (!z) {
            z1x.P(obj);
            String strC = ((knf0) rrdVar.h).c();
            sys0 sys0Var = sys0.f33037a;
            s77 s77Var = s77.EVENTS;
            s77 s77Var2 = this.k;
            List listA = s77Var2 == s77Var ? ((tnm0) rrdVar.f).a(sys0Var, s77Var2, this.l, this.m, this.n) : kotlin.collections.a.c(1);
            Long lT0 = str != null ? StringsKt.t0(str) : null;
            boolean z2 = this.k == s77.SALE;
            listA.getClass();
            wst wstVar = new wst(strC, this.p, this.q, this.r, this.s, this.t, listA, lT0, z2, this.u);
            pyu pyuVar = (pyu) rrdVar.c;
            String strA = ((btt0) rrdVar.i).a();
            this.i = true;
            objA = ((r37) ((tpv) pyuVar.f27815a).invoke()).a(strA, wstVar, this);
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
        sg7 sg7Var = (sg7) objA;
        List listA2 = sg7Var.a();
        m0w m0wVar = (m0w) rrdVar.g;
        m0wVar.getClass();
        if (str != null) {
            m0wVar.c.addAll(listA2);
        } else {
            ArrayList arrayList = m0wVar.c;
            arrayList.clear();
            arrayList.addAll(listA2);
        }
        rdj rdjVar = rdj.f30294a;
        znq0 znq0Var = new znq0(this.r);
        sdj sdjVar = sdj.UNIVERSAL;
        String strF = rdj.f(znq0Var, sdjVar, null, 60);
        String strF2 = rdj.f(new znq0(this.v), sdjVar, null, 60);
        ng7 ng7Var = sg7Var.b;
        GeneralBetInfoModel generalBetInfoModelF0 = ng7Var != null ? fre0.f0(ng7Var, this.w, strF, strF2) : GeneralBetInfoModel.h;
        ArrayList arrayList2 = new ArrayList(r3d.q(listA2, 10));
        Iterator it = listA2.iterator();
        while (it.hasNext()) {
            arrayList2.add(bkb.r0((rg7) it.next(), this.k, this.x, this.y, this.z, this.A, this.B, this.Y, this.Z, this.f1));
        }
        return new gbr(arrayList2, generalBetInfoModelF0);
    }
}
