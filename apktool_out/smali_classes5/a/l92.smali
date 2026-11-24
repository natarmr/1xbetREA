.class public final La/l92;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Throwable;

.field public final synthetic k:La/n92;


# direct methods
.method public synthetic constructor <init>(La/n92;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l92;->i:B

    iput-object p1, p0, La/l92;->k:La/n92;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/l92;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/l92;->k:La/n92;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Throwable;

    .line 8
    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance p1, La/l92;

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    invoke-direct {p1, p0, p3, v0}, La/l92;-><init>(La/n92;La/yje;B)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p1, La/l92;->j:Ljava/lang/Throwable;

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, La/l92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance p1, La/l92;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p3, v0}, La/l92;-><init>(La/n92;La/yje;B)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p1, La/l92;->j:Ljava/lang/Throwable;

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    invoke-virtual {p1, p0}, La/l92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_1
    new-instance p1, La/l92;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-direct {p1, p0, p3, v0}, La/l92;-><init>(La/n92;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p2, p1, La/l92;->j:Ljava/lang/Throwable;

    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    invoke-virtual {p1, p0}, La/l92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/l92;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/l92;->k:La/n92;

    .line 4
    .line 5
    iget-object p0, p0, La/l92;->j:Ljava/lang/Throwable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, v1, La/n92;->J:La/duj;

    .line 16
    .line 17
    new-instance v0, La/xg1;

    .line 18
    .line 19
    const/16 v2, 0x1d

    .line 20
    .line 21
    invoke-direct {v0, v2}, La/xg1;-><init>(B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 28
    .line 29
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-object v1, p0

    .line 39
    check-cast v1, La/d92;

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    const/16 v10, 0x6ff

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const-wide/16 v7, 0x0

    .line 50
    .line 51
    invoke-static/range {v1 .. v10}, La/d92;->a(La/d92;La/b92;La/lwk0;Ljava/util/List;La/yi50;La/dj50;JLa/bj50;I)La/d92;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_0

    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, v1, La/n92;->J:La/duj;

    .line 70
    .line 71
    new-instance v0, La/xg1;

    .line 72
    .line 73
    const/16 v1, 0x1c

    .line 74
    .line 75
    invoke-direct {v0, v1}, La/xg1;-><init>(B)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 85
    .line 86
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    if-nez p0, :cond_2

    .line 90
    .line 91
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, La/d92;

    .line 96
    .line 97
    iget-object p0, p0, La/d92;->f:La/yi50;

    .line 98
    .line 99
    instance-of p0, p0, La/wi50;

    .line 100
    .line 101
    if-eqz p0, :cond_2

    .line 102
    .line 103
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 104
    .line 105
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 106
    .line 107
    :cond_1
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-object v0, p1

    .line 115
    check-cast v0, La/d92;

    .line 116
    .line 117
    const/4 v8, 0x0

    .line 118
    const/16 v9, 0x7df

    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    const/4 v2, 0x0

    .line 122
    const/4 v3, 0x0

    .line 123
    sget-object v4, La/vi50;->a:La/vi50;

    .line 124
    .line 125
    const/4 v5, 0x0

    .line 126
    const-wide/16 v6, 0x0

    .line 127
    .line 128
    invoke-static/range {v0 .. v9}, La/d92;->a(La/d92;La/b92;La/lwk0;Ljava/util/List;La/yi50;La/dj50;JLa/bj50;I)La/d92;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_1

    .line 137
    .line 138
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
