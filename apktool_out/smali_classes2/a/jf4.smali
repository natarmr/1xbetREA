.class public final synthetic La/jf4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xbf;
.implements La/jgd;
.implements La/iuo;
.implements La/yvb0;
.implements La/sky;
.implements La/rw3;
.implements La/sg00;


# static fields
.field public static final b:La/jf4;

.field public static final c:La/jf4;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/jf4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, La/jf4;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/jf4;->b:La/jf4;

    .line 8
    .line 9
    new-instance v0, La/jf4;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, La/jf4;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/jf4;->c:La/jf4;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/jf4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic e()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public static synthetic h(ILjava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic i(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is already attached to a FragmentManager."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " at "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic k(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, La/ff5;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic l(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic m(Ljava/lang/StringBuilder;II)V
    .locals 1

    .line 1
    const-string v0, " for item at position = "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " for viewType = "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic n(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic o(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(La/l7x;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, La/cjc;

    .line 2
    .line 3
    check-cast p1, La/j50;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-static {p1}, La/brm0;->a(I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "Can not use AES-CMAC in FIPS-mode."

    .line 17
    .line 18
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public b(La/dhi0;)La/l7x;
    .locals 13

    .line 1
    iget-byte p0, p0, La/jf4;->a:B

    .line 2
    .line 3
    const-string v0, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    .line 4
    .line 5
    const/16 v1, 0x18

    .line 6
    .line 7
    const/16 v2, 0xc

    .line 8
    .line 9
    const-string v3, "Unable to parse OutputPrefixType: "

    .line 10
    .line 11
    const/4 v4, 0x4

    .line 12
    const/4 v5, 0x1

    .line 13
    const/16 v6, 0x20

    .line 14
    .line 15
    const-string v7, "Only version 0 keys are accepted"

    .line 16
    .line 17
    const/4 v8, 0x2

    .line 18
    const/16 v9, 0x10

    .line 19
    .line 20
    const/4 v10, 0x3

    .line 21
    const/4 v11, 0x0

    .line 22
    check-cast p1, La/w4d0;

    .line 23
    .line 24
    packed-switch p0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    iget-object p0, p1, La/w4d0;->a:Ljava/lang/String;

    .line 28
    .line 29
    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_7

    .line 36
    .line 37
    :try_start_0
    iget-object p0, p1, La/w4d0;->c:La/og9;

    .line 38
    .line 39
    invoke-static {}, La/qso;->a()La/qso;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {p0, v0}, La/d70;->A(La/og9;La/qso;)La/d70;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, La/d70;->y()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_6

    .line 52
    .line 53
    sget-object v0, La/h70;->e:La/h70;

    .line 54
    .line 55
    invoke-virtual {p0}, La/d70;->x()La/og9;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, La/og9;->size()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eq v1, v9, :cond_1

    .line 64
    .line 65
    if-ne v1, v6, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 69
    .line 70
    const-string p1, "Invalid key size %d; only 16-byte and 32-byte AES keys are supported"

    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p0

    .line 88
    :cond_1
    :goto_0
    iget-object v2, p1, La/w4d0;->e:La/af80;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eq v6, v5, :cond_4

    .line 95
    .line 96
    if-eq v6, v8, :cond_3

    .line 97
    .line 98
    if-eq v6, v10, :cond_5

    .line 99
    .line 100
    if-ne v6, v4, :cond_2

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 104
    .line 105
    new-instance p1, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, La/af80;->b()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p0

    .line 125
    :cond_3
    :goto_1
    sget-object v0, La/h70;->d:La/h70;

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    sget-object v0, La/h70;->c:La/h70;

    .line 129
    .line 130
    :cond_5
    :goto_2
    new-instance v2, La/i70;

    .line 131
    .line 132
    invoke-direct {v2, v1, v0}, La/i70;-><init>(ILa/h70;)V

    .line 133
    .line 134
    .line 135
    new-instance v0, La/cu;

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    invoke-direct {v0, v10, v1}, La/cu;-><init>(BZ)V

    .line 139
    .line 140
    .line 141
    iput-object v11, v0, La/cu;->c:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v11, v0, La/cu;->d:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object v2, v0, La/cu;->b:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-virtual {p0}, La/d70;->x()La/og9;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0}, La/og9;->h()[B

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    new-instance v1, La/iw20;

    .line 156
    .line 157
    invoke-static {p0}, La/sg9;->a([B)La/sg9;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-direct {v1, p0}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iput-object v1, v0, La/cu;->c:Ljava/lang/Object;

    .line 165
    .line 166
    iget-object p0, p1, La/w4d0;->f:Ljava/lang/Integer;

    .line 167
    .line 168
    iput-object p0, v0, La/cu;->d:Ljava/lang/Object;

    .line 169
    .line 170
    invoke-virtual {v0}, La/cu;->b()La/e70;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    goto :goto_3

    .line 175
    :cond_6
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 176
    .line 177
    invoke-direct {p0, v7}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p0
    :try_end_0
    .catch La/ynx; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    :catch_0
    const-string p0, "Parsing AesGcmSivKey failed"

    .line 182
    .line 183
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_7
    const-string p0, "Wrong type URL in call to AesGcmSivParameters.parseParameters"

    .line 188
    .line 189
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :goto_3
    return-object v11

    .line 193
    :pswitch_0
    iget-object p0, p1, La/w4d0;->a:Ljava/lang/String;

    .line 194
    .line 195
    const-string v12, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    .line 196
    .line 197
    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    if-eqz p0, :cond_f

    .line 202
    .line 203
    :try_start_1
    iget-object p0, p1, La/w4d0;->c:La/og9;

    .line 204
    .line 205
    invoke-static {}, La/qso;->a()La/qso;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    invoke-static {p0, v12}, La/u60;->A(La/og9;La/qso;)La/u60;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-virtual {p0}, La/u60;->y()I

    .line 214
    .line 215
    .line 216
    move-result v12

    .line 217
    if-nez v12, :cond_e

    .line 218
    .line 219
    sget-object v7, La/y60;->e:La/y60;

    .line 220
    .line 221
    invoke-virtual {p0}, La/u60;->x()La/og9;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    invoke-virtual {v12}, La/og9;->size()I

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    if-eq v12, v9, :cond_9

    .line 230
    .line 231
    if-eq v12, v1, :cond_9

    .line 232
    .line 233
    if-ne v12, v6, :cond_8

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_8
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 237
    .line 238
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw p0

    .line 254
    :cond_9
    :goto_4
    iget-object v0, p1, La/w4d0;->e:La/af80;

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-eq v1, v5, :cond_c

    .line 261
    .line 262
    if-eq v1, v8, :cond_b

    .line 263
    .line 264
    if-eq v1, v10, :cond_d

    .line 265
    .line 266
    if-ne v1, v4, :cond_a

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 270
    .line 271
    new-instance p1, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, La/af80;->b()I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw p0

    .line 291
    :cond_b
    :goto_5
    sget-object v7, La/y60;->d:La/y60;

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_c
    sget-object v7, La/y60;->c:La/y60;

    .line 295
    .line 296
    :cond_d
    :goto_6
    new-instance v0, La/z60;

    .line 297
    .line 298
    invoke-direct {v0, v12, v2, v9, v7}, La/z60;-><init>(IIILa/y60;)V

    .line 299
    .line 300
    .line 301
    new-instance v1, La/es;

    .line 302
    .line 303
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 304
    .line 305
    .line 306
    iput-object v11, v1, La/es;->b:Ljava/lang/Object;

    .line 307
    .line 308
    iput-object v11, v1, La/es;->c:Ljava/lang/Object;

    .line 309
    .line 310
    iput-object v0, v1, La/es;->a:Ljava/lang/Object;

    .line 311
    .line 312
    invoke-virtual {p0}, La/u60;->x()La/og9;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-virtual {p0}, La/og9;->h()[B

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    new-instance v0, La/iw20;

    .line 321
    .line 322
    invoke-static {p0}, La/sg9;->a([B)La/sg9;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    invoke-direct {v0, p0}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    iput-object v0, v1, La/es;->b:Ljava/lang/Object;

    .line 330
    .line 331
    iget-object p0, p1, La/w4d0;->f:Ljava/lang/Integer;

    .line 332
    .line 333
    iput-object p0, v1, La/es;->c:Ljava/lang/Object;

    .line 334
    .line 335
    invoke-virtual {v1}, La/es;->b()La/v60;

    .line 336
    .line 337
    .line 338
    move-result-object v11

    .line 339
    goto :goto_7

    .line 340
    :cond_e
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 341
    .line 342
    invoke-direct {p0, v7}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    throw p0
    :try_end_1
    .catch La/ynx; {:try_start_1 .. :try_end_1} :catch_1

    .line 346
    :catch_1
    const-string p0, "Parsing AesGcmKey failed"

    .line 347
    .line 348
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    goto :goto_7

    .line 352
    :cond_f
    const-string p0, "Wrong type URL in call to AesGcmParameters.parseParameters"

    .line 353
    .line 354
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    :goto_7
    return-object v11

    .line 358
    :pswitch_1
    iget-object p0, p1, La/w4d0;->a:Ljava/lang/String;

    .line 359
    .line 360
    const-string v12, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    .line 361
    .line 362
    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result p0

    .line 366
    if-eqz p0, :cond_19

    .line 367
    .line 368
    :try_start_2
    iget-object p0, p1, La/w4d0;->c:La/og9;

    .line 369
    .line 370
    invoke-static {}, La/qso;->a()La/qso;

    .line 371
    .line 372
    .line 373
    move-result-object v12

    .line 374
    invoke-static {p0, v12}, La/i60;->B(La/og9;La/qso;)La/i60;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    invoke-virtual {p0}, La/i60;->z()I

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    if-nez v12, :cond_18

    .line 383
    .line 384
    sget-object v7, La/m60;->e:La/m60;

    .line 385
    .line 386
    invoke-virtual {p0}, La/i60;->x()La/og9;

    .line 387
    .line 388
    .line 389
    move-result-object v12

    .line 390
    invoke-virtual {v12}, La/og9;->size()I

    .line 391
    .line 392
    .line 393
    move-result v12

    .line 394
    if-eq v12, v9, :cond_11

    .line 395
    .line 396
    if-eq v12, v1, :cond_11

    .line 397
    .line 398
    if-ne v12, v6, :cond_10

    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_10
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 402
    .line 403
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    throw p0

    .line 419
    :cond_11
    :goto_8
    invoke-virtual {p0}, La/i60;->y()La/p60;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {v0}, La/p60;->y()I

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eq v0, v2, :cond_13

    .line 428
    .line 429
    if-ne v0, v9, :cond_12

    .line 430
    .line 431
    goto :goto_9

    .line 432
    :cond_12
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 433
    .line 434
    const-string p1, "Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes"

    .line 435
    .line 436
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw p0

    .line 452
    :cond_13
    :goto_9
    iget-object v1, p1, La/w4d0;->e:La/af80;

    .line 453
    .line 454
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    if-eq v2, v5, :cond_16

    .line 459
    .line 460
    if-eq v2, v8, :cond_15

    .line 461
    .line 462
    if-eq v2, v10, :cond_17

    .line 463
    .line 464
    if-ne v2, v4, :cond_14

    .line 465
    .line 466
    goto :goto_a

    .line 467
    :cond_14
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 468
    .line 469
    new-instance p1, Ljava/lang/StringBuilder;

    .line 470
    .line 471
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1}, La/af80;->b()I

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    throw p0

    .line 489
    :cond_15
    :goto_a
    sget-object v7, La/m60;->d:La/m60;

    .line 490
    .line 491
    goto :goto_b

    .line 492
    :cond_16
    sget-object v7, La/m60;->c:La/m60;

    .line 493
    .line 494
    :cond_17
    :goto_b
    new-instance v1, La/n60;

    .line 495
    .line 496
    invoke-direct {v1, v12, v0, v9, v7}, La/n60;-><init>(IIILa/m60;)V

    .line 497
    .line 498
    .line 499
    new-instance v0, La/nr;

    .line 500
    .line 501
    invoke-direct {v0, v10}, La/nr;-><init>(B)V

    .line 502
    .line 503
    .line 504
    iput-object v11, v0, La/nr;->c:Ljava/lang/Object;

    .line 505
    .line 506
    iput-object v11, v0, La/nr;->d:Ljava/lang/Object;

    .line 507
    .line 508
    iput-object v1, v0, La/nr;->b:Ljava/lang/Object;

    .line 509
    .line 510
    invoke-virtual {p0}, La/i60;->x()La/og9;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    invoke-virtual {p0}, La/og9;->h()[B

    .line 515
    .line 516
    .line 517
    move-result-object p0

    .line 518
    new-instance v1, La/iw20;

    .line 519
    .line 520
    invoke-static {p0}, La/sg9;->a([B)La/sg9;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    invoke-direct {v1, p0}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    iput-object v1, v0, La/nr;->c:Ljava/lang/Object;

    .line 528
    .line 529
    iget-object p0, p1, La/w4d0;->f:Ljava/lang/Integer;

    .line 530
    .line 531
    iput-object p0, v0, La/nr;->d:Ljava/lang/Object;

    .line 532
    .line 533
    invoke-virtual {v0}, La/nr;->a()La/j60;

    .line 534
    .line 535
    .line 536
    move-result-object v11

    .line 537
    goto :goto_c

    .line 538
    :cond_18
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 539
    .line 540
    invoke-direct {p0, v7}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    throw p0
    :try_end_2
    .catch La/ynx; {:try_start_2 .. :try_end_2} :catch_2

    .line 544
    :catch_2
    const-string p0, "Parsing AesEaxcKey failed"

    .line 545
    .line 546
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    goto :goto_c

    .line 550
    :cond_19
    const-string p0, "Wrong type URL in call to AesEaxParameters.parseParameters"

    .line 551
    .line 552
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    :goto_c
    return-object v11

    .line 556
    :pswitch_2
    iget-object p0, p1, La/w4d0;->a:Ljava/lang/String;

    .line 557
    .line 558
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 559
    .line 560
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result p0

    .line 564
    if-eqz p0, :cond_1c

    .line 565
    .line 566
    :try_start_3
    iget-object p0, p1, La/w4d0;->c:La/og9;

    .line 567
    .line 568
    invoke-static {}, La/qso;->a()La/qso;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-static {p0, v0}, La/i50;->B(La/og9;La/qso;)La/i50;

    .line 573
    .line 574
    .line 575
    move-result-object p0

    .line 576
    invoke-virtual {p0}, La/i50;->z()I

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-nez v0, :cond_1b

    .line 581
    .line 582
    new-instance v0, La/oif0;

    .line 583
    .line 584
    invoke-direct {v0, v8}, La/oif0;-><init>(B)V

    .line 585
    .line 586
    .line 587
    iput-object v11, v0, La/oif0;->b:Ljava/lang/Object;

    .line 588
    .line 589
    iput-object v11, v0, La/oif0;->c:Ljava/lang/Object;

    .line 590
    .line 591
    sget-object v1, La/p50;->f:La/p50;

    .line 592
    .line 593
    iput-object v1, v0, La/oif0;->d:Ljava/lang/Object;

    .line 594
    .line 595
    invoke-virtual {p0}, La/i50;->x()La/og9;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    invoke-virtual {v1}, La/og9;->size()I

    .line 600
    .line 601
    .line 602
    move-result v1

    .line 603
    invoke-virtual {v0, v1}, La/oif0;->H(I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {p0}, La/i50;->y()La/s50;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    invoke-virtual {v1}, La/s50;->y()I

    .line 611
    .line 612
    .line 613
    move-result v1

    .line 614
    const/16 v2, 0xa

    .line 615
    .line 616
    if-lt v1, v2, :cond_1a

    .line 617
    .line 618
    if-lt v9, v1, :cond_1a

    .line 619
    .line 620
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    iput-object v1, v0, La/oif0;->c:Ljava/lang/Object;

    .line 625
    .line 626
    iget-object v1, p1, La/w4d0;->e:La/af80;

    .line 627
    .line 628
    invoke-static {v1}, La/t50;->a(La/af80;)La/p50;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    iput-object v1, v0, La/oif0;->d:Ljava/lang/Object;

    .line 633
    .line 634
    invoke-virtual {v0}, La/oif0;->d()La/q50;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    new-instance v1, La/phf0;

    .line 639
    .line 640
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 641
    .line 642
    .line 643
    iput-object v11, v1, La/phf0;->b:Ljava/lang/Object;

    .line 644
    .line 645
    iput-object v11, v1, La/phf0;->c:Ljava/lang/Object;

    .line 646
    .line 647
    iput-object v0, v1, La/phf0;->a:Ljava/lang/Object;

    .line 648
    .line 649
    invoke-virtual {p0}, La/i50;->x()La/og9;

    .line 650
    .line 651
    .line 652
    move-result-object p0

    .line 653
    invoke-virtual {p0}, La/og9;->h()[B

    .line 654
    .line 655
    .line 656
    move-result-object p0

    .line 657
    new-instance v0, La/iw20;

    .line 658
    .line 659
    invoke-static {p0}, La/sg9;->a([B)La/sg9;

    .line 660
    .line 661
    .line 662
    move-result-object p0

    .line 663
    invoke-direct {v0, p0}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    iput-object v0, v1, La/phf0;->b:Ljava/lang/Object;

    .line 667
    .line 668
    iget-object p0, p1, La/w4d0;->f:Ljava/lang/Integer;

    .line 669
    .line 670
    iput-object p0, v1, La/phf0;->c:Ljava/lang/Object;

    .line 671
    .line 672
    invoke-virtual {v1}, La/phf0;->d()La/j50;

    .line 673
    .line 674
    .line 675
    move-result-object v11

    .line 676
    goto :goto_d

    .line 677
    :cond_1a
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 678
    .line 679
    const-string p1, "Invalid tag size for AesCmacParameters: "

    .line 680
    .line 681
    invoke-static {v1, p1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object p1

    .line 685
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    throw p0

    .line 689
    :cond_1b
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 690
    .line 691
    invoke-direct {p0, v7}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    throw p0
    :try_end_3
    .catch La/ynx; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 695
    :catch_3
    const-string p0, "Parsing AesCmacKey failed"

    .line 696
    .line 697
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    goto :goto_d

    .line 701
    :cond_1c
    const-string p0, "Wrong type URL in call to AesCmacParameters.parseParameters"

    .line 702
    .line 703
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    :goto_d
    return-object v11

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, La/jf4;->a:B

    .line 2
    .line 3
    check-cast p1, La/m1r;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sparse-switch p0, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object p0, La/e68;->N1:La/cl5;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p0, La/e68;

    .line 17
    .line 18
    invoke-direct {p0}, La/e68;-><init>()V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :sswitch_0
    sget-object p0, La/cj4;->U1:La/gfk0;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance p0, La/cj4;

    .line 28
    .line 29
    invoke-direct {p0}, La/cj4;-><init>()V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :sswitch_1
    sget-object p0, La/ig4;->O1:La/rek0;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance p0, La/ig4;

    .line 39
    .line 40
    invoke-direct {p0}, La/ig4;-><init>()V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :sswitch_2
    sget-object p0, La/ze4;->g2:La/qek0;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance p0, La/ze4;

    .line 50
    .line 51
    invoke-direct {p0}, La/ze4;-><init>()V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x15 -> :sswitch_1
        0x16 -> :sswitch_0
    .end sparse-switch
.end method

.method public f()[La/fuo;
    .locals 2

    .line 1
    iget-byte p0, p0, La/jf4;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/y20;

    .line 9
    .line 10
    invoke-direct {p0, v1}, La/y20;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-array v0, v0, [La/fuo;

    .line 14
    .line 15
    aput-object p0, v0, v1

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance p0, La/h6;

    .line 19
    .line 20
    invoke-direct {p0}, La/h6;-><init>()V

    .line 21
    .line 22
    .line 23
    new-array v0, v0, [La/fuo;

    .line 24
    .line 25
    aput-object p0, v0, v1

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance p0, La/f6;

    .line 29
    .line 30
    invoke-direct {p0}, La/f6;-><init>()V

    .line 31
    .line 32
    .line 33
    new-array v0, v0, [La/fuo;

    .line 34
    .line 35
    aput-object p0, v0, v1

    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(ILa/k6z;)I
    .locals 1

    .line 1
    int-to-float p0, p1

    .line 2
    const/high16 p1, 0x40000000    # 2.0f

    .line 3
    .line 4
    div-float/2addr p0, p1

    .line 5
    sget-object p1, La/k6z;->a:La/k6z;

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    if-ne p2, p1, :cond_0

    .line 10
    .line 11
    const/high16 p1, -0x40800000    # -1.0f

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p1, v0

    .line 15
    :goto_0
    add-float/2addr v0, p1

    .line 16
    mul-float/2addr v0, p0

    .line 17
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 13

    .line 1
    iget-byte p0, p0, La/jf4;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/jsj;

    .line 7
    .line 8
    iget-object p0, p1, La/jsj;->a:La/osj;

    .line 9
    .line 10
    iget-object p0, p0, La/osj;->n:La/yox;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, La/yox;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/fm30;

    .line 17
    .line 18
    iget-object p1, p0, La/j16;->a:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter p1

    .line 21
    :try_start_0
    iget-object p0, p0, La/j16;->s:La/syj;

    .line 22
    .line 23
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    iget-object p0, p0, La/syj;->f:La/nyj;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p0, v0

    .line 34
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p0

    .line 36
    :cond_0
    :goto_0
    return-void

    .line 37
    :pswitch_0
    check-cast p1, La/ksj;

    .line 38
    .line 39
    iget-object p0, p1, La/ksj;->a:La/osj;

    .line 40
    .line 41
    iget-object v0, p0, La/osj;->j:La/ksj;

    .line 42
    .line 43
    if-eq p1, v0, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-boolean p1, p0, La/osj;->P:Z

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, La/osj;->Q:Z

    .line 52
    .line 53
    :cond_2
    :goto_1
    return-void

    .line 54
    :pswitch_1
    check-cast p1, La/ksj;

    .line 55
    .line 56
    iget-object p0, p1, La/ksj;->a:La/osj;

    .line 57
    .line 58
    iget-object v0, p0, La/osj;->j:La/ksj;

    .line 59
    .line 60
    if-eq p1, v0, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    iget-object p1, p0, La/osj;->n:La/yox;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-boolean p0, p0, La/osj;->R:Z

    .line 68
    .line 69
    if-eqz p0, :cond_4

    .line 70
    .line 71
    iget-object p0, p1, La/yox;->a:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, La/fm30;

    .line 74
    .line 75
    iget-object p0, p0, La/mm30;->i1:La/ylo;

    .line 76
    .line 77
    if-eqz p0, :cond_4

    .line 78
    .line 79
    invoke-virtual {p0}, La/ylo;->a()V

    .line 80
    .line 81
    .line 82
    :cond_4
    :goto_2
    return-void

    .line 83
    :pswitch_2
    check-cast p1, La/ksj;

    .line 84
    .line 85
    iget-object p0, p1, La/ksj;->a:La/osj;

    .line 86
    .line 87
    iget-object p0, p0, La/osj;->n:La/yox;

    .line 88
    .line 89
    if-eqz p0, :cond_5

    .line 90
    .line 91
    new-instance p1, La/rek0;

    .line 92
    .line 93
    const/16 v0, 0x18

    .line 94
    .line 95
    invoke-direct {p1, v0}, La/rek0;-><init>(B)V

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, La/yox;->a:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, La/fm30;

    .line 101
    .line 102
    iget-object p0, p0, La/fm30;->l2:La/xex;

    .line 103
    .line 104
    iget-object v0, p0, La/xex;->a:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Landroid/os/Handler;

    .line 107
    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    new-instance v1, La/w34;

    .line 111
    .line 112
    const/4 v2, 0x3

    .line 113
    invoke-direct {v1, p0, p1, v2}, La/w34;-><init>(La/xex;Ljava/lang/Object;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 117
    .line 118
    .line 119
    :cond_5
    return-void

    .line 120
    :pswitch_3
    check-cast p1, La/ksj;

    .line 121
    .line 122
    iget-object p0, p1, La/ksj;->a:La/osj;

    .line 123
    .line 124
    iget-object v0, p0, La/osj;->j:La/ksj;

    .line 125
    .line 126
    if-eq p1, v0, :cond_6

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    iget-object p1, p0, La/osj;->n:La/yox;

    .line 130
    .line 131
    if-eqz p1, :cond_8

    .line 132
    .line 133
    iget-object p1, p0, La/osj;->p:La/msj;

    .line 134
    .line 135
    iget v0, p1, La/msj;->b:I

    .line 136
    .line 137
    const/4 v1, -0x1

    .line 138
    if-eq v0, v1, :cond_7

    .line 139
    .line 140
    iget-object p1, p1, La/msj;->e:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p1, La/k34;

    .line 143
    .line 144
    iget p1, p1, La/k34;->f:I

    .line 145
    .line 146
    div-int/2addr p1, v0

    .line 147
    int-to-long v0, p1

    .line 148
    iget-object p1, p0, La/osj;->t:La/l44;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object p1, p1, La/l44;->a:Landroid/media/AudioTrack;

    .line 154
    .line 155
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    invoke-static {p1, v0, v1}, La/vtt0;->R(IJ)J

    .line 160
    .line 161
    .line 162
    move-result-wide v0

    .line 163
    goto :goto_3

    .line 164
    :cond_7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 170
    .line 171
    .line 172
    move-result-wide v2

    .line 173
    iget-wide v4, p0, La/osj;->Z:J

    .line 174
    .line 175
    sub-long v11, v2, v4

    .line 176
    .line 177
    iget-object p1, p0, La/osj;->n:La/yox;

    .line 178
    .line 179
    iget-object p0, p0, La/osj;->p:La/msj;

    .line 180
    .line 181
    iget-object p0, p0, La/msj;->e:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, La/k34;

    .line 184
    .line 185
    iget v8, p0, La/k34;->f:I

    .line 186
    .line 187
    invoke-static {v0, v1}, La/vtt0;->Y(J)J

    .line 188
    .line 189
    .line 190
    move-result-wide v9

    .line 191
    iget-object p0, p1, La/yox;->a:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p0, La/fm30;

    .line 194
    .line 195
    iget-object v7, p0, La/fm30;->l2:La/xex;

    .line 196
    .line 197
    iget-object p0, v7, La/xex;->a:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p0, Landroid/os/Handler;

    .line 200
    .line 201
    if-eqz p0, :cond_8

    .line 202
    .line 203
    new-instance v6, La/w34;

    .line 204
    .line 205
    invoke-direct/range {v6 .. v12}, La/w34;-><init>(La/xex;IJJ)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 209
    .line 210
    .line 211
    :cond_8
    :goto_4
    return-void

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p()V
    .locals 0

    .line 1
    return-void
.end method

.method public x0(La/pzu;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/firebase/abt/component/AbtRegistrar;->a(La/pzu;)La/c6;

    move-result-object p0

    return-object p0
.end method
