.class public final La/pnw;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/snw;


# direct methods
.method public synthetic constructor <init>(La/snw;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pnw;->i:B

    iput-object p1, p0, La/pnw;->k:La/snw;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pnw;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pnw;->k:La/snw;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/pnw;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/pnw;-><init>(La/snw;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/pnw;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/pnw;-><init>(La/snw;La/yje;B)V

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
    iput-boolean p0, v0, La/pnw;->j:Z

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
    iget-byte v0, p0, La/pnw;->i:B

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
    invoke-virtual {p0, p1, p2}, La/pnw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pnw;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pnw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/pnw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/pnw;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/pnw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-byte v0, p0, La/pnw;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pnw;->k:La/snw;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-boolean v2, p0, La/pnw;->j:Z

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-boolean v3, p0, La/pnw;->j:Z

    .line 32
    .line 33
    const-wide/16 v2, 0x12c

    .line 34
    .line 35
    invoke-static {v2, v3, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    sget p0, La/snw;->u:I

    .line 43
    .line 44
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 45
    .line 46
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 47
    .line 48
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-object v1, p0

    .line 56
    check-cast v1, La/gnw;

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    const/16 v8, 0x7e

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    const/4 v3, 0x0

    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v6, 0x0

    .line 66
    invoke-static/range {v1 .. v8}, La/gnw;->a(La/gnw;ZZZLjava/util/ArrayList;La/wmw;La/nc5;I)La/gnw;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_3

    .line 75
    .line 76
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_1
    return-object v0

    .line 79
    :pswitch_0
    iget-boolean p0, p0, La/pnw;->j:Z

    .line 80
    .line 81
    sget-object v0, La/wne;->a:La/wne;

    .line 82
    .line 83
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    if-eqz p0, :cond_5

    .line 87
    .line 88
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, La/gnw;

    .line 93
    .line 94
    iget-boolean p0, p0, La/gnw;->a:Z

    .line 95
    .line 96
    if-nez p0, :cond_4

    .line 97
    .line 98
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/gnw;

    .line 103
    .line 104
    iget-boolean p0, p0, La/gnw;->b:Z

    .line 105
    .line 106
    if-eqz p0, :cond_5

    .line 107
    .line 108
    :cond_4
    const/4 p0, 0x0

    .line 109
    invoke-virtual {v1, p0}, La/snw;->M(Z)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    sget p0, La/snw;->u:I

    .line 114
    .line 115
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 116
    .line 117
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 118
    .line 119
    :cond_6
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object v0, v1, La/i3t0;->f:La/oyg0;

    .line 127
    .line 128
    move-object v2, p1

    .line 129
    check-cast v2, La/gnw;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object v0, v2, La/gnw;->e:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    const/4 v8, 0x0

    .line 141
    const/16 v9, 0x7c

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    const/4 v5, 0x0

    .line 145
    const/4 v6, 0x0

    .line 146
    const/4 v7, 0x0

    .line 147
    invoke-static/range {v2 .. v9}, La/gnw;->a(La/gnw;ZZZLjava/util/ArrayList;La/wmw;La/nc5;I)La/gnw;

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
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
