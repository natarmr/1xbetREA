.class public final synthetic La/rap0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sap0;


# direct methods
.method public synthetic constructor <init>(La/sap0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rap0;->a:B

    iput-object p1, p0, La/rap0;->b:La/sap0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rap0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/rap0;->b:La/sap0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/sap0;->R1:La/j6m0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/sap0;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/fap0;->a:La/fap0;

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
    sget-object v1, La/sap0;->R1:La/j6m0;

    .line 26
    .line 27
    invoke-virtual {v0}, La/sap0;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/gap0;->a:La/gap0;

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
    sget-object v1, La/sap0;->R1:La/j6m0;

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
    const-class v3, La/tap0;

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
    instance-of v4, v1, La/tap0;

    .line 85
    .line 86
    if-nez v4, :cond_2

    .line 87
    .line 88
    move-object v1, v2

    .line 89
    :cond_2
    check-cast v1, La/tap0;

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    iget-object v2, v0, La/sap0;->Q1:La/khf0;

    .line 94
    .line 95
    sget-object v3, La/sap0;->S1:[La/iiy;

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
    move-object v8, v2

    .line 105
    check-cast v8, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;

    .line 106
    .line 107
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v10, v1, La/tap0;->a:La/g2v;

    .line 115
    .line 116
    iget-object v11, v1, La/tap0;->b:La/ctf0;

    .line 117
    .line 118
    iget-object v12, v1, La/tap0;->c:La/m1e;

    .line 119
    .line 120
    iget-object v13, v1, La/tap0;->d:La/gii0;

    .line 121
    .line 122
    iget-object v14, v1, La/tap0;->e:La/knf0;

    .line 123
    .line 124
    iget-object v15, v1, La/tap0;->f:La/wiu;

    .line 125
    .line 126
    iget-object v0, v1, La/tap0;->g:La/wdk0;

    .line 127
    .line 128
    iget-object v4, v1, La/tap0;->h:La/cad;

    .line 129
    .line 130
    iget-object v5, v1, La/tap0;->i:La/roi0;

    .line 131
    .line 132
    iget-object v6, v1, La/tap0;->j:La/rrc;

    .line 133
    .line 134
    iget-object v2, v1, La/tap0;->k:La/pyg;

    .line 135
    .line 136
    iget-object v7, v1, La/tap0;->l:La/epi0;

    .line 137
    .line 138
    iget-object v1, v1, La/tap0;->m:La/pru;

    .line 139
    .line 140
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v3, La/lwi;

    .line 159
    .line 160
    move-object/from16 v16, v0

    .line 161
    .line 162
    move-object/from16 v17, v1

    .line 163
    .line 164
    invoke-direct/range {v3 .. v17}, La/lwi;-><init>(La/cad;La/roi0;La/rrc;La/epi0;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;La/i1w0;La/g2v;La/ctf0;La/m1e;La/gii0;La/knf0;La/wiu;La/wdk0;La/pru;)V

    .line 165
    .line 166
    .line 167
    move-object v2, v3

    .line 168
    goto :goto_2

    .line 169
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 170
    .line 171
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :goto_2
    return-object v2

    .line 179
    :pswitch_2
    sget-object v1, La/sap0;->R1:La/j6m0;

    .line 180
    .line 181
    iget-object v0, v0, La/sap0;->L1:La/fiu0;

    .line 182
    .line 183
    if-eqz v0, :cond_4

    .line 184
    .line 185
    return-object v0

    .line 186
    :cond_4
    const-string v0, "viewModelFactory"

    .line 187
    .line 188
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v2

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
