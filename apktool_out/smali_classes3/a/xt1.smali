.class public final synthetic La/xt1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/au1;


# direct methods
.method public synthetic constructor <init>(La/au1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xt1;->a:B

    iput-object p1, p0, La/xt1;->b:La/au1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xt1;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/xt1;->b:La/au1;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/au1;->Z1:La/jdk0;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    instance-of v3, v1, La/af3;

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    check-cast v1, La/af3;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, v2

    .line 32
    :goto_0
    const-class v3, La/us1;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, La/o5d0;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, La/ze3;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v1, v2

    .line 56
    :goto_1
    instance-of v4, v1, La/us1;

    .line 57
    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    move-object v1, v2

    .line 61
    :cond_2
    check-cast v1, La/us1;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    iget-object v2, v0, La/au1;->S1:La/r34;

    .line 66
    .line 67
    sget-object v3, La/au1;->a2:[La/iiy;

    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    aget-object v4, v3, v4

    .line 71
    .line 72
    invoke-virtual {v2, v0, v4}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v29

    .line 76
    iget-object v2, v0, La/au1;->U1:La/phf0;

    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    aget-object v4, v3, v4

    .line 80
    .line 81
    invoke-virtual {v2, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v30

    .line 85
    iget-object v2, v0, La/au1;->V1:La/yzn0;

    .line 86
    .line 87
    const/4 v4, 0x3

    .line 88
    aget-object v4, v3, v4

    .line 89
    .line 90
    invoke-virtual {v2, v0, v4}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    move-object/from16 v31, v2

    .line 95
    .line 96
    check-cast v31, La/s9s0;

    .line 97
    .line 98
    iget-object v2, v0, La/au1;->W1:La/cgx0;

    .line 99
    .line 100
    const/4 v4, 0x4

    .line 101
    aget-object v3, v3, v4

    .line 102
    .line 103
    invoke-virtual {v2, v0, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object v32

    .line 107
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v7, v1, La/us1;->a:La/ehf0;

    .line 111
    .line 112
    iget-object v6, v1, La/us1;->b:La/cad;

    .line 113
    .line 114
    iget-object v8, v1, La/us1;->c:La/peg0;

    .line 115
    .line 116
    iget-object v9, v1, La/us1;->e:La/wsf0;

    .line 117
    .line 118
    iget-object v12, v1, La/us1;->d:La/d1p;

    .line 119
    .line 120
    iget-object v10, v1, La/us1;->f:La/wsf0;

    .line 121
    .line 122
    iget-object v11, v1, La/us1;->g:La/peg0;

    .line 123
    .line 124
    iget-object v0, v1, La/us1;->h:La/gii0;

    .line 125
    .line 126
    iget-object v13, v1, La/us1;->i:La/wdk0;

    .line 127
    .line 128
    iget-object v2, v1, La/us1;->j:La/btt0;

    .line 129
    .line 130
    iget-object v3, v1, La/us1;->o:La/kt2;

    .line 131
    .line 132
    iget-object v14, v1, La/us1;->k:La/s91;

    .line 133
    .line 134
    iget-object v15, v1, La/us1;->l:La/m1e;

    .line 135
    .line 136
    iget-object v4, v1, La/us1;->m:La/ii;

    .line 137
    .line 138
    iget-object v5, v1, La/us1;->n:La/duj;

    .line 139
    .line 140
    move-object/from16 v16, v0

    .line 141
    .line 142
    iget-object v0, v1, La/us1;->p:La/knf0;

    .line 143
    .line 144
    move-object/from16 v17, v0

    .line 145
    .line 146
    iget-object v0, v1, La/us1;->q:La/v88;

    .line 147
    .line 148
    move-object/from16 v18, v0

    .line 149
    .line 150
    iget-object v0, v1, La/us1;->r:La/oeg0;

    .line 151
    .line 152
    move-object/from16 v19, v0

    .line 153
    .line 154
    iget-object v0, v1, La/us1;->s:La/ctf0;

    .line 155
    .line 156
    move-object/from16 v20, v0

    .line 157
    .line 158
    iget-object v0, v1, La/us1;->t:La/iqt;

    .line 159
    .line 160
    move-object/from16 v21, v0

    .line 161
    .line 162
    iget-object v0, v1, La/us1;->u:La/bzt;

    .line 163
    .line 164
    move-object/from16 v22, v0

    .line 165
    .line 166
    iget-object v0, v1, La/us1;->v:La/pru;

    .line 167
    .line 168
    move-object/from16 v23, v0

    .line 169
    .line 170
    iget-object v0, v1, La/us1;->w:La/kc60;

    .line 171
    .line 172
    move-object/from16 v24, v0

    .line 173
    .line 174
    iget-object v0, v1, La/us1;->x:La/wiu;

    .line 175
    .line 176
    move-object/from16 v25, v0

    .line 177
    .line 178
    iget-object v0, v1, La/us1;->y:La/r2v;

    .line 179
    .line 180
    move-object/from16 v26, v0

    .line 181
    .line 182
    iget-object v0, v1, La/us1;->z:La/ytt;

    .line 183
    .line 184
    iget-object v1, v1, La/us1;->A:La/x0u;

    .line 185
    .line 186
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-object/from16 v17, v5

    .line 220
    .line 221
    new-instance v5, La/w7i;

    .line 222
    .line 223
    move-object/from16 v27, v0

    .line 224
    .line 225
    move-object/from16 v33, v1

    .line 226
    .line 227
    move-object/from16 v28, v3

    .line 228
    .line 229
    move-object/from16 v16, v4

    .line 230
    .line 231
    invoke-direct/range {v5 .. v33}, La/w7i;-><init>(La/cad;La/ehf0;La/peg0;La/wsf0;La/wsf0;La/peg0;La/d1p;La/wdk0;La/s91;La/m1e;La/ii;La/duj;La/v88;La/oeg0;La/ctf0;La/iqt;La/bzt;La/pru;La/kc60;La/wiu;La/r2v;La/ytt;La/kt2;Ljava/lang/Long;Ljava/lang/String;La/s9s0;Ljava/lang/Boolean;La/x0u;)V

    .line 232
    .line 233
    .line 234
    move-object v2, v5

    .line 235
    goto :goto_2

    .line 236
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 237
    .line 238
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    :goto_2
    return-object v2

    .line 246
    :pswitch_0
    sget-object v1, La/au1;->Z1:La/jdk0;

    .line 247
    .line 248
    iget-object v0, v0, La/au1;->K1:La/fiu0;

    .line 249
    .line 250
    if-eqz v0, :cond_4

    .line 251
    .line 252
    return-object v0

    .line 253
    :cond_4
    const-string v0, "viewModelFactory"

    .line 254
    .line 255
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v2

    .line 259
    :pswitch_1
    sget-object v1, La/au1;->Z1:La/jdk0;

    .line 260
    .line 261
    invoke-virtual {v0}, La/au1;->G0()La/k3t0;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    sget-object v1, La/ds1;->a:La/ds1;

    .line 266
    .line 267
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object v0

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
