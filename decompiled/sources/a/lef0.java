package a;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Arrays;
import java.util.Date;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class lef0 implements gfn0, qna, ev3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f19899a;

    public lef0(byte b) {
        switch (b) {
            case 22:
                cyu cyuVar = new cyu();
                cyuVar.f5196a = this;
                cyuVar.b = new k050();
                this.f19899a = cyuVar;
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.f19899a = new kwd();
                break;
            default:
                this.f19899a = new Stack();
                break;
        }
    }

    @Override // a.qna
    public void a(zj zjVar, bpn0 bpn0Var) {
        bpn0Var.getClass();
        ypn0 ypn0Var = (ypn0) this.f19899a;
        s9m0 s9m0Var = ypn0.h2;
        ypn0Var.N0().x();
    }

    @Override // a.ev3
    public Object b(qah0 qah0Var, Float f, Float f2, Function1 function1, zek0 zek0Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objS = bdx.S(qah0Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, x4d0.d(0.0f, fFloatValue2, 28), (j73) this.f19899a, function1, zek0Var);
        return objS == wne.f39444a ? objS : (g73) objS;
    }

    public void e(pg9 pg9Var) {
        if (!pg9Var.h()) {
            if (!(pg9Var instanceof seg0)) {
                String strValueOf = String.valueOf(pg9Var.getClass());
                jf4.o(axq.n(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                return;
            } else {
                seg0 seg0Var = (seg0) pg9Var;
                e(seg0Var.c);
                e(seg0Var.d);
                return;
            }
        }
        int size = pg9Var.size();
        int[] iArr = seg0.h;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f19899a;
        if (stack.isEmpty() || ((pg9) stack.peek()).size() >= i) {
            stack.push(pg9Var);
            return;
        }
        int i2 = iArr[iBinarySearch];
        pg9 seg0Var2 = (pg9) stack.pop();
        while (!stack.isEmpty() && ((pg9) stack.peek()).size() < i2) {
            seg0Var2 = new seg0((pg9) stack.pop(), seg0Var2);
        }
        seg0 seg0Var3 = new seg0(seg0Var2, pg9Var);
        while (!stack.isEmpty()) {
            int[] iArr2 = seg0.h;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, seg0Var3.b);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((pg9) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                seg0Var3 = new seg0((pg9) stack.pop(), seg0Var3);
            }
        }
        stack.push(seg0Var3);
    }

    public p7m0 f(boolean z) {
        m8l0 m8l0Var = (m8l0) this.f19899a;
        return z ? m8l0Var.c : m8l0Var.b;
    }

    public p6d g() {
        m8l0 m8l0Var = (m8l0) this.f19899a;
        byte b = 1;
        return new p6d(m8l0Var.d, m8l0Var.e, new l8l0(3, null, b), b);
    }

    public void h() {
        View view = (View) this.f19899a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void i(ygq0 ygq0Var, boolean z) {
        ygq0Var.getClass();
        m8l0 m8l0Var = (m8l0) ((lef0) this.f19899a).f19899a;
        m8l0Var.getClass();
        if (z) {
            m8l0Var.c.o(null, ygq0Var);
        } else {
            m8l0Var.b.o(null, ygq0Var);
        }
    }

    public void j(boolean z) {
        ((hkp) this.f19899a).f13218a.c.o(null, Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.lef0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public Object k(gv60 gv60Var, yje yjeVar) {
        q3k0 q3k0Var;
        if (yjeVar instanceof q3k0) {
            q3k0Var = (q3k0) yjeVar;
            int i = q3k0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                q3k0Var.k = i - Integer.MIN_VALUE;
            } else {
                q3k0Var = new q3k0(this, yjeVar);
            }
        } else {
            q3k0Var = new q3k0(this, yjeVar);
        }
        Object obj = q3k0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = q3k0Var.k;
        yje yjeVar2 = null;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                kpb0 kpb0Var = new kpb0((Object) this, (Object) gv60Var, yjeVar2, (byte) 15);
                q3k0Var.k = 1;
                Object objJ = d5c.J(q3k0Var, kpb0Var);
                this = objJ;
                if (objJ == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this = this;
            }
        } catch (n3k0 e) {
            if (e.f22855a != this) {
                throw e;
            }
        }
        return Unit.f46060a;
    }

    public void l() {
        View viewFindViewById;
        View view = (View) this.f19899a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new xv5(viewFindViewById, (byte) 1));
    }

    public void m(Date date) {
        Object value;
        v5g0 v5g0Var;
        p7m0 p7m0Var = ((t5g0) this.f19899a).f33368a;
        do {
            value = p7m0Var.getValue();
            v5g0Var = (v5g0) value;
        } while (!p7m0Var.m(value, v5g0Var != null ? new v5g0(v5g0Var.f36824a, date) : null));
    }

    public void n(long j) {
        Object value;
        v5g0 v5g0Var;
        p7m0 p7m0Var = ((t5g0) this.f19899a).f33368a;
        do {
            value = p7m0Var.getValue();
            v5g0Var = (v5g0) value;
        } while (!p7m0Var.m(value, v5g0Var != null ? new v5g0(j, v5g0Var.b) : new v5g0(j, null)));
    }

    @Override // a.qna
    public void c(View view) {
    }

    @Override // a.qna
    public void d(zj zjVar) {
    }

    public lef0(tnc0 tnc0Var) {
        tnc0Var.getClass();
        this.f19899a = tnc0Var;
    }

    public lef0(d0b d0bVar) {
        d0bVar.getClass();
        this.f19899a = d0bVar;
    }

    public lef0(a0m0 a0m0Var) {
        a0m0Var.getClass();
        this.f19899a = a0m0Var;
    }

    public lef0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 21:
                this.f19899a = new rta0(gii0Var, (byte) 29);
                break;
            default:
                this.f19899a = new rta0(gii0Var, (byte) 19);
                break;
        }
    }

    public /* synthetic */ lef0(Object obj) {
        this.f19899a = obj;
    }
}
