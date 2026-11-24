package a;

import android.content.Context;
import android.util.TypedValue;
import android.view.Window;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h5b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12471a;
    public final /* synthetic */ Window b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ l7m0 e;

    public /* synthetic */ h5b(Window window, Context context, boolean z, l7m0 l7m0Var, byte b) {
        this.f12471a = b;
        this.b = window;
        this.c = context;
        this.d = z;
        this.e = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12471a;
        l7m0 l7m0Var = this.e;
        boolean z = this.d;
        ilz ilzVar = (ilz) obj;
        switch (b) {
            case 0:
                ilzVar.getClass();
                Window window = this.b;
                if (window != null) {
                    TypedValue typedValue = j5d.f15927a;
                    Context context = this.c;
                    ofm0.A(window, context, R.color.static_transparent, j5d.a(context, R.attr.uikitBackgroundContent, true), ((Boolean) l7m0Var.getValue()).booleanValue(), !z);
                }
                return new pa2((byte) 5);
            case 1:
                ilzVar.getClass();
                boolean zBooleanValue = ((Boolean) l7m0Var.getValue()).booleanValue();
                Window window2 = this.b;
                if (zBooleanValue) {
                    if (window2 != null) {
                        TypedValue typedValue2 = j5d.f15927a;
                        Context context2 = this.c;
                        ofm0.A(window2, context2, R.color.static_transparent, j5d.a(context2, R.attr.uikitBackgroundContent, true), false, !z);
                    }
                } else if (window2 != null) {
                    ofm0.z(window2, null, R.attr.uikitBackgroundContent, android.R.attr.statusBarColor, 9);
                }
                return new pa2((byte) 7);
            case 2:
                ilzVar.getClass();
                Window window3 = this.b;
                if (window3 != null) {
                    TypedValue typedValue3 = j5d.f15927a;
                    Context context3 = this.c;
                    ofm0.A(window3, context3, R.color.static_transparent, j5d.a(context3, R.attr.uikitBackground, true), ((Boolean) l7m0Var.getValue()).booleanValue(), !z);
                }
                return new pa2((byte) 15);
            default:
                ilzVar.getClass();
                boolean zBooleanValue2 = ((Boolean) l7m0Var.getValue()).booleanValue();
                Window window4 = this.b;
                if (zBooleanValue2) {
                    if (window4 != null) {
                        TypedValue typedValue4 = j5d.f15927a;
                        Context context4 = this.c;
                        ofm0.A(window4, context4, R.color.static_transparent, j5d.a(context4, R.attr.uikitBackgroundContent, true), false, !z);
                    }
                } else if (window4 != null) {
                    ofm0.z(window4, null, R.attr.uikitBackgroundContent, android.R.attr.statusBarColor, 9);
                }
                return new pa2((byte) 16);
        }
    }
}
