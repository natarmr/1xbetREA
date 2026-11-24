package android.gov.nist.javax.sip.header;

import android.javax.sip.header.DateHeader;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class SIPDateHeader extends SIPHeader implements DateHeader {
    private static final long serialVersionUID = 1734186339037274664L;
    protected SIPDate date;

    public SIPDateHeader() {
        super("Date");
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        SIPDateHeader sIPDateHeader = (SIPDateHeader) super.clone();
        SIPDate sIPDate = this.date;
        if (sIPDate != null) {
            sIPDateHeader.date = (SIPDate) sIPDate.clone();
        }
        return sIPDateHeader;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return this.date.encode(sb);
    }

    @Override // android.javax.sip.header.DateHeader
    public Calendar getDate() {
        SIPDate sIPDate = this.date;
        if (sIPDate == null) {
            return null;
        }
        return sIPDate.getJavaCal();
    }

    @Override // android.javax.sip.header.DateHeader
    public void setDate(Calendar calendar) {
        if (calendar != null) {
            this.date = new SIPDate(calendar.getTime().getTime());
        }
    }

    public void setDate(SIPDate sIPDate) {
        this.date = sIPDate;
    }
}
