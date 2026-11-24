.class public final synthetic La/r0g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g1g;


# direct methods
.method public synthetic constructor <init>(La/g1g;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r0g;->a:B

    iput-object p1, p0, La/r0g;->b:La/g1g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/r0g;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/r0g;->b:La/g1g;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object p0, p0, La/g1g;->z:La/ol60;

    .line 16
    .line 17
    new-instance v0, La/u9o;

    .line 18
    .line 19
    invoke-direct {v0, p1}, La/u9o;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, La/g1g;->r:La/ivn;

    .line 34
    .line 35
    new-instance v1, La/r0g;

    .line 36
    .line 37
    const/4 v2, 0x5

    .line 38
    invoke-direct {v1, p0, v2}, La/r0g;-><init>(La/g1g;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, v1}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, La/g1g;->u:La/qgh;

    .line 53
    .line 54
    new-instance v1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 55
    .line 56
    sget-object v2, La/sip;->a:La/bek;

    .line 57
    .line 58
    iget-object p0, p0, La/g1g;->b:Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;

    .line 59
    .line 60
    iget-boolean v3, p0, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->c:Z

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, La/bek;->f(Z)La/sip;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    sget-object v3, La/dam0;->a:La/dam0;

    .line 70
    .line 71
    iget-wide v6, p0, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->h:J

    .line 72
    .line 73
    iget-object v8, p0, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->i:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v9, p0, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->j:Ljava/util/List;

    .line 76
    .line 77
    iget-object v10, p0, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->k:Ljava/util/List;

    .line 78
    .line 79
    const-wide/16 v4, 0x28

    .line 80
    .line 81
    invoke-direct/range {v1 .. v10}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;-><init>(La/sip;La/dam0;JJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance p0, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

    .line 88
    .line 89
    invoke-direct {p0, v1}, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;-><init>(Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object p0, p0, La/g1g;->e:La/duj;

    .line 104
    .line 105
    new-instance v0, La/jyf;

    .line 106
    .line 107
    invoke-direct {v0, v1}, La/jyf;-><init>(B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_3
    check-cast p1, La/k0w0;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v0, La/jwd;

    .line 122
    .line 123
    const/16 v2, 0x19

    .line 124
    .line 125
    invoke-direct {v0, p0, v2}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 126
    .line 127
    .line 128
    new-instance p0, La/a1w0;

    .line 129
    .line 130
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p0, La/c8d;

    .line 140
    .line 141
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 142
    .line 143
    new-instance v0, La/v7d;

    .line 144
    .line 145
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_4
    check-cast p1, La/k0w0;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, La/g1g;->b:Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;

    .line 159
    .line 160
    iget-wide v4, v0, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->g:J

    .line 161
    .line 162
    const-wide/16 v1, 0xbd

    .line 163
    .line 164
    cmp-long v1, v4, v1

    .line 165
    .line 166
    if-nez v1, :cond_0

    .line 167
    .line 168
    iget-object v1, p0, La/g1g;->y:La/kys0;

    .line 169
    .line 170
    iget-object v6, v0, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->m:Ljava/lang/String;

    .line 171
    .line 172
    iget-wide v2, v0, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->a:J

    .line 173
    .line 174
    invoke-virtual/range {v1 .. v6}, La/kys0;->e(JJLjava/lang/String;)Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    goto :goto_0

    .line 179
    :cond_0
    iget-object p0, p0, La/g1g;->t:La/gr00;

    .line 180
    .line 181
    new-instance v1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 182
    .line 183
    iget-object v2, v0, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->m:Ljava/lang/String;

    .line 184
    .line 185
    iget-wide v5, v0, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->h:J

    .line 186
    .line 187
    const/4 v3, 0x0

    .line 188
    iget v4, v0, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->n:I

    .line 189
    .line 190
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    new-instance v0, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 197
    .line 198
    invoke-direct {v0, v1, p0}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 199
    .line 200
    .line 201
    move-object p0, v0

    .line 202
    :goto_0
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 203
    .line 204
    .line 205
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object p0

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
