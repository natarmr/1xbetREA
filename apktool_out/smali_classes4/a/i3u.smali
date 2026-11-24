.class public final La/i3u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/g3u;


# instance fields
.field public final a:La/img;

.field public final b:La/sjl0;


# direct methods
.method public constructor <init>(La/img;La/sjl0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/i3u;->a:La/img;

    .line 8
    .line 9
    iput-object p2, p0, La/i3u;->b:La/sjl0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;)Ljava/io/Serializable;
    .locals 6

    .line 1
    instance-of v0, p2, La/h3u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/h3u;

    .line 7
    .line 8
    iget v1, v0, La/h3u;->m:I

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
    iput v1, v0, La/h3u;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/h3u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/h3u;-><init>(La/i3u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/h3u;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/h3u;->m:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, La/h3u;->j:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    iget p1, v0, La/h3u;->i:I

    .line 53
    .line 54
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput p1, v0, La/h3u;->i:I

    .line 62
    .line 63
    iput v4, v0, La/h3u;->m:I

    .line 64
    .line 65
    iget-object p2, p0, La/i3u;->b:La/sjl0;

    .line 66
    .line 67
    invoke-virtual {p2, v0}, La/sjl0;->b(La/zje;)Ljava/io/Serializable;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-ne p2, v1, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 75
    .line 76
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 77
    .line 78
    iput-object p2, v0, La/h3u;->j:Ljava/util/List;

    .line 79
    .line 80
    iput p1, v0, La/h3u;->i:I

    .line 81
    .line 82
    iput v3, v0, La/h3u;->m:I

    .line 83
    .line 84
    iget-object p0, p0, La/i3u;->a:La/img;

    .line 85
    .line 86
    invoke-virtual {p0, v2, p1, v4, v0}, La/img;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;IZLa/zje;)Ljava/io/Serializable;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-ne p0, v1, :cond_5

    .line 91
    .line 92
    :goto_2
    return-object v1

    .line 93
    :cond_5
    move-object v5, p2

    .line 94
    move-object p2, p0

    .line 95
    move-object p0, v5

    .line 96
    :goto_3
    check-cast p2, Ljava/util/List;

    .line 97
    .line 98
    invoke-static {p2, p0}, La/q8a;->K(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method
