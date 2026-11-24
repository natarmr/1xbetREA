package a;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ujk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f35785a = new ArrayList();
    public static final ArrayList b = new ArrayList();

    public static void a(View view, boolean z) {
        vbk vbkVar = new vbk((byte) 4);
        ArrayList arrayList = f35785a;
        w3d.y(arrayList, vbkVar);
        w3d.y(arrayList, new oz7(view, (byte) 1));
        arrayList.add(new WeakReference(view));
        if (z) {
            Iterator it = CollectionsKt.L0(b).iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
        }
    }
}
