.class public final La/h6v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/h3v0;

.field public final b:La/scu;

.field public final c:La/ntu;


# direct methods
.method public constructor <init>(La/h3v0;La/scu;La/ntu;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/h6v;->a:La/h3v0;

    .line 8
    .line 9
    iput-object p2, p0, La/h6v;->b:La/scu;

    .line 10
    .line 11
    iput-object p3, p0, La/h6v;->c:La/ntu;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/g6v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/g6v;

    .line 7
    .line 8
    iget v1, v0, La/g6v;->k:I

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
    iput v1, v0, La/g6v;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/g6v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/g6v;-><init>(La/h6v;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/g6v;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/g6v;->k:I

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
    iget-object p1, p0, La/h6v;->c:La/ntu;

    .line 51
    .line 52
    invoke-virtual {p1}, La/ntu;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v2, p0, La/h6v;->a:La/h3v0;

    .line 57
    .line 58
    iget-object v2, v2, La/h3v0;->b:La/s2v0;

    .line 59
    .line 60
    iget-wide v4, v2, La/s2v0;->a:J

    .line 61
    .line 62
    iput v3, v0, La/g6v;->k:I

    .line 63
    .line 64
    iget-object p0, p0, La/h6v;->b:La/scu;

    .line 65
    .line 66
    invoke-virtual {p0, v4, v5, v0, p1}, La/scu;->a(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p1, La/pbv;

    .line 74
    .line 75
    iget-boolean p0, p1, La/pbv;->i:Z

    .line 76
    .line 77
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
