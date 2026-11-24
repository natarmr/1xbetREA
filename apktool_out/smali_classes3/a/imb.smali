.class public final La/imb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;


# direct methods
.method public constructor <init>(B)V
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object p1, La/iun;->a:La/iun;

    .line 8
    .line 9
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, La/imb;->a:La/p7m0;

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string p1, ""

    .line 20
    .line 21
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, La/imb;->a:La/p7m0;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-array p1, p1, [I

    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    move-result-object p1

    iput-object p1, p0, La/imb;->a:La/p7m0;

    return-void
.end method


# virtual methods
.method public a(La/h5v;La/zje;)V
    .locals 4

    .line 1
    instance-of v0, p2, La/ce60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ce60;

    .line 7
    .line 8
    iget v1, v0, La/ce60;->k:I

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
    iput v1, v0, La/ce60;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ce60;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ce60;-><init>(La/imb;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ce60;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/ce60;->k:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-eq v1, v2, :cond_1

    .line 35
    .line 36
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, La/csj;->b()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput v2, v0, La/ce60;->k:I

    .line 53
    .line 54
    iget-object p0, p0, La/imb;->a:La/p7m0;

    .line 55
    .line 56
    invoke-virtual {p0, p1, v0}, La/p7m0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-void
.end method
