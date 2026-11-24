package a;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.consultantchat.presentation.dialogs.rate.model.RatingModel;
import org.xplatform.consultantchat.presentation.views.MiddleMultilineTextView;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d7e extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7e(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
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
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Window window;
        bby bbyVar;
        Fragment dcgVar;
        Fragment fragment;
        nz40 nz40VarC;
        byte b = this.h;
        byte b2 = 10;
        int i = 8;
        byte b3 = 1;
        byte b4 = 0;
        Object obj3 = this.f41192a;
        switch (b) {
            case 0:
                a2c a2cVar = (a2c) obj;
                e7e e7eVar = (e7e) obj3;
                kwd kwdVar = e7e.d2;
                e7eVar.getClass();
                if (Intrinsics.d(a2cVar, w1c.f38392a)) {
                    ii iiVar = e7eVar.M1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = e7eVar.H(R.string.error);
                    String strH2 = e7eVar.H(R.string.something_went_wrong);
                    String strH3 = e7eVar.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = e7eVar.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (a2cVar instanceof y1c) {
                    String strN = ahb.N(e7eVar.o0(), ((y1c) a2cVar).f41848a);
                    ii iiVar2 = e7eVar.M1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = e7eVar.H(R.string.error);
                    String strH5 = e7eVar.H(R.string.file_size_exceeds_limit);
                    strH5.getClass();
                    String str = String.format(strH5, Arrays.copyOf(new Object[]{strN}, 1));
                    String strH6 = e7eVar.H(R.string.ok_new);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC2 = e7eVar.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                } else if (a2cVar instanceof z1c) {
                    ii iiVar3 = e7eVar.M1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH7 = e7eVar.H(R.string.error);
                    String strH8 = e7eVar.H(R.string.unsupported_file_type);
                    String strH9 = e7eVar.H(R.string.ok_new);
                    strH9.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC3 = e7eVar.C();
                    eVarC3.getClass();
                    iiVar3.d(dialogFields3, eVarC3);
                } else if (!Intrinsics.d(a2cVar, x1c.f40116a)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 1:
                p9e p9eVar = (p9e) obj;
                e7e e7eVar2 = (e7e) obj3;
                kwd kwdVar2 = e7e.d2;
                boolean z = p9eVar instanceof n9e;
                if (!z) {
                    e7eVar2.G0().A(iun.f15405a);
                }
                e7eVar2.H0().r.setVisibility(p9eVar instanceof o9e ? 0 : 8);
                e7eVar2.H0().p.setVisibility(p9eVar instanceof m9e ? 0 : 8);
                e7eVar2.H0().e.setVisibility(p9eVar instanceof l9e ? 0 : 8);
                e7eVar2.H0().t.setVisibility(z ? 0 : 8);
                ConstraintLayout constraintLayout = e7eVar2.H0().q;
                if (z && ((n9e) p9eVar).f23135a.isEmpty()) {
                    i = 0;
                }
                constraintLayout.setVisibility(i);
                if (p9eVar != null) {
                    if (p9eVar instanceof n9e) {
                        d6e d6eVarG0 = e7eVar2.G0();
                        ArrayList arrayList = ((n9e) p9eVar).f23135a;
                        d6eVarG0.A(arrayList);
                        if (arrayList.isEmpty()) {
                            kzq kzqVarH0 = e7eVar2.H0();
                            kzqVarH0.h.setImageDrawable(e7eVar2.o0().getDrawable(R.drawable.ic_support_chat_no_messages));
                            kzqVarH0.w.setText(e7eVar2.H(R.string.rate_consultant_no_messages_text));
                        }
                    } else if (p9eVar instanceof m9e) {
                        j120.Y(e7eVar2);
                        e7eVar2.H0().p.v(((m9e) p9eVar).f21406a);
                    } else if (!(p9eVar instanceof o9e)) {
                        if (p9eVar instanceof l9e) {
                            j120.Y(e7eVar2);
                            kzq kzqVarH1 = e7eVar2.H0();
                            l9e l9eVar = (l9e) p9eVar;
                            kzqVarH1.g.setImageDrawable(e7eVar2.o0().getDrawable(R.drawable.ic_service_chat));
                            kzqVarH1.v.setText(l9eVar.f19647a);
                            kzqVarH1.u.setText(l9eVar.b);
                        }
                    }
                    kxq kxqVarB = e7eVar2.B();
                    if (kxqVarB != null && (window = kxqVarB.getWindow()) != null) {
                        int i2 = R.attr.uikitBackgroundContent;
                        etm0.j(R.attr.uikitBackgroundContent, e7eVar2);
                        Context contextO0 = e7eVar2.o0();
                        if (!z) {
                            i2 = R.attr.uikitBackground;
                        }
                        ofm0.y(window, contextO0, R.attr.uikitBackgroundContent, i2, !qem0.r(e7eVar2.D()), !qem0.r(e7eVar2.D()));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 2:
                k9e k9eVar = (k9e) obj;
                e7e e7eVar3 = (e7e) obj3;
                kwd kwdVar3 = e7e.d2;
                Handler handler = e7eVar3.S1;
                if (!e7eVar3.a2) {
                    if (k9eVar instanceof g9e) {
                        long j = ((g9e) k9eVar).f10910a ? 400L : 100L;
                        handler.removeCallbacks(e7eVar3.b2);
                        u6e u6eVar = new u6e(e7eVar3, b4);
                        e7eVar3.b2 = u6eVar;
                        handler.postDelayed(u6eVar, j);
                    } else if (k9eVar instanceof i9e) {
                        int i3 = ((i9e) k9eVar).f14381a;
                        RecyclerView recyclerView = e7eVar3.H0().o;
                        handler.removeCallbacks(e7eVar3.b2);
                        e7eVar3.a2 = true;
                        f58 f58Var = new f58((Object) recyclerView, i3, (Object) e7eVar3, (byte) 5);
                        e7eVar3.b2 = f58Var;
                        handler.postDelayed(f58Var, 50L);
                    } else if (k9eVar instanceof h9e) {
                        int i4 = ((h9e) k9eVar).f12671a;
                        kzq kzqVarH2 = e7eVar3.H0();
                        ImageView imageView = kzqVarH2.c;
                        TextView textView = kzqVarH2.z;
                        RecyclerView recyclerView2 = kzqVarH2.o;
                        handler.removeCallbacks(e7eVar3.b2);
                        e7eVar3.a2 = true;
                        v6e v6eVar = new v6e(recyclerView2, i4, e7eVar3, imageView, textView);
                        e7eVar3.b2 = v6eVar;
                        handler.postDelayed(v6eVar, 50L);
                    } else {
                        if (!Intrinsics.d(k9eVar, j9e.f16133a)) {
                            t9f.b();
                            return null;
                        }
                        RecyclerView recyclerView3 = e7eVar3.H0().o;
                        d6e d6eVarG1 = e7eVar3.G0();
                        if (d6eVarG1.d() - 4 <= e7eVar3.I0()) {
                            recyclerView3.B0(d6eVarG1.d() - 1);
                        }
                    }
                }
                return Unit.f46060a;
            case 3:
                v9e v9eVar = (v9e) obj;
                e7e e7eVar4 = (e7e) obj3;
                kwd kwdVar4 = e7e.d2;
                if (v9eVar instanceof t9e) {
                    e7eVar4.H0().A.setVisibility(0);
                    e7eVar4.H0().k.setVisibility(0);
                    Drawable drawable = e7eVar4.H0().k.getDrawable();
                    AnimationDrawable animationDrawable = drawable instanceof AnimationDrawable ? (AnimationDrawable) drawable : null;
                    if (animationDrawable != null) {
                        animationDrawable.start();
                    }
                } else {
                    e7eVar4.getClass();
                    if (!Intrinsics.d(v9eVar, u9e.f35280a)) {
                        t9f.b();
                        return null;
                    }
                    e7eVar4.H0().A.setVisibility(8);
                    e7eVar4.H0().k.setVisibility(8);
                }
                return Unit.f46060a;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                kwd kwdVar5 = e7e.d2;
                ((e7e) obj3).H0().y.setVisibility(zBooleanValue ? 0 : 8);
                return Unit.f46060a;
            case 5:
                int iIntValue = ((Number) obj).intValue();
                e7e e7eVar5 = (e7e) obj3;
                kwd kwdVar6 = e7e.d2;
                e7eVar5.H0().z.setVisibility(((iIntValue <= 0 || e7eVar5.H0().c.getVisibility() != 0) ? (byte) 0 : (byte) 1) != 0 ? 0 : 8);
                e7eVar5.H0().z.setText(iIntValue > 0 ? String.valueOf(iIntValue) : "");
                return Unit.f46060a;
            case 6:
                p6e p6eVar = (p6e) obj;
                e7e e7eVar6 = (e7e) obj3;
                kwd kwdVar7 = e7e.d2;
                e7eVar6.getClass();
                rek0 rek0Var = rek0.b;
                if (p6eVar instanceof h6e) {
                    h6e h6eVar = (h6e) p6eVar;
                    File file = h6eVar.f12525a;
                    String str2 = h6eVar.b;
                    Intent intent = new Intent();
                    intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                    intent.addFlags(1);
                    intent.setDataAndType(FileProvider.c(e7eVar6.o0(), file, e7eVar6.o0().getApplicationContext().getPackageName() + ".provider"), str2);
                    try {
                        e7eVar6.w0(intent);
                    } catch (Throwable unused) {
                        wdk0 wdk0Var = e7eVar6.N1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        String strH10 = e7eVar6.H(R.string.intent_app_not_installed);
                        strH10.getClass();
                        wdk0.k(wdk0Var, new xdk0(rek0Var, strH10, null, null, null, null, 124), e7eVar6, null, null, false, null, 1020);
                    }
                    break;
                } else if (p6eVar instanceof l6e) {
                    ArrayList arrayList2 = ((l6e) p6eVar).f19503a;
                    j120.Y(e7eVar6);
                    qud qudVar = lbe.g2;
                    androidx.fragment.app.e eVarC4 = e7eVar6.C();
                    eVarC4.getClass();
                    qudVar.getClass();
                    lbe lbeVar = new lbe();
                    lbeVar.f2.D(lbeVar, lbe.h2[1], arrayList2);
                    lbeVar.H0(eVarC4, "send_message_error");
                } else if (p6eVar instanceof i6e) {
                    RatingModel ratingModel = ((i6e) p6eVar).f14236a;
                    j120.Y(e7eVar6);
                    Handler handler2 = e7eVar6.S1;
                    handler2.removeCallbacks(e7eVar6.Z1);
                    a4e a4eVar = new a4e(e7eVar6, ratingModel, b3);
                    e7eVar6.Z1 = a4eVar;
                    handler2.postDelayed(a4eVar, 350L);
                } else if (p6eVar instanceof n6e) {
                    ii iiVar4 = e7eVar6.M1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH11 = e7eVar6.H(R.string.error);
                    String strH12 = e7eVar6.H(R.string.consultant_limit_attached_files_exceeded_text);
                    strH12.getClass();
                    String str3 = String.format(strH12, Arrays.copyOf(new Object[]{10}, 1));
                    String strH13 = e7eVar6.H(R.string.ok_new);
                    strH13.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH11, (CharSequence) str3, (CharSequence) strH13, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC5 = e7eVar6.C();
                    eVarC5.getClass();
                    iiVar4.d(dialogFields4, eVarC5);
                } else if (p6eVar instanceof k6e) {
                    ndk0 ndk0Var = e7eVar6.Q1;
                    if (ndk0Var != null) {
                        ndk0Var.dismiss();
                    }
                    wdk0 wdk0Var2 = e7eVar6.N1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    e7eVar6.Q1 = wdk0.k(wdk0Var2, new xdk0(pek0.f26859a, ((k6e) p6eVar).f17764a, null, null, null, null, 124), e7eVar6, null, null, false, Integer.valueOf(R.dimen.space_72), 476);
                } else if (Intrinsics.d(p6eVar, j6e.f15980a)) {
                    try {
                        ((Ringtone) e7eVar6.R1.getValue()).play();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                } else if (p6eVar instanceof m6e) {
                    wdk0 wdk0Var3 = e7eVar6.N1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var3, new xdk0(rek0Var, ((m6e) p6eVar).f21265a, null, null, null, null, 124), e7eVar6, null, null, false, null, 1020);
                } else if (Intrinsics.d(p6eVar, o6e.f24730a)) {
                    ImageView imageView2 = e7eVar6.H0().c;
                    TextView textView2 = e7eVar6.H0().z;
                    RecyclerView recyclerView4 = e7eVar6.H0().o;
                    tl60.a(recyclerView4, new hf5((View) recyclerView4, (Object) e7eVar6, (View) imageView2, (View) textView2, (byte) 4));
                    e7eVar6.H0().o.postInvalidateDelayed(400L);
                } else {
                    if (!Intrinsics.d(p6eVar, g6e.f10759a)) {
                        t9f.b();
                        return null;
                    }
                    j120.Y(e7eVar6);
                    kud kudVar = i5e.q2;
                    androidx.fragment.app.e eVarC6 = e7eVar6.C();
                    eVarC6.getClass();
                    kudVar.getClass();
                    if (eVarC6.J("file_bottom") == null) {
                        new i5e().H0(eVarC6, "file_bottom");
                    }
                }
                return Unit.f46060a;
            case 7:
                b9e b9eVar = (b9e) obj;
                e7e e7eVar7 = (e7e) obj3;
                kwd kwdVar8 = e7e.d2;
                e7eVar7.getClass();
                if (b9eVar != null) {
                    if (b9eVar instanceof y8e) {
                        kzq kzqVarH3 = e7eVar7.H0();
                        jk3 jk3Var = kzqVarH3.l;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) jk3Var.b;
                        ShapeableImageView shapeableImageView = (ShapeableImageView) jk3Var.d;
                        constraintLayout2.setVisibility(0);
                        kzqVarH3.b.setVisibility(0);
                        kzqVarH3.n.setVisibility(8);
                        List list = u0d.f34849a;
                        u0d.a(shapeableImageView);
                        shapeableImageView.setImageResource(R.drawable.ic_message_document);
                        MiddleMultilineTextView middleMultilineTextView = (MiddleMultilineTextView) jk3Var.e;
                        File file2 = ((y8e) b9eVar).f42190a;
                        middleMultilineTextView.setText(file2.getName());
                        ((TextView) jk3Var.f).setText(ahb.N(e7eVar7.o0(), file2.length()));
                    } else if (b9eVar instanceof z8e) {
                        kzq kzqVarH4 = e7eVar7.H0();
                        ((ConstraintLayout) kzqVarH4.l.b).setVisibility(8);
                        kzqVarH4.n.setVisibility(0);
                        kzqVarH4.b.setVisibility(0);
                        ((n14) e7eVar7.W1.getValue()).A(((z8e) b9eVar).f43962a);
                    } else if (b9eVar instanceof a9e) {
                        ((ConstraintLayout) e7eVar7.H0().l.b).setVisibility(8);
                        e7eVar7.H0().n.setVisibility(8);
                        e7eVar7.H0().b.setVisibility(8);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 8:
                exb exbVar = (exb) obj;
                e7e e7eVar8 = (e7e) obj3;
                kwd kwdVar9 = e7e.d2;
                kzq kzqVarH5 = e7eVar8.H0();
                TextInputEditText textInputEditText = kzqVarH5.f;
                boolean z2 = exbVar.f8569a;
                boolean z3 = exbVar.c;
                boolean z4 = exbVar.b;
                if (!z2) {
                    j120.X(textInputEditText);
                }
                ImageView imageView3 = kzqVarH5.i;
                ImageView imageView4 = kzqVarH5.j;
                textInputEditText.setEnabled(exbVar.f8569a);
                imageView4.setEnabled(z4);
                imageView4.setAlpha((z4 && e7eVar8.H0().s.getProgress() == 0) ? 1.0f : 0.6f);
                imageView3.setEnabled(z3);
                imageView3.setAlpha(z3 ? 1.0f : 0.6f);
                return Unit.f46060a;
            case 9:
                final boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                final e7e e7eVar9 = (e7e) obj3;
                kwd kwdVar10 = e7e.d2;
                MenuItem menuItemFindItem = e7eVar9.H0().x.getMenu().findItem(R.id.mute);
                menuItemFindItem.setIcon(zBooleanValue2 ? R.drawable.ic_glyph_sound_off : R.drawable.ic_glyph_sound_on);
                menuItemFindItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: a.x6e
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        kwd kwdVar11 = e7e.d2;
                        menuItem.getClass();
                        fae faeVarJ0 = e7eVar9.J0();
                        boolean z5 = !zBooleanValue2;
                        i7e i7eVar = (i7e) ((g45) faeVarJ0.q.b).c;
                        i7eVar.b.d("PREF_KEY_MUTE_STATE", z5);
                        twn.A(z5, i7eVar.h, null);
                        return true;
                    }
                });
                return Unit.f46060a;
            case 10:
                ((fae) obj3).y((Throwable) obj);
                return Unit.f46060a;
            case 11:
                ((wze) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case 12:
                ((wze) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case 13:
                ((wze) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case 14:
                ((wze) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case 15:
                ((wze) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case 16:
                ((wze) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case 17:
                ((wze) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case 18:
                zy5 zy5Var = (zy5) obj;
                wff wffVar = (wff) obj3;
                mne mneVar = wffVar.i;
                if (zy5Var != null) {
                    if (!(zy5Var instanceof fy5)) {
                        boolean z5 = zy5Var instanceof yy5;
                        qff qffVar = qff.f28629a;
                        if (z5) {
                            bby bbyVar2 = wffVar.l;
                            if (bbyVar2 == null || !bbyVar2.isActive()) {
                                wffVar.x(qffVar);
                                wffVar.l = sac.V(jiu0.a(wffVar), new x6f(1, wffVar, wff.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, mneVar.b, new ex1((w46) wffVar, (yje) (false ? 1 : 0), (byte) 26), 10);
                            }
                        } else if (zy5Var instanceof ry5) {
                            wffVar.x(pff.f26901a);
                        } else if (zy5Var instanceof ty5) {
                            ((vgf) wffVar.j.b).c.f9489a = new lgf();
                            wffVar.x(qffVar);
                        }
                    } else if (wffVar.g.a() && ((bbyVar = wffVar.m) == null || !bbyVar.isActive())) {
                        wffVar.m = sac.V(jiu0.a(wffVar), new x6f(1, wffVar, wff.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, mneVar.b, new igb((Object) wffVar, (yje) (false ? 1 : 0), (byte) 16), 10);
                    }
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                deg degVar = (deg) obj;
                wcg wcgVar = (wcg) obj3;
                usd usdVar = wcg.U1;
                androidx.fragment.app.e eVarC7 = wcgVar.C();
                eVarC7.getClass();
                String name = degVar.getClass().getName();
                List listP = eVarC7.c.p();
                ArrayList<Fragment> arrayListU = twn.u(listP);
                for (Object obj4 : listP) {
                    Fragment fragment2 = (Fragment) obj4;
                    if (!fragment2.O() && !Intrinsics.d(fragment2.B, name)) {
                        arrayListU.add(obj4);
                    }
                }
                Fragment fragmentJ = eVarC7.J(name);
                if (!arrayListU.isEmpty() || fragmentJ == null || !fragmentJ.S()) {
                    zb5 zb5Var = new zb5(eVarC7);
                    zb5Var.p(0, 0, 0, 0);
                    if (fragmentJ == null) {
                        if (degVar.equals(beg.f2448a)) {
                            std stdVar = afg.S1;
                            CyberChampParams cyberChampParamsH0 = wcgVar.H0();
                            stdVar.getClass();
                            afg afgVar = new afg();
                            afgVar.O1.J(afgVar, afg.U1[0], cyberChampParamsH0);
                            fragment = afgVar;
                        } else if (!degVar.equals(ceg.f4210a)) {
                            if (!(degVar instanceof aeg)) {
                                t9f.b();
                                return null;
                            }
                            if (((aeg) degVar).f726a) {
                                dsh.V1.getClass();
                                dcgVar = new dsh();
                            } else {
                                dcg.P1.getClass();
                                dcgVar = new dcg();
                            }
                            fragment = dcgVar;
                        } else if (wcgVar.H0().d == CyberGamesPage.Virtual.INSTANCE.f46556a) {
                            s9m0 s9m0Var = d7o0.R1;
                            CyberChampParams cyberChampParamsH1 = wcgVar.H0();
                            s9m0Var.getClass();
                            d7o0 d7o0Var = new d7o0();
                            d7o0Var.O1.J(d7o0Var, d7o0.S1[0], cyberChampParamsH1);
                            fragment = d7o0Var;
                        } else {
                            kud kudVar2 = zfg.S1;
                            CyberChampParams cyberChampParamsH2 = wcgVar.H0();
                            kudVar2.getClass();
                            zfg zfgVar = new zfg();
                            zfgVar.O1.J(zfgVar, zfg.U1[0], cyberChampParamsH2);
                            fragment = zfgVar;
                        }
                        zb5Var.k(R.id.fragmentContainer, fragment, name, 1);
                    } else if (!fragmentJ.S() || fragmentJ.O()) {
                        zb5Var.q(fragmentJ, lkz.e);
                        zb5Var.r(fragmentJ);
                    }
                    for (Fragment fragment3 : arrayListU) {
                        zb5Var.q(fragment3, lkz.d);
                        zb5Var.m(fragment3);
                    }
                    zb5Var.h();
                }
                return Unit.f46060a;
            case 20:
                dvh dvhVar = (dvh) obj3;
                dvhVar.t.b((Throwable) obj, new yfg(dvhVar, b2));
                return Unit.f46060a;
            case 21:
                lwh lwhVar = (lwh) obj3;
                int i5 = lwh.t;
                lwhVar.r.b((Throwable) obj, new jwh(lwhVar, b4));
                return Unit.f46060a;
            case 22:
                ((j2j) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case 23:
                ((j2j) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case 24:
                ((j2j) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((j2j) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                prn prnVar = (prn) obj;
                ysj ysjVar = (ysj) obj3;
                qud qudVar2 = ysj.m2;
                ysjVar.getClass();
                n0o0 n0o0Var = ysjVar.i2;
                if (prnVar != null) {
                    if (!(prnVar instanceof orn)) {
                        if (prnVar instanceof nrn) {
                            nrn nrnVar = (nrn) prnVar;
                            mhn0 mhn0VarV0 = ysjVar.Q0();
                            DsPresetTextFieldBasic dsPresetTextFieldBasic = mhn0VarV0.c;
                            int identifier = ysjVar.G().getIdentifier(nrnVar.f, "drawable", ysjVar.o0().getPackageName());
                            if (identifier != 0) {
                                ysjVar.Q0().c.setEndIcon(identifier);
                            }
                            DsPresetTextFieldBasic dsPresetTextFieldBasic2 = ysjVar.Q0().c;
                            da0 da0Var = (da0) n0o0Var.getValue();
                            da0Var.getClass();
                            dsPresetTextFieldBasic2.b.c(da0Var);
                            dsPresetTextFieldBasic.setText(nrnVar.c);
                            DsPresetTextFieldBasic dsPresetTextFieldBasic3 = ysjVar.Q0().c;
                            da0 da0Var2 = (da0) n0o0Var.getValue();
                            da0Var2.getClass();
                            dsPresetTextFieldBasic3.b.a(da0Var2);
                            mhn0VarV0.d.setEnabled(nrnVar.e);
                            dsPresetTextFieldBasic.addOnLayoutChangeListener(new wsj(mhn0VarV0, (byte) 0));
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                mrn mrnVar = (mrn) obj;
                ysj ysjVar2 = (ysj) obj3;
                qud qudVar3 = ysj.m2;
                ysjVar2.getClass();
                if (mrnVar != null) {
                    if (mrnVar instanceof irn) {
                        vcc.f0(i120.V(new Pair("DefaultBetSumBottomSheetKey", Double.valueOf(((irn) mrnVar).f15266a))), ysjVar2, "DefaultBetSumBottomSheetKey");
                        ysjVar2.x0();
                    } else if (mrnVar instanceof lrn) {
                        wdk0 wdk0Var4 = ysjVar2.k2;
                        if (wdk0Var4 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var4, new xdk0(rek0.b, ((lrn) mrnVar).f20541a, null, null, null, null, 124), ysjVar2, null, null, false, null, 1020);
                    } else if (mrnVar instanceof jrn) {
                        ysjVar2.Q0().c.setErrorText(((jrn) mrnVar).f17011a);
                    } else if (mrnVar instanceof krn) {
                        ysjVar2.Q0().c.setErrorText(null);
                        ysjVar2.Q0().c.setHelperText(((krn) mrnVar).f18774a);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bwk bwkVar = (bwk) obj;
                cy40 cy40Var = (cy40) obj3;
                cy40Var.getClass();
                bwkVar.getClass();
                rfk0 rfk0VarH = xfk0.h();
                nz40 nz40Var = rfk0VarH instanceof nz40 ? (nz40) rfk0VarH : null;
                if (nz40Var == null || (nz40VarC = nz40Var.C(null, null)) == null) {
                    jf4.n("Cannot create a mutable snapshot of an read-only snapshot");
                    return null;
                }
                try {
                    rfk0 rfk0VarJ = nz40VarC.j();
                    try {
                        ((hgk0) cy40Var.f5154a).setValue(bwkVar.f3329a);
                        ((hgk0) cy40Var.b).setValue(bwkVar.b);
                        ((hgk0) cy40Var.c).setValue(new ycl(bwkVar.c));
                        ((hgk0) cy40Var.d).setValue(new ycl(bwkVar.d));
                        ((hgk0) cy40Var.e).setValue(bwkVar.e);
                        ((hgk0) cy40Var.f).setValue(Float.valueOf(bwkVar.f));
                        ((hgk0) cy40Var.g).setValue(bwkVar.g);
                        ((hgk0) cy40Var.h).setValue(bwkVar.h);
                        ((hgk0) cy40Var.i).setValue(bwkVar.i);
                        ((hgk0) cy40Var.j).setValue(new ycl(bwkVar.j));
                        rfk0.q(rfk0VarJ);
                        nz40VarC.w().L();
                        nz40VarC.c();
                        return Unit.f46060a;
                    } catch (Throwable th) {
                        rfk0.q(rfk0VarJ);
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        nz40VarC.c();
                        throw th3;
                    }
                }
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                iiy[] iiyVarArr = qfl.O1;
                ((qfl) obj3).G0().b.v(zBooleanValue3);
                return Unit.f46060a;
        }
    }
}
