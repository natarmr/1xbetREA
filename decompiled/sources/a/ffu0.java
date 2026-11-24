package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ffu0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9462a;
    public final /* synthetic */ fck0 b;

    public /* synthetic */ ffu0(fck0 fck0Var, int i, long j) {
        this.f9462a = (byte) 2;
        this.b = fck0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f9462a;
        fck0 fck0Var = this.b;
        switch (b) {
            case 0:
                qlo qloVar = (qlo) fck0Var.c;
                String str = vtt0.f38024a;
                fsj fsjVar = qloVar.f28944a.s;
                fsjVar.N(fsjVar.M(), 1016, new csj((byte) 10));
                break;
            case 1:
                qlo qloVar2 = (qlo) fck0Var.c;
                String str2 = vtt0.f38024a;
                fsj fsjVar2 = qloVar2.f28944a.s;
                fsjVar2.N(fsjVar2.M(), 1019, new t9f((byte) 28));
                break;
            case 2:
                qlo qloVar3 = (qlo) fck0Var.c;
                String str3 = vtt0.f38024a;
                fsj fsjVar3 = qloVar3.f28944a.s;
                fsjVar3.N(fsjVar3.J((vn30) fsjVar3.d.e), 1018, new t9f((byte) 29));
                break;
            case 3:
                qlo qloVar4 = (qlo) fck0Var.c;
                String str4 = vtt0.f38024a;
                fsj fsjVar4 = qloVar4.f28944a.s;
                fsjVar4.N(fsjVar4.J((vn30) fsjVar4.d.e), 1021, new csj((byte) 0));
                break;
            case 4:
                qlo qloVar5 = (qlo) fck0Var.c;
                String str5 = vtt0.f38024a;
                fsj fsjVar5 = qloVar5.f28944a.s;
                fsjVar5.N(fsjVar5.M(), 1030, new t9f((byte) 27));
                break;
            case 5:
                qlo qloVar6 = (qlo) fck0Var.c;
                String str6 = vtt0.f38024a;
                fsj fsjVar6 = qloVar6.f28944a.s;
                fsjVar6.N(fsjVar6.M(), 1015, new csj((byte) 8));
                break;
            default:
                qlo qloVar7 = (qlo) fck0Var.c;
                String str7 = vtt0.f38024a;
                fsj fsjVar7 = qloVar7.f28944a.s;
                fsjVar7.N(fsjVar7.M(), 1017, new csj((byte) 5));
                break;
        }
    }

    public /* synthetic */ ffu0(fck0 fck0Var, long j, int i) {
        this.f9462a = (byte) 3;
        this.b = fck0Var;
    }

    public /* synthetic */ ffu0(fck0 fck0Var, androidx.media3.common.b bVar, alj aljVar) {
        this.f9462a = (byte) 6;
        this.b = fck0Var;
    }

    public /* synthetic */ ffu0(fck0 fck0Var, Object obj, byte b) {
        this.f9462a = b;
        this.b = fck0Var;
    }

    public /* synthetic */ ffu0(fck0 fck0Var, String str, long j, long j2) {
        this.f9462a = (byte) 0;
        this.b = fck0Var;
    }
}
