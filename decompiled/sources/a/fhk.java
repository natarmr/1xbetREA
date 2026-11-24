package a;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.media.RingtoneManager;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class fhk extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9545a;
    public final /* synthetic */ nr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fhk(nr nrVar, byte b) {
        super(0);
        this.f9545a = b;
        this.b = nrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9545a;
        nr nrVar = this.b;
        switch (b) {
            case 0:
                AssetManager assetManager = (AssetManager) nrVar.c;
                assetManager.getClass();
                String[] locales = assetManager.getLocales();
                locales.getClass();
                ArrayList arrayList = new ArrayList(locales.length);
                for (String str : locales) {
                    arrayList.add(String.valueOf(str));
                }
                return (String[]) arrayList.toArray(new String[0]);
            case 1:
                Configuration configuration = (Configuration) nrVar.d;
                configuration.getClass();
                Locale locale = configuration.locale;
                locale.getClass();
                String country = locale.getCountry();
                country.getClass();
                return country;
            default:
                RingtoneManager ringtoneManager = (RingtoneManager) nrVar.b;
                ringtoneManager.getClass();
                Uri ringtoneUri = ringtoneManager.getRingtoneUri(0);
                ringtoneUri.getClass();
                String string = ringtoneUri.toString();
                string.getClass();
                return string;
        }
    }
}
