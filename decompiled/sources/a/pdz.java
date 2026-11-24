package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class pdz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f26826a;

    public pdz(List list) {
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(16, 0.75f, true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kzg0 kzg0Var = (kzg0) it.next();
            linkedHashMap.put(kzg0Var.f19152a, new ndz(new r9h0(kzg0Var.b, kzg0Var.c)));
        }
        this.f26826a = linkedHashMap;
    }

    public final void a(String str, Function0 function0, fet fetVar, int i) {
        int i2;
        pdz pdzVar;
        String str2;
        Function0 function1;
        fetVar.g0(-810585935);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(str) : fetVar.i(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(this) ? 256 : 128;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(str))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                pdzVar = this;
                str2 = str;
                function1 = function0;
                c6y c6yVar = new c6y((Object) function1, (Object) pdzVar, (Object) str2, (yje) null, (byte) 14);
                fetVar.o0(c6yVar);
                objP = c6yVar;
            } else {
                pdzVar = this;
                str2 = str;
                function1 = function0;
            }
            m0x0.t(fetVar, str2, (Function2) objP);
        } else {
            pdzVar = this;
            str2 = str;
            function1 = function0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) pdzVar, (Object) str2, (Object) function1, i, (byte) 26);
        }
    }

    public final xcz b(String str, fet fetVar, int i) {
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = new hvy((byte) 16);
            fetVar.o0(objP);
        }
        xcz xczVar = (xcz) c(str, (Function2) objP);
        boolean zG = fetVar.g(xczVar);
        Object objP2 = fetVar.P();
        if (zG || objP2 == obj) {
            objP2 = new a7s(xczVar, (byte) 4);
            fetVar.o0(objP2);
        }
        a(str, (Function0) objP2, fetVar, ((i << 3) & 896) | (i & 14));
        return xczVar;
    }

    public final bch0 c(String str, Function2 function2) {
        LinkedHashMap linkedHashMap = this.f26826a;
        Object ndzVar = linkedHashMap.get(str);
        if (ndzVar == null) {
            ndzVar = new ndz(new r9h0(0, 0));
            linkedHashMap.put(str, ndzVar);
        }
        ndz ndzVar2 = (ndz) ndzVar;
        r9h0 r9h0Var = ndzVar2.f23357a;
        if (linkedHashMap.size() > 64) {
            Set setKeySet = linkedHashMap.keySet();
            setKeySet.getClass();
            linkedHashMap.remove(CollectionsKt.T(setKeySet));
        }
        bch0 bch0Var = ndzVar2.b;
        if (bch0Var != null) {
            return bch0Var;
        }
        bch0 bch0Var2 = (bch0) function2.invoke(Integer.valueOf(r9h0Var.f30082a), Integer.valueOf(r9h0Var.b));
        ndzVar2.b = bch0Var2;
        return bch0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (((a.xcz) r2).l(r9, r11, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        if (((a.d9z) r2).l(r9, r11, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (((a.mez) r2).k(r9, r11, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, int r10, a.yje r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof a.odz
            if (r0 == 0) goto L13
            r0 = r11
            a.odz r0 = (a.odz) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.odz r0 = new a.odz
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            goto L31
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L31:
            a.ndz r8 = r0.i
            a.z1x.P(r11)
            goto L9c
        L37:
            a.z1x.P(r11)
            java.util.LinkedHashMap r8 = r8.f26826a
            java.lang.Object r8 = r8.get(r9)
            a.ndz r8 = (a.ndz) r8
            if (r8 != 0) goto L47
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L47:
            a.r9h0 r9 = r8.f23357a
            int r11 = r9.b
            a.bch0 r2 = r8.b
            if (r2 != 0) goto L52
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L52:
            boolean r6 = r8.c
            if (r6 != 0) goto L9e
            a.r9h0 r6 = new a.r9h0
            r7 = 0
            r6.<init>(r7, r7)
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L65
            r8.c = r5
            goto L9e
        L65:
            int r9 = r9.f30082a
            if (r10 <= r9) goto L9e
            boolean r10 = r2 instanceof a.xcz
            if (r10 == 0) goto L7a
            a.xcz r2 = (a.xcz) r2
            r0.i = r8
            r0.l = r5
            java.lang.Object r9 = r2.l(r9, r11, r0)
            if (r9 != r1) goto L9c
            goto L9b
        L7a:
            boolean r10 = r2 instanceof a.d9z
            if (r10 == 0) goto L8b
            a.d9z r2 = (a.d9z) r2
            r0.i = r8
            r0.l = r4
            java.lang.Object r9 = r2.l(r9, r11, r0)
            if (r9 != r1) goto L9c
            goto L9b
        L8b:
            boolean r10 = r2 instanceof a.mez
            if (r10 == 0) goto L9c
            a.mez r2 = (a.mez) r2
            r0.i = r8
            r0.l = r3
            java.lang.Object r9 = r2.k(r9, r11, r0)
            if (r9 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r8.c = r5
        L9e:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pdz.d(java.lang.String, int, a.yje):java.lang.Object");
    }
}
