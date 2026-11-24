package a;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class yqv0 implements mld, zkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f43094a;
    public final tld b;
    public boolean c;
    public glz d;
    public ugd e = wb.j;

    public yqv0(AndroidComposeView androidComposeView, tld tldVar) {
        this.f43094a = androidComposeView;
        this.b = tldVar;
    }

    @Override // a.mld
    public final void a() {
        if (!this.c) {
            this.c = true;
            AndroidComposeView androidComposeView = this.f43094a;
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, null);
            glz glzVar = this.d;
            if (glzVar != null) {
                glzVar.f(this);
            }
            this.d = null;
            owk owkVar = androidComposeView.g;
            if (owkVar != null) {
                owkVar.b.invoke();
            }
            androidComposeView.g = null;
        }
        this.b.a();
    }

    @Override // a.mld
    public final boolean c() {
        return this.b.c();
    }

    @Override // a.mld
    public final void d(Function2 function2) {
        this.f43094a.setOnReadyForComposition(new zfv0(this, (ugd) function2, (byte) 12));
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        if (kkzVar == kkz.ON_DESTROY) {
            a();
        } else {
            if (kkzVar != kkz.ON_CREATE || this.c) {
                return;
            }
            d(this.e);
        }
    }
}
