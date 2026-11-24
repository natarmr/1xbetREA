.class public final La/gyd;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/kyd;


# direct methods
.method public synthetic constructor <init>(La/kyd;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gyd;->i:B

    iput-object p1, p0, La/gyd;->j:La/kyd;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/gyd;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/gyd;->j:La/kyd;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/gyd;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/gyd;-><init>(La/kyd;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/gyd;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/gyd;-><init>(La/kyd;La/yje;B)V

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
    iget-byte v0, p0, La/gyd;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/gyd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/gyd;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/gyd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/gyd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/gyd;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/gyd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gyd;->i:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v1, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v4, v0, La/gyd;->j:La/kyd;

    .line 14
    .line 15
    iget-object v0, v4, La/kyd;->c:La/mne;

    .line 16
    .line 17
    iget-object v1, v4, La/kyd;->E:La/c4m0;

    .line 18
    .line 19
    const/4 v10, 0x4

    .line 20
    const/4 v11, 0x0

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, La/pby;->isActive()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x1

    .line 28
    if-ne v1, v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, v4, La/kyd;->k:La/m1e;

    .line 32
    .line 33
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v2, La/yxd;

    .line 38
    .line 39
    const/4 v3, 0x3

    .line 40
    invoke-direct {v2, v4, v11, v3}, La/yxd;-><init>(La/kyd;La/yje;B)V

    .line 41
    .line 42
    .line 43
    new-instance v3, La/fnq;

    .line 44
    .line 45
    invoke-direct {v3, v1, v2, v10}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v2, v0, La/mne;->a:La/rwj;

    .line 53
    .line 54
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v2, La/pd;

    .line 59
    .line 60
    const/4 v5, 0x2

    .line 61
    const/16 v6, 0x1d

    .line 62
    .line 63
    invoke-direct {v2, v5, v11, v6}, La/pd;-><init>(ILa/yje;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iput-object v1, v4, La/kyd;->E:La/c4m0;

    .line 71
    .line 72
    :goto_0
    iget-object v1, v4, La/kyd;->H:La/bby;

    .line 73
    .line 74
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    iget-object v15, v0, La/mne;->b:La/dvj;

    .line 82
    .line 83
    new-instance v2, La/enc;

    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    const/16 v9, 0x17

    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    const-class v5, La/kyd;

    .line 90
    .line 91
    const-string v6, "handleServerError"

    .line 92
    .line 93
    const-string v7, "handleServerError(Ljava/lang/Throwable;)V"

    .line 94
    .line 95
    invoke-direct/range {v2 .. v9}, La/enc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 96
    .line 97
    .line 98
    new-instance v0, La/fj3;

    .line 99
    .line 100
    invoke-direct {v0, v4, v11, v10}, La/fj3;-><init>(La/diu0;La/yje;B)V

    .line 101
    .line 102
    .line 103
    const/16 v17, 0xa

    .line 104
    .line 105
    const/4 v14, 0x0

    .line 106
    move-object/from16 v16, v0

    .line 107
    .line 108
    move-object v13, v2

    .line 109
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, v4, La/kyd;->H:La/bby;

    .line 114
    .line 115
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 119
    .line 120
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v0, La/gyd;->j:La/kyd;

    .line 124
    .line 125
    invoke-virtual {v0}, La/kyd;->K()V

    .line 126
    .line 127
    .line 128
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object v0

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
