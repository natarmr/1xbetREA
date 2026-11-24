.class public Landroid/gov/nist/javax/sdp/SdpEncoderImpl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public output(La/mji0;Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    instance-of p0, p2, Ljava/io/ObjectOutputStream;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    check-cast p2, Ljava/io/ObjectOutputStream;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "The parameter is null"

    .line 14
    .line 15
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    const-string p0, "The output stream has to be an instance of ObjectOutputStream"

    .line 20
    .line 21
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setEncoding(Ljava/lang/String;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/io/UnsupportedEncodingException;

    .line 2
    .line 3
    const-string p1, "Method not supported"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/io/UnsupportedEncodingException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public setRtpmapAttribute(Z)V
    .locals 0

    return-void
.end method

.method public setTypedTime(Z)V
    .locals 0

    return-void
.end method
