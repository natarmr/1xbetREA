package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes5.dex */
public final class pgj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26958a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ cp c;

    public /* synthetic */ pgj0(cp cpVar, cp cpVar2, byte b) {
        this.f26958a = b;
        this.b = cpVar;
        this.c = cpVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object a(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        Context context = cpVar.w;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        Context context2 = cpVar2.w;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<fwn0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (fwn0 fwn0Var : arrayList) {
                if (fwn0Var != null) {
                    if (fwn0Var instanceof awn0) {
                        ((zvn0) yfu0Var).f.setText(((awn0) fwn0Var).f1584a);
                    } else if (fwn0Var instanceof cwn0) {
                        ((zvn0) yfu0Var).n.setText(((cwn0) fwn0Var).f5090a);
                    } else if (fwn0Var instanceof ewn0) {
                        xnm0.g(cpVar, (ewn0) fwn0Var);
                    } else if (fwn0Var instanceof dwn0) {
                        String str = ((dwn0) fwn0Var).f6808a;
                        SportScore sportScore = ((zvn0) yfu0Var).v;
                        int length = str.length();
                        CharSequence text = str;
                        if (length == 0) {
                            text = context.getText(R.string.vs);
                        }
                        sportScore.setText(text);
                    } else if (fwn0Var instanceof bwn0) {
                        TextView textView = ((zvn0) yfu0Var).f;
                        kj5 kj5Var = fzc.f10401a;
                        fzc fzcVar = ((bwn0) fwn0Var).f3334a;
                        kj5Var.getClass();
                        textView.setTextColor(kj5.k(fzcVar, context));
                    }
                }
                t9f.b();
                return null;
            }
        }
        zvn0 zvn0Var = (zvn0) yfu0Var2;
        if (((gwn0) cpVar2.u()).u) {
            zvn0Var.v.setLayoutDirection(3);
            zvn0Var.g.setLayoutDirection(3);
            zvn0Var.i.setLayoutDirection(3);
            zvn0Var.o.setLayoutDirection(3);
            zvn0Var.q.setLayoutDirection(3);
            zvn0Var.h.setLayoutDirection(3);
            zvn0Var.p.setLayoutDirection(3);
        } else {
            zvn0Var.v.setLayoutDirection(0);
            zvn0Var.g.setLayoutDirection(0);
            zvn0Var.i.setLayoutDirection(0);
            zvn0Var.o.setLayoutDirection(0);
            zvn0Var.q.setLayoutDirection(0);
            zvn0Var.h.setLayoutDirection(0);
            zvn0Var.p.setLayoutDirection(0);
        }
        TextView textView2 = zvn0Var.e;
        TextView textView3 = zvn0Var.f;
        TextView textView4 = zvn0Var.p;
        TextView textView5 = zvn0Var.h;
        textView2.setText(((gwn0) cpVar2.u()).b);
        zvn0Var.t.setText(((gwn0) cpVar2.u()).c);
        zvn0Var.r.setVisibility(8);
        textView5.setBreakStrategy(0);
        textView5.setText(((gwn0) cpVar2.u()).h);
        textView4.setBreakStrategy(0);
        textView4.setText(((gwn0) cpVar2.u()).i);
        List list2 = u0d.f34849a;
        u0d.j(zvn0Var.g, ((gwn0) cpVar2.u()).d, R.drawable.no_photo, 0, null, null, null, 508);
        u0d.j(zvn0Var.o, ((gwn0) cpVar2.u()).f, R.drawable.no_photo, 0, null, null, null, 508);
        u0d.j(zvn0Var.i, ((gwn0) cpVar2.u()).e, R.drawable.no_photo, 0, null, null, null, 508);
        u0d.j(zvn0Var.q, ((gwn0) cpVar2.u()).g, R.drawable.no_photo, 0, null, null, null, 508);
        zvn0Var.k.setText(((gwn0) cpVar2.u()).m);
        textView3.setText(((gwn0) cpVar2.u()).n);
        zvn0Var.n.setText(((gwn0) cpVar2.u()).o);
        kj5 kj5Var2 = fzc.f10401a;
        fzc fzcVar2 = ((gwn0) cpVar2.u()).t;
        kj5Var2.getClass();
        textView3.setTextColor(kj5.k(fzcVar2, context2));
        zvn0 zvn0Var2 = (zvn0) yfu0Var2;
        zvn0Var2.b.setScaleType(ImageView.ScaleType.CENTER);
        u0d.d(zvn0Var2.b, ((gwn0) cpVar2.u()).p, null, null, 62);
        String str2 = ((gwn0) cpVar2.u()).s;
        SportScore sportScore2 = ((zvn0) yfu0Var2).v;
        int length2 = str2.length();
        CharSequence text2 = str2;
        if (length2 == 0) {
            text2 = context2.getText(R.string.vs);
        }
        sportScore2.setText(text2);
        xnm0.g(cpVar2, ((gwn0) cpVar2.u()).q);
        zvn0Var2.l.setText(((gwn0) cpVar2.u()).j);
        zvn0Var2.m.setText(((gwn0) cpVar2.u()).k);
        String str3 = ((gwn0) cpVar2.u()).r;
        if (str3.length() == 0) {
            ((zvn0) yfu0Var2).j.setVisibility(8);
        } else {
            zvn0 zvn0Var3 = (zvn0) yfu0Var2;
            zvn0Var3.j.setText(str3);
            zvn0Var3.j.setVisibility(0);
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<lwn0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (lwn0 lwn0Var : arrayList) {
                if (lwn0Var != null) {
                    if (lwn0Var instanceof hwn0) {
                        ((nwn0) yfu0Var).f.setText(((hwn0) lwn0Var).f13775a);
                    } else if (lwn0Var instanceof jwn0) {
                        ((nwn0) yfu0Var).j.setText(((jwn0) lwn0Var).f17260a);
                    } else if (lwn0Var instanceof kwn0) {
                        iom0.g(cpVar, (kwn0) lwn0Var);
                    } else if (lwn0Var instanceof iwn0) {
                        TextView textView = ((nwn0) yfu0Var).f;
                        kj5 kj5Var = fzc.f10401a;
                        fzc fzcVar = ((iwn0) lwn0Var).f15499a;
                        Context context = cpVar.w;
                        kj5Var.getClass();
                        textView.setTextColor(kj5.k(fzcVar, context));
                    }
                }
                t9f.b();
                return null;
            }
        }
        nwn0 nwn0Var = (nwn0) yfu0Var2;
        TextView textView2 = nwn0Var.e;
        TextView textView3 = nwn0Var.f;
        textView2.setText(((mwn0) cpVar2.u()).b);
        nwn0Var.m.setText(((mwn0) cpVar2.u()).c);
        nwn0Var.k.setVisibility(8);
        nwn0Var.o.setText(((mwn0) cpVar2.u()).d);
        nwn0Var.g.setText(((mwn0) cpVar2.u()).h);
        textView3.setText(((mwn0) cpVar2.u()).i);
        kj5 kj5Var2 = fzc.f10401a;
        fzc fzcVar2 = ((mwn0) cpVar2.u()).m;
        Context context2 = cpVar2.w;
        kj5Var2.getClass();
        textView3.setTextColor(kj5.k(fzcVar2, context2));
        nwn0Var.j.setText(((mwn0) cpVar2.u()).j);
        nwn0 nwn0Var2 = (nwn0) yfu0Var2;
        nwn0Var2.b.setScaleType(ImageView.ScaleType.FIT_CENTER);
        List list2 = u0d.f34849a;
        u0d.d(nwn0Var2.b, ((mwn0) cpVar2.u()).k, null, null, 62);
        iom0.g(cpVar2, ((mwn0) cpVar2.u()).l);
        nwn0 nwn0Var3 = (nwn0) yfu0Var2;
        nwn0Var3.h.setText(((mwn0) cpVar2.u()).e);
        nwn0Var3.i.setText(((mwn0) cpVar2.u()).f);
        return Unit.f46060a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object c(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        Context context = cpVar.w;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        Context context2 = cpVar2.w;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<uwn0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (uwn0 uwn0Var : arrayList) {
                if (uwn0Var != null) {
                    if (uwn0Var instanceof pwn0) {
                        ((own0) yfu0Var).f.setText(((pwn0) uwn0Var).f27720a);
                    } else if (uwn0Var instanceof rwn0) {
                        ((own0) yfu0Var).m.setText(((rwn0) uwn0Var).f31224a);
                    } else if (uwn0Var instanceof twn0) {
                        ipm0.c(cpVar, (twn0) uwn0Var);
                    } else if (uwn0Var instanceof swn0) {
                        String str = ((swn0) uwn0Var).f32930a;
                        SportScore sportScore = ((own0) yfu0Var).t;
                        int length = str.length();
                        CharSequence text = str;
                        if (length == 0) {
                            text = context.getText(R.string.vs);
                        }
                        sportScore.setText(text);
                    } else if (uwn0Var instanceof qwn0) {
                        TextView textView = ((own0) yfu0Var).f;
                        kj5 kj5Var = fzc.f10401a;
                        fzc fzcVar = ((qwn0) uwn0Var).f29444a;
                        kj5Var.getClass();
                        textView.setTextColor(kj5.k(fzcVar, context));
                    }
                }
                t9f.b();
                return null;
            }
        }
        own0 own0Var = (own0) yfu0Var2;
        if (((vwn0) cpVar2.u()).s) {
            own0Var.t.setLayoutDirection(3);
            own0Var.g.setLayoutDirection(3);
            own0Var.n.setLayoutDirection(3);
            own0Var.h.setLayoutDirection(3);
            own0Var.o.setLayoutDirection(3);
        } else {
            own0Var.t.setLayoutDirection(0);
            own0Var.g.setLayoutDirection(0);
            own0Var.n.setLayoutDirection(0);
            own0Var.h.setLayoutDirection(0);
            own0Var.o.setLayoutDirection(0);
        }
        TextView textView2 = own0Var.e;
        TextView textView3 = own0Var.f;
        TextView textView4 = own0Var.o;
        TextView textView5 = own0Var.h;
        textView2.setText(((vwn0) cpVar2.u()).b);
        own0Var.r.setText(((vwn0) cpVar2.u()).c);
        own0Var.p.setVisibility(8);
        textView5.setBreakStrategy(0);
        textView5.setText(((vwn0) cpVar2.u()).f);
        textView4.setBreakStrategy(0);
        textView4.setText(((vwn0) cpVar2.u()).g);
        List list2 = u0d.f34849a;
        u0d.j(own0Var.g, ((vwn0) cpVar2.u()).d, R.drawable.no_photo, 0, null, null, null, 508);
        u0d.j(own0Var.n, ((vwn0) cpVar2.u()).e, R.drawable.no_photo, 0, null, null, null, 508);
        own0Var.j.setText(((vwn0) cpVar2.u()).k);
        textView3.setText(((vwn0) cpVar2.u()).l);
        kj5 kj5Var2 = fzc.f10401a;
        fzc fzcVar2 = ((vwn0) cpVar2.u()).r;
        kj5Var2.getClass();
        textView3.setTextColor(kj5.k(fzcVar2, context2));
        own0Var.m.setText(((vwn0) cpVar2.u()).m);
        own0 own0Var2 = (own0) yfu0Var2;
        own0Var2.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
        u0d.d(own0Var2.b, ((vwn0) cpVar2.u()).q, null, null, 62);
        own0Var2.k.setText(((vwn0) cpVar2.u()).h);
        own0Var2.l.setText(((vwn0) cpVar2.u()).i);
        ipm0.c(cpVar2, ((vwn0) cpVar2.u()).n);
        String str2 = ((vwn0) cpVar2.u()).o;
        if (str2.length() == 0) {
            ((own0) yfu0Var2).i.setVisibility(8);
        } else {
            own0 own0Var3 = (own0) yfu0Var2;
            own0Var3.i.setText(str2);
            own0Var3.i.setVisibility(0);
        }
        String str3 = ((vwn0) cpVar2.u()).p;
        SportScore sportScore2 = ((own0) yfu0Var2).t;
        int length2 = str3.length();
        CharSequence text2 = str3;
        if (length2 == 0) {
            text2 = context2.getText(R.string.vs);
        }
        sportScore2.setText(text2);
        return Unit.f46060a;
    }

    private final Object g(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            ((lyx) yfu0Var).b.setTitle(((bvq0) cpVar.u()).getTitle());
            lyx lyxVar = (lyx) yfu0Var;
            DsCellRightSwitch dsCellRightSwitch = lyxVar.c;
            DsSettingsCell dsSettingsCell = lyxVar.f20883a;
            dsCellRightSwitch.setChecked(((bvq0) cpVar.u()).i());
            boolean z = true;
            dsSettingsCell.setFirst(((bvq0) cpVar.u()).c() == uwx.f36413a || ((bvq0) cpVar.u()).c() == uwx.d);
            if (((bvq0) cpVar.u()).c() != uwx.c && ((bvq0) cpVar.u()).c() != uwx.d) {
                z = false;
            }
            dsSettingsCell.setLast(z);
        } else {
            ArrayList<xuq0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (xuq0 xuq0Var : arrayList) {
                if (xuq0Var == null) {
                    t9f.b();
                    return null;
                }
                ((lyx) this.c.u).c.setChecked(xuq0Var.f41523a);
            }
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj) {
        List list = (List) obj;
        yfu0 yfu0Var = this.c.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<vep0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (vep0 vep0Var : arrayList) {
                if (vep0Var != null) {
                    if (vep0Var instanceof sep0) {
                        ((cal) yfu0Var).b.setPlayersKillsStatistics(((sep0) vep0Var).f32084a);
                    } else if (vep0Var instanceof tep0) {
                        ((cal) yfu0Var).b.setTeam(((tep0) vep0Var).f33832a);
                    } else if (vep0Var instanceof uep0) {
                        ((cal) yfu0Var).b.setHeader(((uep0) vep0Var).f35540a);
                    }
                }
                t9f.b();
                return null;
            }
        }
        cp cpVar = this.b;
        yfu0 yfu0Var2 = cpVar.u;
        ((cal) yfu0Var2).b.setHeader(((wep0) cpVar.u()).b);
        cal calVar = (cal) yfu0Var2;
        calVar.b.setTeam(((wep0) cpVar.u()).f39030a);
        calVar.b.setPlayersKillsStatistics(((wep0) cpVar.u()).c);
        return Unit.f46060a;
    }

    private final Object i(Object obj) {
        List list = (List) obj;
        yfu0 yfu0Var = this.c.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<xlp0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (xlp0 xlp0Var : arrayList) {
                if (xlp0Var != null) {
                    if (xlp0Var instanceof ulp0) {
                        ((eal) yfu0Var).b.setPlayerStatistics(((ulp0) xlp0Var).f35885a);
                    } else if (xlp0Var instanceof wlp0) {
                        ((eal) yfu0Var).b.setTeam(((wlp0) xlp0Var).f39367a);
                    } else if (xlp0Var instanceof vlp0) {
                        ((eal) yfu0Var).b.setCellHeaders(((vlp0) xlp0Var).f37638a);
                    }
                }
                t9f.b();
                return null;
            }
        }
        cp cpVar = this.b;
        yfu0 yfu0Var2 = cpVar.u;
        ((eal) yfu0Var2).b.setTeam(((zlp0) cpVar.u()).b);
        eal ealVar = (eal) yfu0Var2;
        ealVar.b.setPlayerStatistics(((zlp0) cpVar.u()).d);
        ealVar.b.setCellHeaders(((zlp0) cpVar.u()).c);
        return Unit.f46060a;
    }

    private final Object l(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<sjp0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (sjp0 sjp0Var : arrayList) {
                if (sjp0Var != null) {
                    if (sjp0Var instanceof qjp0) {
                        ((a3k) yfu0Var).d.setListCheckBoxEnabledWithAlpha(((tjp0) cpVar.u()).e);
                    } else if (sjp0Var instanceof rjp0) {
                        ((a3k) yfu0Var).d.setListCheckboxChecked(((tjp0) cpVar.u()).d);
                    }
                }
                t9f.b();
                return null;
            }
        }
        a3k a3kVar = (a3k) yfu0Var2;
        a3kVar.d.setListCheckBoxEnabledWithAlpha(((tjp0) cpVar2.u()).e);
        ((a3k) yfu0Var2).d.setListCheckboxChecked(((tjp0) cpVar2.u()).d);
        a3kVar.c.setTitleText(((tjp0) cpVar2.u()).b);
        List list2 = u0d.f34849a;
        AppCompatImageView appCompatImageViewD = a3kVar.b.d();
        qzw qzwVar = qzw.b;
        String str = ((tjp0) cpVar2.u()).c;
        u0d.m(appCompatImageViewD, qzwVar, str, R.drawable.no_photo_new);
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        List list = (List) obj;
        yfu0 yfu0Var = this.c.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<w7q0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (w7q0 w7q0Var : arrayList) {
                if (w7q0Var != null) {
                    if (w7q0Var instanceof u7q0) {
                        DsTextField dsTextField = ((ifx) yfu0Var).b;
                        String str = ((u7q0) w7q0Var).f35198a;
                        dsTextField.setErrorText(str);
                        if (str.length() == 0) {
                            ((ifx) yfu0Var).b.getBackground();
                        }
                    } else if (w7q0Var instanceof v7q0) {
                    }
                }
                t9f.b();
                return null;
            }
        }
        cp cpVar = this.b;
        yfu0 yfu0Var2 = cpVar.u;
        ((ifx) yfu0Var2).b.setInputType(c8q0.f3927a[((x7q0) cpVar.u()).f40425a.ordinal()] == 1 ? 2 : 1);
        ifx ifxVar = (ifx) yfu0Var2;
        ifxVar.b.setErrorText(((x7q0) cpVar.u()).e);
        ifxVar.b.setText(((x7q0) cpVar.u()).b);
        ifxVar.b.setLabelText(((x7q0) cpVar.u()).c);
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            Context context = cpVar.w;
            ysx ysxVar = (ysx) yfu0Var;
            SpannableString spannableStringB = ((ymq0) cpVar.u()).b.b(context);
            ysxVar.b.setVisibility(spannableStringB.length() > 0 ? 0 : 8);
            ysxVar.b.setText(spannableStringB);
            ysxVar.c.setText(((ymq0) cpVar.u()).f42903a);
            ysxVar.d.setText(((ymq0) cpVar.u()).c.b(context));
        } else {
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (List list2 : arrayList) {
                ArrayList<jqa> arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof jqa) {
                        arrayList2.add(obj3);
                    }
                }
                for (jqa jqaVar : arrayList2) {
                    cp cpVar2 = this.c;
                    Context context2 = cpVar2.w;
                    yfu0 yfu0Var2 = cpVar2.u;
                    jqaVar.getClass();
                    if (jqaVar instanceof hqa) {
                        ((ysx) yfu0Var2).b.setText(((hqa) jqaVar).f13475a.b(context2));
                    } else {
                        if (!(jqaVar instanceof iqa)) {
                            t9f.b();
                            return null;
                        }
                        ((ysx) yfu0Var2).d.setText(((iqa) jqaVar).f15200a.b(context2));
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            u4n0.k(this.b);
        } else {
            ArrayList<z7s0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (z7s0 z7s0Var : arrayList) {
                u4n0.k(this.c);
            }
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<k8s0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (k8s0 k8s0Var : arrayList) {
                if (k8s0Var != null) {
                    if (k8s0Var instanceof i8s0) {
                        ((is10) yfu0Var).g.setText(((l8s0) cpVar.u()).b);
                    } else if (k8s0Var instanceof h8s0) {
                        s7n0.i(cpVar);
                    } else if (k8s0Var instanceof j8s0) {
                        ImageView imageView = ((is10) yfu0Var).c;
                        imageView.setVisibility(8);
                    } else if (k8s0Var instanceof e8s0) {
                        ImageView imageView2 = ((is10) yfu0Var).b;
                        imageView2.setVisibility(8);
                    } else if (k8s0Var instanceof f8s0) {
                        ImageView imageView3 = ((is10) yfu0Var).d;
                        imageView3.setVisibility(8);
                    } else if (k8s0Var instanceof g8s0) {
                        ImageView imageView4 = ((is10) yfu0Var).f;
                        imageView4.setVisibility(8);
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((is10) yfu0Var2).g.setText(((l8s0) cpVar2.u()).b);
        s7n0.i(cpVar2);
        ImageView imageView5 = ((is10) yfu0Var2).c;
        imageView5.setVisibility(8);
        ImageView imageView6 = ((is10) yfu0Var2).b;
        imageView6.setVisibility(8);
        ImageView imageView7 = ((is10) yfu0Var2).d;
        imageView7.setVisibility(8);
        ImageView imageView8 = ((is10) yfu0Var2).f;
        imageView8.setVisibility(8);
        return Unit.f46060a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f26958a;
        byte b2 = 29;
        byte b3 = 1;
        byte b4 = 0;
        cp cpVar = this.c;
        cp cpVar2 = this.b;
        Drawable drawable = null;
        switch (b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    ArrayList<ohj0> arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        obj2.getClass();
                        w3d.u(arrayList, (Collection) obj2);
                    }
                    for (ohj0 ohj0Var : arrayList) {
                        if (ohj0Var != null) {
                            if (ohj0Var instanceof lhj0) {
                                ydx.y(cpVar);
                            } else if (ohj0Var instanceof mhj0) {
                                ydx.A(cpVar);
                            } else if (ohj0Var instanceof nhj0) {
                                ydx.B(cpVar);
                            } else if (ohj0Var instanceof khj0) {
                                ydx.x(cpVar);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ydx.x(cpVar2);
                kxx kxxVar = (kxx) cpVar2.u;
                kxxVar.b.setImageResource(((rhj0) cpVar2.u()).b());
                kxxVar.c.setTitle(((rhj0) cpVar2.u()).getTitle());
                ydx.B(cpVar2);
                ydx.A(cpVar2);
                ydx.y(cpVar2);
                return Unit.f46060a;
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                if (!list2.isEmpty()) {
                    ArrayList<dij0> arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        obj3.getClass();
                        w3d.u(arrayList2, (Collection) obj3);
                    }
                    for (dij0 dij0Var : arrayList2) {
                        if (dij0Var != null) {
                            if (dij0Var instanceof bij0) {
                                ufx.t(cpVar);
                            } else if (dij0Var instanceof cij0) {
                                ufx.u(cpVar);
                            } else if (dij0Var instanceof aij0) {
                                ufx.s(cpVar);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ufx.s(cpVar2);
                kxx kxxVar2 = (kxx) cpVar2.u;
                kxxVar2.b.setImageResource(((fij0) cpVar2.u()).b());
                kxxVar2.c.setTitle(((fij0) cpVar2.u()).getTitle());
                ufx.u(cpVar2);
                ufx.t(cpVar2);
                return Unit.f46060a;
            case 2:
                List list3 = (List) obj;
                list3.getClass();
                if (list3.isEmpty()) {
                    yfu0 yfu0Var = cpVar2.u;
                    Context context = cpVar2.w;
                    rxx rxxVar = (rxx) yfu0Var;
                    TextView textView = rxxVar.b;
                    View view = rxxVar.e;
                    View view2 = rxxVar.f;
                    textView.setText(((prj0) cpVar2.u()).f27469a);
                    rxxVar.c.setText(((prj0) cpVar2.u()).b);
                    rxxVar.d.setText(((prj0) cpVar2.u()).c);
                    if (((prj0) cpVar2.u()).d) {
                        view.setVisibility(0);
                        view2.setVisibility(8);
                    } else if (((prj0) cpVar2.u()).e) {
                        view.setVisibility(8);
                        view2.setVisibility(0);
                    } else {
                        view.setVisibility(0);
                        view2.setVisibility(0);
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    a3e a3eVar = layoutParams instanceof a3e ? (a3e) layoutParams : null;
                    if (a3eVar != null) {
                        a3eVar.H = ((prj0) cpVar2.u()).f;
                    }
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    a3e a3eVar2 = layoutParams2 instanceof a3e ? (a3e) layoutParams2 : null;
                    if (a3eVar2 != null) {
                        a3eVar2.H = ((prj0) cpVar2.u()).g;
                    }
                    Drawable drawableU = sj3.U(((prj0) cpVar2.u()).h, context);
                    if (drawableU != null) {
                        sj3.B0(drawableU, context, R.attr.uikitPrimary);
                    } else {
                        drawableU = null;
                    }
                    view.setBackground(drawableU);
                    Drawable drawable2 = context.getDrawable(((prj0) cpVar2.u()).i);
                    if (drawable2 != null) {
                        sj3.B0(drawable2, context, R.attr.uikitStaticWhite40);
                        drawable = drawable2;
                    }
                    view2.setBackground(drawable);
                } else {
                    ArrayList<orj0> arrayList3 = new ArrayList();
                    for (Object obj4 : list3) {
                        obj4.getClass();
                        w3d.u(arrayList3, (Collection) obj4);
                    }
                    for (orj0 orj0Var : arrayList3) {
                        orj0Var.getClass();
                        if (!(orj0Var instanceof orj0)) {
                            t9f.b();
                            return null;
                        }
                        prj0 prj0Var = orj0Var.f25736a;
                        yfu0 yfu0Var2 = cpVar.u;
                        Context context2 = cpVar.w;
                        rxx rxxVar2 = (rxx) yfu0Var2;
                        rxxVar2.c.setText(prj0Var.b);
                        TextView textView2 = rxxVar2.d;
                        View view3 = rxxVar2.e;
                        View view4 = rxxVar2.f;
                        textView2.setText(prj0Var.c);
                        if (((prj0) cpVar.u()).d) {
                            view3.setVisibility(0);
                            view4.setVisibility(8);
                        } else if (((prj0) cpVar.u()).e) {
                            view3.setVisibility(8);
                            view4.setVisibility(0);
                        } else {
                            view3.setVisibility(0);
                            view4.setVisibility(0);
                        }
                        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                        layoutParams3.getClass();
                        ((a3e) layoutParams3).H = prj0Var.f;
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        layoutParams4.getClass();
                        ((a3e) layoutParams4).H = prj0Var.g;
                        Drawable drawableU2 = sj3.U(prj0Var.h, context2);
                        if (drawableU2 != null) {
                            sj3.B0(drawableU2, context2, R.attr.uikitPrimary);
                        } else {
                            drawableU2 = null;
                        }
                        view3.setBackground(drawableU2);
                        Drawable drawable3 = context2.getDrawable(prj0Var.i);
                        if (drawable3 != null) {
                            sj3.B0(drawable3, context2, R.attr.uikitStaticWhite40);
                        } else {
                            drawable3 = null;
                        }
                        view4.setBackground(drawable3);
                    }
                }
                return Unit.f46060a;
            case 3:
                List list4 = (List) obj;
                list4.getClass();
                if (list4.isEmpty()) {
                    yfu0 yfu0Var3 = cpVar2.u;
                    ((t850) yfu0Var3).d.setListCheckboxChecked(((fdl0) cpVar2.u()).d);
                    t850 t850Var = (t850) yfu0Var3;
                    t850Var.c.setTitleText(((fdl0) cpVar2.u()).b);
                    List list5 = u0d.f34849a;
                    AppCompatImageView appCompatImageViewD = t850Var.b.d();
                    String str = ((fdl0) cpVar2.u()).c;
                    Context context3 = cpVar2.w;
                    u0d.p(appCompatImageViewD, str, sj3.U(R.drawable.sport_new, context3));
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj5 : list4) {
                        obj5.getClass();
                        w3d.u(arrayList4, (Collection) obj5);
                    }
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        if (((edl0) it.next()) == null) {
                            t9f.b();
                            return null;
                        }
                        ((t850) cpVar.u).d.setListCheckboxChecked(((fdl0) cpVar.u()).d);
                    }
                }
                return Unit.f46060a;
            case 4:
                List list6 = (List) obj;
                yfu0 yfu0Var4 = cpVar.u;
                yfu0 yfu0Var5 = cpVar2.u;
                list6.getClass();
                if (!list6.isEmpty()) {
                    ArrayList<xjn0> arrayList5 = new ArrayList();
                    for (Object obj6 : list6) {
                        obj6.getClass();
                        w3d.u(arrayList5, (Collection) obj6);
                    }
                    for (xjn0 xjn0Var : arrayList5) {
                        if (xjn0Var != null) {
                            if (xjn0Var instanceof wjn0) {
                                ((kyx) yfu0Var4).b.setTitle(((yjn0) cpVar.u()).b);
                            } else if (xjn0Var instanceof tjn0) {
                                ((kyx) yfu0Var4).b.setIconResource(((yjn0) cpVar.u()).d);
                            } else if (xjn0Var instanceof ujn0) {
                                ((kyx) yfu0Var4).b.setCounter(Integer.valueOf(((yjn0) cpVar.u()).e));
                            } else if (xjn0Var instanceof vjn0) {
                                ((kyx) yfu0Var4).b.setSubTitle(((yjn0) cpVar.u()).c);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((kyx) yfu0Var5).b.setTitle(((yjn0) cpVar2.u()).b);
                ((kyx) yfu0Var5).b.setIconResource(((yjn0) cpVar2.u()).d);
                ((kyx) yfu0Var5).b.setSubTitle(((yjn0) cpVar2.u()).c);
                ((kyx) yfu0Var5).b.setCounter(Integer.valueOf(((yjn0) cpVar2.u()).e));
                return Unit.f46060a;
            case 5:
                List list7 = (List) obj;
                yfu0 yfu0Var6 = cpVar.u;
                yfu0 yfu0Var7 = cpVar2.u;
                list7.getClass();
                if (!list7.isEmpty()) {
                    ArrayList<xjn0> arrayList6 = new ArrayList();
                    for (Object obj7 : list7) {
                        obj7.getClass();
                        w3d.u(arrayList6, (Collection) obj7);
                    }
                    for (xjn0 xjn0Var2 : arrayList6) {
                        if (xjn0Var2 != null) {
                            if (xjn0Var2 instanceof wjn0) {
                                ((jyx) yfu0Var6).d.setTitle(((yjn0) cpVar.u()).b);
                            } else if (xjn0Var2 instanceof tjn0) {
                                ((jyx) yfu0Var6).c.setIconResource(((yjn0) cpVar.u()).d);
                            } else if (xjn0Var2 instanceof ujn0) {
                                ((jyx) yfu0Var6).b.setCount(Integer.valueOf(((yjn0) cpVar.u()).e));
                            } else if (xjn0Var2 instanceof vjn0) {
                                ((jyx) yfu0Var6).d.setSubtitle(((yjn0) cpVar.u()).c);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((jyx) yfu0Var7).d.setTitle(((yjn0) cpVar2.u()).b);
                ((jyx) yfu0Var7).c.setIconResource(((yjn0) cpVar2.u()).d);
                ((jyx) yfu0Var7).b.setCount(Integer.valueOf(((yjn0) cpVar2.u()).e));
                ((jyx) yfu0Var7).d.setSubtitle(((yjn0) cpVar2.u()).c);
                return Unit.f46060a;
            case 6:
                List list8 = (List) obj;
                Context context4 = cpVar.w;
                yfu0 yfu0Var8 = cpVar.u;
                Context context5 = cpVar2.w;
                yfu0 yfu0Var9 = cpVar2.u;
                list8.getClass();
                if (!list8.isEmpty()) {
                    ArrayList<atn0> arrayList7 = new ArrayList();
                    for (Object obj8 : list8) {
                        obj8.getClass();
                        w3d.u(arrayList7, (Collection) obj8);
                    }
                    for (atn0 atn0Var : arrayList7) {
                        if (atn0Var != null) {
                            if (atn0Var instanceof usn0) {
                                ((tsn0) yfu0Var8).f.setText(((usn0) atn0Var).f36221a);
                            } else if (atn0Var instanceof xsn0) {
                                ((tsn0) yfu0Var8).n.setText(((xsn0) atn0Var).f41426a);
                            } else if (atn0Var instanceof wsn0) {
                                ohm0.h(cpVar, ((wsn0) atn0Var).f39701a);
                            } else if (atn0Var instanceof zsn0) {
                                ohm0.i(cpVar, (zsn0) atn0Var);
                            } else if (atn0Var instanceof ysn0) {
                                String str2 = ((ysn0) atn0Var).f43177a;
                                ((tsn0) yfu0Var8).v.setText(str2.length() == 0 ? context4.getText(R.string.vs) : str2);
                            } else if (atn0Var instanceof vsn0) {
                                TextView textView3 = ((tsn0) yfu0Var8).f;
                                kj5 kj5Var = fzc.f10401a;
                                fzc fzcVar = ((vsn0) atn0Var).f37959a;
                                kj5Var.getClass();
                                textView3.setTextColor(kj5.k(fzcVar, context4));
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                tsn0 tsn0Var = (tsn0) yfu0Var9;
                if (((btn0) cpVar2.u()).w) {
                    tsn0Var.v.setLayoutDirection(3);
                    tsn0Var.g.setLayoutDirection(3);
                    tsn0Var.i.setLayoutDirection(3);
                    tsn0Var.o.setLayoutDirection(3);
                    tsn0Var.q.setLayoutDirection(3);
                    tsn0Var.h.setLayoutDirection(3);
                    tsn0Var.p.setLayoutDirection(3);
                } else {
                    tsn0Var.v.setLayoutDirection(0);
                    tsn0Var.g.setLayoutDirection(0);
                    tsn0Var.i.setLayoutDirection(0);
                    tsn0Var.o.setLayoutDirection(0);
                    tsn0Var.q.setLayoutDirection(0);
                    tsn0Var.h.setLayoutDirection(0);
                    tsn0Var.p.setLayoutDirection(0);
                }
                TextView textView4 = tsn0Var.e;
                TextView textView5 = tsn0Var.f;
                TextView textView6 = tsn0Var.p;
                TextView textView7 = tsn0Var.h;
                textView4.setText(((btn0) cpVar2.u()).b);
                tsn0Var.t.setText(((btn0) cpVar2.u()).c);
                tsn0 tsn0Var2 = (tsn0) yfu0Var9;
                List list9 = u0d.f34849a;
                u0d.s(cpVar2.w, ((btn0) cpVar2.u()).d, Integer.valueOf(context5.getResources().getDimensionPixelOffset(R.dimen.size_36)), null, null, new j1l0(tsn0Var2, (byte) 28), new u5l0(tsn0Var2, cpVar2, b2), 12);
                textView7.setBreakStrategy(0);
                textView7.setText(((btn0) cpVar2.u()).j);
                textView6.setBreakStrategy(0);
                textView6.setText(((btn0) cpVar2.u()).k);
                u0d.j(tsn0Var.g, ((btn0) cpVar2.u()).f, R.drawable.no_photo, 0, null, null, null, 508);
                u0d.j(tsn0Var.o, ((btn0) cpVar2.u()).h, R.drawable.no_photo, 0, null, null, null, 508);
                u0d.j(tsn0Var.i, ((btn0) cpVar2.u()).g, R.drawable.no_photo, 0, null, null, null, 508);
                u0d.j(tsn0Var.q, ((btn0) cpVar2.u()).i, R.drawable.no_photo, 0, null, null, null, 508);
                tsn0Var.k.setText(((btn0) cpVar2.u()).n);
                textView5.setText(((btn0) cpVar2.u()).p);
                tsn0Var.n.setText(((btn0) cpVar2.u()).q);
                kj5 kj5Var2 = fzc.f10401a;
                fzc fzcVar2 = ((btn0) cpVar2.u()).v;
                kj5Var2.getClass();
                textView5.setTextColor(kj5.k(fzcVar2, context5));
                tsn0Var2.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                u0d.d(tsn0Var2.b, ((btn0) cpVar2.u()).r, null, null, 62);
                String str3 = ((btn0) cpVar2.u()).u;
                SportScore sportScore = ((tsn0) yfu0Var9).v;
                int length = str3.length();
                CharSequence text = str3;
                if (length == 0) {
                    text = context5.getText(R.string.vs);
                }
                sportScore.setText(text);
                ohm0.i(cpVar2, ((btn0) cpVar2.u()).t);
                tsn0Var2.l.setText(((btn0) cpVar2.u()).l);
                tsn0Var2.m.setText(((btn0) cpVar2.u()).m);
                ohm0.h(cpVar2, ((btn0) cpVar2.u()).s);
                return Unit.f46060a;
            case 7:
                List list10 = (List) obj;
                yfu0 yfu0Var10 = cpVar.u;
                list10.getClass();
                if (!list10.isEmpty()) {
                    ArrayList<gtn0> arrayList8 = new ArrayList();
                    for (Object obj9 : list10) {
                        obj9.getClass();
                        w3d.u(arrayList8, (Collection) obj9);
                    }
                    for (gtn0 gtn0Var : arrayList8) {
                        if (gtn0Var != null) {
                            if (gtn0Var instanceof ctn0) {
                                ((jtn0) yfu0Var10).f.setText(((ctn0) gtn0Var).f4947a);
                            } else if (gtn0Var instanceof etn0) {
                                ((jtn0) yfu0Var10).j.setText(((etn0) gtn0Var).f8384a);
                            } else if (gtn0Var instanceof ftn0) {
                                qim0.j(cpVar, (ftn0) gtn0Var);
                            } else if (gtn0Var instanceof dtn0) {
                                TextView textView8 = ((jtn0) yfu0Var10).f;
                                kj5 kj5Var3 = fzc.f10401a;
                                fzc fzcVar3 = ((dtn0) gtn0Var).f6665a;
                                Context context6 = cpVar.w;
                                kj5Var3.getClass();
                                textView8.setTextColor(kj5.k(fzcVar3, context6));
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                yfu0 yfu0Var11 = cpVar2.u;
                Context context7 = cpVar2.w;
                jtn0 jtn0Var = (jtn0) yfu0Var11;
                TextView textView9 = jtn0Var.e;
                TextView textView10 = jtn0Var.f;
                textView9.setText(((htn0) cpVar2.u()).b);
                jtn0Var.m.setText(((htn0) cpVar2.u()).c);
                jtn0 jtn0Var2 = (jtn0) yfu0Var11;
                List list11 = u0d.f34849a;
                u0d.s(cpVar2.w, ((htn0) cpVar2.u()).d, Integer.valueOf(context7.getResources().getDimensionPixelOffset(R.dimen.size_36)), null, null, new j1l0(jtn0Var2, b2), new itn0(jtn0Var2, cpVar2, b4), 12);
                jtn0Var.o.setText(((htn0) cpVar2.u()).f);
                jtn0Var.g.setText(((htn0) cpVar2.u()).i);
                textView10.setText(((htn0) cpVar2.u()).k);
                kj5 kj5Var4 = fzc.f10401a;
                fzc fzcVar4 = ((htn0) cpVar2.u()).o;
                kj5Var4.getClass();
                textView10.setTextColor(kj5.k(fzcVar4, context7));
                jtn0Var.j.setText(((htn0) cpVar2.u()).l);
                jtn0Var2.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                u0d.d(jtn0Var2.b, ((htn0) cpVar2.u()).m, null, null, 62);
                qim0.j(cpVar2, ((htn0) cpVar2.u()).n);
                jtn0Var2.h.setText(((htn0) cpVar2.u()).g);
                jtn0Var2.i.setText(((htn0) cpVar2.u()).h);
                return Unit.f46060a;
            case 8:
                List list12 = (List) obj;
                Context context8 = cpVar.w;
                yfu0 yfu0Var12 = cpVar.u;
                Context context9 = cpVar2.w;
                yfu0 yfu0Var13 = cpVar2.u;
                list12.getClass();
                if (!list12.isEmpty()) {
                    ArrayList<rtn0> arrayList9 = new ArrayList();
                    for (Object obj10 : list12) {
                        obj10.getClass();
                        w3d.u(arrayList9, (Collection) obj10);
                    }
                    for (rtn0 rtn0Var : arrayList9) {
                        if (rtn0Var != null) {
                            if (rtn0Var instanceof ltn0) {
                                ((ktn0) yfu0Var12).f.setText(((ltn0) rtn0Var).f20637a);
                            } else if (rtn0Var instanceof otn0) {
                                ((ktn0) yfu0Var12).m.setText(((otn0) rtn0Var).f25838a);
                            } else if (rtn0Var instanceof ntn0) {
                                dnm0.i(cpVar, ((ntn0) rtn0Var).f24110a);
                            } else if (rtn0Var instanceof qtn0) {
                                dnm0.j(cpVar, (qtn0) rtn0Var);
                            } else if (rtn0Var instanceof ptn0) {
                                String str4 = ((ptn0) rtn0Var).f27574a;
                                SportScore sportScore2 = ((ktn0) yfu0Var12).t;
                                int length2 = str4.length();
                                CharSequence text2 = str4;
                                if (length2 == 0) {
                                    text2 = context8.getText(R.string.vs);
                                }
                                sportScore2.setText(text2);
                            } else if (rtn0Var instanceof mtn0) {
                                TextView textView11 = ((ktn0) yfu0Var12).f;
                                kj5 kj5Var5 = fzc.f10401a;
                                fzc fzcVar5 = ((mtn0) rtn0Var).f22379a;
                                kj5Var5.getClass();
                                textView11.setTextColor(kj5.k(fzcVar5, context8));
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ktn0 ktn0Var = (ktn0) yfu0Var13;
                if (((stn0) cpVar2.u()).u) {
                    ktn0Var.t.setLayoutDirection(3);
                    ktn0Var.g.setLayoutDirection(3);
                    ktn0Var.n.setLayoutDirection(3);
                    ktn0Var.h.setLayoutDirection(3);
                    ktn0Var.o.setLayoutDirection(3);
                } else {
                    ktn0Var.t.setLayoutDirection(0);
                    ktn0Var.g.setLayoutDirection(0);
                    ktn0Var.n.setLayoutDirection(0);
                    ktn0Var.h.setLayoutDirection(0);
                    ktn0Var.o.setLayoutDirection(0);
                }
                TextView textView12 = ktn0Var.e;
                TextView textView13 = ktn0Var.f;
                TextView textView14 = ktn0Var.o;
                TextView textView15 = ktn0Var.h;
                textView12.setText(((stn0) cpVar2.u()).b);
                ktn0Var.r.setText(((stn0) cpVar2.u()).c);
                ktn0 ktn0Var2 = (ktn0) yfu0Var13;
                List list13 = u0d.f34849a;
                u0d.s(cpVar2.w, ((stn0) cpVar2.u()).d, Integer.valueOf(context9.getResources().getDimensionPixelOffset(R.dimen.size_36)), null, null, new ttn0(ktn0Var2, b4), new itn0(ktn0Var2, cpVar2, b3), 12);
                textView15.setBreakStrategy(0);
                textView15.setText(((stn0) cpVar2.u()).h);
                textView14.setBreakStrategy(0);
                textView14.setText(((stn0) cpVar2.u()).i);
                u0d.j(ktn0Var.g, ((stn0) cpVar2.u()).f, R.drawable.no_photo, 0, null, null, null, 508);
                u0d.j(ktn0Var.n, ((stn0) cpVar2.u()).g, R.drawable.no_photo, 0, null, null, null, 508);
                ktn0Var.j.setText(((stn0) cpVar2.u()).l);
                textView13.setText(((stn0) cpVar2.u()).n);
                kj5 kj5Var6 = fzc.f10401a;
                fzc fzcVar6 = ((stn0) cpVar2.u()).t;
                kj5Var6.getClass();
                textView13.setTextColor(kj5.k(fzcVar6, context9));
                ktn0Var.m.setText(((stn0) cpVar2.u()).o);
                ktn0Var2.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                u0d.d(ktn0Var2.b, ((stn0) cpVar2.u()).s, null, null, 62);
                ktn0Var2.k.setText(((stn0) cpVar2.u()).j);
                ktn0Var2.l.setText(((stn0) cpVar2.u()).k);
                dnm0.j(cpVar2, ((stn0) cpVar2.u()).q);
                dnm0.i(cpVar2, ((stn0) cpVar2.u()).p);
                String str5 = ((stn0) cpVar2.u()).r;
                SportScore sportScore3 = ((ktn0) yfu0Var13).t;
                int length3 = str5.length();
                CharSequence text3 = str5;
                if (length3 == 0) {
                    text3 = context9.getText(R.string.vs);
                }
                sportScore3.setText(text3);
                return Unit.f46060a;
            case 9:
                return a(obj);
            case 10:
                return b(obj);
            case 11:
                return c(obj);
            case 12:
                return g(obj);
            case 13:
                return h(obj);
            case 14:
                return i(obj);
            case 15:
                return l(obj);
            case 16:
                List list14 = (List) obj;
                list14.getClass();
                if (list14.isEmpty()) {
                    ((es6) cpVar2.u).b.setRotation(((npp0) cpVar2.u()).f23925a);
                } else {
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj11 : list14) {
                        obj11.getClass();
                        w3d.u(arrayList10, (Collection) obj11);
                    }
                    Iterator it2 = arrayList10.iterator();
                    while (it2.hasNext()) {
                        if (((mpp0) it2.next()) == null) {
                            t9f.b();
                            return null;
                        }
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((es6) cpVar.u).b, "rotation", ((npp0) cpVar.u()).f23925a);
                        objectAnimatorOfFloat.setDuration(300L);
                        objectAnimatorOfFloat.start();
                    }
                }
                return Unit.f46060a;
            case 17:
                return m(obj);
            case 18:
                return o(obj);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return p(obj);
            case 20:
                return r(obj);
            default:
                List list15 = (List) obj;
                list15.getClass();
                if (list15.isEmpty()) {
                    k1v0 k1v0Var = (k1v0) cpVar2.u();
                    zsx zsxVar = (zsx) cpVar2.u;
                    TextView textView16 = zsxVar.h;
                    String str6 = k1v0Var.f17548a;
                    boolean z = k1v0Var.j;
                    boolean z2 = k1v0Var.h;
                    boolean z3 = k1v0Var.f;
                    textView16.setText(str6);
                    Flow flow = zsxVar.d;
                    boolean z4 = k1v0Var.d;
                    flow.setVisibility(z4 ? 0 : 8);
                    zsxVar.f.setImageResource(k1v0Var.b);
                    if (z4) {
                        zsxVar.j.setText(k1v0Var.c);
                    }
                    zsxVar.e.setVisibility(z3 ? 0 : 8);
                    if (z3) {
                        zsxVar.k.setText(k1v0Var.e);
                    }
                    zsxVar.c.setVisibility(z2 ? 0 : 8);
                    if (z2) {
                        zsxVar.i.setText(k1v0Var.g);
                    }
                    zsxVar.b.setVisibility(z ? 0 : 8);
                    if (z) {
                        zsxVar.g.setText(k1v0Var.i);
                    }
                } else {
                    ArrayList<List> arrayList11 = new ArrayList();
                    for (Object obj12 : list15) {
                        obj12.getClass();
                        w3d.u(arrayList11, (Collection) obj12);
                    }
                    for (List list16 : arrayList11) {
                        ArrayList<tqa> arrayList12 = new ArrayList();
                        for (Object obj13 : list16) {
                            if (obj13 instanceof tqa) {
                                arrayList12.add(obj13);
                            }
                        }
                        for (tqa tqaVar : arrayList12) {
                            yfu0 yfu0Var14 = cpVar.u;
                            tqaVar.getClass();
                            if (tqaVar instanceof oqa) {
                                ((zsx) yfu0Var14).j.setText(((oqa) tqaVar).f25678a);
                            } else if (tqaVar instanceof rqa) {
                                ((zsx) yfu0Var14).k.setText(((rqa) tqaVar).f30922a);
                            } else if (tqaVar instanceof mqa) {
                                ((zsx) yfu0Var14).i.setText(((mqa) tqaVar).f22214a);
                            } else if (tqaVar instanceof kqa) {
                                ((zsx) yfu0Var14).g.setText(((kqa) tqaVar).f18712a);
                            } else if (tqaVar instanceof lqa) {
                                ((zsx) yfu0Var14).b.setVisibility(((lqa) tqaVar).f20477a ? 0 : 8);
                            } else if (tqaVar instanceof nqa) {
                                ((zsx) yfu0Var14).c.setVisibility(((nqa) tqaVar).f23949a ? 0 : 8);
                            } else if (tqaVar instanceof pqa) {
                                ((zsx) yfu0Var14).d.setVisibility(((pqa) tqaVar).f27406a ? 0 : 8);
                            } else if (tqaVar instanceof sqa) {
                                ((zsx) yfu0Var14).e.setVisibility(((sqa) tqaVar).f32618a ? 0 : 8);
                            } else {
                                if (!(tqaVar instanceof qqa)) {
                                    t9f.b();
                                    return null;
                                }
                                ((zsx) yfu0Var14).f.setImageResource(((qqa) tqaVar).f29156a);
                            }
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
