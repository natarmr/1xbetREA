.class public final synthetic La/xfg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zfg;


# direct methods
.method public synthetic constructor <init>(La/zfg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xfg;->a:B

    iput-object p1, p0, La/xfg;->b:La/zfg;

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
    iget-byte v1, v0, La/xfg;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/xfg;->b:La/zfg;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/zfg;->S1:La/kud;

    .line 12
    .line 13
    invoke-virtual {v0}, La/zfg;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/lfg;->a:La/lfg;

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
    sget-object v1, La/zfg;->S1:La/kud;

    .line 26
    .line 27
    invoke-virtual {v0}, La/zfg;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/mfg;->a:La/mfg;

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
    sget-object v1, La/zfg;->S1:La/kud;

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
    const-class v3, La/zdg;

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
    instance-of v4, v1, La/zdg;

    .line 85
    .line 86
    if-nez v4, :cond_2

    .line 87
    .line 88
    move-object v1, v2

    .line 89
    :cond_2
    check-cast v1, La/zdg;

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    iget-object v2, v0, La/zfg;->O1:La/khf0;

    .line 94
    .line 95
    sget-object v3, La/zfg;->U1:[La/iiy;

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
    move-result-object v0

    .line 104
    move-object v7, v0

    .line 105
    check-cast v7, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 106
    .line 107
    iget-object v0, v1, La/zdg;->a:La/gii0;

    .line 108
    .line 109
    iget-object v8, v1, La/zdg;->b:La/m1e;

    .line 110
    .line 111
    iget-object v9, v1, La/zdg;->c:La/mne;

    .line 112
    .line 113
    iget-object v10, v1, La/zdg;->d:La/oeg0;

    .line 114
    .line 115
    iget-object v11, v1, La/zdg;->e:La/g2v;

    .line 116
    .line 117
    iget-object v3, v1, La/zdg;->f:La/pyg;

    .line 118
    .line 119
    iget-object v4, v1, La/zdg;->g:La/rrc;

    .line 120
    .line 121
    iget-object v14, v1, La/zdg;->j:La/wdk0;

    .line 122
    .line 123
    iget-object v12, v1, La/zdg;->h:La/ctf0;

    .line 124
    .line 125
    iget-object v13, v1, La/zdg;->i:La/wgu;

    .line 126
    .line 127
    iget-object v5, v1, La/zdg;->k:La/roi0;

    .line 128
    .line 129
    iget-object v15, v1, La/zdg;->l:La/pmi;

    .line 130
    .line 131
    iget-object v2, v1, La/zdg;->m:La/pru;

    .line 132
    .line 133
    iget-object v6, v1, La/zdg;->n:La/kt2;

    .line 134
    .line 135
    move-object/from16 v16, v0

    .line 136
    .line 137
    iget-object v0, v1, La/zdg;->o:La/zr1;

    .line 138
    .line 139
    iget-object v1, v1, La/zdg;->p:La/epi0;

    .line 140
    .line 141
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-object/from16 v16, v2

    .line 166
    .line 167
    new-instance v2, La/gei;

    .line 168
    .line 169
    move-object/from16 v18, v0

    .line 170
    .line 171
    move-object/from16 v17, v6

    .line 172
    .line 173
    move-object v6, v1

    .line 174
    invoke-direct/range {v2 .. v18}, La/gei;-><init>(La/pyg;La/rrc;La/roi0;La/epi0;Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;La/m1e;La/mne;La/oeg0;La/g2v;La/ctf0;La/wgu;La/wdk0;La/pmi;La/pru;La/kt2;La/zr1;)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 179
    .line 180
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :goto_2
    return-object v2

    .line 188
    :pswitch_2
    sget-object v1, La/zfg;->S1:La/kud;

    .line 189
    .line 190
    iget-object v0, v0, La/zfg;->L1:La/fiu0;

    .line 191
    .line 192
    if-eqz v0, :cond_4

    .line 193
    .line 194
    return-object v0

    .line 195
    :cond_4
    const-string v0, "viewModelFactory"

    .line 196
    .line 197
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v2

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
