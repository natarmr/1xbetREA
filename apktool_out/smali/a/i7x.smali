.class public final La/i7x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# instance fields
.field public final synthetic a:La/qo8;


# direct methods
.method public constructor <init>(La/qo8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/i7x;->a:La/qo8;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 3

    .line 1
    iget-object p0, p0, La/i7x;->a:La/qo8;

    .line 2
    .line 3
    iget-object p1, p0, La/qo8;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, La/ax2;

    .line 6
    .line 7
    iget-boolean p2, p0, La/qo8;->c:Z

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget p0, p0, La/qo8;->b:I

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x2

    .line 18
    if-ne p0, v0, :cond_2

    .line 19
    .line 20
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    .line 25
    .line 26
    .line 27
    move-result p4

    .line 28
    cmpl-float p0, p0, p4

    .line 29
    .line 30
    if-lez p0, :cond_4

    .line 31
    .line 32
    cmpl-float p0, p3, v1

    .line 33
    .line 34
    if-lez p0, :cond_1

    .line 35
    .line 36
    move v2, v0

    .line 37
    :cond_1
    iget-object p0, p1, La/ax2;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 38
    .line 39
    sget-object p1, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, La/ypq;

    .line 46
    .line 47
    invoke-virtual {p0, v2, p2}, La/ypq;->i(IZ)Z

    .line 48
    .line 49
    .line 50
    return v0

    .line 51
    :cond_2
    if-ne p0, v2, :cond_4

    .line 52
    .line 53
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    cmpl-float p0, p0, p3

    .line 62
    .line 63
    if-lez p0, :cond_4

    .line 64
    .line 65
    cmpl-float p0, p4, v1

    .line 66
    .line 67
    if-lez p0, :cond_3

    .line 68
    .line 69
    move v2, v0

    .line 70
    :cond_3
    iget-object p0, p1, La/ax2;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 71
    .line 72
    sget-object p1, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, La/ypq;

    .line 79
    .line 80
    invoke-virtual {p0, v2, p2}, La/ypq;->i(IZ)Z

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_0
    return v0
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
