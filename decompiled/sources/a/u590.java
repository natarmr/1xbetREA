package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final class u590 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ w590 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u590(w590 w590Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = w590Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        w590 w590Var = this.k;
        switch (b) {
            case 0:
                u590 u590Var = new u590(w590Var, yjeVar, (byte) 0);
                u590Var.j = obj;
                return u590Var;
            case 1:
                u590 u590Var2 = new u590(w590Var, yjeVar, (byte) 1);
                u590Var2.j = obj;
                return u590Var2;
            default:
                u590 u590Var3 = new u590(w590Var, yjeVar, (byte) 2);
                u590Var3.j = obj;
                return u590Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((u590) create((l690) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((u590) create((b690) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((u590) create((f690) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        w590 w590Var = this.k;
        switch (b) {
            case 0:
                l690 l690Var = (l690) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (l690Var != null) {
                    if (l690Var instanceof i690) {
                        i690 i690Var = (i690) l690Var;
                        String str = i690Var.f14229a;
                        String str2 = i690Var.b;
                        String str3 = i690Var.c;
                        String str4 = i690Var.d;
                        mi70 mi70Var = w590.W1;
                        LinkedHashMap linkedHashMapH = xp20.h(new Pair("X-Mobile-Project-Id", String.valueOf(1357)), new Pair("x-mobile-app-authorization", str2), new Pair("X-Auth", str2), new Pair("mf-render-mode", "html"), new Pair("X-Country", str3));
                        if (str4.length() > 0) {
                            linkedHashMapH.put("X-Language", str4);
                        }
                        w590Var.H0().e.d(str, linkedHashMapH);
                    } else if (l690Var instanceof j690) {
                        boolean z = ((j690) l690Var).f15973a;
                        mi70 mi70Var2 = w590.W1;
                        if (!z) {
                            w590Var.H0().b.setVisibility(8);
                        }
                        w590Var.H0().e.setVisibility(!z ? 0 : 8);
                        w590Var.H0().c.setVisibility(z ? 0 : 8);
                    } else if (l690Var instanceof g690) {
                        g690 g690Var = (g690) l690Var;
                        boolean z2 = g690Var.f10751a;
                        ra10 ra10Var = g690Var.b;
                        mi70 mi70Var3 = w590.W1;
                        if (z2) {
                            w590Var.H0().b.setVisibility(8);
                            w590Var.H0().e.setVisibility(0);
                        } else {
                            w590Var.H0().b.v(ra10Var);
                            w590Var.H0().b.setVisibility(0);
                            w590Var.H0().c.setVisibility(8);
                            w590Var.H0().e.setVisibility(8);
                        }
                    } else if (l690Var instanceof k690) {
                        ra10 ra10Var2 = ((k690) l690Var).f17757a;
                        mi70 mi70Var4 = w590.W1;
                        w590Var.H0().c.setVisibility(8);
                        w590Var.H0().e.setVisibility(8);
                        LottieView lottieView = w590Var.H0().b;
                        lottieView.setVisibility(0);
                        lottieView.v(ra10Var2);
                        lottieView.setButtonWidthLayoutParams(-2);
                    }
                }
                return Unit.f46060a;
            case 1:
                b690 b690Var = (b690) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = b690Var instanceof a690;
                mi70 mi70Var5 = w590.W1;
                e1i e1iVarB = w590Var.H0().d.b("TOOLBAR_BUTTON_REFRESH");
                if (e1iVarB != null) {
                    e1iVarB.setNavigationBarButtonEnable(z3);
                    e1iVarB.setNavigationBarButtonAlpha(!z3);
                }
                return Unit.f46060a;
            default:
                f690 f690Var = (f690) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (f690Var != null) {
                    boolean z4 = f690Var instanceof e690;
                    w590 w590Var2 = this.k;
                    if (!z4) {
                        if (f690Var instanceof c690) {
                            mi70 mi70Var6 = w590.W1;
                            if (w590Var2.H0().e.b()) {
                                WebView.setWebContentsDebuggingEnabled(((c690) f690Var).f3808a);
                            }
                        } else if (f690Var instanceof d690) {
                            d690 d690Var = (d690) f690Var;
                            String str5 = d690Var.f5542a;
                            String[] strArr = d690Var.b;
                            mi70 mi70Var7 = w590.W1;
                            Bundle bundle = w590Var2.g;
                            if (bundle != null) {
                                bundle.putString("FILE_PATH_BUNDLE_NAME", str5);
                            } else {
                                w590Var2.s0(i120.V(new Pair("FILE_PATH_BUNDLE_NAME", str5)));
                            }
                            Uri uriC = FileProvider.c(w590Var2.o0(), new File(str5), ohs0.n(w590Var2.n0().getPackageName(), ".provider"));
                            uriC.getClass();
                            Intent intentC = v3a.c(uriC);
                            Intent intent = new Intent("android.intent.action.PICK");
                            intent.setType("image/*");
                            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
                            strArr.getClass();
                            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                            intent2.addCategory("android.intent.category.OPENABLE");
                            intent2.putExtra("android.intent.extra.MIME_TYPES", strArr);
                            intent2.setType("application/pdf");
                            Intent[] intentArr = intentC.getAction() != null ? new Intent[]{intentC, intent2} : new Intent[]{intent2};
                            Intent intentCreateChooser = Intent.createChooser(intent, "File Chooser");
                            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
                            try {
                                w590Var2.R1.a(intentCreateChooser);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    } else {
                        File file = ((e690) f690Var).f7270a;
                        mi70 mi70Var8 = w590.W1;
                        wdk0 wdk0Var = w590Var2.N1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        pek0 pek0Var = pek0.f26859a;
                        String strH = w590Var2.H(R.string.show_loading_document_message);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(pek0Var, strH, null, null, null, null, 124), w590Var2, null, null, false, null, 1020);
                        Context contextO0 = w590Var2.o0();
                        Context contextD = w590Var2.D();
                        String packageName = contextD != null ? contextD.getPackageName() : null;
                        if (packageName == null) {
                            packageName = "";
                        }
                        if (!sj3.v0(contextO0, file, packageName)) {
                            wdk0 wdk0Var2 = w590Var2.N1;
                            if (wdk0Var2 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            rek0 rek0Var = rek0.b;
                            String strH2 = w590Var2.H(R.string.registration_gdpr_pdf_error);
                            strH2.getClass();
                            wdk0.k(wdk0Var2, new xdk0(rek0Var, strH2, null, null, null, null, 124), w590Var2, null, null, false, null, 1020);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
