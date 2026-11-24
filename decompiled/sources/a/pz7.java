package a;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class pz7 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27831a;
    public final /* synthetic */ View b;

    public /* synthetic */ pz7(View view, byte b) {
        this.f27831a = b;
        this.b = view;
    }

    @Override // a.kwk
    public final void a() {
        byte b = this.f27831a;
        View view = this.b;
        switch (b) {
            case 0:
                view.setKeepScreenOn(false);
                break;
            default:
                ArrayList arrayList = ujk.f35785a;
                ArrayList arrayList2 = ujk.f35785a;
                boolean zY = w3d.y(arrayList2, new oz7(view, (byte) 2));
                w3d.y(arrayList2, new vbk((byte) 4));
                if (zY) {
                    Iterator it = CollectionsKt.L0(ujk.b).iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                }
                break;
        }
    }
}
