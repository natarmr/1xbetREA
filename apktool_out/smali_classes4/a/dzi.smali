.class public final La/dzi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/yxi;


# direct methods
.method public constructor <init>(La/yxi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dzi;->a:La/yxi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 22

    .line 1
    new-instance v0, La/dqu0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/dzi;->a:La/yxi;

    .line 6
    .line 7
    iget-object v1, v1, La/yxi;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/ezi;

    .line 10
    .line 11
    new-instance v2, La/b6v;

    .line 12
    .line 13
    iget-object v3, v1, La/ezi;->a:La/m1e;

    .line 14
    .line 15
    new-instance v4, La/r2u;

    .line 16
    .line 17
    iget-object v5, v1, La/ezi;->b:La/sjl0;

    .line 18
    .line 19
    const/4 v6, 0x2

    .line 20
    invoke-direct {v4, v5, v6}, La/r2u;-><init>(La/sjl0;B)V

    .line 21
    .line 22
    .line 23
    new-instance v7, La/ouu;

    .line 24
    .line 25
    iget-object v8, v1, La/ezi;->c:La/pyg;

    .line 26
    .line 27
    invoke-interface {v8}, La/pyg;->k()La/cyu;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v9, v1, La/ezi;->d:La/gst0;

    .line 35
    .line 36
    invoke-direct {v7, v8, v5, v9}, La/ouu;-><init>(La/cyu;La/sjl0;La/gst0;)V

    .line 37
    .line 38
    .line 39
    iget-object v5, v1, La/ezi;->e:La/rtu;

    .line 40
    .line 41
    move-object v8, v5

    .line 42
    move-object v5, v7

    .line 43
    new-instance v7, La/lbu;

    .line 44
    .line 45
    new-instance v9, La/nru0;

    .line 46
    .line 47
    new-instance v10, La/nmt0;

    .line 48
    .line 49
    iget-object v11, v1, La/ezi;->f:La/gii0;

    .line 50
    .line 51
    invoke-direct {v10, v11}, La/nmt0;-><init>(La/gii0;)V

    .line 52
    .line 53
    .line 54
    new-instance v11, La/jmb;

    .line 55
    .line 56
    invoke-direct {v11, v6}, La/jmb;-><init>(B)V

    .line 57
    .line 58
    .line 59
    iget-object v6, v1, La/ezi;->g:La/knf0;

    .line 60
    .line 61
    invoke-direct {v9, v10, v11, v6}, La/nru0;-><init>(La/nmt0;La/jmb;La/knf0;)V

    .line 62
    .line 63
    .line 64
    iget-object v6, v1, La/ezi;->h:La/vqc;

    .line 65
    .line 66
    iget-object v6, v6, La/vqc;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v6, La/cih;

    .line 69
    .line 70
    invoke-virtual {v6}, La/cih;->a()La/uzc;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    const/16 v10, 0x12

    .line 75
    .line 76
    invoke-direct {v7, v9, v6, v10}, La/lbu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    iget-object v6, v1, La/ezi;->i:La/lsn;

    .line 80
    .line 81
    iget-object v6, v6, La/lsn;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v6, La/gbi;

    .line 84
    .line 85
    invoke-virtual {v6}, La/gbi;->k()La/v7i;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    iget-object v9, v1, La/ezi;->j:La/iip;

    .line 90
    .line 91
    invoke-interface {v9}, La/iip;->V()La/j3c;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v10, v1, La/ezi;->k:La/pru;

    .line 99
    .line 100
    iget-object v11, v1, La/ezi;->l:La/ieu;

    .line 101
    .line 102
    move-object/from16 v21, v8

    .line 103
    .line 104
    move-object v8, v6

    .line 105
    move-object/from16 v6, v21

    .line 106
    .line 107
    invoke-direct/range {v2 .. v11}, La/b6v;-><init>(La/m1e;La/r2u;La/ouu;La/rtu;La/lbu;La/v7i;La/j3c;La/pru;La/ieu;)V

    .line 108
    .line 109
    .line 110
    iget-object v3, v1, La/ezi;->m:Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;

    .line 111
    .line 112
    iget-object v4, v1, La/ezi;->k:La/pru;

    .line 113
    .line 114
    iget-object v5, v1, La/ezi;->c:La/pyg;

    .line 115
    .line 116
    move-object v6, v5

    .line 117
    invoke-interface {v6}, La/pyg;->a()La/hzg;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v7, v1, La/ezi;->n:La/cad;

    .line 125
    .line 126
    iget-object v7, v7, La/cad;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v7, La/psc;

    .line 129
    .line 130
    invoke-virtual {v7}, La/psc;->h()La/mne;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    move-object v8, v6

    .line 138
    move-object v6, v7

    .line 139
    iget-object v7, v1, La/ezi;->o:La/g2v;

    .line 140
    .line 141
    move-object v9, v8

    .line 142
    iget-object v8, v1, La/ezi;->p:La/y78;

    .line 143
    .line 144
    iget-object v10, v1, La/ezi;->q:La/itr;

    .line 145
    .line 146
    invoke-interface {v10}, La/itr;->a()La/hjd;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    move-object v11, v9

    .line 154
    move-object v9, v10

    .line 155
    iget-object v10, v1, La/ezi;->r:La/ctf0;

    .line 156
    .line 157
    move-object v12, v11

    .line 158
    iget-object v11, v1, La/ezi;->s:La/duj;

    .line 159
    .line 160
    move-object v13, v12

    .line 161
    new-instance v12, La/ugf0;

    .line 162
    .line 163
    new-instance v14, La/t2g;

    .line 164
    .line 165
    new-instance v15, La/s2g;

    .line 166
    .line 167
    invoke-direct {v15}, La/s2g;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-direct {v14, v15}, La/t2g;-><init>(La/s2g;)V

    .line 171
    .line 172
    .line 173
    invoke-direct {v12, v14}, La/ugf0;-><init>(La/t2g;)V

    .line 174
    .line 175
    .line 176
    iget-object v14, v1, La/ezi;->t:La/xri;

    .line 177
    .line 178
    invoke-virtual {v14}, La/xri;->a()La/svu;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    move-object v15, v13

    .line 186
    move-object v13, v14

    .line 187
    iget-object v14, v1, La/ezi;->u:La/lbu;

    .line 188
    .line 189
    move-object/from16 v16, v0

    .line 190
    .line 191
    iget-object v0, v1, La/ezi;->v:La/ugf0;

    .line 192
    .line 193
    iget-object v0, v0, La/ugf0;->a:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, La/daf;

    .line 196
    .line 197
    invoke-virtual {v0}, La/daf;->w()La/luu;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    move-object/from16 p0, v0

    .line 205
    .line 206
    iget-object v0, v1, La/ezi;->w:La/r9u;

    .line 207
    .line 208
    move-object/from16 v17, v0

    .line 209
    .line 210
    iget-object v0, v1, La/ezi;->x:La/oeg0;

    .line 211
    .line 212
    invoke-interface {v15}, La/pyg;->i()La/vqc;

    .line 213
    .line 214
    .line 215
    move-result-object v18

    .line 216
    iget-object v15, v1, La/ezi;->y:La/ih5;

    .line 217
    .line 218
    iget-object v1, v1, La/ezi;->z:La/zr1;

    .line 219
    .line 220
    move-object/from16 v19, v17

    .line 221
    .line 222
    move-object/from16 v17, v0

    .line 223
    .line 224
    move-object/from16 v0, v16

    .line 225
    .line 226
    move-object/from16 v16, v19

    .line 227
    .line 228
    move-object/from16 v20, v1

    .line 229
    .line 230
    move-object/from16 v19, v15

    .line 231
    .line 232
    move-object/from16 v15, p0

    .line 233
    .line 234
    move-object/from16 v1, p1

    .line 235
    .line 236
    invoke-direct/range {v0 .. v20}, La/dqu0;-><init>(La/vzg0;La/b6v;Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;La/pru;La/hzg;La/mne;La/g2v;La/y78;La/hjd;La/ctf0;La/duj;La/ugf0;La/svu;La/lbu;La/luu;La/r9u;La/oeg0;La/vqc;La/ih5;La/zr1;)V

    .line 237
    .line 238
    .line 239
    return-object v0
.end method
