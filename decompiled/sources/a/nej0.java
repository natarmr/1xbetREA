package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.feed.topgamesbystat.presentation.params.TopGamesByStatBottomSheetScreenParams;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nej0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23389a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nej0(ocl oclVar, ctf0 ctf0Var, gst gstVar, xwl0 xwl0Var) {
        this.f23389a = (byte) 10;
        this.d = oclVar;
        this.b = ctf0Var;
        this.c = xwl0Var;
    }

    private final Object a(Object obj) {
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        a9q0 a9q0Var;
        a9q0 a9q0Var2;
        b9q0 b9q0Var;
        b9q0 b9q0Var2;
        a9q0 a9q0Var3;
        a9q0 a9q0Var4;
        b9q0 b9q0Var3;
        b9q0 b9q0Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        fck0 fck0Var;
        wjy wjyVar = (wjy) this.d;
        u6q0 u6q0Var = (u6q0) this.b;
        hie0 hie0Var = (hie0) this.c;
        z6q0 z6q0Var = (z6q0) obj;
        byte b = 4;
        byte b2 = 12;
        byte b3 = 1;
        byte b4 = 0;
        a8q0 a8q0Var = null;
        switch (wjyVar.ordinal()) {
            case 0:
                z6q0Var.e.f23154a = null;
                if (z6q0Var.g.b.length() > 0) {
                    if (!o9q0.c(z6q0Var.f)) {
                        boolean zF = z6q0Var.f();
                        long j = z6q0Var.f;
                        if (!zF) {
                            int iE = o9q0.e(j);
                            z6q0Var.q(iE, iE);
                        } else {
                            int iF = o9q0.f(j);
                            z6q0Var.q(iF, iF);
                        }
                    } else {
                        z6q0Var.i();
                    }
                }
                break;
            case 1:
                z6q0Var.e.f23154a = null;
                if (z6q0Var.g.b.length() > 0) {
                    if (!o9q0.c(z6q0Var.f)) {
                        boolean zF2 = z6q0Var.f();
                        long j2 = z6q0Var.f;
                        if (!zF2) {
                            int iF2 = o9q0.f(j2);
                            z6q0Var.q(iF2, iF2);
                        } else {
                            int iE2 = o9q0.e(j2);
                            z6q0Var.q(iE2, iE2);
                        }
                    } else {
                        z6q0Var.m();
                    }
                }
                break;
            case 2:
                n9q0 n9q0Var = z6q0Var.e;
                n9q0Var.f23154a = null;
                j83 j83Var = z6q0Var.g;
                String str = j83Var.b;
                String str2 = j83Var.b;
                if (str.length() > 0) {
                    if (!z6q0Var.f()) {
                        n9q0Var.f23154a = null;
                        if (str2.length() > 0 && (numE = z6q0Var.e()) != null) {
                            int iIntValue = numE.intValue();
                            z6q0Var.q(iIntValue, iIntValue);
                        }
                    } else {
                        n9q0Var.f23154a = null;
                        if (str2.length() > 0 && (numD = z6q0Var.d()) != null) {
                            int iIntValue2 = numD.intValue();
                            z6q0Var.q(iIntValue2, iIntValue2);
                        }
                    }
                }
                break;
            case 3:
                n9q0 n9q0Var2 = z6q0Var.e;
                n9q0Var2.f23154a = null;
                j83 j83Var2 = z6q0Var.g;
                String str3 = j83Var2.b;
                String str4 = j83Var2.b;
                if (str3.length() > 0) {
                    if (!z6q0Var.f()) {
                        n9q0Var2.f23154a = null;
                        if (str4.length() > 0 && (numD2 = z6q0Var.d()) != null) {
                            int iIntValue3 = numD2.intValue();
                            z6q0Var.q(iIntValue3, iIntValue3);
                        }
                    } else {
                        n9q0Var2.f23154a = null;
                        if (str4.length() > 0 && (numE2 = z6q0Var.e()) != null) {
                            int iIntValue4 = numE2.intValue();
                            z6q0Var.q(iIntValue4, iIntValue4);
                        }
                    }
                }
                break;
            case 4:
                z6q0Var.j();
                break;
            case 5:
                z6q0Var.l();
                break;
            case 6:
                z6q0Var.o();
                break;
            case 7:
                z6q0Var.n();
                break;
            case 8:
                z6q0Var.e.f23154a = null;
                if (z6q0Var.g.b.length() > 0) {
                    if (!z6q0Var.f()) {
                        z6q0Var.n();
                    } else {
                        z6q0Var.o();
                    }
                }
                break;
            case 9:
                z6q0Var.e.f23154a = null;
                if (z6q0Var.g.b.length() > 0) {
                    if (!z6q0Var.f()) {
                        z6q0Var.o();
                    } else {
                        z6q0Var.n();
                    }
                }
                break;
            case 10:
                if (z6q0Var.g.b.length() > 0 && (a9q0Var = z6q0Var.c) != null) {
                    int iG = z6q0Var.g(a9q0Var, -1);
                    z6q0Var.q(iG, iG);
                }
                break;
            case 11:
                if (z6q0Var.g.b.length() > 0 && (a9q0Var2 = z6q0Var.c) != null) {
                    int iG2 = z6q0Var.g(a9q0Var2, 1);
                    z6q0Var.q(iG2, iG2);
                }
                break;
            case 12:
            case 48:
                break;
            case 13:
                if (z6q0Var.g.b.length() > 0 && (b9q0Var = z6q0Var.i) != null) {
                    int iH = z6q0Var.h(b9q0Var, -1);
                    z6q0Var.q(iH, iH);
                }
                break;
            case 14:
                if (z6q0Var.g.b.length() > 0 && (b9q0Var2 = z6q0Var.i) != null) {
                    int iH2 = z6q0Var.h(b9q0Var2, 1);
                    z6q0Var.q(iH2, iH2);
                }
                break;
            case 15:
                z6q0Var.e.f23154a = null;
                if (z6q0Var.g.b.length() > 0) {
                    z6q0Var.q(0, 0);
                }
                break;
            case 16:
                z6q0Var.e.f23154a = null;
                j83 j83Var3 = z6q0Var.g;
                if (j83Var3.b.length() > 0) {
                    int length = j83Var3.b.length();
                    z6q0Var.q(length, length);
                }
                break;
            case 17:
                u6q0Var.b.a(false);
                break;
            case 18:
                u6q0Var.b.o();
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                u6q0Var.b.c();
                break;
            case 20:
                List listA = z6q0Var.a(new t6q0(b4));
                if (listA != null) {
                    u6q0Var.a(listA);
                }
                break;
            case 21:
                List listA2 = z6q0Var.a(new t6q0(b3));
                if (listA2 != null) {
                    u6q0Var.a(listA2);
                }
                break;
            case 22:
                List listA3 = z6q0Var.a(new t6q0((byte) 2));
                if (listA3 != null) {
                    u6q0Var.a(listA3);
                }
                break;
            case 23:
                List listA4 = z6q0Var.a(new t6q0((byte) 3));
                if (listA4 != null) {
                    u6q0Var.a(listA4);
                }
                break;
            case 24:
                List listA5 = z6q0Var.a(new t6q0(b));
                if (listA5 != null) {
                    u6q0Var.a(listA5);
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                List listA6 = z6q0Var.a(new t6q0((byte) 5));
                if (listA6 != null) {
                    u6q0Var.a(listA6);
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                z6q0Var.e.f23154a = null;
                j83 j83Var4 = z6q0Var.g;
                if (j83Var4.b.length() > 0) {
                    z6q0Var.q(0, j83Var4.b.length());
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                z6q0Var.i();
                z6q0Var.p();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                z6q0Var.m();
                z6q0Var.p();
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                if (z6q0Var.g.b.length() > 0 && (a9q0Var3 = z6q0Var.c) != null) {
                    int iG3 = z6q0Var.g(a9q0Var3, -1);
                    z6q0Var.q(iG3, iG3);
                }
                z6q0Var.p();
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                if (z6q0Var.g.b.length() > 0 && (a9q0Var4 = z6q0Var.c) != null) {
                    int iG4 = z6q0Var.g(a9q0Var4, 1);
                    z6q0Var.q(iG4, iG4);
                }
                z6q0Var.p();
                break;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                if (z6q0Var.g.b.length() > 0 && (b9q0Var3 = z6q0Var.i) != null) {
                    int iH3 = z6q0Var.h(b9q0Var3, -1);
                    z6q0Var.q(iH3, iH3);
                }
                z6q0Var.p();
                break;
            case 32:
                if (z6q0Var.g.b.length() > 0 && (b9q0Var4 = z6q0Var.i) != null) {
                    int iH4 = z6q0Var.h(b9q0Var4, 1);
                    z6q0Var.q(iH4, iH4);
                }
                z6q0Var.p();
                break;
            case 33:
                z6q0Var.e.f23154a = null;
                if (z6q0Var.g.b.length() > 0) {
                    z6q0Var.q(0, 0);
                }
                z6q0Var.p();
                break;
            case 34:
                z6q0Var.e.f23154a = null;
                j83 j83Var5 = z6q0Var.g;
                if (j83Var5.b.length() > 0) {
                    int length2 = j83Var5.b.length();
                    z6q0Var.q(length2, length2);
                }
                z6q0Var.p();
                break;
            case 35:
                n9q0 n9q0Var3 = z6q0Var.e;
                n9q0Var3.f23154a = null;
                j83 j83Var6 = z6q0Var.g;
                String str5 = j83Var6.b;
                String str6 = j83Var6.b;
                if (str5.length() > 0) {
                    if (z6q0Var.f()) {
                        n9q0Var3.f23154a = null;
                        if (str6.length() > 0 && (numE3 = z6q0Var.e()) != null) {
                            int iIntValue5 = numE3.intValue();
                            z6q0Var.q(iIntValue5, iIntValue5);
                        }
                    } else {
                        n9q0Var3.f23154a = null;
                        if (str6.length() > 0 && (numD3 = z6q0Var.d()) != null) {
                            int iIntValue6 = numD3.intValue();
                            z6q0Var.q(iIntValue6, iIntValue6);
                        }
                    }
                }
                z6q0Var.p();
                break;
            case 36:
                n9q0 n9q0Var4 = z6q0Var.e;
                n9q0Var4.f23154a = null;
                j83 j83Var7 = z6q0Var.g;
                String str7 = j83Var7.b;
                String str8 = j83Var7.b;
                if (str7.length() > 0) {
                    if (z6q0Var.f()) {
                        n9q0Var4.f23154a = null;
                        if (str8.length() > 0 && (numD4 = z6q0Var.d()) != null) {
                            int iIntValue7 = numD4.intValue();
                            z6q0Var.q(iIntValue7, iIntValue7);
                        }
                    } else {
                        n9q0Var4.f23154a = null;
                        if (str8.length() > 0 && (numE4 = z6q0Var.e()) != null) {
                            int iIntValue8 = numE4.intValue();
                            z6q0Var.q(iIntValue8, iIntValue8);
                        }
                    }
                }
                z6q0Var.p();
                break;
            case 37:
                z6q0Var.j();
                z6q0Var.p();
                break;
            case 38:
                z6q0Var.l();
                z6q0Var.p();
                break;
            case 39:
                z6q0Var.o();
                z6q0Var.p();
                break;
            case 40:
                z6q0Var.n();
                z6q0Var.p();
                break;
            case 41:
                z6q0Var.e.f23154a = null;
                if (z6q0Var.g.b.length() > 0) {
                    if (z6q0Var.f()) {
                        z6q0Var.o();
                    } else {
                        z6q0Var.n();
                    }
                }
                z6q0Var.p();
                break;
            case 42:
                z6q0Var.e.f23154a = null;
                if (z6q0Var.g.b.length() > 0) {
                    if (z6q0Var.f()) {
                        z6q0Var.n();
                    } else {
                        z6q0Var.o();
                    }
                }
                z6q0Var.p();
                break;
            case 43:
                z6q0Var.e.f23154a = null;
                if (z6q0Var.g.b.length() > 0) {
                    long j3 = z6q0Var.f;
                    int i = o9q0.c;
                    int i2 = (int) (j3 & 4294967295L);
                    z6q0Var.q(i2, i2);
                }
                break;
            case 44:
                if (!u6q0Var.e) {
                    u6q0Var.a(kotlin.collections.a.c(new l8d(Separators.RETURN, 1)));
                } else {
                    hie0Var.f13108a = u6q0Var.f35150a.x.b.r.b(u6q0Var.k);
                }
                break;
            case 45:
                if (!u6q0Var.e) {
                    u6q0Var.a(kotlin.collections.a.c(new l8d(Separators.HT, 1)));
                } else {
                    hie0Var.f13108a = false;
                }
                break;
            case 46:
                u6q0Var.h.a(a8q0.a(z6q0Var.h, z6q0Var.g, z6q0Var.f, 4));
                q7t0 q7t0Var = u6q0Var.h;
                fck0 fck0Var2 = q7t0Var.f28267a;
                if (fck0Var2 != null && (fck0Var = (fck0) fck0Var2.b) != null) {
                    q7t0Var.f28267a = fck0Var;
                    q7t0Var.c -= ((a8q0) fck0Var2.c).f440a.b.length();
                    q7t0Var.b = new fck0(q7t0Var.b, (a8q0) fck0Var2.c, b2);
                    a8q0Var = (a8q0) fck0Var.c;
                }
                if (a8q0Var != null) {
                    u6q0Var.j.invoke(a8q0Var);
                }
                break;
            case 47:
                q7t0 q7t0Var2 = u6q0Var.h;
                fck0 fck0Var3 = q7t0Var2.b;
                if (fck0Var3 != null) {
                    q7t0Var2.b = (fck0) fck0Var3.b;
                    a8q0 a8q0Var2 = (a8q0) fck0Var3.c;
                    q7t0Var2.f28267a = new fck0(q7t0Var2.f28267a, a8q0Var2, b2);
                    q7t0Var2.c = a8q0Var2.f440a.b.length() + q7t0Var2.c;
                    a8q0Var = (a8q0) fck0Var3.c;
                }
                if (a8q0Var != null) {
                    u6q0Var.j.invoke(a8q0Var);
                }
                break;
            default:
                t9f.b();
                return null;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object b(Object obj) {
        Object next;
        j6j j6jVarA;
        Object next2;
        iku0 iku0VarB;
        Object next3;
        iku0 iku0VarA;
        cp cpVar = (cp) this.d;
        z6e z6eVar = (z6e) this.b;
        z6e z6eVar2 = (z6e) this.c;
        ((List) obj).getClass();
        yfu0 yfu0Var = cpVar.u;
        c3k c3kVar = (c3k) yfu0Var;
        c3kVar.g.setText(((ude0) cpVar.u()).k.b);
        List list = u0d.f34849a;
        u0d.j(c3kVar.c, ((ude0) cpVar.u()).k.d, ((ude0) cpVar.u()).k.c, 0, kotlin.collections.a.c(g2x.f10583a), null, null, 492);
        c3k c3kVar2 = (c3k) yfu0Var;
        Group group = c3kVar2.f;
        rlf0 rlf0Var = ((ude0) cpVar.u()).b;
        plf0 plf0Var = plf0.f27180a;
        group.setVisibility(!rlf0Var.equals(plf0Var) ? 0 : 8);
        FrameLayout frameLayout = c3kVar2.e;
        rlf0 rlf0Var2 = ((ude0) cpVar.u()).b;
        Iterator it = pgi0.t(new ihu0(frameLayout)).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
        if (rlf0Var2 instanceof nlf0) {
            nlf0 nlf0Var = (nlf0) rlf0Var2;
            Iterator it2 = new ihu0(frameLayout).iterator();
            do {
                jhu0 jhu0Var = (jhu0) it2;
                if (!jhu0Var.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = jhu0Var.next();
            } while (!(((View) next3).getTag() instanceof nlf0));
            View view = (View) next3;
            if (view != null) {
                view.setVisibility(0);
                iku0VarA = iku0.a(view);
            } else {
                iku0 iku0VarA2 = iku0.a(LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.view_reply_document_message, (ViewGroup) null, false));
                ConstraintLayout constraintLayout = iku0VarA2.b;
                ShapeableImageView shapeableImageView = iku0VarA2.c;
                daf dafVarL = shapeableImageView.getShapeAppearanceModel().l();
                dafVarL.S(sj3.X(8));
                shapeableImageView.setShapeAppearanceModel(dafVarL.c());
                constraintLayout.setTag(nlf0Var);
                frameLayout.addView(constraintLayout);
                iku0VarA = iku0VarA2;
            }
            iku0VarA.e.setText(nlf0Var.b);
            iku0VarA.f.setText(nlf0Var.c);
            iku0VarA.d.setVisibility(nlf0Var.d ? 0 : 8);
        } else if (rlf0Var2 instanceof olf0) {
            olf0 olf0Var = (olf0) rlf0Var2;
            Iterator it3 = new ihu0(frameLayout).iterator();
            do {
                jhu0 jhu0Var2 = (jhu0) it3;
                if (!jhu0Var2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = jhu0Var2.next();
            } while (!(((View) next2).getTag() instanceof olf0));
            View view2 = (View) next2;
            if (view2 != null) {
                view2.setVisibility(0);
                iku0VarB = iku0.b(view2);
            } else {
                iku0 iku0VarB2 = iku0.b(LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.view_reply_image_message, (ViewGroup) null, false));
                ConstraintLayout constraintLayout2 = iku0VarB2.b;
                ShapeableImageView shapeableImageView2 = iku0VarB2.c;
                daf dafVarL2 = shapeableImageView2.getShapeAppearanceModel().l();
                dafVarL2.S(sj3.X(8));
                shapeableImageView2.setShapeAppearanceModel(dafVarL2.c());
                constraintLayout2.setTag(olf0Var);
                frameLayout.addView(constraintLayout2);
                iku0VarB = iku0VarB2;
            }
            iku0VarB.e.setText(olf0Var.d);
            iku0VarB.f.setText(olf0Var.e);
            iku0VarB.d.setVisibility(olf0Var.f ? 0 : 8);
            List list2 = u0d.f34849a;
            u0d.g(iku0VarB.c, olf0Var.c, null, olf0Var.b, 2);
        } else if (rlf0Var2 instanceof qlf0) {
            qlf0 qlf0Var = (qlf0) rlf0Var2;
            Iterator it4 = new ihu0(frameLayout).iterator();
            do {
                jhu0 jhu0Var3 = (jhu0) it4;
                if (!jhu0Var3.hasNext()) {
                    next = null;
                    break;
                }
                next = jhu0Var3.next();
            } while (!(((View) next).getTag() instanceof qlf0));
            View view3 = (View) next;
            if (view3 != null) {
                view3.setVisibility(0);
                j6jVarA = j6j.a(view3);
            } else {
                j6j j6jVarA2 = j6j.a(LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.view_reply_text_message, (ViewGroup) null, false));
                ConstraintLayout constraintLayout3 = j6jVarA2.b;
                constraintLayout3.setTag(qlf0Var);
                frameLayout.addView(constraintLayout3);
                j6jVarA = j6jVarA2;
            }
            j6jVarA.c.setText(qlf0Var.b);
            j6jVarA.d.setText(qlf0Var.c);
            j6jVarA.e.setVisibility(qlf0Var.d ? 0 : 8);
        } else if (!rlf0Var2.equals(plf0Var)) {
            t9f.b();
            return null;
        }
        FixedSelectionTextView fixedSelectionTextView = c3kVar2.i;
        TextView textView = c3kVar2.j;
        fixedSelectionTextView.setVisibility(((ude0) cpVar.u()).c ? 0 : 8);
        fixedSelectionTextView.setText(((ude0) cpVar.u()).d);
        piq piqVar = piq.f27055a;
        if (piqVar == null) {
            piqVar = new piq();
            piq.f27055a = piqVar;
        }
        fixedSelectionTextView.setMovementMethod(piqVar);
        textView.setVisibility(((ude0) cpVar.u()).h ? 0 : 8);
        ude0 ude0Var = (ude0) cpVar.u();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        for (Object obj2 : ude0Var.j) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            uhg0 uhg0Var = (uhg0) obj2;
            if (i != 0) {
                spannableStringBuilder.append((CharSequence) Separators.RETURN);
            }
            SpannableString spannableString = new SpannableString(uhg0Var.c);
            spannableString.setSpan(new q9q0(z6eVar, uhg0Var), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            i = i2;
        }
        textView.setText(spannableStringBuilder);
        piq piqVar2 = piq.f27055a;
        if (piqVar2 == null) {
            piqVar2 = new piq();
            piq.f27055a = piqVar2;
        }
        textView.setMovementMethod(piqVar2);
        LinearLayout linearLayout = c3kVar2.b;
        ude0 ude0Var2 = (ude0) cpVar.u();
        linearLayout.removeAllViews();
        List list3 = ude0Var2.i;
        linearLayout.setVisibility(!list3.isEmpty() ? 0 : 8);
        int i3 = 0;
        for (Object obj3 : list3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            ne9 ne9Var = (ne9) obj3;
            MaterialButton materialButton = new MaterialButton(linearLayout.getContext());
            materialButton.setTextAppearance(R.style.TextAppearance_Headline_Medium);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, sj3.X(40));
            if (i3 < list3.size() - 1) {
                layoutParams.setMargins(0, 0, 0, sj3.X(8));
            }
            materialButton.setLayoutParams(layoutParams);
            materialButton.setLetterSpacing(0.0f);
            materialButton.setInsetTop(0);
            materialButton.setInsetBottom(0);
            materialButton.setTextSize(16.0f);
            materialButton.setMaxLines(1);
            materialButton.setEllipsize(TextUtils.TruncateAt.END);
            String strConcat = ne9Var.c;
            strConcat.getClass();
            if (strConcat.length() > 27) {
                strConcat = strConcat.substring(0, 24).concat("...");
            }
            materialButton.setText(strConcat);
            TypedValue typedValue = j5d.f15927a;
            Context context = linearLayout.getContext();
            context.getClass();
            materialButton.setTextColor(j5d.a(context, R.attr.uikitSecondaryButtonForeground, false));
            materialButton.setStateListAnimator(null);
            Context context2 = linearLayout.getContext();
            context2.getClass();
            materialButton.setBackgroundTintList(ColorStateList.valueOf(j5d.a(context2, R.attr.uikitSecondaryButtonBackground, false)));
            materialButton.setCornerRadius(sj3.X(10));
            materialButton.setOnClickListener(new bs50((Object) z6eVar2, (Object) ne9Var, (byte) 15));
            linearLayout.addView(materialButton);
            i3 = i4;
        }
        c3kVar2.h.setVisibility(((ude0) cpVar.u()).g ? 0 : 8);
        TextView textView2 = c3kVar2.k;
        rdj rdjVar = rdj.f30294a;
        textView2.setText(rdj.h(new ynq0(((ude0) cpVar.u()).f.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar.f40887a.getContext())), null, 248));
        return Unit.f46060a;
    }

    private final Object c(Object obj) {
        Fragment fragment = (Fragment) this.d;
        vxi vxiVar = (vxi) this.b;
        k3t0 k3t0Var = (k3t0) this.c;
        flb0 flb0Var = (flb0) obj;
        flb0Var.getClass();
        rek0 rek0Var = rek0.b;
        if (flb0Var.equals(zkb0.f44524a)) {
            j120.Y(fragment);
        } else if (flb0Var instanceof dlb0) {
            wdk0.k(vxiVar.B, new xdk0(rek0Var, ((dlb0) flb0Var).f6271a, null, null, null, null, 124), fragment, null, null, false, null, 1020);
        } else if (flb0Var instanceof blb0) {
            dq00 dq00VarR = ((nc0) vxiVar.n.b).r();
            ggj ggjVar = ((blb0) flb0Var).f2788a;
            ebh ebhVar = new ebh(k3t0Var, (byte) 9);
            fragment.getClass();
            a8z a8zVarA = maz.a(wez.b, new yxf0(new yxf0(fragment, (byte) 18), (byte) 19));
            kiu0 kiu0VarG = agc.G(fragment, sre0.f32672a.b(pgj.class), new fxf0(a8zVarA, (byte) 20), new fxf0(a8zVarA, (byte) 21), new sue0(fragment, a8zVarA, (byte) 11));
            if (ggjVar instanceof egj) {
                pgj pgjVar = (pgj) kiu0VarG.getValue();
                bhj bhjVar = ((egj) ggjVar).f7769a;
                p7m0 p7m0Var = pgjVar.b;
                p7m0Var.getClass();
                p7m0Var.o(null, bhjVar);
                androidx.fragment.app.e eVarC = fragment.C();
                eVarC.getClass();
                ngj.n2.getClass();
                if (eVarC.J("DayExpressDetailBottomSheetFragment") == null) {
                    new ngj().H0(eVarC, "DayExpressDetailBottomSheetFragment");
                }
            } else if (ggjVar.equals(fgj.f9495a)) {
                wdk0 wdk0Var = (wdk0) dq00VarR.b;
                qek0 qek0Var = qek0.f28589a;
                String strH = fragment.H(R.string.express_added_coupon);
                strH.getClass();
                String strH2 = fragment.H(R.string.coupon);
                strH2.getClass();
                wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, new hdk0(strH2, new a7g0(ebhVar, (byte) 15)), jtv.x, null, 100), fragment, null, null, false, null, 1020);
            } else {
                if (!ggjVar.equals(fgj.b)) {
                    t9f.b();
                    return null;
                }
                ii iiVar = (ii) dq00VarR.c;
                String strH3 = fragment.H(R.string.coupon_has_items);
                String strH4 = fragment.H(R.string.coupon_has_items_message);
                String strH5 = fragment.H(R.string.ok_new);
                strH5.getClass();
                ua80.r(fragment, iiVar, new DialogFields((CharSequence) strH3, (CharSequence) strH4, (CharSequence) strH5, fragment.H(R.string.cancel), (String) null, "REQUEST_EXPRESS_DIALOG_EXPRESS", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488));
            }
        } else if (flb0Var instanceof clb0) {
            wdk0.k(vxiVar.B, new xdk0(rek0Var, ((clb0) flb0Var).f4550a.f5512a, null, null, null, null, 124), fragment, null, null, false, null, 1020);
        } else if (flb0Var instanceof alb0) {
            ujd ujdVarD = vxiVar.p.d();
            x1x.x(ujdVarD);
            ujdVarD.b(fragment, ((alb0) flb0Var).f1061a);
        } else {
            if (!(flb0Var instanceof elb0)) {
                t9f.b();
                return null;
            }
            TopGamesByStatBottomSheetScreenParams topGamesByStatBottomSheetScreenParams = ((elb0) flb0Var).f7988a;
            androidx.fragment.app.e eVarC2 = fragment.C();
            eVarC2.getClass();
            List listP = eVarC2.c.p();
            listP.getClass();
            if (listP.isEmpty()) {
                b5r0.t2.getClass();
                j6m0.f(eVarC2, topGamesByStatBottomSheetScreenParams);
            } else {
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    if (((Fragment) it.next()) instanceof sik) {
                    }
                }
                b5r0.t2.getClass();
                j6m0.f(eVarC2, topGamesByStatBottomSheetScreenParams);
            }
        }
        k3t0Var.x(akb0.f1015a);
        return Unit.f46060a;
    }

    private final Object g(Object obj) {
        List list = (List) this.d;
        skb0 skb0Var = (skb0) this.b;
        Function1 function1 = (Function1) this.c;
        hcz hczVar = (hcz) obj;
        hczVar.getClass();
        hczVar.f(list.size(), new zcn0(new t9r0((byte) 5), list, (byte) 26), new zcn0(new t9r0((byte) 6), list, (byte) 27), new ugd(802480018, true, new zip0(list, skb0Var, function1, (byte) 2)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0446  */
    /* JADX WARN: Code duplicated, block: B:130:0x0469 A[LOOP:2: B:128:0x0463->B:130:0x0469, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x047b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0480  */
    /* JADX WARN: Code duplicated, block: B:135:0x0484  */
    /* JADX WARN: Code duplicated, block: B:136:0x0489  */
    /* JADX WARN: Code duplicated, block: B:139:0x049d  */
    /* JADX WARN: Code duplicated, block: B:140:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:142:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:143:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:146:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:147:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:167:0x0578  */
    /* JADX WARN: Code duplicated, block: B:171:0x059b A[LOOP:5: B:169:0x0595->B:171:0x059b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:174:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:176:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:177:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:180:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:181:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:183:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:184:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:187:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:188:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v28, types: [a.i83] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v127 */
    /* JADX WARN: Type inference failed for: r1v132 */
    /* JADX WARN: Type inference failed for: r1v138 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r2v14, types: [a.zuh] */
    /* JADX WARN: Type inference failed for: r7v4, types: [a.e3j] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v14 java.lang.Object, still in use, count: 2, list:
          (r9v14 java.lang.Object) from 0x0534: PHI (r9 I:??) = (r9v11 java.lang.Object), (r9v14 java.lang.Object) binds: [B:160:0x0533, B:384:0x0534] A[DONT_GENERATE, DONT_INLINE]
          (r9v14 java.lang.Object) from 0x052a: CHECK_CAST (a.lok0) (r9v14 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 3308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nej0.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ nej0(Object obj, Object obj2, Object obj3, byte b) {
        this.f23389a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
