.class public final La/soc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/dn0;


# direct methods
.method public constructor <init>(La/dn0;B)V
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
    iput-object p1, p0, La/soc;->a:La/dn0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/soc;->a:La/dn0;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(La/dn0;C)V
    .locals 0

    .line 19
    iput-object p1, p0, La/soc;->a:La/dn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/zje;Ljava/lang/String;ZZ)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/ob60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ob60;

    .line 7
    .line 8
    iget v1, v0, La/ob60;->k:I

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
    iput v1, v0, La/ob60;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ob60;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ob60;-><init>(La/soc;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ob60;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ob60;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/ob60;->k:I

    .line 51
    .line 52
    iget-object v3, p0, La/soc;->a:La/dn0;

    .line 53
    .line 54
    iget-object p0, v3, La/dn0;->c:La/xk0;

    .line 55
    .line 56
    iget-object p0, p0, La/xk0;->e:La/p7m0;

    .line 57
    .line 58
    new-instance v2, La/lm0;

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x1

    .line 62
    move-object v4, p2

    .line 63
    move v5, p3

    .line 64
    move v6, p4

    .line 65
    invoke-direct/range {v2 .. v8}, La/lm0;-><init>(La/dn0;Ljava/lang/String;ZZLa/yje;B)V

    .line 66
    .line 67
    .line 68
    new-instance p1, La/fnq;

    .line 69
    .line 70
    invoke-direct {p1, p0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 71
    .line 72
    .line 73
    if-ne p1, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    check-cast p1, La/gmq;

    .line 77
    .line 78
    new-instance p0, La/wk30;

    .line 79
    .line 80
    const/4 p2, 0x7

    .line 81
    invoke-direct {p0, p1, p2}, La/wk30;-><init>(La/gmq;B)V

    .line 82
    .line 83
    .line 84
    return-object p0
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object p0, p0, La/soc;->a:La/dn0;

    .line 2
    .line 3
    iget-object p0, p0, La/dn0;->c:La/xk0;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, La/xk0;->c:Z

    .line 7
    .line 8
    return-void
.end method
