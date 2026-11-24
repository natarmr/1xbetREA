.class public final Lorg/xplatform/resident/presentation/views/ResidentSmokeView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic f:I


# instance fields
.field public final a:La/sje;

.field public final b:Landroid/widget/ImageView;

.field public c:Lkotlin/jvm/functions/Function0;

.field public d:Lkotlin/jvm/functions/Function0;

.field public e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xc

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 11
    .line 12
    .line 13
    sget-object p2, La/tvk;->a:La/rwj;

    .line 14
    .line 15
    sget-object p2, La/ys10;->a:La/vs10;

    .line 16
    .line 17
    invoke-static {p2}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iput-object p2, p0, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->a:La/sje;

    .line 22
    .line 23
    new-instance p2, Landroid/widget/ImageView;

    .line 24
    .line 25
    invoke-direct {p2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->b:Landroid/widget/ImageView;

    .line 29
    .line 30
    new-instance p3, La/b4f0;

    .line 31
    .line 32
    const/16 v0, 0x15

    .line 33
    .line 34
    invoke-direct {p3, v0}, La/b4f0;-><init>(B)V

    .line 35
    .line 36
    .line 37
    iput-object p3, p0, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->c:Lkotlin/jvm/functions/Function0;

    .line 38
    .line 39
    new-instance p3, La/b4f0;

    .line 40
    .line 41
    const/16 v0, 0x16

    .line 42
    .line 43
    invoke-direct {p3, v0}, La/b4f0;-><init>(B)V

    .line 44
    .line 45
    .line 46
    iput-object p3, p0, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->d:Lkotlin/jvm/functions/Function0;

    .line 47
    .line 48
    new-instance p3, La/b4f0;

    .line 49
    .line 50
    const/16 v0, 0x17

    .line 51
    .line 52
    invoke-direct {p3, v0}, La/b4f0;-><init>(B)V

    .line 53
    .line 54
    .line 55
    iput-object p3, p0, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->e:Lkotlin/jvm/functions/Function0;

    .line 56
    .line 57
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 58
    .line 59
    .line 60
    const p0, 0x7f080b92

    .line 61
    .line 62
    .line 63
    invoke-static {p0, p1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->a:La/sje;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p0, v0}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setMaxSmokeShowListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->c:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method

.method public final setSmokeFinishedListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->d:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method

.method public final setSmokeStartedListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/resident/presentation/views/ResidentSmokeView;->e:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method
