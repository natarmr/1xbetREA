package a;

import android.text.Html;
import android.text.Spanned;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.resident.presentation.views.ResidentSafeLineView;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;
import org.xplatform.security.api.domain.models.SecretQuestionModel;
import org.xplatform.security.impl.presentation.secret_question.models.SecretQuestionUiModel;
import org.xplatform.security.impl.presentation.secret_question_choice.params.SecretQuestionChoiceScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dff0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5998a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dff0(pu90 pu90Var, p4e p4eVar) {
        this.f5998a = (byte) 8;
        this.c = pu90Var;
        this.b = p4eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        glz glzVarX;
        byte b = this.f5998a;
        byte b2 = 8;
        byte b3 = 6;
        byte b4 = 7;
        byte b5 = 19;
        byte b6 = 2;
        byte b7 = 0;
        byte b8 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                eff0 eff0Var = (eff0) obj3;
                pu90 pu90Var = (pu90) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                boolean z = eff0Var.q;
                float f = eff0Var.o;
                if (z) {
                    ou90Var.m(pu90Var, ou90Var.T(f) - pu90Var.f27604a, ou90Var.T(eff0Var.p), 0.0f);
                } else {
                    ou90Var.g(pu90Var, ou90Var.T(f), ou90Var.T(eff0Var.p), 0.0f);
                }
                return Unit.f46060a;
            case 1:
                clz clzVar = (clz) obj3;
                wjd wjdVar = (wjd) obj2;
                g02 g02Var = new g02(wjdVar, b6);
                if (clzVar != null && (glzVarX = clzVar.x()) != null) {
                    glzVarX.a(g02Var);
                }
                if (clzVar == null) {
                    kkz kkzVar = kkz.ON_RESUME;
                    wjdVar.getClass();
                    wjdVar.b = kkzVar.a();
                    wjdVar.a();
                }
                return new u43(clzVar, g02Var, wjdVar, b3);
            case 2:
                xiu0 xiu0Var = (xiu0) obj3;
                hz40 hz40Var = xiu0Var.a().b;
                Object objG = hz40Var.g(obj2);
                if (objG == null) {
                    objG = new viu0(obj2);
                    hz40Var.n(obj2, objG);
                }
                viu0 viu0Var = (viu0) objG;
                viu0Var.c++;
                return new ty2(new uiu0(viu0Var, xiu0Var, obj2), (byte) 22);
            case 3:
                xiu0 xiu0Var2 = (xiu0) obj3;
                glz glzVar = (glz) obj2;
                rek0 rek0Var = rek0.h;
                hz40 hz40Var2 = xiu0Var2.a().b;
                Object objG2 = hz40Var2.g(rek0Var);
                if (objG2 == null) {
                    objG2 = new viu0(rek0Var);
                    hz40Var2.n(rek0Var, objG2);
                }
                viu0 viu0Var2 = (viu0) objG2;
                viu0Var2.c++;
                return new u43(new uiu0(viu0Var2, xiu0Var2, rek0Var), glzVar, xiu0Var2, b4);
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.getLocalizedMessage();
                ((nff0) obj3).f(th, (vne) obj2);
                return Unit.f46060a;
            case 5:
                au90 au90Var = (au90) obj;
                au90Var.getClass();
                ((Function1) obj3).invoke(new vhf0(((hif0) obj2).b.e, au90Var));
                return Unit.f46060a;
            case 6:
                rnf0 rnf0Var = (rnf0) obj3;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                rnf0Var.g.o(null, i8d.c);
                rnf0Var.f(th2, (vne) obj2);
                return Unit.f46060a;
            case 7:
                ResidentSafeLineView residentSafeLineView = (ResidentSafeLineView) obj3;
                mrf0 mrf0Var = (mrf0) obj;
                int i = ResidentSafeLineView.m;
                mrf0Var.getClass();
                int size = ((List) obj2).size();
                int i2 = residentSafeLineView.d + 1;
                residentSafeLineView.d = i2;
                if (i2 >= size) {
                    residentSafeLineView.c.invoke(mrf0Var);
                }
                return Unit.f46060a;
            case 8:
                pu90 pu90Var2 = (pu90) obj2;
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                long j = ((p4e) obj3).f26347a;
                ou90Var2.g(pu90Var2, (p4e.i(j) - pu90Var2.f27604a) / 2, (p4e.h(j) - pu90Var2.b) / 2, 0.0f);
                return Unit.f46060a;
            case 9:
                psf0 psf0Var = (psf0) obj3;
                vne vneVar = (vne) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.getLocalizedMessage();
                psf0Var.u.o(null, i8d.f14333a);
                sac.V(vneVar, osf0.f25780a, null, null, new w7f0(psf0Var, null), 14);
                psf0Var.f(th3, vneVar);
                return Unit.f46060a;
            case 10:
                cp cpVar = (cp) obj3;
                aif0 aif0Var = (aif0) obj2;
                ((List) obj).getClass();
                bxx bxxVar = (bxx) cpVar.u;
                bxxVar.b.setVisibility(((buf0) cpVar.u()).b.length() > 0 ? 0 : 8);
                TextView textView = bxxVar.b;
                TextView textView2 = bxxVar.c;
                textView.setText(((buf0) cpVar.u()).b);
                textView2.setVisibility(((buf0) cpVar.u()).f3229a.length() > 0 ? (byte) 0 : (byte) 8);
                buf0 buf0Var = (buf0) cpVar.u();
                String str = buf0Var.c;
                String str2 = buf0Var.f3229a;
                if (str.length() <= 0 && buf0Var.b.length() <= 0) {
                    textView2.setText(str2);
                    if (!Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                        textView2.setOnClickListener(null);
                    }
                } else {
                    Spanned spannedFromHtml = Html.fromHtml("<a>" + str2 + "</a>", 0);
                    spannedFromHtml.getClass();
                    textView2.setText(spannedFromHtml);
                    if (!Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                        dyb.N(textView2, ymx.INTERVAL_500, new dff0(aif0Var, buf0Var, (byte) 11));
                    }
                }
                sj3.x0(textView2);
                return Unit.f46060a;
            case 11:
                ((View) obj).getClass();
                ((aif0) obj3).invoke(((buf0) obj2).c);
                return Unit.f46060a;
            case 12:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                uf3 uf3Var = ((wuf0) obj3).e;
                uf3Var.getClass();
                ((h6i) uf3Var.c.f24171a).c();
                k0w0Var.h(new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1((String) obj2));
                return Unit.f46060a;
            case 13:
                b5g0 b5g0Var = (b5g0) obj3;
                hcz hczVar = (hcz) obj;
                cge0 cge0Var = n7g0.p2;
                hczVar.getClass();
                a4x a4xVar = b5g0Var.f2002a;
                hczVar.f(a4xVar.size(), new pwe0(new vtf0(b3), a4xVar, b2), new d1c0(a4xVar, (byte) 14), new ugd(2039820996, true, new h8w(a4xVar, b5g0Var, (n7g0) obj2, b5)));
                return Unit.f46060a;
            case 14:
                ((View) obj).getClass();
                ((s7g0) obj3).v.invoke(((q6g0) obj2).h);
                return Unit.f46060a;
            case 15:
                uie uieVar = (uie) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar2 = uieVar.f35726a;
                hczVar2.f(a4xVar2.size(), new pwe0(new wtf0(b4), a4xVar2, (byte) 9), new ubn(a4xVar2, (byte) 26), new ugd(802480018, true, new h8w((List) a4xVar2, (Object) uieVar, (Function1) obj2, (byte) 20)));
                return Unit.f46060a;
            case 16:
                ((List) obj).getClass();
                ((qgg0) obj3).A(((drf) ((cp) obj2).u()).f6556a);
                return Unit.f46060a;
            case 17:
                l6e0 l6e0Var = (l6e0) obj2;
                ((View) obj).getClass();
                ((aig0) obj3).v.invoke(Integer.valueOf(l6e0Var.d), l6e0Var.m);
                return Unit.f46060a;
            case 18:
                elg0 elg0Var = (elg0) obj2;
                ((Function2) obj3).invoke(elg0Var.c, Boolean.valueOf(elg0Var.d));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                ((h6i) ((aog0) obj3).p.f24171a).c();
                k0w0Var2.h(new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1((String) obj2));
                return Unit.f46060a;
            case 20:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                ((h6i) ((mog0) obj3).d.f24171a).c();
                k0w0Var3.h(new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1((String) obj2));
                return Unit.f46060a;
            case 21:
                ((hgk0) ((zz40) obj3).f45235a).setValue(new ujo((vhv0) obj2, (vhv0) obj));
                return Unit.f46060a;
            case 22:
                rch0 rch0Var = (rch0) obj3;
                sch0 sch0Var = (sch0) obj2;
                odl odlVar = (odl) obj;
                float f2 = odlVar.b ? -1.0f : 1.0f;
                long j2 = odlVar.f25081a;
                rch0Var.a(1, ne60.g(f2, sch0Var.d == ma80.b ? ne60.a(j2, 0.0f, 0.0f, 1) : ne60.a(j2, 0.0f, 0.0f, 2)));
                return Unit.f46060a;
            case 23:
                ybh0 ybh0Var = (ybh0) obj3;
                e1a0 e1a0Var = (e1a0) obj2;
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null && !view2.isClickable()) {
                    return Unit.f46060a;
                }
                int iD = ybh0Var.d();
                int iZ = e1a0Var.z();
                if (iD != iZ) {
                    List list = ((yz3) e1a0Var.g).f;
                    list.getClass();
                    Calendar calendar = (Calendar) CollectionsKt.W(iD, list);
                    if (calendar != null) {
                        Date time = calendar.getTime();
                        time.getClass();
                        ((Calendar) e1a0Var.h).setTime(time);
                        e1a0Var.h(iZ);
                        Function1 function1 = (Function1) e1a0Var.f;
                        Date time2 = calendar.getTime();
                        time2.getClass();
                        function1.invoke(time2);
                        e1a0Var.h(iD);
                    }
                }
                return Unit.f46060a;
            case 24:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                a4x a4xVar3 = ((qjh0) obj3).f28839a;
                hczVar3.f(a4xVar3.size(), null, new d1c0(a4xVar3, (byte) 19), new ugd(2039820996, true, new njh0(a4xVar3, (Function1) obj2, b7)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ctf0 ctf0Var = (ctf0) obj3;
                elh0 elh0Var = (elh0) obj;
                elh0Var.getClass();
                int i3 = ((SecretQuestionChoiceScreenParams) obj2).b;
                ctf0Var.getClass();
                String str3 = elh0Var.f7997a;
                a4x a4xVar4 = elh0Var.b;
                a4xVar4.getClass();
                ArrayList<SecretQuestionModel> arrayListR0 = CollectionsKt.r0(a4xVar4, new SecretQuestionModel(0, ctf0Var.b.a(R.string.ask_own_question, Arrays.copyOf(new Object[0], 0))));
                ArrayList<SecretQuestionUiModel> arrayList = new ArrayList(r3d.q(arrayListR0, 10));
                for (SecretQuestionModel secretQuestionModel : arrayListR0) {
                    secretQuestionModel.getClass();
                    int i4 = secretQuestionModel.f46923a;
                    arrayList.add(new SecretQuestionUiModel(secretQuestionModel.b, i4, i4 == i3));
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (SecretQuestionUiModel secretQuestionUiModel : arrayList) {
                    arrayList2.add(new zkh0(secretQuestionUiModel.b, secretQuestionUiModel.f46957a, secretQuestionUiModel.c));
                }
                return new flh0(new alh0(dyb.o0(arrayList2), str3));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                iph0 iph0Var = (iph0) obj3;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                iph0Var.y((noh0) obj2, iph0Var.I);
                iph0Var.u.b(th4, new poh0(iph0Var, b7));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((View) obj).getClass();
                ((Function1) obj3).invoke((fqh0) obj2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                irh0 irh0Var = (irh0) obj3;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                irh0Var.z((hqh0) obj2, irh0Var.H);
                irh0Var.t.b(th5, new qqh0(irh0Var, b8));
                return Unit.f46060a;
            default:
                ((View) obj).getClass();
                ((gwg0) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
        }
    }

    public /* synthetic */ dff0(Object obj, Object obj2, byte b) {
        this.f5998a = b;
        this.b = obj;
        this.c = obj2;
    }
}
