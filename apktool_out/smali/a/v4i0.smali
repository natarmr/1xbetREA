.class public final synthetic La/v4i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/w4i0;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements La/ybo0;
.implements La/xbf;
.implements La/n8q0;
.implements La/fps0;
.implements La/jgd;
.implements La/iuo;


# static fields
.field public static final b:La/v4i0;

.field public static final c:La/v4i0;

.field public static final d:La/v4i0;

.field public static final e:La/v4i0;

.field public static final f:La/v4i0;


# instance fields
.field public final synthetic a:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/v4i0;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/v4i0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/v4i0;->b:La/v4i0;

    .line 9
    .line 10
    new-instance v0, La/v4i0;

    .line 11
    .line 12
    const/16 v1, 0x11

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/v4i0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/v4i0;->c:La/v4i0;

    .line 18
    .line 19
    new-instance v0, La/v4i0;

    .line 20
    .line 21
    const/16 v1, 0x12

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/v4i0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/v4i0;->d:La/v4i0;

    .line 27
    .line 28
    new-instance v0, La/v4i0;

    .line 29
    .line 30
    const/16 v1, 0x13

    .line 31
    .line 32
    invoke-direct {v0, v1}, La/v4i0;-><init>(B)V

    .line 33
    .line 34
    .line 35
    sput-object v0, La/v4i0;->e:La/v4i0;

    .line 36
    .line 37
    new-instance v0, La/v4i0;

    .line 38
    .line 39
    const/16 v1, 0x14

    .line 40
    .line 41
    invoke-direct {v0, v1}, La/v4i0;-><init>(B)V

    .line 42
    .line 43
    .line 44
    sput-object v0, La/v4i0;->f:La/v4i0;

    .line 45
    .line 46
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/v4i0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/v4i0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic e()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public static synthetic h(FLjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic i(ILjava/lang/Object;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/net/ConnectException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Socket timeout error (8sec)"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic j(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic k(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/javax/sip/SipException;

    invoke-direct {v0, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic l(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, La/s89;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic m(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic n(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, La/fhi0;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic o(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic p(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(La/cgx0;)La/u4i0;
    .locals 11

    .line 1
    iget-byte p0, p0, La/v4i0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p1, La/cgx0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/u4i0;

    .line 9
    .line 10
    iget-object v0, p1, La/cgx0;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/hu5;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    sget-object p0, La/gqw0;->B1:La/gqw0;

    .line 17
    .line 18
    invoke-static {p1, p0}, La/qxw;->r(La/cgx0;La/qq8;)La/u4i0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto/16 :goto_8

    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, La/u4i0;->b:La/t4i0;

    .line 25
    .line 26
    iget-object v2, p0, La/u4i0;->a:La/t4i0;

    .line 27
    .line 28
    iget-boolean v3, p1, La/cgx0;->b:Z

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-static {p1, v0, v2}, La/qxw;->Z(La/cgx0;La/hu5;La/t4i0;)La/t4i0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v3, v2

    .line 37
    move-object v2, v1

    .line 38
    move-object v1, v3

    .line 39
    move-object v3, v0

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {p1, v0, v1}, La/qxw;->Z(La/cgx0;La/hu5;La/t4i0;)La/t4i0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    move-object v3, v2

    .line 46
    move-object v2, v0

    .line 47
    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    goto/16 :goto_8

    .line 54
    .line 55
    :cond_2
    invoke-virtual {p1}, La/cgx0;->q()La/fef;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    sget-object v0, La/fef;->a:La/fef;

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    const/4 v4, 0x0

    .line 63
    if-eq p0, v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, La/cgx0;->q()La/fef;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object v0, La/fef;->c:La/fef;

    .line 70
    .line 71
    if-ne p0, v0, :cond_3

    .line 72
    .line 73
    iget p0, v3, La/t4i0;->b:I

    .line 74
    .line 75
    iget v0, v2, La/t4i0;->b:I

    .line 76
    .line 77
    if-le p0, v0, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move p0, v4

    .line 81
    goto :goto_2

    .line 82
    :cond_4
    :goto_1
    move p0, v1

    .line 83
    :goto_2
    new-instance v0, La/u4i0;

    .line 84
    .line 85
    invoke-direct {v0, v3, v2, p0}, La/u4i0;-><init>(La/t4i0;La/t4i0;Z)V

    .line 86
    .line 87
    .line 88
    iget-object p0, p1, La/cgx0;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p0, La/hu5;

    .line 91
    .line 92
    iget-object v2, v0, La/u4i0;->a:La/t4i0;

    .line 93
    .line 94
    iget-wide v5, v2, La/t4i0;->c:J

    .line 95
    .line 96
    iget-object v3, v0, La/u4i0;->b:La/t4i0;

    .line 97
    .line 98
    iget-wide v7, v3, La/t4i0;->c:J

    .line 99
    .line 100
    cmp-long v5, v5, v7

    .line 101
    .line 102
    if-nez v5, :cond_5

    .line 103
    .line 104
    iget v5, v2, La/t4i0;->b:I

    .line 105
    .line 106
    iget v6, v3, La/t4i0;->b:I

    .line 107
    .line 108
    if-ne v5, v6, :cond_12

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_5
    iget-boolean v5, v0, La/u4i0;->c:Z

    .line 112
    .line 113
    if-eqz v5, :cond_6

    .line 114
    .line 115
    move-object v6, v2

    .line 116
    goto :goto_3

    .line 117
    :cond_6
    move-object v6, v3

    .line 118
    :goto_3
    iget v6, v6, La/t4i0;->b:I

    .line 119
    .line 120
    if-eqz v6, :cond_7

    .line 121
    .line 122
    goto/16 :goto_7

    .line 123
    .line 124
    :cond_7
    if-eqz v5, :cond_8

    .line 125
    .line 126
    move-object v5, v3

    .line 127
    goto :goto_4

    .line 128
    :cond_8
    move-object v5, v2

    .line 129
    :goto_4
    iget-object v6, p0, La/hu5;->e:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v6, La/a9q0;

    .line 132
    .line 133
    iget-object v6, v6, La/a9q0;->a:La/z8q0;

    .line 134
    .line 135
    iget-object v6, v6, La/z8q0;->a:La/j83;

    .line 136
    .line 137
    iget-object v6, v6, La/j83;->b:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    iget v5, v5, La/t4i0;->b:I

    .line 144
    .line 145
    if-eq v6, v5, :cond_9

    .line 146
    .line 147
    goto/16 :goto_7

    .line 148
    .line 149
    :cond_9
    :goto_5
    iget-object v5, p1, La/cgx0;->c:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v5, La/u4i0;

    .line 152
    .line 153
    iget-object v6, p0, La/hu5;->e:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v6, La/a9q0;

    .line 156
    .line 157
    iget-object v6, v6, La/a9q0;->a:La/z8q0;

    .line 158
    .line 159
    iget-object v6, v6, La/z8q0;->a:La/j83;

    .line 160
    .line 161
    iget-object v6, v6, La/j83;->b:Ljava/lang/String;

    .line 162
    .line 163
    if-eqz v5, :cond_12

    .line 164
    .line 165
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-nez v6, :cond_a

    .line 170
    .line 171
    goto/16 :goto_7

    .line 172
    .line 173
    :cond_a
    iget-boolean p1, p1, La/cgx0;->b:Z

    .line 174
    .line 175
    iget-object v6, p0, La/hu5;->e:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v6, La/a9q0;

    .line 178
    .line 179
    iget-object v6, v6, La/a9q0;->a:La/z8q0;

    .line 180
    .line 181
    iget-object v6, v6, La/z8q0;->a:La/j83;

    .line 182
    .line 183
    iget-object v6, v6, La/j83;->b:Ljava/lang/String;

    .line 184
    .line 185
    iget v7, p0, La/hu5;->b:I

    .line 186
    .line 187
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    const/4 v9, 0x2

    .line 192
    const/4 v10, 0x0

    .line 193
    if-nez v7, :cond_c

    .line 194
    .line 195
    invoke-static {v4, v6}, La/osm0;->i(ILjava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-eqz p1, :cond_b

    .line 200
    .line 201
    invoke-static {v2, p0, v5}, La/qxw;->v(La/t4i0;La/hu5;I)La/t4i0;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-static {v0, p0, v10, v1, v9}, La/u4i0;->a(La/u4i0;La/t4i0;La/t4i0;ZI)La/u4i0;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    goto :goto_8

    .line 210
    :cond_b
    invoke-static {v3, p0, v5}, La/qxw;->v(La/t4i0;La/hu5;I)La/t4i0;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-static {v0, v10, p0, v4, v1}, La/u4i0;->a(La/u4i0;La/t4i0;La/t4i0;ZI)La/u4i0;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    goto :goto_8

    .line 219
    :cond_c
    if-ne v7, v8, :cond_e

    .line 220
    .line 221
    invoke-static {v8, v6}, La/osm0;->j(ILjava/lang/String;)I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-eqz p1, :cond_d

    .line 226
    .line 227
    invoke-static {v2, p0, v5}, La/qxw;->v(La/t4i0;La/hu5;I)La/t4i0;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-static {v0, p0, v10, v4, v9}, La/u4i0;->a(La/u4i0;La/t4i0;La/t4i0;ZI)La/u4i0;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    goto :goto_8

    .line 236
    :cond_d
    invoke-static {v3, p0, v5}, La/qxw;->v(La/t4i0;La/hu5;I)La/t4i0;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-static {v0, v10, p0, v1, v1}, La/u4i0;->a(La/u4i0;La/t4i0;La/t4i0;ZI)La/u4i0;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    goto :goto_8

    .line 245
    :cond_e
    iget-boolean v5, v5, La/u4i0;->c:Z

    .line 246
    .line 247
    if-ne v5, v1, :cond_f

    .line 248
    .line 249
    move v4, v1

    .line 250
    :cond_f
    xor-int v5, p1, v4

    .line 251
    .line 252
    if-eqz v5, :cond_10

    .line 253
    .line 254
    invoke-static {v7, v6}, La/osm0;->j(ILjava/lang/String;)I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    goto :goto_6

    .line 259
    :cond_10
    invoke-static {v7, v6}, La/osm0;->i(ILjava/lang/String;)I

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    :goto_6
    if-eqz p1, :cond_11

    .line 264
    .line 265
    invoke-static {v2, p0, v5}, La/qxw;->v(La/t4i0;La/hu5;I)La/t4i0;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    invoke-static {v0, p0, v10, v4, v9}, La/u4i0;->a(La/u4i0;La/t4i0;La/t4i0;ZI)La/u4i0;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    goto :goto_8

    .line 274
    :cond_11
    invoke-static {v3, p0, v5}, La/qxw;->v(La/t4i0;La/hu5;I)La/t4i0;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-static {v0, v10, p0, v4, v1}, La/u4i0;->a(La/u4i0;La/t4i0;La/t4i0;ZI)La/u4i0;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    goto :goto_8

    .line 283
    :cond_12
    :goto_7
    move-object p0, v0

    .line 284
    :goto_8
    return-object p0

    .line 285
    :pswitch_0
    sget-object p0, La/rv00;->A:La/rv00;

    .line 286
    .line 287
    invoke-static {p1, p0}, La/qxw;->r(La/cgx0;La/qq8;)La/u4i0;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    return-object p0

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/m1r;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/ypn0;->h2:La/s9m0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance p0, La/ypn0;

    .line 12
    .line 13
    invoke-direct {p0}, La/ypn0;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public f()[La/fuo;
    .locals 7

    .line 1
    new-instance v0, La/xrs0;

    .line 2
    .line 3
    new-instance v4, La/coq0;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-direct {v4, v1, v2}, La/coq0;-><init>(J)V

    .line 8
    .line 9
    .line 10
    new-instance v5, La/tyj;

    .line 11
    .line 12
    sget-object p0, La/b4x;->b:La/v3x;

    .line 13
    .line 14
    sget-object p0, La/rcf0;->e:La/rcf0;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    invoke-direct {v5, v6, p0}, La/tyj;-><init>(ILjava/util/List;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    const/4 v2, 0x1

    .line 22
    sget-object v3, La/jfn0;->a:La/s9m0;

    .line 23
    .line 24
    invoke-direct/range {v0 .. v5}, La/xrs0;-><init>(IILa/jfn0;La/coq0;La/tyj;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    new-array p0, p0, [La/fuo;

    .line 29
    .line 30
    aput-object v0, p0, v6

    .line 31
    .line 32
    return-object p0
.end method

.method public g(La/tbo0;I)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/v4i0;->a:B

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p0, La/noq0;->m2:La/y2m0;

    .line 8
    .line 9
    iget-object p0, p1, La/tbo0;->e:La/vbo0;

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    sget-object p0, La/npn0;->j2:La/g9m0;

    .line 16
    .line 17
    iget-object p0, p1, La/tbo0;->e:La/vbo0;

    .line 18
    .line 19
    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/x15;

    .line 12
    .line 13
    sget-object p1, La/rv00;->s:La/rv00;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "Crashlytics report successfully enqueued to DataTransport: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, La/x15;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, La/rv00;->t(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/x15;->c:Ljava/io/File;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, "Deleted report file: "

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p1, p0}, La/rv00;->t(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v1, "Crashlytics could not delete report file: "

    .line 67
    .line 68
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const/4 v0, 0x0

    .line 83
    invoke-virtual {p1, p0, v0}, La/rv00;->E(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    const/4 p0, 0x1

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const-string p1, "FirebaseCrashlytics"

    .line 93
    .line 94
    const-string v0, "Crashlytics report could not be enqueued to DataTransport"

    .line 95
    .line 96
    invoke-static {p1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method

.method public x0(La/pzu;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, La/v4i0;->a:B

    packed-switch p0, :pswitch_data_0

    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->a(La/pzu;)La/mos0;

    move-result-object p0

    return-object p0

    :pswitch_0
    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->b(La/pzu;)La/mos0;

    move-result-object p0

    return-object p0

    :pswitch_1
    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->c(La/pzu;)La/mos0;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
