.class public final synthetic La/ga2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ia2;


# direct methods
.method public synthetic constructor <init>(La/ia2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ga2;->a:B

    iput-object p1, p0, La/ga2;->b:La/ia2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ga2;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/ga2;->b:La/ia2;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/ia2;->Q1:La/rek0;

    .line 11
    .line 12
    new-instance v1, La/q0h0;

    .line 13
    .line 14
    iget-object v0, v0, La/ia2;->N1:La/a8z;

    .line 15
    .line 16
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/wii;

    .line 21
    .line 22
    iget-object v0, v0, La/wii;->q:La/n5d0;

    .line 23
    .line 24
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/vii;

    .line 29
    .line 30
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    sget-object v1, La/ia2;->Q1:La/rek0;

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
    const-class v2, La/q6w;

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
    instance-of v4, v1, La/q6w;

    .line 81
    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    move-object v1, v3

    .line 85
    :cond_2
    check-cast v1, La/q6w;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 90
    .line 91
    .line 92
    move-result-object v15

    .line 93
    iget-object v2, v0, La/ia2;->K1:La/khf0;

    .line 94
    .line 95
    sget-object v3, La/ia2;->R1:[La/iiy;

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
    move-object/from16 v16, v0

    .line 105
    .line 106
    check-cast v16, Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;

    .line 107
    .line 108
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v8, v1, La/q6w;->a:La/epi0;

    .line 112
    .line 113
    iget-object v7, v1, La/q6w;->c:La/bwl;

    .line 114
    .line 115
    iget-object v10, v1, La/q6w;->e:La/u5g0;

    .line 116
    .line 117
    iget-object v5, v1, La/q6w;->b:La/ugf0;

    .line 118
    .line 119
    iget-object v11, v1, La/q6w;->f:La/knf0;

    .line 120
    .line 121
    iget-object v6, v1, La/q6w;->d:La/iip;

    .line 122
    .line 123
    iget-object v12, v1, La/q6w;->h:La/m1e;

    .line 124
    .line 125
    iget-object v13, v1, La/q6w;->g:La/gii0;

    .line 126
    .line 127
    iget-object v14, v1, La/q6w;->i:La/ctf0;

    .line 128
    .line 129
    iget-object v9, v1, La/q6w;->j:La/mne;

    .line 130
    .line 131
    iget-object v0, v1, La/q6w;->k:La/pru;

    .line 132
    .line 133
    iget-object v2, v1, La/q6w;->l:La/reu;

    .line 134
    .line 135
    iget-object v1, v1, La/q6w;->m:La/bzt;

    .line 136
    .line 137
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    new-instance v4, La/wii;

    .line 156
    .line 157
    move-object/from16 v17, v0

    .line 158
    .line 159
    move-object/from16 v19, v1

    .line 160
    .line 161
    move-object/from16 v18, v2

    .line 162
    .line 163
    invoke-direct/range {v4 .. v19}, La/wii;-><init>(La/ugf0;La/iip;La/bwl;La/epi0;La/mne;La/u5g0;La/knf0;La/m1e;La/gii0;La/ctf0;La/i1w0;Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;La/pru;La/reu;La/bzt;)V

    .line 164
    .line 165
    .line 166
    move-object v3, v4

    .line 167
    goto :goto_2

    .line 168
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 169
    .line 170
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :goto_2
    return-object v3

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
