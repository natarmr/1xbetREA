package a;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class xzt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pru f41770a;

    public xzt(pru pruVar, byte b) {
        switch (b) {
            case 1:
                this.f41770a = pruVar;
                break;
            default:
                pruVar.getClass();
                this.f41770a = pruVar;
                break;
        }
    }

    public ArrayList a(boolean z) {
        lc00 lc00VarS = thb.S(this.f41770a.a().f32117a.f12063a, z);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = lc00VarS.listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return arrayList;
            }
            Object next = pawVar.next();
            if (((q4f) next) != q4f.x) {
                arrayList.add(next);
            }
        }
    }
}
