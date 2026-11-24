package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class d2c implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5348a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ gmq c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public d2c(p6d p6dVar, org.xplatform.favorites.impl.presentation.category.f fVar, wcb wcbVar, List list) {
        this.f5348a = (byte) 1;
        this.c = p6dVar;
        this.d = fVar;
        this.e = wcbVar;
        this.b = list;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        b2c b2cVar;
        tep tepVar;
        y0v y0vVar;
        q1v q1vVar;
        byte b = this.f5348a;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.d;
        gmq gmqVar = this.c;
        switch (b) {
            case 0:
                if (yjeVar instanceof b2c) {
                    b2cVar = (b2c) yjeVar;
                    int i = b2cVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        b2cVar.j = i - Integer.MIN_VALUE;
                    } else {
                        b2cVar = new b2c(this, yjeVar);
                    }
                } else {
                    b2cVar = new b2c(this, yjeVar);
                }
                b2c b2cVar2 = b2cVar;
                Object obj4 = b2cVar2.i;
                wne wneVar = wne.f39444a;
                int i2 = b2cVar2.j;
                if (i2 == 0) {
                    z1x.P(obj4);
                    y38 y38Var = new y38((Object) kmqVar, obj3, obj2, obj, (byte) 3);
                    b2cVar2.j = 1;
                    if (((qnq) gmqVar).c(y38Var, b2cVar2) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof tep) {
                    tepVar = (tep) yjeVar;
                    int i3 = tepVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        tepVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        tepVar = new tep(this, yjeVar);
                    }
                } else {
                    tepVar = new tep(this, yjeVar);
                }
                tep tepVar2 = tepVar;
                Object obj5 = tepVar2.i;
                wne wneVar2 = wne.f39444a;
                int i4 = tepVar2.j;
                if (i4 == 0) {
                    z1x.P(obj5);
                    y38 y38Var2 = new y38((Object) kmqVar, obj3, obj, obj2, (byte) 6);
                    tepVar2.j = 1;
                    if (((p6d) gmqVar).c(y38Var2, tepVar2) == wneVar2) {
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
            case 2:
                if (yjeVar instanceof y0v) {
                    y0vVar = (y0v) yjeVar;
                    int i5 = y0vVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        y0vVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        y0vVar = new y0v(this, yjeVar);
                    }
                } else {
                    y0vVar = new y0v(this, yjeVar);
                }
                y0v y0vVar2 = y0vVar;
                Object obj6 = y0vVar2.i;
                wne wneVar3 = wne.f39444a;
                int i6 = y0vVar2.j;
                if (i6 == 0) {
                    z1x.P(obj6);
                    y38 y38Var3 = new y38((byte) 7, kmqVar, (hie0) obj2, (lie0) obj3, (f7u) obj);
                    y0vVar2.j = 1;
                    if (((p6d) gmqVar).c(y38Var3, y0vVar2) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof q1v) {
                    q1vVar = (q1v) yjeVar;
                    int i7 = q1vVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        q1vVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        q1vVar = new q1v(this, yjeVar);
                    }
                } else {
                    q1vVar = new q1v(this, yjeVar);
                }
                Object obj7 = q1vVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = q1vVar.j;
                if (i8 == 0) {
                    z1x.P(obj7);
                    y38 y38Var4 = new y38((byte) 8, kmqVar, (hie0) obj2, (lie0) obj3, (a6u) obj);
                    q1vVar.j = 1;
                    if (((p6d) gmqVar).c(y38Var4, q1vVar) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ d2c(gmq gmqVar, Object obj, Object obj2, Object obj3, byte b) {
        this.f5348a = b;
        this.c = gmqVar;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
    }
}
