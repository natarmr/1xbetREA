.class public final synthetic La/hpb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lpb0;


# direct methods
.method public synthetic constructor <init>(La/lpb0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hpb0;->a:B

    iput-object p1, p0, La/hpb0;->b:La/lpb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/hpb0;->a:B

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    iget-object p0, p0, La/hpb0;->b:La/lpb0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/k0w0;

    .line 11
    .line 12
    new-instance v0, Lorg/xplatform/bet_history/history/presentation/BetHistoryScreen;

    .line 13
    .line 14
    new-instance v1, La/p57;

    .line 15
    .line 16
    iget-wide v3, p0, La/lpb0;->p:J

    .line 17
    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct/range {v1 .. v6}, La/p57;-><init>(IJJ)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/lpb0;->v:La/pru;

    .line 25
    .line 26
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 31
    .line 32
    iget-object p0, p0, La/mum0;->u:La/k77;

    .line 33
    .line 34
    invoke-direct {v0, v1, p0}, Lorg/xplatform/bet_history/history/presentation/BetHistoryScreen;-><init>(La/p57;La/k77;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, La/k0w0;->c(La/m7h0;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/lpb0;->C:La/duj;

    .line 49
    .line 50
    new-instance v2, La/lma0;

    .line 51
    .line 52
    invoke-direct {v2, p0, v1}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_1
    move-object v0, p1

    .line 62
    check-cast v0, Ljava/lang/Throwable;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 68
    .line 69
    iget-object v2, p1, La/ocj;->a:La/p7m0;

    .line 70
    .line 71
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 79
    .line 80
    move-object v3, p1

    .line 81
    check-cast v3, La/zob0;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const/4 v11, 0x0

    .line 87
    const/16 v12, 0x7ffd

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    const/4 v7, 0x0

    .line 93
    const/4 v8, 0x0

    .line 94
    const/4 v9, 0x0

    .line 95
    const/4 v10, 0x0

    .line 96
    invoke-static/range {v3 .. v12}, La/zob0;->a(La/zob0;ZZLa/cit0;Ljava/lang/String;La/ql5;La/sob0;Ljava/util/List;Ljava/util/List;I)La/zob0;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v2, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_0

    .line 105
    .line 106
    iget-object p0, p0, La/lpb0;->C:La/duj;

    .line 107
    .line 108
    new-instance p1, La/j3b0;

    .line 109
    .line 110
    const/16 v1, 0xf

    .line 111
    .line 112
    invoke-direct {p1, v1}, La/j3b0;-><init>(B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0, p1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 116
    .line 117
    .line 118
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object p0, p0, La/lpb0;->C:La/duj;

    .line 127
    .line 128
    new-instance v0, La/j3b0;

    .line 129
    .line 130
    invoke-direct {v0, v1}, La/j3b0;-><init>(B)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
