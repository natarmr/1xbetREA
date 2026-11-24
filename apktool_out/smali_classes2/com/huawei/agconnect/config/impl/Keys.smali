.class public abstract Lcom/huawei/agconnect/config/impl/Keys;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/huawei/agconnect/config/impl/AesParam;)Ljavax/crypto/spec/SecretKeySpec;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/AesParam;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, Lcom/huawei/agconnect/config/impl/AesParam;->g:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/huawei/agconnect/config/impl/AesParam;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/huawei/agconnect/config/impl/AesParam;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/huawei/agconnect/config/impl/AesParam;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/huawei/agconnect/config/impl/AesParam;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget p0, p0, Lcom/huawei/agconnect/config/impl/AesParam;->f:I

    .line 14
    .line 15
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-nez v6, :cond_0

    .line 20
    .line 21
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-nez v6, :cond_0

    .line 32
    .line 33
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-nez v6, :cond_0

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-ne v6, v7, :cond_0

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-ne v6, v7, :cond_0

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    mul-int/lit8 v7, v1, 0x2

    .line 64
    .line 65
    if-ne v6, v7, :cond_0

    .line 66
    .line 67
    if-ltz p0, :cond_0

    .line 68
    .line 69
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-nez v6, :cond_0

    .line 74
    .line 75
    new-instance v6, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v7, "build aes key, iterationCount:"

    .line 78
    .line 79
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    const-string v7, "AGC_Keys"

    .line 90
    .line 91
    invoke-static {v7, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    invoke-static {v3}, Lcom/huawei/agconnect/config/impl/Hex;->a(Ljava/lang/String;)[B

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v4}, Lcom/huawei/agconnect/config/impl/Hex;->a(Ljava/lang/String;)[B

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v5}, Lcom/huawei/agconnect/config/impl/Hex;->a(Ljava/lang/String;)[B

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const/4 v6, -0x4

    .line 107
    invoke-static {v3, v6}, Lcom/huawei/agconnect/config/impl/Keys;->b([BI)V

    .line 108
    .line 109
    .line 110
    invoke-static {v3, v4}, Lcom/huawei/agconnect/config/impl/Keys;->d([B[B)[B

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    const/4 v4, 0x6

    .line 115
    invoke-static {v3, v4}, Lcom/huawei/agconnect/config/impl/Keys;->b([BI)V

    .line 116
    .line 117
    .line 118
    invoke-static {v3, v5}, Lcom/huawei/agconnect/config/impl/Keys;->d([B[B)[B

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-static {v3}, Lcom/huawei/agconnect/config/impl/Hex;->b([B)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-static {v0}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v4, Ljavax/crypto/spec/PBEKeySpec;

    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-static {v2}, Lcom/huawei/agconnect/config/impl/Hex;->a(Ljava/lang/String;)[B

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    mul-int/lit8 v1, v1, 0x8

    .line 141
    .line 142
    invoke-direct {v4, v3, v2, p0, v1}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v4}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    const-string v0, "build aes key end"

    .line 150
    .line 151
    invoke-static {v7, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 155
    .line 156
    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    const-string v1, "AES"

    .line 161
    .line 162
    invoke-direct {v0, p0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-object v0

    .line 166
    :cond_0
    const-string p0, "invalid data for generating the key."

    .line 167
    .line 168
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const/4 p0, 0x0

    .line 172
    return-object p0
.end method

.method public static b([BI)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p0

    .line 3
    if-ge v0, v1, :cond_1

    .line 4
    .line 5
    if-gez p1, :cond_0

    .line 6
    .line 7
    aget-byte v1, p0, v0

    .line 8
    .line 9
    neg-int v2, p1

    .line 10
    shl-int/2addr v1, v2

    .line 11
    int-to-byte v1, v1

    .line 12
    aput-byte v1, p0, v0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    aget-byte v1, p0, v0

    .line 16
    .line 17
    shr-int/2addr v1, p1

    .line 18
    int-to-byte v1, v1

    .line 19
    aput-byte v1, p0, v0

    .line 20
    .line 21
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-void
.end method

.method public static c(Ljavax/crypto/spec/SecretKeySpec;[B)[B
    .locals 5

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x11

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {p1, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v2, "AES/CBC/PKCS5Padding"

    .line 11
    .line 12
    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    .line 17
    .line 18
    invoke-direct {v3, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 19
    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-virtual {v2, v4, p0, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 23
    .line 24
    .line 25
    array-length p0, v0

    .line 26
    add-int/2addr p0, v1

    .line 27
    array-length v3, p1

    .line 28
    array-length v0, v0

    .line 29
    sub-int/2addr v3, v0

    .line 30
    sub-int/2addr v3, v1

    .line 31
    invoke-virtual {v2, p1, p0, v3}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_0
    const-string p0, "key or cipherText must not be null."

    .line 37
    .line 38
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public static d([B[B)[B
    .locals 4

    .line 1
    array-length v0, p0

    array-length v1, p1

    if-ne v0, v1, :cond_1

    array-length v0, p0

    new-array v0, v0, [B

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-byte v2, p0, v1

    aget-byte v3, p1, v1

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    const-string p0, "left and right must be the same length."

    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method
