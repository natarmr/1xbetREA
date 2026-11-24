package a;

import android.util.Rational;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mto implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22380a;
    public final Object b;

    public /* synthetic */ mto(Object obj, byte b) {
        this.f22380a = b;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Class<?> cls;
        String name;
        String name2;
        byte b = this.f22380a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                rai0 rai0Var = (rai0) obj3;
                return ((Comparable) rai0Var.invoke(obj)).compareTo((Comparable) rai0Var.invoke(obj2));
            case 1:
                String str = (String) obj3;
                fhy fhyVarO = ((kiy) obj).o();
                if (fhyVarO == null) {
                    e9d0.y(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (!(fhyVarO instanceof sgy)) {
                    if (fhyVarO instanceof miy) {
                        name = ((niy) ((miy) fhyVarO)).d;
                    } else {
                        cls = fhyVarO.getClass();
                    }
                    e9d0.x(sre0.f32672a.b(cls), "Unknown upper bound classifier: ");
                    return 0;
                }
                name = azw.G((sgy) fhyVarO).getName();
                fhy fhyVarO2 = ((kiy) obj2).o();
                if (fhyVarO2 == null) {
                    e9d0.y(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (fhyVarO2 instanceof sgy) {
                    name2 = azw.G((sgy) fhyVarO2).getName();
                } else {
                    if (!(fhyVarO2 instanceof miy)) {
                        cls = fhyVarO2.getClass();
                        e9d0.x(sre0.f32672a.b(cls), "Unknown upper bound classifier: ");
                        return 0;
                    }
                    name2 = ((niy) ((miy) fhyVarO2)).d;
                }
                return hdd.b(name, name2);
            case 2:
                o4g o4gVar = (o4g) obj3;
                return Integer.valueOf(o4gVar.f24633a.indexOf(Long.valueOf(((f3n0) obj).f8872a))).compareTo(Integer.valueOf(o4gVar.f24633a.indexOf(Long.valueOf(((f3n0) obj2).f8872a))));
            case 3:
                wsy wsyVar = (wsy) obj;
                Function1 function1 = (Function1) obj3;
                wsyVar.getClass();
                String string = function1.invoke(wsyVar).toString();
                wsy wsyVar2 = (wsy) obj2;
                wsyVar2.getClass();
                return hdd.b(string, function1.invoke(wsyVar2).toString());
            case 4:
                qy40 qy40Var = (qy40) obj3;
                return Float.valueOf(qy40Var.c(((Map.Entry) obj2).getKey())).compareTo(Float.valueOf(qy40Var.c(((Map.Entry) obj).getKey())));
            case 5:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) obj3;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
            case 6:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                e7z e7zVar = ((tai0) obj).c;
                e7z e7zVar2 = ((tai0) obj2).c;
                return e7zVar.y() == e7zVar2.y() ? Intrinsics.e(e7zVar.w(), e7zVar2.w()) : Float.compare(e7zVar.y(), e7zVar2.y());
            case 7:
                int iCompare2 = ((mto) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : Integer.valueOf(((tai0) obj).f).compareTo(Integer.valueOf(((tai0) obj2).f));
            case 8:
                long[] jArr = (long[]) obj3;
                return Integer.valueOf(tx3.J(jArr, ((msl0) obj).f22327a)).compareTo(Integer.valueOf(tx3.J(jArr, ((msl0) obj2).f22327a)));
            case 9:
                ArrayList arrayList = ((lrm0) obj3).g;
                Iterator it = ((jrm0) obj).l.iterator();
                if (it.hasNext()) {
                    Integer numValueOf = Integer.valueOf(arrayList.indexOf((f3a) it.next()));
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(arrayList.indexOf((f3a) it.next()));
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    Iterator it2 = ((jrm0) obj2).l.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(arrayList.indexOf((f3a) it2.next()));
                        while (it2.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(arrayList.indexOf((f3a) it2.next()));
                            if (numValueOf3.compareTo(numValueOf4) > 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        return numValueOf.compareTo(numValueOf3);
                    }
                }
                itt0.a();
                return 0;
            case 10:
                int iCompare3 = ((mjf0) obj3).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : Long.valueOf(((d0t) obj).s).compareTo(Long.valueOf(((d0t) obj2).s));
            case 11:
                int iCompare4 = ((tgo0) obj3).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : ((nhs0) obj).c.compareTo(((nhs0) obj2).c);
            case 12:
                int iCompare5 = ((tgo0) obj3).compare(obj, obj2);
                return iCompare5 != 0 ? iCompare5 : Integer.valueOf(((j0s0) obj2).d.b).compareTo(Integer.valueOf(((j0s0) obj).d.b));
            case 13:
                int iCompare6 = ((mto) obj3).compare(obj, obj2);
                return iCompare6 != 0 ? iCompare6 : hdd.b(((k9t0) obj).f17931a, ((k9t0) obj2).f17931a);
            default:
                int iCompare7 = ((tgo0) obj3).compare(obj, obj2);
                return iCompare7 != 0 ? iCompare7 : Integer.valueOf(((k9t0) obj2).e).compareTo(Integer.valueOf(((k9t0) obj).e));
        }
    }
}
