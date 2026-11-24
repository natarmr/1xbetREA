.class public final La/p7h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kzw;


# instance fields
.field public a:F

.field public b:Landroid/animation/ValueAnimator;

.field public final synthetic c:La/q7h0;


# direct methods
.method public constructor <init>(La/q7h0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p7h0;->c:La/q7h0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(JLa/lzw;)V
    .locals 3

    .line 1
    const-string p1, "ScreenFlash#apply"

    .line 2
    .line 3
    const-string p2, "ScreenFlashView"

    .line 4
    .line 5
    invoke-static {p2, p1}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, La/p7h0;->c:La/q7h0;

    .line 9
    .line 10
    invoke-static {p1}, La/q7h0;->a(La/q7h0;)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, La/p7h0;->a:F

    .line 15
    .line 16
    const/high16 v0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    invoke-static {p1, v0}, La/q7h0;->b(La/q7h0;F)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, La/p7h0;->b:Landroid/animation/ValueAnimator;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 26
    .line 27
    .line 28
    :cond_0
    new-instance v0, La/wss;

    .line 29
    .line 30
    const/16 v1, 0x1c

    .line 31
    .line 32
    invoke-direct {v0, p3, v1}, La/wss;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    const-string p3, "animateToFullOpacity"

    .line 36
    .line 37
    invoke-static {p2, p3}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p2, 0x2

    .line 41
    new-array p2, p2, [F

    .line 42
    .line 43
    fill-array-data p2, :array_0

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p1}, La/q7h0;->getVisibilityRampUpAnimationDurationMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    invoke-virtual {p2, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 55
    .line 56
    .line 57
    new-instance p3, La/fd5;

    .line 58
    .line 59
    const/16 v1, 0x17

    .line 60
    .line 61
    invoke-direct {p3, p1, v1}, La/fd5;-><init>(Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 65
    .line 66
    .line 67
    new-instance p1, La/r9g;

    .line 68
    .line 69
    const/16 p3, 0xa

    .line 70
    .line 71
    invoke-direct {p1, v0, p3}, La/r9g;-><init>(Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->start()V

    .line 78
    .line 79
    .line 80
    iput-object p2, p0, La/p7h0;->b:Landroid/animation/ValueAnimator;

    .line 81
    .line 82
    return-void

    .line 83
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final clear()V
    .locals 2

    .line 1
    const-string v0, "ScreenFlashView"

    .line 2
    .line 3
    const-string v1, "ScreenFlash#clear"

    .line 4
    .line 5
    invoke-static {v0, v1}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/p7h0;->b:Landroid/animation/ValueAnimator;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, La/p7h0;->b:Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    iget-object v1, p0, La/p7h0;->c:La/q7h0;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 22
    .line 23
    .line 24
    iget p0, p0, La/p7h0;->a:F

    .line 25
    .line 26
    invoke-static {v1, p0}, La/q7h0;->b(La/q7h0;F)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
