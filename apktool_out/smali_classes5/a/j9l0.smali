.class public abstract La/j9l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/j9l0;->a:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;Lkotlin/jvm/functions/Function0;La/dnr;Ljava/lang/String;)La/nhi;
    .locals 34

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, La/j9l0;->a:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, La/nhi;

    .line 13
    .line 14
    if-nez v2, :cond_4

    .line 15
    .line 16
    invoke-static/range {p2 .. p2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface/range {p1 .. p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Landroid/app/Application;

    .line 25
    .line 26
    instance-of v4, v3, La/af3;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    check-cast v3, La/af3;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v3, v5

    .line 35
    :goto_0
    const-class v4, La/xmr;

    .line 36
    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    invoke-interface {v3}, La/af3;->d()La/wcf0;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, La/o5d0;

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, La/ze3;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v3, v5

    .line 59
    :goto_1
    instance-of v6, v3, La/xmr;

    .line 60
    .line 61
    if-nez v6, :cond_2

    .line 62
    .line 63
    move-object v3, v5

    .line 64
    :cond_2
    check-cast v3, La/xmr;

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-object v2, v1

    .line 72
    iget-object v1, v3, La/xmr;->a:La/cad;

    .line 73
    .line 74
    move-object v4, v2

    .line 75
    iget-object v2, v3, La/xmr;->g:La/ugf0;

    .line 76
    .line 77
    iget-object v15, v3, La/xmr;->b:La/oeg0;

    .line 78
    .line 79
    iget-object v5, v3, La/xmr;->q:La/o2j0;

    .line 80
    .line 81
    iget-object v6, v3, La/xmr;->c:La/m1e;

    .line 82
    .line 83
    iget-object v7, v3, La/xmr;->d:La/wdk0;

    .line 84
    .line 85
    iget-object v8, v3, La/xmr;->e:La/ctf0;

    .line 86
    .line 87
    iget-object v9, v3, La/xmr;->f:La/xri;

    .line 88
    .line 89
    iget-object v10, v3, La/xmr;->h:La/rmd0;

    .line 90
    .line 91
    move-object v11, v4

    .line 92
    iget-object v4, v3, La/xmr;->i:La/iw20;

    .line 93
    .line 94
    iget-object v12, v3, La/xmr;->j:La/gfk0;

    .line 95
    .line 96
    iget-object v13, v3, La/xmr;->k:La/wyu;

    .line 97
    .line 98
    iget-object v14, v3, La/xmr;->l:La/uyu;

    .line 99
    .line 100
    move-object/from16 v17, v6

    .line 101
    .line 102
    iget-object v6, v3, La/xmr;->m:La/a1d;

    .line 103
    .line 104
    move-object/from16 v18, v7

    .line 105
    .line 106
    iget-object v7, v3, La/xmr;->n:La/ivn;

    .line 107
    .line 108
    move-object/from16 v19, v8

    .line 109
    .line 110
    iget-object v8, v3, La/xmr;->p:La/ugf0;

    .line 111
    .line 112
    move-object/from16 v16, v10

    .line 113
    .line 114
    iget-object v10, v3, La/xmr;->o:La/zx10;

    .line 115
    .line 116
    move-object/from16 v20, v9

    .line 117
    .line 118
    iget-object v9, v3, La/xmr;->r:La/roi0;

    .line 119
    .line 120
    iget-object v0, v3, La/xmr;->s:La/uuz;

    .line 121
    .line 122
    move-object/from16 v21, v5

    .line 123
    .line 124
    iget-object v5, v3, La/xmr;->t:La/bwl;

    .line 125
    .line 126
    move-object/from16 v23, v0

    .line 127
    .line 128
    iget-object v0, v3, La/xmr;->v:La/ndf0;

    .line 129
    .line 130
    move-object/from16 v22, v11

    .line 131
    .line 132
    iget-object v11, v3, La/xmr;->u:La/nh70;

    .line 133
    .line 134
    move-object/from16 v24, v20

    .line 135
    .line 136
    move-object/from16 v20, v12

    .line 137
    .line 138
    iget-object v12, v3, La/xmr;->w:La/poq0;

    .line 139
    .line 140
    move-object/from16 v25, v0

    .line 141
    .line 142
    iget-object v0, v3, La/xmr;->x:La/qv2;

    .line 143
    .line 144
    move-object/from16 v26, v0

    .line 145
    .line 146
    iget-object v0, v3, La/xmr;->y:La/h3c;

    .line 147
    .line 148
    move-object/from16 v27, v0

    .line 149
    .line 150
    iget-object v0, v3, La/xmr;->z:La/je;

    .line 151
    .line 152
    move-object/from16 v28, v0

    .line 153
    .line 154
    iget-object v0, v3, La/xmr;->A:La/kt2;

    .line 155
    .line 156
    move-object/from16 v29, v0

    .line 157
    .line 158
    iget-object v0, v3, La/xmr;->B:La/gst0;

    .line 159
    .line 160
    move-object/from16 v30, v0

    .line 161
    .line 162
    iget-object v0, v3, La/xmr;->C:La/knf0;

    .line 163
    .line 164
    move-object/from16 v31, v0

    .line 165
    .line 166
    iget-object v0, v3, La/xmr;->D:La/peg0;

    .line 167
    .line 168
    move-object/from16 v32, v0

    .line 169
    .line 170
    iget-object v0, v3, La/xmr;->E:La/r9u;

    .line 171
    .line 172
    iget-object v3, v3, La/xmr;->F:La/wsf0;

    .line 173
    .line 174
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-object/from16 v24, v25

    .line 211
    .line 212
    move-object/from16 v25, v26

    .line 213
    .line 214
    move-object/from16 v26, v27

    .line 215
    .line 216
    move-object/from16 v27, v28

    .line 217
    .line 218
    move-object/from16 v28, v29

    .line 219
    .line 220
    move-object/from16 v29, v30

    .line 221
    .line 222
    move-object/from16 v30, v31

    .line 223
    .line 224
    move-object/from16 v31, v32

    .line 225
    .line 226
    move-object/from16 v32, v0

    .line 227
    .line 228
    new-instance v0, La/nhi;

    .line 229
    .line 230
    move-object/from16 v21, v13

    .line 231
    .line 232
    move-object/from16 v33, v22

    .line 233
    .line 234
    move-object v13, v3

    .line 235
    move-object/from16 v22, v14

    .line 236
    .line 237
    move-object/from16 v3, v16

    .line 238
    .line 239
    move-object/from16 v14, p0

    .line 240
    .line 241
    move-object/from16 v16, p3

    .line 242
    .line 243
    invoke-direct/range {v0 .. v32}, La/nhi;-><init>(La/cad;La/ugf0;La/rmd0;La/iw20;La/bwl;La/a1d;La/ivn;La/ugf0;La/roi0;La/zx10;La/nh70;La/poq0;La/wsf0;Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;La/oeg0;Ljava/lang/String;La/m1e;La/wdk0;La/ctf0;La/gfk0;La/wyu;La/uyu;La/uuz;La/ndf0;La/qv2;La/h3c;La/je;La/kt2;La/gst0;La/knf0;La/peg0;La/r9u;)V

    .line 244
    .line 245
    .line 246
    move-object v1, v0

    .line 247
    move-object/from16 v0, v16

    .line 248
    .line 249
    move-object/from16 v2, v33

    .line 250
    .line 251
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    return-object v1

    .line 255
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 256
    .line 257
    invoke-static {v4, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    return-object v5

    .line 265
    :cond_4
    return-object v2
.end method
