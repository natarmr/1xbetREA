.class public final La/o7z;
.super La/b7z;
.source "SourceFile"


# instance fields
.field public final synthetic b:La/r7z;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(La/r7z;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o7z;->b:La/r7z;

    .line 2
    .line 3
    iput-object p2, p0, La/o7z;->c:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    invoke-direct {p0, p3}, La/b7z;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 6

    .line 1
    iget-object v2, p0, La/o7z;->b:La/r7z;

    .line 2
    .line 3
    iget-object p2, v2, La/r7z;->h:La/m7z;

    .line 4
    .line 5
    invoke-interface {p1}, La/cnx;->getLayoutDirection()La/k6z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p2, La/m7z;->a:La/k6z;

    .line 10
    .line 11
    invoke-interface {p1}, La/w6k;->getDensity()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p2, La/m7z;->b:F

    .line 16
    .line 17
    invoke-interface {p1}, La/w6k;->v0()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p2, La/m7z;->c:F

    .line 22
    .line 23
    invoke-interface {p1}, La/cnx;->M()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object p0, p0, La/o7z;->c:Lkotlin/jvm/functions/Function2;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    iget-object p1, v2, La/r7z;->a:La/e7z;

    .line 33
    .line 34
    iget-object p1, p1, La/e7z;->i:La/e7z;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iput v0, v2, La/r7z;->e:I

    .line 39
    .line 40
    iget-object p1, v2, La/r7z;->i:La/j7z;

    .line 41
    .line 42
    new-instance p2, La/p4e;

    .line 43
    .line 44
    invoke-direct {p2, p3, p4}, La/p4e;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    move-object v1, p0

    .line 52
    check-cast v1, La/uj30;

    .line 53
    .line 54
    iget v3, v2, La/r7z;->e:I

    .line 55
    .line 56
    new-instance v0, La/n7z;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    move-object v4, v1

    .line 60
    invoke-direct/range {v0 .. v5}, La/n7z;-><init>(La/uj30;La/r7z;ILa/uj30;B)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_0
    iput v0, v2, La/r7z;->d:I

    .line 65
    .line 66
    new-instance p1, La/p4e;

    .line 67
    .line 68
    invoke-direct {p1, p3, p4}, La/p4e;-><init>(J)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p0, p2, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    move-object v1, p0

    .line 76
    check-cast v1, La/uj30;

    .line 77
    .line 78
    iget v3, v2, La/r7z;->d:I

    .line 79
    .line 80
    new-instance v0, La/n7z;

    .line 81
    .line 82
    const/4 v5, 0x1

    .line 83
    move-object v4, v1

    .line 84
    invoke-direct/range {v0 .. v5}, La/n7z;-><init>(La/uj30;La/r7z;ILa/uj30;B)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method
