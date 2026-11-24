package a;

import android.graphics.Canvas;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public final class onn0 implements dyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cyu f25556a;
    public final dq00 b;
    public final int c;
    public final int d;

    public onn0(cyu cyuVar, dq00 dq00Var, int i, int i2) {
        this.f25556a = cyuVar;
        this.b = dq00Var;
        this.c = i;
        this.d = i2;
    }

    @Override // a.dyw
    public final int f() {
        return this.d;
    }

    @Override // a.dyw
    public final int j() {
        return this.c;
    }

    @Override // a.dyw
    public final void k(Canvas canvas) {
        ArrayList arrayList;
        cyu cyuVar = this.f25556a;
        cyuVar.getClass();
        bi9 bi9Var = (bi9) cyuVar.b;
        dq00 dq00Var = this.b;
        if (dq00Var == null) {
            dq00Var = new dq00((byte) 24);
        }
        if (((gz40) dq00Var.c) == null) {
            dq00Var.c = new gz40(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        esg0 esg0Var = new esg0();
        esg0Var.f8326a = canvas;
        esg0Var.b = cyuVar;
        yqg0 yqg0Var = (yqg0) cyuVar.f5196a;
        if (yqg0Var == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
            return;
        }
        gz40 gz40Var = yqg0Var.o;
        bub0 bub0Var = yqg0Var.n;
        bi9 bi9Var2 = (bi9) dq00Var.b;
        if (bi9Var2 != null) {
            ArrayList arrayList2 = bi9Var2.b;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                bi9Var.g((bi9) dq00Var.b);
            }
        }
        esg0Var.c = new csg0();
        esg0Var.d = new Stack();
        esg0Var.G0((csg0) esg0Var.c, xqg0.a());
        csg0 csg0Var = (csg0) esg0Var.c;
        csg0Var.f = null;
        csg0Var.h = false;
        ((Stack) esg0Var.d).push(new csg0(csg0Var));
        esg0Var.f = new Stack();
        esg0Var.e = new Stack();
        Boolean bool = yqg0Var.d;
        if (bool != null) {
            ((csg0) esg0Var.c).h = bool.booleanValue();
        }
        esg0Var.D0();
        gz40 gz40Var2 = new gz40((gz40) dq00Var.c);
        jqg0 jqg0Var = yqg0Var.r;
        if (jqg0Var != null) {
            gz40Var2.d = jqg0Var.c(esg0Var, gz40Var2.d);
        }
        jqg0 jqg0Var2 = yqg0Var.s;
        if (jqg0Var2 != null) {
            gz40Var2.e = jqg0Var2.c(esg0Var, gz40Var2.e);
        }
        esg0Var.r0(yqg0Var, gz40Var2, gz40Var, bub0Var);
        esg0Var.C0();
        bi9 bi9Var3 = (bi9) dq00Var.b;
        if (bi9Var3 != null) {
            ArrayList arrayList3 = bi9Var3.b;
            if ((arrayList3 != null ? arrayList3.size() : 0) <= 0 || (arrayList = bi9Var.b) == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ai9) it.next()).c == 2) {
                    it.remove();
                }
            }
        }
    }

    @Override // a.dyw
    public final boolean l() {
        return true;
    }

    @Override // a.dyw
    public final long m() {
        return 2048L;
    }
}
