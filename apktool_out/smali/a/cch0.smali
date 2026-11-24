.class public final La/cch0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rah0;

.field public final b:La/vne;

.field public final c:La/nul0;

.field public d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(La/rah0;La/vne;La/nul0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/cch0;->a:La/rah0;

    .line 5
    .line 6
    iput-object p2, p0, La/cch0;->b:La/vne;

    .line 7
    .line 8
    iput-object p3, p0, La/cch0;->c:La/nul0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La/w6k;ILjava/util/ArrayList;I)V
    .locals 3

    .line 1
    iget-object v0, p0, La/cch0;->d:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eq v0, p4, :cond_2

    .line 11
    .line 12
    :goto_0
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/cch0;->d:Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-static {p4, p3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    check-cast p4, La/ado0;

    .line 23
    .line 24
    if-eqz p4, :cond_2

    .line 25
    .line 26
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    check-cast p3, La/ado0;

    .line 31
    .line 32
    iget v0, p3, La/ado0;->a:F

    .line 33
    .line 34
    iget p3, p3, La/ado0;->b:F

    .line 35
    .line 36
    add-float/2addr v0, p3

    .line 37
    invoke-interface {p1, v0}, La/w6k;->T(F)I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    add-int/2addr p3, p2

    .line 42
    iget-object p2, p0, La/cch0;->a:La/rah0;

    .line 43
    .line 44
    iget-object v0, p2, La/rah0;->f:La/cgk0;

    .line 45
    .line 46
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    sub-int v0, p3, v0

    .line 51
    .line 52
    iget v1, p4, La/ado0;->a:F

    .line 53
    .line 54
    invoke-interface {p1, v1}, La/w6k;->T(F)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    div-int/lit8 v2, v0, 0x2

    .line 59
    .line 60
    iget p4, p4, La/ado0;->b:F

    .line 61
    .line 62
    invoke-interface {p1, p4}, La/w6k;->T(F)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    div-int/lit8 p1, p1, 0x2

    .line 67
    .line 68
    sub-int/2addr v2, p1

    .line 69
    sub-int/2addr v1, v2

    .line 70
    sub-int/2addr p3, v0

    .line 71
    const/4 p1, 0x0

    .line 72
    if-gez p3, :cond_1

    .line 73
    .line 74
    move p3, p1

    .line 75
    :cond_1
    invoke-static {v1, p1, p3}, La/l1e0;->d(III)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iget-object p2, p2, La/rah0;->a:La/cgk0;

    .line 80
    .line 81
    invoke-virtual {p2}, La/cgk0;->l()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eq p2, p1, :cond_2

    .line 86
    .line 87
    new-instance p2, La/u52;

    .line 88
    .line 89
    const/16 p3, 0x16

    .line 90
    .line 91
    const/4 p4, 0x0

    .line 92
    invoke-direct {p2, p0, p1, p4, p3}, La/u52;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 93
    .line 94
    .line 95
    const/4 p1, 0x3

    .line 96
    iget-object p0, p0, La/cch0;->b:La/vne;

    .line 97
    .line 98
    invoke-static {p0, p4, p4, p2, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void
.end method
