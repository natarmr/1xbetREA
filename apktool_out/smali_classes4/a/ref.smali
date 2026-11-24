.class public final La/ref;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mmy;


# direct methods
.method public constructor <init>(La/mmy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ref;->a:La/mmy;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/rhi0;Ljava/lang/String;)[B
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2}, La/ref;->b(La/rhi0;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object p2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    :try_start_0
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 24
    .line 25
    new-instance p2, Ljavax/crypto/spec/SecretKeySpec;

    .line 26
    .line 27
    const-string v0, "AES"

    .line 28
    .line 29
    invoke-direct {p2, p0, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    .line 33
    .line 34
    invoke-static {p3}, La/zvv;->c(Ljava/lang/String;)[B

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-direct {v0, p3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 39
    .line 40
    .line 41
    const-string p3, "AES/CBC/PKCS5Padding"

    .line 42
    .line 43
    invoke-static {p3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    const/4 v1, 0x2

    .line 48
    invoke-virtual {p3, v1, p2, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, La/zvv;->c(Ljava/lang/String;)[B

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p3, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 56
    .line 57
    .line 58
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    :goto_0
    const/4 p2, 0x0

    .line 64
    invoke-static {p0, p2}, Ljava/util/Arrays;->fill([BB)V

    .line 65
    .line 66
    .line 67
    return-object p1
.end method

.method public final b(La/rhi0;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    iget-object p0, p0, La/ref;->a:La/mmy;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    check-cast p0, Lorg/xplatform/secret/impl/KeysImpl;

    .line 14
    .line 15
    new-instance p1, La/din0;

    .line 16
    .line 17
    invoke-direct {p1, p0, v1, v0}, La/din0;-><init>(Lorg/xplatform/secret/impl/KeysImpl;ILa/yje;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 21
    .line 22
    invoke-static {p0, p1}, La/eeq;->U(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/lang/String;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_1
    check-cast p0, Lorg/xplatform/secret/impl/KeysImpl;

    .line 34
    .line 35
    new-instance p1, La/din0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {p1, p0, v1, v0}, La/din0;-><init>(Lorg/xplatform/secret/impl/KeysImpl;ILa/yje;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 42
    .line 43
    invoke-static {p0, p1}, La/eeq;->U(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/String;

    .line 48
    .line 49
    return-object p0
.end method
