.class public final La/su7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/tu7;


# direct methods
.method public synthetic constructor <init>(La/tu7;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/su7;->i:B

    iput-object p1, p0, La/su7;->k:La/tu7;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/su7;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/su7;->k:La/tu7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/su7;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/su7;-><init>(La/tu7;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/su7;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/su7;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/su7;-><init>(La/tu7;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/su7;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/su7;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/qqp0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/su7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/su7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/su7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/a8h0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/su7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/su7;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/su7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/su7;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/su7;->k:La/tu7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/su7;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, p0

    .line 11
    check-cast v3, La/qqp0;

    .line 12
    .line 13
    sget-object p0, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget p0, La/tu7;->D:I

    .line 19
    .line 20
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 21
    .line 22
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-object v2, p0

    .line 32
    check-cast v2, La/pu7;

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    const/16 v8, 0xe

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const-wide/16 v5, 0x0

    .line 39
    .line 40
    invoke-static/range {v2 .. v8}, La/pu7;->a(La/pu7;La/qqp0;La/cu7;JLa/a8h0;I)La/pu7;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_0
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 54
    .line 55
    iget-object p0, p0, La/su7;->j:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v6, p0

    .line 58
    check-cast v6, La/a8h0;

    .line 59
    .line 60
    sget-object p0, La/wne;->a:La/wne;

    .line 61
    .line 62
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    if-eqz v6, :cond_1

    .line 67
    .line 68
    iget-object p1, v6, La/a8h0;->b:La/z7h0;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object p1, p0

    .line 72
    :goto_0
    if-eqz p1, :cond_5

    .line 73
    .line 74
    iget-object p1, v6, La/a8h0;->b:La/z7h0;

    .line 75
    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    instance-of v1, p1, La/y7h0;

    .line 79
    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    sget-object p0, La/cu7;->a:La/cu7;

    .line 83
    .line 84
    :goto_1
    move-object v9, p0

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    instance-of p1, p1, La/x7h0;

    .line 87
    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    sget-object p0, La/cu7;->b:La/cu7;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :goto_2
    sget p0, La/tu7;->D:I

    .line 94
    .line 95
    iget-object p1, v0, La/ocj;->a:La/p7m0;

    .line 96
    .line 97
    :cond_3
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-object v7, p0

    .line 105
    check-cast v7, La/pu7;

    .line 106
    .line 107
    const/4 v12, 0x0

    .line 108
    const/16 v13, 0xd

    .line 109
    .line 110
    const/4 v8, 0x0

    .line 111
    const-wide/16 v10, 0x0

    .line 112
    .line 113
    invoke-static/range {v7 .. v13}, La/pu7;->a(La/pu7;La/qqp0;La/cu7;JLa/a8h0;I)La/pu7;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {p1, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-eqz p0, :cond_3

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_5
    :goto_3
    sget p0, La/tu7;->D:I

    .line 129
    .line 130
    iget-object p0, v0, La/ocj;->a:La/p7m0;

    .line 131
    .line 132
    :cond_6
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-object v1, p1

    .line 140
    check-cast v1, La/pu7;

    .line 141
    .line 142
    const-wide/16 v4, 0x0

    .line 143
    .line 144
    const/4 v7, 0x7

    .line 145
    const/4 v2, 0x0

    .line 146
    const/4 v3, 0x0

    .line 147
    invoke-static/range {v1 .. v7}, La/pu7;->a(La/pu7;La/qqp0;La/cu7;JLa/a8h0;I)La/pu7;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_6

    .line 156
    .line 157
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    :goto_4
    return-object p0

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
