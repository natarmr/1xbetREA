.class public final La/tot0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:I

.field public j:Z

.field public final synthetic k:La/xot0;

.field public final synthetic l:I


# direct methods
.method public constructor <init>(La/xot0;ILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/tot0;->k:La/xot0;

    .line 2
    .line 3
    iput p2, p0, La/tot0;->l:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/tot0;

    .line 2
    .line 3
    iget-object v1, p0, La/tot0;->k:La/xot0;

    .line 4
    .line 5
    iget p0, p0, La/tot0;->l:I

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, La/tot0;-><init>(La/xot0;ILa/yje;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/tot0;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/tot0;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/tot0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/tot0;->j:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const-string v4, "CXCP"

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    iget p0, p0, La/tot0;->i:I

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception v0

    .line 20
    move-object p0, v0

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v4}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    const-string p1, "UseCaseCameraRequestControlImpl#setTorchOffAsync"

    .line 38
    .line 39
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object p1, p0, La/tot0;->k:La/xot0;

    .line 43
    .line 44
    iget v1, p0, La/tot0;->l:I

    .line 45
    .line 46
    :try_start_1
    iget-object p1, p1, La/xot0;->c:La/kpt0;

    .line 47
    .line 48
    invoke-virtual {p1}, La/kpt0;->a()La/b0a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput v1, p0, La/tot0;->i:I

    .line 53
    .line 54
    iput-boolean v3, p0, La/tot0;->j:Z

    .line 55
    .line 56
    invoke-virtual {p1, p0}, La/b0a;->c(La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v0, :cond_3

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_3
    move p0, v1

    .line 64
    :goto_0
    check-cast p1, Ljava/lang/AutoCloseable;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    .line 66
    :try_start_2
    move-object v0, p1

    .line 67
    check-cast v0, La/e0a;

    .line 68
    .line 69
    new-instance v6, La/z40;

    .line 70
    .line 71
    invoke-direct {v6, p0}, La/z40;-><init>(I)V

    .line 72
    .line 73
    .line 74
    iget-object p0, v0, La/e0a;->a:La/m050;

    .line 75
    .line 76
    invoke-virtual {p0}, La/m050;->a()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_4

    .line 81
    .line 82
    iget-object v5, v0, La/e0a;->c:La/hke;

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v9, La/xjq;

    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    invoke-direct {v9, p0}, La/xjq;-><init>(I)V

    .line 91
    .line 92
    .line 93
    const/4 v12, 0x0

    .line 94
    const/16 v13, 0x76

    .line 95
    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v10, 0x0

    .line 99
    const/4 v11, 0x0

    .line 100
    invoke-static/range {v5 .. v13}, La/hke;->b(La/hke;La/z40;La/q70;La/va5;La/xjq;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)La/odd;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    goto :goto_1

    .line 105
    :cond_4
    const-string p0, "Cannot call setTorchOff on "

    .line 106
    .line 107
    const-string v1, " after close."

    .line 108
    .line 109
    invoke-static {v0, v1, p0}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    .line 111
    .line 112
    move-object p0, v2

    .line 113
    :goto_1
    :try_start_3
    invoke-static {p1, v2}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 114
    .line 115
    .line 116
    return-object p0

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    move-object p0, v0

    .line 119
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 120
    :catchall_1
    move-exception v0

    .line 121
    :try_start_5
    invoke-static {p1, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    throw v0
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0

    .line 125
    :goto_2
    invoke-static {v4}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_5

    .line 130
    .line 131
    const-string p1, "Cannot acquire the CameraGraph.Session"

    .line 132
    .line 133
    invoke-static {v4, p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 134
    .line 135
    .line 136
    :cond_5
    sget-object p0, La/xot0;->l:La/odd;

    .line 137
    .line 138
    return-object p0
.end method
