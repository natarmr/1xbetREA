.class public final synthetic La/nwc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qwc0;


# direct methods
.method public synthetic constructor <init>(La/qwc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nwc0;->a:B

    iput-object p1, p0, La/nwc0;->b:La/qwc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nwc0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/nwc0;->b:La/qwc0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/qwc0;->Z1:La/rl70;

    .line 10
    .line 11
    invoke-virtual {p0}, La/qwc0;->J0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/ewc0;->a:La/ewc0;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    iget-object v0, p0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :cond_0
    iput-object v1, p0, La/qwc0;->S1:Ljava/lang/Integer;

    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_1
    sget-object v0, La/qwc0;->Z1:La/rl70;

    .line 47
    .line 48
    invoke-virtual {p0}, La/qwc0;->J0()La/k3t0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object v0, La/dwc0;->a:La/dwc0;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_2
    sget-object v0, La/qwc0;->Z1:La/rl70;

    .line 61
    .line 62
    invoke-virtual {p0}, La/qwc0;->J0()La/k3t0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, La/jwc0;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-direct {v1, p0}, La/jwc0;-><init>(Ljava/io/File;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_3
    sget-object v0, La/qwc0;->Z1:La/rl70;

    .line 89
    .line 90
    iget-object p0, p0, La/qwc0;->L1:La/fiu0;

    .line 91
    .line 92
    if-eqz p0, :cond_1

    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_1
    const-string p0, "viewModelFactory"

    .line 96
    .line 97
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v1

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
