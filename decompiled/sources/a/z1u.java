package a;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class z1u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ul9 f43639a;

    public z1u(ul9 ul9Var, byte b) {
        ul9Var.getClass();
        switch (b) {
            case 1:
                this.f43639a = ul9Var;
                break;
            default:
                this.f43639a = ul9Var;
                break;
        }
    }

    public Object a(c5g c5gVar, zje zjeVar) {
        ul9 ul9Var = this.f43639a;
        o4g o4gVarB = ul9Var.b();
        int i = c5gVar.b + 1;
        d5g d5gVar = (d5g) CollectionsKt.firstOrNull(o4gVarB.b);
        List<d5g> list = o4gVarB.b;
        d5g d5gVar2 = (d5g) CollectionsKt.f0(list);
        if (d5gVar != null) {
            List list2 = d5gVar.b;
            if (d5gVar2 != null) {
                List list3 = d5gVar2.b;
                if (!list.isEmpty()) {
                    for (d5g d5gVar3 : list) {
                        if (d5gVar3.f5503a == c5gVar.f3770a && rz4.C(i, d5gVar3.b)) {
                            Unit unitH = ul9Var.h(c5gVar);
                            return unitH == wne.f39444a ? unitH : Unit.f46060a;
                        }
                    }
                }
                if (i < ((Number) CollectionsKt.l0(list2)).intValue()) {
                    Unit unitH2 = ul9Var.h(c5g.a(c5gVar, ((Number) CollectionsKt.l0(list2)).intValue() - 1, 1));
                    return unitH2 == wne.f39444a ? unitH2 : Unit.f46060a;
                }
                if (i <= ((Number) CollectionsKt.i0(list3)).intValue()) {
                    return Unit.f46060a;
                }
                int i2 = d5gVar2.f5503a;
                int iIntValue = ((Number) CollectionsKt.i0(list3)).intValue() - 1;
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                calendar.set(1, i2);
                calendar.set(2, iIntValue);
                calendar.set(5, calendar.getActualMaximum(5));
                Unit unitH3 = ul9Var.h(c5g.a(c5gVar, ((Number) CollectionsKt.i0(list3)).intValue() - 1, calendar.get(5)));
                return unitH3 == wne.f39444a ? unitH3 : Unit.f46060a;
            }
        }
        return Unit.f46060a;
    }
}
