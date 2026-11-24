.class public final La/k3d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:La/nyq0;

.field public final synthetic b:La/agk0;

.field public final synthetic c:La/agk0;


# direct methods
.method public constructor <init>(La/nyq0;La/agk0;La/agk0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/k3d;->a:La/nyq0;

    .line 5
    .line 6
    iput-object p2, p0, La/k3d;->b:La/agk0;

    .line 7
    .line 8
    iput-object p3, p0, La/k3d;->c:La/agk0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    check-cast p2, La/pj30;

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const/16 v6, 0xe

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-wide v0, p3

    .line 19
    invoke-static/range {v0 .. v6}, La/p4e;->b(JIIIII)J

    .line 20
    .line 21
    .line 22
    move-result-wide p3

    .line 23
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-wide v0, p3

    .line 29
    const/4 p2, 0x0

    .line 30
    :goto_0
    const/4 p3, 0x0

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    iget p4, p2, La/pu90;->b:I

    .line 34
    .line 35
    int-to-float p4, p4

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move p4, p3

    .line 38
    :goto_1
    const/high16 v2, -0x40800000    # -1.0f

    .line 39
    .line 40
    mul-float/2addr p4, v2

    .line 41
    iget-object v2, p0, La/k3d;->b:La/agk0;

    .line 42
    .line 43
    invoke-virtual {v2, p4}, La/agk0;->m(F)V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, La/k3d;->a:La/nyq0;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-interface {v2}, La/nyq0;->getState()La/oyq0;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget-object v2, v2, La/oyq0;->c:La/agk0;

    .line 57
    .line 58
    invoke-virtual {v2}, La/agk0;->l()F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move v2, p3

    .line 64
    :goto_2
    cmpg-float v3, p4, p3

    .line 65
    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    move p4, p3

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    div-float p4, v2, p4

    .line 71
    .line 72
    const/high16 v3, 0x3f800000    # 1.0f

    .line 73
    .line 74
    invoke-static {p4, p3, v3}, La/l1e0;->c(FFF)F

    .line 75
    .line 76
    .line 77
    move-result p4

    .line 78
    :goto_3
    iget-object p0, p0, La/k3d;->c:La/agk0;

    .line 79
    .line 80
    invoke-virtual {p0, p4}, La/agk0;->m(F)V

    .line 81
    .line 82
    .line 83
    if-eqz p2, :cond_4

    .line 84
    .line 85
    iget p0, p2, La/pu90;->b:I

    .line 86
    .line 87
    int-to-float p3, p0

    .line 88
    :cond_4
    add-float/2addr p3, v2

    .line 89
    invoke-static {p3}, La/si30;->b(F)I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    const/4 p3, 0x0

    .line 94
    if-gez p0, :cond_5

    .line 95
    .line 96
    move p0, p3

    .line 97
    :cond_5
    invoke-static {v0, v1}, La/p4e;->i(J)I

    .line 98
    .line 99
    .line 100
    move-result p4

    .line 101
    new-instance v0, La/j3d;

    .line 102
    .line 103
    invoke-direct {v0, p2, v2, p3}, La/j3d;-><init>(La/pu90;FB)V

    .line 104
    .line 105
    .line 106
    invoke-static {p1, p4, p0, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
.end method
