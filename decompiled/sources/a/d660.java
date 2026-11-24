package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class d660 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sch0 f5538a;
    public final Function2 b;
    public w6k c;
    public boolean d;
    public final zri e = new zri();

    public d660(sch0 sch0Var, Function2 function2, w6k w6kVar) {
        this.f5538a = sch0Var;
        this.b = function2;
        this.c = w6kVar;
    }

    public static void a(woa0 woa0Var) {
        List list = woa0Var.f39485a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((dpa0) list.get(i)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Function2 function2, zje zjeVar) {
        c660 c660Var;
        if (zjeVar instanceof c660) {
            c660Var = (c660) zjeVar;
            int i = c660Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c660Var.k = i - Integer.MIN_VALUE;
            } else {
                c660Var = new c660(this, zjeVar);
            }
        } else {
            c660Var = new c660(this, zjeVar);
        }
        Object obj = c660Var.i;
        wne wneVar = wne.f39444a;
        int i2 = c660Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            this.d = true;
            j940 j940Var = new j940(this, function2, yjeVar, (byte) 22);
            c660Var.k = 1;
            if (qem0.s(j940Var, c660Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        this.d = false;
        return Unit.f46060a;
    }
}
