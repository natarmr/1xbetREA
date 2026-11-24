.class public final synthetic La/kjd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/njd0;


# direct methods
.method public synthetic constructor <init>(La/njd0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kjd0;->a:B

    iput-object p1, p0, La/kjd0;->b:La/njd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/kjd0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/kjd0;->b:La/njd0;

    .line 4
    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/njd0;->I0()La/fkd0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, La/sjd0;->a:La/sjd0;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/fkd0;->y(La/xjd0;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/njd0;->I0()La/fkd0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget-object p1, p0, La/fkd0;->j:La/s64;

    .line 37
    .line 38
    sget-object v0, La/hfi0;->c:La/hfi0;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, La/s64;->f(La/hfi0;)V

    .line 41
    .line 42
    .line 43
    sget-object p1, La/vjd0;->a:La/vjd0;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, La/fkd0;->y(La/xjd0;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_1
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, La/njd0;->I0()La/fkd0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    iget-object p1, p0, La/fkd0;->j:La/s64;

    .line 61
    .line 62
    sget-object v0, La/hfi0;->d:La/hfi0;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, La/s64;->f(La/hfi0;)V

    .line 65
    .line 66
    .line 67
    sget-object p1, La/wjd0;->a:La/wjd0;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/fkd0;->y(La/xjd0;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_2
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, La/njd0;->I0()La/fkd0;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    sget-object p0, La/hfi0;->b:La/hfi0;

    .line 85
    .line 86
    iget-object p1, v3, La/fkd0;->j:La/s64;

    .line 87
    .line 88
    invoke-virtual {p1, p0}, La/s64;->f(La/hfi0;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    new-instance v1, La/prc0;

    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    const/16 v8, 0xe

    .line 99
    .line 100
    const/4 v2, 0x1

    .line 101
    const-class v4, La/fkd0;

    .line 102
    .line 103
    const-string v5, "handleError"

    .line 104
    .line 105
    const-string v6, "handleError(Ljava/lang/Throwable;)V"

    .line 106
    .line 107
    invoke-direct/range {v1 .. v8}, La/prc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 108
    .line 109
    .line 110
    iget-object p1, v3, La/fkd0;->f:La/mne;

    .line 111
    .line 112
    iget-object v7, p1, La/mne;->b:La/dvj;

    .line 113
    .line 114
    new-instance v8, La/zjd0;

    .line 115
    .line 116
    const/4 p1, 0x0

    .line 117
    const/4 v0, 0x1

    .line 118
    invoke-direct {v8, v3, p1, v0}, La/zjd0;-><init>(La/fkd0;La/yje;B)V

    .line 119
    .line 120
    .line 121
    const/16 v9, 0xa

    .line 122
    .line 123
    const/4 v6, 0x0

    .line 124
    move-object v4, p0

    .line 125
    move-object v5, v1

    .line 126
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 127
    .line 128
    .line 129
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0

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
