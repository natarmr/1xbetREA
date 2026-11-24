.class public final La/drf0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/knf0;

.field public final b:La/xqf0;

.field public final c:La/btt0;


# direct methods
.method public constructor <init>(La/knf0;La/xqf0;La/btt0;)V
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
    iput-object p1, p0, La/drf0;->a:La/knf0;

    .line 8
    .line 9
    iput-object p2, p0, La/drf0;->b:La/xqf0;

    .line 10
    .line 11
    iput-object p3, p0, La/drf0;->c:La/btt0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/yqf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/yqf0;

    .line 7
    .line 8
    iget v1, v0, La/yqf0;->l:I

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
    iput v1, v0, La/yqf0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/yqf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/yqf0;-><init>(La/drf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/yqf0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/yqf0;->l:I

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
    iget-object p4, v0, La/yqf0;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p3, p0, La/drf0;->c:La/btt0;

    .line 53
    .line 54
    invoke-virtual {p3}, La/btt0;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    iget-object v2, p0, La/drf0;->a:La/knf0;

    .line 59
    .line 60
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {p1, p2}, La/cs0;->u(J)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance p2, La/dqf0;

    .line 69
    .line 70
    invoke-direct {p2, p1, v2}, La/dqf0;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object p4, v0, La/yqf0;->i:Ljava/lang/String;

    .line 74
    .line 75
    iput v3, v0, La/yqf0;->l:I

    .line 76
    .line 77
    iget-object p0, p0, La/drf0;->b:La/xqf0;

    .line 78
    .line 79
    iget-object p0, p0, La/xqf0;->b:La/tie0;

    .line 80
    .line 81
    invoke-virtual {p0}, La/tie0;->invoke()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/kof0;

    .line 86
    .line 87
    invoke-interface {p0, p3, p2, v0}, La/kof0;->a(Ljava/lang/String;La/dqf0;La/yje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    if-ne p3, v1, :cond_3

    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_3
    :goto_1
    check-cast p3, La/q16;

    .line 95
    .line 96
    invoke-virtual {p3}, La/q16;->a()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, La/grf0;

    .line 101
    .line 102
    invoke-static {p0, p4, v3}, La/ufx;->O(La/grf0;Ljava/lang/String;Z)La/vqf0;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0
.end method

.method public final b(Ljava/lang/String;DLjava/lang/String;La/csr;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p6, La/zqf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/zqf0;

    .line 7
    .line 8
    iget v1, v0, La/zqf0;->l:I

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
    iput v1, v0, La/zqf0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/zqf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, La/zqf0;-><init>(La/drf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, La/zqf0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/zqf0;->l:I

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
    iget-object p1, v0, La/zqf0;->i:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p6, p0, La/drf0;->c:La/btt0;

    .line 53
    .line 54
    invoke-virtual {p6}, La/btt0;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p6

    .line 58
    new-instance v2, Ljava/lang/Double;

    .line 59
    .line 60
    invoke-direct {v2, p2, p3}, Ljava/lang/Double;-><init>(D)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p5, La/csr;->a:La/bsr;

    .line 64
    .line 65
    iget-object p2, p2, La/bsr;->a:La/esr;

    .line 66
    .line 67
    invoke-virtual {p2}, La/esr;->a()Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-nez p2, :cond_3

    .line 72
    .line 73
    move-object v4, v2

    .line 74
    :cond_3
    sget-object p2, La/bg8;->Companion:La/ag8;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {p5}, La/ag8;->a(La/csr;)La/bg8;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iget-object p3, p0, La/drf0;->a:La/knf0;

    .line 84
    .line 85
    invoke-virtual {p3}, La/knf0;->c()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    new-instance p5, La/nqf0;

    .line 90
    .line 91
    invoke-direct {p5, v4, p2, p4, p3}, La/nqf0;-><init>(Ljava/lang/Double;La/bg8;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iput-object p1, v0, La/zqf0;->i:Ljava/lang/String;

    .line 95
    .line 96
    iput v3, v0, La/zqf0;->l:I

    .line 97
    .line 98
    iget-object p0, p0, La/drf0;->b:La/xqf0;

    .line 99
    .line 100
    iget-object p0, p0, La/xqf0;->b:La/tie0;

    .line 101
    .line 102
    invoke-virtual {p0}, La/tie0;->invoke()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, La/kof0;

    .line 107
    .line 108
    invoke-interface {p0, p6, p5, v0}, La/kof0;->d(Ljava/lang/String;La/nqf0;La/yje;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p6

    .line 112
    if-ne p6, v1, :cond_4

    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_4
    :goto_1
    check-cast p6, La/q16;

    .line 116
    .line 117
    invoke-virtual {p6}, La/q16;->a()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, La/grf0;

    .line 122
    .line 123
    const/4 p2, 0x0

    .line 124
    invoke-static {p0, p1, p2}, La/ufx;->O(La/grf0;Ljava/lang/String;Z)La/vqf0;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0
.end method

.method public final c(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, La/arf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/arf0;

    .line 7
    .line 8
    iget v1, v0, La/arf0;->l:I

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
    iput v1, v0, La/arf0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/arf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/arf0;-><init>(La/drf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/arf0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/arf0;->l:I

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
    iget-object p1, v0, La/arf0;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

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
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p5, p0, La/drf0;->c:La/btt0;

    .line 53
    .line 54
    invoke-virtual {p5}, La/btt0;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p5

    .line 58
    new-instance v2, La/sqf0;

    .line 59
    .line 60
    iget-object v4, p0, La/drf0;->a:La/knf0;

    .line 61
    .line 62
    invoke-virtual {v4}, La/knf0;->c()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-direct {v2, p2, p3, v4, p4}, La/sqf0;-><init>(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object p1, v0, La/arf0;->i:Ljava/lang/String;

    .line 70
    .line 71
    iput v3, v0, La/arf0;->l:I

    .line 72
    .line 73
    iget-object p0, p0, La/drf0;->b:La/xqf0;

    .line 74
    .line 75
    iget-object p0, p0, La/xqf0;->b:La/tie0;

    .line 76
    .line 77
    invoke-virtual {p0}, La/tie0;->invoke()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, La/kof0;

    .line 82
    .line 83
    invoke-interface {p0, p5, v2, v0}, La/kof0;->b(Ljava/lang/String;La/sqf0;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p5

    .line 87
    if-ne p5, v1, :cond_3

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_3
    :goto_1
    check-cast p5, La/q16;

    .line 91
    .line 92
    invoke-virtual {p5}, La/q16;->a()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/grf0;

    .line 97
    .line 98
    const/4 p2, 0x0

    .line 99
    invoke-static {p0, p1, p2}, La/ufx;->O(La/grf0;Ljava/lang/String;Z)La/vqf0;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method

.method public final d(DJLa/zje;La/csr;Ljava/lang/String;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, La/brf0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/brf0;

    .line 9
    .line 10
    iget v2, v1, La/brf0;->l:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/brf0;->l:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/brf0;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/brf0;-><init>(La/drf0;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/brf0;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/brf0;->l:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    if-ne v3, v5, :cond_1

    .line 38
    .line 39
    iget-object p0, v1, La/brf0;->i:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

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
    return-object v4

    .line 51
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, La/drf0;->c:La/btt0;

    .line 55
    .line 56
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v3, p0, La/drf0;->a:La/knf0;

    .line 61
    .line 62
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    new-instance v3, Ljava/lang/Double;

    .line 67
    .line 68
    invoke-direct {v3, p1, p2}, Ljava/lang/Double;-><init>(D)V

    .line 69
    .line 70
    .line 71
    move-object/from16 p1, p6

    .line 72
    .line 73
    iget-object p2, p1, La/csr;->a:La/bsr;

    .line 74
    .line 75
    iget-object p2, p2, La/bsr;->a:La/esr;

    .line 76
    .line 77
    invoke-virtual {p2}, La/esr;->a()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-nez p2, :cond_3

    .line 82
    .line 83
    move-object v10, v3

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    move-object v10, v4

    .line 86
    :goto_1
    sget-object p2, La/bg8;->Companion:La/ag8;

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, La/ag8;->a(La/csr;)La/bg8;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    new-instance v6, La/asf0;

    .line 96
    .line 97
    move-wide v7, p3

    .line 98
    invoke-direct/range {v6 .. v11}, La/asf0;-><init>(JLa/bg8;Ljava/lang/Double;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    move-object/from16 p1, p7

    .line 102
    .line 103
    iput-object p1, v1, La/brf0;->i:Ljava/lang/String;

    .line 104
    .line 105
    iput v5, v1, La/brf0;->l:I

    .line 106
    .line 107
    iget-object p0, p0, La/drf0;->b:La/xqf0;

    .line 108
    .line 109
    iget-object p0, p0, La/xqf0;->b:La/tie0;

    .line 110
    .line 111
    invoke-virtual {p0}, La/tie0;->invoke()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, La/kof0;

    .line 116
    .line 117
    invoke-interface {p0, v0, v6, v1}, La/kof0;->e(Ljava/lang/String;La/asf0;La/yje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-ne v0, v2, :cond_4

    .line 122
    .line 123
    return-object v2

    .line 124
    :cond_4
    move-object p0, p1

    .line 125
    :goto_2
    check-cast v0, La/q16;

    .line 126
    .line 127
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, La/grf0;

    .line 132
    .line 133
    const/4 p2, 0x0

    .line 134
    invoke-static {p1, p0, p2}, La/ufx;->O(La/grf0;Ljava/lang/String;Z)La/vqf0;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/crf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/crf0;

    .line 7
    .line 8
    iget v1, v0, La/crf0;->l:I

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
    iput v1, v0, La/crf0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/crf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/crf0;-><init>(La/drf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/crf0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/crf0;->l:I

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
    iget-object p1, v0, La/crf0;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p3, p0, La/drf0;->c:La/btt0;

    .line 53
    .line 54
    invoke-virtual {p3}, La/btt0;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    new-instance v2, La/iqf0;

    .line 59
    .line 60
    iget-object v4, p0, La/drf0;->a:La/knf0;

    .line 61
    .line 62
    invoke-virtual {v4}, La/knf0;->c()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-direct {v2, v4, p2}, La/iqf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object p1, v0, La/crf0;->i:Ljava/lang/String;

    .line 70
    .line 71
    iput v3, v0, La/crf0;->l:I

    .line 72
    .line 73
    iget-object p0, p0, La/drf0;->b:La/xqf0;

    .line 74
    .line 75
    iget-object p0, p0, La/xqf0;->b:La/tie0;

    .line 76
    .line 77
    invoke-virtual {p0}, La/tie0;->invoke()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, La/kof0;

    .line 82
    .line 83
    invoke-interface {p0, p3, v2, v0}, La/kof0;->c(Ljava/lang/String;La/iqf0;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    if-ne p3, v1, :cond_3

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_3
    :goto_1
    check-cast p3, La/q16;

    .line 91
    .line 92
    invoke-virtual {p3}, La/q16;->a()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/grf0;

    .line 97
    .line 98
    const/4 p2, 0x0

    .line 99
    invoke-static {p0, p1, p2}, La/ufx;->O(La/grf0;Ljava/lang/String;Z)La/vqf0;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method
