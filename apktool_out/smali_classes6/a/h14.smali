.class public final synthetic La/h14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h14;->a:B

    iput-object p1, p0, La/h14;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 8

    .line 1
    iget-byte v0, p0, La/h14;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/h14;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 10
    .line 11
    iget-object v0, p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->c:Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-boolean v2, p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->b:Z

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    iput-boolean v0, p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->b:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->a()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p0, p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->a:La/wqm;

    .line 30
    .line 31
    iget-object p0, p0, La/wqm;->c:Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return v1

    .line 37
    :pswitch_0
    check-cast p0, La/k14;

    .line 38
    .line 39
    iget-object v0, p0, La/k14;->i:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    move-object v3, v0

    .line 46
    check-cast v3, Landroid/view/View;

    .line 47
    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    iget-object v2, p0, La/k14;->a:Landroid/view/View;

    .line 51
    .line 52
    iget-object v0, p0, La/k14;->h:Ljava/lang/ref/WeakReference;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v4, v0

    .line 59
    check-cast v4, Landroid/view/View;

    .line 60
    .line 61
    iget v5, p0, La/k14;->b:I

    .line 62
    .line 63
    iget v6, p0, La/k14;->c:I

    .line 64
    .line 65
    iget v7, p0, La/k14;->d:I

    .line 66
    .line 67
    invoke-static/range {v2 .. v7}, La/gq80;->l0(Landroid/view/View;Landroid/view/View;Landroid/view/View;III)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return v1

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
