.class public final La/u9x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/r9x0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/v230;La/pru;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, La/u9x0;->a:Ljava/lang/Object;

    .line 32
    iput-object p2, p0, La/u9x0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([BLjava/security/Provider;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-static {v0}, La/esw0;->d(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 12
    .line 13
    const-string v1, "AES"

    .line 14
    .line 15
    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/u9x0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p2, p0, La/u9x0;->b:Ljava/lang/Object;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available"

    .line 24
    .line 25
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method


# virtual methods
.method public a()La/edu;
    .locals 4

    .line 1
    new-instance v0, La/edu;

    .line 2
    .line 3
    new-instance v1, La/lsn;

    .line 4
    .line 5
    new-instance v2, La/pyu;

    .line 6
    .line 7
    iget-object v3, p0, La/u9x0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/v230;

    .line 10
    .line 11
    invoke-direct {v2, v3}, La/pyu;-><init>(La/v230;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, La/lsn;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, La/art;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, La/u9x0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/pru;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2, p0}, La/edu;-><init>(La/lsn;La/art;La/pru;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public e([BI)[B
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-gt p2, v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/u9x0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/security/Provider;

    .line 8
    .line 9
    const-string v1, "AESCMAC"

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Mac;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object p0, p0, La/u9x0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljavax/crypto/spec/SecretKeySpec;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    array-length p1, p0

    .line 27
    if-ne p2, p1, :cond_0

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 36
    .line 37
    const-string p1, "outputLength must not be larger than 16"

    .line 38
    .line 39
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method
