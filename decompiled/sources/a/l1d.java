package a;

import android.text.format.DateFormat;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l1d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19246a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ z6e c;
    public final /* synthetic */ z6e d;

    public /* synthetic */ l1d(cp cpVar, z6e z6eVar, z6e z6eVar2) {
        this.f19246a = (byte) 0;
        this.b = cpVar;
        this.d = z6eVar;
        this.c = z6eVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19246a;
        f2x f2xVar = f2x.f8836a;
        final z6e z6eVar = this.d;
        z6e z6eVar2 = this.c;
        final cp cpVar = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                ((List) obj).getClass();
                yos0 yos0Var = ((k1d) cpVar.u()).f17517a.e;
                v1k v1kVar = (v1k) cpVar.u;
                ShapeableImageView shapeableImageView = v1kVar.b;
                ImageView imageView = v1kVar.c;
                ShapeableImageView shapeableImageView2 = v1kVar.b;
                ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
                layoutParams.getClass();
                a3e a3eVar = (a3e) layoutParams;
                if (Intrinsics.d(a3eVar.G, ((k1d) cpVar.u()).c.f15728a)) {
                    List list = u0d.f34849a;
                    u0d.f(shapeableImageView2, ibc.j0(yos0Var), kotlin.collections.a.c(f2xVar), ((k1d) cpVar.u()).f17517a.d);
                } else {
                    a3eVar.G = ((k1d) cpVar.u()).c.f15728a;
                    tl60.a(shapeableImageView2, new hf5(shapeableImageView2, cpVar, yos0Var, (byte) 3));
                }
                if (yos0Var instanceof wos0) {
                    shapeableImageView2.setOnClickListener(new View.OnClickListener() { // from class: a.m1d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b3 = b2;
                            cp cpVar2 = cpVar;
                            z6e z6eVar3 = z6eVar;
                            switch (b3) {
                                case 0:
                                    z6eVar3.invoke(((k1d) cpVar2.u()).f17517a);
                                    break;
                                case 1:
                                    z6eVar3.invoke(((rde0) cpVar2.u()).e);
                                    break;
                                default:
                                    z6eVar3.invoke(((xdi0) cpVar2.u()).g);
                                    break;
                            }
                        }
                    });
                } else {
                    shapeableImageView2.setOnClickListener(null);
                }
                imageView.setVisibility(btm0.q(yos0Var) ? 0 : 8);
                if (imageView.getVisibility() == 0) {
                    TypedValue typedValue = j5d.f15927a;
                    s7n0.y(imageView, j5d.a(cpVar.w, R.attr.uikitBackgroundContent, false));
                } else {
                    s7n0.z(imageView);
                }
                if (!(((k1d) cpVar.u()).b instanceof w640) && (yos0Var instanceof uos0)) {
                    z6eVar2.invoke(((k1d) cpVar.u()).f17517a);
                }
                break;
            case 1:
                ((List) obj).getClass();
                yfu0 yfu0Var = cpVar.u;
                b2k b2kVar = (b2k) yfu0Var;
                b2kVar.h.setText(((rde0) cpVar.u()).g.b);
                List list2 = u0d.f34849a;
                u0d.j(b2kVar.b, ((rde0) cpVar.u()).g.d, ((rde0) cpVar.u()).g.c, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 492);
                b2k b2kVar2 = (b2k) yfu0Var;
                TextView textView = b2kVar2.i;
                ShapeableImageView shapeableImageView3 = b2kVar2.d;
                FixedSelectionTextView fixedSelectionTextView = b2kVar2.f;
                ImageView imageView2 = b2kVar2.g;
                textView.setVisibility(((rde0) cpVar.u()).f ? 0 : 8);
                fixedSelectionTextView.setVisibility(((rde0) cpVar.u()).b.length() > 0 ? 0 : 8);
                fixedSelectionTextView.setText(((rde0) cpVar.u()).b);
                g0x g0xVar = ((rde0) cpVar.u()).e;
                yos0 yos0Var2 = g0xVar.e;
                u0d.f(shapeableImageView3, ibc.j0(yos0Var2), kotlin.collections.a.c(f2xVar), g0xVar.d);
                TextView textView2 = b2kVar2.j;
                rdj rdjVar = rdj.f30294a;
                boolean zIs24HourFormat = DateFormat.is24HourFormat(cpVar.f40887a.getContext());
                textView2.setText(rdj.h(new ynq0(((rde0) cpVar.u()).d.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(zIs24HourFormat), null, 248));
                if (yos0Var2 instanceof wos0) {
                    final byte b3 = 1;
                    shapeableImageView3.setOnClickListener(new View.OnClickListener() { // from class: a.m1d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b4 = b3;
                            cp cpVar2 = cpVar;
                            z6e z6eVar3 = z6eVar;
                            switch (b4) {
                                case 0:
                                    z6eVar3.invoke(((k1d) cpVar2.u()).f17517a);
                                    break;
                                case 1:
                                    z6eVar3.invoke(((rde0) cpVar2.u()).e);
                                    break;
                                default:
                                    z6eVar3.invoke(((xdi0) cpVar2.u()).g);
                                    break;
                            }
                        }
                    });
                } else {
                    shapeableImageView3.setOnClickListener(null);
                }
                imageView2.setVisibility(btm0.q(yos0Var2) ? 0 : 8);
                if (imageView2.getVisibility() == 0) {
                    TypedValue typedValue2 = j5d.f15927a;
                    s7n0.y(imageView2, j5d.a(cpVar.w, R.attr.uikitBackgroundContent, false));
                } else {
                    s7n0.z(imageView2);
                }
                b2kVar2.c.setVisibility(!((rde0) cpVar.u()).h ? 4 : 0);
                if (yos0Var2 instanceof uos0) {
                    z6eVar2.invoke(((rde0) cpVar.u()).e);
                }
                break;
            default:
                ((List) obj).getClass();
                c2k c2kVar = (c2k) cpVar.u;
                FixedSelectionTextView fixedSelectionTextView2 = c2kVar.f;
                ShapeableImageView shapeableImageView4 = c2kVar.c;
                ImageView imageView3 = c2kVar.g;
                fixedSelectionTextView2.setVisibility(((xdi0) cpVar.u()).c.length() > 0 ? 0 : 8);
                g0x g0xVar2 = ((xdi0) cpVar.u()).g;
                c2kVar.f.setText(((xdi0) cpVar.u()).c);
                yos0 yos0Var3 = g0xVar2.e;
                List list3 = u0d.f34849a;
                u0d.f(shapeableImageView4, ibc.j0(yos0Var3), kotlin.collections.a.c(f2xVar), g0xVar2.d);
                c2kVar.d.setImageResource(((xdi0) cpVar.u()).e);
                c2kVar.b.setVisibility(!((xdi0) cpVar.u()).h ? 4 : 0);
                if (yos0Var3 instanceof wos0) {
                    final byte b4 = 2;
                    shapeableImageView4.setOnClickListener(new View.OnClickListener() { // from class: a.m1d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b5 = b4;
                            cp cpVar2 = cpVar;
                            z6e z6eVar3 = z6eVar;
                            switch (b5) {
                                case 0:
                                    z6eVar3.invoke(((k1d) cpVar2.u()).f17517a);
                                    break;
                                case 1:
                                    z6eVar3.invoke(((rde0) cpVar2.u()).e);
                                    break;
                                default:
                                    z6eVar3.invoke(((xdi0) cpVar2.u()).g);
                                    break;
                            }
                        }
                    });
                } else {
                    shapeableImageView4.setOnClickListener(null);
                }
                TextView textView3 = c2kVar.h;
                rdj rdjVar2 = rdj.f30294a;
                boolean zIs24HourFormat2 = DateFormat.is24HourFormat(cpVar.f40887a.getContext());
                textView3.setText(rdj.h(new ynq0(((xdi0) cpVar.u()).f.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(zIs24HourFormat2), null, 248));
                imageView3.setVisibility(btm0.q(yos0Var3) ? 0 : 8);
                if (imageView3.getVisibility() == 0) {
                    TypedValue typedValue3 = j5d.f15927a;
                    s7n0.y(imageView3, j5d.a(cpVar.w, R.attr.uikitBackgroundContent, false));
                } else {
                    s7n0.z(imageView3);
                }
                if (!(((xdi0) cpVar.u()).d instanceof w640) && (yos0Var3 instanceof uos0)) {
                    z6eVar2.invoke(((xdi0) cpVar.u()).g);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ l1d(cp cpVar, z6e z6eVar, z6e z6eVar2, byte b) {
        this.f19246a = b;
        this.b = cpVar;
        this.c = z6eVar;
        this.d = z6eVar2;
    }
}
