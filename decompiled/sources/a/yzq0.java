package a;

import java.util.List;
import kotlin.Unit;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class yzq0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43529a;
    public final /* synthetic */ vsg0 b;
    public final /* synthetic */ cyu c;
    public final /* synthetic */ hie0 d;
    public final /* synthetic */ CyberGamesPage e;
    public final /* synthetic */ List f;

    public /* synthetic */ yzq0(vsg0 vsg0Var, cyu cyuVar, hie0 hie0Var, CyberGamesPage cyberGamesPage, List list, byte b) {
        this.f43529a = b;
        this.b = vsg0Var;
        this.c = cyuVar;
        this.d = hie0Var;
        this.e = cyberGamesPage;
        this.f = list;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        vzq0 vzq0Var;
        a0r0 a0r0Var;
        c0r0 c0r0Var;
        byte b = this.f43529a;
        vsg0 vsg0Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof vzq0) {
                    vzq0Var = (vzq0) yjeVar;
                    int i = vzq0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        vzq0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        vzq0Var = new vzq0(this, yjeVar);
                    }
                } else {
                    vzq0Var = new vzq0(this, yjeVar);
                }
                Object obj = vzq0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = vzq0Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    xzq0 xzq0Var = new xzq0(kmqVar, this.c, this.d, this.e, this.f, (byte) 0);
                    vzq0Var.j = 1;
                    if (vsg0Var.c(xzq0Var, vzq0Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof a0r0) {
                    a0r0Var = (a0r0) yjeVar;
                    int i3 = a0r0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        a0r0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        a0r0Var = new a0r0(this, yjeVar);
                    }
                } else {
                    a0r0Var = new a0r0(this, yjeVar);
                }
                Object obj2 = a0r0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = a0r0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    xzq0 xzq0Var2 = new xzq0(kmqVar, this.c, this.d, this.e, this.f, (byte) 1);
                    a0r0Var.j = 1;
                    if (vsg0Var.c(xzq0Var2, a0r0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof c0r0) {
                    c0r0Var = (c0r0) yjeVar;
                    int i5 = c0r0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0r0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        c0r0Var = new c0r0(this, yjeVar);
                    }
                } else {
                    c0r0Var = new c0r0(this, yjeVar);
                }
                Object obj3 = c0r0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = c0r0Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    xzq0 xzq0Var3 = new xzq0(kmqVar, this.c, this.d, this.e, this.f, (byte) 2);
                    c0r0Var.j = 1;
                    if (vsg0Var.c(xzq0Var3, c0r0Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
