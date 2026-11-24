package a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class hf00 implements c040, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12950a;
    public LayoutInflater b;
    public ox30 c;
    public ExpandedMenuView d;
    public b040 e;
    public gf00 f;

    public hf00(Context context) {
        this.f12950a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // a.c040
    public final void a(Context context, ox30 ox30Var) {
        if (this.f12950a != null) {
            this.f12950a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = ox30Var;
        gf00 gf00Var = this.f;
        if (gf00Var != null) {
            gf00Var.notifyDataSetChanged();
        }
    }

    @Override // a.c040
    public final boolean b(fzm0 fzm0Var) {
        boolean zHasVisibleItems = fzm0Var.hasVisibleItems();
        Context context = fzm0Var.f25992a;
        if (!zHasVisibleItems) {
            return false;
        }
        xy30 xy30Var = new xy30();
        xy30Var.f41688a = fzm0Var;
        j12 j12Var = new j12(context);
        hf00 hf00Var = new hf00(j12Var.getContext());
        xy30Var.c = hf00Var;
        hf00Var.e = xy30Var;
        fzm0Var.b(hf00Var, context);
        hf00 hf00Var2 = xy30Var.c;
        gf00 gf00Var = hf00Var2.f;
        if (gf00Var == null) {
            gf00Var = new gf00(hf00Var2);
            hf00Var2.f = gf00Var;
        }
        f12 f12Var = j12Var.f15710a;
        f12Var.k = gf00Var;
        f12Var.l = xy30Var;
        View view = fzm0Var.o;
        if (view != null) {
            f12Var.e = view;
        } else {
            f12Var.c = fzm0Var.n;
            j12Var.setTitle(fzm0Var.m);
        }
        f12Var.j = xy30Var;
        k12 k12VarCreate = j12Var.create();
        xy30Var.b = k12VarCreate;
        k12VarCreate.setOnDismissListener(xy30Var);
        WindowManager.LayoutParams attributes = xy30Var.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        xy30Var.b.show();
        b040 b040Var = this.e;
        if (b040Var == null) {
            return true;
        }
        b040Var.f(fzm0Var);
        return true;
    }

    @Override // a.c040
    public final void c(ox30 ox30Var, boolean z) {
        b040 b040Var = this.e;
        if (b040Var != null) {
            b040Var.c(ox30Var, z);
        }
    }

    @Override // a.c040
    public final void d(b040 b040Var) {
        throw null;
    }

    @Override // a.c040
    public final void e() {
        gf00 gf00Var = this.f;
        if (gf00Var != null) {
            gf00Var.notifyDataSetChanged();
        }
    }

    @Override // a.c040
    public final boolean g(hz30 hz30Var) {
        return false;
    }

    @Override // a.c040
    public final boolean h(hz30 hz30Var) {
        return false;
    }

    @Override // a.c040
    public final boolean i() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
