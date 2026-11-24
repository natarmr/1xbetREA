package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lo1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20368a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lo1(List list, boolean z) {
        this.f20368a = (byte) 0;
        this.c = z;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20368a;
        boolean z = this.c;
        switch (b) {
            case 0:
                bo1 bo1Var = (bo1) obj2;
                ((oyg0) obj).getClass();
                bo1Var.getClass();
                List list = this.b;
                h9h0 f8h0Var = z ? new f8h0(list) : new j8h0(list);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    w3d.u(arrayList, ((j8b) it.next()).c);
                }
                int iA = wp20.a(r3d.q(arrayList, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(Long.valueOf(((mlr) obj3).f22006a), obj3);
                }
                return bo1.a(bo1Var, null, f8h0Var, null, null, z ? bo1Var.f : true, linkedHashMap, false, false, null, null, false, 0L, 1048413);
            case 1:
                cis cisVar = (cis) obj2;
                ((oyg0) obj).getClass();
                cisVar.getClass();
                List list2 = this.b;
                if (list2.isEmpty()) {
                    return cis.a(cisVar, null, null, z ? ais.c : ais.d, null, false, false, 107);
                }
                return cis.a(cisVar, null, list2, ais.f939a, null, false, false, 105);
            default:
                nj00 nj00Var = (nj00) obj2;
                ((oyg0) obj).getClass();
                nj00Var.getClass();
                List list3 = this.b;
                if (list3.isEmpty()) {
                    return nj00.a(nj00Var, null, null, null, z ? ais.c : ais.d, null, false, null, false, Response.PROXY_AUTHENTICATION_REQUIRED);
                }
                return nj00.a(nj00Var, null, null, list3, ais.f939a, null, false, null, false, Response.FORBIDDEN);
        }
    }

    public /* synthetic */ lo1(List list, boolean z, byte b) {
        this.f20368a = b;
        this.b = list;
        this.c = z;
    }
}
