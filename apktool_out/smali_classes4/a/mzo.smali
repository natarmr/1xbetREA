.class public final La/mzo;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yx5;


# direct methods
.method public synthetic constructor <init>(La/yx5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mzo;->a:B

    iput-object p1, p0, La/mzo;->b:La/yx5;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/mzo;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequest(Landroid/webkit/PermissionRequest;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, La/mzo;->b:La/yx5;

    .line 11
    .line 12
    check-cast p0, La/whn0;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const-string v1, "android.webkit.resource.VIDEO_CAPTURE"

    .line 23
    .line 24
    invoke-static {v1, v0}, La/tx3;->u(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v2, 0x1

    .line 29
    if-ne v0, v2, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, La/whn0;->M1:La/c8c;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const-string v2, "android.permission.CAMERA"

    .line 36
    .line 37
    iget-object v0, v0, La/c8c;->a:La/us00;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    filled-new-array {v1}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p1, p0}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-string p0, "checkSystemPermissionAccessProvider"

    .line 54
    .line 55
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    throw p0

    .line 60
    :cond_1
    if-eqz p1, :cond_2

    .line 61
    .line 62
    sget-object v0, La/whn0;->Y1:La/s2m0;

    .line 63
    .line 64
    iget-object v0, p0, La/whn0;->S1:La/n0o0;

    .line 65
    .line 66
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, La/qog0;

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    new-instance v1, La/p790;

    .line 75
    .line 76
    const/4 v2, 0x2

    .line 77
    invoke-direct {v1, v0, p1, p0, v2}, La/p790;-><init>(La/qog0;Landroid/webkit/PermissionRequest;La/yx5;B)V

    .line 78
    .line 79
    .line 80
    iget-object p0, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 81
    .line 82
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, La/qog0;->a()V

    .line 86
    .line 87
    .line 88
    :cond_2
    :goto_0
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 6

    .line 1
    iget-byte v0, p0, La/mzo;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x64

    .line 5
    .line 6
    iget-object v3, p0, La/mzo;->b:La/yx5;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    check-cast v3, La/u3v0;

    .line 17
    .line 18
    sget-object v0, La/u3v0;->P1:La/kys0;

    .line 19
    .line 20
    iget-object v0, v3, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 21
    .line 22
    iget-object v0, v0, La/glz;->i:La/lkz;

    .line 23
    .line 24
    sget-object v5, La/lkz;->e:La/lkz;

    .line 25
    .line 26
    invoke-virtual {v0, v5}, La/lkz;->a(La/lkz;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    if-ne p2, v2, :cond_2

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_0
    if-nez v1, :cond_1

    .line 41
    .line 42
    const-string v1, ""

    .line 43
    .line 44
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-lez v0, :cond_2

    .line 49
    .line 50
    const-string v0, "about:blank"

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move v0, v4

    .line 61
    :goto_0
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {v3}, La/u3v0;->G0()La/v3v0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v1, v1, La/v3v0;->e:Landroid/widget/ProgressBar;

    .line 68
    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const/16 v4, 0x8

    .line 73
    .line 74
    :goto_1
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_2
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 82
    .line 83
    .line 84
    if-ne p2, v2, :cond_5

    .line 85
    .line 86
    check-cast v3, La/w590;

    .line 87
    .line 88
    sget-object p0, La/w590;->W1:La/mi70;

    .line 89
    .line 90
    invoke-virtual {v3}, La/w590;->I0()La/s690;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    iget-object p0, p0, La/s690;->v:La/p7m0;

    .line 95
    .line 96
    new-instance p1, La/j690;

    .line 97
    .line 98
    invoke-direct {p1, v4}, La/j690;-><init>(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v1, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    :cond_5
    return-void

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/mzo;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, La/mzo;->b:La/yx5;

    .line 11
    .line 12
    check-cast v0, La/nzo;

    .line 13
    .line 14
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 15
    .line 16
    iget-object v1, v1, La/glz;->i:La/lkz;

    .line 17
    .line 18
    sget-object v2, La/lkz;->e:La/lkz;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-ltz v1, :cond_4

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p0, p0, La/wzq;->e:Landroid/widget/TextView;

    .line 33
    .line 34
    const p1, 0x7f130860

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string v1, "http"

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-static {p2, v1, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object v1, v0, La/nzo;->O1:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    iput-object p2, v0, La/nzo;->O1:Ljava/lang/String;

    .line 64
    .line 65
    :cond_2
    iget-object v1, v0, La/nzo;->O1:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v1, v1, La/wzq;->b:Lorg/xplatform/ui_core/viewcomponents/views/BalanceView;

    .line 78
    .line 79
    const/16 v2, 0x8

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-virtual {v0}, La/nzo;->G0()La/wzq;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v0, v0, La/wzq;->e:Landroid/widget/TextView;

    .line 89
    .line 90
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 4

    .line 1
    iget-byte v0, p0, La/mzo;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/mzo;->b:La/yx5;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v3, La/whn0;

    .line 19
    .line 20
    iget-object p0, v3, La/whn0;->Q1:Landroid/webkit/ValueCallback;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-interface {p0, v2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iput-object p2, v3, La/whn0;->Q1:Landroid/webkit/ValueCallback;

    .line 28
    .line 29
    invoke-virtual {v3}, La/whn0;->G0()V

    .line 30
    .line 31
    .line 32
    return v1

    .line 33
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast v3, La/w590;

    .line 43
    .line 44
    sget-object p0, La/w590;->W1:La/mi70;

    .line 45
    .line 46
    iget-object p0, v3, La/w590;->U1:Landroid/webkit/ValueCallback;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    invoke-interface {p0, v2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iput-object p2, v3, La/w590;->U1:Landroid/webkit/ValueCallback;

    .line 54
    .line 55
    invoke-virtual {v3}, La/w590;->G0()V

    .line 56
    .line 57
    .line 58
    return v1

    .line 59
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    check-cast v3, La/l590;

    .line 69
    .line 70
    sget-object p0, La/l590;->Y1:La/nh70;

    .line 71
    .line 72
    iget-object p0, v3, La/l590;->Q1:Landroid/webkit/ValueCallback;

    .line 73
    .line 74
    if-eqz p0, :cond_2

    .line 75
    .line 76
    invoke-interface {p0, v2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    iput-object p2, v3, La/l590;->Q1:Landroid/webkit/ValueCallback;

    .line 80
    .line 81
    invoke-virtual {v3}, La/l590;->I0()V

    .line 82
    .line 83
    .line 84
    return v1

    .line 85
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
