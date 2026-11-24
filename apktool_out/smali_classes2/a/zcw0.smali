.class public final La/zcw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ngw0;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "files"

    .line 5
    .line 6
    iput-object v0, p0, La/zcw0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v0, "common"

    .line 9
    .line 10
    iput-object v0, p0, La/zcw0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    sget-object v0, La/b9x0;->b:Landroid/accounts/Account;

    .line 13
    .line 14
    iput-object v0, p0, La/zcw0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    const-string v0, ""

    .line 17
    .line 18
    iput-object v0, p0, La/zcw0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {}, La/b4x;->l()La/u3x;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, La/zcw0;->f:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/zcw0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a()La/brw0;
    .locals 10

    .line 1
    iget-object v0, p0, La/zcw0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_f

    .line 7
    .line 8
    iget-object v0, p0, La/zcw0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/Integer;

    .line 11
    .line 12
    if-eqz v0, :cond_e

    .line 13
    .line 14
    iget-object v0, p0, La/zcw0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Integer;

    .line 17
    .line 18
    if-eqz v0, :cond_d

    .line 19
    .line 20
    iget-object v0, p0, La/zcw0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/Integer;

    .line 23
    .line 24
    if-eqz v0, :cond_c

    .line 25
    .line 26
    iget-object v2, p0, La/zcw0;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, La/fhn;

    .line 29
    .line 30
    if-eqz v2, :cond_b

    .line 31
    .line 32
    iget-object v2, p0, La/zcw0;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, La/arw0;

    .line 35
    .line 36
    if-eqz v2, :cond_a

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget-object v3, p0, La/zcw0;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, La/fhn;

    .line 45
    .line 46
    sget-object v4, La/fhn;->e:La/fhn;

    .line 47
    .line 48
    if-ne v3, v4, :cond_1

    .line 49
    .line 50
    const/16 v1, 0x14

    .line 51
    .line 52
    if-gt v2, v1, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 56
    .line 57
    const-string v1, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    .line 58
    .line 59
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0

    .line 71
    :cond_1
    sget-object v4, La/fhn;->f:La/fhn;

    .line 72
    .line 73
    if-ne v3, v4, :cond_3

    .line 74
    .line 75
    const/16 v1, 0x1c

    .line 76
    .line 77
    if-gt v2, v1, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 81
    .line 82
    const-string v1, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    .line 83
    .line 84
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :cond_3
    sget-object v4, La/fhn;->g:La/fhn;

    .line 97
    .line 98
    if-ne v3, v4, :cond_5

    .line 99
    .line 100
    const/16 v1, 0x20

    .line 101
    .line 102
    if-gt v2, v1, :cond_4

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 106
    .line 107
    const-string v1, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    .line 108
    .line 109
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :cond_5
    sget-object v4, La/fhn;->h:La/fhn;

    .line 122
    .line 123
    if-ne v3, v4, :cond_7

    .line 124
    .line 125
    const/16 v1, 0x30

    .line 126
    .line 127
    if-gt v2, v1, :cond_6

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_6
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 131
    .line 132
    const-string v1, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    .line 133
    .line 134
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p0

    .line 146
    :cond_7
    sget-object v4, La/fhn;->i:La/fhn;

    .line 147
    .line 148
    if-ne v3, v4, :cond_9

    .line 149
    .line 150
    const/16 v1, 0x40

    .line 151
    .line 152
    if-gt v2, v1, :cond_8

    .line 153
    .line 154
    :goto_0
    new-instance v3, La/brw0;

    .line 155
    .line 156
    iget-object v0, p0, La/zcw0;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Ljava/lang/Integer;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    iget-object v0, p0, La/zcw0;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Ljava/lang/Integer;

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    iget-object v0, p0, La/zcw0;->c:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Ljava/lang/Integer;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    iget-object v0, p0, La/zcw0;->d:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, Ljava/lang/Integer;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    iget-object v0, p0, La/zcw0;->f:Ljava/lang/Object;

    .line 189
    .line 190
    move-object v8, v0

    .line 191
    check-cast v8, La/arw0;

    .line 192
    .line 193
    iget-object p0, p0, La/zcw0;->e:Ljava/lang/Object;

    .line 194
    .line 195
    move-object v9, p0

    .line 196
    check-cast v9, La/fhn;

    .line 197
    .line 198
    invoke-direct/range {v3 .. v9}, La/brw0;-><init>(IIIILa/arw0;La/fhn;)V

    .line 199
    .line 200
    .line 201
    return-object v3

    .line 202
    :cond_8
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 203
    .line 204
    const-string v1, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    .line 205
    .line 206
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p0

    .line 218
    :cond_9
    const-string p0, "unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512"

    .line 219
    .line 220
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return-object v1

    .line 224
    :cond_a
    const-string p0, "variant is not set"

    .line 225
    .line 226
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-object v1

    .line 230
    :cond_b
    const-string p0, "hash type is not set"

    .line 231
    .line 232
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    return-object v1

    .line 236
    :cond_c
    const-string p0, "tag size is not set"

    .line 237
    .line 238
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    return-object v1

    .line 242
    :cond_d
    const-string p0, "iv size is not set"

    .line 243
    .line 244
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    return-object v1

    .line 248
    :cond_e
    const-string p0, "HMAC key size is not set"

    .line 249
    .line 250
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return-object v1

    .line 254
    :cond_f
    const-string p0, "AES key size is not set"

    .line 255
    .line 256
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    return-object v1
.end method

.method public b()La/xzw0;
    .locals 9

    .line 1
    iget-object v0, p0, La/zcw0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vzw0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    iget-object v2, p0, La/zcw0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, La/uzw0;

    .line 11
    .line 12
    if-eqz v2, :cond_6

    .line 13
    .line 14
    iget-object v2, p0, La/zcw0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, La/fpw0;

    .line 17
    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    iget-object v2, p0, La/zcw0;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, La/p50;

    .line 23
    .line 24
    if-eqz v2, :cond_4

    .line 25
    .line 26
    sget-object v2, La/vzw0;->e:La/vzw0;

    .line 27
    .line 28
    if-eq v0, v2, :cond_1

    .line 29
    .line 30
    iget-object v3, p0, La/zcw0;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, La/wzw0;

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p0, "Point format is not set"

    .line 38
    .line 39
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_1
    :goto_0
    if-ne v0, v2, :cond_3

    .line 44
    .line 45
    iget-object v0, p0, La/zcw0;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, La/wzw0;

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const-string p0, "For Curve25519 point format must not be set"

    .line 53
    .line 54
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_3
    :goto_1
    new-instance v2, La/xzw0;

    .line 59
    .line 60
    iget-object v0, p0, La/zcw0;->a:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v3, v0

    .line 63
    check-cast v3, La/vzw0;

    .line 64
    .line 65
    iget-object v0, p0, La/zcw0;->b:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v4, v0

    .line 68
    check-cast v4, La/uzw0;

    .line 69
    .line 70
    iget-object v0, p0, La/zcw0;->c:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v5, v0

    .line 73
    check-cast v5, La/wzw0;

    .line 74
    .line 75
    iget-object v0, p0, La/zcw0;->d:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v6, v0

    .line 78
    check-cast v6, La/fpw0;

    .line 79
    .line 80
    iget-object v0, p0, La/zcw0;->e:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v7, v0

    .line 83
    check-cast v7, La/p50;

    .line 84
    .line 85
    iget-object p0, p0, La/zcw0;->f:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v8, p0

    .line 88
    check-cast v8, La/icw0;

    .line 89
    .line 90
    invoke-direct/range {v2 .. v8}, La/xzw0;-><init>(La/vzw0;La/uzw0;La/wzw0;La/fpw0;La/p50;La/icw0;)V

    .line 91
    .line 92
    .line 93
    return-object v2

    .line 94
    :cond_4
    const-string p0, "Variant is not set"

    .line 95
    .line 96
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_5
    const-string p0, "DEM parameters are not set"

    .line 101
    .line 102
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object v1

    .line 106
    :cond_6
    const-string p0, "Hash type is not set"

    .line 107
    .line 108
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v1

    .line 112
    :cond_7
    const-string p0, "Elliptic curve type is not set"

    .line 113
    .line 114
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v1
.end method

.method public c(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    const-string v0, "*"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    :cond_0
    move-object p1, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1}, La/zcw0;->i(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    if-nez v1, :cond_5

    .line 23
    .line 24
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    move-object v0, p1

    .line 32
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_4

    .line 37
    .line 38
    invoke-virtual {p0, v0}, La/zcw0;->i(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    :goto_1
    move-object v1, p1

    .line 45
    goto :goto_2

    .line 46
    :cond_4
    iget-object p1, p0, La/zcw0;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lcom/google/firebase/auth/FirebaseAuth;

    .line 49
    .line 50
    iget-object p2, p1, Lcom/google/firebase/auth/FirebaseAuth;->e:La/fck0;

    .line 51
    .line 52
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v1, La/cew0;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    invoke-direct {v1, p1, v2}, La/cew0;-><init>(Ljava/lang/String;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v1}, La/fck0;->s(La/dgw0;)Lcom/google/android/gms/tasks/Task;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance p2, La/hcp0;

    .line 68
    .line 69
    invoke-direct {p2, p0, v0}, La/hcp0;-><init>(La/zcw0;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    goto :goto_1

    .line 77
    :cond_5
    :goto_2
    new-instance p1, La/owp0;

    .line 78
    .line 79
    invoke-direct {p1, p0, p3}, La/owp0;-><init>(La/zcw0;Lcom/google/android/recaptcha/RecaptchaAction;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p1}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public d(I)V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x18

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    .line 25
    .line 26
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

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
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, La/zcw0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    return-void
.end method

.method public e(La/fpw0;)V
    .locals 2

    .line 1
    sget-object v0, La/xzw0;->g:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, La/zcw0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "Invalid DEM parameters "

    .line 19
    .line 20
    const-string v1, "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."

    .line 21
    .line 22
    invoke-static {v0, p1, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public f(I)V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, La/zcw0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "Invalid key size in bytes %d; HMAC key must be at least 16 bytes"

    .line 23
    .line 24
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public g(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, La/b9x0;->a:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "Module must match [a-z]+(_[a-z]+)*: %s"

    .line 16
    .line 17
    invoke-static {v0, v2, v1}, La/aem0;->C(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, La/b9x0;->c:Ljava/util/Set;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    xor-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "Module name is reserved and cannot be used: %s"

    .line 33
    .line 34
    invoke-static {v0, v2, v1}, La/aem0;->C(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, La/zcw0;->c:Ljava/lang/Object;

    .line 38
    .line 39
    return-void
.end method

.method public h(La/xfw0;)V
    .locals 5

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 2
    .line 3
    new-instance v0, La/ajw0;

    .line 4
    .line 5
    iget-object v1, p0, La/zcw0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, La/zcw0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, p0, La/zcw0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v4, p0, La/zcw0;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Ljava/lang/String;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, La/s0x;->E(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, La/ajw0;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v2}, La/s0x;->E(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object v2, v0, La/ajw0;->b:Ljava/lang/String;

    .line 35
    .line 36
    iput-object v3, v0, La/ajw0;->c:Ljava/lang/String;

    .line 37
    .line 38
    iput-object v4, v0, La/ajw0;->d:Ljava/lang/String;

    .line 39
    .line 40
    iput-object p1, v0, La/ajw0;->e:Ljava/lang/String;

    .line 41
    .line 42
    iget-object p1, p0, La/zcw0;->f:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, La/nmt0;

    .line 45
    .line 46
    iget-object v1, p0, La/zcw0;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, La/hcp0;

    .line 49
    .line 50
    iget-object v2, p1, La/nmt0;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, La/ywq0;

    .line 53
    .line 54
    new-instance v3, La/mkt0;

    .line 55
    .line 56
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, v3, La/mkt0;->a:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object p0, v3, La/mkt0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object p1, v3, La/mkt0;->c:Ljava/lang/Object;

    .line 64
    .line 65
    iget-object p0, v2, La/ywq0;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, La/rfw0;

    .line 68
    .line 69
    iget-object p1, v2, La/ywq0;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Ljava/lang/String;

    .line 72
    .line 73
    const-string v1, "/signupNewUser"

    .line 74
    .line 75
    invoke-virtual {p0, v1, p1}, La/c2;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v1, La/ziw0;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, La/c2;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, La/fht0;

    .line 87
    .line 88
    invoke-static {p1, v0, v3, v1, p0}, La/hhm0;->G(Ljava/lang/String;La/ufw0;La/ngw0;La/xfw0;La/fht0;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public i(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 1
    iget-object v0, p0, La/zcw0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/zcw0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lcom/google/android/gms/tasks/Task;

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object p0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p0
.end method

.method public j(I)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x10

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, La/zcw0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes"

    .line 27
    .line 28
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public k(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    sget-object v0, La/b9x0;->a:Ljava/util/regex/Pattern;

    .line 15
    .line 16
    iput-object p1, p0, La/zcw0;->d:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public l()Landroid/net/Uri;
    .locals 10

    .line 1
    iget-object v0, p0, La/zcw0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, La/zcw0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    sget-object v2, La/y8x0;->a:Landroid/accounts/Account;

    .line 10
    .line 11
    iget-object v2, p0, La/zcw0;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Landroid/accounts/Account;

    .line 14
    .line 15
    iget-object v3, v2, Landroid/accounts/Account;->type:Ljava/lang/String;

    .line 16
    .line 17
    const/16 v4, 0x3a

    .line 18
    .line 19
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x1

    .line 25
    const/4 v6, -0x1

    .line 26
    if-ne v3, v6, :cond_0

    .line 27
    .line 28
    move v3, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v3, v4

    .line 31
    :goto_0
    const-string v7, "Account type contains \':\'."

    .line 32
    .line 33
    new-array v8, v4, [Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {v3, v7, v8}, La/aem0;->C(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v3, v2, Landroid/accounts/Account;->type:Ljava/lang/String;

    .line 39
    .line 40
    const/16 v7, 0x2f

    .line 41
    .line 42
    invoke-virtual {v3, v7}, Ljava/lang/String;->indexOf(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-ne v3, v6, :cond_1

    .line 47
    .line 48
    move v3, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v3, v4

    .line 51
    :goto_1
    const-string v8, "Account type contains \'/\'."

    .line 52
    .line 53
    new-array v9, v4, [Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {v3, v8, v9}, La/aem0;->C(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v3, v2, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v3, v7}, Ljava/lang/String;->indexOf(I)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-ne v3, v6, :cond_2

    .line 65
    .line 66
    move v3, v5

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    move v3, v4

    .line 69
    :goto_2
    const-string v6, "Account name contains \'/\'."

    .line 70
    .line 71
    new-array v4, v4, [Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {v3, v6, v4}, La/aem0;->C(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    sget-object v3, La/y8x0;->a:Landroid/accounts/Account;

    .line 77
    .line 78
    invoke-virtual {v3, v2}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    const-string v2, "shared"

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    iget-object v3, v2, Landroid/accounts/Account;->type:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v2, v2, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    add-int/2addr v4, v5

    .line 100
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    new-instance v7, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    add-int/2addr v4, v6

    .line 111
    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 112
    .line 113
    .line 114
    const-string v4, ":"

    .line 115
    .line 116
    invoke-static {v7, v3, v4, v2}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    :goto_3
    iget-object v3, p0, La/zcw0;->d:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v3, Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    add-int/lit8 v4, v4, 0x2

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    add-int/2addr v6, v4

    .line 135
    add-int/2addr v6, v5

    .line 136
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    add-int/2addr v4, v6

    .line 141
    add-int/2addr v4, v5

    .line 142
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    new-instance v6, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    add-int/2addr v4, v5

    .line 149
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 150
    .line 151
    .line 152
    const-string v4, "/"

    .line 153
    .line 154
    invoke-static {v6, v4, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v6, v4, v2, v4, v3}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object v1, p0, La/zcw0;->f:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, La/u3x;

    .line 164
    .line 165
    invoke-virtual {v1}, La/u3x;->g()La/rcf0;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    sget-object v2, La/l9x0;->a:Ljava/util/regex/Pattern;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_4

    .line 176
    .line 177
    const/4 v1, 0x0

    .line 178
    goto :goto_4

    .line 179
    :cond_4
    new-instance v2, La/pfw;

    .line 180
    .line 181
    const-string v3, "+"

    .line 182
    .line 183
    invoke-direct {v2, v3}, La/pfw;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v1}, La/pfw;->b(Ljava/util/List;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const-string v2, "transform="

    .line 191
    .line 192
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    :goto_4
    new-instance v2, Landroid/net/Uri$Builder;

    .line 197
    .line 198
    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    .line 199
    .line 200
    .line 201
    const-string v3, "android"

    .line 202
    .line 203
    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    iget-object p0, p0, La/zcw0;->a:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast p0, Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v2, p0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {p0, v0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    invoke-virtual {p0, v1}, Landroid/net/Uri$Builder;->encodedFragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0
.end method

.method public m(I)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, La/zcw0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "Invalid tag size in bytes %d; must be at least 10 bytes"

    .line 23
    .line 24
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public zza(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, La/msm0;->v(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, La/zcw0;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/hcp0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/hcp0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
