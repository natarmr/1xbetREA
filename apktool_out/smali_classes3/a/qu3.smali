.class public final La/qu3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/zu3;


# direct methods
.method public synthetic constructor <init>(La/zu3;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qu3;->i:B

    iput-object p1, p0, La/qu3;->k:La/zu3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/qu3;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qu3;->k:La/zu3;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/qu3;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/qu3;-><init>(La/zu3;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/qu3;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/qu3;-><init>(La/zu3;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/qu3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/qu3;-><init>(La/zu3;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qu3;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/qu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qu3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/qu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/qu3;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/qu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/qu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/qu3;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/qu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/qu3;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/qu3;->k:La/zu3;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/qu3;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v2, La/zu3;->Q:La/z7z;

    .line 32
    .line 33
    invoke-interface {p1}, La/z7z;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, La/stu;

    .line 38
    .line 39
    iget-object p1, p1, La/stu;->a:La/pzu;

    .line 40
    .line 41
    iget-object p1, p1, La/pzu;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, La/h840;

    .line 44
    .line 45
    iget-object v1, p1, La/h840;->f:La/p7m0;

    .line 46
    .line 47
    iget-object p1, p1, La/h840;->g:La/p7m0;

    .line 48
    .line 49
    new-instance v5, La/t82;

    .line 50
    .line 51
    const/4 v6, 0x3

    .line 52
    const/4 v7, 0x4

    .line 53
    invoke-direct {v5, v6, v4, v7}, La/t82;-><init>(ILa/yje;B)V

    .line 54
    .line 55
    .line 56
    new-instance v6, La/bm3;

    .line 57
    .line 58
    const/16 v7, 0xc

    .line 59
    .line 60
    invoke-direct {v6, v2, v7}, La/bm3;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    iput-boolean v3, p0, La/qu3;->j:Z

    .line 64
    .line 65
    const/4 v2, 0x2

    .line 66
    new-array v2, v2, [La/gmq;

    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    aput-object v1, v2, v7

    .line 70
    .line 71
    aput-object p1, v2, v3

    .line 72
    .line 73
    sget-object p1, La/pul;->j:La/pul;

    .line 74
    .line 75
    new-instance v1, La/kh1;

    .line 76
    .line 77
    const/16 v3, 0x9

    .line 78
    .line 79
    invoke-direct {v1, v5, v4, v3}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0, v6, v1, p1, v2}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, v0, :cond_2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :goto_0
    if-ne p0, v0, :cond_3

    .line 92
    .line 93
    move-object v4, v0

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    :goto_2
    return-object v4

    .line 98
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 99
    .line 100
    iget-boolean v5, p0, La/qu3;->j:Z

    .line 101
    .line 102
    if-eqz v5, :cond_5

    .line 103
    .line 104
    if-ne v5, v3, :cond_4

    .line 105
    .line 106
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget p1, La/zu3;->s0:I

    .line 118
    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    sput-wide v4, La/zu3;->r0:J

    .line 124
    .line 125
    iget-object p1, v2, La/zu3;->R:La/z7z;

    .line 126
    .line 127
    invoke-interface {p1}, La/z7z;->get()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, La/xri0;

    .line 132
    .line 133
    iget-object p1, p1, La/xri0;->a:La/pzu;

    .line 134
    .line 135
    iget-object p1, p1, La/pzu;->a:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p1, La/h840;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iput-boolean v3, p0, La/qu3;->j:Z

    .line 143
    .line 144
    invoke-virtual {v2, p0}, La/zu3;->w(La/zje;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-ne p0, v0, :cond_6

    .line 149
    .line 150
    move-object v4, v0

    .line 151
    goto :goto_4

    .line 152
    :cond_6
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    :goto_4
    return-object v4

    .line 155
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 156
    .line 157
    iget-boolean v5, p0, La/qu3;->j:Z

    .line 158
    .line 159
    if-eqz v5, :cond_8

    .line 160
    .line 161
    if-ne v5, v3, :cond_7

    .line 162
    .line 163
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, v2, La/zu3;->w:La/z7z;

    .line 175
    .line 176
    invoke-interface {p1}, La/z7z;->get()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, La/xrc;

    .line 181
    .line 182
    invoke-virtual {p1}, La/xrc;->a()V

    .line 183
    .line 184
    .line 185
    iput-boolean v3, p0, La/qu3;->j:Z

    .line 186
    .line 187
    invoke-virtual {v2, p0}, La/zu3;->z(La/zje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    if-ne p0, v0, :cond_9

    .line 192
    .line 193
    move-object v4, v0

    .line 194
    goto :goto_6

    .line 195
    :cond_9
    :goto_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    :goto_6
    return-object v4

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
