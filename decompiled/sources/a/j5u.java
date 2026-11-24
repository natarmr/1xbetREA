package a;

import kotlin.Unit;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class j5u implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15951a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ gmq c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public j5u(utb utbVar, CyberGamesPage cyberGamesPage, long j, q5u q5uVar) {
        this.c = utbVar;
        this.d = cyberGamesPage;
        this.b = j;
        this.e = q5uVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        g5u g5uVar;
        pd60 pd60Var;
        byte b = this.f15951a;
        Object obj = this.e;
        Object obj2 = this.d;
        gmq gmqVar = this.c;
        switch (b) {
            case 0:
                if (yjeVar instanceof g5u) {
                    g5uVar = (g5u) yjeVar;
                    int i = g5uVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        g5uVar.j = i - Integer.MIN_VALUE;
                    } else {
                        g5uVar = new g5u(this, yjeVar);
                    }
                } else {
                    g5uVar = new g5u(this, yjeVar);
                }
                g5u g5uVar2 = g5uVar;
                Object obj3 = g5uVar2.i;
                wne wneVar = wne.f39444a;
                int i2 = g5uVar2.j;
                if (i2 == 0) {
                    z1x.P(obj3);
                    i5u i5uVar = new i5u(kmqVar, (CyberGamesPage) obj2, this.b, (q5u) obj);
                    g5uVar2.j = 1;
                    if (((utb) gmqVar).c(i5uVar, g5uVar2) == wneVar) {
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
                if (yjeVar instanceof pd60) {
                    pd60Var = (pd60) yjeVar;
                    int i3 = pd60Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pd60Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        pd60Var = new pd60(this, yjeVar);
                    }
                } else {
                    pd60Var = new pd60(this, yjeVar);
                }
                Object obj4 = pd60Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = pd60Var.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    i5u i5uVar2 = new i5u(kmqVar, (sd60) obj2, (sgs) obj, this.b, (byte) 2);
                    pd60Var.j = 1;
                    if (((vsg0) gmqVar).c(i5uVar2, pd60Var) == wneVar2) {
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

    public j5u(vsg0 vsg0Var, sd60 sd60Var, sgs sgsVar, long j) {
        this.c = vsg0Var;
        this.d = sd60Var;
        this.e = sgsVar;
        this.b = j;
    }
}
