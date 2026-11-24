package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class go5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11613a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ ObjectAnimator c;
    public final /* synthetic */ cp d;
    public final /* synthetic */ ObjectAnimator e;

    public /* synthetic */ go5(cp cpVar, ObjectAnimator objectAnimator, cp cpVar2, ObjectAnimator objectAnimator2, byte b) {
        this.f11613a = b;
        this.b = cpVar;
        this.c = objectAnimator;
        this.d = cpVar2;
        this.e = objectAnimator2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11613a;
        cp cpVar = this.b;
        cp cpVar2 = this.d;
        ObjectAnimator objectAnimator = this.c;
        ObjectAnimator objectAnimator2 = this.e;
        switch (b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    ArrayList<co5> arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        obj2.getClass();
                        w3d.u(arrayList, (Collection) obj2);
                    }
                    for (co5 co5Var : arrayList) {
                        if (co5Var != null) {
                            if (co5Var instanceof ao5) {
                                if (((do5) cpVar2.u()).f6400a) {
                                    objectAnimator2.start();
                                } else {
                                    objectAnimator2.cancel();
                                }
                            } else if (co5Var instanceof bo5) {
                                ((cg3) cpVar2.u).b.setImageResource(((do5) cpVar2.u()).b);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((cg3) cpVar.u).b.setImageResource(((do5) cpVar.u()).b);
                if (((do5) cpVar.u()).f6400a) {
                    objectAnimator.start();
                } else {
                    objectAnimator.cancel();
                }
                return Unit.f46060a;
            default:
                List list2 = (List) obj;
                yfu0 yfu0Var = cpVar2.u;
                yfu0 yfu0Var2 = cpVar.u;
                list2.getClass();
                if (!list2.isEmpty()) {
                    ArrayList<qtl0> arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        obj3.getClass();
                        w3d.u(arrayList2, (Collection) obj3);
                    }
                    for (qtl0 qtl0Var : arrayList2) {
                        if (qtl0Var != null) {
                            if (qtl0Var instanceof ntl0) {
                                if (((rtl0) cpVar2.u()).f31085a) {
                                    objectAnimator2.start();
                                }
                            } else if (qtl0Var instanceof otl0) {
                                ((ih3) yfu0Var).b.setImageResource(((rtl0) cpVar2.u()).c);
                            } else if (qtl0Var instanceof ptl0) {
                                rtl0 rtl0Var = (rtl0) cpVar2.u();
                                Drawable drawable = ((ih3) yfu0Var).b.getDrawable();
                                Context context = cpVar2.f40887a.getContext();
                                context.getClass();
                                sj3.B0(drawable, context, rtl0Var.b);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((ih3) yfu0Var2).b.setImageResource(((rtl0) cpVar.u()).c);
                rtl0 rtl0Var2 = (rtl0) cpVar.u();
                Drawable drawable2 = ((ih3) yfu0Var2).b.getDrawable();
                Context context2 = cpVar.f40887a.getContext();
                context2.getClass();
                sj3.B0(drawable2, context2, rtl0Var2.b);
                if (((rtl0) cpVar.u()).f31085a) {
                    objectAnimator.start();
                }
                return Unit.f46060a;
        }
    }
}
