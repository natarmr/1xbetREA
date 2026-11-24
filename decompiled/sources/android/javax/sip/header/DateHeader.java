package android.javax.sip.header;

import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public interface DateHeader extends Header {
    public static final String NAME = "Date";

    Calendar getDate();

    void setDate(Calendar calendar);
}
