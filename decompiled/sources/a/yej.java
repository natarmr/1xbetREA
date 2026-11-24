package a;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class yej implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yej f42489a = new yej();
    public static final ewb0 b = x2x.j("Date", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String strZ = rkjVar.z();
        dfj dfjVar = dfj.UNIQUE_4;
        return gqw0.I0(strZ, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        Date date = (Date) obj;
        date.getClass();
        dfj dfjVar = dfj.UNIQUE_4;
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(date);
        str.getClass();
        bwnVar.E(str);
    }
}
