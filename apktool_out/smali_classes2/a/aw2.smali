.class public abstract synthetic La/aw2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Ljava/lang/String;)Landroid/crypto/hpke/Hpke;
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/crypto/hpke/Hpke;->getInstance(Ljava/lang/String;)Landroid/crypto/hpke/Hpke;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b(Landroid/crypto/hpke/Hpke;Ljava/security/PublicKey;[B[B[B)Landroid/crypto/hpke/Message;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/crypto/hpke/Hpke;->seal(Ljava/security/PublicKey;[B[B[B)Landroid/crypto/hpke/Message;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic c(Landroid/net/ssl/EchConfigMismatchException;)Landroid/net/ssl/EchConfigList;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/net/ssl/EchConfigMismatchException;->getRetryConfigList()Landroid/net/ssl/EchConfigList;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic d([B)Landroid/net/ssl/EchConfigList;
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/net/ssl/EchConfigList;->fromBytes([B)Landroid/net/ssl/EchConfigList;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Ljavax/net/ssl/SSLException;)Landroid/net/ssl/EchConfigMismatchException;
    .locals 0

    .line 1
    check-cast p0, Landroid/net/ssl/EchConfigMismatchException;

    return-object p0
.end method

.method public static bridge synthetic f(Landroid/net/ssl/EchConfigMismatchException;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/net/ssl/EchConfigMismatchException;->getPublicHostname()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic g(Ljavax/net/ssl/SSLSocket;Landroid/net/ssl/EchConfigList;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroid/net/ssl/SSLSockets;->setEchConfigList(Ljavax/net/ssl/SSLSocket;Landroid/net/ssl/EchConfigList;)V

    return-void
.end method

.method public static bridge synthetic h(Ljavax/net/ssl/SSLException;)Z
    .locals 0

    .line 1
    instance-of p0, p0, Landroid/net/ssl/EchConfigMismatchException;

    return p0
.end method

.method public static bridge synthetic i(Landroid/crypto/hpke/Message;)[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/crypto/hpke/Message;->getEncapsulated()[B

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic j(Landroid/net/ssl/EchConfigList;)[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/net/ssl/EchConfigList;->toBytes()[B

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic k(Landroid/crypto/hpke/Message;)[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/crypto/hpke/Message;->getCiphertext()[B

    move-result-object p0

    return-object p0
.end method
