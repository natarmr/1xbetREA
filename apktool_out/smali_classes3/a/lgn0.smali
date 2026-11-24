.class public final La/lgn0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pru;

.field public final b:La/r9u;

.field public final c:La/wdk0;

.field public final d:La/ctf0;

.field public final e:La/ywu;


# direct methods
.method public constructor <init>(La/pru;La/r9u;La/wdk0;La/ctf0;La/ywu;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/lgn0;->a:La/pru;

    .line 14
    .line 15
    iput-object p2, p0, La/lgn0;->b:La/r9u;

    .line 16
    .line 17
    iput-object p3, p0, La/lgn0;->c:La/wdk0;

    .line 18
    .line 19
    iput-object p4, p0, La/lgn0;->d:La/ctf0;

    .line 20
    .line 21
    iput-object p5, p0, La/lgn0;->e:La/ywu;

    .line 22
    .line 23
    return-void
.end method

.method public static a(La/v1r;)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 2
    .line 3
    invoke-virtual {p0}, La/pmi;->p()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 26
    .line 27
    instance-of v1, v1, La/tgn0;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_0
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 34
    .line 35
    return-object v0
.end method


# virtual methods
.method public final b(La/bu6;)Z
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
    if-eqz p1, :cond_4

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iget-object p0, p0, La/lgn0;->b:La/r9u;

    .line 10
    .line 11
    if-eq p1, v1, :cond_3

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eq p1, v1, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    if-eq p1, v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    if-ne p1, v1, :cond_0

    .line 21
    .line 22
    sget-object p1, La/ygp;->z1:La/ygp;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, La/m1q0;->d(La/ygp;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 40
    .line 41
    .line 42
    return v0

    .line 43
    :cond_1
    sget-object p1, La/ygp;->x1:La/ygp;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/m1q0;->d(La/ygp;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0

    .line 60
    :cond_2
    sget-object p1, La/ygp;->u1:La/ygp;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/m1q0;->d(La/ygp;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    return p0

    .line 77
    :cond_3
    sget-object p1, La/ygp;->v1:La/ygp;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/m1q0;->d(La/ygp;)Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    return p0

    .line 94
    :cond_4
    return v0
.end method

.method public final c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V
    .locals 11

    .line 1
    iget-object v0, p2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/lgn0;->e:La/ywu;

    .line 7
    .line 8
    iget-object v1, v1, La/ywu;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/fvt0;

    .line 11
    .line 12
    iget-object v1, v1, La/fvt0;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/o3c;

    .line 15
    .line 16
    invoke-virtual {v1}, La/o3c;->w()La/pmi0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, La/pmi0;->i(La/pmi0;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-object v1, p0, La/lgn0;->a:La/pru;

    .line 32
    .line 33
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 38
    .line 39
    iget-object v2, v1, La/mum0;->c:La/bu6;

    .line 40
    .line 41
    iget-object v1, v1, La/mum0;->d:La/au6;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/4 v4, 0x0

    .line 48
    iget-object v5, p0, La/lgn0;->d:La/ctf0;

    .line 49
    .line 50
    const/4 v7, 0x2

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x1

    .line 53
    if-eqz v3, :cond_d

    .line 54
    .line 55
    const/4 v0, 0x3

    .line 56
    if-eq v3, v9, :cond_7

    .line 57
    .line 58
    if-eq v3, v7, :cond_7

    .line 59
    .line 60
    if-eq v3, v0, :cond_1

    .line 61
    .line 62
    const/4 v10, 0x4

    .line 63
    if-ne v3, v10, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    :goto_0
    invoke-virtual {p0, v2}, La/lgn0;->b(La/bu6;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/fragment/app/e;->a0()Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    if-eqz p3, :cond_2

    .line 88
    .line 89
    goto/16 :goto_6

    .line 90
    .line 91
    :cond_2
    sget-object p3, La/wfn0;->e2:La/s2m0;

    .line 92
    .line 93
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    sget-object p3, La/wfn0;->g2:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {p0, p3}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    if-eqz v3, :cond_3

    .line 103
    .line 104
    goto/16 :goto_6

    .line 105
    .line 106
    :cond_3
    new-instance v3, La/wfn0;

    .line 107
    .line 108
    invoke-direct {v3}, La/wfn0;-><init>()V

    .line 109
    .line 110
    .line 111
    sget-object v5, La/wfn0;->f2:[La/iiy;

    .line 112
    .line 113
    aget-object v4, v5, v4

    .line 114
    .line 115
    iget-object v6, v3, La/wfn0;->Y1:La/khf0;

    .line 116
    .line 117
    invoke-virtual {v6, v3, v4, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, v3, La/wfn0;->Z1:La/khf0;

    .line 121
    .line 122
    aget-object v4, v5, v9

    .line 123
    .line 124
    invoke-virtual {p1, v3, v4, p2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 125
    .line 126
    .line 127
    iget-object p1, v3, La/wfn0;->a2:La/yzn0;

    .line 128
    .line 129
    aget-object p2, v5, v7

    .line 130
    .line 131
    invoke-virtual {p1, v3, p2, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 132
    .line 133
    .line 134
    iget-object p1, v3, La/wfn0;->b2:La/yzn0;

    .line 135
    .line 136
    aget-object p2, v5, v0

    .line 137
    .line 138
    invoke-virtual {p1, v3, p2, v2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, p0, p3}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    invoke-virtual {v6}, Landroidx/fragment/app/e;->a0()Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-eqz p0, :cond_5

    .line 150
    .line 151
    goto/16 :goto_6

    .line 152
    .line 153
    :cond_5
    sget-object p0, La/yfn0;->c2:La/y2m0;

    .line 154
    .line 155
    invoke-static {p1, v5}, La/mgn0;->b(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;La/ctf0;)Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-static {p2}, La/mgn0;->a(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;)Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-static {v2, v1}, La/mgn0;->c(La/bu6;La/au6;)Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    new-instance p0, La/yfn0;

    .line 171
    .line 172
    invoke-direct {p0}, La/yfn0;-><init>()V

    .line 173
    .line 174
    .line 175
    sget-object v0, La/yfn0;->d2:[La/iiy;

    .line 176
    .line 177
    aget-object v1, v0, v4

    .line 178
    .line 179
    iget-object v2, p0, La/yfn0;->Y1:La/ehf0;

    .line 180
    .line 181
    invoke-virtual {v2, p0, v1, p1}, La/ehf0;->v(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 182
    .line 183
    .line 184
    iget-object p1, p0, La/yfn0;->Z1:La/ehf0;

    .line 185
    .line 186
    aget-object v1, v0, v9

    .line 187
    .line 188
    invoke-virtual {p1, p0, v1, p2}, La/ehf0;->v(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 189
    .line 190
    .line 191
    iget-object p1, p0, La/yfn0;->a2:La/ehf0;

    .line 192
    .line 193
    aget-object p2, v0, v7

    .line 194
    .line 195
    invoke-virtual {p1, p0, p2, p3}, La/ehf0;->v(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 196
    .line 197
    .line 198
    const-class p1, La/yfn0;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {v6, p1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    instance-of p3, p2, La/yfn0;

    .line 209
    .line 210
    if-eqz p3, :cond_6

    .line 211
    .line 212
    move-object v8, p2

    .line 213
    check-cast v8, La/yfn0;

    .line 214
    .line 215
    :cond_6
    if-nez v8, :cond_17

    .line 216
    .line 217
    invoke-virtual {p0, v6, p1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_7
    invoke-virtual {p0, v2}, La/lgn0;->b(La/bu6;)Z

    .line 222
    .line 223
    .line 224
    move-result p0

    .line 225
    if-eqz p0, :cond_a

    .line 226
    .line 227
    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, Landroidx/fragment/app/e;->a0()Z

    .line 235
    .line 236
    .line 237
    move-result p3

    .line 238
    if-eqz p3, :cond_8

    .line 239
    .line 240
    goto/16 :goto_6

    .line 241
    .line 242
    :cond_8
    sget-object p3, La/bgn0;->q2:La/j6m0;

    .line 243
    .line 244
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    sget-object p3, La/bgn0;->s2:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {p0, p3}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    if-eqz v3, :cond_9

    .line 254
    .line 255
    goto/16 :goto_6

    .line 256
    .line 257
    :cond_9
    new-instance v3, La/bgn0;

    .line 258
    .line 259
    invoke-direct {v3}, La/bgn0;-><init>()V

    .line 260
    .line 261
    .line 262
    sget-object v5, La/bgn0;->r2:[La/iiy;

    .line 263
    .line 264
    aget-object v4, v5, v4

    .line 265
    .line 266
    iget-object v6, v3, La/bgn0;->k2:La/khf0;

    .line 267
    .line 268
    invoke-virtual {v6, v3, v4, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 269
    .line 270
    .line 271
    iget-object p1, v3, La/bgn0;->l2:La/khf0;

    .line 272
    .line 273
    aget-object v4, v5, v9

    .line 274
    .line 275
    invoke-virtual {p1, v3, v4, p2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 276
    .line 277
    .line 278
    iget-object p1, v3, La/bgn0;->m2:La/yzn0;

    .line 279
    .line 280
    aget-object p2, v5, v7

    .line 281
    .line 282
    invoke-virtual {p1, v3, p2, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 283
    .line 284
    .line 285
    iget-object p1, v3, La/bgn0;->n2:La/yzn0;

    .line 286
    .line 287
    aget-object p2, v5, v0

    .line 288
    .line 289
    invoke-virtual {p1, v3, p2, v2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3, p0, p3}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_a
    invoke-virtual {v6}, Landroidx/fragment/app/e;->a0()Z

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    if-eqz p0, :cond_b

    .line 301
    .line 302
    goto/16 :goto_6

    .line 303
    .line 304
    :cond_b
    sget-object p0, La/hgn0;->k2:La/m6m0;

    .line 305
    .line 306
    invoke-static {p1, v5}, La/mgn0;->b(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;La/ctf0;)Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-static {p2}, La/mgn0;->a(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;)Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 311
    .line 312
    .line 313
    move-result-object p2

    .line 314
    invoke-static {v2, v1}, La/mgn0;->c(La/bu6;La/au6;)Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;

    .line 315
    .line 316
    .line 317
    move-result-object p3

    .line 318
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    new-instance p0, La/hgn0;

    .line 322
    .line 323
    invoke-direct {p0}, La/hgn0;-><init>()V

    .line 324
    .line 325
    .line 326
    sget-object v0, La/hgn0;->l2:[La/iiy;

    .line 327
    .line 328
    aget-object v1, v0, v4

    .line 329
    .line 330
    iget-object v2, p0, La/hgn0;->g2:La/ehf0;

    .line 331
    .line 332
    invoke-virtual {v2, p0, v1, p1}, La/ehf0;->v(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 333
    .line 334
    .line 335
    iget-object p1, p0, La/hgn0;->h2:La/ehf0;

    .line 336
    .line 337
    aget-object v1, v0, v9

    .line 338
    .line 339
    invoke-virtual {p1, p0, v1, p2}, La/ehf0;->v(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 340
    .line 341
    .line 342
    iget-object p1, p0, La/hgn0;->i2:La/ehf0;

    .line 343
    .line 344
    aget-object p2, v0, v7

    .line 345
    .line 346
    invoke-virtual {p1, p0, p2, p3}, La/ehf0;->v(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 347
    .line 348
    .line 349
    const-class p1, La/hgn0;

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    invoke-virtual {v6, p1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 356
    .line 357
    .line 358
    move-result-object p2

    .line 359
    instance-of p3, p2, La/hgn0;

    .line 360
    .line 361
    if-eqz p3, :cond_c

    .line 362
    .line 363
    move-object v8, p2

    .line 364
    check-cast v8, La/hgn0;

    .line 365
    .line 366
    :cond_c
    if-nez v8, :cond_17

    .line 367
    .line 368
    invoke-virtual {p0, v6, p1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    :cond_d
    iget-object p3, p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;->b:Ljava/lang/String;

    .line 373
    .line 374
    if-eqz p3, :cond_10

    .line 375
    .line 376
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    if-lez v1, :cond_e

    .line 381
    .line 382
    move-object v8, p3

    .line 383
    :cond_e
    if-nez v8, :cond_f

    .line 384
    .line 385
    goto :goto_2

    .line 386
    :cond_f
    :goto_1
    move-object v5, v8

    .line 387
    goto/16 :goto_5

    .line 388
    .line 389
    :cond_10
    :goto_2
    new-instance p3, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    iget-object p1, p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;->a:Ljava/lang/String;

    .line 395
    .line 396
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    const-string p1, "\n"

    .line 400
    .line 401
    if-eqz v0, :cond_11

    .line 402
    .line 403
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    xor-int/2addr v1, v9

    .line 408
    if-ne v1, v9, :cond_11

    .line 409
    .line 410
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    iget-object v1, v5, La/ctf0;->b:La/lsm0;

    .line 415
    .line 416
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    const v2, 0x7f131301

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    :cond_11
    iget-object v0, p2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->f:Ljava/util/List;

    .line 434
    .line 435
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    :cond_12
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    if-eqz v1, :cond_16

    .line 444
    .line 445
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    check-cast v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem;

    .line 450
    .line 451
    instance-of v2, v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 452
    .line 453
    if-eqz v2, :cond_14

    .line 454
    .line 455
    move-object v2, v1

    .line 456
    check-cast v2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 457
    .line 458
    iget-object v3, v2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;->b:Ljava/lang/String;

    .line 459
    .line 460
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 461
    .line 462
    .line 463
    move-result v8

    .line 464
    if-lez v8, :cond_14

    .line 465
    .line 466
    sget-object v1, La/pn40;->a:La/pn40;

    .line 467
    .line 468
    new-array v1, v4, [Ljava/lang/Object;

    .line 469
    .line 470
    iget-object v8, v5, La/ctf0;->b:La/lsm0;

    .line 471
    .line 472
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    const v10, 0x7f131325

    .line 477
    .line 478
    .line 479
    invoke-virtual {v8, v10, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    const-string v8, "0"

    .line 484
    .line 485
    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v8

    .line 489
    if-eqz v8, :cond_13

    .line 490
    .line 491
    move-object v3, v1

    .line 492
    :cond_13
    sget-object v1, La/p3u0;->e:La/p3u0;

    .line 493
    .line 494
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    invoke-static {v3, v1}, La/pn40;->r(Ljava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    iget-object v2, v2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;->a:Ljava/lang/String;

    .line 502
    .line 503
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    iget-object v2, v5, La/ctf0;->b:La/lsm0;

    .line 508
    .line 509
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    const v3, 0x7f1306c8

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    goto :goto_3

    .line 527
    :cond_14
    instance-of v2, v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 528
    .line 529
    if-eqz v2, :cond_12

    .line 530
    .line 531
    check-cast v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 532
    .line 533
    iget-object v2, v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;->b:Ljava/lang/String;

    .line 534
    .line 535
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 536
    .line 537
    .line 538
    move-result v3

    .line 539
    if-lez v3, :cond_12

    .line 540
    .line 541
    const-string v3, "0.0"

    .line 542
    .line 543
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    if-nez v3, :cond_12

    .line 548
    .line 549
    iget-boolean v3, v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;->e:Z

    .line 550
    .line 551
    if-eqz v3, :cond_12

    .line 552
    .line 553
    invoke-static {v2}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    if-eqz v2, :cond_15

    .line 558
    .line 559
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 560
    .line 561
    .line 562
    move-result-wide v2

    .line 563
    goto :goto_4

    .line 564
    :cond_15
    const-wide/16 v2, 0x0

    .line 565
    .line 566
    :goto_4
    sget-object v8, La/pn40;->a:La/pn40;

    .line 567
    .line 568
    iget-object v1, v1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;->d:Ljava/lang/String;

    .line 569
    .line 570
    sget-object v8, La/p3u0;->c:La/p3u0;

    .line 571
    .line 572
    invoke-static {v2, v3, v1, v8}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-static {}, Landroid/text/BidiFormatter;->getInstance()Landroid/text/BidiFormatter;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    sget-object v3, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 581
    .line 582
    invoke-virtual {v2, v1, v3}, Landroid/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;Landroid/text/TextDirectionHeuristic;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    iget-object v2, v5, La/ctf0;->b:La/lsm0;

    .line 591
    .line 592
    invoke-static {v1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    const v3, 0x7f131419

    .line 597
    .line 598
    .line 599
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    goto/16 :goto_3

    .line 610
    .line 611
    :cond_16
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v8

    .line 615
    goto/16 :goto_1

    .line 616
    .line 617
    :goto_5
    invoke-static {v6}, La/lgn0;->a(La/v1r;)Landroidx/fragment/app/Fragment;

    .line 618
    .line 619
    .line 620
    move-result-object v3

    .line 621
    if-nez v3, :cond_18

    .line 622
    .line 623
    :cond_17
    :goto_6
    return-void

    .line 624
    :cond_18
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 625
    .line 626
    .line 627
    move-result-object p1

    .line 628
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 629
    .line 630
    .line 631
    move-result-object p1

    .line 632
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 633
    .line 634
    .line 635
    move-result-object p1

    .line 636
    new-instance v2, La/kjn;

    .line 637
    .line 638
    const/4 v8, 0x3

    .line 639
    move-object v4, p0

    .line 640
    move-object v7, p2

    .line 641
    invoke-direct/range {v2 .. v8}, La/kjn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {p1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 645
    .line 646
    .line 647
    return-void
.end method
