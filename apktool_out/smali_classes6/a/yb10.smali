.class public final La/yb10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/uikit/components/lottie/LottieView;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/uikit/components/lottie/LottieView;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yb10;->a:B

    iput-object p1, p0, La/yb10;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-byte p2, p0, La/yb10;->a:B

    .line 2
    .line 3
    iget-object p3, p0, La/yb10;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch p2, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 12
    .line 13
    .line 14
    sget p0, Lorg/xplatform/uikit/components/lottie/LottieView;->o1:I

    .line 15
    .line 16
    invoke-virtual {p3}, Lorg/xplatform/uikit/components/lottie/LottieView;->E()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 21
    .line 22
    .line 23
    sget p0, Lorg/xplatform/uikit/components/lottie/LottieView;->o1:I

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    invoke-virtual {p3, p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->C(Z)V

    .line 27
    .line 28
    .line 29
    invoke-static {p3}, Lorg/xplatform/uikit/components/lottie/LottieView;->u(Lorg/xplatform/uikit/components/lottie/LottieView;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    iget p1, p3, Lorg/xplatform/uikit/components/lottie/LottieView;->v:I

    .line 34
    .line 35
    if-ge p0, p1, :cond_0

    .line 36
    .line 37
    move p0, p1

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    invoke-virtual {p3, p0, p1}, Lorg/xplatform/uikit/components/lottie/LottieView;->D(IZ)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 44
    .line 45
    .line 46
    sget p0, Lorg/xplatform/uikit/components/lottie/LottieView;->o1:I

    .line 47
    .line 48
    invoke-virtual {p3}, Lorg/xplatform/uikit/components/lottie/LottieView;->E()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
