.class public final La/jwu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/nfm0;


# direct methods
.method public constructor <init>(La/nfm0;B)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/jwu;->a:La/nfm0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/jwu;->a:La/nfm0;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/jwu;->a:La/nfm0;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/xqj0;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/iwu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/iwu;

    .line 7
    .line 8
    iget v1, v0, La/iwu;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/iwu;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/iwu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/iwu;-><init>(La/jwu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/iwu;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/iwu;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/iwu;->i:La/xqj0;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    iget-object p0, p0, La/jwu;->a:La/nfm0;

    .line 53
    .line 54
    sget-object p2, La/tcm0;->a:[La/tcm0;

    .line 55
    .line 56
    iput-object p1, v0, La/iwu;->i:La/xqj0;

    .line 57
    .line 58
    iput v3, v0, La/iwu;->l:I

    .line 59
    .line 60
    iget-object p2, p0, La/nfm0;->a:La/mne;

    .line 61
    .line 62
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 63
    .line 64
    new-instance v2, La/z8b0;

    .line 65
    .line 66
    invoke-direct {v2, p0, v4}, La/z8b0;-><init>(La/nfm0;La/yje;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p2, v2, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-ne p2, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_5

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    move-object v0, p2

    .line 93
    check-cast v0, La/khm0;

    .line 94
    .line 95
    iget v0, v0, La/khm0;->a:I

    .line 96
    .line 97
    iget v1, p1, La/xqj0;->d:I

    .line 98
    .line 99
    if-ne v0, v1, :cond_4

    .line 100
    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    move-object p2, v4

    .line 105
    :goto_2
    check-cast p2, La/khm0;

    .line 106
    .line 107
    if-eqz p2, :cond_6

    .line 108
    .line 109
    iget-object v4, p2, La/khm0;->b:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    :cond_6
    if-nez v4, :cond_7

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_7
    return-object v4

    .line 115
    :catchall_0
    :goto_3
    const-string p0, ""

    .line 116
    .line 117
    return-object p0
.end method

.method public b(Ljava/lang/String;La/yje;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object p0, p0, La/jwu;->a:La/nfm0;

    .line 3
    .line 4
    invoke-virtual {p0, p1, v0, p2}, La/nfm0;->b(Ljava/lang/String;ZLa/yje;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object p1, La/wne;->a:La/wne;

    .line 9
    .line 10
    if-ne p0, p1, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0
.end method
