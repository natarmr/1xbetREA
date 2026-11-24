package a;

import android.os.Build;

/* JADX INFO: loaded from: classes5.dex */
public final class ik4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1p f14907a;

    public ik4(s1p s1pVar, byte b) {
        s1pVar.getClass();
        switch (b) {
            case 1:
                this.f14907a = s1pVar;
                break;
            case 2:
                this.f14907a = s1pVar;
                break;
            case 3:
                this.f14907a = s1pVar;
                break;
            case 4:
                this.f14907a = s1pVar;
                break;
            case 5:
                this.f14907a = s1pVar;
                break;
            default:
                this.f14907a = s1pVar;
                break;
        }
    }

    public void a(int i, String str) {
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        this.f14907a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(str2, (byte) 0), new j1p(str, (byte) 1)}), 3096L);
    }

    public void b(r54 r54Var) {
        this.f14907a.a(cui0.b(new j1p(r54Var.f29867a, (byte) 0)), 3251L);
    }

    public void c(int i, String str) {
        this.f14907a.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new i1p(i, (byte) 2)}), 12542L);
    }

    public void d(String str, boolean z) {
        this.f14907a.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new j1p(z ? "on" : "off", (byte) 1)}), 3247L);
    }
}
