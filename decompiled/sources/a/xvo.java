package a;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xvo implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41570a;
    public final /* synthetic */ weu b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qzt d;
    public final /* synthetic */ ctf0 e;
    public final /* synthetic */ fhj f;
    public final /* synthetic */ long g;
    public final /* synthetic */ wyu h;

    public /* synthetic */ xvo(long j, weu weuVar, String str, qzt qztVar, ctf0 ctf0Var, fhj fhjVar, wyu wyuVar) {
        this.f41570a = (byte) 6;
        this.g = j;
        this.b = weuVar;
        this.c = str;
        this.d = qztVar;
        this.e = ctf0Var;
        this.f = fhjVar;
        this.h = wyuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41570a;
        wyu wyuVar = this.h;
        ctf0 ctf0Var = this.e;
        qzt qztVar = this.d;
        weu weuVar = this.b;
        switch (b) {
            case 0:
                String str = this.c;
                return new mvo(false, true, false, null, aem0.x(weuVar.a(str), qztVar.a(), ctf0Var), this.f.s(str, this.g, wyuVar.a(), 0L));
            case 1:
                String str2 = this.c;
                return new suq(false, false, true, false, new kpm(opm.f25648a, new hpm(0L, 3), d5c.O("", "", false, false, new hpm(0L, 3))), iun.f15405a, aem0.x(weuVar.a(str2), qztVar.a(), ctf0Var), this.f.s(str2, this.g, wyuVar.a(), 0L), false);
            case 2:
                long j = this.g;
                List listJ = j == 180 ? q3d.j(new sbc(ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0)), 0L, true), new sbc(ctf0Var.b.a(R.string.important, Arrays.copyOf(new Object[0], 0)), 1L, false)) : iun.f15405a;
                iun iunVar = iun.f15405a;
                boolean z = j == 180;
                String str3 = this.c;
                return new uas(j, false, true, false, listJ, iunVar, iunVar, false, z, aem0.x(weuVar.a(str3), qztVar.a(), ctf0Var), this.f.s(str3, j, wyuVar.a(), 0L));
            case 3:
                String str4 = this.c;
                return new guv(false, true, false, iun.f15405a, aem0.x(weuVar.a(str4), qztVar.a(), ctf0Var), this.f.s(str4, this.g, wyuVar.a(), 0L));
            case 4:
                String str5 = this.c;
                return new pw50(false, true, false, 0, null, aem0.x(weuVar.a(str5), qztVar.a(), ctf0Var), this.f.s(str5, this.g, wyuVar.a(), 0L));
            case 5:
                lak0 lak0Var = lak0.c;
                String str6 = this.c;
                return new yqd0(true, false, false, "", "", "", "", lak0Var, aem0.x(weuVar.a(str6), qztVar.a(), ctf0Var), this.f.s(str6, this.g, wyuVar.a(), 0L), false);
            case 6:
                String str7 = this.c;
                zdm0 zdm0VarX = aem0.x(weuVar.a(str7), qztVar.a(), ctf0Var);
                uaq0 uaq0VarA = wyuVar.a();
                fhj fhjVar = this.f;
                long j2 = this.g;
                return new z5p0(j2, zdm0VarX, fhjVar.s(str7, j2, uaq0VarA, 0L), true, false, false, true, null);
            default:
                String str8 = this.c;
                return new s3q0(false, true, false, 0, null, aem0.x(weuVar.a(str8), qztVar.a(), ctf0Var), this.f.s(str8, this.g, wyuVar.a(), 0L));
        }
    }

    public /* synthetic */ xvo(long j, ctf0 ctf0Var, weu weuVar, String str, qzt qztVar, fhj fhjVar, wyu wyuVar) {
        this.f41570a = (byte) 2;
        this.g = j;
        this.e = ctf0Var;
        this.b = weuVar;
        this.c = str;
        this.d = qztVar;
        this.f = fhjVar;
        this.h = wyuVar;
    }

    public /* synthetic */ xvo(weu weuVar, String str, qzt qztVar, ctf0 ctf0Var, fhj fhjVar, long j, wyu wyuVar, byte b) {
        this.f41570a = b;
        this.b = weuVar;
        this.c = str;
        this.d = qztVar;
        this.e = ctf0Var;
        this.f = fhjVar;
        this.g = j;
        this.h = wyuVar;
    }
}
