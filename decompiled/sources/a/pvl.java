package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pvl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27667a;
    public final /* synthetic */ rvl b;

    public /* synthetic */ pvl(rvl rvlVar, byte b) {
        this.f27667a = b;
        this.b = rvlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27667a;
        rvl rvlVar = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                List list = rvl.z;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                int i = 0;
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    Pair pair = (Pair) obj2;
                    Object obj3 = pair.f46059a;
                    Object obj4 = pair.b;
                    Number number = (Number) obj3;
                    float fFloatValue2 = number.floatValue();
                    List list2 = rvl.A;
                    int i3 = -1;
                    int i4 = fFloatValue2 > ((Number) ((Pair) list2.get(i)).f46059a).floatValue() ? -1 : 1;
                    Number number2 = (Number) obj4;
                    if (number2.floatValue() <= ((Number) ((Pair) list2.get(i)).b).floatValue()) {
                        i3 = 1;
                    }
                    arrayList.add(new Pair(Float.valueOf((Math.abs(number.floatValue() - ((Number) ((Pair) list2.get(i)).f46059a).floatValue()) * i4 * fFloatValue) + number.floatValue()), Float.valueOf((Math.abs(number2.floatValue() - ((Number) ((Pair) list2.get(i)).b).floatValue()) * i3 * fFloatValue) + number2.floatValue())));
                    i = i2;
                }
                rvlVar.h(arrayList);
                rvlVar.f31174a.invalidate();
                return Unit.f46060a;
            case 1:
                rvlVar.r.setColor(((Integer) obj).intValue());
                rvlVar.f31174a.invalidate();
                return Unit.f46060a;
            case 2:
                rvlVar.q.setColor(((Integer) obj).intValue());
                rvlVar.f31174a.invalidate();
                return Unit.f46060a;
            case 3:
                rvlVar.r.setColor(((Integer) obj).intValue());
                rvlVar.f31174a.invalidate();
                return Unit.f46060a;
            default:
                rvlVar.q.setColor(((Integer) obj).intValue());
                rvlVar.f31174a.invalidate();
                return Unit.f46060a;
        }
    }
}
