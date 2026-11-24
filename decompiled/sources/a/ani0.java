package a;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class ani0 implements OnCompleteListener, bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1155a;

    public ani0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 15:
                this.f1155a = new enj0(gii0Var, (byte) 17);
                break;
            case 20:
                this.f1155a = new lkr0(gii0Var, (byte) 12);
                break;
            default:
                this.f1155a = new enj0(gii0Var, (byte) 0);
                break;
        }
    }

    public Object a(dqk0 dqk0Var, bnn0 bnn0Var) {
        Object objO = ((r2m0) this.f1155a).c.f21068a.O(dqk0Var, bnn0Var);
        wne wneVar = wne.f39444a;
        if (objO != wneVar) {
            objO = Unit.f46060a;
        }
        if (objO != wneVar) {
            objO = Unit.f46060a;
        }
        return objO == wneVar ? objO : Unit.f46060a;
    }

    public void b(pm3 pm3Var) {
        dcl dclVar = (dcl) ((prc) this.f1155a).b;
        dclVar.getClass();
        dclVar.f5851a.o(null, pm3Var);
    }

    public void c(List list, boolean z) {
        p7m0 p7m0Var;
        Object value;
        ArrayList arrayList;
        Object next;
        izc izcVarB;
        list.getClass();
        qj9 qj9Var = (qj9) this.f1155a;
        qj9Var.getClass();
        oj9 oj9Var = qj9Var.f28826a;
        oj9Var.getClass();
        qz40 qz40VarA = oj9Var.a();
        do {
            p7m0Var = (p7m0) qz40VarA;
            value = p7m0Var.getValue();
            List<pbs0> data = ((hj9) value).getData();
            arrayList = new ArrayList(r3d.q(data, 10));
            for (pbs0 pbs0Var : data) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!oj9.b((m97) next, pbs0Var.b));
                m97 m97Var = (m97) next;
                if (m97Var != null) {
                    m97 m97Var2 = pbs0Var.b;
                    long j = m97Var2.i;
                    String str = m97Var2.p;
                    String str2 = m97Var2.o;
                    double d = m97Var.l;
                    String str3 = m97Var.m;
                    boolean z2 = m97Var.d;
                    if (z) {
                        izcVarB = izc.d;
                    } else {
                        yk5 yk5Var = izc.f15629a;
                        double d2 = m97Var2.l;
                        yk5Var.getClass();
                        izcVarB = yk5.b(d, d2);
                    }
                    m97 m97VarA = m97.a(m97Var, izcVarB, z2, j, d, str3, str2, str, null, 0.0d, null, 67053299);
                    acs0 acs0Var = pbs0Var.f26723a;
                    acs0Var.getClass();
                    pbs0Var = new pbs0(acs0Var, m97VarA);
                }
                arrayList.add(pbs0Var);
            }
            oj9Var.c(arrayList);
        } while (!p7m0Var.m(value, new gj9(arrayList)));
    }

    public void d(boolean z) {
        ((rpx) ((chf0) this.f1155a).c).f30906a.set(z);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        n5a n5aVar = (n5a) this.f1155a;
        Exception exception = task.getException();
        if (exception != null) {
            e0g0 e0g0Var = j0g0.b;
            n5aVar.resumeWith(new g0g0(exception));
        } else if (task.isCanceled()) {
            n5aVar.h(null);
        } else {
            e0g0 e0g0Var2 = j0g0.b;
            n5aVar.resumeWith(task.getResult());
        }
    }

    public ani0(r2m0 r2m0Var) {
        r2m0Var.getClass();
        this.f1155a = r2m0Var;
    }

    public ani0(k3r0 k3r0Var) {
        k3r0Var.getClass();
        this.f1155a = k3r0Var;
    }

    public /* synthetic */ ani0(Object obj) {
        this.f1155a = obj;
    }

    public ani0(bbw0 bbw0Var) {
        this.f1155a = new xb5(bbw0Var);
    }

    public ani0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            rkk0 rkk0Var = new rkk0(view);
            rkk0Var.b = view;
            this.f1155a = rkk0Var;
            return;
        }
        this.f1155a = new lef0(view);
    }

    public ani0(WindowInsetsController windowInsetsController) {
        rkk0 rkk0Var = new rkk0(null);
        rkk0Var.c = windowInsetsController;
        this.f1155a = rkk0Var;
    }
}
