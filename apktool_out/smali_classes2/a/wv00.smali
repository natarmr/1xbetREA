.class public final La/wv00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k2x0;


# static fields
.field public static final b:Ljava/lang/Object;

.field public static volatile c:La/wv00;


# instance fields
.field public a:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/wv00;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(IB)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-byte p1, p0, La/wv00;->a:B

    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const/16 p2, 0x10

    .line 14
    .line 15
    if-eq p1, p2, :cond_1

    .line 16
    .line 17
    const/16 p2, 0x20

    .line 18
    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 23
    .line 24
    const-string p2, "Unsupported key length: "

    .line 25
    .line 26
    invoke-static {p1, p2}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :cond_1
    :goto_0
    iput-byte p1, p0, La/wv00;->a:B

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public static f()La/wv00;
    .locals 4

    .line 1
    sget-object v0, La/wv00;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, La/wv00;->c:La/wv00;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, La/wv00;

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, v2, v3}, La/wv00;-><init>(IB)V

    .line 13
    .line 14
    .line 15
    sput-object v1, La/wv00;->c:La/wv00;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    sget-object v1, La/wv00;->c:La/wv00;

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-object v1

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const/16 v2, 0x17

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const-string v2, "WM-"

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v2, 0x14

    .line 18
    .line 19
    if-lt v0, v2, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-byte p0, p0, La/wv00;->a:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-gt p0, v0, :cond_0

    .line 5
    .line 6
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public b([B[B[BI[B)[B
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    iget-byte p0, p0, La/wv00;->a:B

    .line 3
    .line 4
    if-ne v0, p0, :cond_4

    .line 5
    .line 6
    const/4 p0, 0x2

    .line 7
    invoke-static {p0}, La/esw0;->b(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    invoke-static {p1}, La/kvw0;->c([B)Ljavax/crypto/spec/SecretKeySpec;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    array-length v0, p2

    .line 19
    const/16 v2, 0xc

    .line 20
    .line 21
    if-ne v0, v2, :cond_2

    .line 22
    .line 23
    array-length v0, p3

    .line 24
    add-int/lit8 v2, p4, 0x10

    .line 25
    .line 26
    if-lt v0, v2, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    array-length v1, p2

    .line 30
    invoke-static {p2, v0, v1}, La/kvw0;->a([BII)Ljava/security/spec/AlgorithmParameterSpec;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {}, La/kvw0;->b()Ljavax/crypto/Cipher;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, p0, p1, p2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 39
    .line 40
    .line 41
    array-length p0, p5

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, p5}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 45
    .line 46
    .line 47
    :cond_0
    array-length p0, p3

    .line 48
    sub-int/2addr p0, p4

    .line 49
    invoke-virtual {v0, p3, p4, p0}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_1
    const-string p0, "ciphertext too short"

    .line 55
    .line 56
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    const-string p0, "iv is wrong size"

    .line 61
    .line 62
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    const-string p0, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    .line 67
    .line 68
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_4
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 73
    .line 74
    array-length p1, p1

    .line 75
    const-string p2, "Unexpected key length: "

    .line 76
    .line 77
    invoke-static {p1, p2}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-byte p0, p0, La/wv00;->a:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-gt p0, v0, :cond_0

    .line 5
    .line 6
    invoke-static {p1, p2, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-byte p0, p0, La/wv00;->a:B

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    if-gt p0, v0, :cond_0

    .line 5
    .line 6
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-byte p0, p0, La/wv00;->a:B

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    if-gt p0, v0, :cond_0

    .line 5
    .line 6
    invoke-static {p1, p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-byte p0, p0, La/wv00;->a:B

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-gt p0, v0, :cond_0

    .line 5
    .line 6
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public i(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-byte p0, p0, La/wv00;->a:B

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    if-gt p0, v0, :cond_0

    .line 5
    .line 6
    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-byte p0, p0, La/wv00;->a:B

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    if-gt p0, v0, :cond_0

    .line 5
    .line 6
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public zza()I
    .locals 0

    .line 1
    iget-byte p0, p0, La/wv00;->a:B

    .line 2
    .line 3
    return p0
.end method

.method public zzc()[B
    .locals 1

    .line 1
    iget-byte p0, p0, La/wv00;->a:B

    .line 2
    .line 3
    const/16 v0, 0x10

    .line 4
    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x20

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    sget-object p0, La/c3x0;->j:[B

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "Could not determine HPKE AEAD ID"

    .line 15
    .line 16
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, La/c3x0;->i:[B

    .line 22
    .line 23
    return-object p0
.end method
