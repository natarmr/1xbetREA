package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class a17 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7v f57a;
    public final knf0 b;
    public final kuy c;
    public final mne d;
    public final x07 e;

    public a17(r7v r7vVar, knf0 knf0Var, kuy kuyVar, mne mneVar, x07 x07Var) {
        knf0Var.getClass();
        kuyVar.getClass();
        x07Var.getClass();
        this.f57a = r7vVar;
        this.b = knf0Var;
        this.c = kuyVar;
        this.d = mneVar;
        this.e = x07Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(long j, boolean z, List list, List list2, zje zjeVar) {
        y07 y07Var;
        if (zjeVar instanceof y07) {
            y07Var = (y07) zjeVar;
            int i = y07Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y07Var.k = i - Integer.MIN_VALUE;
            } else {
                y07Var = new y07(this, zjeVar);
            }
        } else {
            y07Var = new y07(this, zjeVar);
        }
        y07 y07Var2 = y07Var;
        Object obj = y07Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = y07Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            dvj dvjVar = this.d.b;
            z07 z07Var = new z07(list, j, z, this, list2, null);
            y07Var2.k = 1;
            if (qjj.d0(dvjVar, z07Var, y07Var2) == wneVar) {
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
    }
}
