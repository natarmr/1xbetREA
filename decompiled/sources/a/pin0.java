package a;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class pin0 extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27050a;
    public final xj b;

    public pin0(Context context, xj xjVar) {
        this.f27050a = context;
        this.b = xjVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new k340(this.f27050a, this.b.g());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.c;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.n(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.o(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.q(i);
    }
}
