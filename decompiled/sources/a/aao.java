package a;

import android.javax.sip.message.Request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class aao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aao f537a;
    public static final aao b;
    public static final aao c;
    public static final /* synthetic */ aao[] d;

    static {
        aao aaoVar = new aao("REPLACE", 0);
        f537a = aaoVar;
        aao aaoVar2 = new aao("ADD", 1);
        b = aaoVar2;
        aao aaoVar3 = new aao(Request.CANCEL, 2);
        c = aaoVar3;
        d = new aao[]{aaoVar, aaoVar2, aaoVar3};
    }

    public static aao valueOf(String str) {
        return (aao) Enum.valueOf(aao.class, str);
    }

    public static aao[] values() {
        return (aao[]) d.clone();
    }
}
