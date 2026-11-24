package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class g6b0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10755a;
    public final /* synthetic */ j6b0 b;

    public /* synthetic */ g6b0(j6b0 j6b0Var, byte b) {
        this.f10755a = b;
        this.b = j6b0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        switch (this.f10755a) {
            case 0:
                return b((List) obj, yjeVar);
            default:
                if (((Boolean) obj).booleanValue()) {
                    pnf0 pnf0Var = pnf0.c;
                    int i = j6b0.F;
                    this.b.M(pnf0Var);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(List list, yje yjeVar) {
        f6b0 f6b0Var;
        if (yjeVar instanceof f6b0) {
            f6b0Var = (f6b0) yjeVar;
            int i = f6b0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6b0Var.l = i - Integer.MIN_VALUE;
            } else {
                f6b0Var = new f6b0(this, yjeVar);
            }
        } else {
            f6b0Var = new f6b0(this, yjeVar);
        }
        Object obj = f6b0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = f6b0Var.l;
        j6b0 j6b0Var = this.b;
        if (i2 == 0) {
            z1x.P(obj);
            v3c.N(j6b0Var.C);
            hjd hjdVar = (hjd) j6b0Var.o.get();
            did didVar = new did(list);
            f6b0Var.i = list;
            f6b0Var.l = 1;
            hjdVar.getClass();
            if (hjdVar.a(didVar, f6b0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = f6b0Var.i;
            z1x.P(obj);
        }
        bdt bdtVar = new bdt(list);
        int i3 = j6b0.F;
        j6b0Var.N(bdtVar);
        return Unit.f46060a;
    }
}
