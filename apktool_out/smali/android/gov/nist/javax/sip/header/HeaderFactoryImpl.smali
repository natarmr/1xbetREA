.class public Landroid/gov/nist/javax/sip/header/HeaderFactoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/HeaderFactory;
.implements Landroid/gov/nist/javax/sip/header/HeaderFactoryExt;


# instance fields
.field private stripAddressScopeZones:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/header/HeaderFactoryImpl;->stripAddressScopeZones:Z

    .line 6
    .line 7
    const-string v0, "android.gov.nist.core.STRIP_ADDR_SCOPES"

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/header/HeaderFactoryImpl;->stripAddressScopeZones:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public createAcceptEncodingHeader(Ljava/lang/String;)Landroid/javax/sip/header/AcceptEncodingHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/AcceptEncoding;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/AcceptEncoding;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AcceptEncoding;->setEncoding(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "the encoding parameter is null"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createAcceptHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/AcceptHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance p0, Landroid/gov/nist/javax/sip/header/Accept;

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Accept;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Accept;->setContentType(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/header/Accept;->setContentSubType(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "contentType or subtype is null "

    .line 18
    .line 19
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public createAcceptLanguageHeader(Ljava/util/Locale;)Landroid/javax/sip/header/AcceptLanguageHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/AcceptLanguage;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/AcceptLanguage;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AcceptLanguage;->setAcceptLanguage(Ljava/util/Locale;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createAlertInfoHeader(Landroid/javax/sip/address/URI;)Landroid/javax/sip/header/AlertInfoHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/AlertInfo;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/AlertInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AlertInfo;->setAlertInfo(Landroid/javax/sip/address/URI;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null arg alertInfo"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createAllowEventsHeader(Ljava/lang/String;)Landroid/javax/sip/header/AllowEventsHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/AllowEvents;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/AllowEvents;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AllowEvents;->setEventType(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null arg eventType"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createAllowHeader(Ljava/lang/String;)Landroid/javax/sip/header/AllowHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Allow;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Allow;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Allow;->setMethod(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null arg method"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createAuthenticationInfoHeader(Ljava/lang/String;)Landroid/javax/sip/header/AuthenticationInfoHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/AuthenticationInfo;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/AuthenticationInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AuthenticationInfo;->setResponse(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null arg response"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createAuthorizationHeader(Ljava/lang/String;)Landroid/javax/sip/header/AuthorizationHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Authorization;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Authorization;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AuthenticationHeader;->setScheme(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null arg scheme "

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createCSeqHeader(ILjava/lang/String;)Landroid/javax/sip/header/CSeqHeader;
    .locals 2

    int-to-long v0, p1

    .line 40
    invoke-virtual {p0, v0, v1, p2}, Landroid/gov/nist/javax/sip/header/HeaderFactoryImpl;->createCSeqHeader(JLjava/lang/String;)Landroid/javax/sip/header/CSeqHeader;

    move-result-object p0

    return-object p0
.end method

.method public createCSeqHeader(JLjava/lang/String;)Landroid/javax/sip/header/CSeqHeader;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p0, p1, v0

    .line 4
    .line 5
    if-ltz p0, :cond_1

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    new-instance p0, Landroid/gov/nist/javax/sip/header/CSeq;

    .line 10
    .line 11
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/CSeq;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/header/CSeq;->setMethod(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, p2}, Landroid/gov/nist/javax/sip/header/CSeq;->setSeqNumber(J)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string p0, "null arg method"

    .line 22
    .line 23
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 29
    .line 30
    const-string p3, "bad arg "

    .line 31
    .line 32
    invoke-static {p1, p2, p3}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p0
.end method

.method public createCallIdHeader(Ljava/lang/String;)Landroid/javax/sip/header/CallIdHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/CallID;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/CallID;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/CallID;->setCallId(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null arg callId"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createCallInfoHeader(Landroid/javax/sip/address/URI;)Landroid/javax/sip/header/CallInfoHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/CallInfo;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/CallInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/CallInfo;->setInfo(Landroid/javax/sip/address/URI;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null arg callInfo"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createChargingVectorHeader(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/ims/PChargingVectorHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PChargingVector;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PChargingVector;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ims/PChargingVector;->setICID(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null icid arg!"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createContactHeader()Landroid/javax/sip/header/ContactHeader;
    .locals 1

    .line 19
    new-instance p0, Landroid/gov/nist/javax/sip/header/Contact;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Contact;-><init>()V

    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/Contact;->setWildCardFlag(Z)V

    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/Contact;->setExpires(I)V

    return-object p0
.end method

.method public createContactHeader(Landroid/javax/sip/address/Address;)Landroid/javax/sip/header/ContactHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Contact;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Contact;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Contact;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null arg address"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createContentDispositionHeader(Ljava/lang/String;)Landroid/javax/sip/header/ContentDispositionHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ContentDisposition;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ContentDisposition;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ContentDisposition;->setDispositionType(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null arg contentDisposition"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createContentEncodingHeader(Ljava/lang/String;)Landroid/javax/sip/header/ContentEncodingHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ContentEncoding;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ContentEncoding;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ContentEncoding;->setEncoding(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null encoding"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createContentLanguageHeader(Ljava/util/Locale;)Landroid/javax/sip/header/ContentLanguageHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ContentLanguage;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ContentLanguage;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ContentLanguage;->setContentLanguage(Ljava/util/Locale;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null arg contentLanguage"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createContentLengthHeader(I)Landroid/javax/sip/header/ContentLengthHeader;
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ContentLength;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ContentLength;->setContentLength(I)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "bad contentLength"

    .line 13
    .line 14
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createContentTypeHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/ContentTypeHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance p0, Landroid/gov/nist/javax/sip/header/ContentType;

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ContentType;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ContentType;->setContentType(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/header/ContentType;->setContentSubType(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "null contentType or subType"

    .line 18
    .line 19
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public createDateHeader(Ljava/util/Calendar;)Landroid/javax/sip/header/DateHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/SIPDateHeader;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/SIPDateHeader;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/SIPDateHeader;->setDate(Ljava/util/Calendar;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null date"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createErrorInfoHeader(Landroid/javax/sip/address/URI;)Landroid/javax/sip/header/ErrorInfoHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ErrorInfo;

    .line 4
    .line 5
    check-cast p1, Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/header/ErrorInfo;-><init>(Landroid/gov/nist/javax/sip/address/GenericURI;)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const-string p0, "null arg"

    .line 12
    .line 13
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public createEventHeader(Ljava/lang/String;)Landroid/javax/sip/header/EventHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Event;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Event;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Event;->setEventType(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null eventType"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createExpiresHeader(I)Landroid/javax/sip/header/ExpiresHeader;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Expires;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Expires;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Expires;->setExpires(I)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 13
    .line 14
    const-string v0, "bad value "

    .line 15
    .line 16
    invoke-static {p1, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public createExtensionHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/ExtensionHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ExtensionHeaderImpl;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ExtensionHeaderImpl;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ExtensionHeaderImpl;->setName(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/header/ExtensionHeaderImpl;->setValue(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "bad name"

    .line 16
    .line 17
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public createFromHeader(Landroid/javax/sip/address/Address;Ljava/lang/String;)Landroid/javax/sip/header/FromHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/From;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/From;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/From;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/header/From;->setTag(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object p0

    .line 17
    :cond_1
    const-string p0, "null address arg"

    .line 18
    .line 19
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public createHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;
    .locals 4

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->parseSIPHeader(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    instance-of v0, p0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    move-object v0, p0

    .line 19
    check-cast v0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x1

    .line 26
    const/4 v3, 0x0

    .line 27
    if-gt v1, v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    :try_start_0
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getMyClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Landroid/javax/sip/header/Header;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    return-object p0

    .line 48
    :catch_0
    move-exception p0

    .line 49
    goto :goto_0

    .line 50
    :catch_1
    move-exception p0

    .line 51
    goto :goto_1

    .line 52
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 53
    .line 54
    .line 55
    return-object v3

    .line 56
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    return-object v3

    .line 60
    :cond_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_1
    const-string p0, "Only singleton allowed "

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const/4 p1, 0x0

    .line 72
    invoke-static {p1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v3

    .line 76
    :cond_2
    return-object p0
.end method

.method public createHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/Header;
    .locals 1

    if-eqz p1, :cond_0

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string p1, ":"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 78
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/HeaderFactoryImpl;->createHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    move-result-object p0

    return-object p0

    .line 79
    :cond_0
    const-string p0, "header name is null"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createHeaders(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->parseSIPHeader(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SIPHeader;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of v0, p1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    check-cast p1, Landroid/gov/nist/javax/sip/header/SIPHeaderList;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const-string p1, "List of headers of this type is not allowed in a message"

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-static {v0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    const-string p1, "null arg!"

    .line 28
    .line 29
    invoke-static {p1}, La/hny;->u(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method public createInReplyToHeader(Ljava/lang/String;)Landroid/javax/sip/header/InReplyToHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/InReplyTo;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/InReplyTo;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/InReplyTo;->setCallId(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null callId arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createJoinHeader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/extensions/JoinHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/extensions/Join;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/extensions/Join;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/extensions/Join;->setCallId(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/header/extensions/Join;->setFromTag(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/header/extensions/Join;->setToTag(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public createMaxForwardsHeader(I)Landroid/javax/sip/header/MaxForwardsHeader;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/16 p0, 0xff

    .line 4
    .line 5
    if-gt p1, p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 8
    .line 9
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/MaxForwards;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/MaxForwards;->setMaxForwards(I)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 17
    .line 18
    const-string v0, "bad maxForwards arg "

    .line 19
    .line 20
    invoke-static {p1, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p0
.end method

.method public createMimeVersionHeader(II)Landroid/javax/sip/header/MimeVersionHeader;
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    if-ltz p2, :cond_0

    .line 4
    .line 5
    new-instance p0, Landroid/gov/nist/javax/sip/header/MimeVersion;

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/MimeVersion;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/MimeVersion;->setMajorVersion(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/header/MimeVersion;->setMinorVersion(I)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "bad major/minor version"

    .line 18
    .line 19
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public createMinExpiresHeader(I)Landroid/javax/sip/header/MinExpiresHeader;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/MinExpires;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/MinExpires;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/MinExpires;->setExpires(I)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 13
    .line 14
    const-string v0, "bad minExpires "

    .line 15
    .line 16
    invoke-static {p1, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public createMinSEHeader(I)Landroid/javax/sip/header/ExtensionHeader;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/extensions/MinSE;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/extensions/MinSE;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/extensions/MinSE;->setExpires(I)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 13
    .line 14
    const-string v0, "bad value "

    .line 15
    .line 16
    invoke-static {p1, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public createOrganizationHeader(Ljava/lang/String;)Landroid/javax/sip/header/OrganizationHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Organization;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Organization;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Organization;->setOrganization(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "bad organization arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createPAccessNetworkInfoHeader()Landroid/gov/nist/javax/sip/header/ims/PAccessNetworkInfoHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PAccessNetworkInfo;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PAccessNetworkInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createPAssertedIdentityHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PAssertedIdentityHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PAssertedIdentity;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PAssertedIdentity;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null address!"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createPAssertedServiceHeader()Landroid/gov/nist/javax/sip/header/ims/PAssertedServiceHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PAssertedService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PAssertedService;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createPAssociatedURIHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PAssociatedURIHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PAssociatedURI;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PAssociatedURI;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null associatedURI!"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createPCalledPartyIDHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PCalledPartyIDHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PCalledPartyID;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PCalledPartyID;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null address!"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createPChargingFunctionAddressesHeader()Landroid/gov/nist/javax/sip/header/ims/PChargingFunctionAddressesHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PChargingFunctionAddresses;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PChargingFunctionAddresses;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createPMediaAuthorizationHeader(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/ims/PMediaAuthorizationHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    if-eq p1, p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PMediaAuthorization;

    .line 8
    .line 9
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PMediaAuthorization;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ims/PMediaAuthorization;->setMediaAuthorizationToken(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "The Media-Authorization-Token parameter is null or empty"

    .line 17
    .line 18
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public createPPreferredIdentityHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PPreferredIdentityHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PPreferredIdentity;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PPreferredIdentity;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null address!"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createPPreferredServiceHeader()Landroid/gov/nist/javax/sip/header/ims/PPreferredServiceHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PPreferredService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PPreferredService;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createPProfileKeyHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PProfileKeyHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PProfileKey;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PProfileKey;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Address is null"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createPServedUserHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PServedUserHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PServedUser;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PServedUser;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Address is null"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createPUserDatabaseHeader(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/ims/PUserDatabaseHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p0, " "

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PUserDatabase;

    .line 12
    .line 13
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PUserDatabase;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ims/PUserDatabase;->setDatabaseName(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "Database name is null"

    .line 21
    .line 22
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public createPVisitedNetworkIDHeader()Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkIDHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkID;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createPathHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PathHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/Path;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/Path;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null address!"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createPriorityHeader(Ljava/lang/String;)Landroid/javax/sip/header/PriorityHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Priority;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Priority;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Priority;->setPriority(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "bad priority arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createPrivacyHeader(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/ims/PrivacyHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/Privacy;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/header/ims/Privacy;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    const-string p0, "null privacyType arg"

    .line 10
    .line 11
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public createProxyAuthenticateHeader(Ljava/lang/String;)Landroid/javax/sip/header/ProxyAuthenticateHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ProxyAuthenticate;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ProxyAuthenticate;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AuthenticationHeader;->setScheme(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "bad scheme arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createProxyAuthorizationHeader(Ljava/lang/String;)Landroid/javax/sip/header/ProxyAuthorizationHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ProxyAuthorization;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ProxyAuthorization;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AuthenticationHeader;->setScheme(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "bad scheme arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createProxyRequireHeader(Ljava/lang/String;)Landroid/javax/sip/header/ProxyRequireHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ProxyRequire;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ProxyRequire;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ProxyRequire;->setOptionTag(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "bad optionTag arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createRAckHeader(IILjava/lang/String;)Landroid/javax/sip/header/RAckHeader;
    .locals 6

    int-to-long v1, p1

    int-to-long v3, p2

    move-object v0, p0

    move-object v5, p3

    .line 41
    invoke-virtual/range {v0 .. v5}, Landroid/gov/nist/javax/sip/header/HeaderFactoryImpl;->createRAckHeader(JJLjava/lang/String;)Landroid/javax/sip/header/RAckHeader;

    move-result-object p0

    return-object p0
.end method

.method public createRAckHeader(JJLjava/lang/String;)Landroid/javax/sip/header/RAckHeader;
    .locals 3

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p5, :cond_1

    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p3, v0

    .line 7
    .line 8
    if-ltz v2, :cond_0

    .line 9
    .line 10
    cmp-long v0, p1, v0

    .line 11
    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    new-instance p0, Landroid/gov/nist/javax/sip/header/RAck;

    .line 15
    .line 16
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/RAck;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p5}, Landroid/gov/nist/javax/sip/header/RAck;->setMethod(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p3, p4}, Landroid/gov/nist/javax/sip/header/RAck;->setCSequenceNumber(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Landroid/gov/nist/javax/sip/header/RAck;->setRSequenceNumber(J)V

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    const-string p1, "bad cseq/rseq arg"

    .line 30
    .line 31
    invoke-static {p1}, La/itt0;->r(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    const-string p1, "Bad method"

    .line 36
    .line 37
    invoke-static {p1}, La/hny;->u(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method

.method public createRSeqHeader(I)Landroid/javax/sip/header/RSeqHeader;
    .locals 2

    int-to-long v0, p1

    .line 28
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/header/HeaderFactoryImpl;->createRSeqHeader(J)Landroid/javax/sip/header/RSeqHeader;

    move-result-object p0

    return-object p0
.end method

.method public createRSeqHeader(J)Landroid/javax/sip/header/RSeqHeader;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p0, p1, v0

    .line 4
    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Landroid/gov/nist/javax/sip/header/RSeq;

    .line 8
    .line 9
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/RSeq;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Landroid/gov/nist/javax/sip/header/RSeq;->setSeqNumber(J)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 17
    .line 18
    const-string v0, "invalid sequenceNumber arg "

    .line 19
    .line 20
    invoke-static {p1, p2, v0}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p0
.end method

.method public createReasonHeader(Ljava/lang/String;ILjava/lang/String;)Landroid/javax/sip/header/ReasonHeader;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    if-ltz p2, :cond_0

    .line 5
    .line 6
    new-instance p0, Landroid/gov/nist/javax/sip/header/Reason;

    .line 7
    .line 8
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Reason;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Reason;->setProtocol(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/header/Reason;->setCause(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/header/Reason;->setText(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string p1, "bad cause"

    .line 22
    .line 23
    invoke-static {p1}, La/itt0;->r(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    const-string p1, "bad protocol arg"

    .line 28
    .line 29
    invoke-static {p1}, La/hny;->u(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method public createRecordRouteHeader(Landroid/javax/sip/address/Address;)Landroid/javax/sip/header/RecordRouteHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/RecordRoute;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/RecordRoute;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Null argument!"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createReferToHeader(Landroid/javax/sip/address/Address;)Landroid/javax/sip/header/ReferToHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ReferTo;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ReferTo;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null address!"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createReferencesHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/extensions/ReferencesHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/extensions/References;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/extensions/References;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1}, Landroid/gov/nist/javax/sip/header/extensions/ReferencesHeader;->setCallId(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, p2}, Landroid/gov/nist/javax/sip/header/extensions/ReferencesHeader;->setRel(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public createReferredByHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/extensions/ReferredByHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/extensions/ReferredBy;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/extensions/ReferredBy;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null address!"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createReplacesHeader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/extensions/ReplacesHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/extensions/Replaces;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/extensions/Replaces;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/extensions/Replaces;->setCallId(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/header/extensions/Replaces;->setFromTag(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/header/extensions/Replaces;->setToTag(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public createReplyToHeader(Landroid/javax/sip/address/Address;)Landroid/javax/sip/header/ReplyToHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ReplyTo;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ReplyTo;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null address"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createRequestLine(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SipRequestLine;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/parser/RequestLineParser;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/RequestLineParser;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/RequestLineParser;->parse()Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public createRequireHeader(Ljava/lang/String;)Landroid/javax/sip/header/RequireHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Require;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Require;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Require;->setOptionTag(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null optionTag"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createRetryAfterHeader(I)Landroid/javax/sip/header/RetryAfterHeader;
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/RetryAfter;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/RetryAfter;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/RetryAfter;->setRetryAfter(I)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "bad retryAfter arg"

    .line 13
    .line 14
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createRouteHeader(Landroid/javax/sip/address/Address;)Landroid/javax/sip/header/RouteHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Route;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Route;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null address arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createSIPETagHeader(Ljava/lang/String;)Landroid/javax/sip/header/SIPETagHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/SIPETag;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/header/SIPETag;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createSIPIfMatchHeader(Ljava/lang/String;)Landroid/javax/sip/header/SIPIfMatchHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/SIPIfMatch;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/header/SIPIfMatch;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createSecurityClientHeader()Landroid/gov/nist/javax/sip/header/ims/SecurityClientHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/SecurityClient;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/SecurityClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createSecurityServerHeader()Landroid/gov/nist/javax/sip/header/ims/SecurityServerHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/SecurityServer;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/SecurityServer;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createSecurityVerifyHeader()Landroid/gov/nist/javax/sip/header/ims/SecurityVerifyHeader;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/SecurityVerify;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/SecurityVerify;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createServerHeader(Ljava/util/List;)Landroid/javax/sip/header/ServerHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Server;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Server;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Server;->setProduct(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null productList arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createServiceRouteHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/ServiceRouteHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/ims/ServiceRoute;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/ServiceRoute;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null address!"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createSessionExpiresHeader(I)Landroid/gov/nist/javax/sip/header/extensions/SessionExpiresHeader;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/extensions/SessionExpires;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/extensions/SessionExpires;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/extensions/SessionExpires;->setExpires(I)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 13
    .line 14
    const-string v0, "bad value "

    .line 15
    .line 16
    invoke-static {p1, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public createStatusLine(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SipStatusLine;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/parser/StatusLineParser;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/StatusLineParser;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/StatusLineParser;->parse()Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public createSubjectHeader(Ljava/lang/String;)Landroid/javax/sip/header/SubjectHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Subject;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Subject;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Subject;->setSubject(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null subject arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createSubscriptionStateHeader(Ljava/lang/String;)Landroid/javax/sip/header/SubscriptionStateHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/SubscriptionState;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/SubscriptionState;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/SubscriptionState;->setState(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null subscriptionState arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createSupportedHeader(Ljava/lang/String;)Landroid/javax/sip/header/SupportedHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Supported;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Supported;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Supported;->setOptionTag(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null optionTag arg"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createTimeStampHeader(F)Landroid/javax/sip/header/TimeStampHeader;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    cmpg-float p0, p1, p0

    .line 3
    .line 4
    if-ltz p0, :cond_0

    .line 5
    .line 6
    new-instance p0, Landroid/gov/nist/javax/sip/header/TimeStamp;

    .line 7
    .line 8
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/TimeStamp;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/TimeStamp;->setTimeStamp(F)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "illegal timeStamp"

    .line 16
    .line 17
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public createToHeader(Landroid/javax/sip/address/Address;Ljava/lang/String;)Landroid/javax/sip/header/ToHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/To;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/To;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->setAddress(Landroid/javax/sip/address/Address;)V

    .line 9
    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/header/To;->setTag(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object p0

    .line 17
    :cond_1
    const-string p0, "null address"

    .line 18
    .line 19
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public createUnsupportedHeader(Ljava/lang/String;)Landroid/javax/sip/header/UnsupportedHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Unsupported;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Unsupported;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Unsupported;->setOptionTag(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p1}, La/hny;->u(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public createUserAgentHeader(Ljava/util/List;)Landroid/javax/sip/header/UserAgentHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/UserAgent;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/UserAgent;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/UserAgent;->setProduct(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null user agent"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createViaHeader(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/ViaHeader;
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    if-eqz p3, :cond_3

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/header/Via;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/Via;-><init>()V

    .line 8
    .line 9
    .line 10
    if-eqz p4, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p4}, Landroid/gov/nist/javax/sip/header/Via;->setBranch(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/16 p4, 0x3a

    .line 16
    .line 17
    invoke-virtual {p1, p4}, Ljava/lang/String;->indexOf(I)I

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    if-ltz p4, :cond_2

    .line 22
    .line 23
    const/16 p4, 0x5b

    .line 24
    .line 25
    invoke-virtual {p1, p4}, Ljava/lang/String;->indexOf(I)I

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    if-gez p4, :cond_2

    .line 30
    .line 31
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/header/HeaderFactoryImpl;->stripAddressScopeZones:Z

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    const/16 p0, 0x25

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Ljava/lang/String;->indexOf(I)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    const/4 p4, -0x1

    .line 42
    if-eq p0, p4, :cond_1

    .line 43
    .line 44
    const/4 p4, 0x0

    .line 45
    invoke-virtual {p1, p4, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :cond_1
    const-string p0, "["

    .line 50
    .line 51
    const/16 p4, 0x5d

    .line 52
    .line 53
    invoke-static {p4, p0, p1}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :cond_2
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/Via;->setHost(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p2}, Landroid/gov/nist/javax/sip/header/Via;->setPort(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p3}, Landroid/gov/nist/javax/sip/header/Via;->setTransport(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_3
    const-string p0, "null arg"

    .line 68
    .line 69
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    return-object p0
.end method

.method public createWWWAuthenticateHeader(Ljava/lang/String;)Landroid/javax/sip/header/WWWAuthenticateHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/WWWAuthenticate;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/WWWAuthenticate;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/AuthenticationHeader;->setScheme(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "null scheme"

    .line 13
    .line 14
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public createWarningHeader(Ljava/lang/String;ILjava/lang/String;)Landroid/javax/sip/header/WarningHeader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/gov/nist/javax/sip/header/Warning;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Warning;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/Warning;->setAgent(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/header/Warning;->setCode(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/header/Warning;->setText(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string p0, "null arg"

    .line 19
    .line 20
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public setPrettyEncoding(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->setPrettyEncode(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
