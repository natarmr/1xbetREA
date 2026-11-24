package a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xc6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40631a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xc6(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        this.f40631a = (byte) 3;
        this.d = arrayList;
        this.e = arrayList2;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40631a;
        int i = this.c;
        int i2 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new yc6(cpVar, this.b, this.c, (ao6) obj3, (bo6) obj2));
                return Unit.f46060a;
            case 1:
                twk twkVar = (twk) obj3;
                View view = (View) obj;
                view.getClass();
                Rect rect = (Rect) twkVar.c;
                RecyclerView.Y(rect, view);
                int iRound = Math.round(view.getTranslationY()) + rect.bottom;
                Drawable drawable = (Drawable) twkVar.b;
                int intrinsicHeight = iRound - drawable.getIntrinsicHeight();
                Rect rect2 = (Rect) twkVar.d;
                drawable.getPadding(rect2);
                drawable.setBounds(i2 + rect2.left, intrinsicHeight + rect2.top, i - rect2.right, iRound - rect2.bottom);
                drawable.setAlpha((int) (view.getAlpha() * 255.0f));
                drawable.draw((Canvas) obj2);
                return Unit.f46060a;
            case 2:
                ((w6k) obj).getClass();
                int iL = ((cgk0) obj3).l() / i2;
                return new ikx(((long) si30.b(((iL - i) / 2.0f) + (((Number) ((l7m0) obj2).getValue()).floatValue() * iL))) << 32);
            default:
                ArrayList<pu90> arrayList = (ArrayList) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                for (pu90 pu90Var : (ArrayList) obj3) {
                    ou90Var.m(pu90Var, 0, (i2 - pu90Var.b) / 2, 0.0f);
                }
                for (pu90 pu90Var2 : arrayList) {
                    ou90Var.m(pu90Var2, i, (i2 - pu90Var2.b) / 2, 0.0f);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ xc6(byte b, int i, int i2, Object obj, Object obj2) {
        this.f40631a = b;
        this.b = i;
        this.c = i2;
        this.d = obj;
        this.e = obj2;
    }

    public /* synthetic */ xc6(RecyclerView recyclerView, twk twkVar, int i, int i2, Canvas canvas) {
        this.f40631a = (byte) 1;
        this.d = twkVar;
        this.b = i;
        this.c = i2;
        this.e = canvas;
    }
}
