package a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q4 extends yge0 {
    public final /* synthetic */ byte d;
    public Object e;

    public q4(dtb dtbVar) {
        ExecutorService executorServiceNewFixedThreadPool;
        this.d = (byte) 1;
        fc00 fc00Var = new fc00(this);
        fvt0 fvt0Var = new fvt0(this);
        synchronized (p8a.f26544a) {
            try {
                executorServiceNewFixedThreadPool = p8a.b;
                if (executorServiceNewFixedThreadPool == null) {
                    executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                    p8a.b = executorServiceNewFixedThreadPool;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yz3 yz3Var = new yz3(fvt0Var, new yzn0(executorServiceNewFixedThreadPool, dtbVar));
        this.e = yz3Var;
        yz3Var.d.add(fc00Var);
    }

    public static void z(int i, w5 w5Var) {
        int iB;
        int i2 = (i + 1) % 2;
        View view = w5Var.f40887a;
        if (i2 == 0) {
            Context context = view.getContext();
            context.getClass();
            iB = m5d.b(R.attr.uikitBackgroundGroup, context);
        } else {
            Context context2 = view.getContext();
            context2.getClass();
            iB = m5d.b(R.attr.uikitBackgroundContent, context2);
        }
        view.setBackgroundColor(iB);
    }

    public Object A(int i) {
        switch (this.d) {
            case 0:
                if (((List) this.e).isEmpty() || i < 0 || i >= ((List) this.e).size()) {
                    return null;
                }
                return ((List) this.e).get(i);
            default:
                return ((yz3) this.e).f.get(i);
        }
    }

    public int B(mva mvaVar) {
        mvaVar.getClass();
        return 0;
    }

    public void C(xhe0 xhe0Var, mva mvaVar) {
        mvaVar.getClass();
    }

    public xhe0 D(ViewGroup viewGroup, mva mvaVar) {
        mvaVar.getClass();
        return new s3w(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.history_progress_item, viewGroup, false));
    }

    public void F(mva mvaVar) {
        mvaVar.getClass();
        if (Intrinsics.d((mva) this.e, mvaVar)) {
            return;
        }
        mva mvaVar2 = (mva) this.e;
        mvaVar2.getClass();
        boolean z = (mvaVar2 instanceof ap00) || (mvaVar2 instanceof zo00);
        boolean z2 = (mvaVar instanceof ap00) || (mvaVar instanceof zo00);
        zge0 zge0Var = this.f42580a;
        if (z && !z2) {
            zge0Var.f(0, 1);
        } else if (z2 && !z) {
            zge0Var.e(0, 1);
        } else if (z && z2) {
            h(0);
        }
        this.e = mvaVar;
    }

    public void G(List list) {
        ((yz3) this.e).b(list, null);
    }

    public void H(List list, Runnable runnable) {
        ((yz3) this.e).b(list, runnable);
    }

    @Override // a.yge0
    public final int d() {
        switch (this.d) {
            case 0:
                return ((List) this.e).size();
            case 1:
                return ((yz3) this.e).f.size();
            default:
                mva mvaVar = (mva) this.e;
                mvaVar.getClass();
                return ((mvaVar instanceof ap00) || (mvaVar instanceof zo00)) ? 1 : 0;
        }
    }

    @Override // a.yge0
    public int f(int i) {
        switch (this.d) {
            case 0:
                return 1;
            case 1:
            default:
                return super.f(i);
            case 2:
                return B((mva) this.e);
        }
    }

    @Override // a.yge0
    public void n(xhe0 xhe0Var, int i) {
        C(xhe0Var, (mva) this.e);
    }

    @Override // a.yge0
    public xhe0 p(ViewGroup viewGroup, int i) {
        return D(viewGroup, (mva) this.e);
    }

    public q4() {
        this.d = (byte) 2;
        this.e = new bp00(false);
    }

    public q4(Context context, List list) {
        this.d = (byte) 0;
        list.getClass();
        context.getClass();
        this.e = list;
    }

    public void E(List list, List list2) {
    }
}
