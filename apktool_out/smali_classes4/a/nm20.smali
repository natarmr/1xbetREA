.class public final La/nm20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/ln20;


# direct methods
.method public synthetic constructor <init>(La/ln20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nm20;->i:B

    iput-object p1, p0, La/nm20;->j:La/ln20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/nm20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nm20;->j:La/ln20;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/nm20;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/nm20;-><init>(La/ln20;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/nm20;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/nm20;-><init>(La/ln20;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nm20;->i:B

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
    invoke-virtual {p0, p1, p2}, La/nm20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nm20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nm20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/nm20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/nm20;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/nm20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/nm20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nm20;->j:La/ln20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget p1, La/ln20;->o0:I

    .line 14
    .line 15
    iget-object p1, p0, La/ln20;->M:La/reu;

    .line 16
    .line 17
    invoke-virtual {p1}, La/reu;->c()La/nwo0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, La/ln20;->B:La/b8u;

    .line 22
    .line 23
    invoke-virtual {v0}, La/b8u;->b()La/duw;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, La/duw;->d:La/duw;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, La/sg20;

    .line 38
    .line 39
    iget-boolean v1, v1, La/sg20;->i:Z

    .line 40
    .line 41
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, La/sg20;

    .line 46
    .line 47
    iget-boolean v2, v2, La/sg20;->h:Z

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    iget-boolean v2, p1, La/nwo0;->a:Z

    .line 52
    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    :cond_0
    iget-boolean p1, p1, La/nwo0;->b:Z

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    :cond_1
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 66
    .line 67
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 68
    .line 69
    :cond_2
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-object v0, p1

    .line 77
    check-cast v0, La/sg20;

    .line 78
    .line 79
    iget-object v1, v0, La/sg20;->e:La/qvj0;

    .line 80
    .line 81
    iget-object v2, v1, La/qvj0;->c:La/jwo0;

    .line 82
    .line 83
    const/4 v7, 0x0

    .line 84
    const/16 v8, 0x36

    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    const/4 v4, 0x1

    .line 88
    const-wide/16 v5, 0x0

    .line 89
    .line 90
    invoke-static/range {v2 .. v8}, La/jwo0;->a(La/jwo0;ZZDLjava/util/List;I)La/jwo0;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    const/4 v5, 0x0

    .line 95
    const/16 v6, 0x1b

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    const/4 v3, 0x0

    .line 99
    invoke-static/range {v1 .. v6}, La/qvj0;->a(La/qvj0;La/cx6;La/lnb0;La/jwo0;La/d0d;I)La/qvj0;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const/4 v9, 0x0

    .line 104
    const/16 v10, 0x7ef

    .line 105
    .line 106
    const/4 v1, 0x0

    .line 107
    const/4 v6, 0x0

    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    invoke-static/range {v0 .. v10}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_2

    .line 119
    .line 120
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 124
    .line 125
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    new-instance p1, La/mc20;

    .line 129
    .line 130
    new-instance v0, La/ngc0;

    .line 131
    .line 132
    sget-object v1, La/iun;->a:La/iun;

    .line 133
    .line 134
    sget-object v2, La/q4f;->c:La/q4f;

    .line 135
    .line 136
    invoke-virtual {v2}, La/q4f;->a()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    invoke-direct {v0, v1, v2, v3}, La/ngc0;-><init>(Ljava/util/List;La/q4f;I)V

    .line 141
    .line 142
    .line 143
    invoke-direct {p1, v0}, La/mc20;-><init>(La/ngc0;)V

    .line 144
    .line 145
    .line 146
    sget v0, La/ln20;->o0:I

    .line 147
    .line 148
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p0

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
