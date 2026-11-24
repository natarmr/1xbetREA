.class public abstract La/pdl0;
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
    sput-object v0, La/pdl0;->a:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;Lkotlin/jvm/functions/Function0;La/cjs;Ljava/lang/String;)La/uhi;
    .locals 31

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, La/pdl0;->a:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, La/uhi;

    .line 13
    .line 14
    if-nez v2, :cond_4

    .line 15
    .line 16
    invoke-static/range {p2 .. p2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 17
    .line 18
    .line 19
    move-result-object v16

    .line 20
    invoke-interface/range {p1 .. p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

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
    const-class v3, La/tis;

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
    instance-of v5, v2, La/tis;

    .line 60
    .line 61
    if-nez v5, :cond_2

    .line 62
    .line 63
    move-object v2, v4

    .line 64
    :cond_2
    check-cast v2, La/tis;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v4, v2, La/tis;->a:La/cad;

    .line 72
    .line 73
    iget-object v5, v2, La/tis;->g:La/ugf0;

    .line 74
    .line 75
    iget-object v3, v2, La/tis;->b:La/oeg0;

    .line 76
    .line 77
    iget-object v6, v2, La/tis;->p:La/o2j0;

    .line 78
    .line 79
    iget-object v7, v2, La/tis;->c:La/m1e;

    .line 80
    .line 81
    iget-object v8, v2, La/tis;->d:La/wdk0;

    .line 82
    .line 83
    iget-object v9, v2, La/tis;->e:La/ctf0;

    .line 84
    .line 85
    iget-object v10, v2, La/tis;->f:La/xri;

    .line 86
    .line 87
    move-object v11, v6

    .line 88
    iget-object v6, v2, La/tis;->h:La/rmd0;

    .line 89
    .line 90
    move-object/from16 v17, v7

    .line 91
    .line 92
    iget-object v7, v2, La/tis;->i:La/iw20;

    .line 93
    .line 94
    iget-object v12, v2, La/tis;->j:La/gfk0;

    .line 95
    .line 96
    iget-object v13, v2, La/tis;->k:La/wyu;

    .line 97
    .line 98
    move-object/from16 v19, v9

    .line 99
    .line 100
    iget-object v9, v2, La/tis;->l:La/a1d;

    .line 101
    .line 102
    move-object v14, v10

    .line 103
    iget-object v10, v2, La/tis;->m:La/ivn;

    .line 104
    .line 105
    move-object/from16 v20, v12

    .line 106
    .line 107
    iget-object v12, v2, La/tis;->n:La/zx10;

    .line 108
    .line 109
    iget-object v15, v2, La/tis;->o:La/uuz;

    .line 110
    .line 111
    move-object/from16 v18, v11

    .line 112
    .line 113
    iget-object v11, v2, La/tis;->q:La/roi0;

    .line 114
    .line 115
    move-object/from16 v21, v18

    .line 116
    .line 117
    move-object/from16 v18, v8

    .line 118
    .line 119
    iget-object v8, v2, La/tis;->r:La/bwl;

    .line 120
    .line 121
    move-object/from16 v22, v3

    .line 122
    .line 123
    iget-object v3, v2, La/tis;->t:La/ndf0;

    .line 124
    .line 125
    move-object/from16 v23, v13

    .line 126
    .line 127
    iget-object v13, v2, La/tis;->s:La/nh70;

    .line 128
    .line 129
    move-object/from16 v24, v3

    .line 130
    .line 131
    iget-object v3, v2, La/tis;->u:La/qv2;

    .line 132
    .line 133
    move-object/from16 v25, v3

    .line 134
    .line 135
    iget-object v3, v2, La/tis;->v:La/h3c;

    .line 136
    .line 137
    move-object/from16 v26, v3

    .line 138
    .line 139
    iget-object v3, v2, La/tis;->w:La/je;

    .line 140
    .line 141
    move-object/from16 v27, v3

    .line 142
    .line 143
    iget-object v3, v2, La/tis;->x:La/kt2;

    .line 144
    .line 145
    move-object/from16 v28, v3

    .line 146
    .line 147
    iget-object v3, v2, La/tis;->y:La/gst0;

    .line 148
    .line 149
    move-object/from16 v29, v3

    .line 150
    .line 151
    iget-object v3, v2, La/tis;->z:La/knf0;

    .line 152
    .line 153
    move-object/from16 v30, v3

    .line 154
    .line 155
    iget-object v3, v2, La/tis;->A:La/peg0;

    .line 156
    .line 157
    move-object/from16 p1, v3

    .line 158
    .line 159
    iget-object v3, v2, La/tis;->B:La/r9u;

    .line 160
    .line 161
    iget-object v2, v2, La/tis;->C:La/wsf0;

    .line 162
    .line 163
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-object/from16 v22, v24

    .line 200
    .line 201
    move-object/from16 v24, v26

    .line 202
    .line 203
    move-object/from16 v26, v28

    .line 204
    .line 205
    move-object/from16 v28, v30

    .line 206
    .line 207
    move-object/from16 v30, v3

    .line 208
    .line 209
    new-instance v3, La/uhi;

    .line 210
    .line 211
    move-object v14, v2

    .line 212
    move-object/from16 v21, v15

    .line 213
    .line 214
    move-object/from16 v23, v25

    .line 215
    .line 216
    move-object/from16 v25, v27

    .line 217
    .line 218
    move-object/from16 v27, v29

    .line 219
    .line 220
    move-object/from16 v15, p0

    .line 221
    .line 222
    move-object/from16 v29, p1

    .line 223
    .line 224
    invoke-direct/range {v3 .. v30}, La/uhi;-><init>(La/cad;La/ugf0;La/rmd0;La/iw20;La/bwl;La/a1d;La/ivn;La/roi0;La/zx10;La/nh70;La/wsf0;Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;La/i1w0;La/m1e;La/wdk0;La/ctf0;La/gfk0;La/uuz;La/ndf0;La/qv2;La/h3c;La/je;La/kt2;La/gst0;La/knf0;La/peg0;La/r9u;)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    return-object v3

    .line 231
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 232
    .line 233
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    return-object v4

    .line 241
    :cond_4
    return-object v2
.end method
