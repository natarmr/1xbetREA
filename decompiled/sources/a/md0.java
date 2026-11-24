package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class md0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21572a;
    public final /* synthetic */ d9z b;

    public /* synthetic */ md0(d9z d9zVar, byte b) {
        this.f21572a = b;
        this.b = d9zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21572a;
        boolean z = false;
        d9z d9zVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(d9zVar.h.a());
            case 1:
                return Boolean.valueOf(d9zVar.h.a());
            case 2:
                return Boolean.valueOf(d9zVar.c());
            case 3:
                return Boolean.valueOf(d9zVar.c());
            case 4:
                return Boolean.valueOf(d9zVar.h.a());
            case 5:
                return Boolean.valueOf(d9zVar.h.a());
            case 6:
                if (d9zVar.h() == 0 && (d9zVar.c() || d9zVar.d())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                return Boolean.valueOf(d9zVar.h.a());
            case 8:
                return Boolean.valueOf(d9zVar.h.a());
            case 9:
                if (d9zVar.h() == 0 && (d9zVar.c() || d9zVar.d())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                return Integer.valueOf(((q8z) ((hgk0) d9zVar.e).getValue()).m);
            case 11:
                return Integer.valueOf(d9zVar.j().q);
            case 12:
                return Boolean.valueOf(d9zVar.h() > 0 || d9zVar.i() > 150);
            case 13:
                return Boolean.valueOf(d9zVar.c());
            case 14:
                return Boolean.valueOf(d9zVar.h.a());
            case 15:
                if (d9zVar.h() == 0 && (d9zVar.c() || d9zVar.d())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                if (d9zVar.h() == 0 && (d9zVar.c() || d9zVar.d())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                return new Pair(Integer.valueOf(d9zVar.h()), Integer.valueOf(d9zVar.i()));
            case 18:
                return new Pair(Integer.valueOf(d9zVar.h()), Integer.valueOf(d9zVar.i()));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new Pair(Integer.valueOf(d9zVar.h()), Integer.valueOf(d9zVar.i()));
            case 20:
                return new Pair(Integer.valueOf(d9zVar.h()), Integer.valueOf(d9zVar.i()));
            case 21:
                if (d9zVar.h() == 0 && (d9zVar.c() || d9zVar.d())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                if (d9zVar.h() == 0 && d9zVar.i() == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                return Boolean.valueOf(d9zVar.h.a());
            default:
                return Boolean.valueOf(d9zVar.h.a());
        }
    }
}
