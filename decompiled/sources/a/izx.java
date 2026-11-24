package a;

import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class izx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh0 f15654a;
    public final et2 b;

    public izx(zjh0 zjh0Var, et2 et2Var) {
        this.f15654a = zjh0Var;
        this.b = et2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v0 v0Var, String str, i7a i7aVar, zje zjeVar) throws NoSuchAlgorithmException {
        rty rtyVar;
        long jCurrentTimeMillis;
        if (zjeVar instanceof rty) {
            rtyVar = (rty) zjeVar;
            int i = rtyVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                rtyVar.m = i - Integer.MIN_VALUE;
            } else {
                rtyVar = new rty(this, zjeVar);
            }
        } else {
            rtyVar = new rty(this, zjeVar);
        }
        Object objB = rtyVar.k;
        Object obj = wne.f39444a;
        int i2 = rtyVar.m;
        if (i2 == 0) {
            z1x.P(objB);
            jCurrentTimeMillis = System.currentTimeMillis();
            rtyVar.i = v0Var;
            rtyVar.j = jCurrentTimeMillis;
            rtyVar.m = 1;
            objB = b(str, i7aVar, rtyVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j = rtyVar.j;
            v0 v0Var2 = rtyVar.i;
            z1x.P(objB);
            jCurrentTimeMillis = j;
            v0Var = v0Var2;
        }
        String str2 = (String) objB;
        String str3 = (String) v0Var.b;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        ony onyVar = this.b.f8355a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("methodName", ncy.c(str3));
        linkedHashMap.put("timeValue", ncy.b(Long.valueOf(jCurrentTimeMillis2)));
        ((rny) onyVar).a("captchaTime", new tny("captchaLoading", xp20.n(linkedHashMap)));
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        if (r1 == r3) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r18, a.i7a r19, a.zje r20) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.izx.b(java.lang.String, a.i7a, a.zje):java.lang.Object");
    }
}
