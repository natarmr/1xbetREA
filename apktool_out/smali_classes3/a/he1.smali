.class public final La/he1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/n0o0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-instance v0, La/cbc0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, La/cbc0;-><init>(B)V

    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object v0

    iput-object v0, p0, La/he1;->a:La/n0o0;

    return-void
.end method

.method public constructor <init>(La/gii0;La/te1;La/le1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance p2, La/zm;

    const/4 p3, 0x3

    invoke-direct {p2, p1, p3}, La/zm;-><init>(La/gii0;B)V

    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    iput-object p1, p0, La/he1;->a:La/n0o0;

    return-void
.end method

.method public constructor <init>(La/rrc;B)V
    .locals 1

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p2, La/dio;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p2, p1, v0}, La/dio;-><init>(La/rrc;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/he1;->a:La/n0o0;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance p2, La/dio;

    .line 24
    .line 25
    const/4 v0, 0x7

    .line 26
    invoke-direct {p2, p1, v0}, La/dio;-><init>(La/rrc;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, La/he1;->a:La/n0o0;

    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance p2, La/dio;

    .line 40
    .line 41
    const/4 v0, 0x6

    .line 42
    invoke-direct {p2, p1, v0}, La/dio;-><init>(La/rrc;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, La/he1;->a:La/n0o0;

    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance p2, La/dio;

    .line 56
    .line 57
    const/4 v0, 0x3

    .line 58
    invoke-direct {p2, p1, v0}, La/dio;-><init>(La/rrc;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, La/he1;->a:La/n0o0;

    .line 66
    .line 67
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public a()La/tt20;
    .locals 0

    .line 1
    iget-object p0, p0, La/he1;->a:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/tt20;

    .line 8
    .line 9
    return-object p0
.end method

.method public b(La/bnn0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/he1;->a:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/qco;

    .line 8
    .line 9
    iget-object p0, p0, La/qco;->a:La/zdg0;

    .line 10
    .line 11
    new-instance v0, La/f1e;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    const/16 v2, 0x16

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v0, v1, v3, v2}, La/f1e;-><init>(ILa/yje;B)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {p1, p0, v0, v1, v2}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public c(ILjava/lang/String;ILjava/lang/String;IIIILa/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p9, La/ge1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p9

    .line 6
    check-cast v0, La/ge1;

    .line 7
    .line 8
    iget v1, v0, La/ge1;->k:I

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
    iput v1, v0, La/ge1;->k:I

    .line 18
    .line 19
    :goto_0
    move-object p9, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/ge1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p9}, La/ge1;-><init>(La/he1;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p9, La/ge1;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p9, La/ge1;->k:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

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
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/he1;->a:La/n0o0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/wd1;

    .line 59
    .line 60
    iput v3, p9, La/ge1;->k:I

    .line 61
    .line 62
    move v5, p5

    .line 63
    move-object p5, p2

    .line 64
    move-object p2, p4

    .line 65
    move p4, p6

    .line 66
    move p6, p3

    .line 67
    move p3, v5

    .line 68
    move v5, p8

    .line 69
    move p8, p7

    .line 70
    move p7, v5

    .line 71
    invoke-static/range {p0 .. p9}, La/wd1;->b(La/wd1;ILjava/lang/String;IILjava/lang/String;IIILa/zje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-ne v0, v1, :cond_3

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_3
    :goto_2
    check-cast v0, La/uc1;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget p0, v0, La/uc1;->b:I

    .line 84
    .line 85
    iget-object p1, v0, La/uc1;->c:Ljava/lang/String;

    .line 86
    .line 87
    if-eqz p0, :cond_5

    .line 88
    .line 89
    new-instance p2, La/cii0;

    .line 90
    .line 91
    if-nez p1, :cond_4

    .line 92
    .line 93
    const-string p1, ""

    .line 94
    .line 95
    :cond_4
    invoke-direct {p2, p0, p1}, La/cii0;-><init>(ILjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p2

    .line 99
    :cond_5
    iget-object p0, v0, La/uc1;->a:La/sc1;

    .line 100
    .line 101
    if-eqz p0, :cond_6

    .line 102
    .line 103
    iget-object v4, p0, La/sc1;->a:Ljava/util/List;

    .line 104
    .line 105
    :cond_6
    if-nez v4, :cond_7

    .line 106
    .line 107
    sget-object p0, La/iun;->a:La/iun;

    .line 108
    .line 109
    return-object p0

    .line 110
    :cond_7
    return-object v4
.end method

.method public d()La/jh70;
    .locals 0

    .line 1
    iget-object p0, p0, La/he1;->a:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vpi;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance p0, La/jh70;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public e(La/bnn0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/he1;->a:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/m4l0;

    .line 8
    .line 9
    iget-object p0, p0, La/m4l0;->a:La/zdg0;

    .line 10
    .line 11
    new-instance v0, La/tri0;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    const/16 v2, 0x9

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v0, v1, v3, v2}, La/tri0;-><init>(ILa/yje;B)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {p1, p0, v0, v1, v2}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
