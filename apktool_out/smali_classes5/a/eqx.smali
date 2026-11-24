.class public final La/eqx;
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
    iput-object p1, p0, La/eqx;->a:La/b3c0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/eqx;->a:La/b3c0;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/eqx;->a:La/b3c0;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/eqx;->a:La/b3c0;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, La/u2c0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/u2c0;

    .line 7
    .line 8
    iget v1, v0, La/u2c0;->k:I

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
    iput v1, v0, La/u2c0;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/u2c0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, La/u2c0;-><init>(La/eqx;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v4, La/u2c0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v4, La/u2c0;->k:I

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast p1, La/j0g0;

    .line 43
    .line 44
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, La/wen;->b:La/uen;

    .line 57
    .line 58
    const-wide/16 v5, 0x2

    .line 59
    .line 60
    sget-object p1, La/bfn;->e:La/bfn;

    .line 61
    .line 62
    invoke-static {v5, v6, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    const-class p1, La/oqt0;

    .line 67
    .line 68
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance v7, La/c670;

    .line 73
    .line 74
    const/16 v1, 0x16

    .line 75
    .line 76
    invoke-direct {v7, p0, v2, v1}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 77
    .line 78
    .line 79
    iput v3, v4, La/u2c0;->k:I

    .line 80
    .line 81
    const/16 v1, 0xa

    .line 82
    .line 83
    move-wide v2, v5

    .line 84
    const-string v5, "ProfileInteractor.getProfile"

    .line 85
    .line 86
    move-object v6, p1

    .line 87
    invoke-static/range {v1 .. v7}, La/j0x;->D(IJLa/zje;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-ne p0, v0, :cond_3

    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_3
    :goto_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-object p0
.end method

.method public b()V
    .locals 6

    .line 1
    iget-object p0, p0, La/eqx;->a:La/b3c0;

    .line 2
    .line 3
    iget-object p0, p0, La/b3c0;->b:La/x2c0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/x2c0;->a()La/m2c0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v4, -0x1

    .line 13
    const/16 v5, 0xfd

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, La/m2c0;->a(La/m2c0;La/y0b;IZII)La/m2c0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object p0, p0, La/x2c0;->a:La/p7m0;

    .line 23
    .line 24
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method
