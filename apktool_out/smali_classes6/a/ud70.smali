.class public final La/ud70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/xd70;


# direct methods
.method public synthetic constructor <init>(La/xd70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ud70;->i:B

    iput-object p1, p0, La/ud70;->k:La/xd70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ud70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ud70;->k:La/xd70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ud70;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ud70;-><init>(La/xd70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ud70;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ud70;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ud70;-><init>(La/xd70;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ud70;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/ud70;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/uaq0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ud70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ud70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ud70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ud70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ud70;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ud70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ud70;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/ud70;->k:La/xd70;

    .line 6
    .line 7
    iget-object v0, v0, La/ud70;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v4, v0

    .line 13
    check-cast v4, La/uaq0;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/xb70;

    .line 25
    .line 26
    iget-object v0, v0, La/xb70;->a:La/uaq0;

    .line 27
    .line 28
    if-eq v4, v0, :cond_3

    .line 29
    .line 30
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 31
    .line 32
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-object v3, v1

    .line 42
    check-cast v3, La/xb70;

    .line 43
    .line 44
    const/16 v20, 0x0

    .line 45
    .line 46
    const v21, 0x1fffe

    .line 47
    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x0

    .line 56
    const/4 v12, 0x0

    .line 57
    const/4 v13, 0x0

    .line 58
    const/4 v14, 0x0

    .line 59
    const/4 v15, 0x0

    .line 60
    const/16 v16, 0x0

    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    const/16 v18, 0x0

    .line 65
    .line 66
    const/16 v19, 0x0

    .line 67
    .line 68
    invoke-static/range {v3 .. v21}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_0

    .line 77
    .line 78
    new-instance v0, La/lir;

    .line 79
    .line 80
    sget-object v1, La/ajr;->Companion:La/zir;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget-object v1, La/uaq0;->a:La/s9m0;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {v4}, La/s9m0;->i(La/uaq0;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_1

    .line 98
    .line 99
    sget-object v1, La/ajr;->b:La/ajr;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    invoke-static {v4}, La/s9m0;->j(La/uaq0;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    sget-object v1, La/ajr;->c:La/ajr;

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    sget-object v1, La/ajr;->d:La/ajr;

    .line 112
    .line 113
    :goto_0
    invoke-direct {v0, v1}, La/lir;-><init>(La/ajr;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, v2, La/xd70;->j0:La/z7z;

    .line 117
    .line 118
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    check-cast v1, La/vby;

    .line 126
    .line 127
    invoke-virtual {v0, v1}, La/mir;->a(La/vby;)La/agr;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v2, v0}, La/xd70;->m0(La/agr;)V

    .line 132
    .line 133
    .line 134
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object v0

    .line 137
    :pswitch_0
    check-cast v0, Ljava/lang/String;

    .line 138
    .line 139
    sget-object v1, La/wne;->a:La/wne;

    .line 140
    .line 141
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    new-instance v1, La/sb70;

    .line 145
    .line 146
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, La/xb70;

    .line 151
    .line 152
    iget-object v3, v3, La/xb70;->c:La/c5v0;

    .line 153
    .line 154
    invoke-direct {v1, v3, v0}, La/sb70;-><init>(La/c5v0;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object v0

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
