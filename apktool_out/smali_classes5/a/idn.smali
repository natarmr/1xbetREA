.class public final synthetic La/idn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ctf0;

.field public final synthetic c:La/pru;

.field public final synthetic d:La/r9u;


# direct methods
.method public synthetic constructor <init>(La/ctf0;La/pru;La/r9u;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/idn;->a:B

    iput-object p1, p0, La/idn;->b:La/ctf0;

    iput-object p2, p0, La/idn;->c:La/pru;

    iput-object p3, p0, La/idn;->d:La/r9u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/r9u;La/pru;La/ctf0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/idn;->a:B

    iput-object p1, p0, La/idn;->d:La/r9u;

    iput-object p2, p0, La/idn;->c:La/pru;

    iput-object p3, p0, La/idn;->b:La/ctf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/idn;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/idn;->b:La/ctf0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x2

    .line 8
    iget-object v5, p0, La/idn;->c:La/pru;

    .line 9
    .line 10
    iget-object v6, p0, La/idn;->d:La/r9u;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v9, p1

    .line 17
    check-cast v9, La/m730;

    .line 18
    .line 19
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object p1, La/ygp;->c:La/ygp;

    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, v6, La/r9u;->a:La/j1q0;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, La/m1q0;->d(La/ygp;)Z

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object p1, p1, La/sff0;->h1:La/udl0;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    if-eq p1, v7, :cond_2

    .line 51
    .line 52
    if-eq p1, v4, :cond_1

    .line 53
    .line 54
    if-ne p1, v3, :cond_0

    .line 55
    .line 56
    sget-object p1, La/udl0;->e:La/udl0;

    .line 57
    .line 58
    :goto_0
    move-object v11, p1

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    sget-object p1, La/udl0;->d:La/udl0;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    sget-object p1, La/udl0;->c:La/udl0;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    sget-object p1, La/udl0;->b:La/udl0;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :goto_1
    sget-object p1, La/ygp;->o1:La/ygp;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, La/m1q0;->d(La/ygp;)Z

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    new-instance v8, La/bfw;

    .line 80
    .line 81
    iget-object v13, p0, La/idn;->b:La/ctf0;

    .line 82
    .line 83
    invoke-direct/range {v8 .. v13}, La/bfw;-><init>(La/m730;ZLa/udl0;ZLa/ctf0;)V

    .line 84
    .line 85
    .line 86
    move-object v2, v8

    .line 87
    :goto_2
    return-object v2

    .line 88
    :pswitch_0
    check-cast p1, La/b820;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 98
    .line 99
    iget-object p0, p0, La/mum0;->x:La/zvh0;

    .line 100
    .line 101
    sget-object v0, La/ygp;->F1:La/ygp;

    .line 102
    .line 103
    iget-object v2, v6, La/r9u;->a:La/j1q0;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 109
    .line 110
    invoke-virtual {v2, v0}, La/m1q0;->d(La/ygp;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    if-eqz v0, :cond_7

    .line 118
    .line 119
    iget-object v0, p1, La/b820;->m:La/ua20;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eq v0, v7, :cond_6

    .line 126
    .line 127
    if-eq v0, v4, :cond_5

    .line 128
    .line 129
    if-eq v0, v3, :cond_4

    .line 130
    .line 131
    sget-object p0, La/kun;->b:La/kun;

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_4
    new-instance v0, La/ecr;

    .line 135
    .line 136
    invoke-direct {v0, p1, v1, p0}, La/ecr;-><init>(La/b820;La/ctf0;La/zvh0;)V

    .line 137
    .line 138
    .line 139
    :goto_3
    move-object p0, v0

    .line 140
    goto :goto_4

    .line 141
    :cond_5
    new-instance v0, La/xa9;

    .line 142
    .line 143
    invoke-direct {v0, p1, v1, p0}, La/xa9;-><init>(La/b820;La/ctf0;La/zvh0;)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_6
    new-instance v0, La/mkw;

    .line 148
    .line 149
    invoke-direct {v0, p1, v1, p0}, La/mkw;-><init>(La/b820;La/ctf0;La/zvh0;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_7
    new-instance p1, La/uf60;

    .line 154
    .line 155
    const/4 v0, 0x0

    .line 156
    invoke-direct {p1, v1, p0, v0}, La/uf60;-><init>(La/ctf0;La/zvh0;B)V

    .line 157
    .line 158
    .line 159
    move-object p0, p1

    .line 160
    :goto_4
    return-object p0

    .line 161
    :pswitch_1
    check-cast p1, La/a820;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 171
    .line 172
    iget-object p0, p0, La/mum0;->x:La/zvh0;

    .line 173
    .line 174
    sget-object v0, La/ygp;->K1:La/ygp;

    .line 175
    .line 176
    iget-object v2, v6, La/r9u;->a:La/j1q0;

    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 182
    .line 183
    invoke-virtual {v2, v0}, La/m1q0;->d(La/ygp;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    if-eqz v0, :cond_b

    .line 191
    .line 192
    iget-object v0, p1, La/a820;->r:La/ua20;

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eq v0, v7, :cond_a

    .line 199
    .line 200
    if-eq v0, v4, :cond_9

    .line 201
    .line 202
    if-eq v0, v3, :cond_8

    .line 203
    .line 204
    sget-object p0, La/kun;->c:La/kun;

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_8
    new-instance v0, La/ecr;

    .line 208
    .line 209
    invoke-direct {v0, p1, v1, p0}, La/ecr;-><init>(La/a820;La/ctf0;La/zvh0;)V

    .line 210
    .line 211
    .line 212
    :goto_5
    move-object p0, v0

    .line 213
    goto :goto_6

    .line 214
    :cond_9
    new-instance v0, La/kh00;

    .line 215
    .line 216
    invoke-direct {v0, p1, v1, p0}, La/kh00;-><init>(La/a820;La/ctf0;La/zvh0;)V

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_a
    new-instance v0, La/op30;

    .line 221
    .line 222
    invoke-direct {v0, p1, v1, p0}, La/op30;-><init>(La/a820;La/ctf0;La/zvh0;)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_b
    new-instance p1, La/uf60;

    .line 227
    .line 228
    invoke-direct {p1, v1, p0, v7}, La/uf60;-><init>(La/ctf0;La/zvh0;B)V

    .line 229
    .line 230
    .line 231
    move-object p0, p1

    .line 232
    :goto_6
    return-object p0

    .line 233
    :pswitch_2
    move-object v1, p1

    .line 234
    check-cast v1, La/cdn;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    sget-object p1, La/ygp;->c:La/ygp;

    .line 240
    .line 241
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget-object v0, v6, La/r9u;->a:La/j1q0;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 250
    .line 251
    invoke-virtual {v0, p1}, La/m1q0;->d(La/ygp;)Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    iget-object v5, v5, La/sff0;->h1:La/udl0;

    .line 260
    .line 261
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-eqz v5, :cond_f

    .line 266
    .line 267
    if-eq v5, v7, :cond_e

    .line 268
    .line 269
    if-eq v5, v4, :cond_d

    .line 270
    .line 271
    if-ne v5, v3, :cond_c

    .line 272
    .line 273
    sget-object v2, La/udl0;->e:La/udl0;

    .line 274
    .line 275
    :goto_7
    move-object v3, v2

    .line 276
    goto :goto_8

    .line 277
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 278
    .line 279
    .line 280
    goto :goto_9

    .line 281
    :cond_d
    sget-object v2, La/udl0;->d:La/udl0;

    .line 282
    .line 283
    goto :goto_7

    .line 284
    :cond_e
    sget-object v2, La/udl0;->c:La/udl0;

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_f
    sget-object v2, La/udl0;->b:La/udl0;

    .line 288
    .line 289
    goto :goto_7

    .line 290
    :goto_8
    sget-object v2, La/ygp;->o1:La/ygp;

    .line 291
    .line 292
    invoke-virtual {v0, v2}, La/m1q0;->d(La/ygp;)Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    new-instance v0, La/hdn;

    .line 297
    .line 298
    iget-object v5, p0, La/idn;->b:La/ctf0;

    .line 299
    .line 300
    move v2, p1

    .line 301
    invoke-direct/range {v0 .. v5}, La/hdn;-><init>(La/cdn;ZLa/udl0;ZLa/ctf0;)V

    .line 302
    .line 303
    .line 304
    move-object v2, v0

    .line 305
    :goto_9
    return-object v2

    .line 306
    nop

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
