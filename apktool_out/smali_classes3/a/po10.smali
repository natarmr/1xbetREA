.class public final La/po10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/po10;->a:B

    iput-object p1, p0, La/po10;->b:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final f(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/po10;->a:B

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/po10;->a:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/po10;->b:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;

    .line 7
    .line 8
    iget-object p0, p0, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->q:La/uk5;

    .line 9
    .line 10
    iget-object p0, p0, La/uk5;->d:Landroid/view/View;

    .line 11
    .line 12
    const/4 p1, 0x4

    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    :pswitch_0
    return-void

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/po10;->a:B

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/po10;->a:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, La/po10;->b:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;

    .line 8
    .line 9
    iget-object p0, p0, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->q:La/uk5;

    .line 10
    .line 11
    iget-object p0, p0, La/uk5;->d:Landroid/view/View;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
