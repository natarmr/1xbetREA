.class public final La/i14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;La/k14;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/i14;->a:B

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, La/i14;->b:Landroid/view/View;

    iput-object p2, p0, La/i14;->c:Ljava/lang/Object;

    iput-object p3, p0, La/i14;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 14
    iput-byte p4, p0, La/i14;->a:B

    iput-object p1, p0, La/i14;->b:Landroid/view/View;

    iput-object p2, p0, La/i14;->d:Ljava/lang/Object;

    iput-object p3, p0, La/i14;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;La/k14;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/i14;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/i14;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/i14;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/i14;->b:Landroid/view/View;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 10

    .line 1
    iget-byte v0, p0, La/i14;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/i14;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/i14;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/i14;->b:Landroid/view/View;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 20
    .line 21
    .line 22
    check-cast v2, Landroidx/viewpager2/widget/ViewPager2;

    .line 23
    .line 24
    check-cast v1, La/bus;

    .line 25
    .line 26
    iget p0, v1, La/bus;->a:I

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-virtual {v2, p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_2
    check-cast v1, La/k14;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/view/View;

    .line 52
    .line 53
    move-object v6, v0

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object v6, p1

    .line 56
    :goto_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    invoke-direct {v0, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, v1, La/k14;->h:Ljava/lang/ref/WeakReference;

    .line 62
    .line 63
    iget-object v4, v1, La/k14;->a:Landroid/view/View;

    .line 64
    .line 65
    iget v7, v1, La/k14;->b:I

    .line 66
    .line 67
    iget v8, v1, La/k14;->c:I

    .line 68
    .line 69
    iget v9, v1, La/k14;->d:I

    .line 70
    .line 71
    iget-object v5, p0, La/i14;->b:Landroid/view/View;

    .line 72
    .line 73
    invoke-static/range {v4 .. v9}, La/gq80;->b0(Landroid/view/View;Landroid/view/View;Landroid/view/View;III)V

    .line 74
    .line 75
    .line 76
    iget-object p0, v1, La/k14;->g:Ljava/lang/Integer;

    .line 77
    .line 78
    if-eqz p0, :cond_1

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-virtual {v1, p0}, La/k14;->e(I)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    instance-of v0, p0, Landroid/view/View;

    .line 93
    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    move-object p1, p0

    .line 97
    check-cast p1, Landroid/view/View;

    .line 98
    .line 99
    :cond_2
    invoke-virtual {v1, p1, v6}, La/k14;->f(Landroid/view/View;Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    :goto_1
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    iget-object p1, v1, La/k14;->k:La/h14;

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Landroid/view/View;->isAttachedToWindow()Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-nez p0, :cond_3

    .line 116
    .line 117
    invoke-virtual {v1, v3}, La/k14;->c(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    new-instance p0, La/i14;

    .line 122
    .line 123
    invoke-direct {p0, v3, v1, v3}, La/i14;-><init>(Landroid/view/View;La/k14;Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 127
    .line 128
    .line 129
    :goto_2
    return-void

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/i14;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/i14;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/i14;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/i14;->b:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 16
    .line 17
    .line 18
    check-cast v2, La/hxf0;

    .line 19
    .line 20
    sget-object p0, La/hxf0;->V1:La/zie0;

    .line 21
    .line 22
    invoke-virtual {v2}, La/hxf0;->G0()La/h4r;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object p0, p0, La/h4r;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 27
    .line 28
    check-cast v1, La/da0;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->c(Landroid/text/TextWatcher;)V

    .line 31
    .line 32
    .line 33
    :pswitch_0
    return-void

    .line 34
    :pswitch_1
    invoke-virtual {v3, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 35
    .line 36
    .line 37
    check-cast v1, La/k14;

    .line 38
    .line 39
    check-cast v2, Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, La/k14;->c(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    :pswitch_2
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
