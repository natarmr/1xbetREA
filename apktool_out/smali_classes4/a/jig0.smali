.class public final La/jig0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/nkg0;

.field public final b:La/pz40;

.field public final c:La/l7m0;

.field public d:La/mkg0;


# direct methods
.method public constructor <init>(La/mkg0;La/nkg0;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/jig0;->a:La/nkg0;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, p1, p2, v0}, La/jig0;->b(La/mkg0;La/hjg0;Z)La/mig0;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p0, La/jig0;->b:La/pz40;

    .line 20
    .line 21
    iput-object p2, p0, La/jig0;->c:La/l7m0;

    .line 22
    .line 23
    iput-object p1, p0, La/jig0;->d:La/mkg0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(La/njg0;La/hjg0;Z)La/mjg0;
    .locals 7

    .line 1
    new-instance v0, La/mjg0;

    .line 2
    .line 3
    iget-object v2, p1, La/njg0;->a:La/n0x;

    .line 4
    .line 5
    iget-object v3, p1, La/njg0;->b:La/n0x;

    .line 6
    .line 7
    iget-object v4, p1, La/njg0;->c:La/n0x;

    .line 8
    .line 9
    iget-object p0, p0, La/jig0;->a:La/nkg0;

    .line 10
    .line 11
    iget-object p0, p0, La/nkg0;->b:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    move-object v6, p0

    .line 18
    check-cast v6, La/gig0;

    .line 19
    .line 20
    move-object v1, p2

    .line 21
    move v5, p3

    .line 22
    invoke-direct/range {v0 .. v6}, La/mjg0;-><init>(La/hjg0;La/n0x;La/n0x;La/n0x;ZLa/gig0;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final b(La/mkg0;La/hjg0;Z)La/mig0;
    .locals 11

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    iget-object p2, p1, La/mkg0;->b:La/zig0;

    .line 4
    .line 5
    sget-object v0, La/xig0;->a:La/xig0;

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    sget-object p2, La/fjg0;->a:La/fjg0;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p2, La/ejg0;->a:La/ejg0;

    .line 17
    .line 18
    :cond_1
    :goto_0
    new-instance v0, La/mig0;

    .line 19
    .line 20
    iget-object v1, p1, La/mkg0;->f:La/njg0;

    .line 21
    .line 22
    iget-object v2, p1, La/mkg0;->b:La/zig0;

    .line 23
    .line 24
    invoke-virtual {p0, v1, p2, p3}, La/jig0;->a(La/njg0;La/hjg0;Z)La/mjg0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v3, p1, La/mkg0;->e:La/njg0;

    .line 29
    .line 30
    invoke-virtual {p0, v3, p2, p3}, La/jig0;->a(La/njg0;La/hjg0;Z)La/mjg0;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v4, p1, La/mkg0;->d:La/njg0;

    .line 35
    .line 36
    invoke-virtual {p0, v4, p2, p3}, La/jig0;->a(La/njg0;La/hjg0;Z)La/mjg0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p2, p1, La/mkg0;->i:La/pjg0;

    .line 41
    .line 42
    new-instance v4, La/ojg0;

    .line 43
    .line 44
    iget-object v5, p2, La/pjg0;->b:La/n0x;

    .line 45
    .line 46
    iget-object p2, p2, La/pjg0;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {v4, v5, p2}, La/ojg0;-><init>(La/n0x;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object p2, p1, La/mkg0;->h:La/pjg0;

    .line 52
    .line 53
    new-instance v5, La/ojg0;

    .line 54
    .line 55
    iget-object v6, p2, La/pjg0;->b:La/n0x;

    .line 56
    .line 57
    iget-object p2, p2, La/pjg0;->c:Ljava/lang/String;

    .line 58
    .line 59
    invoke-direct {v5, v6, p2}, La/ojg0;-><init>(La/n0x;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p1, La/mkg0;->g:La/pjg0;

    .line 63
    .line 64
    new-instance v6, La/ojg0;

    .line 65
    .line 66
    iget-object v7, p2, La/pjg0;->b:La/n0x;

    .line 67
    .line 68
    iget-object p2, p2, La/pjg0;->c:Ljava/lang/String;

    .line 69
    .line 70
    invoke-direct {v6, v7, p2}, La/ojg0;-><init>(La/n0x;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sget-object p2, La/wig0;->a:La/wig0;

    .line 74
    .line 75
    invoke-virtual {v2, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    sget-object p2, La/vig0;->a:La/vig0;

    .line 80
    .line 81
    invoke-virtual {v2, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    iget-object v9, p1, La/mkg0;->j:La/okg0;

    .line 86
    .line 87
    move v10, p3

    .line 88
    move-object v2, v3

    .line 89
    move-object v3, p0

    .line 90
    invoke-direct/range {v0 .. v10}, La/mig0;-><init>(La/mjg0;La/mjg0;La/mjg0;La/ojg0;La/ojg0;La/ojg0;ZZLa/okg0;Z)V

    .line 91
    .line 92
    .line 93
    return-object v0
.end method

.method public final c(La/mkg0;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/hig0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/hig0;

    .line 7
    .line 8
    iget v1, v0, La/hig0;->l:I

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
    iput v1, v0, La/hig0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hig0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/hig0;-><init>(La/jig0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/hig0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hig0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/hig0;->i:La/mkg0;

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, La/jig0;->d:La/mkg0;

    .line 53
    .line 54
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_3

    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    iget-object p2, p1, La/mkg0;->b:La/zig0;

    .line 64
    .line 65
    sget-object v2, La/xig0;->a:La/xig0;

    .line 66
    .line 67
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    iput-object p1, v0, La/hig0;->i:La/mkg0;

    .line 74
    .line 75
    iput v3, v0, La/hig0;->l:I

    .line 76
    .line 77
    invoke-virtual {p0, p1, v0}, La/jig0;->d(La/mkg0;La/zje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-ne p2, v1, :cond_6

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_4
    sget-object v0, La/yig0;->a:La/yig0;

    .line 85
    .line 86
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    const/4 v0, 0x0

    .line 91
    iget-object v1, p0, La/jig0;->b:La/pz40;

    .line 92
    .line 93
    if-eqz p2, :cond_5

    .line 94
    .line 95
    invoke-virtual {p0, p1, v4, v0}, La/jig0;->b(La/mkg0;La/hjg0;Z)La/mig0;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    check-cast v1, La/hgk0;

    .line 100
    .line 101
    invoke-virtual {v1, p2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    invoke-virtual {p0, p1, v4, v0}, La/jig0;->b(La/mkg0;La/hjg0;Z)La/mig0;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast v1, La/hgk0;

    .line 110
    .line 111
    invoke-virtual {v1, p2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_6
    :goto_1
    iput-object p1, p0, La/jig0;->d:La/mkg0;

    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0
.end method

.method public final d(La/mkg0;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/iig0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/iig0;

    .line 7
    .line 8
    iget v1, v0, La/iig0;->l:I

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
    iput v1, v0, La/iig0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/iig0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/iig0;-><init>(La/jig0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/iig0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/iig0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object v4, p0, La/jig0;->b:La/pz40;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v5, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, La/iig0;->i:La/mkg0;

    .line 40
    .line 41
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object p2, La/gjg0;->a:La/gjg0;

    .line 56
    .line 57
    invoke-virtual {p0, p1, p2, v3}, La/jig0;->b(La/mkg0;La/hjg0;Z)La/mig0;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v6, v4

    .line 62
    check-cast v6, La/hgk0;

    .line 63
    .line 64
    invoke-virtual {v6, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, p0, La/jig0;->a:La/nkg0;

    .line 68
    .line 69
    iget-object v2, v2, La/nkg0;->b:Ljava/util/Map;

    .line 70
    .line 71
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p2, La/gig0;

    .line 76
    .line 77
    if-eqz p2, :cond_3

    .line 78
    .line 79
    iget-short p2, p2, La/gig0;->b:S

    .line 80
    .line 81
    int-to-long v6, p2

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const-wide/16 v6, 0x0

    .line 84
    .line 85
    :goto_1
    iput-object p1, v0, La/iig0;->i:La/mkg0;

    .line 86
    .line 87
    iput v5, v0, La/iig0;->l:I

    .line 88
    .line 89
    invoke-static {v6, v7, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    if-ne p2, v1, :cond_4

    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_4
    :goto_2
    sget-object p2, La/fjg0;->a:La/fjg0;

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2, v3}, La/jig0;->b(La/mkg0;La/hjg0;Z)La/mig0;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast v4, La/hgk0;

    .line 103
    .line 104
    invoke-virtual {v4, p0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0
.end method
