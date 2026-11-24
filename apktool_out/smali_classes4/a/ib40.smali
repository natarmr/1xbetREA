.class public final synthetic La/ib40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lb40;


# direct methods
.method public synthetic constructor <init>(La/lb40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ib40;->a:B

    iput-object p1, p0, La/ib40;->b:La/lb40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ib40;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/ib40;->b:La/lb40;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/lb40;->P1:La/htz;

    .line 12
    .line 13
    invoke-virtual {v0}, La/lb40;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/sa40;->a:La/sa40;

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
    sget-object v1, La/lb40;->P1:La/htz;

    .line 26
    .line 27
    invoke-virtual {v0}, La/lb40;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/ta40;->a:La/ta40;

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
    sget-object v1, La/lb40;->P1:La/htz;

    .line 40
    .line 41
    iget-object v0, v0, La/lb40;->K1:La/fiu0;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_0
    const-string v0, "viewModelFactory"

    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v2

    .line 52
    :pswitch_2
    sget-object v1, La/lb40;->P1:La/htz;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    instance-of v3, v1, La/af3;

    .line 66
    .line 67
    if-eqz v3, :cond_1

    .line 68
    .line 69
    check-cast v1, La/af3;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    move-object v1, v2

    .line 73
    :goto_0
    const-class v3, La/mb40;

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, La/o5d0;

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, La/ze3;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    move-object v1, v2

    .line 97
    :goto_1
    instance-of v4, v1, La/mb40;

    .line 98
    .line 99
    if-nez v4, :cond_3

    .line 100
    .line 101
    move-object v1, v2

    .line 102
    :cond_3
    check-cast v1, La/mb40;

    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 107
    .line 108
    .line 109
    move-result-object v14

    .line 110
    iget-object v2, v0, La/lb40;->O1:La/khf0;

    .line 111
    .line 112
    sget-object v3, La/lb40;->Q1:[La/iiy;

    .line 113
    .line 114
    const/4 v4, 0x0

    .line 115
    aget-object v3, v3, v4

    .line 116
    .line 117
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    move-object/from16 v18, v0

    .line 122
    .line 123
    check-cast v18, Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;

    .line 124
    .line 125
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v5, v1, La/mb40;->a:La/cad;

    .line 129
    .line 130
    iget-object v0, v1, La/mb40;->b:La/xri;

    .line 131
    .line 132
    iget-object v6, v1, La/mb40;->c:La/pyg;

    .line 133
    .line 134
    iget-object v7, v1, La/mb40;->d:La/ctf0;

    .line 135
    .line 136
    iget-object v8, v1, La/mb40;->e:La/m1e;

    .line 137
    .line 138
    iget-object v9, v1, La/mb40;->f:La/g2v;

    .line 139
    .line 140
    iget-object v10, v1, La/mb40;->g:La/wdk0;

    .line 141
    .line 142
    iget-object v11, v1, La/mb40;->h:La/rou;

    .line 143
    .line 144
    iget-object v12, v1, La/mb40;->i:La/uzc;

    .line 145
    .line 146
    iget-object v13, v1, La/mb40;->j:La/qv2;

    .line 147
    .line 148
    iget-object v15, v1, La/mb40;->k:La/gii0;

    .line 149
    .line 150
    iget-object v2, v1, La/mb40;->l:La/knf0;

    .line 151
    .line 152
    iget-object v3, v1, La/mb40;->m:La/x0u;

    .line 153
    .line 154
    iget-object v4, v1, La/mb40;->n:La/kuy;

    .line 155
    .line 156
    move-object/from16 v16, v0

    .line 157
    .line 158
    iget-object v0, v1, La/mb40;->o:La/r9u;

    .line 159
    .line 160
    iget-object v1, v1, La/mb40;->p:La/gst0;

    .line 161
    .line 162
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    new-instance v4, La/sli;

    .line 196
    .line 197
    move-object/from16 v19, v0

    .line 198
    .line 199
    move-object/from16 v20, v1

    .line 200
    .line 201
    move-object/from16 v16, v2

    .line 202
    .line 203
    move-object/from16 v17, v3

    .line 204
    .line 205
    invoke-direct/range {v4 .. v20}, La/sli;-><init>(La/cad;La/pyg;La/ctf0;La/m1e;La/g2v;La/wdk0;La/rou;La/uzc;La/qv2;La/i1w0;La/gii0;La/knf0;La/x0u;Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;La/r9u;La/gst0;)V

    .line 206
    .line 207
    .line 208
    move-object v2, v4

    .line 209
    goto :goto_2

    .line 210
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 211
    .line 212
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    :goto_2
    return-object v2

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
