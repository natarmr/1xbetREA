.class public final La/qjg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/gii0;

.field public final b:La/e8g;


# direct methods
.method public constructor <init>(La/gii0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/qjg;->a:La/gii0;

    .line 8
    .line 9
    new-instance p1, La/e8g;

    .line 10
    .line 11
    const/16 v0, 0xa

    .line 12
    .line 13
    invoke-direct {p1, p0, v0}, La/e8g;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/qjg;->b:La/e8g;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;IILjava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p5, La/pjg;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/pjg;

    .line 7
    .line 8
    iget v1, v0, La/pjg;->k:I

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
    iput v1, v0, La/pjg;->k:I

    .line 18
    .line 19
    :goto_0
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/pjg;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, La/pjg;-><init>(La/qjg;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p5, La/pjg;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p5, La/pjg;->k:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/qjg;->b:La/e8g;

    .line 53
    .line 54
    invoke-virtual {p0}, La/e8g;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/sfh;

    .line 59
    .line 60
    iput v3, p5, La/pjg;->k:I

    .line 61
    .line 62
    invoke-interface/range {p0 .. p5}, La/sfh;->a(Ljava/lang/String;IILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-ne v0, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_2
    check-cast v0, La/dx5;

    .line 70
    .line 71
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method
