package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class d1g implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5307a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ g1g c;

    public /* synthetic */ d1g(kmq kmqVar, g1g g1gVar, byte b) {
        this.f5307a = b;
        this.b = kmqVar;
        this.c = g1gVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        c1g c1gVar;
        Boolean boolValueOf;
        f1g f1gVar;
        Boolean boolValueOf2;
        byte b = this.f5307a;
        g1g g1gVar = this.c;
        kmq kmqVar = this.b;
        Object obj2 = null;
        switch (b) {
            case 0:
                if (yjeVar instanceof c1g) {
                    c1gVar = (c1g) yjeVar;
                    int i = c1gVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1gVar.j = i - Integer.MIN_VALUE;
                    } else {
                        c1gVar = new c1g(this, yjeVar);
                    }
                } else {
                    c1gVar = new c1g(this, yjeVar);
                }
                Object obj3 = c1gVar.i;
                wne wneVar = wne.f39444a;
                int i2 = c1gVar.j;
                if (i2 == 0) {
                    z1x.P(obj3);
                    for (Object obj4 : (List) obj) {
                        if (g1gVar.b.b == ((Number) obj4).longValue()) {
                            obj2 = obj4;
                            boolValueOf = Boolean.valueOf(obj2 != null);
                            c1gVar.j = 1;
                            if (kmqVar.a(boolValueOf, c1gVar) == wneVar) {
                                return wneVar;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(obj2 != null);
                    c1gVar.j = 1;
                    if (kmqVar.a(boolValueOf, c1gVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof f1g) {
                    f1gVar = (f1g) yjeVar;
                    int i3 = f1gVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        f1gVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        f1gVar = new f1g(this, yjeVar);
                    }
                } else {
                    f1gVar = new f1g(this, yjeVar);
                }
                Object obj5 = f1gVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = f1gVar.j;
                if (i4 == 0) {
                    z1x.P(obj5);
                    for (Object obj6 : (List) obj) {
                        if (((ots) obj6).f25844a == g1gVar.b.b) {
                            obj2 = obj6;
                            boolValueOf2 = Boolean.valueOf(((ots) obj2) != null);
                            f1gVar.j = 1;
                            if (kmqVar.a(boolValueOf2, f1gVar) == wneVar2) {
                                return wneVar2;
                            }
                        }
                    }
                    boolValueOf2 = Boolean.valueOf(((ots) obj2) != null);
                    f1gVar.j = 1;
                    if (kmqVar.a(boolValueOf2, f1gVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
        }
    }
}
