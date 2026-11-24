.class public final synthetic La/mp4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qp4;


# direct methods
.method public synthetic constructor <init>(La/qp4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mp4;->a:B

    iput-object p1, p0, La/mp4;->b:La/qp4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mp4;->a:B

    .line 4
    .line 5
    const-string v2, "authenticator"

    .line 6
    .line 7
    const-wide/16 v3, 0xd10

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v0, v0, La/mp4;->b:La/qp4;

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v1, La/qp4;->R1:La/hfk0;

    .line 18
    .line 19
    invoke-virtual {v0}, La/qp4;->H0()La/ku4;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, v0, La/ku4;->p:La/yo4;

    .line 24
    .line 25
    invoke-virtual {v1}, La/yo4;->i()V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, La/ku4;->u:La/zr1;

    .line 29
    .line 30
    iget-object v0, v0, La/zr1;->a:La/s1p;

    .line 31
    .line 32
    new-instance v1, La/j1p;

    .line 33
    .line 34
    const-string v8, "cancel"

    .line 35
    .line 36
    invoke-direct {v1, v8, v6}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 37
    .line 38
    .line 39
    new-instance v8, La/j1p;

    .line 40
    .line 41
    invoke-direct {v8, v2, v7}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 42
    .line 43
    .line 44
    new-array v2, v5, [La/k1p;

    .line 45
    .line 46
    aput-object v1, v2, v6

    .line 47
    .line 48
    aput-object v8, v2, v7

    .line 49
    .line 50
    invoke-static {v2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_0
    sget-object v1, La/qp4;->R1:La/hfk0;

    .line 61
    .line 62
    invoke-virtual {v0}, La/qp4;->H0()La/ku4;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v8, v1, La/ku4;->p:La/yo4;

    .line 67
    .line 68
    invoke-virtual {v8}, La/yo4;->h()V

    .line 69
    .line 70
    .line 71
    iget-object v1, v1, La/ku4;->u:La/zr1;

    .line 72
    .line 73
    iget-object v1, v1, La/zr1;->a:La/s1p;

    .line 74
    .line 75
    new-instance v8, La/j1p;

    .line 76
    .line 77
    const-string v9, "settings"

    .line 78
    .line 79
    invoke-direct {v8, v9, v6}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 80
    .line 81
    .line 82
    new-instance v9, La/j1p;

    .line 83
    .line 84
    invoke-direct {v9, v2, v7}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 85
    .line 86
    .line 87
    new-array v2, v5, [La/k1p;

    .line 88
    .line 89
    aput-object v8, v2, v6

    .line 90
    .line 91
    aput-object v9, v2, v7

    .line 92
    .line 93
    invoke-static {v2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v1, v2, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 98
    .line 99
    .line 100
    iget-object v0, v0, La/qp4;->Q1:La/ywq;

    .line 101
    .line 102
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, La/ywq;->a(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :pswitch_1
    sget-object v1, La/qp4;->R1:La/hfk0;

    .line 109
    .line 110
    invoke-virtual {v0}, La/qp4;->G0()La/f9i;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v0, v0, La/f9i;->r:La/n5d0;

    .line 115
    .line 116
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, La/e9i;

    .line 121
    .line 122
    return-object v0

    .line 123
    :pswitch_2
    sget-object v1, La/qp4;->R1:La/hfk0;

    .line 124
    .line 125
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    instance-of v2, v1, La/af3;

    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    if-eqz v2, :cond_0

    .line 140
    .line 141
    check-cast v1, La/af3;

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_0
    move-object v1, v3

    .line 145
    :goto_0
    const-class v2, La/dq4;

    .line 146
    .line 147
    if-eqz v1, :cond_3

    .line 148
    .line 149
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    check-cast v1, La/o5d0;

    .line 158
    .line 159
    if-eqz v1, :cond_1

    .line 160
    .line 161
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, La/ze3;

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_1
    move-object v1, v3

    .line 169
    :goto_1
    instance-of v4, v1, La/dq4;

    .line 170
    .line 171
    if-nez v4, :cond_2

    .line 172
    .line 173
    move-object v1, v3

    .line 174
    :cond_2
    check-cast v1, La/dq4;

    .line 175
    .line 176
    if-eqz v1, :cond_3

    .line 177
    .line 178
    iget-object v2, v0, La/qp4;->P1:La/yzn0;

    .line 179
    .line 180
    sget-object v3, La/qp4;->S1:[La/iiy;

    .line 181
    .line 182
    const/4 v4, 0x3

    .line 183
    aget-object v4, v3, v4

    .line 184
    .line 185
    invoke-virtual {v2, v0, v4}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    move-object/from16 v21, v2

    .line 190
    .line 191
    check-cast v21, La/mq4;

    .line 192
    .line 193
    iget-object v2, v0, La/qp4;->N1:La/phf0;

    .line 194
    .line 195
    aget-object v4, v3, v7

    .line 196
    .line 197
    invoke-virtual {v2, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v22

    .line 201
    iget-object v2, v0, La/qp4;->O1:La/yzn0;

    .line 202
    .line 203
    aget-object v3, v3, v5

    .line 204
    .line 205
    invoke-virtual {v2, v0, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    move-object/from16 v23, v2

    .line 210
    .line 211
    check-cast v23, La/r080;

    .line 212
    .line 213
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 214
    .line 215
    .line 216
    move-result-object v24

    .line 217
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    iget-object v9, v1, La/dq4;->a:La/d1p;

    .line 224
    .line 225
    iget-object v15, v1, La/dq4;->c:La/duj;

    .line 226
    .line 227
    iget-object v10, v1, La/dq4;->g:La/cs00;

    .line 228
    .line 229
    iget-object v11, v1, La/dq4;->f:La/m1e;

    .line 230
    .line 231
    iget-object v12, v1, La/dq4;->h:La/mne;

    .line 232
    .line 233
    iget-object v0, v1, La/dq4;->e:La/g2v;

    .line 234
    .line 235
    iget-object v13, v1, La/dq4;->j:La/sp4;

    .line 236
    .line 237
    iget-object v2, v1, La/dq4;->d:La/kt2;

    .line 238
    .line 239
    iget-object v14, v1, La/dq4;->b:La/gst0;

    .line 240
    .line 241
    iget-object v3, v1, La/dq4;->i:La/rou;

    .line 242
    .line 243
    iget-object v4, v1, La/dq4;->k:La/ii;

    .line 244
    .line 245
    iget-object v5, v1, La/dq4;->l:La/wdk0;

    .line 246
    .line 247
    iget-object v1, v1, La/dq4;->m:La/ouu;

    .line 248
    .line 249
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    new-instance v8, La/f9i;

    .line 271
    .line 272
    move-object/from16 v17, v0

    .line 273
    .line 274
    move-object/from16 v25, v1

    .line 275
    .line 276
    move-object/from16 v16, v2

    .line 277
    .line 278
    move-object/from16 v19, v3

    .line 279
    .line 280
    move-object/from16 v18, v4

    .line 281
    .line 282
    move-object/from16 v20, v5

    .line 283
    .line 284
    invoke-direct/range {v8 .. v25}, La/f9i;-><init>(La/d1p;La/cs00;La/m1e;La/mne;La/sp4;La/gst0;La/duj;La/kt2;La/g2v;La/ii;La/rou;La/wdk0;La/mq4;Ljava/lang/String;La/r080;La/i1w0;La/ouu;)V

    .line 285
    .line 286
    .line 287
    move-object v3, v8

    .line 288
    goto :goto_2

    .line 289
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 290
    .line 291
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    :goto_2
    return-object v3

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
