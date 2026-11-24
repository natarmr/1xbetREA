package a;

import android.content.ContentResolver;
import android.provider.Settings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class l0j0 extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19206a;
    public final /* synthetic */ eyg0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0j0(eyg0 eyg0Var, String str, byte b) {
        super(0);
        this.f19206a = b;
        this.b = eyg0Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19206a;
        String str = this.c;
        eyg0 eyg0Var = this.b;
        switch (b) {
            case 0:
                ContentResolver contentResolver = (ContentResolver) eyg0Var.b;
                contentResolver.getClass();
                String string = Settings.Global.getString(contentResolver, str);
                string.getClass();
                return string;
            case 1:
                ContentResolver contentResolver2 = (ContentResolver) eyg0Var.b;
                contentResolver2.getClass();
                String string2 = Settings.Secure.getString(contentResolver2, str);
                string2.getClass();
                return string2;
            default:
                ContentResolver contentResolver3 = (ContentResolver) eyg0Var.b;
                contentResolver3.getClass();
                String string3 = Settings.System.getString(contentResolver3, str);
                string3.getClass();
                return string3;
        }
    }
}
