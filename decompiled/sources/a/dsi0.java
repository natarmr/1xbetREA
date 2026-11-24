package a;

import java.util.ArrayList;
import kotlin.Unit;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;

/* JADX INFO: loaded from: classes3.dex */
public final class dsi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final so6 f6612a;

    public Object a(jg7 jg7Var, bnn0 bnn0Var) {
        Object objA = this.f6612a.b.d.a(jg7Var, bnn0Var);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    public ArrayList b(long j) {
        gs6 gs6Var = this.f6612a.b;
        ArrayList<BetGroupZip> arrayList = gs6Var.c;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (BetGroupZip betGroupZipA : arrayList) {
            if (betGroupZipA.b == j) {
                betGroupZipA = BetGroupZip.a(betGroupZipA, null, !betGroupZipA.h, 383);
            }
            arrayList2.add(betGroupZipA);
        }
        gs6Var.getClass();
        ArrayList arrayList3 = gs6Var.c;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        return arrayList2;
    }
}
