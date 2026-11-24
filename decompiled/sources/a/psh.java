package a;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class psh extends bnn0 implements aer {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public /* synthetic */ Object n;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psh(rsh rshVar, yje yjeVar) {
        super(6, yjeVar);
        this.o = rshVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        p7m0 p7m0Var;
        boolean z3;
        String strConcat;
        lc00 lc00Var;
        String str;
        switch (this.i) {
            case 0:
                esh eshVar = (esh) this.k;
                Pair pair = (Pair) this.l;
                boolean z4 = this.j;
                List<uog> list = (List) this.m;
                List<phk0> list2 = (List) this.n;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                rsh rshVar = (rsh) this.o;
                rshVar.q = eshVar;
                boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pair.b).booleanValue();
                esh eshVar2 = rshVar.q;
                if (eshVar2 != null) {
                    List list3 = eshVar2.j;
                    String str2 = eshVar2.g;
                    boolean z5 = eshVar2.k;
                    p7m0 p7m0Var2 = rshVar.k;
                    ctf0 ctf0Var = rshVar.e;
                    ctf0Var.getClass();
                    list.getClass();
                    list2.getClass();
                    lc00 lc00VarB = kotlin.collections.a.b();
                    Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                    calendar.setTime(new Date());
                    String str3 = eshVar2.e;
                    String str4 = eshVar2.d;
                    sdj sdjVar = sdj.UNIVERSAL;
                    boolean z6 = gqw0.I0(str2, "dd.MM.yyyy").getTime() <= calendar.getTime().getTime();
                    if (z6) {
                        j5n0.v(lc00VarB, ctf0Var, list3, z4, z5);
                    }
                    List list4 = eshVar2.i;
                    list4.getClass();
                    if (list4.isEmpty()) {
                        z = z6;
                        z2 = z5;
                        p7m0Var = p7m0Var2;
                    } else {
                        lc00VarB.add(u1c.B(0L, R.string.teams, ctf0Var));
                        ArrayList arrayList = new ArrayList(r3d.q(list4, 10));
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            ish ishVar = (ish) it.next();
                            arrayList.add(new l8s0(ishVar.b, ishVar.f15303a, ishVar.c));
                            z6 = z6;
                            it = it;
                            z5 = z5;
                            p7m0Var2 = p7m0Var2;
                        }
                        z = z6;
                        z2 = z5;
                        p7m0Var = p7m0Var2;
                        lc00VarB.add(new n8s0(arrayList));
                    }
                    String str5 = eshVar2.f;
                    if (str4.length() == 0) {
                        lc00Var = lc00VarB;
                    } else {
                        Pair pairC = zjb.C(str4);
                        String str6 = (String) pairC.f46059a;
                        String str7 = (String) pairC.b;
                        lc00VarB.add(u1c.B(1L, R.string.about_tournament, ctf0Var));
                        String strL = (str5.length() == 0 || str2.length() == 0) ? "" : kng0.l(str5, " - ", str2);
                        int i = eshVar2.c;
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                        decimalFormatSymbols.setGroupingSeparator('.');
                        DecimalFormat decimalFormat = new DecimalFormat("#,###", decimalFormatSymbols);
                        String str8 = strL;
                        String strValueOf = String.valueOf(decimalFormat.format(i));
                        if (i == 0) {
                            z3 = false;
                            strConcat = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                        } else {
                            z3 = false;
                            strConcat = z2 ? "$".concat(strValueOf) : strValueOf.concat("$");
                        }
                        lc00Var = lc00VarB;
                        lc00Var.add(new v1s0(1L, str8, str6, str7, strConcat, zBooleanValue, ctf0.b(R.attr.colorPrimary, ctf0Var), ctf0.b(R.attr.colorPrimary, ctf0Var), ctf0.b(zBooleanValue ? R.attr.uikitPrimary : R.attr.uikitSecondary, ctf0Var)));
                    }
                    if (str3.length() != 0) {
                        Pair pairC2 = zjb.C(str3);
                        String str9 = (String) pairC2.f46059a;
                        String str10 = (String) pairC2.b;
                        lc00Var.add(u1c.B(2L, R.string.format_tournament, ctf0Var));
                        lc00Var.add(new v1s0(2L, "", str9, str10, "", zBooleanValue2, R.color.the_international_total_start_gradient, R.color.the_international_total_start_gradient, ctf0.b(zBooleanValue2 ? R.attr.uikitPrimary : R.attr.uikitSecondary, ctf0Var)));
                    }
                    if (!list.isEmpty()) {
                        lc00Var.add(u1c.B(3L, R.string.cyber_games_stock, ctf0Var));
                        for (uog uogVar : list) {
                            lc00Var.add(new owr0(uogVar.f36012a, uogVar.b, uogVar.d, uogVar.l, uogVar.f, uogVar.i, uogVar.j, uogVar.k, uogVar.g, uogVar.h));
                        }
                    }
                    if (!z) {
                        j5n0.v(lc00Var, ctf0Var, list3, z4, z2);
                    }
                    if (!list2.isEmpty()) {
                        lc00Var.add(u1c.B(4L, R.string.social_networks, ctf0Var));
                        for (phk0 phk0Var : list2) {
                            String str11 = phk0Var.f27002a;
                            String str12 = phk0Var.b;
                            lsm0 lsm0Var = ctf0Var.b;
                            if (str11.equals(lsm0Var.a(R.string.social_telegram, Arrays.copyOf(new Object[0], 0)))) {
                                str = "org.telegram.messenger";
                            } else if (str11.equals(lsm0Var.a(R.string.social_instagram, Arrays.copyOf(new Object[0], 0)))) {
                                str = "com.instagram.android";
                            } else if (str11.equals(lsm0Var.a(R.string.social_x_label, Arrays.copyOf(new Object[0], 0)))) {
                                str = "com.twitter.android";
                            } else {
                                str = str11.equals(lsm0Var.a(R.string.social_discord, Arrays.copyOf(new Object[0], 0))) ? "com.discord" : "";
                            }
                            lc00Var.add(new o5s0(str11, str12, str, phk0Var.c));
                        }
                    }
                    new lch(kotlin.collections.a.a(lc00Var));
                    p7m0Var.getClass();
                    p7m0Var.o(null, r11);
                }
                return Unit.f46060a;
            default:
                kmq kmqVar = (kmq) this.k;
                nz50 nz50Var = (nz50) this.l;
                nz50 nz50Var2 = (nz50) this.m;
                nz50 nz50Var3 = (nz50) this.n;
                nz50 nz50Var4 = (nz50) this.o;
                wne wneVar2 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    iun iunVar = iun.f15405a;
                    rz50 rz50Var = new rz50(new kz50(iunVar), nz50Var4, new kz50(iunVar), new kz50(iunVar), nz50Var, nz50Var2, nz50Var3, new kz50(iunVar));
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.j = true;
                    if (kmqVar.a(rz50Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                psh pshVar = new psh((rsh) this.o, (yje) obj6);
                pshVar.k = (esh) obj;
                pshVar.l = (Pair) obj2;
                pshVar.j = zBooleanValue;
                pshVar.m = (List) obj4;
                pshVar.n = (List) obj5;
                return pshVar.invokeSuspend(Unit.f46060a);
            default:
                psh pshVar2 = new psh((yje) obj6);
                pshVar2.k = (kmq) obj;
                pshVar2.l = (nz50) obj2;
                pshVar2.m = (nz50) obj3;
                pshVar2.n = (nz50) obj4;
                pshVar2.o = (nz50) obj5;
                return pshVar2.invokeSuspend(Unit.f46060a);
        }
    }

    public psh(yje yjeVar) {
        super(6, yjeVar);
    }
}
