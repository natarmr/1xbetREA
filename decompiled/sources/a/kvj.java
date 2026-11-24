package a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kvj extends ehe0 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((xhe0) arrayList.get(size)).f40887a.animate().cancel();
        }
    }

    @Override // a.ehe0
    public final boolean a(xhe0 xhe0Var, xhe0 xhe0Var2, eld0 eld0Var, eld0 eld0Var2) {
        int i;
        int i2;
        int i3 = eld0Var.b;
        int i4 = eld0Var.c;
        if (xhe0Var2.r()) {
            int i5 = eld0Var.b;
            i2 = eld0Var.c;
            i = i5;
        } else {
            i = eld0Var2.b;
            i2 = eld0Var2.c;
        }
        if (xhe0Var == xhe0Var2) {
            return g(xhe0Var, i3, i4, i, i2);
        }
        View view = xhe0Var.f40887a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(xhe0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = xhe0Var2.f40887a;
        l(xhe0Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        ivj ivjVar = new ivj();
        ivjVar.f15448a = xhe0Var;
        ivjVar.b = xhe0Var2;
        ivjVar.c = i3;
        ivjVar.d = i4;
        ivjVar.e = i;
        ivjVar.f = i2;
        arrayList.add(ivjVar);
        return true;
    }

    @Override // a.ehe0
    public final void d(xhe0 xhe0Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = xhe0Var.f40887a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((jvj) arrayList4.get(size)).f17206a == xhe0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(xhe0Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, xhe0Var);
        if (this.h.remove(xhe0Var)) {
            view.setAlpha(1.0f);
            c(xhe0Var);
        }
        if (this.i.remove(xhe0Var)) {
            view.setAlpha(1.0f);
            c(xhe0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, xhe0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((jvj) arrayList6.get(size4)).f17206a == xhe0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(xhe0Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(xhe0Var)) {
                view.setAlpha(1.0f);
                c(xhe0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(xhe0Var);
        this.o.remove(xhe0Var);
        this.r.remove(xhe0Var);
        this.p.remove(xhe0Var);
        i();
    }

    @Override // a.ehe0
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            jvj jvjVar = (jvj) arrayList7.get(size);
            View view = jvjVar.f17206a.f40887a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(jvjVar.f17206a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((xhe0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            xhe0 xhe0Var = (xhe0) arrayList5.get(size3);
            xhe0Var.f40887a.setAlpha(1.0f);
            c(xhe0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            ivj ivjVar = (ivj) arrayList.get(size4);
            xhe0 xhe0Var2 = ivjVar.f15448a;
            if (xhe0Var2 != null) {
                k(ivjVar, xhe0Var2);
            }
            xhe0 xhe0Var3 = ivjVar.b;
            if (xhe0Var3 != null) {
                k(ivjVar, xhe0Var3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    jvj jvjVar2 = (jvj) arrayList8.get(size6);
                    View view2 = jvjVar2.f17206a.f40887a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(jvjVar2.f17206a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    xhe0 xhe0Var4 = (xhe0) arrayList9.get(size8);
                    xhe0Var4.f40887a.setAlpha(1.0f);
                    c(xhe0Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ivj ivjVar2 = (ivj) arrayList10.get(size10);
                    xhe0 xhe0Var5 = ivjVar2.f15448a;
                    if (xhe0Var5 != null) {
                        k(ivjVar2, xhe0Var5);
                    }
                    xhe0 xhe0Var6 = ivjVar2.b;
                    if (xhe0Var6 != null) {
                        k(ivjVar2, xhe0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                hny.b();
            }
        }
    }

    @Override // a.ehe0
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(xhe0 xhe0Var, int i, int i2, int i3, int i4) {
        View view = xhe0Var.f40887a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) xhe0Var.f40887a.getTranslationY());
        l(xhe0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(xhe0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        jvj jvjVar = new jvj();
        jvjVar.f17206a = xhe0Var;
        jvjVar.b = translationX;
        jvjVar.c = translationY;
        jvjVar.d = i3;
        jvjVar.e = i4;
        arrayList.add(jvjVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            hny.b();
        }
    }

    public final void j(ArrayList arrayList, xhe0 xhe0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ivj ivjVar = (ivj) arrayList.get(size);
            if (k(ivjVar, xhe0Var) && ivjVar.f15448a == null && ivjVar.b == null) {
                arrayList.remove(ivjVar);
            }
        }
    }

    public final boolean k(ivj ivjVar, xhe0 xhe0Var) {
        if (ivjVar.b == xhe0Var) {
            ivjVar.b = null;
        } else {
            if (ivjVar.f15448a != xhe0Var) {
                return false;
            }
            ivjVar.f15448a = null;
        }
        View view = xhe0Var.f40887a;
        View view2 = xhe0Var.f40887a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(xhe0Var);
        return true;
    }

    public final void l(xhe0 xhe0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        xhe0Var.f40887a.animate().setInterpolator(s);
        d(xhe0Var);
    }
}
