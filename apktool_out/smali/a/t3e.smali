.class public final La/t3e;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/iqi;La/dc0;La/dc0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/t3e;->a:B

    .line 3
    .line 4
    sget-object v0, La/meq;->b:La/bek;

    .line 5
    .line 6
    iput-object p1, p0, La/t3e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p2, p0, La/t3e;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, La/t3e;->d:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/util/List;La/v3e;La/f7m0;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/t3e;->a:B

    .line 17
    iput-object p1, p0, La/t3e;->b:Ljava/lang/Object;

    iput-object p2, p0, La/t3e;->c:Ljava/lang/Object;

    iput-object p3, p0, La/t3e;->d:Ljava/lang/Object;

    invoke-direct {p0, v0}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/t3e;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/t3e;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, La/t3e;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, La/t3e;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, La/iqi;

    .line 14
    .line 15
    iget-object p0, p0, La/iqi;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/n0o0;

    .line 18
    .line 19
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, La/j0g0;

    .line 24
    .line 25
    iget-object p0, p0, La/j0g0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    instance-of v0, p0, La/g0g0;

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 32
    .line 33
    check-cast p0, La/peq;

    .line 34
    .line 35
    sget-object v0, La/meq;->b:La/bek;

    .line 36
    .line 37
    iget-object p0, p0, La/peq;->b:La/uii;

    .line 38
    .line 39
    :try_start_0
    new-instance v0, La/wgk;

    .line 40
    .line 41
    invoke-virtual {p0}, La/uii;->t()La/thb;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, La/thb;->G()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iget-object v5, p0, La/uii;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, La/n0o0;

    .line 52
    .line 53
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    check-cast v5, La/liv;

    .line 58
    .line 59
    iget-object v5, v5, La/liv;->a:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v6, p0, La/uii;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v6, La/n0o0;

    .line 64
    .line 65
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, La/tz2;

    .line 70
    .line 71
    iget-object v6, v6, La/tz2;->a:Ljava/lang/String;

    .line 72
    .line 73
    iget-object p0, p0, La/uii;->f:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, La/n0o0;

    .line 76
    .line 77
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, La/zm30;

    .line 82
    .line 83
    iget-object p0, p0, La/zm30;->a:Ljava/lang/String;

    .line 84
    .line 85
    invoke-direct {v0, v4, v5, v6, p0}, La/wgk;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 91
    .line 92
    new-instance v0, La/g0g0;

    .line 93
    .line 94
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    :goto_0
    new-instance p0, La/j0g0;

    .line 98
    .line 99
    invoke-direct {p0, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 103
    .line 104
    instance-of v0, p0, La/g0g0;

    .line 105
    .line 106
    xor-int/lit8 v4, v0, 0x1

    .line 107
    .line 108
    const/4 v5, 0x1

    .line 109
    if-ne v4, v5, :cond_1

    .line 110
    .line 111
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    check-cast p0, La/j0g0;

    .line 115
    .line 116
    iget-object p0, p0, La/j0g0;->a:Ljava/lang/Object;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    if-eqz v0, :cond_3

    .line 120
    .line 121
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v0, La/g0g0;

    .line 129
    .line 130
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    move-object p0, v0

    .line 134
    :goto_1
    check-cast v3, La/dc0;

    .line 135
    .line 136
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-nez v0, :cond_2

    .line 141
    .line 142
    invoke-virtual {v3, p0}, La/dc0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    check-cast v2, La/dc0;

    .line 147
    .line 148
    sget-object p0, La/ken;->a:La/wgk;

    .line 149
    .line 150
    invoke-virtual {v2, p0}, La/dc0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    const-string p0, "Unexpected error occurred. Feel free to create an issue on Github repository of the fingerprintjs-android library."

    .line 154
    .line 155
    const-string v1, "FingerprintJS"

    .line 156
    .line 157
    invoke-static {v1, p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 158
    .line 159
    .line 160
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 164
    .line 165
    .line 166
    :goto_3
    return-object v1

    .line 167
    :pswitch_0
    check-cast p0, Ljava/util/List;

    .line 168
    .line 169
    check-cast v3, La/v3e;

    .line 170
    .line 171
    iget-object v0, v3, La/v3e;->a:La/g3e;

    .line 172
    .line 173
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    const/4 v5, 0x0

    .line 178
    :goto_4
    if-ge v5, v4, :cond_6

    .line 179
    .line 180
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    check-cast v6, La/pj30;

    .line 185
    .line 186
    invoke-interface {v6}, La/pj30;->n()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    instance-of v7, v6, La/e3e;

    .line 191
    .line 192
    if-eqz v7, :cond_4

    .line 193
    .line 194
    check-cast v6, La/e3e;

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_4
    move-object v6, v1

    .line 198
    :goto_5
    if-eqz v6, :cond_5

    .line 199
    .line 200
    iget-object v7, v6, La/e3e;->a:La/u2e;

    .line 201
    .line 202
    invoke-virtual {v0, v7}, La/d3e;->b(La/u2e;)La/bh9;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    new-instance v9, La/t2e;

    .line 207
    .line 208
    iget-object v7, v7, La/u2e;->b:Ljava/lang/Object;

    .line 209
    .line 210
    invoke-direct {v9, v7, v8}, La/t2e;-><init>(Ljava/lang/Object;La/bh9;)V

    .line 211
    .line 212
    .line 213
    iget-object v7, v6, La/e3e;->b:Lkotlin/jvm/functions/Function1;

    .line 214
    .line 215
    invoke-interface {v7, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    :cond_5
    iget-object v7, v3, La/v3e;->f:Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    add-int/lit8 v5, v5, 0x1

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_6
    check-cast v2, La/f7m0;

    .line 227
    .line 228
    invoke-virtual {v0, v2}, La/d3e;->a(La/f7m0;)V

    .line 229
    .line 230
    .line 231
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    return-object p0

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
