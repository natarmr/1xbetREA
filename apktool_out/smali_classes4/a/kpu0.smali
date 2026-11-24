.class public final synthetic La/kpu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/opu0;


# direct methods
.method public synthetic constructor <init>(La/opu0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kpu0;->a:B

    iput-object p1, p0, La/kpu0;->b:La/opu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kpu0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/kpu0;->b:La/opu0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v1, La/q0h0;

    .line 12
    .line 13
    iget-object v0, v0, La/opu0;->L1:La/dzi;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_0
    const-string v0, "viewModelFactory"

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v2

    .line 27
    :pswitch_0
    sget-object v1, La/opu0;->W1:La/uxs0;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    instance-of v3, v1, La/af3;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    check-cast v1, La/af3;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v1, v2

    .line 48
    :goto_0
    const-class v3, La/ppu0;

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, La/o5d0;

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/ze3;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move-object v1, v2

    .line 72
    :goto_1
    instance-of v4, v1, La/ppu0;

    .line 73
    .line 74
    if-nez v4, :cond_3

    .line 75
    .line 76
    move-object v1, v2

    .line 77
    :cond_3
    check-cast v1, La/ppu0;

    .line 78
    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    iget-object v2, v0, La/opu0;->P1:La/khf0;

    .line 82
    .line 83
    sget-object v3, La/opu0;->X1:[La/iiy;

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    aget-object v3, v3, v4

    .line 87
    .line 88
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object/from16 v19, v0

    .line 93
    .line 94
    check-cast v19, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;

    .line 95
    .line 96
    iget-object v11, v1, La/ppu0;->a:La/duj;

    .line 97
    .line 98
    iget-object v12, v1, La/ppu0;->b:La/g2v;

    .line 99
    .line 100
    iget-object v3, v1, La/ppu0;->c:La/cad;

    .line 101
    .line 102
    iget-object v13, v1, La/ppu0;->d:La/m1e;

    .line 103
    .line 104
    iget-object v14, v1, La/ppu0;->e:La/gii0;

    .line 105
    .line 106
    iget-object v15, v1, La/ppu0;->f:La/oeg0;

    .line 107
    .line 108
    iget-object v4, v1, La/ppu0;->g:La/pyg;

    .line 109
    .line 110
    iget-object v0, v1, La/ppu0;->h:La/ctf0;

    .line 111
    .line 112
    iget-object v2, v1, La/ppu0;->A:La/gst0;

    .line 113
    .line 114
    iget-object v5, v1, La/ppu0;->i:La/itr;

    .line 115
    .line 116
    iget-object v6, v1, La/ppu0;->j:La/wdk0;

    .line 117
    .line 118
    iget-object v7, v1, La/ppu0;->k:La/y78;

    .line 119
    .line 120
    move-object/from16 v17, v6

    .line 121
    .line 122
    iget-object v6, v1, La/ppu0;->l:La/xri;

    .line 123
    .line 124
    iget-object v8, v1, La/ppu0;->m:La/sjl0;

    .line 125
    .line 126
    iget-object v9, v1, La/ppu0;->n:La/knf0;

    .line 127
    .line 128
    iget-object v10, v1, La/ppu0;->o:La/lbu;

    .line 129
    .line 130
    move-object/from16 v20, v8

    .line 131
    .line 132
    iget-object v8, v1, La/ppu0;->p:La/ugf0;

    .line 133
    .line 134
    move-object/from16 v18, v7

    .line 135
    .line 136
    iget-object v7, v1, La/ppu0;->q:La/lsn;

    .line 137
    .line 138
    move-object/from16 v21, v9

    .line 139
    .line 140
    iget-object v9, v1, La/ppu0;->r:La/iip;

    .line 141
    .line 142
    move-object/from16 v16, v0

    .line 143
    .line 144
    iget-object v0, v1, La/ppu0;->s:La/rtu;

    .line 145
    .line 146
    move-object/from16 v23, v0

    .line 147
    .line 148
    iget-object v0, v1, La/ppu0;->t:La/ieu;

    .line 149
    .line 150
    move-object/from16 v24, v0

    .line 151
    .line 152
    iget-object v0, v1, La/ppu0;->u:La/j1q0;

    .line 153
    .line 154
    move-object/from16 v22, v10

    .line 155
    .line 156
    iget-object v10, v1, La/ppu0;->v:La/vqc;

    .line 157
    .line 158
    move-object/from16 v25, v0

    .line 159
    .line 160
    iget-object v0, v1, La/ppu0;->w:La/pru;

    .line 161
    .line 162
    move-object/from16 v26, v0

    .line 163
    .line 164
    iget-object v0, v1, La/ppu0;->x:La/r9u;

    .line 165
    .line 166
    move-object/from16 v27, v0

    .line 167
    .line 168
    iget-object v0, v1, La/ppu0;->z:La/zr1;

    .line 169
    .line 170
    iget-object v1, v1, La/ppu0;->y:La/ih5;

    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-object/from16 v25, v26

    .line 215
    .line 216
    move-object/from16 v26, v27

    .line 217
    .line 218
    move-object/from16 v27, v2

    .line 219
    .line 220
    new-instance v2, La/ezi;

    .line 221
    .line 222
    move-object/from16 v29, v0

    .line 223
    .line 224
    move-object/from16 v28, v1

    .line 225
    .line 226
    invoke-direct/range {v2 .. v29}, La/ezi;-><init>(La/cad;La/pyg;La/itr;La/xri;La/lsn;La/ugf0;La/iip;La/vqc;La/duj;La/g2v;La/m1e;La/gii0;La/oeg0;La/ctf0;La/wdk0;La/y78;Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;La/sjl0;La/knf0;La/lbu;La/rtu;La/ieu;La/pru;La/r9u;La/gst0;La/ih5;La/zr1;)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 231
    .line 232
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :goto_2
    return-object v2

    .line 240
    :pswitch_1
    sget-object v1, La/opu0;->W1:La/uxs0;

    .line 241
    .line 242
    invoke-virtual {v0}, La/opu0;->G0()La/k3t0;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    sget-object v1, La/tou0;->a:La/tou0;

    .line 247
    .line 248
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object v0

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
