.class public final synthetic La/wly;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wly;->a:B

    iput-object p1, p0, La/wly;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onWindowFocusChanged(Z)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/wly;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wly;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroid/view/View;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    instance-of v0, p1, La/vjk;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p1, La/vjk;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object p1, v1

    .line 26
    :goto_0
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, La/vjk;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_2
    const/16 p1, 0x1d

    .line 33
    .line 34
    const/high16 v0, -0x80000000

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    sget-object v3, La/hxv0;->a:Ljava/util/WeakHashMap;

    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, La/gxv0;

    .line 46
    .line 47
    if-nez v3, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    iget-boolean v3, v3, La/gxv0;->d:Z

    .line 51
    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 55
    .line 56
    .line 57
    :cond_4
    invoke-virtual {v1, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 61
    .line 62
    .line 63
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    .line 65
    if-lt v3, p1, :cond_5

    .line 66
    .line 67
    invoke-static {v1}, La/y5a;->r(Landroid/view/Window;)V

    .line 68
    .line 69
    .line 70
    :cond_5
    :goto_1
    invoke-static {p0}, La/etm0;->l(Landroid/view/View;)Landroid/view/Window;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-eqz p0, :cond_8

    .line 75
    .line 76
    sget-object v1, La/hxv0;->a:Ljava/util/WeakHashMap;

    .line 77
    .line 78
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, La/gxv0;

    .line 83
    .line 84
    if-nez v1, :cond_6

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_6
    iget-boolean v1, v1, La/gxv0;->d:Z

    .line 88
    .line 89
    if-eqz v1, :cond_7

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 92
    .line 93
    .line 94
    :cond_7
    invoke-virtual {p0, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v2}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 98
    .line 99
    .line 100
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 101
    .line 102
    if-lt v0, p1, :cond_8

    .line 103
    .line 104
    invoke-static {p0}, La/y5a;->r(Landroid/view/Window;)V

    .line 105
    .line 106
    .line 107
    :cond_8
    :goto_2
    return-void

    .line 108
    :pswitch_0
    check-cast p0, La/zly;

    .line 109
    .line 110
    invoke-virtual {p0}, La/zly;->a1()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
