.class public final La/z8w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/wnh0;


# direct methods
.method public constructor <init>(La/wnh0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z8w0;->a:La/wnh0;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "AES/CBC/PKCS5Padding"

    .line 3
    .line 4
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 9
    .line 10
    const-string v3, "AES"

    .line 11
    .line 12
    invoke-direct {v2, p2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    .line 16
    .line 17
    invoke-direct {v3, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    invoke-virtual {v1, v4, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Lb;->b(Ljava/lang/String;)[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v1, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 36
    .line 37
    new-instance v2, Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct {v2, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {p2}, La/qx3;->n([B)V

    .line 43
    .line 44
    .line 45
    array-length p0, p1

    .line 46
    invoke-static {p1, v0, p0, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    invoke-static {p2}, La/qx3;->n([B)V

    .line 52
    .line 53
    .line 54
    array-length p2, p1

    .line 55
    invoke-static {p1, v0, p2, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 56
    .line 57
    .line 58
    throw p0
.end method

.method public static b(Ljava/lang/String;)[B
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v1, v0, 0x2

    .line 6
    .line 7
    new-array v1, v1, [B

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_0

    .line 11
    .line 12
    div-int/lit8 v3, v2, 0x2

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/16 v5, 0x10

    .line 19
    .line 20
    invoke-static {v4, v5}, Ljava/lang/Character;->digit(CI)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    shl-int/lit8 v4, v4, 0x4

    .line 25
    .line 26
    add-int/lit8 v6, v2, 0x1

    .line 27
    .line 28
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    invoke-static {v6, v5}, Ljava/lang/Character;->digit(CI)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    add-int/2addr v5, v4

    .line 37
    int-to-byte v4, v5

    .line 38
    aput-byte v4, v1, v3

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-object v1
.end method

.method public static c(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "AES/CBC/PKCS5Padding"

    .line 3
    .line 4
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 9
    .line 10
    const-string v3, "AES"

    .line 11
    .line 12
    invoke-direct {v2, p2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    .line 16
    .line 17
    invoke-direct {v3, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-virtual {v1, v4, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 22
    .line 23
    .line 24
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, Lb;->a([B)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    invoke-static {p2}, La/qx3;->n([B)V

    .line 45
    .line 46
    .line 47
    array-length p2, p1

    .line 48
    invoke-static {p1, v0, p2, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    invoke-static {p2}, La/qx3;->n([B)V

    .line 54
    .line 55
    .line 56
    array-length p2, p1

    .line 57
    invoke-static {p1, v0, p2, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 58
    .line 59
    .line 60
    throw p0
.end method

.method public static synthetic e(La/z8w0;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p2, p1, v0}, La/z8w0;->d(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method


# virtual methods
.method public final d(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/b9w0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/b9w0;

    .line 7
    .line 8
    iget v1, v0, La/b9w0;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/b9w0;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/b9w0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/b9w0;-><init>(La/z8w0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/b9w0;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/b9w0;->o:I

    .line 30
    .line 31
    iget-object v3, p0, La/z8w0;->a:La/wnh0;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v5, :cond_2

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, La/b9w0;->k:La/z8w0;

    .line 42
    .line 43
    iget-object p2, v0, La/b9w0;->j:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, [B

    .line 46
    .line 47
    iget-object p3, v0, La/b9w0;->i:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return-object p0

    .line 60
    :cond_2
    iget-boolean p3, v0, La/b9w0;->l:Z

    .line 61
    .line 62
    iget-object p2, v0, La/b9w0;->j:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, La/z8w0;

    .line 65
    .line 66
    iget-object v2, v0, La/b9w0;->i:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object p2, v0, La/b9w0;->i:Ljava/lang/String;

    .line 76
    .line 77
    iput-object p0, v0, La/b9w0;->j:Ljava/lang/Object;

    .line 78
    .line 79
    iput-boolean p3, v0, La/b9w0;->l:Z

    .line 80
    .line 81
    iput v5, v0, La/b9w0;->o:I

    .line 82
    .line 83
    move-object p1, v3

    .line 84
    check-cast p1, Lorg/xplatform/secret/impl/SecurityImpl;

    .line 85
    .line 86
    invoke-virtual {p1, p3, v0}, Lorg/xplatform/secret/impl/SecurityImpl;->f(ZLa/zje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v1, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object v2, p2

    .line 94
    move-object p2, p0

    .line 95
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, La/z8w0;->b(Ljava/lang/String;)[B

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    iput-object v2, v0, La/b9w0;->i:Ljava/lang/String;

    .line 105
    .line 106
    iput-object p2, v0, La/b9w0;->j:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object p0, v0, La/b9w0;->k:La/z8w0;

    .line 109
    .line 110
    iput-boolean p3, v0, La/b9w0;->l:Z

    .line 111
    .line 112
    iput v4, v0, La/b9w0;->o:I

    .line 113
    .line 114
    check-cast v3, Lorg/xplatform/secret/impl/SecurityImpl;

    .line 115
    .line 116
    invoke-virtual {v3, p3, v0}, Lorg/xplatform/secret/impl/SecurityImpl;->e(ZLa/zje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p1, v1, :cond_5

    .line 121
    .line 122
    :goto_2
    return-object v1

    .line 123
    :cond_5
    move-object p3, v2

    .line 124
    :goto_3
    check-cast p1, Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-static {p1}, La/z8w0;->b(Ljava/lang/String;)[B

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    :try_start_0
    invoke-static {p3, p0, p2}, La/z8w0;->a(Ljava/lang/String;[B[B)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    return-object p0

    .line 138
    :catch_0
    return-object p3

    .line 139
    :catch_1
    move-exception p0

    .line 140
    throw p0
.end method

.method public final f(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/n4w0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/n4w0;

    .line 7
    .line 8
    iget v1, v0, La/n4w0;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/n4w0;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/n4w0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/n4w0;-><init>(La/z8w0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/n4w0;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/n4w0;->o:I

    .line 30
    .line 31
    iget-object v3, p0, La/z8w0;->a:La/wnh0;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v5, :cond_2

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, La/n4w0;->k:La/z8w0;

    .line 42
    .line 43
    iget-object p2, v0, La/n4w0;->j:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, [B

    .line 46
    .line 47
    iget-object p3, v0, La/n4w0;->i:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return-object p0

    .line 60
    :cond_2
    iget-boolean p3, v0, La/n4w0;->l:Z

    .line 61
    .line 62
    iget-object p2, v0, La/n4w0;->j:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, La/z8w0;

    .line 65
    .line 66
    iget-object v2, v0, La/n4w0;->i:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object p2, v0, La/n4w0;->i:Ljava/lang/String;

    .line 76
    .line 77
    iput-object p0, v0, La/n4w0;->j:Ljava/lang/Object;

    .line 78
    .line 79
    iput-boolean p3, v0, La/n4w0;->l:Z

    .line 80
    .line 81
    iput v5, v0, La/n4w0;->o:I

    .line 82
    .line 83
    move-object p1, v3

    .line 84
    check-cast p1, Lorg/xplatform/secret/impl/SecurityImpl;

    .line 85
    .line 86
    invoke-virtual {p1, p3, v0}, Lorg/xplatform/secret/impl/SecurityImpl;->f(ZLa/zje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v1, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object v2, p2

    .line 94
    move-object p2, p0

    .line 95
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, La/z8w0;->b(Ljava/lang/String;)[B

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    iput-object v2, v0, La/n4w0;->i:Ljava/lang/String;

    .line 105
    .line 106
    iput-object p2, v0, La/n4w0;->j:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object p0, v0, La/n4w0;->k:La/z8w0;

    .line 109
    .line 110
    iput-boolean p3, v0, La/n4w0;->l:Z

    .line 111
    .line 112
    iput v4, v0, La/n4w0;->o:I

    .line 113
    .line 114
    check-cast v3, Lorg/xplatform/secret/impl/SecurityImpl;

    .line 115
    .line 116
    invoke-virtual {v3, p3, v0}, Lorg/xplatform/secret/impl/SecurityImpl;->e(ZLa/zje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p1, v1, :cond_5

    .line 121
    .line 122
    :goto_2
    return-object v1

    .line 123
    :cond_5
    move-object p3, v2

    .line 124
    :goto_3
    check-cast p1, Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-static {p1}, La/z8w0;->b(Ljava/lang/String;)[B

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    :try_start_0
    new-instance p1, La/klj;

    .line 134
    .line 135
    invoke-static {p3, p0, p2}, La/z8w0;->a(Ljava/lang/String;[B[B)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-direct {p1, p0, v5}, La/klj;-><init>(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    .line 141
    .line 142
    return-object p1

    .line 143
    :catch_0
    new-instance p0, La/klj;

    .line 144
    .line 145
    const/4 p1, 0x0

    .line 146
    invoke-direct {p0, p3, p1}, La/klj;-><init>(Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :catch_1
    move-exception p0

    .line 151
    throw p0
.end method

.method public final g(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, La/p5w0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/p5w0;

    .line 7
    .line 8
    iget v1, v0, La/p5w0;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/p5w0;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/p5w0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/p5w0;-><init>(La/z8w0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/p5w0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/p5w0;->n:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object v4, p0, La/z8w0;->a:La/wnh0;

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v6, :cond_2

    .line 39
    .line 40
    if-ne v2, v5, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, La/p5w0;->k:La/z8w0;

    .line 43
    .line 44
    iget-object p1, v0, La/p5w0;->j:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, [B

    .line 47
    .line 48
    iget-object v0, v0, La/p5w0;->i:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_2
    iget-object p1, v0, La/p5w0;->j:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, La/z8w0;

    .line 64
    .line 65
    iget-object v2, v0, La/p5w0;->i:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, v0, La/p5w0;->i:Ljava/lang/String;

    .line 75
    .line 76
    iput-object p0, v0, La/p5w0;->j:Ljava/lang/Object;

    .line 77
    .line 78
    iput v6, v0, La/p5w0;->n:I

    .line 79
    .line 80
    move-object p2, v4

    .line 81
    check-cast p2, Lorg/xplatform/secret/impl/SecurityImpl;

    .line 82
    .line 83
    invoke-virtual {p2, v3, v0}, Lorg/xplatform/secret/impl/SecurityImpl;->f(ZLa/zje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    if-ne p2, v1, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move-object v2, p1

    .line 91
    move-object p1, p0

    .line 92
    :goto_1
    check-cast p2, Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-static {p2}, La/z8w0;->b(Ljava/lang/String;)[B

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object v2, v0, La/p5w0;->i:Ljava/lang/String;

    .line 102
    .line 103
    iput-object p1, v0, La/p5w0;->j:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object p0, v0, La/p5w0;->k:La/z8w0;

    .line 106
    .line 107
    iput v5, v0, La/p5w0;->n:I

    .line 108
    .line 109
    check-cast v4, Lorg/xplatform/secret/impl/SecurityImpl;

    .line 110
    .line 111
    invoke-virtual {v4, v3, v0}, Lorg/xplatform/secret/impl/SecurityImpl;->e(ZLa/zje;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    if-ne p2, v1, :cond_5

    .line 116
    .line 117
    :goto_2
    return-object v1

    .line 118
    :cond_5
    move-object v0, v2

    .line 119
    :goto_3
    check-cast p2, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {p2}, La/z8w0;->b(Ljava/lang/String;)[B

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {v0, p0, p1}, La/z8w0;->c(Ljava/lang/String;[B[B)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0
.end method
