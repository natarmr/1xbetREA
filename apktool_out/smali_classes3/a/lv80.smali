.class public final La/lv80;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/rv80;


# direct methods
.method public synthetic constructor <init>(La/rv80;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lv80;->i:B

    iput-object p1, p0, La/lv80;->k:La/rv80;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/lv80;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/lv80;->k:La/rv80;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/lv80;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/lv80;-><init>(La/rv80;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/lv80;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/lv80;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/lv80;-><init>(La/rv80;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/lv80;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/lv80;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/lv80;-><init>(La/rv80;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/lv80;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/lv80;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/lv80;-><init>(La/rv80;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/lv80;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lv80;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/lv80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lv80;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lv80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/sw00;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/lv80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/lv80;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/lv80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/cm80;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/lv80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/lv80;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/lv80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/lv80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/lv80;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/lv80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lv80;->i:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    iget-object v3, v0, La/lv80;->k:La/rv80;

    .line 7
    .line 8
    iget-object v0, v0, La/lv80;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, Ljava/lang/Throwable;

    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v3, La/rv80;->B:La/duj;

    .line 21
    .line 22
    new-instance v3, La/ht80;

    .line 23
    .line 24
    invoke-direct {v3, v2}, La/ht80;-><init>(B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_0
    move-object v1, v0

    .line 34
    check-cast v1, La/sw00;

    .line 35
    .line 36
    sget-object v0, La/wne;->a:La/wne;

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget v0, La/rv80;->V:I

    .line 42
    .line 43
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 44
    .line 45
    iget-object v4, v0, La/ocj;->a:La/p7m0;

    .line 46
    .line 47
    :cond_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-object v5, v0

    .line 55
    check-cast v5, La/yu80;

    .line 56
    .line 57
    iget-boolean v9, v1, La/sw00;->a:Z

    .line 58
    .line 59
    const/4 v14, 0x0

    .line 60
    const v15, 0x1fff7

    .line 61
    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    const/4 v10, 0x0

    .line 67
    const/4 v11, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    const/4 v13, 0x0

    .line 70
    invoke-static/range {v5 .. v15}, La/yu80;->a(La/yu80;ZZZZZLjava/util/List;Ljava/util/Set;La/gu80;La/ql5;I)La/yu80;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v4, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_0

    .line 79
    .line 80
    invoke-virtual {v3}, La/rv80;->Q()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, La/rv80;->R()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, La/rv80;->O()V

    .line 87
    .line 88
    .line 89
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_1
    check-cast v0, La/cm80;

    .line 93
    .line 94
    sget-object v1, La/wne;->a:La/wne;

    .line 95
    .line 96
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    new-instance v1, La/uj1;

    .line 100
    .line 101
    invoke-direct {v1, v0, v2}, La/uj1;-><init>(La/cm80;B)V

    .line 102
    .line 103
    .line 104
    sget v0, La/rv80;->V:I

    .line 105
    .line 106
    invoke-virtual {v3, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object v0

    .line 112
    :pswitch_2
    check-cast v0, Ljava/util/List;

    .line 113
    .line 114
    sget-object v1, La/wne;->a:La/wne;

    .line 115
    .line 116
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    new-instance v1, La/kv80;

    .line 120
    .line 121
    const/4 v2, 0x0

    .line 122
    invoke-direct {v1, v0, v2}, La/kv80;-><init>(Ljava/util/List;B)V

    .line 123
    .line 124
    .line 125
    sget v0, La/rv80;->V:I

    .line 126
    .line 127
    invoke-virtual {v3, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 128
    .line 129
    .line 130
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
