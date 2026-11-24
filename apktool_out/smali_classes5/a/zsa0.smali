.class public final La/zsa0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/ata0;


# direct methods
.method public synthetic constructor <init>(La/ata0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zsa0;->i:B

    iput-object p1, p0, La/zsa0;->k:La/ata0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zsa0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/zsa0;->k:La/ata0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/zsa0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/zsa0;-><init>(La/ata0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/zsa0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/zsa0;-><init>(La/ata0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zsa0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/zsa0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/zsa0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/zsa0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/zsa0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/zsa0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/zsa0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/zsa0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    iget-object v4, p0, La/zsa0;->k:La/ata0;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v6, p0, La/zsa0;->j:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v2, :cond_1

    .line 20
    .line 21
    if-ne v6, v3, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v4, La/ata0;->w:La/w5z;

    .line 39
    .line 40
    iput-byte v2, p0, La/zsa0;->j:B

    .line 41
    .line 42
    iget-object v1, p1, La/w5z;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, La/s1u;

    .line 45
    .line 46
    invoke-virtual {v1}, La/s1u;->a()La/i89;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, La/kh1;

    .line 51
    .line 52
    const/16 v6, 0xd

    .line 53
    .line 54
    invoke-direct {v2, v5, p1, v6}, La/kh1;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v0, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :goto_0
    check-cast p1, La/gmq;

    .line 65
    .line 66
    new-instance v1, La/ysa0;

    .line 67
    .line 68
    const/4 v2, 0x3

    .line 69
    invoke-direct {v1, v4, v2}, La/ysa0;-><init>(La/ata0;B)V

    .line 70
    .line 71
    .line 72
    iput-byte v3, p0, La/zsa0;->j:B

    .line 73
    .line 74
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, v0, :cond_4

    .line 79
    .line 80
    :goto_1
    move-object v5, v0

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    :goto_3
    return-object v5

    .line 85
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 86
    .line 87
    iget-byte v6, p0, La/zsa0;->j:B

    .line 88
    .line 89
    if-eqz v6, :cond_7

    .line 90
    .line 91
    if-eq v6, v2, :cond_6

    .line 92
    .line 93
    if-ne v6, v3, :cond_5

    .line 94
    .line 95
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_6

    .line 99
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_7

    .line 103
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object v11, p0

    .line 107
    goto :goto_4

    .line 108
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, v4, La/ata0;->v:La/pru;

    .line 112
    .line 113
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    new-instance v5, La/u3z;

    .line 118
    .line 119
    iget-wide v6, v4, La/ata0;->o:J

    .line 120
    .line 121
    sget-object v8, La/t3z;->b:La/t3z;

    .line 122
    .line 123
    const-wide/16 v9, 0x13a

    .line 124
    .line 125
    invoke-direct/range {v5 .. v10}, La/u3z;-><init>(JLa/t3z;J)V

    .line 126
    .line 127
    .line 128
    iget-object v1, v4, La/ata0;->r:La/tzi;

    .line 129
    .line 130
    iget-boolean v7, p1, La/sff0;->D0:Z

    .line 131
    .line 132
    iget-object v6, p1, La/sff0;->I1:La/oxk0;

    .line 133
    .line 134
    iget-byte v9, v6, La/oxk0;->a:B

    .line 135
    .line 136
    iget-boolean v10, p1, La/sff0;->K1:Z

    .line 137
    .line 138
    iput-byte v2, p0, La/zsa0;->j:B

    .line 139
    .line 140
    const/4 v8, 0x0

    .line 141
    move-object v11, p0

    .line 142
    move-object v6, v5

    .line 143
    move-object v5, v1

    .line 144
    invoke-virtual/range {v5 .. v11}, La/tzi;->o(La/u3z;ZLjava/lang/Long;IZLa/zje;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-ne p1, v0, :cond_8

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_8
    :goto_4
    check-cast p1, La/gmq;

    .line 152
    .line 153
    new-instance p0, La/ysa0;

    .line 154
    .line 155
    const/4 v1, 0x0

    .line 156
    invoke-direct {p0, v4, v1}, La/ysa0;-><init>(La/ata0;B)V

    .line 157
    .line 158
    .line 159
    iput-byte v3, v11, La/zsa0;->j:B

    .line 160
    .line 161
    invoke-interface {p1, p0, v11}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    if-ne p0, v0, :cond_9

    .line 166
    .line 167
    :goto_5
    move-object v5, v0

    .line 168
    goto :goto_7

    .line 169
    :cond_9
    :goto_6
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    :goto_7
    return-object v5

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
