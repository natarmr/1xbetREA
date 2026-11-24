package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class n5j implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22947a;
    public final Object b;

    public n5j(ctf0 ctf0Var) {
        this.f22947a = (byte) 0;
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        this.b = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.rules, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
    }

    public static List a(List list, boolean z) {
        if (!z || list.size() % 2 == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        iun iunVar = iun.f15405a;
        arrayList.add(d0t.a(new d0t(0L, "", "", "", "", "", 0, false, "", iunVar, iunVar, iunVar, 0L, 0L, "", new rqs("", 0, "", iunVar, 0, 0, 0, new kts("", "", false, false), "", 0L, 0, 0, "", iunVar, iunVar, false, 0, false, false, false, false, false, false, false, false, false, 0, new ubr(0, 0)), new f0t(0, 0L, "", iunVar, iunVar), new f0t(0, 0L, "", iunVar, iunVar), 0L, 0L, 0L, 0L, iunVar, 0L, new pfs("", "", "", "", "", "", ""), false, boh.UNKNOWN, false, false, false, false, false, false, false, "", "", iunVar, 0L, false, false, 0, new Date(), "", "", false, 0), null, false, false, false, false, null, -2, 16383));
        return CollectionsKt.L0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01f8  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if ((!r6.isEmpty()) == true) goto L19;
     */
    @Override // a.v6t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n5j.invoke(java.lang.Object):java.lang.Object");
    }

    public n5j(ftr0 ftr0Var, ctf0 ctf0Var) {
        Object kh00Var;
        this.f22947a = (byte) 3;
        ctf0Var.getClass();
        int iOrdinal = ftr0Var.b.ordinal();
        if (iOrdinal == 1) {
            kh00Var = new kh00(ftr0Var, ctf0Var);
        } else if (iOrdinal == 2) {
            kh00Var = new nw8(ftr0Var, ctf0Var);
        } else if (iOrdinal != 3) {
            kh00Var = new kh00(ftr0Var, ctf0Var);
        } else {
            kh00Var = new ee2(ftr0Var, ctf0Var);
        }
        this.b = kh00Var;
    }

    public /* synthetic */ n5j(Object obj, byte b) {
        this.f22947a = b;
        this.b = obj;
    }
}
