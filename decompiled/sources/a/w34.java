package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w34 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38482a;
    public final /* synthetic */ xex b;

    public /* synthetic */ w34(xex xexVar, androidx.media3.common.b bVar, alj aljVar) {
        this.f38482a = (byte) 8;
        this.b = xexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f38482a;
        xex xexVar = this.b;
        switch (b) {
            case 0:
                qlo qloVar = (qlo) xexVar.b;
                String str = vtt0.f38024a;
                fsj fsjVar = qloVar.f28944a.s;
                fsjVar.N(fsjVar.M(), 1029, new t9f((byte) 21));
                break;
            case 1:
                qlo qloVar2 = (qlo) xexVar.b;
                String str2 = vtt0.f38024a;
                fsj fsjVar2 = qloVar2.f28944a.s;
                fsjVar2.N(fsjVar2.M(), 1011, new csj((byte) 16));
                break;
            case 2:
                qlo qloVar3 = (qlo) xexVar.b;
                String str3 = vtt0.f38024a;
                fsj fsjVar3 = qloVar3.f28944a.s;
                fsjVar3.N(fsjVar3.M(), 1010, new csj((byte) 17));
                break;
            case 3:
                qlo qloVar4 = (qlo) xexVar.b;
                String str4 = vtt0.f38024a;
                fsj fsjVar4 = qloVar4.f28944a.s;
                fsjVar4.N(fsjVar4.M(), 1032, new csj((byte) 18));
                break;
            case 4:
                qlo qloVar5 = (qlo) xexVar.b;
                String str5 = vtt0.f38024a;
                fsj fsjVar5 = qloVar5.f28944a.s;
                fsjVar5.N(fsjVar5.M(), 1008, new t9f((byte) 11));
                break;
            case 5:
                qlo qloVar6 = (qlo) xexVar.b;
                String str6 = vtt0.f38024a;
                fsj fsjVar6 = qloVar6.f28944a.s;
                fsjVar6.N(fsjVar6.M(), 1012, new csj((byte) 20));
                break;
            case 6:
                qlo qloVar7 = (qlo) xexVar.b;
                String str7 = vtt0.f38024a;
                fsj fsjVar7 = qloVar7.f28944a.s;
                fsjVar7.N(fsjVar7.M(), 1007, new t9f((byte) 26));
                break;
            case 7:
                qlo qloVar8 = (qlo) xexVar.b;
                String str8 = vtt0.f38024a;
                fsj fsjVar8 = qloVar8.f28944a.s;
                fsjVar8.N(fsjVar8.M(), 1014, new csj((byte) 11));
                break;
            case 8:
                qlo qloVar9 = (qlo) xexVar.b;
                String str9 = vtt0.f38024a;
                fsj fsjVar9 = qloVar9.f28944a.s;
                fsjVar9.N(fsjVar9.M(), 1009, new csj((byte) 7));
                break;
            default:
                qlo qloVar10 = (qlo) xexVar.b;
                String str10 = vtt0.f38024a;
                fsj fsjVar10 = qloVar10.f28944a.s;
                fsjVar10.N(fsjVar10.M(), 1031, new csj((byte) 14));
                break;
        }
    }

    public /* synthetic */ w34(xex xexVar, long j) {
        this.f38482a = (byte) 2;
        this.b = xexVar;
    }

    public /* synthetic */ w34(xex xexVar, int i, long j, long j2) {
        this.f38482a = (byte) 1;
        this.b = xexVar;
    }

    public /* synthetic */ w34(xex xexVar, Object obj, byte b) {
        this.f38482a = b;
        this.b = xexVar;
    }

    public /* synthetic */ w34(xex xexVar, String str, long j, long j2) {
        this.f38482a = (byte) 4;
        this.b = xexVar;
    }
}
