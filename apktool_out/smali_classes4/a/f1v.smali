.class public final La/f1v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/w5z;

.field public final b:La/uzc;

.field public final c:La/b3c0;

.field public final d:La/gst0;

.field public final e:La/v7i;


# direct methods
.method public constructor <init>(La/uzc;La/uqe;La/v7i;La/w5z;La/b3c0;La/gst0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p4, p0, La/f1v;->a:La/w5z;

    .line 14
    .line 15
    iput-object p1, p0, La/f1v;->b:La/uzc;

    .line 16
    .line 17
    iput-object p5, p0, La/f1v;->c:La/b3c0;

    .line 18
    .line 19
    iput-object p6, p0, La/f1v;->d:La/gst0;

    .line 20
    .line 21
    iput-object p3, p0, La/f1v;->e:La/v7i;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/a1v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/a1v;

    .line 7
    .line 8
    iget v1, v0, La/a1v;->k:I

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
    iput v1, v0, La/a1v;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/a1v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/a1v;-><init>(La/f1v;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/a1v;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/a1v;->k:I

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
    iget-object p1, p0, La/f1v;->d:La/gst0;

    .line 51
    .line 52
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    const/4 v2, 0x0

    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    iput v3, v0, La/a1v;->k:I

    .line 60
    .line 61
    iget-object p0, p0, La/f1v;->c:La/b3c0;

    .line 62
    .line 63
    invoke-virtual {p0, v2, v0}, La/b3c0;->a(ZLa/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p1, La/m2c0;

    .line 71
    .line 72
    iget-object p0, p1, La/m2c0;->c:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_4

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    const/16 v2, 0xe1

    .line 86
    .line 87
    :cond_5
    :goto_2
    new-instance p0, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-direct {p0, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 90
    .line 91
    .line 92
    return-object p0
.end method
