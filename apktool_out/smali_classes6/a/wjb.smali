.class public final synthetic La/wjb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xjb;


# direct methods
.method public synthetic constructor <init>(La/xjb;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wjb;->a:B

    iput-object p1, p0, La/wjb;->b:La/xjb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wjb;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/wjb;->b:La/xjb;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/xjb;->U1:La/kj5;

    .line 12
    .line 13
    iget-object v0, v0, La/xjb;->K1:La/fiu0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string v0, "viewModelFactory"

    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v2

    .line 24
    :pswitch_0
    sget-object v1, La/xjb;->U1:La/kj5;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    instance-of v3, v1, La/af3;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    check-cast v1, La/af3;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v1, v2

    .line 45
    :goto_0
    const-class v3, La/yjb;

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, La/o5d0;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, La/ze3;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-object v1, v2

    .line 69
    :goto_1
    instance-of v4, v1, La/yjb;

    .line 70
    .line 71
    if-nez v4, :cond_3

    .line 72
    .line 73
    move-object v1, v2

    .line 74
    :cond_3
    check-cast v1, La/yjb;

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    iget-object v2, v0, La/xjb;->N1:La/khf0;

    .line 79
    .line 80
    sget-object v3, La/xjb;->V1:[La/iiy;

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    aget-object v3, v3, v4

    .line 84
    .line 85
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    move-object v11, v2

    .line 90
    check-cast v11, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 91
    .line 92
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v4, v1, La/yjb;->a:La/cad;

    .line 100
    .line 101
    iget-object v5, v1, La/yjb;->b:La/iip;

    .line 102
    .line 103
    iget-object v6, v1, La/yjb;->c:La/lsn;

    .line 104
    .line 105
    iget-object v7, v1, La/yjb;->d:La/itr;

    .line 106
    .line 107
    iget-object v8, v1, La/yjb;->e:La/ugf0;

    .line 108
    .line 109
    iget-object v9, v1, La/yjb;->f:La/xri;

    .line 110
    .line 111
    iget-object v10, v1, La/yjb;->g:La/zx10;

    .line 112
    .line 113
    iget-object v13, v1, La/yjb;->i:La/gii0;

    .line 114
    .line 115
    iget-object v0, v1, La/yjb;->h:La/oeg0;

    .line 116
    .line 117
    iget-object v14, v1, La/yjb;->j:La/g2v;

    .line 118
    .line 119
    iget-object v15, v1, La/yjb;->k:La/m1e;

    .line 120
    .line 121
    iget-object v2, v1, La/yjb;->l:La/ctf0;

    .line 122
    .line 123
    iget-object v3, v1, La/yjb;->m:La/pru;

    .line 124
    .line 125
    move-object/from16 v16, v0

    .line 126
    .line 127
    iget-object v0, v1, La/yjb;->n:La/b3c0;

    .line 128
    .line 129
    move-object/from16 v18, v0

    .line 130
    .line 131
    iget-object v0, v1, La/yjb;->o:La/knf0;

    .line 132
    .line 133
    move-object/from16 v19, v0

    .line 134
    .line 135
    iget-object v0, v1, La/yjb;->p:La/uzc;

    .line 136
    .line 137
    move-object/from16 v20, v0

    .line 138
    .line 139
    iget-object v0, v1, La/yjb;->q:La/gst0;

    .line 140
    .line 141
    move-object/from16 v21, v0

    .line 142
    .line 143
    iget-object v0, v1, La/yjb;->s:La/y78;

    .line 144
    .line 145
    move-object/from16 v22, v0

    .line 146
    .line 147
    iget-object v0, v1, La/yjb;->t:La/r9u;

    .line 148
    .line 149
    move-object/from16 v23, v0

    .line 150
    .line 151
    iget-object v0, v1, La/yjb;->u:La/lbu;

    .line 152
    .line 153
    move-object/from16 v24, v0

    .line 154
    .line 155
    iget-object v0, v1, La/yjb;->v:La/wiu;

    .line 156
    .line 157
    move-object/from16 v25, v0

    .line 158
    .line 159
    iget-object v0, v1, La/yjb;->r:La/x0u;

    .line 160
    .line 161
    move-object/from16 v26, v0

    .line 162
    .line 163
    iget-object v0, v1, La/yjb;->w:La/kys0;

    .line 164
    .line 165
    iget-object v1, v1, La/yjb;->x:La/uxs0;

    .line 166
    .line 167
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-object/from16 v17, v3

    .line 204
    .line 205
    new-instance v3, La/eci;

    .line 206
    .line 207
    move-object/from16 v27, v0

    .line 208
    .line 209
    move-object/from16 v28, v1

    .line 210
    .line 211
    move-object/from16 v16, v2

    .line 212
    .line 213
    invoke-direct/range {v3 .. v28}, La/eci;-><init>(La/cad;La/iip;La/lsn;La/itr;La/ugf0;La/xri;La/zx10;Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;La/i1w0;La/gii0;La/g2v;La/m1e;La/ctf0;La/pru;La/b3c0;La/knf0;La/uzc;La/gst0;La/y78;La/r9u;La/lbu;La/wiu;La/x0u;La/kys0;La/uxs0;)V

    .line 214
    .line 215
    .line 216
    move-object v2, v3

    .line 217
    goto :goto_2

    .line 218
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 219
    .line 220
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :goto_2
    return-object v2

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
