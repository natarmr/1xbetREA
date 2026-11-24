.class public final La/niy;
.super La/miy;
.source "SourceFile"

# interfaces
.implements La/jys0;
.implements La/jzs0;


# instance fields
.field public final c:La/oiy;

.field public final d:Ljava/lang/String;

.field public final e:La/uiy;

.field public final f:La/hzs0;

.field public volatile g:Ljava/util/List;


# direct methods
.method public constructor <init>(La/hzs0;La/oiy;Ljava/lang/String;La/uiy;)V
    .locals 0

    .line 102
    invoke-direct {p0, p2}, La/miy;-><init>(La/oiy;)V

    .line 103
    iput-object p2, p0, La/niy;->c:La/oiy;

    .line 104
    iput-object p3, p0, La/niy;->d:Ljava/lang/String;

    .line 105
    iput-object p4, p0, La/niy;->e:La/uiy;

    .line 106
    iput-object p1, p0, La/niy;->f:La/hzs0;

    return-void
.end method

.method public constructor <init>(La/oiy;La/hzs0;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, La/vjj;->getName()La/g950;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, La/g950;->b()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, La/hzs0;->t()La/t3u0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-eq v1, v3, :cond_1

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    if-ne v1, v3, :cond_0

    .line 37
    .line 38
    sget-object v1, La/uiy;->c:La/uiy;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 42
    .line 43
    .line 44
    throw v2

    .line 45
    :cond_1
    sget-object v1, La/uiy;->b:La/uiy;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    sget-object v1, La/uiy;->a:La/uiy;

    .line 49
    .line 50
    :goto_0
    invoke-interface {p2}, La/hzs0;->q()Z

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p2, p1, v0, v1}, La/niy;-><init>(La/hzs0;La/oiy;Ljava/lang/String;La/uiy;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p2}, La/hzs0;->getUpperBounds()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance p2, Ljava/util/ArrayList;

    .line 64
    .line 65
    const/16 v0, 0xa

    .line 66
    .line 67
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, La/wsy;

    .line 89
    .line 90
    new-instance v1, La/wdk;

    .line 91
    .line 92
    invoke-direct {v1, v0, v2}, La/wdk;-><init>(La/wsy;Lkotlin/jvm/functions/Function0;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    iput-object p2, p0, La/niy;->g:Ljava/util/List;

    .line 100
    .line 101
    return-void
.end method


# virtual methods
.method public final getUpperBounds()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/niy;->g:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "upperBounds"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method
