.class public final La/kt20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/kt20;->a:F

    .line 5
    .line 6
    iput p2, p0, La/kt20;->b:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget v3, v0, La/kt20;->a:F

    .line 11
    .line 12
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    iget v0, v0, La/kt20;->b:F

    .line 17
    .line 18
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    int-to-float v3, v9

    .line 27
    const v4, 0x3f19999a    # 0.6f

    .line 28
    .line 29
    .line 30
    mul-float/2addr v3, v4

    .line 31
    float-to-int v3, v3

    .line 32
    sub-int/2addr v3, v6

    .line 33
    const/4 v4, 0x0

    .line 34
    if-gez v3, :cond_0

    .line 35
    .line 36
    move v13, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v13, v3

    .line 39
    :goto_0
    const/4 v3, 0x1

    .line 40
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, La/pj30;

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    const/4 v15, 0x0

    .line 50
    const/16 v16, 0xd

    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    const/4 v14, 0x0

    .line 54
    move-wide/from16 v10, p3

    .line 55
    .line 56
    invoke-static/range {v10 .. v16}, La/p4e;->b(JIIIII)J

    .line 57
    .line 58
    .line 59
    move-result-wide v7

    .line 60
    invoke-interface {v3, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    move-object v8, v3

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move-object v8, v5

    .line 67
    :goto_1
    if-eqz v8, :cond_2

    .line 68
    .line 69
    iget v3, v8, La/pu90;->a:I

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move v3, v4

    .line 73
    :goto_2
    sub-int v3, v9, v3

    .line 74
    .line 75
    mul-int/lit8 v7, v6, 0x2

    .line 76
    .line 77
    sub-int/2addr v3, v7

    .line 78
    sub-int/2addr v3, v0

    .line 79
    if-gez v3, :cond_3

    .line 80
    .line 81
    move v13, v4

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    move v13, v3

    .line 84
    :goto_3
    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, La/pj30;

    .line 89
    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    const/4 v15, 0x0

    .line 93
    const/16 v16, 0xd

    .line 94
    .line 95
    const/4 v12, 0x0

    .line 96
    const/4 v14, 0x0

    .line 97
    move-wide/from16 v10, p3

    .line 98
    .line 99
    invoke-static/range {v10 .. v16}, La/p4e;->b(JIIIII)J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-interface {v0, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    :cond_4
    if-eqz v5, :cond_5

    .line 108
    .line 109
    iget v0, v5, La/pu90;->b:I

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    move v0, v4

    .line 113
    :goto_4
    if-eqz v8, :cond_6

    .line 114
    .line 115
    iget v4, v8, La/pu90;->b:I

    .line 116
    .line 117
    :cond_6
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    new-instance v4, La/lw7;

    .line 122
    .line 123
    const/4 v10, 0x5

    .line 124
    invoke-direct/range {v4 .. v10}, La/lw7;-><init>(La/pu90;IILa/pu90;IB)V

    .line 125
    .line 126
    .line 127
    invoke-static {v1, v9, v7, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0
.end method
