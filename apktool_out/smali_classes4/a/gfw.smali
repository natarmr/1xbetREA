.class public final La/gfw;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/hfw;


# direct methods
.method public synthetic constructor <init>(La/hfw;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gfw;->i:B

    iput-object p1, p0, La/gfw;->k:La/hfw;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/gfw;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/gfw;->k:La/hfw;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/gfw;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/gfw;-><init>(La/hfw;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/gfw;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/gfw;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/gfw;-><init>(La/hfw;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/gfw;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/gfw;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/tew;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/gfw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/gfw;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/gfw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/edw;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/gfw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/gfw;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/gfw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/gfw;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/gfw;->k:La/hfw;

    .line 4
    .line 5
    iget-object p0, p0, La/gfw;->j:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/tew;

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, La/tew;->a:La/j0g0;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 22
    .line 23
    instance-of p1, p1, La/g0g0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    if-ne p1, v0, :cond_0

    .line 27
    .line 28
    iget-boolean p1, v1, La/hfw;->I:Z

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1}, La/hfw;->O()V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    new-instance p1, La/xxv;

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    invoke-direct {p1, p0, v0}, La/xxv;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    sget v0, La/hfw;->J:I

    .line 45
    .line 46
    invoke-virtual {v1, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, La/tew;->a:La/j0g0;

    .line 50
    .line 51
    const-wide/16 v2, 0x0

    .line 52
    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    iget-object p0, p0, La/j0g0;->a:Ljava/lang/Object;

    .line 56
    .line 57
    instance-of p1, p0, La/g0g0;

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    :cond_1
    check-cast p0, La/new;

    .line 63
    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, La/lew;

    .line 71
    .line 72
    iget-wide v4, p1, La/lew;->a:J

    .line 73
    .line 74
    cmp-long p1, v4, v2

    .line 75
    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    move-wide v2, v4

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iget-object p0, p0, La/new;->b:Ljava/util/List;

    .line 81
    .line 82
    if-eqz p0, :cond_3

    .line 83
    .line 84
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/vcw;

    .line 89
    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    iget-wide v2, p0, La/vcw;->a:J

    .line 93
    .line 94
    :cond_3
    :goto_0
    invoke-virtual {v1, v2, v3}, La/hfw;->Q(J)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    :goto_1
    return-object p0

    .line 100
    :pswitch_0
    check-cast p0, La/edw;

    .line 101
    .line 102
    sget-object v0, La/wne;->a:La/wne;

    .line 103
    .line 104
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget p1, La/hfw;->J:I

    .line 108
    .line 109
    iget-object p1, v1, La/i3t0;->i:La/ocj;

    .line 110
    .line 111
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 112
    .line 113
    :cond_4
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v2, v1, La/i3t0;->f:La/oyg0;

    .line 121
    .line 122
    move-object v3, v0

    .line 123
    check-cast v3, La/lew;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v2, v3, La/lew;->d:Ljava/util/Map;

    .line 129
    .line 130
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 131
    .line 132
    invoke-direct {v7, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 133
    .line 134
    .line 135
    iget-wide v4, v3, La/lew;->a:J

    .line 136
    .line 137
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-interface {v7, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    const/4 v8, 0x7

    .line 145
    const-wide/16 v4, 0x0

    .line 146
    .line 147
    const/4 v6, 0x0

    .line 148
    invoke-static/range {v3 .. v8}, La/lew;->a(La/lew;JLa/tew;Ljava/util/LinkedHashMap;I)La/lew;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {p1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_4

    .line 157
    .line 158
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
