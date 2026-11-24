.class public final synthetic La/w81;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n91;


# direct methods
.method public synthetic constructor <init>(La/n91;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w81;->a:B

    iput-object p1, p0, La/w81;->b:La/n91;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/w81;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/w81;->b:La/n91;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget v1, La/n91;->f0:I

    .line 11
    .line 12
    invoke-virtual {v0}, La/n91;->V()V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance v1, La/r81;

    .line 19
    .line 20
    iget-object v2, v0, La/n91;->o:La/ctf0;

    .line 21
    .line 22
    const-string v3, "WebView"

    .line 23
    .line 24
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const v4, 0x7f1307c8

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-direct {v1, v2}, La/r81;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_1
    sget v1, La/n91;->f0:I

    .line 52
    .line 53
    invoke-virtual {v0}, La/n91;->P()V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_2
    sget v1, La/n91;->f0:I

    .line 60
    .line 61
    invoke-virtual {v0}, La/n91;->P()V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_3
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 68
    .line 69
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 70
    .line 71
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 79
    .line 80
    move-object v4, v2

    .line 81
    check-cast v4, La/u81;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const/16 v20, 0x0

    .line 87
    .line 88
    const v21, 0x1fffef

    .line 89
    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v9, 0x0

    .line 96
    const/4 v10, 0x0

    .line 97
    const-wide/16 v11, 0x0

    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const/4 v14, 0x0

    .line 101
    const/4 v15, 0x0

    .line 102
    const/16 v16, 0x0

    .line 103
    .line 104
    const/16 v17, 0x0

    .line 105
    .line 106
    const/16 v18, 0x0

    .line 107
    .line 108
    const/16 v19, 0x0

    .line 109
    .line 110
    invoke-static/range {v4 .. v21}, La/u81;->a(La/u81;La/f02;ZZZLjava/lang/String;Ljava/lang/String;JZZLa/ql5;ZZZILa/ax0;I)La/u81;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_0

    .line 119
    .line 120
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object v0

    .line 123
    :pswitch_4
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 124
    .line 125
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 126
    .line 127
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 135
    .line 136
    move-object v4, v2

    .line 137
    check-cast v4, La/u81;

    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    const/16 v20, 0x0

    .line 143
    .line 144
    const v21, 0x1f7fef

    .line 145
    .line 146
    .line 147
    const/4 v5, 0x0

    .line 148
    const/4 v6, 0x0

    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v8, 0x0

    .line 151
    const/4 v9, 0x0

    .line 152
    const/4 v10, 0x0

    .line 153
    const-wide/16 v11, 0x0

    .line 154
    .line 155
    const/4 v13, 0x0

    .line 156
    const/4 v14, 0x0

    .line 157
    const/4 v15, 0x0

    .line 158
    const/16 v16, 0x0

    .line 159
    .line 160
    const/16 v17, 0x0

    .line 161
    .line 162
    const/16 v18, 0x0

    .line 163
    .line 164
    const/16 v19, 0x0

    .line 165
    .line 166
    invoke-static/range {v4 .. v21}, La/u81;->a(La/u81;La/f02;ZZZLjava/lang/String;Ljava/lang/String;JZZLa/ql5;ZZZILa/ax0;I)La/u81;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_1

    .line 175
    .line 176
    iget-object v0, v0, La/n91;->r:La/i1w0;

    .line 177
    .line 178
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    new-instance v2, La/c8d;

    .line 183
    .line 184
    sget-object v3, La/y7d;->a:La/v7d;

    .line 185
    .line 186
    sget-object v4, La/u0w0;->a:La/u0w0;

    .line 187
    .line 188
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 189
    .line 190
    .line 191
    const/4 v3, 0x0

    .line 192
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    :goto_0
    move-object v2, v1

    .line 197
    check-cast v2, La/paw;

    .line 198
    .line 199
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_2

    .line 204
    .line 205
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, La/oe50;

    .line 210
    .line 211
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 212
    .line 213
    .line 214
    goto :goto_0

    .line 215
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object v0

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
