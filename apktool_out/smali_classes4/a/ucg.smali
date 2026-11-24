.class public final synthetic La/ucg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wcg;


# direct methods
.method public synthetic constructor <init>(La/wcg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ucg;->a:B

    iput-object p1, p0, La/ucg;->b:La/wcg;

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
    iget-byte v1, v0, La/ucg;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/ucg;->b:La/wcg;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/wcg;->U1:La/usd;

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
    const-class v3, La/xcg;

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
    instance-of v4, v1, La/xcg;

    .line 57
    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    move-object v1, v2

    .line 61
    :cond_2
    check-cast v1, La/xcg;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0}, La/wcg;->H0()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    new-instance v12, La/rc3;

    .line 70
    .line 71
    invoke-virtual {v0}, La/wcg;->H0()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget v0, v0, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->d:I

    .line 76
    .line 77
    invoke-direct {v12, v0}, La/rc3;-><init>(I)V

    .line 78
    .line 79
    .line 80
    iget-object v13, v1, La/xcg;->a:La/oeg0;

    .line 81
    .line 82
    iget-object v14, v1, La/xcg;->b:La/m1e;

    .line 83
    .line 84
    iget-object v15, v1, La/xcg;->c:La/duj;

    .line 85
    .line 86
    iget-object v5, v1, La/xcg;->d:La/cad;

    .line 87
    .line 88
    iget-object v6, v1, La/xcg;->e:La/pyg;

    .line 89
    .line 90
    iget-object v7, v1, La/xcg;->f:La/xri;

    .line 91
    .line 92
    iget-object v8, v1, La/xcg;->g:La/iip;

    .line 93
    .line 94
    iget-object v9, v1, La/xcg;->h:La/vqc;

    .line 95
    .line 96
    iget-object v10, v1, La/xcg;->i:La/lsn;

    .line 97
    .line 98
    iget-object v0, v1, La/xcg;->j:La/g2v;

    .line 99
    .line 100
    iget-object v2, v1, La/xcg;->k:La/ctf0;

    .line 101
    .line 102
    iget-object v3, v1, La/xcg;->l:La/knf0;

    .line 103
    .line 104
    iget-object v4, v1, La/xcg;->m:La/gii0;

    .line 105
    .line 106
    move-object/from16 v16, v0

    .line 107
    .line 108
    iget-object v0, v1, La/xcg;->n:La/wdk0;

    .line 109
    .line 110
    move-object/from16 v21, v0

    .line 111
    .line 112
    iget-object v0, v1, La/xcg;->o:La/pru;

    .line 113
    .line 114
    move-object/from16 v20, v0

    .line 115
    .line 116
    iget-object v0, v1, La/xcg;->p:La/n2u;

    .line 117
    .line 118
    move-object/from16 v22, v0

    .line 119
    .line 120
    iget-object v0, v1, La/xcg;->q:La/gvt;

    .line 121
    .line 122
    move-object/from16 v23, v0

    .line 123
    .line 124
    iget-object v0, v1, La/xcg;->r:La/vby;

    .line 125
    .line 126
    move-object/from16 v24, v0

    .line 127
    .line 128
    iget-object v0, v1, La/xcg;->s:La/kt2;

    .line 129
    .line 130
    move-object/from16 v25, v0

    .line 131
    .line 132
    iget-object v0, v1, La/xcg;->t:La/zr1;

    .line 133
    .line 134
    move-object/from16 v26, v0

    .line 135
    .line 136
    iget-object v0, v1, La/xcg;->u:La/b3c0;

    .line 137
    .line 138
    move-object/from16 v27, v0

    .line 139
    .line 140
    iget-object v0, v1, La/xcg;->v:La/gst0;

    .line 141
    .line 142
    move-object/from16 v28, v0

    .line 143
    .line 144
    iget-object v0, v1, La/xcg;->w:La/pmi;

    .line 145
    .line 146
    iget-object v1, v1, La/xcg;->x:La/r9u;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-object/from16 v19, v4

    .line 191
    .line 192
    new-instance v4, La/fei;

    .line 193
    .line 194
    move-object/from16 v29, v0

    .line 195
    .line 196
    move-object/from16 v17, v2

    .line 197
    .line 198
    move-object/from16 v18, v3

    .line 199
    .line 200
    invoke-direct/range {v4 .. v29}, La/fei;-><init>(La/cad;La/pyg;La/xri;La/iip;La/vqc;La/lsn;Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;La/rc3;La/oeg0;La/m1e;La/duj;La/g2v;La/ctf0;La/knf0;La/gii0;La/pru;La/wdk0;La/n2u;La/gvt;La/vby;La/kt2;La/zr1;La/b3c0;La/gst0;La/pmi;)V

    .line 201
    .line 202
    .line 203
    move-object v2, v4

    .line 204
    goto :goto_2

    .line 205
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 206
    .line 207
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    :goto_2
    return-object v2

    .line 215
    :pswitch_0
    new-instance v1, La/q0h0;

    .line 216
    .line 217
    iget-object v0, v0, La/wcg;->N1:La/eei;

    .line 218
    .line 219
    if-eqz v0, :cond_4

    .line 220
    .line 221
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 222
    .line 223
    .line 224
    return-object v1

    .line 225
    :cond_4
    const-string v0, "viewModelFactory"

    .line 226
    .line 227
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v2

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
