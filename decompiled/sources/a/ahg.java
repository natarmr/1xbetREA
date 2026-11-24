package a;

import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ahg implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f873a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ sip c;

    public /* synthetic */ ahg(kmq kmqVar, sip sipVar, byte b) {
        this.f873a = b;
        this.b = kmqVar;
        this.c = sipVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        zgg zggVar;
        qch qchVar;
        byte b = this.f873a;
        sip sipVar = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof zgg) {
                    zggVar = (zgg) yjeVar;
                    int i = zggVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        zggVar.j = i - Integer.MIN_VALUE;
                    } else {
                        zggVar = new zgg(this, yjeVar);
                    }
                } else {
                    zggVar = new zgg(this, yjeVar);
                }
                Object obj2 = zggVar.i;
                wne wneVar = wne.f39444a;
                int i2 = zggVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    Object obj3 = (List) ((Map) obj).get(sipVar);
                    if (obj3 == null) {
                        obj3 = iun.f15405a;
                    }
                    zggVar.j = 1;
                    if (kmqVar.a(obj3, zggVar) == wneVar) {
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
                if (yjeVar instanceof qch) {
                    qchVar = (qch) yjeVar;
                    int i3 = qchVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qchVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        qchVar = new qch(this, yjeVar);
                    }
                } else {
                    qchVar = new qch(this, yjeVar);
                }
                Object obj4 = qchVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = qchVar.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    Object obj5 = (List) ((Map) obj).get(sipVar);
                    if (obj5 == null) {
                        obj5 = iun.f15405a;
                    }
                    qchVar.j = 1;
                    if (kmqVar.a(obj5, qchVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
        }
    }
}
