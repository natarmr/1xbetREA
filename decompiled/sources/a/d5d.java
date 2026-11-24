package a;

import android.app.Activity;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d5d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5500a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d5d(int i, a4x a4xVar, bdz bdzVar, Function1 function1, boolean z) {
        this.d = a4xVar;
        this.b = i;
        this.e = bdzVar;
        this.f = function1;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View decorView;
        byte b = this.f5500a;
        byte b2 = 0;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                final Window window = (Window) obj4;
                final Activity activity = (Activity) obj3;
                final l7m0 l7m0Var = (l7m0) obj2;
                ilz ilzVar = (ilz) obj;
                ilzVar.getClass();
                final int i = this.b;
                final boolean z = this.c;
                Runnable runnable = new Runnable() { // from class: a.e5d
                    @Override // java.lang.Runnable
                    public final void run() {
                        Window window2 = window;
                        if (window2 != null) {
                            TypedValue typedValue = j5d.f15927a;
                            Activity activity2 = activity;
                            ofm0.A(window2, activity2, R.color.static_transparent, j5d.a(activity2, i, true), ((Boolean) l7m0Var.getValue()).booleanValue(), !z);
                        }
                    }
                };
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.post(runnable);
                }
                return new f5d(ilzVar, window, runnable, b2);
            case 1:
                a4x a4xVar = (a4x) obj4;
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8zVar.e(a4xVar.size(), new m160(new rj50((byte) 15), a4xVar, b2), new a8(new cl2(this.b, (byte) 7), a4xVar, (byte) 18), new ap30(a4xVar, (byte) 24), new ugd(-1942245546, true, new vfe((List) a4xVar, obj3, (Function1) obj2, this.c, (byte) 2)));
                return Unit.f46060a;
            default:
                mlr mlrVar = (mlr) obj3;
                String str = (String) obj2;
                Object obj5 = ((sd60) obj4).c;
                long j = mlrVar.f22006a;
                String str2 = mlrVar.f;
                long j2 = mlrVar.c;
                boolean z2 = mlrVar.l;
                long j3 = mlrVar.b;
                boolean z3 = mlrVar.m;
                boolean z4 = mlrVar.n;
                int i2 = this.b;
                boolean z5 = this.c;
                c8d c8dVar = (c8d) ((k0w0) obj).h(jdk0.f(j, str2, j2, z2, j3, z3, false, i2, z4, z5, false, str, true)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d((z5 || mlrVar.n) ? false : true, bjkVar, bjkVar);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ d5d(sd60 sd60Var, mlr mlrVar, int i, boolean z, String str) {
        this.d = sd60Var;
        this.e = mlrVar;
        this.b = i;
        this.c = z;
        this.f = str;
    }

    public /* synthetic */ d5d(Window window, Activity activity, int i, l7m0 l7m0Var, boolean z) {
        this.d = window;
        this.e = activity;
        this.b = i;
        this.f = l7m0Var;
        this.c = z;
    }
}
