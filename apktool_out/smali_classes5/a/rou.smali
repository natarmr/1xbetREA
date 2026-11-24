.class public final La/rou;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/b3c0;


# direct methods
.method public constructor <init>(La/b3c0;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/rou;->a:La/b3c0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/rou;->a:La/b3c0;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/rou;->a:La/b3c0;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(ZLa/yje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, La/qou;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/qou;

    .line 7
    .line 8
    iget v1, v0, La/qou;->k:I

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
    iput v1, v0, La/qou;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/qou;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/qou;-><init>(La/rou;La/yje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v4, La/qou;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v4, La/qou;->k:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast p2, La/j0g0;

    .line 43
    .line 44
    iget-object p0, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const-class p2, La/rou;

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object p2, La/wen;->b:La/uen;

    .line 63
    .line 64
    const-wide/16 v6, 0x2

    .line 65
    .line 66
    sget-object p2, La/bfn;->e:La/bfn;

    .line 67
    .line 68
    invoke-static {v6, v7, p2}, La/ibc;->w0(JLa/bfn;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    const-class p2, Ljava/net/ConnectException;

    .line 73
    .line 74
    const-class v1, Ljava/net/UnknownHostException;

    .line 75
    .line 76
    const-class v8, La/oqt0;

    .line 77
    .line 78
    const-class v9, Ljava/net/SocketException;

    .line 79
    .line 80
    const-class v10, Ljava/net/SocketTimeoutException;

    .line 81
    .line 82
    filled-new-array {v8, v9, v10, p2, v1}, [Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    move-object v1, v2

    .line 91
    move-wide v11, v6

    .line 92
    move v6, v3

    .line 93
    move-wide v2, v11

    .line 94
    new-instance v7, La/u88;

    .line 95
    .line 96
    const/16 v8, 0x14

    .line 97
    .line 98
    invoke-direct {v7, p0, p1, v1, v8}, La/u88;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 99
    .line 100
    .line 101
    iput v6, v4, La/qou;->k:I

    .line 102
    .line 103
    const/16 v1, 0xa

    .line 104
    .line 105
    move-object v6, p2

    .line 106
    invoke-static/range {v1 .. v7}, La/j0x;->D(IJLa/zje;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-ne p0, v0, :cond_3

    .line 111
    .line 112
    return-object v0

    .line 113
    :cond_3
    :goto_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-object p0
.end method
