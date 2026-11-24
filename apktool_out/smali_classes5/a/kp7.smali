.class public final synthetic La/kp7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mp7;


# direct methods
.method public synthetic constructor <init>(La/mp7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kp7;->a:B

    iput-object p1, p0, La/kp7;->b:La/mp7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kp7;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/kp7;->b:La/mp7;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/mp7;->S1:La/bj5;

    .line 11
    .line 12
    invoke-virtual {v0}, La/mp7;->G0()La/k3t0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, La/yo7;->a:La/yo7;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    sget-object v1, La/mp7;->S1:La/bj5;

    .line 25
    .line 26
    invoke-virtual {v0}, La/mp7;->G0()La/k3t0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, La/ap7;->a:La/ap7;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    sget-object v1, La/mp7;->S1:La/bj5;

    .line 39
    .line 40
    iget-object v0, v0, La/mp7;->L1:La/n0o0;

    .line 41
    .line 42
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/bai;

    .line 47
    .line 48
    new-instance v1, La/fiu0;

    .line 49
    .line 50
    const-class v2, La/hq7;

    .line 51
    .line 52
    iget-object v0, v0, La/bai;->s:La/f7i;

    .line 53
    .line 54
    invoke-static {v2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :pswitch_2
    iget-object v1, v0, La/mp7;->P1:La/zz2;

    .line 63
    .line 64
    iget-object v2, v0, La/mp7;->O1:La/phf0;

    .line 65
    .line 66
    sget-object v3, La/mp7;->S1:La/bj5;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    instance-of v4, v3, La/af3;

    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    if-eqz v4, :cond_0

    .line 83
    .line 84
    check-cast v3, La/af3;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    move-object v3, v5

    .line 88
    :goto_0
    const-class v4, La/np7;

    .line 89
    .line 90
    if-eqz v3, :cond_3

    .line 91
    .line 92
    invoke-interface {v3}, La/af3;->d()La/wcf0;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v3, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, La/o5d0;

    .line 101
    .line 102
    if-eqz v3, :cond_1

    .line 103
    .line 104
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, La/ze3;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    move-object v3, v5

    .line 112
    :goto_1
    instance-of v6, v3, La/np7;

    .line 113
    .line 114
    if-nez v6, :cond_2

    .line 115
    .line 116
    move-object v3, v5

    .line 117
    :cond_2
    check-cast v3, La/np7;

    .line 118
    .line 119
    if-eqz v3, :cond_3

    .line 120
    .line 121
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 122
    .line 123
    .line 124
    move-result-object v18

    .line 125
    new-instance v8, La/fvt0;

    .line 126
    .line 127
    sget-object v4, La/mp7;->U1:[La/iiy;

    .line 128
    .line 129
    const/4 v5, 0x2

    .line 130
    aget-object v6, v4, v5

    .line 131
    .line 132
    invoke-virtual {v2, v0, v6}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    const/4 v7, 0x3

    .line 137
    aget-object v9, v4, v7

    .line 138
    .line 139
    invoke-virtual {v1, v0, v9}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    iget-object v10, v0, La/mp7;->Q1:La/phf0;

    .line 148
    .line 149
    const/4 v11, 0x4

    .line 150
    aget-object v11, v4, v11

    .line 151
    .line 152
    invoke-virtual {v10, v0, v11}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    iget-object v11, v0, La/mp7;->N1:La/phf0;

    .line 157
    .line 158
    const/4 v12, 0x1

    .line 159
    aget-object v12, v4, v12

    .line 160
    .line 161
    invoke-virtual {v11, v0, v12}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    new-instance v12, La/sbx0;

    .line 166
    .line 167
    invoke-direct {v12, v6, v9, v10, v11}, La/sbx0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-direct {v8, v12}, La/fvt0;-><init>(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    move v6, v7

    .line 174
    new-instance v7, La/kj5;

    .line 175
    .line 176
    aget-object v5, v4, v5

    .line 177
    .line 178
    invoke-virtual {v2, v0, v5}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    aget-object v4, v4, v6

    .line 183
    .line 184
    invoke-virtual {v1, v0, v4}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v15, v3, La/np7;->e:La/zri;

    .line 197
    .line 198
    iget-object v13, v3, La/np7;->a:La/oeg0;

    .line 199
    .line 200
    iget-object v14, v3, La/np7;->d:La/m1e;

    .line 201
    .line 202
    iget-object v11, v3, La/np7;->b:La/atz;

    .line 203
    .line 204
    iget-object v12, v3, La/np7;->c:La/gle0;

    .line 205
    .line 206
    iget-object v0, v3, La/np7;->f:La/qv2;

    .line 207
    .line 208
    iget-object v1, v3, La/np7;->g:La/duj;

    .line 209
    .line 210
    iget-object v9, v3, La/np7;->h:La/cad;

    .line 211
    .line 212
    iget-object v10, v3, La/np7;->i:La/roi0;

    .line 213
    .line 214
    iget-object v2, v3, La/np7;->j:La/wdk0;

    .line 215
    .line 216
    iget-object v4, v3, La/np7;->l:La/bzt;

    .line 217
    .line 218
    iget-object v5, v3, La/np7;->k:La/pmi;

    .line 219
    .line 220
    iget-object v6, v3, La/np7;->m:La/pru;

    .line 221
    .line 222
    move-object/from16 v17, v0

    .line 223
    .line 224
    iget-object v0, v3, La/np7;->n:La/h3c;

    .line 225
    .line 226
    iget-object v3, v3, La/np7;->o:La/r9u;

    .line 227
    .line 228
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-object/from16 v22, v6

    .line 241
    .line 242
    new-instance v6, La/bai;

    .line 243
    .line 244
    move-object/from16 v23, v0

    .line 245
    .line 246
    move-object/from16 v16, v1

    .line 247
    .line 248
    move-object/from16 v19, v2

    .line 249
    .line 250
    move-object/from16 v24, v3

    .line 251
    .line 252
    move-object/from16 v21, v4

    .line 253
    .line 254
    move-object/from16 v20, v5

    .line 255
    .line 256
    invoke-direct/range {v6 .. v24}, La/bai;-><init>(La/kj5;La/fvt0;La/cad;La/roi0;La/atz;La/gle0;La/oeg0;La/m1e;La/zri;La/duj;La/qv2;La/i1w0;La/wdk0;La/pmi;La/bzt;La/pru;La/h3c;La/r9u;)V

    .line 257
    .line 258
    .line 259
    move-object v5, v6

    .line 260
    goto :goto_2

    .line 261
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 262
    .line 263
    invoke-static {v4, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    :goto_2
    return-object v5

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
