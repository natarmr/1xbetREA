package a;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getContactsFragmentScreen$1;
import org.xplatform.support.api.navigation.SupportMenuScreenParams;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gjn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11408a;
    public final /* synthetic */ jjn0 b;

    public /* synthetic */ gjn0(jjn0 jjn0Var, byte b) {
        this.f11408a = b;
        this.b = jjn0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cln0 cln0Var;
        byte b = this.f11408a;
        jjn0 jjn0Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                g9m0 g9m0Var = jjn0.S1;
                if (zBooleanValue) {
                    try {
                        List<ResolveInfo> listQueryIntentActivities = jjn0Var.o0().getPackageManager().queryIntentActivities(new Intent("org.xcare.client.OPEN_FROM_MAIN_APP"), 65536);
                        listQueryIntentActivities.getClass();
                        if (listQueryIntentActivities.isEmpty()) {
                            v3c.T(jjn0Var.o0(), "org.xcare.client");
                        } else {
                            Intent intent = new Intent("org.xcare.client.OPEN_FROM_MAIN_APP");
                            intent.setPackage("org.xcare.client");
                            intent.putExtra("OPEN_XCARE_FROM_MAIN_APP_EXTRAS_KEY", jjn0Var.H(R.string.deeplink_scheme));
                            intent.setFlags(268435456);
                            jjn0Var.n0().startActivity(intent);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                g9m0 g9m0Var2 = jjn0.S1;
                if (zBooleanValue2) {
                    mkn0 mkn0VarH0 = jjn0Var.H0();
                    String strA = mkn0VarH0.n.a();
                    jru jruVar = new jru(new drm0((us3) ((prc) mkn0VarH0.m.f23789a).b), (byte) 14);
                    strA.getClass();
                    ((us3) ((drm0) jruVar.b).f6568a).getClass();
                    mkn0VarH0.z.f(new dkn0(strA.concat("/releases_android/xcare/prod/release/xcare.apk")));
                }
                break;
            default:
                yjn0 yjn0Var = (yjn0) obj;
                g9m0 g9m0Var3 = jjn0.S1;
                yjn0Var.getClass();
                mkn0 mkn0VarH1 = jjn0Var.H0();
                i1w0 i1w0Var = mkn0VarH1.b;
                boolean z = ((SupportMenuScreenParams) jjn0Var.L1.n(jjn0Var, jjn0.U1[0])).f47110a;
                e41 e41Var = mkn0VarH1.q;
                s31 s31Var = mkn0VarH1.h;
                s2m0 s2m0Var = cln0.b;
                int i = yjn0Var.f42749a;
                s2m0Var.getClass();
                if (i == 0) {
                    cln0Var = cln0.SUPPORT_CHAT;
                } else if (i == 1) {
                    cln0Var = cln0.CALL_BACK;
                } else if (i == 2) {
                    cln0Var = cln0.VOICE_CHAT;
                } else if (i != 3) {
                    cln0Var = i != 4 ? cln0.SUPPORT_DEFAULT : cln0.PAYMENTS_CONSULTANT;
                } else {
                    cln0Var = cln0.CONTACTS;
                }
                int iOrdinal = cln0Var.ordinal();
                if (iOrdinal == 0) {
                    s31Var.b(it2.SUPPORT);
                    e41Var.b("сhat", "support");
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    FragmentScreen fragmentScreenB = mkn0VarH1.i.b();
                    if (fragmentScreenB instanceof DialogScreen) {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
                    } else {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else if (iOrdinal == 1) {
                    mkn0VarH1.A(z);
                } else if (iOrdinal == 2) {
                    mkn0VarH1.B();
                } else if (iOrdinal == 3) {
                    kt2 kt2Var = s31Var.f31532a;
                    Pair pair = new Pair("point", "contacts");
                    it2 it2Var = it2.LINKING_PHONE;
                    kt2Var.a("acc_support_call", xp20.f(pair, new Pair("screen", "support")));
                    e41Var.getClass();
                    e41Var.b("contacts", "support");
                    if (mkn0VarH1.w().A0) {
                        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                        mkn0VarH1.r.getClass();
                        k0w0VarI.h(new RulesScreenFactoryImpl$getContactsFragmentScreen$1(z));
                        ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO2;
                            if (pawVar2.hasNext()) {
                                i1w0Var.a((oe50) pawVar2.next());
                            }
                        }
                    } else {
                        mkn0VarH1.s.j();
                        i1w0Var.d(new zjn0(mkn0VarH1, (byte) 0));
                    }
                } else if (iOrdinal == 4) {
                    kt2 kt2Var2 = s31Var.f31532a;
                    Pair pair2 = new Pair("point", "payment_orders");
                    it2 it2Var2 = it2.LINKING_PHONE;
                    kt2Var2.a("acc_support_call", xp20.f(pair2, new Pair("screen", "support")));
                    e41Var.getClass();
                    e41Var.b("payment_orders", "support");
                    mkn0VarH1.z.f(fkn0.f9702a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
