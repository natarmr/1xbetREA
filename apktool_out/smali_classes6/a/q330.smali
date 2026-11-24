.class public final synthetic La/q330;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v330;


# direct methods
.method public synthetic constructor <init>(La/v330;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q330;->a:B

    iput-object p1, p0, La/q330;->b:La/v330;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/q330;->a:B

    .line 2
    .line 3
    sget-object v1, La/e330;->a:La/e330;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/q330;->b:La/v330;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 12
    .line 13
    invoke-virtual {p0}, La/v330;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 24
    .line 25
    invoke-virtual {p0}, La/v330;->G0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, La/h330;->a:La/h330;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_1
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 38
    .line 39
    invoke-virtual {p0}, La/v330;->G0()La/k3t0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object v0, La/i330;->a:La/i330;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_2
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 52
    .line 53
    iget-object p0, p0, La/v330;->O1:La/fiu0;

    .line 54
    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_0
    const-string p0, "viewModelFactory"

    .line 59
    .line 60
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v2

    .line 64
    :pswitch_3
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 65
    .line 66
    invoke-virtual {p0}, La/v330;->G0()La/k3t0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_4
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    instance-of v1, v0, La/af3;

    .line 90
    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    check-cast v0, La/af3;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    move-object v0, v2

    .line 97
    :goto_0
    const-class v1, La/w330;

    .line 98
    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/o5d0;

    .line 110
    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/ze3;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    move-object v0, v2

    .line 121
    :goto_1
    instance-of v3, v0, La/w330;

    .line 122
    .line 123
    if-nez v3, :cond_3

    .line 124
    .line 125
    move-object v0, v2

    .line 126
    :cond_3
    check-cast v0, La/w330;

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object v4, v0, La/w330;->b:La/cad;

    .line 138
    .line 139
    iget-object v5, v0, La/w330;->a:La/ctf0;

    .line 140
    .line 141
    iget-object p0, v0, La/w330;->c:La/q7d0;

    .line 142
    .line 143
    iget-object v7, v0, La/w330;->d:La/zfo;

    .line 144
    .line 145
    iget-object v8, v0, La/w330;->e:La/edo;

    .line 146
    .line 147
    iget-object v9, v0, La/w330;->f:La/k7u;

    .line 148
    .line 149
    iget-object v10, v0, La/w330;->g:La/wyt;

    .line 150
    .line 151
    iget-object v11, v0, La/w330;->h:La/v230;

    .line 152
    .line 153
    iget-object v12, v0, La/w330;->i:La/ii;

    .line 154
    .line 155
    iget-object v1, v0, La/w330;->j:La/j1q0;

    .line 156
    .line 157
    iget-object v13, v0, La/w330;->k:La/r9u;

    .line 158
    .line 159
    iget-object v14, v0, La/w330;->l:La/pru;

    .line 160
    .line 161
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    new-instance v3, La/dli;

    .line 192
    .line 193
    invoke-direct/range {v3 .. v14}, La/dli;-><init>(La/cad;La/ctf0;La/i1w0;La/zfo;La/edo;La/k7u;La/wyt;La/v230;La/ii;La/r9u;La/pru;)V

    .line 194
    .line 195
    .line 196
    move-object v2, v3

    .line 197
    goto :goto_2

    .line 198
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 199
    .line 200
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :goto_2
    return-object v2

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
