package a;

import android.animation.Animator;
import android.view.ViewGroup;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;

/* JADX INFO: loaded from: classes.dex */
public final class tq00 extends ewo {
    public final /* synthetic */ LoaderView l1;

    public tq00(LoaderView loaderView) {
        this.l1 = loaderView;
    }

    @Override // a.muu0, a.gms0
    public final Animator o(ViewGroup viewGroup, mns0 mns0Var, mns0 mns0Var2) {
        Animator animatorO = super.o(viewGroup, mns0Var, mns0Var2);
        if (animatorO != null) {
            animatorO.addListener(new r9g(this.l1, (byte) 7));
        }
        return animatorO;
    }
}
