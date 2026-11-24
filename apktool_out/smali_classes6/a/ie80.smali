.class public final synthetic La/ie80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/e3y;


# direct methods
.method public synthetic constructor <init>(La/e3y;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ie80;->a:B

    iput-object p1, p0, La/ie80;->b:La/e3y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/ie80;->a:B

    .line 2
    .line 3
    const v1, 0x7f040b0b

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/ie80;->b:La/e3y;

    .line 7
    .line 8
    check-cast p1, Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1, v0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->B(II)V

    .line 39
    .line 40
    .line 41
    check-cast p0, La/c3y;

    .line 42
    .line 43
    iget-object p0, p0, La/c3y;->a:La/ra10;

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->w(La/ra10;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    check-cast p0, La/b3y;

    .line 55
    .line 56
    iget-object p0, p0, La/b3y;->a:La/ra10;

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v1, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const v1, 0x7f040b03

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {p1, p0, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->B(II)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
