.class public final synthetic La/ops0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pps0;


# direct methods
.method public synthetic constructor <init>(La/pps0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ops0;->a:B

    iput-object p1, p0, La/ops0;->b:La/pps0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/ops0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ops0;->b:La/pps0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/pps0;->V1:La/s2m0;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    instance-of v2, v0, La/af3;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    check-cast v0, La/af3;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v0, v1

    .line 30
    :goto_0
    const-class v2, La/lps0;

    .line 31
    .line 32
    if-eqz v0, :cond_6

    .line 33
    .line 34
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/o5d0;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/ze3;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v0, v1

    .line 54
    :goto_1
    instance-of v3, v0, La/lps0;

    .line 55
    .line 56
    if-nez v3, :cond_2

    .line 57
    .line 58
    move-object v0, v1

    .line 59
    :cond_2
    check-cast v0, La/lps0;

    .line 60
    .line 61
    if-eqz v0, :cond_6

    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    instance-of v3, v2, La/vmv;

    .line 72
    .line 73
    const-string v4, "Can not find dependencies provider for "

    .line 74
    .line 75
    if-eqz v3, :cond_5

    .line 76
    .line 77
    check-cast v2, La/vmv;

    .line 78
    .line 79
    check-cast v2, Lorg/platform/app/ApplicationLoader;

    .line 80
    .line 81
    invoke-virtual {v2}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    invoke-virtual {v2}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    if-eqz v7, :cond_3

    .line 92
    .line 93
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    sget-object v2, La/s470;->Companion:La/r470;

    .line 98
    .line 99
    iget-object v3, p0, La/pps0;->R1:La/r34;

    .line 100
    .line 101
    sget-object v4, La/pps0;->W1:[La/iiy;

    .line 102
    .line 103
    const/4 v5, 0x0

    .line 104
    aget-object v4, v4, v5

    .line 105
    .line 106
    invoke-virtual {v3, p0, v4}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v3

    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {v3, v4}, La/r470;->a(J)La/s470;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object p0, v0, La/lps0;->a:La/snc0;

    .line 125
    .line 126
    iget-object v8, v0, La/lps0;->c:La/wsf0;

    .line 127
    .line 128
    iget-object v1, v0, La/lps0;->b:La/dnc0;

    .line 129
    .line 130
    iget-object v10, v0, La/lps0;->d:La/rkc0;

    .line 131
    .line 132
    iget-object v11, v0, La/lps0;->e:La/tnc0;

    .line 133
    .line 134
    iget-object v12, v0, La/lps0;->f:La/fhj;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    new-instance v5, La/iyi;

    .line 149
    .line 150
    new-instance v6, La/y2m0;

    .line 151
    .line 152
    const/16 p0, 0x1d

    .line 153
    .line 154
    invoke-direct {v6, p0}, La/y2m0;-><init>(B)V

    .line 155
    .line 156
    .line 157
    invoke-direct/range {v5 .. v12}, La/iyi;-><init>(La/y2m0;La/g8i;La/wsf0;La/s470;La/rkc0;La/tnc0;La/fhj;)V

    .line 158
    .line 159
    .line 160
    move-object v1, v5

    .line 161
    goto :goto_2

    .line 162
    :cond_3
    const-string p0, "null cannot be cast to non-null type org.xplatform.bonus_games.impl.core.di.PromoGamesDependencies"

    .line 163
    .line 164
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_4
    invoke-static {p0, v4}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_5
    invoke-static {p0, v4}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_6
    const-string p0, "Cannot create dependency "

    .line 177
    .line 178
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :goto_2
    return-object v1

    .line 186
    :pswitch_0
    sget-object v0, La/pps0;->V1:La/s2m0;

    .line 187
    .line 188
    new-instance v0, La/ry3;

    .line 189
    .line 190
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    iget-object p0, p0, La/pps0;->Q1:La/dki;

    .line 195
    .line 196
    if-eqz p0, :cond_7

    .line 197
    .line 198
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 199
    .line 200
    .line 201
    return-object v0

    .line 202
    :cond_7
    const-string p0, "viewModelFactory"

    .line 203
    .line 204
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw v1

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
