.class public final La/gjs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(IIIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/gjs;->a:I

    .line 5
    .line 6
    iput p2, p0, La/gjs;->b:I

    .line 7
    .line 8
    iput p3, p0, La/gjs;->c:I

    .line 9
    .line 10
    iput-boolean p4, p0, La/gjs;->d:Z

    .line 11
    .line 12
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
    iget p3, p0, La/gjs;->a:I

    .line 5
    .line 6
    iget p4, p0, La/gjs;->b:I

    .line 7
    .line 8
    invoke-static {p3, p3, p4, p4}, La/p4e;->a(IIII)J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    new-instance v3, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    invoke-direct {v3, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    const/4 v6, 0x0

    .line 26
    move v4, v6

    .line 27
    :goto_0
    const/4 v5, 0x1

    .line 28
    if-ge v4, p3, :cond_0

    .line 29
    .line 30
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/pj30;

    .line 35
    .line 36
    invoke-static/range {v0 .. v5}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    if-eqz p3, :cond_1

    .line 50
    .line 51
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    check-cast p3, La/pu90;

    .line 56
    .line 57
    iget p3, p3, La/pu90;->a:I

    .line 58
    .line 59
    add-int/2addr v6, p3

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    sub-int/2addr p2, v5

    .line 66
    iget p3, p0, La/gjs;->c:I

    .line 67
    .line 68
    mul-int/2addr p2, p3

    .line 69
    add-int/2addr p2, v6

    .line 70
    new-instance v0, La/fjs;

    .line 71
    .line 72
    iget-boolean p0, p0, La/gjs;->d:Z

    .line 73
    .line 74
    invoke-direct {v0, p0, p2, v3, p3}, La/fjs;-><init>(ZILjava/util/ArrayList;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, p2, p4, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
