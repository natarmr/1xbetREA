.class public final La/h70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/uw00;
.implements La/ufw0;


# static fields
.field public static final c:La/h70;

.field public static final d:La/h70;

.field public static final e:La/h70;

.field public static final f:La/h70;

.field public static final g:La/h70;

.field public static final h:La/h70;

.field public static final i:La/h70;

.field public static final j:La/h70;

.field public static final k:La/h70;

.field public static final l:La/h70;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/h70;

    .line 2
    .line 3
    const-string v1, "TINK"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/h70;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/h70;->c:La/h70;

    .line 10
    .line 11
    new-instance v0, La/h70;

    .line 12
    .line 13
    const-string v1, "CRUNCHY"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, La/h70;-><init>(Ljava/lang/String;B)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/h70;->d:La/h70;

    .line 19
    .line 20
    new-instance v0, La/h70;

    .line 21
    .line 22
    const-string v1, "NO_PREFIX"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, La/h70;-><init>(Ljava/lang/String;B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/h70;->e:La/h70;

    .line 28
    .line 29
    new-instance v0, La/h70;

    .line 30
    .line 31
    const-string v1, "SHA1"

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {v0, v1, v2}, La/h70;-><init>(Ljava/lang/String;B)V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/h70;->f:La/h70;

    .line 38
    .line 39
    new-instance v0, La/h70;

    .line 40
    .line 41
    const-string v1, "SHA224"

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, La/h70;-><init>(Ljava/lang/String;B)V

    .line 44
    .line 45
    .line 46
    sput-object v0, La/h70;->g:La/h70;

    .line 47
    .line 48
    new-instance v0, La/h70;

    .line 49
    .line 50
    const-string v1, "SHA256"

    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, La/h70;-><init>(Ljava/lang/String;B)V

    .line 53
    .line 54
    .line 55
    sput-object v0, La/h70;->h:La/h70;

    .line 56
    .line 57
    new-instance v0, La/h70;

    .line 58
    .line 59
    const-string v1, "SHA384"

    .line 60
    .line 61
    invoke-direct {v0, v1, v2}, La/h70;-><init>(Ljava/lang/String;B)V

    .line 62
    .line 63
    .line 64
    sput-object v0, La/h70;->i:La/h70;

    .line 65
    .line 66
    new-instance v0, La/h70;

    .line 67
    .line 68
    const-string v1, "SHA512"

    .line 69
    .line 70
    invoke-direct {v0, v1, v2}, La/h70;-><init>(Ljava/lang/String;B)V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/h70;->j:La/h70;

    .line 74
    .line 75
    new-instance v0, La/h70;

    .line 76
    .line 77
    const-string v1, "TINK"

    .line 78
    .line 79
    const/4 v2, 0x2

    .line 80
    invoke-direct {v0, v1, v2}, La/h70;-><init>(Ljava/lang/String;B)V

    .line 81
    .line 82
    .line 83
    sput-object v0, La/h70;->k:La/h70;

    .line 84
    .line 85
    new-instance v0, La/h70;

    .line 86
    .line 87
    const-string v1, "NO_PREFIX"

    .line 88
    .line 89
    invoke-direct {v0, v1, v2}, La/h70;-><init>(Ljava/lang/String;B)V

    .line 90
    .line 91
    .line 92
    sput-object v0, La/h70;->l:La/h70;

    .line 93
    .line 94
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 14
    const/4 v0, 0x5

    iput-byte v0, p0, La/h70;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, La/h70;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/h70;->b:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 13
    iput-byte p2, p0, La/h70;->a:B

    iput-object p1, p0, La/h70;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/h70;->a:B

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, La/h70;->b:Ljava/lang/String;

    .line 17
    check-cast p2, Landroid/security/keystore/KeyGenParameterSpec;

    return-void
.end method


# virtual methods
.method public a(I[B[B)[B
    .locals 5

    .line 1
    sget-object v0, La/gix0;->c:La/gix0;

    .line 2
    .line 3
    iget-object p0, p0, La/h70;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, v0, La/gix0;->a:La/jix0;

    .line 6
    .line 7
    invoke-interface {v0, p0}, La/jix0;->zza(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljavax/crypto/Mac;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljavax/crypto/Mac;->getMacLength()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    mul-int/lit16 v1, v1, 0xff

    .line 18
    .line 19
    if-gt p1, v1, :cond_1

    .line 20
    .line 21
    new-array v1, p1, [B

    .line 22
    .line 23
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 24
    .line 25
    invoke-direct {v2, p2, p0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    new-array p2, p0, [B

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    move v3, p0

    .line 36
    :goto_0
    invoke-virtual {v0, p2}, Ljavax/crypto/Mac;->update([B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p3}, Ljavax/crypto/Mac;->update([B)V

    .line 40
    .line 41
    .line 42
    int-to-byte p2, v2

    .line 43
    invoke-virtual {v0, p2}, Ljavax/crypto/Mac;->update(B)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    array-length v4, p2

    .line 51
    add-int/2addr v4, v3

    .line 52
    if-ge v4, p1, :cond_0

    .line 53
    .line 54
    array-length v4, p2

    .line 55
    invoke-static {p2, p0, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 56
    .line 57
    .line 58
    array-length v4, p2

    .line 59
    add-int/2addr v3, v4

    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sub-int/2addr p1, v3

    .line 64
    invoke-static {p2, p0, v1, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_1
    const-string p0, "size too large"

    .line 69
    .line 70
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    return-object p0
.end method

.method public b([B[B)[B
    .locals 2

    .line 1
    sget-object v0, La/gix0;->c:La/gix0;

    .line 2
    .line 3
    iget-object p0, p0, La/h70;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, v0, La/gix0;->a:La/jix0;

    .line 6
    .line 7
    invoke-interface {v0, p0}, La/jix0;->zza(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljavax/crypto/Mac;

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    array-length v1, p2

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    .line 20
    .line 21
    invoke-direct {v1, p2, p0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    new-instance p2, Ljavax/crypto/spec/SecretKeySpec;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljavax/crypto/Mac;->getMacLength()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    new-array v1, v1, [B

    .line 35
    .line 36
    invoke-direct {p2, v1, p0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-virtual {v0, p1}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public k(Landroid/content/Intent;)Lcom/yandex/authsdk/YandexAuthToken;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "com.yandex.auth.EXTRA_OAUTH_TOKEN"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "com.yandex.auth.OAUTH_TOKEN_EXPIRES"

    .line 11
    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance p1, Lcom/yandex/authsdk/YandexAuthToken;

    .line 21
    .line 22
    iget-object p0, p0, La/h70;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {p1, v1, v2, v0, p0}, Lcom/yandex/authsdk/YandexAuthToken;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public l(Landroid/content/Intent;)La/d2w0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "com.yandex.auth.OAUTH_TOKEN_ERROR"

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, p0, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "com.yandex.auth.OAUTH_TOKEN_ERROR_MESSAGES"

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    new-instance p1, La/d2w0;

    .line 24
    .line 25
    invoke-direct {p1, p0}, La/d2w0;-><init>([Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    new-instance p0, La/d2w0;

    .line 30
    .line 31
    const-string p1, "connection.error"

    .line 32
    .line 33
    invoke-direct {p0, p1}, La/d2w0;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-byte v0, p0, La/h70;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "MasterKey{keyAlias="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/h70;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", isKeyStoreBacked="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :try_start_0
    const-string v1, "AndroidKeyStore"

    .line 29
    .line 30
    invoke-static {v1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-virtual {v1, v2}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p0
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    goto :goto_0

    .line 43
    :catch_0
    const/4 p0, 0x0

    .line 44
    :goto_0
    const-string v1, "}"

    .line 45
    .line 46
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_1
    iget-object p0, p0, La/h70;->b:Ljava/lang/String;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_2
    iget-object p0, p0, La/h70;->b:Ljava/lang/String;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_3
    iget-object p0, p0, La/h70;->b:Ljava/lang/String;

    .line 58
    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public zza()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "idToken"

    .line 7
    .line 8
    iget-object p0, p0, La/h70;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
