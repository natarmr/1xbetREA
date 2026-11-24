.class public abstract La/sal0;
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
    sput-object v0, La/sal0;->a:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(La/frs;La/xrs;La/npn;Lkotlin/jvm/functions/Function0;La/yx5;Ljava/lang/String;)La/oui;
    .locals 39

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, La/sal0;->a:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, La/oui;

    .line 13
    .line 14
    if-nez v2, :cond_4

    .line 15
    .line 16
    invoke-static/range {p4 .. p4}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 17
    .line 18
    .line 19
    move-result-object v17

    .line 20
    invoke-interface/range {p3 .. p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroid/app/Application;

    .line 25
    .line 26
    instance-of v3, v2, La/af3;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    check-cast v2, La/af3;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v2, v4

    .line 35
    :goto_0
    const-class v3, La/ral0;

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    invoke-interface {v2}, La/af3;->d()La/wcf0;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, La/o5d0;

    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, La/ze3;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v2, v4

    .line 59
    :goto_1
    instance-of v5, v2, La/ral0;

    .line 60
    .line 61
    if-nez v5, :cond_2

    .line 62
    .line 63
    move-object v2, v4

    .line 64
    :cond_2
    check-cast v2, La/ral0;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-object v3, v1

    .line 72
    iget-object v1, v2, La/ral0;->b:La/cad;

    .line 73
    .line 74
    iget-object v4, v2, La/ral0;->c:La/ivn;

    .line 75
    .line 76
    move-object v5, v3

    .line 77
    iget-object v3, v2, La/ral0;->a:La/zx10;

    .line 78
    .line 79
    iget-object v6, v2, La/ral0;->H:La/oeg0;

    .line 80
    .line 81
    iget-object v7, v2, La/ral0;->m:La/o2j0;

    .line 82
    .line 83
    iget-object v8, v2, La/ral0;->d:La/s9m0;

    .line 84
    .line 85
    move-object v9, v4

    .line 86
    iget-object v4, v2, La/ral0;->f:La/ugf0;

    .line 87
    .line 88
    iget-object v10, v2, La/ral0;->e:La/gfk0;

    .line 89
    .line 90
    iget-object v11, v2, La/ral0;->g:La/wdk0;

    .line 91
    .line 92
    move-object v12, v9

    .line 93
    iget-object v9, v2, La/ral0;->h:La/ugf0;

    .line 94
    .line 95
    iget-object v13, v2, La/ral0;->i:La/wyu;

    .line 96
    .line 97
    iget-object v14, v2, La/ral0;->j:La/uyu;

    .line 98
    .line 99
    move-object v15, v5

    .line 100
    iget-object v5, v2, La/ral0;->k:La/bwl;

    .line 101
    .line 102
    move-object/from16 v16, v7

    .line 103
    .line 104
    iget-object v7, v2, La/ral0;->l:La/iw20;

    .line 105
    .line 106
    iget-object v0, v2, La/ral0;->n:La/ctf0;

    .line 107
    .line 108
    move-object/from16 v23, v0

    .line 109
    .line 110
    iget-object v0, v2, La/ral0;->o:La/duj;

    .line 111
    .line 112
    move-object/from16 v36, v6

    .line 113
    .line 114
    iget-object v6, v2, La/ral0;->q:La/a1d;

    .line 115
    .line 116
    move-object/from16 v24, v0

    .line 117
    .line 118
    iget-object v0, v2, La/ral0;->p:La/m1e;

    .line 119
    .line 120
    move-object/from16 v19, v10

    .line 121
    .line 122
    iget-object v10, v2, La/ral0;->r:La/roi0;

    .line 123
    .line 124
    move-object/from16 v18, v8

    .line 125
    .line 126
    iget-object v8, v2, La/ral0;->s:La/rmd0;

    .line 127
    .line 128
    move-object/from16 v25, v0

    .line 129
    .line 130
    iget-object v0, v2, La/ral0;->t:La/gst0;

    .line 131
    .line 132
    move-object/from16 v26, v0

    .line 133
    .line 134
    iget-object v0, v2, La/ral0;->u:La/kt2;

    .line 135
    .line 136
    move-object/from16 v27, v0

    .line 137
    .line 138
    iget-object v0, v2, La/ral0;->v:La/knf0;

    .line 139
    .line 140
    move-object/from16 v28, v0

    .line 141
    .line 142
    iget-object v0, v2, La/ral0;->w:La/peg0;

    .line 143
    .line 144
    move-object/from16 v29, v0

    .line 145
    .line 146
    iget-object v0, v2, La/ral0;->x:La/je;

    .line 147
    .line 148
    move-object/from16 v30, v0

    .line 149
    .line 150
    iget-object v0, v2, La/ral0;->y:La/j1q0;

    .line 151
    .line 152
    move-object/from16 v20, v0

    .line 153
    .line 154
    iget-object v0, v2, La/ral0;->z:La/qv2;

    .line 155
    .line 156
    move-object/from16 v31, v0

    .line 157
    .line 158
    iget-object v0, v2, La/ral0;->A:La/h3c;

    .line 159
    .line 160
    move-object/from16 v32, v0

    .line 161
    .line 162
    iget-object v0, v2, La/ral0;->B:La/r9u;

    .line 163
    .line 164
    move-object/from16 v21, v20

    .line 165
    .line 166
    move-object/from16 v20, v11

    .line 167
    .line 168
    iget-object v11, v2, La/ral0;->C:La/wsf0;

    .line 169
    .line 170
    move-object/from16 v33, v0

    .line 171
    .line 172
    iget-object v0, v2, La/ral0;->D:La/uuz;

    .line 173
    .line 174
    move-object/from16 v34, v0

    .line 175
    .line 176
    iget-object v0, v2, La/ral0;->E:La/ndf0;

    .line 177
    .line 178
    move-object/from16 v22, v12

    .line 179
    .line 180
    iget-object v12, v2, La/ral0;->F:La/nh70;

    .line 181
    .line 182
    iget-object v2, v2, La/ral0;->G:La/poq0;

    .line 183
    .line 184
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-object/from16 v35, v0

    .line 221
    .line 222
    new-instance v0, La/oui;

    .line 223
    .line 224
    move-object/from16 v16, p2

    .line 225
    .line 226
    move-object/from16 v37, p5

    .line 227
    .line 228
    move-object/from16 v21, v13

    .line 229
    .line 230
    move-object/from16 v38, v15

    .line 231
    .line 232
    move-object/from16 v15, p1

    .line 233
    .line 234
    move-object v13, v2

    .line 235
    move-object/from16 v2, v22

    .line 236
    .line 237
    move-object/from16 v22, v14

    .line 238
    .line 239
    move-object/from16 v14, p0

    .line 240
    .line 241
    invoke-direct/range {v0 .. v37}, La/oui;-><init>(La/cad;La/ivn;La/zx10;La/ugf0;La/bwl;La/a1d;La/iw20;La/rmd0;La/ugf0;La/roi0;La/wsf0;La/nh70;La/poq0;La/frs;La/xrs;La/npn;La/i1w0;La/s9m0;La/gfk0;La/wdk0;La/wyu;La/uyu;La/ctf0;La/duj;La/m1e;La/gst0;La/kt2;La/knf0;La/peg0;La/je;La/qv2;La/h3c;La/r9u;La/uuz;La/ndf0;La/oeg0;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    move-object v1, v0

    .line 245
    move-object/from16 v0, v37

    .line 246
    .line 247
    move-object/from16 v15, v38

    .line 248
    .line 249
    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    return-object v1

    .line 253
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 254
    .line 255
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-object v4

    .line 263
    :cond_4
    return-object v2
.end method

.method public static b(JLa/cb50;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p2, La/cb50;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {p0, p1, p2}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
