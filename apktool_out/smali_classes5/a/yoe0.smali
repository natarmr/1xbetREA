.class public final La/yoe0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/zoe0;


# direct methods
.method public synthetic constructor <init>(La/zoe0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yoe0;->i:B

    iput-object p1, p0, La/yoe0;->k:La/zoe0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yoe0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yoe0;->k:La/zoe0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/yoe0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/yoe0;-><init>(La/zoe0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/yoe0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/yoe0;-><init>(La/zoe0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/yoe0;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/yoe0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/yoe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yoe0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yoe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/yoe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/yoe0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/yoe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/yoe0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/yoe0;->k:La/zoe0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-boolean v3, p0, La/yoe0;->j:Z

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    if-ne v3, v4, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v2, La/zoe0;->c:La/epi0;

    .line 33
    .line 34
    iput-boolean v4, p0, La/yoe0;->j:Z

    .line 35
    .line 36
    iget-object p1, p1, La/epi0;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, La/z220;

    .line 39
    .line 40
    invoke-virtual {p1, p0}, La/z220;->P(La/zje;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-ne p0, v0, :cond_2

    .line 45
    .line 46
    move-object v1, v0

    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_2
    :goto_0
    iget-object p0, v2, La/zoe0;->f:La/zr1;

    .line 50
    .line 51
    iget-object p0, p0, La/zr1;->a:La/s1p;

    .line 52
    .line 53
    const-wide/16 v0, 0xd00

    .line 54
    .line 55
    sget-object p1, La/xun;->a:La/xun;

    .line 56
    .line 57
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 58
    .line 59
    .line 60
    iget-object p0, v2, La/zoe0;->j:La/yo4;

    .line 61
    .line 62
    iget-object p0, p0, La/yo4;->a:La/kt2;

    .line 63
    .line 64
    const-string p1, "promo_referal_done"

    .line 65
    .line 66
    invoke-interface {p0, p1}, La/kt2;->c(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object p0, v2, La/zoe0;->e:La/pzu;

    .line 70
    .line 71
    new-instance p1, Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;

    .line 72
    .line 73
    new-instance v0, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;

    .line 74
    .line 75
    const-string v7, ""

    .line 76
    .line 77
    sget-object v8, La/iun;->a:La/iun;

    .line 78
    .line 79
    const-wide/16 v1, 0x0

    .line 80
    .line 81
    const-wide/16 v3, 0x0

    .line 82
    .line 83
    const-wide/16 v5, 0x0

    .line 84
    .line 85
    invoke-direct/range {v0 .. v8}, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;-><init>(DDDLjava/lang/String;Ljava/util/List;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p1, v0}, Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;-><init>(Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, La/pzu;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, La/oeg0;

    .line 94
    .line 95
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, Lorg/xplatform/referral/impl/navigation/ReferralProgramScreenFactoryImpl$networkScreen$1;

    .line 104
    .line 105
    invoke-direct {v1, p1}, Lorg/xplatform/referral/impl/navigation/ReferralProgramScreenFactoryImpl$networkScreen$1;-><init>(Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;)V

    .line 106
    .line 107
    .line 108
    instance-of p1, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 109
    .line 110
    if-eqz p1, :cond_3

    .line 111
    .line 112
    new-instance p1, La/e1w0;

    .line 113
    .line 114
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 115
    .line 116
    invoke-direct {p1, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 117
    .line 118
    .line 119
    new-instance v1, La/c8d;

    .line 120
    .line 121
    sget-object v2, La/y7d;->a:La/v7d;

    .line 122
    .line 123
    invoke-direct {v1, v2, p1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    new-instance p1, La/w0w0;

    .line 131
    .line 132
    invoke-direct {p1, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 133
    .line 134
    .line 135
    new-instance v1, La/c8d;

    .line 136
    .line 137
    sget-object v2, La/y7d;->a:La/v7d;

    .line 138
    .line 139
    invoke-direct {v1, v2, p1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    :goto_1
    const/4 p1, 0x0

    .line 146
    invoke-static {p0, v0, p1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    :goto_2
    move-object v0, p1

    .line 151
    check-cast v0, La/paw;

    .line 152
    .line 153
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_4

    .line 158
    .line 159
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, La/oe50;

    .line 164
    .line 165
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    :goto_3
    return-object v1

    .line 172
    :pswitch_0
    iget-boolean p0, p0, La/yoe0;->j:Z

    .line 173
    .line 174
    sget-object v0, La/wne;->a:La/wne;

    .line 175
    .line 176
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, v2, La/zoe0;->u:La/p7m0;

    .line 180
    .line 181
    invoke-static {p0, p1, v1}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
