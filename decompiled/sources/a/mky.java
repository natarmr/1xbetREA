package a;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mky extends lm40 implements lky {
    public Function1 o;
    public Function1 p;

    @Override // a.lky
    public final boolean c0(KeyEvent keyEvent) {
        Function1 function1 = this.p;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new gky(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // a.lky
    public final boolean l0(KeyEvent keyEvent) {
        Function1 function1 = this.o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new gky(keyEvent))).booleanValue();
        }
        return false;
    }
}
