.class public final synthetic La/z400;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g500;


# direct methods
.method public synthetic constructor <init>(La/g500;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/z400;->a:B

    iput-object p1, p0, La/z400;->b:La/g500;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/z400;->a:B

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x17

    .line 7
    .line 8
    const/4 v4, 0x3

    .line 9
    iget-object p0, p0, La/z400;->b:La/g500;

    .line 10
    .line 11
    check-cast p1, Ljava/lang/Throwable;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, La/g500;->j:La/duj;

    .line 20
    .line 21
    new-instance v5, La/kyz;

    .line 22
    .line 23
    invoke-direct {v5, v4}, La/kyz;-><init>(B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1, v5}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    new-instance v7, La/z8z;

    .line 34
    .line 35
    invoke-direct {v7, v3}, La/z8z;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v10, La/cin;

    .line 39
    .line 40
    invoke-direct {v10, p0, v2, v1}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    const/16 v11, 0xe

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x0

    .line 47
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, La/g500;->j:La/duj;

    .line 57
    .line 58
    new-instance v5, La/kyz;

    .line 59
    .line 60
    invoke-direct {v5, v4}, La/kyz;-><init>(B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1, v5}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    new-instance v7, La/z8z;

    .line 71
    .line 72
    invoke-direct {v7, v3}, La/z8z;-><init>(B)V

    .line 73
    .line 74
    .line 75
    new-instance v10, La/cin;

    .line 76
    .line 77
    invoke-direct {v10, p0, v2, v1}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 78
    .line 79
    .line 80
    const/16 v11, 0xe

    .line 81
    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 85
    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, La/g500;->m:La/p7m0;

    .line 94
    .line 95
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    move-object v2, v1

    .line 100
    check-cast v2, La/d500;

    .line 101
    .line 102
    new-instance v2, La/c500;

    .line 103
    .line 104
    iget-object v5, p0, La/g500;->c:La/sa10;

    .line 105
    .line 106
    sget-object v6, La/pb10;->g:La/pb10;

    .line 107
    .line 108
    const/4 v9, 0x0

    .line 109
    const/16 v10, 0x1c

    .line 110
    .line 111
    const v7, 0x7f130677

    .line 112
    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    invoke-static/range {v5 .. v10}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-direct {v2, v3}, La/c500;-><init>(La/ra10;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_0

    .line 127
    .line 128
    iget-object p0, p0, La/g500;->j:La/duj;

    .line 129
    .line 130
    new-instance v0, La/kyz;

    .line 131
    .line 132
    invoke-direct {v0, v4}, La/kyz;-><init>(B)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 136
    .line 137
    .line 138
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
