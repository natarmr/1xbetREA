package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kyl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19110a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ lyl c;

    public /* synthetic */ kyl(lyl lylVar, List list) {
        this.c = lylVar;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f19110a;
        int i = 0;
        lyl lylVar = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                if (!lylVar.u2 && lylVar.r2 != uyl.b) {
                    lylVar.post(new kyl(list, lylVar));
                }
                lylVar.u2 = false;
                break;
            default:
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((twl) it.next()).e) {
                        lylVar.B0(i);
                    } else {
                        i++;
                    }
                    break;
                }
                i = -1;
                lylVar.B0(i);
                break;
        }
    }

    public /* synthetic */ kyl(List list, lyl lylVar) {
        this.b = list;
        this.c = lylVar;
    }
}
