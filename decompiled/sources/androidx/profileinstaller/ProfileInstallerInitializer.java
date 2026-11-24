package androidx.profileinstaller;

import a.d73;
import a.mi70;
import a.pbx;
import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements pbx {
    @Override // a.pbx
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // a.pbx
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new d73(this, context.getApplicationContext()));
        return new mi70();
    }
}
