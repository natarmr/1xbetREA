package a;

import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40971a = 0;
    public boolean b;
    public Object c;

    public xj(String str, boolean z) {
        this.c = str;
        this.b = z;
    }

    public Integer b(xj xjVar) {
        xjVar.getClass();
        jo20 jo20Var = juu0.f17178a;
        if (this == xjVar) {
            return 0;
        }
        jo20 jo20Var2 = juu0.f17178a;
        Integer num = (Integer) jo20Var2.get(this);
        Integer num2 = (Integer) jo20Var2.get(xjVar);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void c();

    public abstract View d();

    public String e() {
        return (String) this.c;
    }

    public abstract ox30 g();

    public abstract MenuInflater h();

    public abstract CharSequence i();

    public abstract CharSequence j();

    public abstract void k();

    public abstract boolean l();

    public abstract void n(View view);

    public abstract void o(int i);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public abstract void s(boolean z);

    public String toString() {
        switch (this.f40971a) {
            case 1:
                return e();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xj() {
    }

    public xj m() {
        return this;
    }
}
