.class public final La/fcw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tmw0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/sxw0;La/b7x0;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/fcw0;->a:B

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, La/fcw0;->c:Ljava/lang/Object;

    .line 37
    iput-object p2, p0, La/fcw0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/tmw0;[B)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/fcw0;->a:B

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, La/fcw0;->c:Ljava/lang/Object;

    .line 40
    array-length p1, p2

    if-eqz p1, :cond_1

    array-length p1, p2

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    const-string p0, "identifier has an invalid length"

    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    .line 42
    :cond_1
    :goto_0
    iput-object p2, p0, La/fcw0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([BLa/icw0;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/fcw0;->a:B

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 44
    invoke-static {v0}, La/esw0;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    invoke-static {p1}, La/kvw0;->c([B)Ljavax/crypto/spec/SecretKeySpec;

    move-result-object p1

    iput-object p1, p0, La/fcw0;->c:Ljava/lang/Object;

    .line 46
    invoke-virtual {p2}, La/icw0;->b()[B

    move-result-object p1

    iput-object p1, p0, La/fcw0;->b:Ljava/lang/Object;

    return-void

    .line 47
    :cond_0
    const-string p0, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>([B[BB)V
    .locals 1

    .line 1
    iput-byte p3, p0, La/fcw0;->a:B

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p3, La/gxw0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p3, p1, v0}, La/gxw0;-><init>([BB)V

    .line 13
    .line 14
    .line 15
    iput-object p3, p0, La/fcw0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p2, p0, La/fcw0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance p3, La/gxw0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p3, p1, v0}, La/gxw0;-><init>([BB)V

    .line 27
    .line 28
    .line 29
    iput-object p3, p0, La/fcw0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object p2, p0, La/fcw0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public static a(La/krw0;)La/fcw0;
    .locals 3

    .line 1
    iget-object v0, p0, La/krw0;->a:La/mrw0;

    .line 2
    .line 3
    iget v1, v0, La/mrw0;->b:I

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    if-ne v1, v2, :cond_1

    .line 8
    .line 9
    iget v1, v0, La/mrw0;->c:I

    .line 10
    .line 11
    const/16 v2, 0x10

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    new-instance v0, La/fcw0;

    .line 16
    .line 17
    iget-object v1, p0, La/krw0;->b:La/rkt0;

    .line 18
    .line 19
    iget-object v1, v1, La/rkt0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, La/icw0;

    .line 22
    .line 23
    invoke-virtual {v1}, La/icw0;->b()[B

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object p0, p0, La/krw0;->c:La/icw0;

    .line 28
    .line 29
    invoke-direct {v0, v1, p0}, La/fcw0;-><init>([BLa/icw0;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 34
    .line 35
    iget v0, v0, La/mrw0;->c:I

    .line 36
    .line 37
    const-string v1, "Expected tag Size 16, got "

    .line 38
    .line 39
    invoke-static {v0, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 48
    .line 49
    iget v0, v0, La/mrw0;->b:I

    .line 50
    .line 51
    const-string v1, "Expected IV Size 12, got "

    .line 52
    .line 53
    invoke-static {v0, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0
.end method


# virtual methods
.method public final b([B[B)[B
    .locals 5

    .line 1
    iget-byte v0, p0, La/fcw0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/fcw0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "Decryption failed (OutputPrefix mismatch)."

    .line 6
    .line 7
    iget-object v3, p0, La/fcw0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v3, [B

    .line 14
    .line 15
    array-length v0, v3

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, La/fcw0;->e([B[B)[B

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v3, p1}, La/x7x0;->b([B[B)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    array-length v0, v3

    .line 30
    array-length v1, p1

    .line 31
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1, p2}, La/fcw0;->e([B[B)[B

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {v2}, La/hny;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-object v4

    .line 44
    :pswitch_0
    check-cast v3, [B

    .line 45
    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    array-length p0, p1

    .line 49
    array-length v0, v3

    .line 50
    add-int/lit8 v0, v0, 0x1c

    .line 51
    .line 52
    if-lt p0, v0, :cond_4

    .line 53
    .line 54
    invoke-static {v3, p1}, La/x7x0;->b([B[B)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    array-length p0, v3

    .line 61
    const/16 v0, 0xc

    .line 62
    .line 63
    invoke-static {p1, p0, v0}, La/kvw0;->a([BII)Ljava/security/spec/AlgorithmParameterSpec;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {}, La/kvw0;->b()Ljavax/crypto/Cipher;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/4 v4, 0x2

    .line 72
    check-cast v1, Ljavax/crypto/spec/SecretKeySpec;

    .line 73
    .line 74
    invoke-virtual {v2, v4, v1, p0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 75
    .line 76
    .line 77
    if-eqz p2, :cond_2

    .line 78
    .line 79
    array-length p0, p2

    .line 80
    if-eqz p0, :cond_2

    .line 81
    .line 82
    invoke-virtual {v2, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 83
    .line 84
    .line 85
    :cond_2
    array-length p0, v3

    .line 86
    add-int/2addr p0, v0

    .line 87
    array-length p2, p1

    .line 88
    array-length v1, v3

    .line 89
    sub-int/2addr p2, v1

    .line 90
    sub-int/2addr p2, v0

    .line 91
    invoke-virtual {v2, p1, p0, p2}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-static {v2}, La/hny;->o(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    const-string p0, "ciphertext too short"

    .line 101
    .line 102
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    const-string p0, "ciphertext is null"

    .line 107
    .line 108
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :goto_1
    return-object v4

    .line 112
    :pswitch_1
    check-cast v3, La/b7x0;

    .line 113
    .line 114
    invoke-virtual {v3, p1}, La/b7x0;->a([B)Ljava/lang/Iterable;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    :catch_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_6

    .line 127
    .line 128
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, La/sxw0;

    .line 133
    .line 134
    :try_start_0
    iget-object v0, v0, La/sxw0;->a:La/tmw0;

    .line 135
    .line 136
    invoke-interface {v0, p1, p2}, La/tmw0;->b([B[B)[B

    .line 137
    .line 138
    .line 139
    move-result-object v4
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    goto :goto_2

    .line 141
    :cond_6
    const-string p0, "decryption failed"

    .line 142
    .line 143
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :goto_2
    return-object v4

    .line 147
    :pswitch_2
    check-cast v1, La/tmw0;

    .line 148
    .line 149
    check-cast v3, [B

    .line 150
    .line 151
    array-length p0, v3

    .line 152
    if-nez p0, :cond_7

    .line 153
    .line 154
    invoke-interface {v1, p1, p2}, La/tmw0;->b([B[B)[B

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    goto :goto_3

    .line 159
    :cond_7
    invoke-static {v3, p1}, La/x7x0;->b([B[B)Z

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    if-eqz p0, :cond_8

    .line 164
    .line 165
    const/4 p0, 0x5

    .line 166
    array-length v0, p1

    .line 167
    invoke-static {p1, p0, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-interface {v1, p0, p2}, La/tmw0;->b([B[B)[B

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    goto :goto_3

    .line 176
    :cond_8
    const-string p0, "wrong prefix"

    .line 177
    .line 178
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :goto_3
    return-object v4

    .line 182
    :pswitch_3
    check-cast v3, [B

    .line 183
    .line 184
    array-length v0, v3

    .line 185
    if-nez v0, :cond_9

    .line 186
    .line 187
    invoke-virtual {p0, p1, p2}, La/fcw0;->d([B[B)[B

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    goto :goto_4

    .line 192
    :cond_9
    invoke-static {v3, p1}, La/x7x0;->b([B[B)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_a

    .line 197
    .line 198
    array-length v0, v3

    .line 199
    array-length v1, p1

    .line 200
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p0, p1, p2}, La/fcw0;->d([B[B)[B

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    goto :goto_4

    .line 209
    :cond_a
    invoke-static {v2}, La/hny;->o(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :goto_4
    return-object v4

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c([B[B)[B
    .locals 12

    .line 1
    iget-byte v0, p0, La/fcw0;->a:B

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    iget-object v2, p0, La/fcw0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, La/fcw0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    array-length v0, p1

    .line 13
    add-int/lit8 v0, v0, 0x1c

    .line 14
    .line 15
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v1}, La/s7x0;->a(I)[B

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    check-cast p0, La/gxw0;

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1, p1, p2}, La/c2;->N(Ljava/nio/ByteBuffer;[B[B[B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast v2, [B

    .line 36
    .line 37
    array-length p1, v2

    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    filled-new-array {v2, p0}, [[B

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, La/egm0;->B([[B)[B

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :goto_0
    return-object p0

    .line 50
    :pswitch_0
    check-cast v2, [B

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    invoke-static {v1}, La/s7x0;->a(I)[B

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    array-length v4, v3

    .line 60
    const/4 v5, 0x0

    .line 61
    invoke-static {v3, v5, v4}, La/kvw0;->a([BII)Ljava/security/spec/AlgorithmParameterSpec;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {}, La/kvw0;->b()Ljavax/crypto/Cipher;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    const/4 v7, 0x1

    .line 70
    check-cast p0, Ljavax/crypto/spec/SecretKeySpec;

    .line 71
    .line 72
    invoke-virtual {v6, v7, p0, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 73
    .line 74
    .line 75
    if-eqz p2, :cond_1

    .line 76
    .line 77
    array-length p0, p2

    .line 78
    if-eqz p0, :cond_1

    .line 79
    .line 80
    invoke-virtual {v6, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 81
    .line 82
    .line 83
    :cond_1
    array-length p0, p1

    .line 84
    invoke-virtual {v6, p0}, Ljavax/crypto/Cipher;->getOutputSize(I)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    array-length p2, v2

    .line 89
    const v4, 0x7ffffff3

    .line 90
    .line 91
    .line 92
    sub-int/2addr v4, p2

    .line 93
    if-gt p0, v4, :cond_3

    .line 94
    .line 95
    array-length p2, v2

    .line 96
    add-int/2addr p2, v1

    .line 97
    add-int/2addr p2, p0

    .line 98
    invoke-static {v2, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    array-length p2, v2

    .line 103
    invoke-static {v3, v5, v10, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 104
    .line 105
    .line 106
    array-length v9, p1

    .line 107
    array-length p2, v2

    .line 108
    add-int/lit8 v11, p2, 0xc

    .line 109
    .line 110
    const/4 v8, 0x0

    .line 111
    move-object v7, p1

    .line 112
    invoke-virtual/range {v6 .. v11}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-ne p1, p0, :cond_2

    .line 117
    .line 118
    move-object v0, v10

    .line 119
    goto :goto_1

    .line 120
    :cond_2
    const-string p0, "not enough data written"

    .line 121
    .line 122
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    const-string p0, "plaintext too long"

    .line 127
    .line 128
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    const-string p0, "plaintext is null"

    .line 133
    .line 134
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :goto_1
    return-object v0

    .line 138
    :pswitch_1
    move-object v7, p1

    .line 139
    check-cast p0, La/sxw0;

    .line 140
    .line 141
    iget-object p0, p0, La/sxw0;->a:La/tmw0;

    .line 142
    .line 143
    invoke-interface {p0, v7, p2}, La/tmw0;->c([B[B)[B

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    array-length p1, v7

    .line 148
    return-object p0

    .line 149
    :pswitch_2
    move-object v7, p1

    .line 150
    check-cast v2, [B

    .line 151
    .line 152
    array-length p1, v2

    .line 153
    check-cast p0, La/tmw0;

    .line 154
    .line 155
    if-nez p1, :cond_5

    .line 156
    .line 157
    invoke-interface {p0, v7, p2}, La/tmw0;->c([B[B)[B

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    goto :goto_2

    .line 162
    :cond_5
    invoke-interface {p0, v7, p2}, La/tmw0;->c([B[B)[B

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    filled-new-array {v2, p0}, [[B

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-static {p0}, La/egm0;->B([[B)[B

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    :goto_2
    return-object p0

    .line 175
    :pswitch_3
    move-object v7, p1

    .line 176
    array-length p1, v7

    .line 177
    add-int/lit8 p1, p1, 0x28

    .line 178
    .line 179
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    const/16 v0, 0x18

    .line 184
    .line 185
    invoke-static {v0}, La/s7x0;->a(I)[B

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 190
    .line 191
    .line 192
    check-cast p0, La/gxw0;

    .line 193
    .line 194
    invoke-virtual {p0, p1, v0, v7, p2}, La/c2;->N(Ljava/nio/ByteBuffer;[B[B[B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast v2, [B

    .line 202
    .line 203
    array-length p1, v2

    .line 204
    if-nez p1, :cond_6

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_6
    filled-new-array {v2, p0}, [[B

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-static {p0}, La/egm0;->B([[B)[B

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    :goto_3
    return-object p0

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d([B[B)[B
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/16 v1, 0x28

    .line 3
    .line 4
    if-lt v0, v1, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x18

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    array-length v2, p1

    .line 13
    sub-int/2addr v2, v0

    .line 14
    invoke-static {p1, v0, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p0, p0, La/fcw0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/gxw0;

    .line 21
    .line 22
    invoke-virtual {p0, p1, v1, p2}, La/c2;->O(Ljava/nio/ByteBuffer;[B[B)[B

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    const-string p0, "ciphertext too short"

    .line 28
    .line 29
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public e([B[B)[B
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/16 v1, 0x1c

    .line 3
    .line 4
    if-lt v0, v1, :cond_0

    .line 5
    .line 6
    const/16 v0, 0xc

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    array-length v2, p1

    .line 13
    sub-int/2addr v2, v0

    .line 14
    invoke-static {p1, v0, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p0, p0, La/fcw0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/gxw0;

    .line 21
    .line 22
    invoke-virtual {p0, p1, v1, p2}, La/c2;->O(Ljava/nio/ByteBuffer;[B[B)[B

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    const-string p0, "ciphertext too short"

    .line 28
    .line 29
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method
