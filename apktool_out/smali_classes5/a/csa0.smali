.class public final synthetic La/csa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fsa0;


# direct methods
.method public synthetic constructor <init>(La/fsa0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/csa0;->a:B

    iput-object p1, p0, La/csa0;->b:La/fsa0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/csa0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/csa0;->b:La/fsa0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/fsa0;->V1:La/nh70;

    .line 11
    .line 12
    invoke-virtual {v0}, La/fsa0;->G0()La/k3t0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, La/yra0;->a:La/yra0;

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
    sget-object v1, La/fsa0;->V1:La/nh70;

    .line 25
    .line 26
    invoke-virtual {v0}, La/fsa0;->G0()La/k3t0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, La/rra0;->a:La/rra0;

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
    sget-object v1, La/fsa0;->V1:La/nh70;

    .line 39
    .line 40
    new-instance v1, La/q0h0;

    .line 41
    .line 42
    iget-object v0, v0, La/fsa0;->Q1:La/a8z;

    .line 43
    .line 44
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, La/ooi;

    .line 49
    .line 50
    iget-object v0, v0, La/ooi;->y:La/n5d0;

    .line 51
    .line 52
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/noi;

    .line 57
    .line 58
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :pswitch_2
    sget-object v1, La/fsa0;->V1:La/nh70;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    instance-of v2, v1, La/af3;

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    check-cast v1, La/af3;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move-object v1, v3

    .line 84
    :goto_0
    const-class v2, La/gsa0;

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, La/o5d0;

    .line 97
    .line 98
    if-eqz v1, :cond_1

    .line 99
    .line 100
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, La/ze3;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    move-object v1, v3

    .line 108
    :goto_1
    instance-of v4, v1, La/gsa0;

    .line 109
    .line 110
    if-nez v4, :cond_2

    .line 111
    .line 112
    move-object v1, v3

    .line 113
    :cond_2
    check-cast v1, La/gsa0;

    .line 114
    .line 115
    if-eqz v1, :cond_3

    .line 116
    .line 117
    iget-object v2, v0, La/fsa0;->P1:La/r34;

    .line 118
    .line 119
    sget-object v3, La/fsa0;->W1:[La/iiy;

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    aget-object v3, v3, v4

    .line 123
    .line 124
    invoke-virtual {v2, v0, v3}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object v0, v1, La/gsa0;->c:La/ocl;

    .line 136
    .line 137
    iget-object v2, v1, La/gsa0;->e:La/knf0;

    .line 138
    .line 139
    iget-object v3, v1, La/gsa0;->d:La/gii0;

    .line 140
    .line 141
    iget-object v5, v1, La/gsa0;->b:La/cad;

    .line 142
    .line 143
    iget-object v4, v1, La/gsa0;->a:La/ctf0;

    .line 144
    .line 145
    iget-object v6, v1, La/gsa0;->f:La/xv20;

    .line 146
    .line 147
    iget-object v7, v1, La/gsa0;->g:La/duj;

    .line 148
    .line 149
    move-object v8, v6

    .line 150
    iget-object v6, v1, La/gsa0;->h:La/ugf0;

    .line 151
    .line 152
    move-object/from16 v21, v7

    .line 153
    .line 154
    iget-object v7, v1, La/gsa0;->i:La/iw20;

    .line 155
    .line 156
    move-object v9, v8

    .line 157
    iget-object v8, v1, La/gsa0;->j:La/sue;

    .line 158
    .line 159
    iget-object v10, v1, La/gsa0;->k:La/reu;

    .line 160
    .line 161
    iget-object v11, v1, La/gsa0;->l:La/edo;

    .line 162
    .line 163
    iget-object v12, v1, La/gsa0;->m:La/zfo;

    .line 164
    .line 165
    iget-object v13, v1, La/gsa0;->n:La/j1q0;

    .line 166
    .line 167
    move-object v15, v9

    .line 168
    iget-object v9, v1, La/gsa0;->o:La/rmd0;

    .line 169
    .line 170
    move-object/from16 v22, v10

    .line 171
    .line 172
    iget-object v10, v1, La/gsa0;->p:La/iip;

    .line 173
    .line 174
    move-object/from16 v17, v0

    .line 175
    .line 176
    iget-object v0, v1, La/gsa0;->y:La/m1e;

    .line 177
    .line 178
    move-object/from16 v23, v11

    .line 179
    .line 180
    iget-object v11, v1, La/gsa0;->q:La/nr00;

    .line 181
    .line 182
    move-object/from16 v24, v12

    .line 183
    .line 184
    iget-object v12, v1, La/gsa0;->r:La/itr;

    .line 185
    .line 186
    move-object/from16 v16, v15

    .line 187
    .line 188
    iget-object v15, v1, La/gsa0;->s:La/y78;

    .line 189
    .line 190
    move-object/from16 v18, v0

    .line 191
    .line 192
    iget-object v0, v1, La/gsa0;->t:La/d1p;

    .line 193
    .line 194
    move-object/from16 v19, v0

    .line 195
    .line 196
    iget-object v0, v1, La/gsa0;->u:La/qoi;

    .line 197
    .line 198
    move-object/from16 v20, v0

    .line 199
    .line 200
    iget-object v0, v1, La/gsa0;->v:La/o2j0;

    .line 201
    .line 202
    move-object/from16 v25, v13

    .line 203
    .line 204
    iget-object v13, v1, La/gsa0;->w:La/a1d;

    .line 205
    .line 206
    move-object/from16 v26, v0

    .line 207
    .line 208
    iget-object v0, v1, La/gsa0;->x:La/oeg0;

    .line 209
    .line 210
    iget-object v1, v1, La/gsa0;->z:La/wdk0;

    .line 211
    .line 212
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-object/from16 v20, v4

    .line 264
    .line 265
    new-instance v4, La/ooi;

    .line 266
    .line 267
    move-object/from16 v26, v0

    .line 268
    .line 269
    move-object/from16 v27, v1

    .line 270
    .line 271
    move-object/from16 v19, v3

    .line 272
    .line 273
    move-object/from16 v16, v18

    .line 274
    .line 275
    move-object/from16 v18, v2

    .line 276
    .line 277
    invoke-direct/range {v4 .. v27}, La/ooi;-><init>(La/cad;La/ugf0;La/iw20;La/sue;La/rmd0;La/iip;La/nr00;La/itr;La/a1d;Ljava/lang/Long;La/y78;La/m1e;La/ocl;La/knf0;La/gii0;La/ctf0;La/duj;La/reu;La/edo;La/zfo;La/j1q0;La/oeg0;La/wdk0;)V

    .line 278
    .line 279
    .line 280
    move-object v3, v4

    .line 281
    goto :goto_2

    .line 282
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 283
    .line 284
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    :goto_2
    return-object v3

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
