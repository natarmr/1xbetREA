.class public final La/zqi;
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
    iput-object p1, p0, La/zqi;->a:La/gji;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 26

    .line 1
    new-instance v0, La/hxd0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/zqi;->a:La/gji;

    .line 6
    .line 7
    iget-object v1, v1, La/gji;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/ari;

    .line 10
    .line 11
    iget-object v2, v1, La/ari;->a:Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;

    .line 12
    .line 13
    iget-object v3, v1, La/ari;->b:La/duj;

    .line 14
    .line 15
    iget-object v4, v1, La/ari;->c:La/pyg;

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
    iget-object v5, v1, La/ari;->d:La/m1e;

    .line 25
    .line 26
    iget-object v6, v1, La/ari;->e:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v7, v1, La/ari;->f:La/cad;

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
    iget-object v15, v1, La/ari;->g:La/clc;

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
    iget-object v12, v1, La/ari;->h:La/iip;

    .line 60
    .line 61
    invoke-interface {v12}, La/iip;->V()La/j3c;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v13, v11

    .line 69
    move-object v11, v12

    .line 70
    new-instance v12, La/n4u;

    .line 71
    .line 72
    iget-object v14, v1, La/ari;->y:La/n5d0;

    .line 73
    .line 74
    invoke-interface {v14}, La/o5d0;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v14

    .line 78
    check-cast v14, La/xvd0;

    .line 79
    .line 80
    invoke-direct {v12, v14}, La/n4u;-><init>(La/xvd0;)V

    .line 81
    .line 82
    .line 83
    move-object v14, v13

    .line 84
    new-instance v13, La/ezt;

    .line 85
    .line 86
    invoke-virtual {v14}, La/v7i;->g()La/qah;

    .line 87
    .line 88
    .line 89
    move-result-object v14

    .line 90
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-direct {v13, v14}, La/ezt;-><init>(La/qah;)V

    .line 94
    .line 95
    .line 96
    const/16 v14, 0x1c

    .line 97
    .line 98
    invoke-direct/range {v8 .. v14}, La/a6u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 99
    .line 100
    .line 101
    iget-object v9, v15, La/clc;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v9, La/v7i;

    .line 104
    .line 105
    invoke-virtual {v9}, La/v7i;->h()La/a7q;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    iget-object v10, v1, La/ari;->j:La/roi0;

    .line 110
    .line 111
    iget-object v10, v10, La/roi0;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v10, La/daf;

    .line 114
    .line 115
    invoke-virtual {v10}, La/daf;->B()La/nvu;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    iget-object v11, v1, La/ari;->k:La/g2v;

    .line 120
    .line 121
    iget-object v12, v1, La/ari;->l:La/ctf0;

    .line 122
    .line 123
    iget-object v13, v1, La/ari;->m:La/xri;

    .line 124
    .line 125
    invoke-virtual {v13}, La/xri;->a()La/svu;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-object v14, v1, La/ari;->n:La/ugf0;

    .line 133
    .line 134
    iget-object v14, v14, La/ugf0;->a:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v14, La/daf;

    .line 137
    .line 138
    invoke-virtual {v14}, La/daf;->w()La/luu;

    .line 139
    .line 140
    .line 141
    move-result-object v14

    .line 142
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    move-object/from16 v16, v0

    .line 146
    .line 147
    iget-object v0, v1, La/ari;->o:La/epi0;

    .line 148
    .line 149
    iget-object v0, v0, La/epi0;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, La/xzp;

    .line 152
    .line 153
    invoke-virtual {v0}, La/xzp;->C()La/r9u;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    move-object/from16 p0, v0

    .line 158
    .line 159
    iget-object v0, v1, La/ari;->p:La/dwu;

    .line 160
    .line 161
    move-object/from16 v17, v0

    .line 162
    .line 163
    iget-object v0, v1, La/ari;->q:La/oeg0;

    .line 164
    .line 165
    iget-object v15, v15, La/clc;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v15, La/v7i;

    .line 168
    .line 169
    iget-object v15, v15, La/v7i;->e:Ljava/lang/Object;

    .line 170
    .line 171
    move-object/from16 v18, v15

    .line 172
    .line 173
    check-cast v18, La/h3c;

    .line 174
    .line 175
    iget-object v15, v1, La/ari;->r:La/qgh;

    .line 176
    .line 177
    move-object/from16 v19, v0

    .line 178
    .line 179
    new-instance v0, La/ih5;

    .line 180
    .line 181
    move-object/from16 v20, v2

    .line 182
    .line 183
    iget-object v2, v1, La/ari;->s:La/kt2;

    .line 184
    .line 185
    move-object/from16 v21, v3

    .line 186
    .line 187
    const/4 v3, 0x1

    .line 188
    invoke-direct {v0, v2, v3}, La/ih5;-><init>(La/kt2;B)V

    .line 189
    .line 190
    .line 191
    iget-object v2, v1, La/ari;->t:La/zr1;

    .line 192
    .line 193
    iget-object v3, v1, La/ari;->u:La/a1d;

    .line 194
    .line 195
    move-object/from16 v22, v0

    .line 196
    .line 197
    iget-object v0, v3, La/a1d;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, La/qv2;

    .line 200
    .line 201
    invoke-virtual {v0}, La/qv2;->i()La/hqc;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    move-object/from16 v23, v0

    .line 206
    .line 207
    iget-object v0, v1, La/ari;->v:La/lbu;

    .line 208
    .line 209
    iget-object v1, v1, La/ari;->w:La/bwl;

    .line 210
    .line 211
    iget-object v1, v1, La/bwl;->a:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v1, La/dbi;

    .line 214
    .line 215
    invoke-virtual {v1}, La/dbi;->B()La/hcp0;

    .line 216
    .line 217
    .line 218
    move-result-object v24

    .line 219
    iget-object v1, v3, La/a1d;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v1, La/qv2;

    .line 222
    .line 223
    invoke-virtual {v1}, La/qv2;->g()La/ivn;

    .line 224
    .line 225
    .line 226
    move-result-object v25

    .line 227
    move-object/from16 v1, p1

    .line 228
    .line 229
    move-object/from16 v3, v21

    .line 230
    .line 231
    move-object/from16 v21, v2

    .line 232
    .line 233
    move-object/from16 v2, v20

    .line 234
    .line 235
    move-object/from16 v20, v22

    .line 236
    .line 237
    move-object/from16 v22, v23

    .line 238
    .line 239
    move-object/from16 v23, v0

    .line 240
    .line 241
    move-object/from16 v0, v16

    .line 242
    .line 243
    move-object/from16 v16, v17

    .line 244
    .line 245
    move-object/from16 v17, v19

    .line 246
    .line 247
    move-object/from16 v19, v15

    .line 248
    .line 249
    move-object/from16 v15, p0

    .line 250
    .line 251
    invoke-direct/range {v0 .. v25}, La/hxd0;-><init>(La/vzg0;Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;La/duj;La/hzg;La/m1e;Ljava/lang/String;La/mne;La/a6u;La/a7q;La/nvu;La/g2v;La/ctf0;La/svu;La/luu;La/r9u;La/dwu;La/oeg0;La/h3c;La/qgh;La/ih5;La/zr1;La/hqc;La/lbu;La/hcp0;La/ivn;)V

    .line 252
    .line 253
    .line 254
    return-object v0
.end method
