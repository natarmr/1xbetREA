.class public final La/yb3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ub3;


# instance fields
.field public a:Lkotlin/jvm/functions/Function0;

.field public b:Lkotlin/jvm/functions/Function0;

.field public c:Lkotlin/jvm/functions/Function0;

.field public d:Lkotlin/jvm/functions/Function0;

.field public e:Lkotlin/jvm/functions/Function1;

.field public f:La/xb3;

.field public g:I


# virtual methods
.method public final a(Lcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 2

    .line 1
    iget-object v0, p0, La/yb3;->e:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, La/yb3;->f:La/xb3;

    .line 13
    .line 14
    sget-object v0, La/xb3;->a:La/xb3;

    .line 15
    .line 16
    if-eq p1, v0, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, La/yb3;->a:Lkotlin/jvm/functions/Function0;

    .line 19
    .line 20
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    iput p2, p0, La/yb3;->g:I

    .line 24
    .line 25
    iput-object v0, p0, La/yb3;->f:La/xb3;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-lt v0, p1, :cond_3

    .line 37
    .line 38
    iget-object p1, p0, La/yb3;->f:La/xb3;

    .line 39
    .line 40
    sget-object v0, La/xb3;->b:La/xb3;

    .line 41
    .line 42
    if-eq p1, v0, :cond_2

    .line 43
    .line 44
    iget-object p1, p0, La/yb3;->b:Lkotlin/jvm/functions/Function0;

    .line 45
    .line 46
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_2
    iput p2, p0, La/yb3;->g:I

    .line 50
    .line 51
    iput-object v0, p0, La/yb3;->f:La/xb3;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    iget p1, p0, La/yb3;->g:I

    .line 55
    .line 56
    if-le p1, p2, :cond_4

    .line 57
    .line 58
    sget-object p1, La/xb3;->c:La/xb3;

    .line 59
    .line 60
    iput-object p1, p0, La/yb3;->f:La/xb3;

    .line 61
    .line 62
    iget-object p1, p0, La/yb3;->c:Lkotlin/jvm/functions/Function0;

    .line 63
    .line 64
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    sget-object p1, La/xb3;->d:La/xb3;

    .line 69
    .line 70
    iput-object p1, p0, La/yb3;->f:La/xb3;

    .line 71
    .line 72
    iget-object p1, p0, La/yb3;->d:Lkotlin/jvm/functions/Function0;

    .line 73
    .line 74
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :goto_0
    iput p2, p0, La/yb3;->g:I

    .line 78
    .line 79
    return-void
.end method
