package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class oho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sek f25274a;
    public static final oho b;
    public static final oho c;
    public static final oho d;
    public static final oho e;
    public static final oho f;
    public static final oho g;
    public static final /* synthetic */ oho[] h;

    static {
        oho ohoVar = new oho("Default", 0);
        b = ohoVar;
        oho ohoVar2 = new oho(TokenNames.L, 1);
        c = ohoVar2;
        oho ohoVar3 = new oho(TokenNames.M, 2);
        d = ohoVar3;
        oho ohoVar4 = new oho(TokenNames.S, 3);
        e = ohoVar4;
        oho ohoVar5 = new oho("XS", 4);
        f = ohoVar5;
        oho ohoVar6 = new oho("Undefined", 5);
        g = ohoVar6;
        h = new oho[]{ohoVar, ohoVar2, ohoVar3, ohoVar4, ohoVar5, ohoVar6};
        f25274a = new sek();
    }

    public static oho valueOf(String str) {
        return (oho) Enum.valueOf(oho.class, str);
    }

    public static oho[] values() {
        return (oho[]) h.clone();
    }
}
