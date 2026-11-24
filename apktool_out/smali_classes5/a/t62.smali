.class public final synthetic La/t62;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w62;


# direct methods
.method public synthetic constructor <init>(La/w62;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t62;->a:B

    iput-object p1, p0, La/t62;->b:La/w62;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/t62;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/t62;->b:La/w62;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/w62;->Q1:La/pek0;

    .line 11
    .line 12
    new-instance v1, La/q0h0;

    .line 13
    .line 14
    iget-object v0, v0, La/w62;->N1:La/a8z;

    .line 15
    .line 16
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/esi;

    .line 21
    .line 22
    iget-object v0, v0, La/esi;->s:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/dsi;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget-object v1, La/w62;->Q1:La/pek0;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    instance-of v2, v1, La/af3;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    check-cast v1, La/af3;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object v1, v3

    .line 56
    :goto_0
    const-class v2, La/p5g0;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/o5d0;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/ze3;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v1, v3

    .line 80
    :goto_1
    instance-of v4, v1, La/p5g0;

    .line 81
    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    move-object v1, v3

    .line 85
    :cond_2
    check-cast v1, La/p5g0;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    iget-object v2, v0, La/w62;->K1:La/khf0;

    .line 94
    .line 95
    sget-object v3, La/w62;->R1:[La/iiy;

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
    move-object v11, v2

    .line 105
    check-cast v11, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;

    .line 106
    .line 107
    sget-object v2, La/qx40;->a:La/chf0;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    const-class v2, La/s72;

    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-static {v2}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-static {v0, v2}, La/qx40;->b(Landroid/app/Application;Ljava/util/Set;)La/chf0;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-object v0, v0, La/chf0;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, La/n5d0;

    .line 137
    .line 138
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    move-object v12, v0

    .line 143
    check-cast v12, La/sx40;

    .line 144
    .line 145
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iget-object v5, v1, La/p5g0;->b:La/zx10;

    .line 152
    .line 153
    iget-object v6, v1, La/p5g0;->i:La/iw20;

    .line 154
    .line 155
    iget-object v7, v1, La/p5g0;->a:La/ctf0;

    .line 156
    .line 157
    iget-object v8, v1, La/p5g0;->c:La/m1e;

    .line 158
    .line 159
    iget-object v13, v1, La/p5g0;->d:La/knf0;

    .line 160
    .line 161
    iget-object v0, v1, La/p5g0;->g:La/sjl0;

    .line 162
    .line 163
    iget-object v15, v1, La/p5g0;->h:La/mne;

    .line 164
    .line 165
    iget-object v10, v1, La/p5g0;->e:La/u5g0;

    .line 166
    .line 167
    iget-object v2, v1, La/p5g0;->j:La/bzt;

    .line 168
    .line 169
    iget-object v14, v1, La/p5g0;->f:La/gii0;

    .line 170
    .line 171
    iget-object v3, v1, La/p5g0;->k:La/fvt0;

    .line 172
    .line 173
    iget-object v4, v1, La/p5g0;->l:La/nv20;

    .line 174
    .line 175
    move-object/from16 v17, v0

    .line 176
    .line 177
    iget-object v0, v1, La/p5g0;->m:La/z8u;

    .line 178
    .line 179
    move-object/from16 v20, v0

    .line 180
    .line 181
    iget-object v0, v1, La/p5g0;->n:La/ivn;

    .line 182
    .line 183
    iget-object v1, v1, La/p5g0;->o:La/wdk0;

    .line 184
    .line 185
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-object/from16 v19, v4

    .line 207
    .line 208
    new-instance v4, La/esi;

    .line 209
    .line 210
    move-object/from16 v21, v0

    .line 211
    .line 212
    move-object/from16 v22, v1

    .line 213
    .line 214
    move-object/from16 v16, v2

    .line 215
    .line 216
    move-object/from16 v18, v3

    .line 217
    .line 218
    invoke-direct/range {v4 .. v22}, La/esi;-><init>(La/zx10;La/iw20;La/ctf0;La/m1e;La/i1w0;La/u5g0;Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;La/sx40;La/knf0;La/gii0;La/mne;La/bzt;La/sjl0;La/fvt0;La/nv20;La/z8u;La/ivn;La/wdk0;)V

    .line 219
    .line 220
    .line 221
    move-object v3, v4

    .line 222
    goto :goto_2

    .line 223
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 224
    .line 225
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :goto_2
    return-object v3

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
