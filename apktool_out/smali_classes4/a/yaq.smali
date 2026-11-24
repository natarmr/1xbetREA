.class public final La/yaq;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ebq;


# direct methods
.method public synthetic constructor <init>(La/ebq;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yaq;->i:B

    iput-object p1, p0, La/yaq;->k:La/ebq;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yaq;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yaq;->k:La/ebq;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/yaq;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/yaq;-><init>(La/ebq;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/yaq;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/yaq;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/yaq;-><init>(La/ebq;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/yaq;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/yaq;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ehn0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/yaq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yaq;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yaq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ql5;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/yaq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/yaq;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/yaq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yaq;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/yaq;->k:La/ebq;

    .line 6
    .line 7
    iget-object v0, v0, La/yaq;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, La/ehn0;

    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget v1, La/ebq;->f0:I

    .line 20
    .line 21
    sget-object v1, La/caq;->a:La/caq;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-boolean v1, v0, La/ehn0;->a:Z

    .line 27
    .line 28
    iget-object v10, v0, La/ehn0;->f:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v8, v0, La/ehn0;->b:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    new-instance v1, La/laq;

    .line 35
    .line 36
    iget-wide v3, v0, La/ehn0;->c:J

    .line 37
    .line 38
    invoke-direct {v1, v3, v4, v8, v10}, La/laq;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance v3, La/haq;

    .line 46
    .line 47
    iget-wide v6, v0, La/ehn0;->c:J

    .line 48
    .line 49
    iget-object v9, v0, La/ehn0;->d:Ljava/lang/String;

    .line 50
    .line 51
    iget-wide v4, v0, La/ehn0;->e:D

    .line 52
    .line 53
    iget-object v11, v0, La/ehn0;->g:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v12, v0, La/ehn0;->h:Ljava/lang/String;

    .line 56
    .line 57
    iget-boolean v13, v0, La/ehn0;->i:Z

    .line 58
    .line 59
    invoke-direct/range {v3 .. v13}, La/haq;-><init>(DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_0
    check-cast v0, La/ql5;

    .line 69
    .line 70
    sget-object v1, La/wne;->a:La/wne;

    .line 71
    .line 72
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, La/oaq;

    .line 80
    .line 81
    iget-object v1, v1, La/oaq;->d:La/g9q;

    .line 82
    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    iget-wide v3, v1, La/g9q;->a:J

    .line 86
    .line 87
    iget-wide v5, v0, La/ql5;->a:J

    .line 88
    .line 89
    cmp-long v1, v3, v5

    .line 90
    .line 91
    if-nez v1, :cond_2

    .line 92
    .line 93
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 94
    .line 95
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 96
    .line 97
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-object v3, v2

    .line 105
    check-cast v3, La/oaq;

    .line 106
    .line 107
    invoke-static {v0}, La/vcc;->k0(La/ql5;)La/g9q;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    const/4 v15, 0x0

    .line 112
    const/16 v16, 0xff7

    .line 113
    .line 114
    const/4 v4, 0x0

    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v8, 0x0

    .line 118
    const/4 v9, 0x0

    .line 119
    const/4 v10, 0x0

    .line 120
    const/4 v11, 0x0

    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    invoke-static/range {v3 .. v16}, La/oaq;->a(La/oaq;Ljava/util/List;ZLjava/lang/Integer;La/g9q;La/eb8;La/kcq;La/cev;ZZILa/wbq;ZI)La/oaq;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_1

    .line 133
    .line 134
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object v0

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
