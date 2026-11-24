package a;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class fik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f9592a = wv00.h("DiagnosticsWrkr");

    public static final String a(hpv0 hpv0Var, zpv0 zpv0Var, s9o0 s9o0Var, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ppv0 ppv0Var = (ppv0) it.next();
            xov0 xov0VarK = jpm0.k(ppv0Var);
            String str = ppv0Var.f27390a;
            s9o0Var.getClass();
            String str2 = xov0VarK.f41241a;
            int i = xov0VarK.b;
            str2.getClass();
            byte b = 2;
            r9o0 r9o0Var = (r9o0) kpb.h0(s9o0Var.f31856a, true, false, new e6n(b, i, str2));
            Integer numValueOf = r9o0Var != null ? Integer.valueOf(r9o0Var.c) : null;
            hpv0Var.getClass();
            str.getClass();
            String strB0 = CollectionsKt.b0((List) kpb.h0(hpv0Var.f13461a, true, false, new ka6(str, (byte) 18)), Separators.COMMA, null, null, null, 62);
            zpv0Var.getClass();
            String strB1 = CollectionsKt.b0((List) kpb.h0(zpv0Var.f44780a, true, false, new tpv0(str, b)), Separators.COMMA, null, null, null, 62);
            String str3 = ppv0Var.c;
            String strName = ppv0Var.b.name();
            StringBuilder sbN = b1j.n(Separators.RETURN, str, "\t ", str3, "\t ");
            b1j.u(numValueOf, "\t ", strName, "\t ", sbN);
            sb.append(ua80.m(sbN, strB0, "\t ", strB1, Separators.HT));
        }
        return sb.toString();
    }
}
