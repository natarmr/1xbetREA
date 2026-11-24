package a;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class daz extends dtb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wm40 f5775a;
    public final /* synthetic */ LinkedHashSet b;
    public final /* synthetic */ Function1 c;

    public daz(wm40 wm40Var, LinkedHashSet linkedHashSet, Function1 function1) {
        this.f5775a = wm40Var;
        this.b = linkedHashSet;
        this.c = function1;
    }

    @Override // a.dtb
    public final boolean y(Object obj) {
        wm40 wm40Var = (wm40) obj;
        wm40Var.getClass();
        if (wm40Var == this.f5775a) {
            return true;
        }
        cr30 cr30VarU = wm40Var.U();
        cr30VarU.getClass();
        if (!(cr30VarU instanceof faz)) {
            return true;
        }
        this.b.addAll((Collection) this.c.invoke(cr30VarU));
        return false;
    }
}
