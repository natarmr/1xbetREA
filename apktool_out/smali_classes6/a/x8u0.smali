.class public final synthetic La/x8u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a9u0;


# direct methods
.method public synthetic constructor <init>(La/a9u0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x8u0;->a:B

    iput-object p1, p0, La/x8u0;->b:La/a9u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/x8u0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/x8u0;->b:La/a9u0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/a9u0;->R1:La/uxs0;

    .line 10
    .line 11
    new-instance v0, La/m8u0;

    .line 12
    .line 13
    new-instance v1, La/ggt0;

    .line 14
    .line 15
    const/4 v2, 0x6

    .line 16
    invoke-direct {v1, p0, v2}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    sget-object p0, La/m8u0;->f:La/pn20;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/qv5;-><init>(La/dtb;)V

    .line 22
    .line 23
    .line 24
    new-instance p0, La/b4u0;

    .line 25
    .line 26
    const/4 v2, 0x7

    .line 27
    invoke-direct {p0, v2}, La/b4u0;-><init>(B)V

    .line 28
    .line 29
    .line 30
    new-instance v2, La/npt0;

    .line 31
    .line 32
    const/4 v3, 0x5

    .line 33
    invoke-direct {v2, v1, v3}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    new-instance v1, La/d8q0;

    .line 37
    .line 38
    const/4 v3, 0x3

    .line 39
    const/16 v4, 0x14

    .line 40
    .line 41
    invoke-direct {v1, v3, v4}, La/d8q0;-><init>(IB)V

    .line 42
    .line 43
    .line 44
    sget-object v3, La/pfo0;->Y:La/pfo0;

    .line 45
    .line 46
    new-instance v4, La/gbn;

    .line 47
    .line 48
    invoke-direct {v4, p0, v1, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 52
    .line 53
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_0
    sget-object v0, La/a9u0;->R1:La/uxs0;

    .line 58
    .line 59
    new-instance v0, La/ry3;

    .line 60
    .line 61
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object p0, p0, La/a9u0;->O1:La/xyi;

    .line 66
    .line 67
    if-eqz p0, :cond_0

    .line 68
    .line 69
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_0
    const-string p0, "verificationOptionsViewModelFactory"

    .line 74
    .line 75
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v1

    .line 79
    :pswitch_1
    sget-object v0, La/a9u0;->R1:La/uxs0;

    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    instance-of v2, v0, La/af3;

    .line 93
    .line 94
    if-eqz v2, :cond_1

    .line 95
    .line 96
    check-cast v0, La/af3;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    move-object v0, v1

    .line 100
    :goto_0
    const-class v2, La/b9u0;

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, La/o5d0;

    .line 113
    .line 114
    if-eqz v0, :cond_2

    .line 115
    .line 116
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, La/ze3;

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    move-object v0, v1

    .line 124
    :goto_1
    instance-of v3, v0, La/b9u0;

    .line 125
    .line 126
    if-nez v3, :cond_3

    .line 127
    .line 128
    move-object v0, v1

    .line 129
    :cond_3
    check-cast v0, La/b9u0;

    .line 130
    .line 131
    if-eqz v0, :cond_4

    .line 132
    .line 133
    new-instance v4, La/x860;

    .line 134
    .line 135
    iget-object v1, p0, La/a9u0;->L1:La/zz2;

    .line 136
    .line 137
    sget-object v2, La/a9u0;->S1:[La/iiy;

    .line 138
    .line 139
    const/4 v3, 0x1

    .line 140
    aget-object v2, v2, v3

    .line 141
    .line 142
    invoke-virtual {v1, p0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    const/4 v1, 0x0

    .line 151
    invoke-direct {v4, p0, v1}, La/x860;-><init>(IZ)V

    .line 152
    .line 153
    .line 154
    iget-object v5, v0, La/b9u0;->a:La/gii0;

    .line 155
    .line 156
    iget-object v6, v0, La/b9u0;->b:La/btt0;

    .line 157
    .line 158
    iget-object v7, v0, La/b9u0;->c:La/vwb0;

    .line 159
    .line 160
    iget-object v8, v0, La/b9u0;->d:La/vby;

    .line 161
    .line 162
    iget-object v9, v0, La/b9u0;->e:La/pmi;

    .line 163
    .line 164
    iget-object v10, v0, La/b9u0;->f:La/sa10;

    .line 165
    .line 166
    iget-object v11, v0, La/b9u0;->g:La/bbw0;

    .line 167
    .line 168
    iget-object v12, v0, La/b9u0;->h:La/ilp0;

    .line 169
    .line 170
    iget-object v13, v0, La/b9u0;->i:La/mne;

    .line 171
    .line 172
    iget-object v14, v0, La/b9u0;->j:La/wdk0;

    .line 173
    .line 174
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v3, La/yyi;

    .line 190
    .line 191
    invoke-direct/range {v3 .. v14}, La/yyi;-><init>(La/x860;La/gii0;La/btt0;La/vwb0;La/vby;La/pmi;La/sa10;La/bbw0;La/ilp0;La/mne;La/wdk0;)V

    .line 192
    .line 193
    .line 194
    move-object v1, v3

    .line 195
    goto :goto_2

    .line 196
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 197
    .line 198
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :goto_2
    return-object v1

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
