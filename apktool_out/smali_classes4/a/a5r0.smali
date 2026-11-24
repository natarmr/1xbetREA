.class public final synthetic La/a5r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b5r0;


# direct methods
.method public synthetic constructor <init>(La/b5r0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/a5r0;->a:B

    iput-object p1, p0, La/a5r0;->b:La/b5r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a5r0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/a5r0;->b:La/b5r0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/b5r0;->t2:La/j6m0;

    .line 11
    .line 12
    invoke-virtual {v0}, La/b5r0;->Q0()La/k3t0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, La/i4r0;->a:La/i4r0;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    sget-object v1, La/b5r0;->t2:La/j6m0;

    .line 25
    .line 26
    invoke-virtual {v0}, La/b5r0;->Q0()La/k3t0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, La/l4r0;->a:La/l4r0;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    sget-object v1, La/b5r0;->t2:La/j6m0;

    .line 39
    .line 40
    new-instance v1, La/q0h0;

    .line 41
    .line 42
    invoke-virtual {v0}, La/b5r0;->P0()La/nxi;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v0, v0, La/nxi;->q:La/n5d0;

    .line 47
    .line 48
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, La/mxi;

    .line 53
    .line 54
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_2
    sget-object v1, La/b5r0;->t2:La/j6m0;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    instance-of v2, v1, La/af3;

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    if-eqz v2, :cond_0

    .line 75
    .line 76
    check-cast v1, La/af3;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move-object v1, v3

    .line 80
    :goto_0
    const-class v2, La/v4r0;

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, La/o5d0;

    .line 93
    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, La/ze3;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    move-object v1, v3

    .line 104
    :goto_1
    instance-of v4, v1, La/v4r0;

    .line 105
    .line 106
    if-nez v4, :cond_2

    .line 107
    .line 108
    move-object v1, v3

    .line 109
    :cond_2
    check-cast v1, La/v4r0;

    .line 110
    .line 111
    if-eqz v1, :cond_3

    .line 112
    .line 113
    iget-object v2, v0, La/b5r0;->k2:La/khf0;

    .line 114
    .line 115
    sget-object v3, La/b5r0;->u2:[La/iiy;

    .line 116
    .line 117
    const/4 v4, 0x0

    .line 118
    aget-object v3, v3, v4

    .line 119
    .line 120
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    move-object/from16 v18, v0

    .line 125
    .line 126
    check-cast v18, Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;

    .line 127
    .line 128
    iget-object v4, v1, La/v4r0;->a:La/itr;

    .line 129
    .line 130
    iget-object v3, v1, La/v4r0;->c:La/d1p;

    .line 131
    .line 132
    iget-object v5, v1, La/v4r0;->b:La/iip;

    .line 133
    .line 134
    iget-object v6, v1, La/v4r0;->d:La/iw20;

    .line 135
    .line 136
    iget-object v7, v1, La/v4r0;->e:La/ugf0;

    .line 137
    .line 138
    iget-object v9, v1, La/v4r0;->o:La/sue;

    .line 139
    .line 140
    iget-object v8, v1, La/v4r0;->g:La/n5r0;

    .line 141
    .line 142
    iget-object v13, v1, La/v4r0;->f:La/kt2;

    .line 143
    .line 144
    iget-object v10, v1, La/v4r0;->h:La/r9u;

    .line 145
    .line 146
    iget-object v11, v1, La/v4r0;->i:La/y78;

    .line 147
    .line 148
    iget-object v12, v1, La/v4r0;->j:La/m1e;

    .line 149
    .line 150
    iget-object v14, v1, La/v4r0;->k:La/ctf0;

    .line 151
    .line 152
    iget-object v15, v1, La/v4r0;->l:La/g2v;

    .line 153
    .line 154
    iget-object v0, v1, La/v4r0;->m:La/mne;

    .line 155
    .line 156
    iget-object v1, v1, La/v4r0;->n:La/wdk0;

    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    new-instance v2, La/nxi;

    .line 189
    .line 190
    move-object/from16 v16, v0

    .line 191
    .line 192
    move-object/from16 v17, v1

    .line 193
    .line 194
    invoke-direct/range {v2 .. v18}, La/nxi;-><init>(La/d1p;La/itr;La/iip;La/iw20;La/ugf0;La/n5r0;La/sue;La/r9u;La/y78;La/m1e;La/kt2;La/ctf0;La/g2v;La/mne;La/wdk0;Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;)V

    .line 195
    .line 196
    .line 197
    move-object v3, v2

    .line 198
    goto :goto_2

    .line 199
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 200
    .line 201
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    :goto_2
    return-object v3

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
