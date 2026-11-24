package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class d6e extends qv5 {
    public final kx2 f;

    public d6e(kx2 kx2Var, final enc encVar, mhc mhcVar, final z6e z6eVar, z6e z6eVar2, z6e z6eVar3, final z6e z6eVar4, final z6e z6eVar5) {
        this.f = kx2Var;
        final nhe0 nhe0Var = new nhe0();
        dp dpVar = this.d;
        final byte b = 0;
        int i = 3;
        byte b2 = 27;
        dpVar.b(new gbn(new jbp((byte) 15), new e9k(i, b2), new Function1() { // from class: a.ozp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                final enc encVar2 = encVar;
                z6e z6eVar6 = z6eVar5;
                final cp cpVar = (cp) obj;
                switch (b3) {
                    case 0:
                        cpVar.getClass();
                        z1k z1kVar = (z1k) cpVar.u;
                        Drawable background = z1kVar.e.getBackground();
                        if (background != null) {
                            sj3.B0(background, cpVar.w, R.attr.uikitBackgroundContent);
                        }
                        final byte b4 = 0;
                        z1kVar.d.setOnClickListener(new pzp(z6eVar6, cpVar, (byte) 0));
                        cpVar.t(new Function1() { // from class: a.qzp
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ttx ttxVarA;
                                ttx ttxVarB;
                                byte b5 = b4;
                                final enc encVar3 = encVar2;
                                cp cpVar2 = cpVar;
                                final byte b6 = 0;
                                switch (b5) {
                                    case 0:
                                        ((List) obj2).getClass();
                                        yfu0 yfu0Var = cpVar2.u;
                                        z1k z1kVar2 = (z1k) yfu0Var;
                                        z1kVar2.f.setText(((pde0) cpVar2.u()).f.b);
                                        List list = u0d.f34849a;
                                        u0d.j(z1kVar2.c, ((pde0) cpVar2.u()).f.d, ((pde0) cpVar2.u()).f.c, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 492);
                                        z1k z1kVar3 = (z1k) yfu0Var;
                                        FixedSelectionTextView fixedSelectionTextView = z1kVar3.h;
                                        LinearLayout linearLayout = z1kVar3.b;
                                        fixedSelectionTextView.setText(((pde0) cpVar2.u()).b);
                                        z1kVar3.h.setVisibility(((pde0) cpVar2.u()).b.length() > 0 ? 0 : 8);
                                        int childCount = linearLayout.getChildCount();
                                        int i2 = 0;
                                        for (Object obj3 : ((pde0) cpVar2.u()).g) {
                                            int i3 = i2 + 1;
                                            if (i2 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            final jzp jzpVar = (jzp) obj3;
                                            if (i2 < childCount) {
                                                View childAt = linearLayout.getChildAt(i2);
                                                childAt.getClass();
                                                childAt.setVisibility(0);
                                                ttxVarA = ttx.a(childAt);
                                            } else {
                                                ttxVarA = ttx.a(LayoutInflater.from(cpVar2.w).inflate(R.layout.item_consultant_chat_file_receive, (ViewGroup) linearLayout, false));
                                                linearLayout.addView(ttxVarA.b);
                                            }
                                            ttxVarA.f.setText(jzpVar.b);
                                            ttxVarA.e.setText(jzpVar.f);
                                            ImageView imageView = ttxVarA.c;
                                            yos0 yos0Var = jzpVar.e;
                                            ConstraintLayout constraintLayout = ttxVarA.b;
                                            Context context = constraintLayout.getContext();
                                            context.getClass();
                                            imageView.setImageDrawable(btm0.v(yos0Var, context));
                                            imageView.setBackgroundResource(R.drawable.background_receive_document);
                                            ImageView imageView2 = ttxVarA.d;
                                            imageView2.setVisibility(btm0.q(yos0Var) ? 0 : 8);
                                            if (imageView2.getVisibility() == 0) {
                                                TypedValue typedValue = j5d.f15927a;
                                                Context context2 = constraintLayout.getContext();
                                                context2.getClass();
                                                s7n0.y(imageView2, j5d.a(context2, R.attr.uikitPrimary, false));
                                            } else {
                                                s7n0.z(imageView2);
                                            }
                                            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: a.rzp
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b7 = b6;
                                                    jzp jzpVar2 = jzpVar;
                                                    enc encVar4 = encVar3;
                                                    switch (b7) {
                                                        case 0:
                                                            encVar4.invoke(jzpVar2);
                                                            break;
                                                        default:
                                                            encVar4.invoke(jzpVar2);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2 = i3;
                                        }
                                        if (childCount > ((pde0) cpVar2.u()).g.size()) {
                                            for (int size = ((pde0) cpVar2.u()).g.size(); size < childCount; size++) {
                                                View childAt2 = linearLayout.getChildAt(size);
                                                childAt2.getClass();
                                                childAt2.setVisibility(8);
                                            }
                                        }
                                        z1kVar3.g.setVisibility(((pde0) cpVar2.u()).e ? 0 : 8);
                                        TextView textView = z1kVar3.i;
                                        rdj rdjVar = rdj.f30294a;
                                        textView.setText(rdj.h(new ynq0(((pde0) cpVar2.u()).d.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        z1kVar3.d.setVisibility(((pde0) cpVar2.u()).h ? (byte) 0 : (byte) 4);
                                        z1kVar3.f43625a.post(new ccf(z1kVar3, (byte) 23));
                                        return Unit.f46060a;
                                    default:
                                        ((List) obj2).getClass();
                                        a2k a2kVar = (a2k) cpVar2.u;
                                        FixedSelectionTextView fixedSelectionTextView2 = a2kVar.f;
                                        LinearLayout linearLayout2 = a2kVar.b;
                                        fixedSelectionTextView2.setText(((rdi0) cpVar2.u()).c);
                                        a2kVar.f.setVisibility(((rdi0) cpVar2.u()).c.length() > 0 ? 0 : 8);
                                        int childCount2 = linearLayout2.getChildCount();
                                        int i4 = 0;
                                        for (Object obj4 : ((rdi0) cpVar2.u()).h) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            final jzp jzpVar2 = (jzp) obj4;
                                            if (i4 < childCount2) {
                                                View childAt3 = linearLayout2.getChildAt(i4);
                                                childAt3.getClass();
                                                childAt3.setVisibility(0);
                                                ttxVarB = ttx.b(childAt3);
                                            } else {
                                                ttxVarB = ttx.b(LayoutInflater.from(cpVar2.w).inflate(R.layout.item_consultant_chat_file_send, (ViewGroup) linearLayout2, false));
                                                linearLayout2.addView(ttxVarB.b);
                                            }
                                            ttxVarB.f.setText(jzpVar2.b);
                                            ttxVarB.e.setText(jzpVar2.f);
                                            ImageView imageView3 = ttxVarB.c;
                                            yos0 yos0Var2 = jzpVar2.e;
                                            ConstraintLayout constraintLayout2 = ttxVarB.b;
                                            Context context3 = constraintLayout2.getContext();
                                            context3.getClass();
                                            imageView3.setImageDrawable(btm0.v(yos0Var2, context3));
                                            ImageView imageView4 = ttxVarB.d;
                                            imageView4.setVisibility(btm0.q(yos0Var2) ? 0 : 8);
                                            if (imageView4.getVisibility() == 0) {
                                                TypedValue typedValue2 = j5d.f15927a;
                                                Context context4 = constraintLayout2.getContext();
                                                context4.getClass();
                                                s7n0.y(imageView4, j5d.a(context4, R.attr.uikitPrimary, false));
                                            } else {
                                                s7n0.z(imageView4);
                                            }
                                            final byte b7 = 1;
                                            constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: a.rzp
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b8 = b7;
                                                    jzp jzpVar3 = jzpVar2;
                                                    enc encVar4 = encVar3;
                                                    switch (b8) {
                                                        case 0:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                        default:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i4 = i5;
                                        }
                                        if (childCount2 > ((rdi0) cpVar2.u()).h.size()) {
                                            for (int size2 = ((rdi0) cpVar2.u()).h.size(); size2 < childCount2; size2++) {
                                                View childAt4 = linearLayout2.getChildAt(size2);
                                                childAt4.getClass();
                                                childAt4.setVisibility(8);
                                            }
                                        }
                                        a2kVar.d.setImageResource(((rdi0) cpVar2.u()).e);
                                        TextView textView2 = a2kVar.g;
                                        rdj rdjVar2 = rdj.f30294a;
                                        textView2.setText(rdj.h(new ynq0(((rdi0) cpVar2.u()).f.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        a2kVar.c.setVisibility(((rdi0) cpVar2.u()).i ? (byte) 0 : (byte) 4);
                                        a2kVar.f128a.post(new ccf(a2kVar, (byte) 24));
                                        return Unit.f46060a;
                                }
                            }
                        });
                        break;
                    default:
                        cpVar.getClass();
                        a2k a2kVar = (a2k) cpVar.u;
                        Drawable background2 = a2kVar.e.getBackground();
                        if (background2 != null) {
                            sj3.B0(background2, cpVar.w, R.attr.uikitPrimary);
                        }
                        final byte b5 = 1;
                        a2kVar.c.setOnClickListener(new pzp(cpVar, z6eVar6, (byte) 1));
                        cpVar.t(new Function1() { // from class: a.qzp
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ttx ttxVarA;
                                ttx ttxVarB;
                                byte b6 = b5;
                                final enc encVar3 = encVar2;
                                cp cpVar2 = cpVar;
                                final byte b7 = 0;
                                switch (b6) {
                                    case 0:
                                        ((List) obj2).getClass();
                                        yfu0 yfu0Var = cpVar2.u;
                                        z1k z1kVar2 = (z1k) yfu0Var;
                                        z1kVar2.f.setText(((pde0) cpVar2.u()).f.b);
                                        List list = u0d.f34849a;
                                        u0d.j(z1kVar2.c, ((pde0) cpVar2.u()).f.d, ((pde0) cpVar2.u()).f.c, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 492);
                                        z1k z1kVar3 = (z1k) yfu0Var;
                                        FixedSelectionTextView fixedSelectionTextView = z1kVar3.h;
                                        LinearLayout linearLayout = z1kVar3.b;
                                        fixedSelectionTextView.setText(((pde0) cpVar2.u()).b);
                                        z1kVar3.h.setVisibility(((pde0) cpVar2.u()).b.length() > 0 ? 0 : 8);
                                        int childCount = linearLayout.getChildCount();
                                        int i2 = 0;
                                        for (Object obj3 : ((pde0) cpVar2.u()).g) {
                                            int i3 = i2 + 1;
                                            if (i2 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            final jzp jzpVar = (jzp) obj3;
                                            if (i2 < childCount) {
                                                View childAt = linearLayout.getChildAt(i2);
                                                childAt.getClass();
                                                childAt.setVisibility(0);
                                                ttxVarA = ttx.a(childAt);
                                            } else {
                                                ttxVarA = ttx.a(LayoutInflater.from(cpVar2.w).inflate(R.layout.item_consultant_chat_file_receive, (ViewGroup) linearLayout, false));
                                                linearLayout.addView(ttxVarA.b);
                                            }
                                            ttxVarA.f.setText(jzpVar.b);
                                            ttxVarA.e.setText(jzpVar.f);
                                            ImageView imageView = ttxVarA.c;
                                            yos0 yos0Var = jzpVar.e;
                                            ConstraintLayout constraintLayout = ttxVarA.b;
                                            Context context = constraintLayout.getContext();
                                            context.getClass();
                                            imageView.setImageDrawable(btm0.v(yos0Var, context));
                                            imageView.setBackgroundResource(R.drawable.background_receive_document);
                                            ImageView imageView2 = ttxVarA.d;
                                            imageView2.setVisibility(btm0.q(yos0Var) ? 0 : 8);
                                            if (imageView2.getVisibility() == 0) {
                                                TypedValue typedValue = j5d.f15927a;
                                                Context context2 = constraintLayout.getContext();
                                                context2.getClass();
                                                s7n0.y(imageView2, j5d.a(context2, R.attr.uikitPrimary, false));
                                            } else {
                                                s7n0.z(imageView2);
                                            }
                                            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: a.rzp
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b8 = b7;
                                                    jzp jzpVar3 = jzpVar;
                                                    enc encVar4 = encVar3;
                                                    switch (b8) {
                                                        case 0:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                        default:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2 = i3;
                                        }
                                        if (childCount > ((pde0) cpVar2.u()).g.size()) {
                                            for (int size = ((pde0) cpVar2.u()).g.size(); size < childCount; size++) {
                                                View childAt2 = linearLayout.getChildAt(size);
                                                childAt2.getClass();
                                                childAt2.setVisibility(8);
                                            }
                                        }
                                        z1kVar3.g.setVisibility(((pde0) cpVar2.u()).e ? 0 : 8);
                                        TextView textView = z1kVar3.i;
                                        rdj rdjVar = rdj.f30294a;
                                        textView.setText(rdj.h(new ynq0(((pde0) cpVar2.u()).d.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        z1kVar3.d.setVisibility(((pde0) cpVar2.u()).h ? (byte) 0 : (byte) 4);
                                        z1kVar3.f43625a.post(new ccf(z1kVar3, (byte) 23));
                                        return Unit.f46060a;
                                    default:
                                        ((List) obj2).getClass();
                                        a2k a2kVar2 = (a2k) cpVar2.u;
                                        FixedSelectionTextView fixedSelectionTextView2 = a2kVar2.f;
                                        LinearLayout linearLayout2 = a2kVar2.b;
                                        fixedSelectionTextView2.setText(((rdi0) cpVar2.u()).c);
                                        a2kVar2.f.setVisibility(((rdi0) cpVar2.u()).c.length() > 0 ? 0 : 8);
                                        int childCount2 = linearLayout2.getChildCount();
                                        int i4 = 0;
                                        for (Object obj4 : ((rdi0) cpVar2.u()).h) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            final jzp jzpVar2 = (jzp) obj4;
                                            if (i4 < childCount2) {
                                                View childAt3 = linearLayout2.getChildAt(i4);
                                                childAt3.getClass();
                                                childAt3.setVisibility(0);
                                                ttxVarB = ttx.b(childAt3);
                                            } else {
                                                ttxVarB = ttx.b(LayoutInflater.from(cpVar2.w).inflate(R.layout.item_consultant_chat_file_send, (ViewGroup) linearLayout2, false));
                                                linearLayout2.addView(ttxVarB.b);
                                            }
                                            ttxVarB.f.setText(jzpVar2.b);
                                            ttxVarB.e.setText(jzpVar2.f);
                                            ImageView imageView3 = ttxVarB.c;
                                            yos0 yos0Var2 = jzpVar2.e;
                                            ConstraintLayout constraintLayout2 = ttxVarB.b;
                                            Context context3 = constraintLayout2.getContext();
                                            context3.getClass();
                                            imageView3.setImageDrawable(btm0.v(yos0Var2, context3));
                                            ImageView imageView4 = ttxVarB.d;
                                            imageView4.setVisibility(btm0.q(yos0Var2) ? 0 : 8);
                                            if (imageView4.getVisibility() == 0) {
                                                TypedValue typedValue2 = j5d.f15927a;
                                                Context context4 = constraintLayout2.getContext();
                                                context4.getClass();
                                                s7n0.y(imageView4, j5d.a(context4, R.attr.uikitPrimary, false));
                                            } else {
                                                s7n0.z(imageView4);
                                            }
                                            final byte b8 = 1;
                                            constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: a.rzp
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b9 = b8;
                                                    jzp jzpVar3 = jzpVar2;
                                                    enc encVar4 = encVar3;
                                                    switch (b9) {
                                                        case 0:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                        default:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i4 = i5;
                                        }
                                        if (childCount2 > ((rdi0) cpVar2.u()).h.size()) {
                                            for (int size2 = ((rdi0) cpVar2.u()).h.size(); size2 < childCount2; size2++) {
                                                View childAt4 = linearLayout2.getChildAt(size2);
                                                childAt4.getClass();
                                                childAt4.setVisibility(8);
                                            }
                                        }
                                        a2kVar2.d.setImageResource(((rdi0) cpVar2.u()).e);
                                        TextView textView2 = a2kVar2.g;
                                        rdj rdjVar2 = rdj.f30294a;
                                        textView2.setText(rdj.h(new ynq0(((rdi0) cpVar2.u()).f.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        a2kVar2.c.setVisibility(((rdi0) cpVar2.u()).i ? (byte) 0 : (byte) 4);
                                        a2kVar2.f128a.post(new ccf(a2kVar2, (byte) 24));
                                        return Unit.f46060a;
                                }
                            }
                        });
                        break;
                }
                return Unit.f46060a;
            }
        }, gzn.u));
        final byte b3 = 1;
        dpVar.b(new gbn(new jbp((byte) 16), new e9k(i, (byte) 28), new Function1() { // from class: a.ozp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                final enc encVar2 = encVar;
                z6e z6eVar6 = z6eVar5;
                final cp cpVar = (cp) obj;
                switch (b4) {
                    case 0:
                        cpVar.getClass();
                        z1k z1kVar = (z1k) cpVar.u;
                        Drawable background = z1kVar.e.getBackground();
                        if (background != null) {
                            sj3.B0(background, cpVar.w, R.attr.uikitBackgroundContent);
                        }
                        final byte b5 = 0;
                        z1kVar.d.setOnClickListener(new pzp(z6eVar6, cpVar, (byte) 0));
                        cpVar.t(new Function1() { // from class: a.qzp
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ttx ttxVarA;
                                ttx ttxVarB;
                                byte b6 = b5;
                                final enc encVar3 = encVar2;
                                cp cpVar2 = cpVar;
                                final byte b7 = 0;
                                switch (b6) {
                                    case 0:
                                        ((List) obj2).getClass();
                                        yfu0 yfu0Var = cpVar2.u;
                                        z1k z1kVar2 = (z1k) yfu0Var;
                                        z1kVar2.f.setText(((pde0) cpVar2.u()).f.b);
                                        List list = u0d.f34849a;
                                        u0d.j(z1kVar2.c, ((pde0) cpVar2.u()).f.d, ((pde0) cpVar2.u()).f.c, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 492);
                                        z1k z1kVar3 = (z1k) yfu0Var;
                                        FixedSelectionTextView fixedSelectionTextView = z1kVar3.h;
                                        LinearLayout linearLayout = z1kVar3.b;
                                        fixedSelectionTextView.setText(((pde0) cpVar2.u()).b);
                                        z1kVar3.h.setVisibility(((pde0) cpVar2.u()).b.length() > 0 ? 0 : 8);
                                        int childCount = linearLayout.getChildCount();
                                        int i2 = 0;
                                        for (Object obj3 : ((pde0) cpVar2.u()).g) {
                                            int i3 = i2 + 1;
                                            if (i2 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            final jzp jzpVar = (jzp) obj3;
                                            if (i2 < childCount) {
                                                View childAt = linearLayout.getChildAt(i2);
                                                childAt.getClass();
                                                childAt.setVisibility(0);
                                                ttxVarA = ttx.a(childAt);
                                            } else {
                                                ttxVarA = ttx.a(LayoutInflater.from(cpVar2.w).inflate(R.layout.item_consultant_chat_file_receive, (ViewGroup) linearLayout, false));
                                                linearLayout.addView(ttxVarA.b);
                                            }
                                            ttxVarA.f.setText(jzpVar.b);
                                            ttxVarA.e.setText(jzpVar.f);
                                            ImageView imageView = ttxVarA.c;
                                            yos0 yos0Var = jzpVar.e;
                                            ConstraintLayout constraintLayout = ttxVarA.b;
                                            Context context = constraintLayout.getContext();
                                            context.getClass();
                                            imageView.setImageDrawable(btm0.v(yos0Var, context));
                                            imageView.setBackgroundResource(R.drawable.background_receive_document);
                                            ImageView imageView2 = ttxVarA.d;
                                            imageView2.setVisibility(btm0.q(yos0Var) ? 0 : 8);
                                            if (imageView2.getVisibility() == 0) {
                                                TypedValue typedValue = j5d.f15927a;
                                                Context context2 = constraintLayout.getContext();
                                                context2.getClass();
                                                s7n0.y(imageView2, j5d.a(context2, R.attr.uikitPrimary, false));
                                            } else {
                                                s7n0.z(imageView2);
                                            }
                                            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: a.rzp
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b9 = b7;
                                                    jzp jzpVar3 = jzpVar;
                                                    enc encVar4 = encVar3;
                                                    switch (b9) {
                                                        case 0:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                        default:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2 = i3;
                                        }
                                        if (childCount > ((pde0) cpVar2.u()).g.size()) {
                                            for (int size = ((pde0) cpVar2.u()).g.size(); size < childCount; size++) {
                                                View childAt2 = linearLayout.getChildAt(size);
                                                childAt2.getClass();
                                                childAt2.setVisibility(8);
                                            }
                                        }
                                        z1kVar3.g.setVisibility(((pde0) cpVar2.u()).e ? 0 : 8);
                                        TextView textView = z1kVar3.i;
                                        rdj rdjVar = rdj.f30294a;
                                        textView.setText(rdj.h(new ynq0(((pde0) cpVar2.u()).d.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        z1kVar3.d.setVisibility(((pde0) cpVar2.u()).h ? (byte) 0 : (byte) 4);
                                        z1kVar3.f43625a.post(new ccf(z1kVar3, (byte) 23));
                                        return Unit.f46060a;
                                    default:
                                        ((List) obj2).getClass();
                                        a2k a2kVar2 = (a2k) cpVar2.u;
                                        FixedSelectionTextView fixedSelectionTextView2 = a2kVar2.f;
                                        LinearLayout linearLayout2 = a2kVar2.b;
                                        fixedSelectionTextView2.setText(((rdi0) cpVar2.u()).c);
                                        a2kVar2.f.setVisibility(((rdi0) cpVar2.u()).c.length() > 0 ? 0 : 8);
                                        int childCount2 = linearLayout2.getChildCount();
                                        int i4 = 0;
                                        for (Object obj4 : ((rdi0) cpVar2.u()).h) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            final jzp jzpVar2 = (jzp) obj4;
                                            if (i4 < childCount2) {
                                                View childAt3 = linearLayout2.getChildAt(i4);
                                                childAt3.getClass();
                                                childAt3.setVisibility(0);
                                                ttxVarB = ttx.b(childAt3);
                                            } else {
                                                ttxVarB = ttx.b(LayoutInflater.from(cpVar2.w).inflate(R.layout.item_consultant_chat_file_send, (ViewGroup) linearLayout2, false));
                                                linearLayout2.addView(ttxVarB.b);
                                            }
                                            ttxVarB.f.setText(jzpVar2.b);
                                            ttxVarB.e.setText(jzpVar2.f);
                                            ImageView imageView3 = ttxVarB.c;
                                            yos0 yos0Var2 = jzpVar2.e;
                                            ConstraintLayout constraintLayout2 = ttxVarB.b;
                                            Context context3 = constraintLayout2.getContext();
                                            context3.getClass();
                                            imageView3.setImageDrawable(btm0.v(yos0Var2, context3));
                                            ImageView imageView4 = ttxVarB.d;
                                            imageView4.setVisibility(btm0.q(yos0Var2) ? 0 : 8);
                                            if (imageView4.getVisibility() == 0) {
                                                TypedValue typedValue2 = j5d.f15927a;
                                                Context context4 = constraintLayout2.getContext();
                                                context4.getClass();
                                                s7n0.y(imageView4, j5d.a(context4, R.attr.uikitPrimary, false));
                                            } else {
                                                s7n0.z(imageView4);
                                            }
                                            final byte b8 = 1;
                                            constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: a.rzp
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b9 = b8;
                                                    jzp jzpVar3 = jzpVar2;
                                                    enc encVar4 = encVar3;
                                                    switch (b9) {
                                                        case 0:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                        default:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i4 = i5;
                                        }
                                        if (childCount2 > ((rdi0) cpVar2.u()).h.size()) {
                                            for (int size2 = ((rdi0) cpVar2.u()).h.size(); size2 < childCount2; size2++) {
                                                View childAt4 = linearLayout2.getChildAt(size2);
                                                childAt4.getClass();
                                                childAt4.setVisibility(8);
                                            }
                                        }
                                        a2kVar2.d.setImageResource(((rdi0) cpVar2.u()).e);
                                        TextView textView2 = a2kVar2.g;
                                        rdj rdjVar2 = rdj.f30294a;
                                        textView2.setText(rdj.h(new ynq0(((rdi0) cpVar2.u()).f.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        a2kVar2.c.setVisibility(((rdi0) cpVar2.u()).i ? (byte) 0 : (byte) 4);
                                        a2kVar2.f128a.post(new ccf(a2kVar2, (byte) 24));
                                        return Unit.f46060a;
                                }
                            }
                        });
                        break;
                    default:
                        cpVar.getClass();
                        a2k a2kVar = (a2k) cpVar.u;
                        Drawable background2 = a2kVar.e.getBackground();
                        if (background2 != null) {
                            sj3.B0(background2, cpVar.w, R.attr.uikitPrimary);
                        }
                        final byte b6 = 1;
                        a2kVar.c.setOnClickListener(new pzp(cpVar, z6eVar6, (byte) 1));
                        cpVar.t(new Function1() { // from class: a.qzp
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ttx ttxVarA;
                                ttx ttxVarB;
                                byte b7 = b6;
                                final enc encVar3 = encVar2;
                                cp cpVar2 = cpVar;
                                final byte b8 = 0;
                                switch (b7) {
                                    case 0:
                                        ((List) obj2).getClass();
                                        yfu0 yfu0Var = cpVar2.u;
                                        z1k z1kVar2 = (z1k) yfu0Var;
                                        z1kVar2.f.setText(((pde0) cpVar2.u()).f.b);
                                        List list = u0d.f34849a;
                                        u0d.j(z1kVar2.c, ((pde0) cpVar2.u()).f.d, ((pde0) cpVar2.u()).f.c, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 492);
                                        z1k z1kVar3 = (z1k) yfu0Var;
                                        FixedSelectionTextView fixedSelectionTextView = z1kVar3.h;
                                        LinearLayout linearLayout = z1kVar3.b;
                                        fixedSelectionTextView.setText(((pde0) cpVar2.u()).b);
                                        z1kVar3.h.setVisibility(((pde0) cpVar2.u()).b.length() > 0 ? 0 : 8);
                                        int childCount = linearLayout.getChildCount();
                                        int i2 = 0;
                                        for (Object obj3 : ((pde0) cpVar2.u()).g) {
                                            int i3 = i2 + 1;
                                            if (i2 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            final jzp jzpVar = (jzp) obj3;
                                            if (i2 < childCount) {
                                                View childAt = linearLayout.getChildAt(i2);
                                                childAt.getClass();
                                                childAt.setVisibility(0);
                                                ttxVarA = ttx.a(childAt);
                                            } else {
                                                ttxVarA = ttx.a(LayoutInflater.from(cpVar2.w).inflate(R.layout.item_consultant_chat_file_receive, (ViewGroup) linearLayout, false));
                                                linearLayout.addView(ttxVarA.b);
                                            }
                                            ttxVarA.f.setText(jzpVar.b);
                                            ttxVarA.e.setText(jzpVar.f);
                                            ImageView imageView = ttxVarA.c;
                                            yos0 yos0Var = jzpVar.e;
                                            ConstraintLayout constraintLayout = ttxVarA.b;
                                            Context context = constraintLayout.getContext();
                                            context.getClass();
                                            imageView.setImageDrawable(btm0.v(yos0Var, context));
                                            imageView.setBackgroundResource(R.drawable.background_receive_document);
                                            ImageView imageView2 = ttxVarA.d;
                                            imageView2.setVisibility(btm0.q(yos0Var) ? 0 : 8);
                                            if (imageView2.getVisibility() == 0) {
                                                TypedValue typedValue = j5d.f15927a;
                                                Context context2 = constraintLayout.getContext();
                                                context2.getClass();
                                                s7n0.y(imageView2, j5d.a(context2, R.attr.uikitPrimary, false));
                                            } else {
                                                s7n0.z(imageView2);
                                            }
                                            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: a.rzp
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b9 = b8;
                                                    jzp jzpVar3 = jzpVar;
                                                    enc encVar4 = encVar3;
                                                    switch (b9) {
                                                        case 0:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                        default:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2 = i3;
                                        }
                                        if (childCount > ((pde0) cpVar2.u()).g.size()) {
                                            for (int size = ((pde0) cpVar2.u()).g.size(); size < childCount; size++) {
                                                View childAt2 = linearLayout.getChildAt(size);
                                                childAt2.getClass();
                                                childAt2.setVisibility(8);
                                            }
                                        }
                                        z1kVar3.g.setVisibility(((pde0) cpVar2.u()).e ? 0 : 8);
                                        TextView textView = z1kVar3.i;
                                        rdj rdjVar = rdj.f30294a;
                                        textView.setText(rdj.h(new ynq0(((pde0) cpVar2.u()).d.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        z1kVar3.d.setVisibility(((pde0) cpVar2.u()).h ? (byte) 0 : (byte) 4);
                                        z1kVar3.f43625a.post(new ccf(z1kVar3, (byte) 23));
                                        return Unit.f46060a;
                                    default:
                                        ((List) obj2).getClass();
                                        a2k a2kVar2 = (a2k) cpVar2.u;
                                        FixedSelectionTextView fixedSelectionTextView2 = a2kVar2.f;
                                        LinearLayout linearLayout2 = a2kVar2.b;
                                        fixedSelectionTextView2.setText(((rdi0) cpVar2.u()).c);
                                        a2kVar2.f.setVisibility(((rdi0) cpVar2.u()).c.length() > 0 ? 0 : 8);
                                        int childCount2 = linearLayout2.getChildCount();
                                        int i4 = 0;
                                        for (Object obj4 : ((rdi0) cpVar2.u()).h) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            final jzp jzpVar2 = (jzp) obj4;
                                            if (i4 < childCount2) {
                                                View childAt3 = linearLayout2.getChildAt(i4);
                                                childAt3.getClass();
                                                childAt3.setVisibility(0);
                                                ttxVarB = ttx.b(childAt3);
                                            } else {
                                                ttxVarB = ttx.b(LayoutInflater.from(cpVar2.w).inflate(R.layout.item_consultant_chat_file_send, (ViewGroup) linearLayout2, false));
                                                linearLayout2.addView(ttxVarB.b);
                                            }
                                            ttxVarB.f.setText(jzpVar2.b);
                                            ttxVarB.e.setText(jzpVar2.f);
                                            ImageView imageView3 = ttxVarB.c;
                                            yos0 yos0Var2 = jzpVar2.e;
                                            ConstraintLayout constraintLayout2 = ttxVarB.b;
                                            Context context3 = constraintLayout2.getContext();
                                            context3.getClass();
                                            imageView3.setImageDrawable(btm0.v(yos0Var2, context3));
                                            ImageView imageView4 = ttxVarB.d;
                                            imageView4.setVisibility(btm0.q(yos0Var2) ? 0 : 8);
                                            if (imageView4.getVisibility() == 0) {
                                                TypedValue typedValue2 = j5d.f15927a;
                                                Context context4 = constraintLayout2.getContext();
                                                context4.getClass();
                                                s7n0.y(imageView4, j5d.a(context4, R.attr.uikitPrimary, false));
                                            } else {
                                                s7n0.z(imageView4);
                                            }
                                            final byte b9 = 1;
                                            constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: a.rzp
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    byte b10 = b9;
                                                    jzp jzpVar3 = jzpVar2;
                                                    enc encVar4 = encVar3;
                                                    switch (b10) {
                                                        case 0:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                        default:
                                                            encVar4.invoke(jzpVar3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i4 = i5;
                                        }
                                        if (childCount2 > ((rdi0) cpVar2.u()).h.size()) {
                                            for (int size2 = ((rdi0) cpVar2.u()).h.size(); size2 < childCount2; size2++) {
                                                View childAt4 = linearLayout2.getChildAt(size2);
                                                childAt4.getClass();
                                                childAt4.setVisibility(8);
                                            }
                                        }
                                        a2kVar2.d.setImageResource(((rdi0) cpVar2.u()).e);
                                        TextView textView2 = a2kVar2.g;
                                        rdj rdjVar2 = rdj.f30294a;
                                        textView2.setText(rdj.h(new ynq0(((rdi0) cpVar2.u()).f.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        a2kVar2.c.setVisibility(((rdi0) cpVar2.u()).i ? (byte) 0 : (byte) 4);
                                        a2kVar2.f128a.post(new ccf(a2kVar2, (byte) 24));
                                        return Unit.f46060a;
                                }
                            }
                        });
                        break;
                }
                return Unit.f46060a;
            }
        }, gzn.v));
        dpVar.b(new gbn(new zgp0((byte) 24), new d8q0(i, (byte) 2), new nop0((Object) z6eVar5, (byte) 17), pfo0.k));
        byte b4 = 23;
        dpVar.b(new gbn(new zgp0((byte) 23), new d8q0(i, b3), new nej0(mhcVar, z6eVar2, z6eVar3, b4), pfo0.j));
        dpVar.b(new gbn(new v1x((byte) 0), new pkv(i, (byte) 21), new Function1() { // from class: a.h1x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b3;
                byte b6 = 2;
                z6e z6eVar6 = z6eVar;
                z6e z6eVar7 = z6eVar4;
                z6e z6eVar8 = z6eVar5;
                cp cpVar = (cp) obj;
                switch (b5) {
                    case 0:
                        cpVar.getClass();
                        b2k b2kVar = (b2k) cpVar.u;
                        Drawable background = b2kVar.e.getBackground();
                        if (background != null) {
                            sj3.B0(background, cpVar.w, R.attr.uikitBackgroundContent);
                        }
                        b2kVar.c.setOnClickListener(new pzp(z6eVar8, cpVar, (byte) 2));
                        LinearLayout linearLayout = b2kVar.f1855a;
                        linearLayout.getClass();
                        tl60.a(linearLayout, new mfr(linearLayout, b2kVar, (byte) 7));
                        cpVar.t(new l1d(cpVar, z6eVar7, z6eVar6, (byte) 1));
                        break;
                    default:
                        cpVar.getClass();
                        c2k c2kVar = (c2k) cpVar.u;
                        Drawable background2 = c2kVar.e.getBackground();
                        if (background2 != null) {
                            sj3.B0(background2, cpVar.w, R.attr.uikitPrimary);
                        }
                        c2kVar.b.setOnClickListener(new pzp(cpVar, z6eVar8, (byte) 3));
                        LinearLayout linearLayout2 = c2kVar.f3627a;
                        linearLayout2.getClass();
                        tl60.a(linearLayout2, new lfr(linearLayout2, c2kVar, (byte) 10));
                        cpVar.t(new l1d(cpVar, z6eVar7, z6eVar6, b6));
                        break;
                }
                return Unit.f46060a;
            }
        }, btv.r));
        final byte b5 = 1;
        dpVar.b(new gbn(new v1x((byte) 2), new pkv(i, b4), new Function1() { // from class: a.d3x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b6 = b5;
                z6e z6eVar6 = z6eVar5;
                nhe0 nhe0Var2 = nhe0Var;
                z6e z6eVar7 = z6eVar4;
                z6e z6eVar8 = z6eVar;
                final cp cpVar = (cp) obj;
                switch (b6) {
                    case 0:
                        cpVar.getClass();
                        final bg5 bg5Var = new bg5(z6eVar8, z6eVar7);
                        d2k d2kVar = (d2k) cpVar.u;
                        RecyclerView recyclerView = d2kVar.f;
                        Context context = cpVar.w;
                        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
                        final byte b7 = 0;
                        gridLayoutManager.m1 = new f3x(bg5Var, (byte) 0);
                        recyclerView.setLayoutManager(gridLayoutManager);
                        RecyclerView recyclerView2 = d2kVar.f;
                        recyclerView2.m(new kq8(context));
                        recyclerView2.setItemAnimator(null);
                        recyclerView2.setAdapter(bg5Var);
                        recyclerView2.setRecycledViewPool(nhe0Var2);
                        LinearLayout linearLayout = d2kVar.f5359a;
                        linearLayout.getClass();
                        tl60.a(linearLayout, new mfr(linearLayout, d2kVar, (byte) 8));
                        Drawable background = d2kVar.d.getBackground();
                        if (background != null) {
                            sj3.B0(background, context, R.attr.uikitBackgroundContent);
                        }
                        d2kVar.c.setOnClickListener(new pzp(z6eVar6, cpVar, (byte) 4));
                        cpVar.t(new Function1() { // from class: a.e3x
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b8 = b7;
                                bg5 bg5Var2 = bg5Var;
                                cp cpVar2 = cpVar;
                                switch (b8) {
                                    case 0:
                                        ((List) obj2).getClass();
                                        yfu0 yfu0Var = cpVar2.u;
                                        d2k d2kVar2 = (d2k) yfu0Var;
                                        d2kVar2.g.setText(((sde0) cpVar2.u()).g.b);
                                        List list = u0d.f34849a;
                                        u0d.j(d2kVar2.b, ((sde0) cpVar2.u()).g.d, ((sde0) cpVar2.u()).g.c, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 492);
                                        d2k d2kVar3 = (d2k) yfu0Var;
                                        TextView textView = d2kVar3.h;
                                        FixedSelectionTextView fixedSelectionTextView = d2kVar3.e;
                                        textView.setVisibility(((sde0) cpVar2.u()).f ? 0 : 8);
                                        fixedSelectionTextView.setText(((sde0) cpVar2.u()).b);
                                        bg5Var2.A(((sde0) cpVar2.u()).e);
                                        fixedSelectionTextView.setVisibility(((sde0) cpVar2.u()).b.length() > 0 ? 0 : 8);
                                        d2kVar3.c.setVisibility(((sde0) cpVar2.u()).h ? 0 : 4);
                                        TextView textView2 = d2kVar3.i;
                                        rdj rdjVar = rdj.f30294a;
                                        textView2.setText(rdj.h(new ynq0(((sde0) cpVar2.u()).d.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        break;
                                    default:
                                        ((List) obj2).getClass();
                                        e2k e2kVar = (e2k) cpVar2.u;
                                        bg5Var2.A(((ydi0) cpVar2.u()).g);
                                        e2kVar.c.setImageResource(((ydi0) cpVar2.u()).e);
                                        FixedSelectionTextView fixedSelectionTextView2 = e2kVar.e;
                                        fixedSelectionTextView2.setVisibility(((ydi0) cpVar2.u()).c.length() > 0 ? 0 : 8);
                                        fixedSelectionTextView2.setText(((ydi0) cpVar2.u()).c);
                                        e2kVar.b.setVisibility(((ydi0) cpVar2.u()).h ? 0 : 4);
                                        TextView textView3 = e2kVar.g;
                                        rdj rdjVar2 = rdj.f30294a;
                                        textView3.setText(rdj.h(new ynq0(((ydi0) cpVar2.u()).f.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        break;
                    default:
                        cpVar.getClass();
                        final bg5 bg5Var2 = new bg5(z6eVar8, z6eVar7);
                        e2k e2kVar = (e2k) cpVar.u;
                        RecyclerView recyclerView3 = e2kVar.f;
                        Context context2 = cpVar.w;
                        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(context2, 2);
                        final byte b8 = 1;
                        gridLayoutManager2.m1 = new f3x(bg5Var2, (byte) 1);
                        recyclerView3.setLayoutManager(gridLayoutManager2);
                        RecyclerView recyclerView4 = e2kVar.f;
                        recyclerView4.m(new kq8(context2));
                        recyclerView4.setItemAnimator(null);
                        recyclerView4.setAdapter(bg5Var2);
                        recyclerView4.setRecycledViewPool(nhe0Var2);
                        LinearLayout linearLayout2 = e2kVar.f7091a;
                        linearLayout2.getClass();
                        tl60.a(linearLayout2, new lfr(linearLayout2, e2kVar, (byte) 11));
                        Drawable background2 = e2kVar.d.getBackground();
                        if (background2 != null) {
                            sj3.B0(background2, context2, R.attr.uikitPrimary);
                        }
                        e2kVar.b.setOnClickListener(new pzp(cpVar, z6eVar6, (byte) 5));
                        cpVar.t(new Function1() { // from class: a.e3x
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b9 = b8;
                                bg5 bg5Var3 = bg5Var2;
                                cp cpVar2 = cpVar;
                                switch (b9) {
                                    case 0:
                                        ((List) obj2).getClass();
                                        yfu0 yfu0Var = cpVar2.u;
                                        d2k d2kVar2 = (d2k) yfu0Var;
                                        d2kVar2.g.setText(((sde0) cpVar2.u()).g.b);
                                        List list = u0d.f34849a;
                                        u0d.j(d2kVar2.b, ((sde0) cpVar2.u()).g.d, ((sde0) cpVar2.u()).g.c, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 492);
                                        d2k d2kVar3 = (d2k) yfu0Var;
                                        TextView textView = d2kVar3.h;
                                        FixedSelectionTextView fixedSelectionTextView = d2kVar3.e;
                                        textView.setVisibility(((sde0) cpVar2.u()).f ? 0 : 8);
                                        fixedSelectionTextView.setText(((sde0) cpVar2.u()).b);
                                        bg5Var3.A(((sde0) cpVar2.u()).e);
                                        fixedSelectionTextView.setVisibility(((sde0) cpVar2.u()).b.length() > 0 ? 0 : 8);
                                        d2kVar3.c.setVisibility(((sde0) cpVar2.u()).h ? 0 : 4);
                                        TextView textView2 = d2kVar3.i;
                                        rdj rdjVar = rdj.f30294a;
                                        textView2.setText(rdj.h(new ynq0(((sde0) cpVar2.u()).d.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        break;
                                    default:
                                        ((List) obj2).getClass();
                                        e2k e2kVar2 = (e2k) cpVar2.u;
                                        bg5Var3.A(((ydi0) cpVar2.u()).g);
                                        e2kVar2.c.setImageResource(((ydi0) cpVar2.u()).e);
                                        FixedSelectionTextView fixedSelectionTextView2 = e2kVar2.e;
                                        fixedSelectionTextView2.setVisibility(((ydi0) cpVar2.u()).c.length() > 0 ? 0 : 8);
                                        fixedSelectionTextView2.setText(((ydi0) cpVar2.u()).c);
                                        e2kVar2.b.setVisibility(((ydi0) cpVar2.u()).h ? 0 : 4);
                                        TextView textView3 = e2kVar2.g;
                                        rdj rdjVar2 = rdj.f30294a;
                                        textView3.setText(rdj.h(new ynq0(((ydi0) cpVar2.u()).f.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        break;
                }
                return Unit.f46060a;
            }
        }, btv.t));
        v1x v1xVar = new v1x((byte) 1);
        final byte b6 = 0;
        Function1 function1 = new Function1() { // from class: a.d3x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b7 = b6;
                z6e z6eVar6 = z6eVar5;
                nhe0 nhe0Var2 = nhe0Var;
                z6e z6eVar7 = z6eVar4;
                z6e z6eVar8 = z6eVar;
                final cp cpVar = (cp) obj;
                switch (b7) {
                    case 0:
                        cpVar.getClass();
                        final bg5 bg5Var = new bg5(z6eVar8, z6eVar7);
                        d2k d2kVar = (d2k) cpVar.u;
                        RecyclerView recyclerView = d2kVar.f;
                        Context context = cpVar.w;
                        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
                        final byte b8 = 0;
                        gridLayoutManager.m1 = new f3x(bg5Var, (byte) 0);
                        recyclerView.setLayoutManager(gridLayoutManager);
                        RecyclerView recyclerView2 = d2kVar.f;
                        recyclerView2.m(new kq8(context));
                        recyclerView2.setItemAnimator(null);
                        recyclerView2.setAdapter(bg5Var);
                        recyclerView2.setRecycledViewPool(nhe0Var2);
                        LinearLayout linearLayout = d2kVar.f5359a;
                        linearLayout.getClass();
                        tl60.a(linearLayout, new mfr(linearLayout, d2kVar, (byte) 8));
                        Drawable background = d2kVar.d.getBackground();
                        if (background != null) {
                            sj3.B0(background, context, R.attr.uikitBackgroundContent);
                        }
                        d2kVar.c.setOnClickListener(new pzp(z6eVar6, cpVar, (byte) 4));
                        cpVar.t(new Function1() { // from class: a.e3x
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b9 = b8;
                                bg5 bg5Var3 = bg5Var;
                                cp cpVar2 = cpVar;
                                switch (b9) {
                                    case 0:
                                        ((List) obj2).getClass();
                                        yfu0 yfu0Var = cpVar2.u;
                                        d2k d2kVar2 = (d2k) yfu0Var;
                                        d2kVar2.g.setText(((sde0) cpVar2.u()).g.b);
                                        List list = u0d.f34849a;
                                        u0d.j(d2kVar2.b, ((sde0) cpVar2.u()).g.d, ((sde0) cpVar2.u()).g.c, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 492);
                                        d2k d2kVar3 = (d2k) yfu0Var;
                                        TextView textView = d2kVar3.h;
                                        FixedSelectionTextView fixedSelectionTextView = d2kVar3.e;
                                        textView.setVisibility(((sde0) cpVar2.u()).f ? 0 : 8);
                                        fixedSelectionTextView.setText(((sde0) cpVar2.u()).b);
                                        bg5Var3.A(((sde0) cpVar2.u()).e);
                                        fixedSelectionTextView.setVisibility(((sde0) cpVar2.u()).b.length() > 0 ? 0 : 8);
                                        d2kVar3.c.setVisibility(((sde0) cpVar2.u()).h ? 0 : 4);
                                        TextView textView2 = d2kVar3.i;
                                        rdj rdjVar = rdj.f30294a;
                                        textView2.setText(rdj.h(new ynq0(((sde0) cpVar2.u()).d.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        break;
                                    default:
                                        ((List) obj2).getClass();
                                        e2k e2kVar2 = (e2k) cpVar2.u;
                                        bg5Var3.A(((ydi0) cpVar2.u()).g);
                                        e2kVar2.c.setImageResource(((ydi0) cpVar2.u()).e);
                                        FixedSelectionTextView fixedSelectionTextView2 = e2kVar2.e;
                                        fixedSelectionTextView2.setVisibility(((ydi0) cpVar2.u()).c.length() > 0 ? 0 : 8);
                                        fixedSelectionTextView2.setText(((ydi0) cpVar2.u()).c);
                                        e2kVar2.b.setVisibility(((ydi0) cpVar2.u()).h ? 0 : 4);
                                        TextView textView3 = e2kVar2.g;
                                        rdj rdjVar2 = rdj.f30294a;
                                        textView3.setText(rdj.h(new ynq0(((ydi0) cpVar2.u()).f.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        break;
                    default:
                        cpVar.getClass();
                        final bg5 bg5Var2 = new bg5(z6eVar8, z6eVar7);
                        e2k e2kVar = (e2k) cpVar.u;
                        RecyclerView recyclerView3 = e2kVar.f;
                        Context context2 = cpVar.w;
                        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(context2, 2);
                        final byte b9 = 1;
                        gridLayoutManager2.m1 = new f3x(bg5Var2, (byte) 1);
                        recyclerView3.setLayoutManager(gridLayoutManager2);
                        RecyclerView recyclerView4 = e2kVar.f;
                        recyclerView4.m(new kq8(context2));
                        recyclerView4.setItemAnimator(null);
                        recyclerView4.setAdapter(bg5Var2);
                        recyclerView4.setRecycledViewPool(nhe0Var2);
                        LinearLayout linearLayout2 = e2kVar.f7091a;
                        linearLayout2.getClass();
                        tl60.a(linearLayout2, new lfr(linearLayout2, e2kVar, (byte) 11));
                        Drawable background2 = e2kVar.d.getBackground();
                        if (background2 != null) {
                            sj3.B0(background2, context2, R.attr.uikitPrimary);
                        }
                        e2kVar.b.setOnClickListener(new pzp(cpVar, z6eVar6, (byte) 5));
                        cpVar.t(new Function1() { // from class: a.e3x
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b10 = b9;
                                bg5 bg5Var3 = bg5Var2;
                                cp cpVar2 = cpVar;
                                switch (b10) {
                                    case 0:
                                        ((List) obj2).getClass();
                                        yfu0 yfu0Var = cpVar2.u;
                                        d2k d2kVar2 = (d2k) yfu0Var;
                                        d2kVar2.g.setText(((sde0) cpVar2.u()).g.b);
                                        List list = u0d.f34849a;
                                        u0d.j(d2kVar2.b, ((sde0) cpVar2.u()).g.d, ((sde0) cpVar2.u()).g.c, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 492);
                                        d2k d2kVar3 = (d2k) yfu0Var;
                                        TextView textView = d2kVar3.h;
                                        FixedSelectionTextView fixedSelectionTextView = d2kVar3.e;
                                        textView.setVisibility(((sde0) cpVar2.u()).f ? 0 : 8);
                                        fixedSelectionTextView.setText(((sde0) cpVar2.u()).b);
                                        bg5Var3.A(((sde0) cpVar2.u()).e);
                                        fixedSelectionTextView.setVisibility(((sde0) cpVar2.u()).b.length() > 0 ? 0 : 8);
                                        d2kVar3.c.setVisibility(((sde0) cpVar2.u()).h ? 0 : 4);
                                        TextView textView2 = d2kVar3.i;
                                        rdj rdjVar = rdj.f30294a;
                                        textView2.setText(rdj.h(new ynq0(((sde0) cpVar2.u()).d.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        break;
                                    default:
                                        ((List) obj2).getClass();
                                        e2k e2kVar2 = (e2k) cpVar2.u;
                                        bg5Var3.A(((ydi0) cpVar2.u()).g);
                                        e2kVar2.c.setImageResource(((ydi0) cpVar2.u()).e);
                                        FixedSelectionTextView fixedSelectionTextView2 = e2kVar2.e;
                                        fixedSelectionTextView2.setVisibility(((ydi0) cpVar2.u()).c.length() > 0 ? 0 : 8);
                                        fixedSelectionTextView2.setText(((ydi0) cpVar2.u()).c);
                                        e2kVar2.b.setVisibility(((ydi0) cpVar2.u()).h ? 0 : 4);
                                        TextView textView3 = e2kVar2.g;
                                        rdj rdjVar2 = rdj.f30294a;
                                        textView3.setText(rdj.h(new ynq0(((ydi0) cpVar2.u()).f.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar2.f40887a.getContext())), null, 248));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        break;
                }
                return Unit.f46060a;
            }
        };
        byte b7 = 22;
        dpVar.b(new gbn(v1xVar, new pkv(i, b7), function1, btv.s));
        byte b8 = 20;
        dpVar.b(new gbn(new x2w((byte) 29), new pkv(i, b8), new Function1() { // from class: a.h1x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b9 = b;
                byte b10 = 2;
                z6e z6eVar6 = z6eVar;
                z6e z6eVar7 = z6eVar4;
                z6e z6eVar8 = z6eVar5;
                cp cpVar = (cp) obj;
                switch (b9) {
                    case 0:
                        cpVar.getClass();
                        b2k b2kVar = (b2k) cpVar.u;
                        Drawable background = b2kVar.e.getBackground();
                        if (background != null) {
                            sj3.B0(background, cpVar.w, R.attr.uikitBackgroundContent);
                        }
                        b2kVar.c.setOnClickListener(new pzp(z6eVar8, cpVar, (byte) 2));
                        LinearLayout linearLayout = b2kVar.f1855a;
                        linearLayout.getClass();
                        tl60.a(linearLayout, new mfr(linearLayout, b2kVar, (byte) 7));
                        cpVar.t(new l1d(cpVar, z6eVar7, z6eVar6, (byte) 1));
                        break;
                    default:
                        cpVar.getClass();
                        c2k c2kVar = (c2k) cpVar.u;
                        Drawable background2 = c2kVar.e.getBackground();
                        if (background2 != null) {
                            sj3.B0(background2, cpVar.w, R.attr.uikitPrimary);
                        }
                        c2kVar.b.setOnClickListener(new pzp(cpVar, z6eVar8, (byte) 3));
                        LinearLayout linearLayout2 = c2kVar.f3627a;
                        linearLayout2.getClass();
                        tl60.a(linearLayout2, new lfr(linearLayout2, c2kVar, (byte) 10));
                        cpVar.t(new l1d(cpVar, z6eVar7, z6eVar6, b10));
                        break;
                }
                return Unit.f46060a;
            }
        }, btv.q));
        dpVar.b(new gbn(new acm0((byte) 25), new asj0(i, b7), new rgn0(b7), wjj0.f1));
        byte b9 = 6;
        dpVar.b(new gbn(new i9t0(b9), new d8q0(i, (byte) 18), new qzs0(b9), pfo0.A));
        dpVar.b(new gbn(new rj50(b3), new tvx(i, b2), new mb50((byte) 6), gvy.Z));
        dpVar.b(new gbn(new kyz((byte) 14), new tvx(i, (byte) 16), new w800((byte) 24), gvy.q));
        dpVar.b(new gbn(new x6o((byte) 17), new e9k(i, b8), new mmn((byte) 24), gzn.n));
    }

    public final long C(int i) {
        p6t0 p6t0Var = (p6t0) this.e.f.get(i);
        if (!(p6t0Var instanceof y640)) {
            return -1L;
        }
        Date dateE = ((y640) p6t0Var).e();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateE);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final void D(int i, p6t0 p6t0Var) {
        if (p6t0Var == null) {
            return;
        }
        boolean z = p6t0Var instanceof tde0;
        kx2 kx2Var = this.f;
        if (z) {
            kx2Var.F(Integer.valueOf(i), Integer.valueOf(((tde0) p6t0Var).c()), Boolean.FALSE);
        } else if (p6t0Var instanceof ztc) {
            kx2Var.F(Integer.valueOf(i), Integer.valueOf(((ztc) p6t0Var).c()), Boolean.TRUE);
        }
    }

    @Override // a.zz3, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        super.n(xhe0Var, i);
        Object obj = this.e.f.get(i);
        obj.getClass();
        D(i, (p6t0) obj);
    }

    @Override // a.zz3, a.yge0
    public final void o(xhe0 xhe0Var, int i, List list) {
        list.getClass();
        super.o(xhe0Var, i, list);
        Object obj = this.e.f.get(i);
        obj.getClass();
        D(i, (p6t0) obj);
    }
}
