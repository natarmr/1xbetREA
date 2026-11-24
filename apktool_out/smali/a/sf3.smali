.class public abstract La/sf3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(ILjava/lang/String;)V
    .locals 2

    .line 1
    int-to-long v0, p0

    .line 2
    invoke-static {p1, v0, v1}, Landroid/os/Trace;->setCounter(Ljava/lang/String;J)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static B(La/xd3;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setEpicenterBounds(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static C(Landroidx/appcompat/widget/SearchView$SearchAutoComplete;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/AutoCompleteTextView;->setInputMethodMode(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static D(La/xd3;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setIsClippedToScreen(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static E(Landroid/widget/PopupWindow;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setTouchModal(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static F(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static G(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V
    .locals 1

    .line 1
    const-string v0, "Unable to start foreground service"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V
    :try_end_0
    .catch Landroid/app/ForegroundServiceStartNotAllowedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p0

    .line 8
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object p2, Landroidx/work/impl/foreground/SystemForegroundService;->e:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1, p0, p2, v0}, La/wv00;->i(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_1
    move-exception p0

    .line 19
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object p2, Landroidx/work/impl/foreground/SystemForegroundService;->e:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, p0, p2, v0}, La/wv00;->i(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void
.end method

.method public static a(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedPerformancePoints()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_8

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_0
    invoke-static {}, La/jfv;->m()V

    .line 16
    .line 17
    .line 18
    double-to-int p3, p3

    .line 19
    new-instance p4, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 20
    .line 21
    invoke-direct {p4, p1, p2, p3}, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;-><init>(III)V

    .line 22
    .line 23
    .line 24
    move p1, v0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    const/4 p3, 0x2

    .line 30
    const/4 v1, 0x1

    .line 31
    if-ge p1, p2, :cond_2

    .line 32
    .line 33
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-static {p2}, La/jfv;->g(Ljava/lang/Object;)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-static {p2, p4}, La/jfv;->p(Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    move p0, p3

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move p0, v1

    .line 53
    :goto_1
    if-ne p0, v1, :cond_7

    .line 54
    .line 55
    sget-object p1, La/r8x;->a:Ljava/lang/Boolean;

    .line 56
    .line 57
    if-nez p1, :cond_7

    .line 58
    .line 59
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    const/16 p2, 0x25

    .line 62
    .line 63
    if-lt p1, p2, :cond_4

    .line 64
    .line 65
    :cond_3
    move v1, v0

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    invoke-static {v1}, La/sf3;->f(Z)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    const/16 p4, 0x23

    .line 72
    .line 73
    if-lt p1, p4, :cond_5

    .line 74
    .line 75
    if-ne p2, v1, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    invoke-static {v0}, La/sf3;->f(Z)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-ne p1, p3, :cond_6

    .line 83
    .line 84
    if-ne p2, v1, :cond_3

    .line 85
    .line 86
    :cond_6
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    sput-object p1, La/r8x;->a:Ljava/lang/Boolean;

    .line 91
    .line 92
    if-eqz v1, :cond_7

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_7
    return p0

    .line 96
    :cond_8
    :goto_3
    return v0
.end method

.method public static b(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Landroid/os/Trace;->beginAsyncSection(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static c(Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroid/graphics/Insets;->of(Landroid/graphics/Rect;)Landroid/graphics/Insets;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p2, v0, p1}, Landroid/view/View;->computeSystemWindowInsets(Landroid/view/WindowInsets;Landroid/graphics/Rect;)Landroid/view/WindowInsets;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsets()Landroid/graphics/Insets;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget p2, p1, Landroid/graphics/Insets;->left:I

    .line 27
    .line 28
    iget v0, p1, Landroid/graphics/Insets;->top:I

    .line 29
    .line 30
    iget v1, p1, Landroid/graphics/Insets;->right:I

    .line 31
    .line 32
    iget p1, p1, Landroid/graphics/Insets;->bottom:I

    .line 33
    .line 34
    invoke-virtual {p0, p2, v0, v1, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static d(ILjava/lang/Object;)Landroid/graphics/ColorFilter;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/BlendModeColorFilter;

    .line 2
    .line 3
    check-cast p1, Landroid/graphics/BlendMode;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Landroid/graphics/BlendModeColorFilter;-><init>(ILandroid/graphics/BlendMode;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Landroid/graphics/ColorFilter;

    .line 9
    .line 10
    return-object v0
.end method

.method public static e(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Landroid/os/Trace;->endAsyncSection(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static f(Z)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, La/awq;

    .line 3
    .line 4
    invoke-direct {v1}, La/awq;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string v2, "video/avc"

    .line 8
    .line 9
    invoke-static {v2}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iput-object v2, v1, La/awq;->o:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v2, Landroidx/media3/common/b;

    .line 16
    .line 17
    invoke-direct {v2, v1}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v2, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    invoke-static {v2, p0, v0}, La/qm30;->g(Landroidx/media3/common/b;ZZ)La/rcf0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    move v1, v0

    .line 29
    :goto_0
    iget v2, p0, La/rcf0;->d:I

    .line 30
    .line 31
    if-ge v1, v2, :cond_3

    .line 32
    .line 33
    invoke-virtual {p0, v1}, La/rcf0;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, La/jm30;

    .line 38
    .line 39
    iget-object v2, v2, La/jm30;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v1}, La/rcf0;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, La/jm30;

    .line 48
    .line 49
    iget-object v2, v2, La/jm30;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedPerformancePoints()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_2

    .line 68
    .line 69
    invoke-static {}, La/jfv;->m()V

    .line 70
    .line 71
    .line 72
    new-instance p0, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 73
    .line 74
    const/16 v1, 0x500

    .line 75
    .line 76
    const/16 v3, 0x2d0

    .line 77
    .line 78
    const/16 v4, 0x3c

    .line 79
    .line 80
    invoke-direct {p0, v1, v3, v4}, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;-><init>(III)V

    .line 81
    .line 82
    .line 83
    move v1, v0

    .line 84
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-ge v1, v3, :cond_1

    .line 89
    .line 90
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {v3}, La/jfv;->g(Ljava/lang/Object;)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v3, p0}, La/jfv;->p(Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;)Z

    .line 99
    .line 100
    .line 101
    move-result v3
    :try_end_0
    .catch La/om30; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    if-eqz v3, :cond_0

    .line 103
    .line 104
    const/4 p0, 0x2

    .line 105
    return p0

    .line 106
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_1
    const/4 p0, 0x1

    .line 110
    return p0

    .line 111
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :catch_0
    :cond_3
    return v0
.end method

.method public static g(Landroid/view/View;)Landroid/view/contentcapture/ContentCaptureSession;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContentCaptureSession()Landroid/view/contentcapture/ContentCaptureSession;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static h(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getOpPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static i(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Insets;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getOpticalInsets()Landroid/graphics/Insets;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static j()Z
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Trace;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static k()Z
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Trace;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static l(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/autofill/AutofillId;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/contentcapture/ContentCaptureSession;->newAutofillId(Landroid/view/autofill/AutofillId;J)Landroid/view/autofill/AutofillId;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static m(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/ViewStructure;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/contentcapture/ContentCaptureSession;->newVirtualViewStructure(Landroid/view/autofill/AutofillId;J)Landroid/view/ViewStructure;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static n(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewAppeared(Landroid/view/ViewStructure;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static o(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewDisappeared(Landroid/view/autofill/AutofillId;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static p(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewTextChanged(Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static q(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;[J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewsDisappeared(Landroid/view/autofill/AutofillId;[J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static r(La/n78;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, La/o78;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    sget-object p0, Landroid/graphics/BlendMode;->LUMINOSITY:Landroid/graphics/BlendMode;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_1
    sget-object p0, Landroid/graphics/BlendMode;->COLOR:Landroid/graphics/BlendMode;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_2
    sget-object p0, Landroid/graphics/BlendMode;->SATURATION:Landroid/graphics/BlendMode;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_3
    sget-object p0, Landroid/graphics/BlendMode;->HUE:Landroid/graphics/BlendMode;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_4
    sget-object p0, Landroid/graphics/BlendMode;->MULTIPLY:Landroid/graphics/BlendMode;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_5
    sget-object p0, Landroid/graphics/BlendMode;->EXCLUSION:Landroid/graphics/BlendMode;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_6
    sget-object p0, Landroid/graphics/BlendMode;->DIFFERENCE:Landroid/graphics/BlendMode;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_7
    sget-object p0, Landroid/graphics/BlendMode;->SOFT_LIGHT:Landroid/graphics/BlendMode;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_8
    sget-object p0, Landroid/graphics/BlendMode;->HARD_LIGHT:Landroid/graphics/BlendMode;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_9
    sget-object p0, Landroid/graphics/BlendMode;->COLOR_BURN:Landroid/graphics/BlendMode;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_a
    sget-object p0, Landroid/graphics/BlendMode;->COLOR_DODGE:Landroid/graphics/BlendMode;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_b
    sget-object p0, Landroid/graphics/BlendMode;->LIGHTEN:Landroid/graphics/BlendMode;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_c
    sget-object p0, Landroid/graphics/BlendMode;->DARKEN:Landroid/graphics/BlendMode;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_d
    sget-object p0, Landroid/graphics/BlendMode;->OVERLAY:Landroid/graphics/BlendMode;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_e
    sget-object p0, Landroid/graphics/BlendMode;->SCREEN:Landroid/graphics/BlendMode;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_f
    sget-object p0, Landroid/graphics/BlendMode;->MODULATE:Landroid/graphics/BlendMode;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_10
    sget-object p0, Landroid/graphics/BlendMode;->PLUS:Landroid/graphics/BlendMode;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_11
    sget-object p0, Landroid/graphics/BlendMode;->XOR:Landroid/graphics/BlendMode;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_12
    sget-object p0, Landroid/graphics/BlendMode;->DST_ATOP:Landroid/graphics/BlendMode;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_13
    sget-object p0, Landroid/graphics/BlendMode;->SRC_ATOP:Landroid/graphics/BlendMode;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_14
    sget-object p0, Landroid/graphics/BlendMode;->DST_OUT:Landroid/graphics/BlendMode;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_15
    sget-object p0, Landroid/graphics/BlendMode;->SRC_OUT:Landroid/graphics/BlendMode;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_16
    sget-object p0, Landroid/graphics/BlendMode;->DST_IN:Landroid/graphics/BlendMode;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_17
    sget-object p0, Landroid/graphics/BlendMode;->SRC_IN:Landroid/graphics/BlendMode;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_18
    sget-object p0, Landroid/graphics/BlendMode;->DST_OVER:Landroid/graphics/BlendMode;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_19
    sget-object p0, Landroid/graphics/BlendMode;->SRC_OVER:Landroid/graphics/BlendMode;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_1a
    sget-object p0, Landroid/graphics/BlendMode;->DST:Landroid/graphics/BlendMode;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_1b
    sget-object p0, Landroid/graphics/BlendMode;->SRC:Landroid/graphics/BlendMode;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_1c
    sget-object p0, Landroid/graphics/BlendMode;->CLEAR:Landroid/graphics/BlendMode;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static s(IIII)Landroid/graphics/Insets;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroid/graphics/Insets;->of(IIII)Landroid/graphics/Insets;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static t(Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/res/Resources$Theme;->rebase()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static u(Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->refreshAutoCompleteResults()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final v(Landroid/app/Activity;La/syb0$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static w(Landroid/app/Notification$Builder;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Notification$Builder;->setAllowSystemGeneratedContextualActions(Z)Landroid/app/Notification$Builder;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static x(Landroid/graphics/Paint;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/BlendMode;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setBlendMode(Landroid/graphics/BlendMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static y(Landroid/app/Notification$Builder;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Notification$Builder;->setBubbleMetadata(Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static z(Landroid/app/Notification$Action$Builder;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Notification$Action$Builder;->setContextual(Z)Landroid/app/Notification$Action$Builder;

    .line 3
    .line 4
    .line 5
    return-void
.end method
