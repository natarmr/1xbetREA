.class public final La/i5;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/a4x;La/ud80;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/i5;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/i5;->b:I

    .line 8
    .line 9
    iput-object p2, p0, La/i5;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/i5;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 14
    iput-byte p4, p0, La/i5;->a:B

    iput-object p1, p0, La/i5;->c:Ljava/lang/Object;

    iput-object p2, p0, La/i5;->d:Ljava/lang/Object;

    iput p3, p0, La/i5;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function2;ILa/ah7;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/i5;->a:B

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/i5;->c:Ljava/lang/Object;

    iput p2, p0, La/i5;->b:I

    iput-object p3, p0, La/i5;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/i5;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, La/i5;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v5, p0, La/i5;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget p0, p0, La/i5;->b:I

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    check-cast v5, La/a4x;

    .line 19
    .line 20
    sub-int/2addr p0, v3

    .line 21
    invoke-interface {v5, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    instance-of p0, p0, La/zd80;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    check-cast v4, La/ud80;

    .line 30
    .line 31
    instance-of p0, v4, La/rd80;

    .line 32
    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    move v2, v3

    .line 36
    :cond_1
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast v5, La/vne;

    .line 42
    .line 43
    new-instance v0, La/jcc;

    .line 44
    .line 45
    check-cast v4, La/xcz;

    .line 46
    .line 47
    invoke-direct {v0, v4, p0, v1, v3}, La/jcc;-><init>(La/xcz;ILa/yje;B)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x3

    .line 51
    invoke-static {v5, v1, v1, v0, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_1
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 58
    .line 59
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast v4, La/ah7;

    .line 64
    .line 65
    iget-wide v0, v4, La/ah7;->a:J

    .line 66
    .line 67
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v5, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_2
    check-cast v5, La/q8a;

    .line 78
    .line 79
    check-cast v4, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/j5;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, La/j5;->c:La/jzs0;

    .line 91
    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    move v0, v3

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    move v0, v2

    .line 97
    :goto_1
    invoke-virtual {v5}, La/q8a;->X()La/x83;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    sget-object v6, La/x83;->f:La/x83;

    .line 102
    .line 103
    if-ne v4, v6, :cond_3

    .line 104
    .line 105
    move v2, v3

    .line 106
    :cond_3
    if-nez v0, :cond_5

    .line 107
    .line 108
    if-eqz v2, :cond_4

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    sget-object v0, La/x83;->e:La/x83;

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    :goto_2
    invoke-virtual {v5}, La/q8a;->X()La/x83;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_3
    iget-object p0, p0, La/j5;->b:La/jay;

    .line 119
    .line 120
    if-eqz p0, :cond_6

    .line 121
    .line 122
    iget-object p0, p0, La/jay;->a:Ljava/util/EnumMap;

    .line 123
    .line 124
    invoke-virtual {p0, v0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    move-object v1, p0

    .line 129
    check-cast v1, La/t8y;

    .line 130
    .line 131
    :cond_6
    return-object v1

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
