.class public final synthetic La/aod0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tod0;


# direct methods
.method public synthetic constructor <init>(La/tod0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/aod0;->a:B

    iput-object p1, p0, La/aod0;->b:La/tod0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/aod0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/aod0;->b:La/tod0;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/String;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/tod0;->n:La/ol60;

    .line 22
    .line 23
    new-instance p1, La/hod0;

    .line 24
    .line 25
    invoke-direct {p1, p2}, La/hod0;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    new-instance v5, La/bod0;

    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    invoke-direct {v5, p1}, La/bod0;-><init>(B)V

    .line 48
    .line 49
    .line 50
    new-instance v8, La/ood0;

    .line 51
    .line 52
    invoke-direct {v8, p0, p2, v3, p1}, La/ood0;-><init>(La/tod0;Ljava/lang/String;La/yje;B)V

    .line 53
    .line 54
    .line 55
    const/16 v9, 0xe

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v7, 0x0

    .line 59
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    new-instance v5, La/bod0;

    .line 76
    .line 77
    invoke-direct {v5, v2}, La/bod0;-><init>(B)V

    .line 78
    .line 79
    .line 80
    new-instance v8, La/ood0;

    .line 81
    .line 82
    invoke-direct {v8, p0, p2, v3, v1}, La/ood0;-><init>(La/tod0;Ljava/lang/String;La/yje;B)V

    .line 83
    .line 84
    .line 85
    const/16 v9, 0xe

    .line 86
    .line 87
    const/4 v6, 0x0

    .line 88
    const/4 v7, 0x0

    .line 89
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    new-instance v5, La/bod0;

    .line 106
    .line 107
    invoke-direct {v5, v1}, La/bod0;-><init>(B)V

    .line 108
    .line 109
    .line 110
    new-instance v8, La/ood0;

    .line 111
    .line 112
    invoke-direct {v8, p0, p2, v3, v2}, La/ood0;-><init>(La/tod0;Ljava/lang/String;La/yje;B)V

    .line 113
    .line 114
    .line 115
    const/16 v9, 0xe

    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    const/4 v7, 0x0

    .line 119
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    new-instance v5, La/bod0;

    .line 136
    .line 137
    const/4 p1, 0x3

    .line 138
    invoke-direct {v5, p1}, La/bod0;-><init>(B)V

    .line 139
    .line 140
    .line 141
    new-instance v8, La/ood0;

    .line 142
    .line 143
    invoke-direct {v8, p0, p2, v3, p1}, La/ood0;-><init>(La/tod0;Ljava/lang/String;La/yje;B)V

    .line 144
    .line 145
    .line 146
    const/16 v9, 0xe

    .line 147
    .line 148
    const/4 v6, 0x0

    .line 149
    const/4 v7, 0x0

    .line 150
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 151
    .line 152
    .line 153
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
