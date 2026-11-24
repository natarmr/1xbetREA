package a;

import android.content.Context;
import android.util.TypedValue;
import android.view.Window;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class la2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19685a;
    public final /* synthetic */ Window b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ la2(Window window, Context context, boolean z, byte b) {
        this.f19685a = b;
        this.b = window;
        this.c = context;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19685a;
        boolean z = this.d;
        ilz ilzVar = (ilz) obj;
        switch (b) {
            case 0:
                ilzVar.getClass();
                Window window = this.b;
                if (window != null) {
                    TypedValue typedValue = j5d.f15927a;
                    Context context = this.c;
                    boolean z2 = !z;
                    ofm0.A(window, context, R.color.static_transparent, j5d.a(context, R.attr.uikitBackgroundContent, true), z2, z2);
                }
                return new pa2((byte) 0);
            case 1:
                ilzVar.getClass();
                Window window2 = this.b;
                if (window2 != null) {
                    TypedValue typedValue2 = j5d.f15927a;
                    Context context2 = this.c;
                    boolean z3 = !z;
                    ofm0.A(window2, context2, R.color.static_transparent, j5d.a(context2, R.attr.uikitBackgroundContent, true), z3, z3);
                }
                return new pa2((byte) 1);
            case 2:
                ilzVar.getClass();
                Window window3 = this.b;
                if (window3 != null) {
                    TypedValue typedValue3 = j5d.f15927a;
                    Context context3 = this.c;
                    boolean z4 = !z;
                    ofm0.A(window3, context3, R.color.static_transparent, j5d.a(context3, R.attr.uikitBackgroundContent, true), z4, z4);
                }
                return new pa2((byte) 2);
            case 3:
                ilzVar.getClass();
                Window window4 = this.b;
                if (window4 != null) {
                    TypedValue typedValue4 = j5d.f15927a;
                    Context context4 = this.c;
                    boolean z5 = !z;
                    ofm0.A(window4, context4, R.color.static_transparent, j5d.a(context4, R.attr.uikitBackgroundContent, true), z5, z5);
                }
                return new pa2((byte) 8);
            case 4:
                ilzVar.getClass();
                Window window5 = this.b;
                if (window5 != null) {
                    TypedValue typedValue5 = j5d.f15927a;
                    Context context5 = this.c;
                    boolean z6 = !z;
                    ofm0.A(window5, context5, R.color.static_transparent, j5d.a(context5, R.attr.uikitBackgroundContent, true), z6, z6);
                }
                return new pa2((byte) 10);
            case 5:
                ilzVar.getClass();
                Window window6 = this.b;
                if (window6 != null) {
                    TypedValue typedValue6 = j5d.f15927a;
                    Context context6 = this.c;
                    boolean z7 = !z;
                    ofm0.A(window6, context6, R.color.static_transparent, j5d.a(context6, R.attr.uikitBackgroundContent, true), z7, z7);
                }
                return new pa2((byte) 11);
            case 6:
                ilzVar.getClass();
                Window window7 = this.b;
                if (window7 != null) {
                    TypedValue typedValue7 = j5d.f15927a;
                    Context context7 = this.c;
                    boolean z8 = !z;
                    ofm0.A(window7, context7, R.color.static_transparent, j5d.a(context7, R.attr.uikitBackground, true), z8, z8);
                }
                return new pa2((byte) 12);
            default:
                ilzVar.getClass();
                Window window8 = this.b;
                if (window8 != null) {
                    TypedValue typedValue8 = j5d.f15927a;
                    Context context8 = this.c;
                    boolean z9 = !z;
                    ofm0.A(window8, context8, R.color.static_transparent, j5d.a(context8, R.attr.uikitBackgroundContent, true), z9, z9);
                }
                return new pa2((byte) 14);
        }
    }
}
