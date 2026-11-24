.class public final La/pm40;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/d39;


# direct methods
.method public synthetic constructor <init>(La/d39;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pm40;->i:B

    iput-object p1, p0, La/pm40;->k:La/d39;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/pm40;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/pm40;

    .line 7
    .line 8
    iget-object p0, p0, La/pm40;->k:La/d39;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/pm40;-><init>(La/d39;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/pm40;

    .line 16
    .line 17
    iget-object p0, p0, La/pm40;->k:La/d39;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, p2, v0}, La/pm40;-><init>(La/d39;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/pm40;

    .line 25
    .line 26
    iget-object p0, p0, La/pm40;->k:La/d39;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-direct {p1, p0, p2, v0}, La/pm40;-><init>(La/d39;La/yje;B)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pm40;->i:B

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
    invoke-virtual {p0, p1, p2}, La/pm40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pm40;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pm40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/pm40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/pm40;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/pm40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/pm40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/pm40;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/pm40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/pm40;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pm40;->k:La/d39;

    .line 4
    .line 5
    const-wide/16 v2, 0x12c

    .line 6
    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-byte v8, p0, La/pm40;->j:B

    .line 18
    .line 19
    if-eqz v8, :cond_2

    .line 20
    .line 21
    if-eq v8, v5, :cond_1

    .line 22
    .line 23
    if-ne v8, v6, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-byte v5, p0, La/pm40;->j:B

    .line 41
    .line 42
    invoke-static {v2, v3, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_0
    iput-byte v6, p0, La/pm40;->j:B

    .line 50
    .line 51
    invoke-virtual {v1, v7, p0}, La/d39;->a(La/jge0;La/zje;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne p0, v0, :cond_4

    .line 56
    .line 57
    :goto_1
    move-object v7, v0

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    :goto_3
    return-object v7

    .line 62
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 63
    .line 64
    iget-byte v8, p0, La/pm40;->j:B

    .line 65
    .line 66
    if-eqz v8, :cond_7

    .line 67
    .line 68
    if-eq v8, v5, :cond_6

    .line 69
    .line 70
    if-ne v8, v6, :cond_5

    .line 71
    .line 72
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_6

    .line 76
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_7

    .line 80
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iput-byte v5, p0, La/pm40;->j:B

    .line 88
    .line 89
    invoke-static {v2, v3, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v0, :cond_8

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_8
    :goto_4
    iput-byte v6, p0, La/pm40;->j:B

    .line 97
    .line 98
    invoke-virtual {v1, v7, p0}, La/d39;->a(La/jge0;La/zje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-ne p0, v0, :cond_9

    .line 103
    .line 104
    :goto_5
    move-object v7, v0

    .line 105
    goto :goto_7

    .line 106
    :cond_9
    :goto_6
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    :goto_7
    return-object v7

    .line 109
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 110
    .line 111
    iget-byte v8, p0, La/pm40;->j:B

    .line 112
    .line 113
    if-eqz v8, :cond_c

    .line 114
    .line 115
    if-eq v8, v5, :cond_b

    .line 116
    .line 117
    if-ne v8, v6, :cond_a

    .line 118
    .line 119
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_a

    .line 123
    :cond_a
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_b

    .line 127
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    goto :goto_8

    .line 131
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iput-byte v5, p0, La/pm40;->j:B

    .line 135
    .line 136
    invoke-static {v2, v3, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-ne p1, v0, :cond_d

    .line 141
    .line 142
    goto :goto_9

    .line 143
    :cond_d
    :goto_8
    iput-byte v6, p0, La/pm40;->j:B

    .line 144
    .line 145
    invoke-virtual {v1, v7, p0}, La/d39;->a(La/jge0;La/zje;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-ne p0, v0, :cond_e

    .line 150
    .line 151
    :goto_9
    move-object v7, v0

    .line 152
    goto :goto_b

    .line 153
    :cond_e
    :goto_a
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    :goto_b
    return-object v7

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
