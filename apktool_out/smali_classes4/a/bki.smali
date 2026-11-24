.class public final La/bki;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/gji;


# direct methods
.method public constructor <init>(La/gji;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/bki;->a:La/gji;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 26

    .line 1
    new-instance v0, La/b310;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/bki;->a:La/gji;

    .line 6
    .line 7
    iget-object v1, v1, La/gji;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/cki;

    .line 10
    .line 11
    iget-object v2, v1, La/cki;->a:Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;

    .line 12
    .line 13
    iget-object v3, v1, La/cki;->b:La/duj;

    .line 14
    .line 15
    iget-object v4, v1, La/cki;->c:La/pyg;

    .line 16
    .line 17
    invoke-interface {v4}, La/pyg;->a()La/hzg;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, La/cki;->d:La/m1e;

    .line 25
    .line 26
    iget-object v6, v1, La/cki;->e:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v7, v1, La/cki;->f:La/cad;

    .line 29
    .line 30
    iget-object v7, v7, La/cad;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v7, La/psc;

    .line 33
    .line 34
    invoke-virtual {v7}, La/psc;->h()La/mne;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v8, La/a6u;

    .line 42
    .line 43
    iget-object v15, v1, La/cki;->g:La/clc;

    .line 44
    .line 45
    iget-object v9, v15, La/clc;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v9, La/v7i;

    .line 48
    .line 49
    move-object v10, v9

    .line 50
    invoke-virtual {v10}, La/v7i;->i()La/reu;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    move-object v11, v10

    .line 55
    invoke-virtual {v11}, La/v7i;->f()La/uyn;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    move-object v12, v11

    .line 60
    new-instance v11, La/n4u;

    .line 61
    .line 62
    iget-object v13, v1, La/cki;->y:La/n5d0;

    .line 63
    .line 64
    invoke-interface {v13}, La/o5d0;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    check-cast v13, La/m4h;

    .line 69
    .line 70
    invoke-direct {v11, v13}, La/n4u;-><init>(La/m4h;)V

    .line 71
    .line 72
    .line 73
    move-object v13, v12

    .line 74
    new-instance v12, La/fzt;

    .line 75
    .line 76
    invoke-virtual {v13}, La/v7i;->g()La/qah;

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {v12, v13}, La/fzt;-><init>(La/qah;)V

    .line 84
    .line 85
    .line 86
    iget-object v13, v1, La/cki;->i:La/iip;

    .line 87
    .line 88
    invoke-interface {v13}, La/iip;->V()La/j3c;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const/16 v14, 0x1b

    .line 96
    .line 97
    invoke-direct/range {v8 .. v14}, La/a6u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    iget-object v9, v15, La/clc;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v9, La/v7i;

    .line 103
    .line 104
    invoke-virtual {v9}, La/v7i;->h()La/a7q;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    iget-object v10, v1, La/cki;->j:La/roi0;

    .line 109
    .line 110
    iget-object v10, v10, La/roi0;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v10, La/daf;

    .line 113
    .line 114
    invoke-virtual {v10}, La/daf;->B()La/nvu;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    iget-object v11, v1, La/cki;->k:La/g2v;

    .line 119
    .line 120
    iget-object v12, v1, La/cki;->l:La/ctf0;

    .line 121
    .line 122
    iget-object v13, v1, La/cki;->m:La/xri;

    .line 123
    .line 124
    invoke-virtual {v13}, La/xri;->a()La/svu;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v14, v1, La/cki;->n:La/ugf0;

    .line 132
    .line 133
    iget-object v14, v14, La/ugf0;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v14, La/daf;

    .line 136
    .line 137
    invoke-virtual {v14}, La/daf;->w()La/luu;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    move-object/from16 v16, v0

    .line 145
    .line 146
    iget-object v0, v1, La/cki;->o:La/dwu;

    .line 147
    .line 148
    move-object/from16 v17, v0

    .line 149
    .line 150
    iget-object v0, v1, La/cki;->p:La/oeg0;

    .line 151
    .line 152
    iget-object v15, v15, La/clc;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v15, La/v7i;

    .line 155
    .line 156
    iget-object v15, v15, La/v7i;->e:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v15, La/h3c;

    .line 159
    .line 160
    move-object/from16 v18, v0

    .line 161
    .line 162
    iget-object v0, v1, La/cki;->q:La/qgh;

    .line 163
    .line 164
    move-object/from16 v19, v0

    .line 165
    .line 166
    new-instance v0, La/ih5;

    .line 167
    .line 168
    move-object/from16 v20, v2

    .line 169
    .line 170
    iget-object v2, v1, La/cki;->r:La/kt2;

    .line 171
    .line 172
    move-object/from16 v21, v3

    .line 173
    .line 174
    const/4 v3, 0x1

    .line 175
    invoke-direct {v0, v2, v3}, La/ih5;-><init>(La/kt2;B)V

    .line 176
    .line 177
    .line 178
    iget-object v2, v1, La/cki;->s:La/zr1;

    .line 179
    .line 180
    iget-object v3, v1, La/cki;->t:La/epi0;

    .line 181
    .line 182
    iget-object v3, v3, La/epi0;->b:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v3, La/xzp;

    .line 185
    .line 186
    invoke-virtual {v3}, La/xzp;->C()La/r9u;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    move-object/from16 p0, v0

    .line 191
    .line 192
    iget-object v0, v1, La/cki;->u:La/a1d;

    .line 193
    .line 194
    move-object/from16 v22, v2

    .line 195
    .line 196
    iget-object v2, v0, La/a1d;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v2, La/qv2;

    .line 199
    .line 200
    invoke-virtual {v2}, La/qv2;->i()La/hqc;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    move-object/from16 v23, v2

    .line 205
    .line 206
    iget-object v2, v1, La/cki;->v:La/lbu;

    .line 207
    .line 208
    iget-object v1, v1, La/cki;->w:La/bwl;

    .line 209
    .line 210
    iget-object v1, v1, La/bwl;->a:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v1, La/dbi;

    .line 213
    .line 214
    invoke-virtual {v1}, La/dbi;->B()La/hcp0;

    .line 215
    .line 216
    .line 217
    move-result-object v24

    .line 218
    iget-object v0, v0, La/a1d;->b:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, La/qv2;

    .line 221
    .line 222
    invoke-virtual {v0}, La/qv2;->g()La/ivn;

    .line 223
    .line 224
    .line 225
    move-result-object v25

    .line 226
    move-object/from16 v0, v23

    .line 227
    .line 228
    move-object/from16 v23, v2

    .line 229
    .line 230
    move-object/from16 v2, v20

    .line 231
    .line 232
    move-object/from16 v20, v22

    .line 233
    .line 234
    move-object/from16 v22, v0

    .line 235
    .line 236
    move-object/from16 v0, v21

    .line 237
    .line 238
    move-object/from16 v21, v3

    .line 239
    .line 240
    move-object v3, v0

    .line 241
    move-object/from16 v0, v17

    .line 242
    .line 243
    move-object/from16 v17, v15

    .line 244
    .line 245
    move-object v15, v0

    .line 246
    move-object/from16 v1, p1

    .line 247
    .line 248
    move-object/from16 v0, v16

    .line 249
    .line 250
    move-object/from16 v16, v18

    .line 251
    .line 252
    move-object/from16 v18, v19

    .line 253
    .line 254
    move-object/from16 v19, p0

    .line 255
    .line 256
    invoke-direct/range {v0 .. v25}, La/b310;-><init>(La/vzg0;Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;La/duj;La/hzg;La/m1e;Ljava/lang/String;La/mne;La/a6u;La/a7q;La/nvu;La/g2v;La/ctf0;La/svu;La/luu;La/dwu;La/oeg0;La/h3c;La/qgh;La/ih5;La/zr1;La/r9u;La/hqc;La/lbu;La/hcp0;La/ivn;)V

    .line 257
    .line 258
    .line 259
    return-object v0
.end method
