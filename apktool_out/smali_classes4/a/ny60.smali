.class public final synthetic La/ny60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/py60;


# direct methods
.method public synthetic constructor <init>(La/py60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ny60;->a:B

    iput-object p1, p0, La/ny60;->b:La/py60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ny60;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/ny60;->b:La/py60;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/py60;->P1:[La/iiy;

    .line 12
    .line 13
    iget-object v0, v0, La/py60;->N1:La/fiu0;

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
    sget-object v1, La/py60;->P1:[La/iiy;

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
    const-class v3, La/h3q;

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
    instance-of v4, v1, La/h3q;

    .line 70
    .line 71
    if-nez v4, :cond_3

    .line 72
    .line 73
    move-object v1, v2

    .line 74
    :cond_3
    check-cast v1, La/h3q;

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object v3, v1, La/h3q;->i:La/iw20;

    .line 86
    .line 87
    iget-object v4, v1, La/h3q;->g:La/cad;

    .line 88
    .line 89
    iget-object v5, v1, La/h3q;->a:La/duj;

    .line 90
    .line 91
    iget-object v0, v1, La/h3q;->b:La/m1e;

    .line 92
    .line 93
    iget-object v2, v1, La/h3q;->p:La/bw60;

    .line 94
    .line 95
    iget-object v6, v1, La/h3q;->c:La/oeg0;

    .line 96
    .line 97
    iget-object v7, v1, La/h3q;->d:La/ctf0;

    .line 98
    .line 99
    iget-object v8, v1, La/h3q;->m:La/r9u;

    .line 100
    .line 101
    iget-object v9, v1, La/h3q;->e:La/ii;

    .line 102
    .line 103
    iget-object v10, v1, La/h3q;->f:La/wdk0;

    .line 104
    .line 105
    move-object v11, v6

    .line 106
    iget-object v6, v1, La/h3q;->h:La/uyn;

    .line 107
    .line 108
    move-object v12, v8

    .line 109
    iget-object v8, v1, La/h3q;->j:La/jtj;

    .line 110
    .line 111
    move-object v13, v9

    .line 112
    iget-object v9, v1, La/h3q;->k:La/lbu;

    .line 113
    .line 114
    move-object v14, v10

    .line 115
    iget-object v10, v1, La/h3q;->l:La/hs60;

    .line 116
    .line 117
    move-object v15, v11

    .line 118
    iget-object v11, v1, La/h3q;->n:La/hnu;

    .line 119
    .line 120
    move-object/from16 v16, v12

    .line 121
    .line 122
    iget-object v12, v1, La/h3q;->o:La/b8u;

    .line 123
    .line 124
    iget-object v1, v1, La/h3q;->q:La/gw60;

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    new-instance v2, La/ehi;

    .line 148
    .line 149
    move-object v13, v1

    .line 150
    invoke-direct/range {v2 .. v13}, La/ehi;-><init>(La/iw20;La/cad;La/duj;La/uyn;La/ctf0;La/jtj;La/lbu;La/hs60;La/hnu;La/b8u;La/gw60;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 155
    .line 156
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :goto_2
    return-object v2

    .line 164
    :pswitch_1
    sget-object v1, La/py60;->P1:[La/iiy;

    .line 165
    .line 166
    iget-object v0, v0, La/py60;->O1:La/a8z;

    .line 167
    .line 168
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    check-cast v0, La/k3t0;

    .line 173
    .line 174
    sget-object v1, La/gy60;->a:La/gy60;

    .line 175
    .line 176
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object v0

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
