package a;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class n1r implements zkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22765a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public n1r(sje sjeVar, f390 f390Var, fge0 fge0Var, mie0 mie0Var) {
        this.b = sjeVar;
        this.c = f390Var;
        this.d = fge0Var;
        this.e = mie0Var;
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        Bundle bundle;
        boolean z;
        switch (this.f22765a) {
            case 0:
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.e;
                String str = (String) this.b;
                if (kkzVar == kkz.ON_START && (bundle = (Bundle) eVar.m.get(str)) != null) {
                    ((k4r) this.c).i(bundle, str);
                    eVar.f(str);
                }
                if (kkzVar == kkz.ON_DESTROY) {
                    ((glz) this.d).f(this);
                    eVar.n.remove(str);
                    return;
                }
                return;
            default:
                m5a m5aVarC = null;
                switch (rjv0.f30617a[kkzVar.ordinal()]) {
                    case 1:
                        qjj.W((sje) this.b, null, yne.d, new e0r0((mie0) this.e, (fge0) this.d, clzVar, this, null), 1);
                        return;
                    case 2:
                        f390 f390Var = (f390) this.c;
                        if (f390Var != null) {
                            o24 o24Var = f390Var.b;
                            synchronized (o24Var.b) {
                                try {
                                    synchronized (o24Var.b) {
                                        z = o24Var.f24513a;
                                    }
                                    if (!z) {
                                        ArrayList arrayList = (ArrayList) o24Var.c;
                                        o24Var.c = (ArrayList) o24Var.d;
                                        o24Var.d = arrayList;
                                        o24Var.f24513a = true;
                                        int size = arrayList.size();
                                        for (int i = 0; i < size; i++) {
                                            yje yjeVar = (yje) arrayList.get(i);
                                            e0g0 e0g0Var = j0g0.b;
                                            yjeVar.resumeWith(Unit.f46060a);
                                        }
                                        arrayList.clear();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        fge0 fge0Var = (fge0) this.d;
                        synchronized (fge0Var.c) {
                            if (fge0Var.t) {
                                fge0Var.t = false;
                                m5aVarC = fge0Var.C();
                            }
                            break;
                        }
                        if (m5aVarC != null) {
                            e0g0 e0g0Var2 = j0g0.b;
                            ((n5a) m5aVarC).resumeWith(Unit.f46060a);
                            return;
                        }
                        return;
                    case 3:
                        fge0 fge0Var2 = (fge0) this.d;
                        synchronized (fge0Var2.c) {
                            fge0Var2.t = true;
                        }
                        return;
                    case 4:
                        ((fge0) this.d).A();
                        return;
                    case 5:
                    case 6:
                    case 7:
                        return;
                    default:
                        t9f.b();
                        return;
                }
        }
    }

    public n1r(androidx.fragment.app.e eVar, String str, k4r k4rVar, glz glzVar) {
        this.e = eVar;
        this.b = str;
        this.c = k4rVar;
        this.d = glzVar;
    }
}
