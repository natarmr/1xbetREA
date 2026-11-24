.class public final synthetic La/td2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vd2;


# direct methods
.method public synthetic constructor <init>(La/vd2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/td2;->a:B

    iput-object p1, p0, La/td2;->b:La/vd2;

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
    iget-byte v1, v0, La/td2;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/td2;->b:La/vd2;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/vd2;->R1:La/gfk0;

    .line 11
    .line 12
    new-instance v1, La/q0h0;

    .line 13
    .line 14
    iget-object v0, v0, La/vd2;->M1:La/a8z;

    .line 15
    .line 16
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/b8i;

    .line 21
    .line 22
    iget-object v0, v0, La/b8i;->q:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/a8i;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget-object v1, La/vd2;->R1:La/gfk0;

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
    const-class v2, La/wd2;

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
    instance-of v4, v1, La/wd2;

    .line 81
    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    move-object v1, v3

    .line 85
    :cond_2
    check-cast v1, La/wd2;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    iget-object v2, v0, La/vd2;->K1:La/khf0;

    .line 94
    .line 95
    sget-object v3, La/vd2;->S1:[La/iiy;

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
    move-object v14, v0

    .line 105
    check-cast v14, Lorg/xplatform/results/impl/presentation/alt_live_games/GamesLiveResultsParams;

    .line 106
    .line 107
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v9, v1, La/wd2;->a:La/epi0;

    .line 111
    .line 112
    iget-object v5, v1, La/wd2;->c:La/zx10;

    .line 113
    .line 114
    iget-object v6, v1, La/wd2;->b:La/ugf0;

    .line 115
    .line 116
    iget-object v10, v1, La/wd2;->e:La/mne;

    .line 117
    .line 118
    iget-object v11, v1, La/wd2;->d:La/m1e;

    .line 119
    .line 120
    iget-object v12, v1, La/wd2;->f:La/duj;

    .line 121
    .line 122
    iget-object v15, v1, La/wd2;->g:La/y78;

    .line 123
    .line 124
    iget-object v0, v1, La/wd2;->h:La/ctf0;

    .line 125
    .line 126
    iget-object v2, v1, La/wd2;->i:La/lbu;

    .line 127
    .line 128
    iget-object v3, v1, La/wd2;->j:La/wdk0;

    .line 129
    .line 130
    iget-object v4, v1, La/wd2;->k:La/pru;

    .line 131
    .line 132
    iget-object v7, v1, La/wd2;->l:La/bzt;

    .line 133
    .line 134
    move-object/from16 v20, v7

    .line 135
    .line 136
    iget-object v7, v1, La/wd2;->m:La/iip;

    .line 137
    .line 138
    iget-object v8, v1, La/wd2;->n:La/itr;

    .line 139
    .line 140
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-object/from16 v19, v4

    .line 156
    .line 157
    new-instance v4, La/b8i;

    .line 158
    .line 159
    move-object/from16 v16, v0

    .line 160
    .line 161
    move-object/from16 v17, v2

    .line 162
    .line 163
    move-object/from16 v18, v3

    .line 164
    .line 165
    invoke-direct/range {v4 .. v20}, La/b8i;-><init>(La/zx10;La/ugf0;La/iip;La/itr;La/epi0;La/mne;La/m1e;La/duj;La/i1w0;Lorg/xplatform/results/impl/presentation/alt_live_games/GamesLiveResultsParams;La/y78;La/ctf0;La/lbu;La/wdk0;La/pru;La/bzt;)V

    .line 166
    .line 167
    .line 168
    move-object v3, v4

    .line 169
    goto :goto_2

    .line 170
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 171
    .line 172
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :goto_2
    return-object v3

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
