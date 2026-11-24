.class public final synthetic La/g9p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h9p0;


# direct methods
.method public synthetic constructor <init>(La/h9p0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g9p0;->a:B

    iput-object p1, p0, La/g9p0;->b:La/h9p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g9p0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/g9p0;->b:La/h9p0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/h9p0;->V1:La/y2m0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/h9p0;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/v7p0;->a:La/v7p0;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    sget-object v1, La/h9p0;->V1:La/y2m0;

    .line 26
    .line 27
    invoke-virtual {v0}, La/h9p0;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/w7p0;->a:La/w7p0;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_1
    sget-object v1, La/h9p0;->V1:La/y2m0;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    instance-of v3, v1, La/af3;

    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    check-cast v1, La/af3;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object v1, v2

    .line 60
    :goto_0
    const-class v3, La/i9p0;

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, La/o5d0;

    .line 73
    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, La/ze3;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move-object v1, v2

    .line 84
    :goto_1
    instance-of v4, v1, La/i9p0;

    .line 85
    .line 86
    if-nez v4, :cond_2

    .line 87
    .line 88
    move-object v1, v2

    .line 89
    :cond_2
    check-cast v1, La/i9p0;

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    iget-object v2, v0, La/h9p0;->U1:La/khf0;

    .line 94
    .line 95
    sget-object v3, La/h9p0;->W1:[La/iiy;

    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    aget-object v3, v3, v4

    .line 99
    .line 100
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    move-object/from16 v16, v2

    .line 105
    .line 106
    check-cast v16, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 107
    .line 108
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 109
    .line 110
    .line 111
    move-result-object v17

    .line 112
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v0, v1, La/i9p0;->a:La/ctf0;

    .line 116
    .line 117
    iget-object v2, v1, La/i9p0;->b:La/wdk0;

    .line 118
    .line 119
    iget-object v3, v1, La/i9p0;->c:La/poq0;

    .line 120
    .line 121
    iget-object v4, v1, La/i9p0;->d:La/pru;

    .line 122
    .line 123
    iget-object v5, v1, La/i9p0;->e:La/bzt;

    .line 124
    .line 125
    iget-object v6, v1, La/i9p0;->f:La/gii0;

    .line 126
    .line 127
    iget-object v7, v1, La/i9p0;->g:La/knf0;

    .line 128
    .line 129
    iget-object v8, v1, La/i9p0;->h:La/rtu;

    .line 130
    .line 131
    iget-object v9, v1, La/i9p0;->i:La/lbu;

    .line 132
    .line 133
    iget-object v10, v1, La/i9p0;->j:La/g2v;

    .line 134
    .line 135
    iget-object v11, v1, La/i9p0;->k:La/y78;

    .line 136
    .line 137
    iget-object v12, v1, La/i9p0;->l:La/wiu;

    .line 138
    .line 139
    iget-object v13, v1, La/i9p0;->m:La/m1e;

    .line 140
    .line 141
    move-object/from16 v21, v4

    .line 142
    .line 143
    iget-object v4, v1, La/i9p0;->n:La/cad;

    .line 144
    .line 145
    move-object/from16 v22, v5

    .line 146
    .line 147
    iget-object v5, v1, La/i9p0;->o:La/itr;

    .line 148
    .line 149
    move-object/from16 v23, v6

    .line 150
    .line 151
    iget-object v6, v1, La/i9p0;->p:La/pyg;

    .line 152
    .line 153
    move-object/from16 v24, v7

    .line 154
    .line 155
    iget-object v7, v1, La/i9p0;->q:La/iip;

    .line 156
    .line 157
    move-object/from16 v25, v8

    .line 158
    .line 159
    iget-object v8, v1, La/i9p0;->r:La/xri;

    .line 160
    .line 161
    move-object/from16 v26, v9

    .line 162
    .line 163
    iget-object v9, v1, La/i9p0;->s:La/vqc;

    .line 164
    .line 165
    move-object/from16 v27, v10

    .line 166
    .line 167
    iget-object v10, v1, La/i9p0;->t:La/ugf0;

    .line 168
    .line 169
    move-object/from16 v28, v11

    .line 170
    .line 171
    iget-object v11, v1, La/i9p0;->u:La/lsn;

    .line 172
    .line 173
    move-object/from16 v29, v12

    .line 174
    .line 175
    iget-object v12, v1, La/i9p0;->v:La/rrc;

    .line 176
    .line 177
    move-object/from16 v30, v13

    .line 178
    .line 179
    iget-object v13, v1, La/i9p0;->w:La/roi0;

    .line 180
    .line 181
    iget-object v14, v1, La/i9p0;->x:La/clc;

    .line 182
    .line 183
    iget-object v15, v1, La/i9p0;->y:La/epi0;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-object/from16 v20, v3

    .line 213
    .line 214
    new-instance v3, La/kwi;

    .line 215
    .line 216
    move-object/from16 v18, v0

    .line 217
    .line 218
    move-object/from16 v19, v2

    .line 219
    .line 220
    invoke-direct/range {v3 .. v30}, La/kwi;-><init>(La/cad;La/itr;La/pyg;La/iip;La/xri;La/vqc;La/ugf0;La/lsn;La/rrc;La/roi0;La/clc;La/epi0;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;La/i1w0;La/ctf0;La/wdk0;La/poq0;La/pru;La/bzt;La/gii0;La/knf0;La/rtu;La/lbu;La/g2v;La/y78;La/wiu;La/m1e;)V

    .line 221
    .line 222
    .line 223
    move-object v2, v3

    .line 224
    goto :goto_2

    .line 225
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 226
    .line 227
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :goto_2
    return-object v2

    .line 235
    :pswitch_2
    sget-object v1, La/h9p0;->V1:La/y2m0;

    .line 236
    .line 237
    iget-object v0, v0, La/h9p0;->M1:La/fiu0;

    .line 238
    .line 239
    if-eqz v0, :cond_4

    .line 240
    .line 241
    return-object v0

    .line 242
    :cond_4
    const-string v0, "viewModelFactory"

    .line 243
    .line 244
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v2

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
