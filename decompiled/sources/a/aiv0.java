package a;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aiv0 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oyc f945a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public aiv0(oyc oycVar) {
        super(oycVar.f26055a);
        this.d = new HashMap();
        this.f945a = oycVar;
    }

    public final div0 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        div0 div0Var = (div0) map.get(windowInsetsAnimation);
        if (div0Var != null) {
            return div0Var;
        }
        div0 div0Var2 = new div0(0, null, 0L);
        div0Var2.f6156a = new biv0(windowInsetsAnimation);
        map.put(windowInsetsAnimation, div0Var2);
        return div0Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f945a.f(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f945a.g(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationK = tmb0.k(list.get(size));
            div0 div0VarA = a(windowInsetsAnimationK);
            div0VarA.f6156a.e(windowInsetsAnimationK.getFraction());
            this.c.add(div0VarA);
        }
        return this.f945a.h(xiv0.h(windowInsets, null), this.b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        hcp0 hcp0VarI = this.f945a.i(a(windowInsetsAnimation), new hcp0(bounds));
        hcp0VarI.getClass();
        tmb0.o();
        return tmb0.i(((pfx) hcp0VarI.b).e(), ((pfx) hcp0VarI.c).e());
    }
}
