package a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class boo implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2943a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ hoo c;

    public /* synthetic */ boo(kmq kmqVar, hoo hooVar, byte b) {
        this.f2943a = b;
        this.b = kmqVar;
        this.c = hooVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        aoo aooVar;
        eoo eooVar;
        byte b = this.f2943a;
        hoo hooVar = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof aoo) {
                    aooVar = (aoo) yjeVar;
                    int i = aooVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aooVar.j = i - Integer.MIN_VALUE;
                    } else {
                        aooVar = new aoo(this, yjeVar);
                    }
                } else {
                    aooVar = new aoo(this, yjeVar);
                }
                Object obj2 = aooVar.i;
                wne wneVar = wne.f39444a;
                int i2 = aooVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    Collection collectionValues = ((HashMap) obj).values();
                    collectionValues.getClass();
                    hooVar.getClass();
                    Boolean boolValueOf = Boolean.valueOf(hoo.a(collectionValues));
                    aooVar.j = 1;
                    if (kmqVar.a(boolValueOf, aooVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof eoo) {
                    eooVar = (eoo) yjeVar;
                    int i3 = eooVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        eooVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        eooVar = new eoo(this, yjeVar);
                    }
                } else {
                    eooVar = new eoo(this, yjeVar);
                }
                Object obj3 = eooVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = eooVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    Collection collectionValues2 = ((Map) obj).values();
                    hooVar.getClass();
                    Boolean boolValueOf2 = Boolean.valueOf(hoo.a(collectionValues2));
                    eooVar.j = 1;
                    if (kmqVar.a(boolValueOf2, eooVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
