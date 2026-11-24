package a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class u3v extends bnn0 implements zdr {
    public String i;
    public boolean j;
    public /* synthetic */ i3v k;
    public /* synthetic */ List l;
    public /* synthetic */ List m;
    public /* synthetic */ c8t0 n;
    public final /* synthetic */ nc0 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ ypl0 q;
    public final /* synthetic */ qgg r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3v(nc0 nc0Var, long j, ypl0 ypl0Var, qgg qggVar, yje yjeVar) {
        super(5, yjeVar);
        this.o = nc0Var;
        this.p = j;
        this.q = ypl0Var;
        this.r = qggVar;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ypl0 ypl0Var = this.q;
        qgg qggVar = this.r;
        u3v u3vVar = new u3v(this.o, this.p, ypl0Var, qggVar, (yje) obj5);
        u3vVar.k = (i3v) obj;
        u3vVar.l = (List) obj2;
        u3vVar.m = (List) obj3;
        u3vVar.n = (c8t0) obj4;
        return u3vVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objN;
        List list;
        List list2;
        i3v i3vVar = this.k;
        List list3 = this.l;
        List list4 = this.m;
        c8t0 c8t0Var = this.n;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        String strK0 = null;
        if (!z) {
            z1x.P(obj);
            Object obj2 = i3vVar.f14115a;
            Object obj3 = i3vVar.b;
            Object obj4 = c8t0Var.f3932a;
            nc0 nc0Var = this.o;
            nc0Var.getClass();
            if (obj3 instanceof g0g0) {
                obj3 = null;
            }
            fcg fcgVar = (fcg) obj3;
            d0t d0tVar = (fcgVar == null || (list2 = fcgVar.f9311a) == null) ? null : (d0t) CollectionsKt.firstOrNull(list2);
            if (obj2 instanceof g0g0) {
                obj2 = null;
            }
            fcg fcgVar2 = (fcg) obj2;
            d0t d0tVar2 = (fcgVar2 == null || (list = fcgVar2.f9311a) == null) ? null : (d0t) CollectionsKt.firstOrNull(list);
            if (obj4 instanceof g0g0) {
                obj4 = null;
            }
            List list5 = (List) obj4;
            Date date = list5 != null ? (Date) CollectionsKt.firstOrNull(list5) : null;
            if (d0tVar != null) {
                znq0 znq0Var = new znq0(d0tVar.s);
                dfj dfjVar = dfj.UNIQUE_7;
                Locale.ENGLISH.getClass();
                strK0 = jtv.K0(znq0Var, dfjVar, 4);
            } else if (d0tVar2 != null) {
                znq0 znq0Var2 = new znq0(d0tVar2.s);
                dfj dfjVar2 = dfj.UNIQUE_7;
                Locale.ENGLISH.getClass();
                strK0 = jtv.K0(znq0Var2, dfjVar2, 4);
            } else if (date != null) {
                dfj dfjVar3 = dfj.UNIQUE_4;
                Locale locale = Locale.ENGLISH;
                locale.getClass();
                TimeZone timeZone = TimeZone.getDefault();
                timeZone.getClass();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
                simpleDateFormat.setTimeZone(timeZone);
                strK0 = simpleDateFormat.format(date);
                strK0.getClass();
            }
            rpt rptVar = (rpt) nc0Var.c;
            this.k = i3vVar;
            this.l = list3;
            this.m = list4;
            this.n = c8t0Var;
            this.i = strK0;
            this.j = true;
            objN = rptVar.n(this.p, this, strK0);
            if (objN == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = this.i;
            z1x.P(obj);
            objN = ((j0g0) obj).f15681a;
            strK0 = str;
        }
        String str2 = strK0;
        return new xbt0(objN, i3vVar.f14115a, i3vVar.b, list3, this.q, this.r, i3vVar.c, list4, c8t0Var.f3932a, c8t0Var.b, str2 == null ? "" : str2);
    }
}
