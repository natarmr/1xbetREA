.class public final synthetic La/bm60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dm60;


# direct methods
.method public synthetic constructor <init>(La/dm60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bm60;->a:B

    iput-object p1, p0, La/bm60;->b:La/dm60;

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
    iget-byte v1, v0, La/bm60;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/bm60;->b:La/dm60;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/dm60;->P1:La/wsz;

    .line 12
    .line 13
    invoke-virtual {v0}, La/dm60;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/qe8;->a:La/qe8;

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
    sget-object v1, La/dm60;->P1:La/wsz;

    .line 26
    .line 27
    invoke-virtual {v0}, La/dm60;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/ue8;->a:La/ue8;

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
    sget-object v1, La/dm60;->P1:La/wsz;

    .line 40
    .line 41
    iget-object v0, v0, La/dm60;->N1:La/fiu0;

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
    sget-object v1, La/dm60;->P1:La/wsz;

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
    const-class v3, La/em60;

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
    instance-of v4, v1, La/em60;

    .line 98
    .line 99
    if-nez v4, :cond_3

    .line 100
    .line 101
    move-object v1, v2

    .line 102
    :cond_3
    check-cast v1, La/em60;

    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v6, v1, La/em60;->a:La/fvt0;

    .line 114
    .line 115
    iget-object v5, v1, La/em60;->b:La/bw60;

    .line 116
    .line 117
    iget-object v8, v1, La/em60;->c:La/m1e;

    .line 118
    .line 119
    iget-object v9, v1, La/em60;->d:La/mne;

    .line 120
    .line 121
    iget-object v10, v1, La/em60;->e:La/duj;

    .line 122
    .line 123
    iget-object v11, v1, La/em60;->f:La/ctf0;

    .line 124
    .line 125
    iget-object v12, v1, La/em60;->g:La/b4j;

    .line 126
    .line 127
    iget-object v13, v1, La/em60;->h:La/g2v;

    .line 128
    .line 129
    iget-object v14, v1, La/em60;->i:La/x20;

    .line 130
    .line 131
    iget-object v15, v1, La/em60;->j:La/tnc0;

    .line 132
    .line 133
    iget-object v0, v1, La/em60;->k:La/l570;

    .line 134
    .line 135
    iget-object v2, v1, La/em60;->l:La/o3c;

    .line 136
    .line 137
    iget-object v3, v1, La/em60;->m:La/lbu;

    .line 138
    .line 139
    iget-object v4, v1, La/em60;->n:La/ls;

    .line 140
    .line 141
    move-object/from16 v16, v0

    .line 142
    .line 143
    iget-object v0, v1, La/em60;->o:La/yoc;

    .line 144
    .line 145
    move-object/from16 v20, v0

    .line 146
    .line 147
    iget-object v0, v1, La/em60;->p:La/wtt;

    .line 148
    .line 149
    iget-object v1, v1, La/em60;->q:La/us00;

    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-object/from16 v19, v4

    .line 164
    .line 165
    new-instance v4, La/mmi;

    .line 166
    .line 167
    move-object/from16 v21, v0

    .line 168
    .line 169
    move-object/from16 v22, v1

    .line 170
    .line 171
    move-object/from16 v17, v2

    .line 172
    .line 173
    move-object/from16 v18, v3

    .line 174
    .line 175
    invoke-direct/range {v4 .. v22}, La/mmi;-><init>(La/bw60;La/fvt0;La/i1w0;La/m1e;La/mne;La/duj;La/ctf0;La/b4j;La/g2v;La/x20;La/tnc0;La/l570;La/o3c;La/lbu;La/ls;La/yoc;La/wtt;La/us00;)V

    .line 176
    .line 177
    .line 178
    move-object v2, v4

    .line 179
    goto :goto_2

    .line 180
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 181
    .line 182
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    :goto_2
    return-object v2

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
