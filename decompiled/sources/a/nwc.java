package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class nwc extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ rwc j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ int l;
    public final /* synthetic */ String m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwc(rwc rwcVar, boolean z, int i, String str, boolean z2, String str2, String str3, yje yjeVar) {
        super(2, yjeVar);
        this.j = rwcVar;
        this.k = z;
        this.l = i;
        this.m = str;
        this.n = z2;
        this.o = str2;
        this.p = str3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new nwc(this.j, this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nwc) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objE;
        Iterator it;
        int i;
        ?? arrayList;
        Iterator it2;
        bp5 bp5Var;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        int i2 = 0;
        String str = null;
        if (!z) {
            z1x.P(obj);
            rwc rwcVar = this.j;
            us3 us3Var = rwcVar.f;
            knf0 knf0Var = rwcVar.e;
            go3 go3VarC = us3Var.c();
            do20 do20Var = rwcVar.b;
            String strC = knf0Var.c();
            knf0Var.getClass();
            knf0Var.getClass();
            String string = go3VarC.toString();
            this.i = true;
            objE = ((et5) ((sza) do20Var.f6397a).invoke()).e(strC, "application/vnd.xenvelop+json", this.k, this.l, 1357, this.m, 22, this.n, string, new fk9(false), this);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objE = obj;
        }
        Iterable iterable = (Iterable) ((dx5) objE).a();
        int i3 = 10;
        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            lvc lvcVar = (lvc) it3.next();
            lvcVar.getClass();
            String str2 = this.o;
            str2.getClass();
            String str3 = this.p;
            str3.getClass();
            cl5 cl5Var = mvc.b;
            String str4 = lvcVar.f20708a;
            cl5Var.getClass();
            mvc mvcVarR = cl5.r(str4);
            String str5 = lvcVar.b;
            if (str5 == null) {
                str5 = "";
            }
            List<l3b> list = lvcVar.c;
            if (list != null) {
                arrayList = new ArrayList(r3d.q(list, i3));
                for (l3b l3bVar : list) {
                    l3bVar.getClass();
                    Integer num = l3bVar.f19350a;
                    int iIntValue = num != null ? num.intValue() : i2;
                    String str6 = l3bVar.b;
                    String strConcat = str6 != null ? str2.concat(str6) : str;
                    String str7 = strConcat == null ? "" : strConcat;
                    String str8 = l3bVar.c;
                    String strConcat2 = str8 != null ? str2.concat(str8) : str;
                    String str9 = strConcat2 == null ? "" : strConcat2;
                    String str10 = l3bVar.d;
                    String strConcat3 = str10 != null ? str2.concat(str10) : str;
                    String str11 = strConcat3 == null ? "" : strConcat3;
                    String str12 = l3bVar.e;
                    String strConcat4 = str12 != null ? str2.concat(str12) : str;
                    String str13 = strConcat4 == null ? "" : strConcat4;
                    String str14 = l3bVar.f;
                    String strConcat5 = str14 != null ? str2.concat(str14) : str;
                    String str15 = strConcat5 == null ? "" : strConcat5;
                    String str16 = l3bVar.g;
                    String strConcat6 = str16 != null ? str2.concat(str16) : str;
                    String str17 = strConcat6 == null ? "" : strConcat6;
                    yk5 yk5Var = bp5.b;
                    Integer num2 = l3bVar.i;
                    yk5Var.getClass();
                    bp5[] bp5VarArr = bp5.c;
                    int length = bp5VarArr.length;
                    int i4 = i2;
                    while (true) {
                        if (i4 >= length) {
                            it2 = it3;
                            bp5Var = null;
                            break;
                        }
                        bp5Var = bp5VarArr[i4];
                        it2 = it3;
                        byte b = bp5Var.f2964a;
                        int i5 = length;
                        if (num2 != null && b == num2.intValue()) {
                            break;
                        }
                        i4++;
                        length = i5;
                        it3 = it2;
                    }
                    if (bp5Var == null) {
                        bp5Var = bp5.INFO_TYPE;
                    }
                    bp5 bp5Var2 = bp5Var;
                    String str18 = l3bVar.k;
                    if (str18 == null) {
                        str18 = "";
                    }
                    String strR = kotlin.text.c.r(kotlin.text.c.r(str18, "<p>", "", false), "</p>", "", false);
                    String str19 = l3bVar.l;
                    if (str19 == null) {
                        str19 = "";
                    }
                    String strR2 = kotlin.text.c.r(kotlin.text.c.r(str19, "<p>", "", false), "</p>", "", false);
                    String str20 = l3bVar.j;
                    String strA = str20 != null ? uwc.a(str20, str3) : null;
                    arrayList.add(new uvc(iIntValue, str7, str9, str11, str13, str15, str17, bp5Var2, strR, strR2, "", strA == null ? "" : strA));
                    i2 = 0;
                    it3 = it2;
                    str = null;
                }
                it = it3;
                i = i2;
            } else {
                it = it3;
                i = i2;
                arrayList = iun.f15405a;
            }
            arrayList2.add(new awc(mvcVarR, str5, arrayList));
            i2 = i;
            it3 = it;
            i3 = 10;
            str = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!((awc) obj2).c.isEmpty()) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }
}
