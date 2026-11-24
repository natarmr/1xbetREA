.class public final Lorg/xplatform/rules/impl/util/ContactsWebView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic m:I


# instance fields
.field public final a:La/a8z;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Lkotlin/jvm/functions/Function1;

.field public l:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/rules/impl/util/ContactsWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/rules/impl/util/ContactsWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance v1, La/h5;

    .line 16
    .line 17
    const/16 v2, 0x16

    .line 18
    .line 19
    invoke-direct {v1, p0, p0, v2}, La/h5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->a:La/a8z;

    .line 27
    .line 28
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const v1, 0x7f040ae1

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v1, p3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iput p1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->b:I

    .line 49
    .line 50
    const-string p1, ""

    .line 51
    .line 52
    iput-object p1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->h:Ljava/lang/String;

    .line 53
    .line 54
    iput-object p1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->i:Ljava/lang/String;

    .line 55
    .line 56
    iput-object p1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->j:Ljava/lang/String;

    .line 57
    .line 58
    new-instance p1, La/vzd;

    .line 59
    .line 60
    invoke-direct {p1, v0}, La/vzd;-><init>(B)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->k:Lkotlin/jvm/functions/Function1;

    .line 64
    .line 65
    new-instance p1, La/yld;

    .line 66
    .line 67
    const/16 p3, 0x11

    .line 68
    .line 69
    invoke-direct {p1, p3}, La/yld;-><init>(B)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->l:Lkotlin/jvm/functions/Function0;

    .line 73
    .line 74
    invoke-direct {p0}, Lorg/xplatform/rules/impl/util/ContactsWebView;->getBinding()La/rce;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p1, p1, La/rce;->b:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 79
    .line 80
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    const/16 p3, 0x8

    .line 87
    .line 88
    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    const/4 v0, 0x1

    .line 96
    invoke-virtual {p3, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-virtual {p3, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    invoke-virtual {p3, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    invoke-virtual {p3, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 118
    .line 119
    .line 120
    new-instance p3, La/qce;

    .line 121
    .line 122
    invoke-direct {p3, p0}, La/qce;-><init>(Lorg/xplatform/rules/impl/util/ContactsWebView;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p3}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 126
    .line 127
    .line 128
    :cond_1
    invoke-direct {p0, p2}, Lorg/xplatform/rules/impl/util/ContactsWebView;->setAttributes(Landroid/util/AttributeSet;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method private final getBinding()La/rce;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, La/rce;

    .line 11
    .line 12
    return-object p0
.end method

.method private final setAttributes(Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    new-instance v1, La/q14;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v3, La/aqd0;->n:[I

    .line 14
    .line 15
    invoke-direct {v1, v2, p1, v3}, La/q14;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;[I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, v1, La/q14;->b:Landroid/content/res/TypedArray;

    .line 19
    .line 20
    :try_start_0
    iget v2, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    :try_start_1
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iput v2, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->c:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v2

    .line 31
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget v2, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    .line 36
    :try_start_3
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->b:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catch_1
    move-exception p1

    .line 44
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-virtual {v1}, La/q14;->close()V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 53
    :catchall_1
    move-exception p1

    .line 54
    invoke-static {v1, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_0
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget v1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->c:I

    .line 63
    .line 64
    sget-object v2, La/mqd0;->x:[I

    .line 65
    .line 66
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/16 v1, 0xa

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v1, :cond_1

    .line 77
    .line 78
    iget-object v1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->h:Ljava/lang/String;

    .line 79
    .line 80
    :cond_1
    iput-object v1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->h:Ljava/lang/String;

    .line 81
    .line 82
    const/4 v1, 0x3

    .line 83
    iget v2, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->e:I

    .line 84
    .line 85
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    iput v1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->e:I

    .line 90
    .line 91
    const/4 v1, 0x5

    .line 92
    iget v2, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->d:I

    .line 93
    .line 94
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iput v1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->d:I

    .line 99
    .line 100
    iget v1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->g:I

    .line 101
    .line 102
    int-to-float v1, v1

    .line 103
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget v1, v1, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 123
    .line 124
    div-float/2addr v0, v1

    .line 125
    float-to-int v0, v0

    .line 126
    iput v0, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->g:I

    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 129
    .line 130
    .line 131
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iput v1, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->f:I

    .line 8
    .line 9
    iget-object v1, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->i:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v3, 0x2

    .line 16
    const/4 v4, 0x1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-ne v1, v4, :cond_0

    .line 39
    .line 40
    const-string v1, "rtl"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-string v1, "ltr"

    .line 44
    .line 45
    :goto_0
    iget v5, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->e:I

    .line 46
    .line 47
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const-string v7, "#"

    .line 71
    .line 72
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iget v8, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->d:I

    .line 77
    .line 78
    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    iget v9, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->b:I

    .line 101
    .line 102
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v9, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    new-instance v7, Ljava/lang/StringBuffer;

    .line 125
    .line 126
    const-string v9, "<style>"

    .line 127
    .line 128
    invoke-direct {v7, v9}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iget-object v9, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->h:Ljava/lang/String;

    .line 132
    .line 133
    new-instance v10, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v11, "@font-face {font-family:WebViewFont;src:url(\'file:///android_"

    .line 136
    .line 137
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v9, "\');}"

    .line 144
    .line 145
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 153
    .line 154
    .line 155
    iget v9, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->f:I

    .line 156
    .line 157
    iget v10, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->g:I

    .line 158
    .line 159
    const-string v11, "px;margin:0;font-family:WebViewFont;font-size:"

    .line 160
    .line 161
    const-string v12, "px;direction:"

    .line 162
    .line 163
    const-string v13, "body {padding:0;padding-bottom:"

    .line 164
    .line 165
    invoke-static {v13, v9, v11, v12, v10}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v1, ";"

    .line 173
    .line 174
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v7, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 182
    .line 183
    .line 184
    const-string v1, "max-width:100%;overflow-x:hidden;word-wrap:break-word;"

    .line 185
    .line 186
    invoke-virtual {v7, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 187
    .line 188
    .line 189
    const-string v1, ";background:"

    .line 190
    .line 191
    const-string v9, "}"

    .line 192
    .line 193
    const-string v10, "color:"

    .line 194
    .line 195
    invoke-static {v10, v5, v1, v6, v9}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v7, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 200
    .line 201
    .line 202
    const-string v1, "img {max-width: 60%;height: auto;}img {display: block;margin: 0 auto;margin-bottom: 50px;}"

    .line 203
    .line 204
    invoke-virtual {v7, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 205
    .line 206
    .line 207
    new-instance v1, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    const-string v6, "a {color: "

    .line 210
    .line 211
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v5, ";}"

    .line 218
    .line 219
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v7, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 227
    .line 228
    .line 229
    new-instance v1, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    const-string v6, "a:link {color: "

    .line 232
    .line 233
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v7, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 247
    .line 248
    .line 249
    new-instance v1, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v6, "a:visited {color: "

    .line 252
    .line 253
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v7, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 267
    .line 268
    .line 269
    const-string v1, "a:link {text-decoration: none;}a:visited {text-decoration: none;}</style>"

    .line 270
    .line 271
    invoke-virtual {v7, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    iput-object v1, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->i:Ljava/lang/String;

    .line 282
    .line 283
    :cond_1
    iget-object v1, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->j:Ljava/lang/String;

    .line 284
    .line 285
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-eqz v1, :cond_2

    .line 290
    .line 291
    goto/16 :goto_1f

    .line 292
    .line 293
    :cond_2
    iput-object v2, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->j:Ljava/lang/String;

    .line 294
    .line 295
    new-instance v1, La/yk5;

    .line 296
    .line 297
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 298
    .line 299
    .line 300
    new-instance v5, La/er20;

    .line 301
    .line 302
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 303
    .line 304
    .line 305
    iget-object v6, v0, Lorg/xplatform/rules/impl/util/ContactsWebView;->j:Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    sget-object v7, La/wb;->m:La/ar20;

    .line 311
    .line 312
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    new-instance v8, La/y78;

    .line 316
    .line 317
    const/16 v9, 0xe

    .line 318
    .line 319
    invoke-direct {v8, v9}, La/y78;-><init>(B)V

    .line 320
    .line 321
    .line 322
    iget-object v9, v8, La/y78;->c:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v9, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    new-instance v10, La/s9d;

    .line 330
    .line 331
    sget-object v11, La/v9d;->e:La/v9d;

    .line 332
    .line 333
    invoke-direct {v10, v8, v11}, La/s9d;-><init>(La/y78;La/v9d;)V

    .line 334
    .line 335
    .line 336
    iget v11, v8, La/y78;->b:I

    .line 337
    .line 338
    new-instance v12, La/gxu;

    .line 339
    .line 340
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 344
    .line 345
    .line 346
    iput-object v6, v12, La/gxu;->a:Ljava/lang/Object;

    .line 347
    .line 348
    new-instance v13, Ljava/util/ArrayList;

    .line 349
    .line 350
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 351
    .line 352
    .line 353
    const/4 v14, 0x0

    .line 354
    move v15, v14

    .line 355
    :goto_1
    const/16 v3, 0xa

    .line 356
    .line 357
    const/4 v4, 0x4

    .line 358
    invoke-static {v3, v15, v4, v6}, Lkotlin/text/StringsKt;->U(CIILjava/lang/CharSequence;)I

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    const/4 v4, -0x1

    .line 363
    if-ne v3, v4, :cond_31

    .line 364
    .line 365
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    invoke-interface {v6, v15, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    iput-object v13, v12, La/gxu;->b:Ljava/lang/Object;

    .line 377
    .line 378
    iget-object v3, v12, La/gxu;->a:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v3, Ljava/lang/CharSequence;

    .line 381
    .line 382
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    if-lez v3, :cond_3

    .line 387
    .line 388
    new-instance v3, La/k810;

    .line 389
    .line 390
    invoke-direct {v3, v12, v14, v4, v4}, La/k810;-><init>(La/gxu;III)V

    .line 391
    .line 392
    .line 393
    const/4 v15, 0x1

    .line 394
    invoke-virtual {v3, v15}, La/k810;->e(I)La/k810;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    goto :goto_2

    .line 399
    :cond_3
    const/4 v3, 0x0

    .line 400
    :goto_2
    iput-object v3, v12, La/gxu;->c:Ljava/lang/Object;

    .line 401
    .line 402
    iget-object v3, v12, La/gxu;->c:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v3, La/k810;

    .line 405
    .line 406
    :goto_3
    iget-object v15, v10, La/s9d;->d:Ljava/util/ArrayList;

    .line 407
    .line 408
    if-eqz v3, :cond_2f

    .line 409
    .line 410
    const/16 v16, 0x0

    .line 411
    .line 412
    iget v13, v3, La/k810;->c:I

    .line 413
    .line 414
    iput v13, v8, La/y78;->b:I

    .line 415
    .line 416
    iget-object v14, v3, La/k810;->d:Ljava/lang/CharSequence;

    .line 417
    .line 418
    iget v12, v3, La/k810;->b:I

    .line 419
    .line 420
    if-ne v12, v4, :cond_4

    .line 421
    .line 422
    new-instance v4, La/mr20;

    .line 423
    .line 424
    iget-object v0, v10, La/s9d;->e:La/v9d;

    .line 425
    .line 426
    invoke-virtual {v0, v3}, La/v9d;->b(La/k810;)La/v9d;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    move-object/from16 v18, v1

    .line 431
    .line 432
    iget-object v1, v10, La/s9d;->b:La/v9d;

    .line 433
    .line 434
    invoke-direct {v4, v1, v0, v15}, La/mr20;-><init>(La/v9d;La/v9d;Ljava/util/List;)V

    .line 435
    .line 436
    .line 437
    iput-object v4, v10, La/s9d;->h:La/mr20;

    .line 438
    .line 439
    goto :goto_4

    .line 440
    :cond_4
    move-object/from16 v18, v1

    .line 441
    .line 442
    iget-object v0, v10, La/s9d;->h:La/mr20;

    .line 443
    .line 444
    iget-object v0, v0, La/mr20;->b:La/v9d;

    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    invoke-static {v0, v14}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-ne v12, v0, :cond_6

    .line 454
    .line 455
    new-instance v0, La/mr20;

    .line 456
    .line 457
    iget-object v1, v10, La/s9d;->h:La/mr20;

    .line 458
    .line 459
    iget-object v1, v1, La/mr20;->b:La/v9d;

    .line 460
    .line 461
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    instance-of v4, v4, La/co80;

    .line 466
    .line 467
    invoke-virtual {v1, v3, v4}, La/v9d;->a(La/k810;Z)La/v9d;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    if-nez v4, :cond_5

    .line 472
    .line 473
    iget-object v4, v10, La/s9d;->h:La/mr20;

    .line 474
    .line 475
    iget-object v4, v4, La/mr20;->b:La/v9d;

    .line 476
    .line 477
    :cond_5
    invoke-direct {v0, v1, v4, v15}, La/mr20;-><init>(La/v9d;La/v9d;Ljava/util/List;)V

    .line 478
    .line 479
    .line 480
    iput-object v0, v10, La/s9d;->h:La/mr20;

    .line 481
    .line 482
    :cond_6
    :goto_4
    iget v0, v10, La/s9d;->f:I

    .line 483
    .line 484
    if-lt v13, v0, :cond_13

    .line 485
    .line 486
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    :goto_5
    if-lez v0, :cond_12

    .line 491
    .line 492
    add-int/lit8 v0, v0, -0x1

    .line 493
    .line 494
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    if-lt v0, v1, :cond_7

    .line 499
    .line 500
    move-object/from16 v19, v5

    .line 501
    .line 502
    :goto_6
    const/4 v1, 0x4

    .line 503
    goto/16 :goto_9

    .line 504
    .line 505
    :cond_7
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    check-cast v1, La/ir20;

    .line 510
    .line 511
    iget-object v4, v10, La/s9d;->h:La/mr20;

    .line 512
    .line 513
    iget-object v4, v4, La/mr20;->a:La/v9d;

    .line 514
    .line 515
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    iget v2, v1, La/ir20;->c:I

    .line 522
    .line 523
    move-object/from16 v19, v5

    .line 524
    .line 525
    if-eq v2, v13, :cond_8

    .line 526
    .line 527
    iget-object v5, v1, La/ir20;->d:La/hr20;

    .line 528
    .line 529
    if-eqz v5, :cond_8

    .line 530
    .line 531
    sget-object v2, La/hr20;->e:La/hr20;

    .line 532
    .line 533
    goto :goto_8

    .line 534
    :cond_8
    const/4 v5, -0x1

    .line 535
    if-eq v2, v5, :cond_c

    .line 536
    .line 537
    if-le v2, v13, :cond_9

    .line 538
    .line 539
    goto :goto_7

    .line 540
    :cond_9
    if-ge v2, v13, :cond_a

    .line 541
    .line 542
    invoke-virtual {v1, v3}, La/ir20;->f(La/k810;)Z

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    if-nez v2, :cond_a

    .line 547
    .line 548
    sget-object v2, La/hr20;->d:La/hr20;

    .line 549
    .line 550
    goto :goto_8

    .line 551
    :cond_a
    iget-object v2, v1, La/ir20;->d:La/hr20;

    .line 552
    .line 553
    if-eqz v2, :cond_b

    .line 554
    .line 555
    goto :goto_8

    .line 556
    :cond_b
    invoke-virtual {v1, v4, v3}, La/ir20;->c(La/v9d;La/k810;)La/hr20;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    goto :goto_8

    .line 561
    :cond_c
    :goto_7
    sget-object v2, La/hr20;->d:La/hr20;

    .line 562
    .line 563
    :goto_8
    sget-object v4, La/hr20;->d:La/hr20;

    .line 564
    .line 565
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    if-eqz v4, :cond_d

    .line 570
    .line 571
    goto :goto_6

    .line 572
    :cond_d
    iget v4, v2, La/hr20;->a:I

    .line 573
    .line 574
    invoke-virtual {v10, v0, v4}, La/s9d;->a(II)V

    .line 575
    .line 576
    .line 577
    iget v4, v2, La/hr20;->b:I

    .line 578
    .line 579
    if-eqz v4, :cond_11

    .line 580
    .line 581
    const/4 v5, 0x3

    .line 582
    if-ne v4, v5, :cond_e

    .line 583
    .line 584
    const/4 v4, 0x1

    .line 585
    :cond_e
    iget-object v5, v1, La/ir20;->b:La/y78;

    .line 586
    .line 587
    invoke-virtual {v1}, La/ir20;->d()La/ar20;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    invoke-static {v4, v5, v1}, La/w6x;->a(ILa/y78;La/ar20;)V

    .line 592
    .line 593
    .line 594
    const/4 v1, 0x4

    .line 595
    if-eq v4, v1, :cond_f

    .line 596
    .line 597
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v10}, La/s9d;->b()V

    .line 601
    .line 602
    .line 603
    :cond_f
    iget v2, v2, La/hr20;->c:I

    .line 604
    .line 605
    const/4 v4, 0x2

    .line 606
    if-ne v2, v4, :cond_10

    .line 607
    .line 608
    goto :goto_a

    .line 609
    :cond_10
    :goto_9
    move-object/from16 v2, p2

    .line 610
    .line 611
    move-object/from16 v5, v19

    .line 612
    .line 613
    goto :goto_5

    .line 614
    :cond_11
    throw v16

    .line 615
    :cond_12
    move-object/from16 v19, v5

    .line 616
    .line 617
    const/4 v1, 0x4

    .line 618
    :goto_a
    const/4 v0, 0x1

    .line 619
    goto :goto_b

    .line 620
    :cond_13
    move-object/from16 v19, v5

    .line 621
    .line 622
    const/4 v1, 0x4

    .line 623
    const/4 v0, 0x0

    .line 624
    :goto_b
    iget-object v2, v10, La/s9d;->h:La/mr20;

    .line 625
    .line 626
    iget-object v2, v2, La/mr20;->a:La/v9d;

    .line 627
    .line 628
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    invoke-static {v2, v14}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 632
    .line 633
    .line 634
    move-result v2

    .line 635
    iget-object v4, v10, La/s9d;->a:La/y78;

    .line 636
    .line 637
    if-ne v12, v2, :cond_14

    .line 638
    .line 639
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    check-cast v2, La/ir20;

    .line 644
    .line 645
    if-eqz v2, :cond_15

    .line 646
    .line 647
    invoke-virtual {v2}, La/ir20;->a()Z

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    if-nez v2, :cond_15

    .line 652
    .line 653
    :cond_14
    move/from16 v17, v0

    .line 654
    .line 655
    goto/16 :goto_f

    .line 656
    .line 657
    :cond_15
    const/4 v5, -0x1

    .line 658
    if-ne v12, v5, :cond_16

    .line 659
    .line 660
    iget-object v2, v10, La/s9d;->c:La/iun;

    .line 661
    .line 662
    move/from16 v17, v0

    .line 663
    .line 664
    goto :goto_d

    .line 665
    :cond_16
    iget-object v2, v10, La/s9d;->h:La/mr20;

    .line 666
    .line 667
    iget-object v2, v2, La/mr20;->a:La/v9d;

    .line 668
    .line 669
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    invoke-static {v2, v14}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    if-ne v12, v2, :cond_1b

    .line 677
    .line 678
    iget-object v2, v10, La/s9d;->i:Ljava/util/List;

    .line 679
    .line 680
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 685
    .line 686
    .line 687
    move-result v5

    .line 688
    if-eqz v5, :cond_18

    .line 689
    .line 690
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v5

    .line 694
    check-cast v5, La/jr20;

    .line 695
    .line 696
    iget-object v1, v10, La/s9d;->h:La/mr20;

    .line 697
    .line 698
    invoke-interface {v5, v3, v4, v1}, La/jr20;->a(La/k810;La/y78;La/mr20;)Ljava/util/List;

    .line 699
    .line 700
    .line 701
    move-result-object v1

    .line 702
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 703
    .line 704
    .line 705
    move-result v5

    .line 706
    if-nez v5, :cond_17

    .line 707
    .line 708
    move/from16 v17, v0

    .line 709
    .line 710
    move-object v2, v1

    .line 711
    goto :goto_d

    .line 712
    :cond_17
    const/4 v1, 0x4

    .line 713
    goto :goto_c

    .line 714
    :cond_18
    iget-object v1, v10, La/s9d;->h:La/mr20;

    .line 715
    .line 716
    iget-object v1, v1, La/mr20;->b:La/v9d;

    .line 717
    .line 718
    invoke-static {v1, v14}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 719
    .line 720
    .line 721
    move-result v1

    .line 722
    if-lt v12, v1, :cond_19

    .line 723
    .line 724
    invoke-virtual {v3}, La/k810;->a()Ljava/lang/Integer;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    if-eqz v1, :cond_19

    .line 729
    .line 730
    new-instance v1, La/co80;

    .line 731
    .line 732
    iget-object v2, v10, La/s9d;->h:La/mr20;

    .line 733
    .line 734
    iget-object v2, v2, La/mr20;->a:La/v9d;

    .line 735
    .line 736
    new-instance v5, La/y78;

    .line 737
    .line 738
    invoke-direct {v5, v4}, La/y78;-><init>(La/y78;)V

    .line 739
    .line 740
    .line 741
    move/from16 v17, v0

    .line 742
    .line 743
    iget-object v0, v10, La/s9d;->g:La/t43;

    .line 744
    .line 745
    invoke-direct {v1, v2, v5, v0}, La/co80;-><init>(La/v9d;La/y78;Lkotlin/jvm/functions/Function2;)V

    .line 746
    .line 747
    .line 748
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    goto :goto_d

    .line 753
    :cond_19
    move/from16 v17, v0

    .line 754
    .line 755
    sget-object v2, La/iun;->a:La/iun;

    .line 756
    .line 757
    :goto_d
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    if-eqz v1, :cond_1a

    .line 766
    .line 767
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    check-cast v1, La/ir20;

    .line 772
    .line 773
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    invoke-virtual {v10}, La/s9d;->b()V

    .line 780
    .line 781
    .line 782
    const/16 v17, 0x1

    .line 783
    .line 784
    goto :goto_e

    .line 785
    :cond_1a
    :goto_f
    move/from16 v0, v17

    .line 786
    .line 787
    goto :goto_10

    .line 788
    :cond_1b
    new-instance v0, La/byw;

    .line 789
    .line 790
    const-string v1, ""

    .line 791
    .line 792
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    throw v0

    .line 796
    :goto_10
    if-eqz v0, :cond_20

    .line 797
    .line 798
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    check-cast v0, La/ir20;

    .line 803
    .line 804
    if-eqz v0, :cond_1e

    .line 805
    .line 806
    iget-object v1, v0, La/ir20;->d:La/hr20;

    .line 807
    .line 808
    if-eqz v1, :cond_1c

    .line 809
    .line 810
    add-int/lit8 v0, v13, 0x1

    .line 811
    .line 812
    const/4 v5, -0x1

    .line 813
    goto :goto_11

    .line 814
    :cond_1c
    iget v1, v0, La/ir20;->c:I

    .line 815
    .line 816
    const/4 v5, -0x1

    .line 817
    if-eq v1, v5, :cond_1d

    .line 818
    .line 819
    if-gt v1, v13, :cond_1d

    .line 820
    .line 821
    invoke-virtual {v0, v3}, La/ir20;->b(La/k810;)I

    .line 822
    .line 823
    .line 824
    move-result v1

    .line 825
    iput v1, v0, La/ir20;->c:I

    .line 826
    .line 827
    :cond_1d
    move v0, v1

    .line 828
    goto :goto_11

    .line 829
    :cond_1e
    const/4 v5, -0x1

    .line 830
    invoke-virtual {v3}, La/k810;->c()I

    .line 831
    .line 832
    .line 833
    move-result v0

    .line 834
    :goto_11
    if-ne v0, v5, :cond_1f

    .line 835
    .line 836
    const v0, 0x7fffffff

    .line 837
    .line 838
    .line 839
    :cond_1f
    iput v0, v10, La/s9d;->f:I

    .line 840
    .line 841
    goto :goto_12

    .line 842
    :cond_20
    const/4 v5, -0x1

    .line 843
    :goto_12
    if-eq v12, v5, :cond_22

    .line 844
    .line 845
    iget-object v0, v10, La/s9d;->h:La/mr20;

    .line 846
    .line 847
    iget-object v0, v0, La/mr20;->a:La/v9d;

    .line 848
    .line 849
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    invoke-static {v0, v14}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 853
    .line 854
    .line 855
    move-result v0

    .line 856
    if-ne v12, v0, :cond_21

    .line 857
    .line 858
    goto :goto_13

    .line 859
    :cond_21
    const/4 v12, 0x2

    .line 860
    goto/16 :goto_1d

    .line 861
    .line 862
    :cond_22
    :goto_13
    iget-object v0, v10, La/s9d;->h:La/mr20;

    .line 863
    .line 864
    iget-object v0, v0, La/mr20;->b:La/v9d;

    .line 865
    .line 866
    invoke-static {v0, v14}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 867
    .line 868
    .line 869
    move-result v0

    .line 870
    sub-int/2addr v0, v12

    .line 871
    if-lez v0, :cond_21

    .line 872
    .line 873
    const/16 v1, 0x3e

    .line 874
    .line 875
    const/4 v5, -0x1

    .line 876
    if-eq v12, v5, :cond_2c

    .line 877
    .line 878
    iget-object v2, v10, La/s9d;->h:La/mr20;

    .line 879
    .line 880
    iget-object v2, v2, La/mr20;->b:La/v9d;

    .line 881
    .line 882
    invoke-virtual {v2}, La/v9d;->e()I

    .line 883
    .line 884
    .line 885
    move-result v2

    .line 886
    iget-object v5, v10, La/s9d;->e:La/v9d;

    .line 887
    .line 888
    invoke-virtual {v5}, La/v9d;->e()I

    .line 889
    .line 890
    .line 891
    move-result v5

    .line 892
    if-gt v2, v5, :cond_2b

    .line 893
    .line 894
    iget-object v2, v10, La/s9d;->h:La/mr20;

    .line 895
    .line 896
    iget-object v2, v2, La/mr20;->b:La/v9d;

    .line 897
    .line 898
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 899
    .line 900
    .line 901
    invoke-virtual {v2}, La/v9d;->e()I

    .line 902
    .line 903
    .line 904
    move-result v5

    .line 905
    if-nez v5, :cond_23

    .line 906
    .line 907
    const/4 v14, 0x1

    .line 908
    goto :goto_19

    .line 909
    :cond_23
    sub-int v5, v13, v12

    .line 910
    .line 911
    invoke-static {v2, v14}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 912
    .line 913
    .line 914
    move-result v12

    .line 915
    add-int/2addr v12, v5

    .line 916
    invoke-virtual {v3}, La/k810;->c()I

    .line 917
    .line 918
    .line 919
    move-result v5

    .line 920
    invoke-static {v12, v5}, Ljava/lang/Math;->min(II)I

    .line 921
    .line 922
    .line 923
    move-result v5

    .line 924
    iget-object v2, v2, La/v9d;->b:[C

    .line 925
    .line 926
    invoke-static {v2}, La/tx3;->Q([C)Ljava/lang/Character;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    if-nez v2, :cond_24

    .line 931
    .line 932
    goto :goto_14

    .line 933
    :cond_24
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 934
    .line 935
    .line 936
    move-result v12

    .line 937
    if-ne v12, v1, :cond_25

    .line 938
    .line 939
    sget-object v1, La/cy2;->z:La/ar20;

    .line 940
    .line 941
    goto :goto_18

    .line 942
    :cond_25
    :goto_14
    if-nez v2, :cond_26

    .line 943
    .line 944
    goto :goto_15

    .line 945
    :cond_26
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 946
    .line 947
    .line 948
    move-result v1

    .line 949
    const/16 v12, 0x2e

    .line 950
    .line 951
    if-ne v1, v12, :cond_27

    .line 952
    .line 953
    goto :goto_16

    .line 954
    :cond_27
    :goto_15
    if-nez v2, :cond_28

    .line 955
    .line 956
    goto :goto_17

    .line 957
    :cond_28
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 958
    .line 959
    .line 960
    move-result v1

    .line 961
    const/16 v2, 0x29

    .line 962
    .line 963
    if-ne v1, v2, :cond_29

    .line 964
    .line 965
    :goto_16
    sget-object v1, La/cy2;->Z:La/ar20;

    .line 966
    .line 967
    goto :goto_18

    .line 968
    :cond_29
    :goto_17
    sget-object v1, La/cy2;->W:La/ar20;

    .line 969
    .line 970
    :goto_18
    new-instance v2, La/sgi0;

    .line 971
    .line 972
    new-instance v12, Lkotlin/ranges/IntRange;

    .line 973
    .line 974
    const/4 v14, 0x1

    .line 975
    invoke-direct {v12, v13, v5, v14}, Lkotlin/ranges/a;-><init>(III)V

    .line 976
    .line 977
    .line 978
    invoke-direct {v2, v12, v1}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 979
    .line 980
    .line 981
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 982
    .line 983
    .line 984
    move-result-object v1

    .line 985
    invoke-virtual {v4, v1}, La/y78;->b(Ljava/util/List;)V

    .line 986
    .line 987
    .line 988
    :cond_2a
    :goto_19
    const/4 v12, 0x2

    .line 989
    goto :goto_1b

    .line 990
    :cond_2b
    const/4 v5, -0x1

    .line 991
    :cond_2c
    const/4 v2, 0x1

    .line 992
    if-ne v12, v5, :cond_2a

    .line 993
    .line 994
    if-le v0, v2, :cond_2a

    .line 995
    .line 996
    iget-object v2, v10, La/s9d;->h:La/mr20;

    .line 997
    .line 998
    iget-object v2, v2, La/mr20;->b:La/v9d;

    .line 999
    .line 1000
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v5

    .line 1007
    instance-of v5, v5, La/co80;

    .line 1008
    .line 1009
    if-eqz v5, :cond_2d

    .line 1010
    .line 1011
    goto :goto_1a

    .line 1012
    :cond_2d
    iget-object v5, v2, La/v9d;->b:[C

    .line 1013
    .line 1014
    invoke-static {v5, v1}, La/tx3;->v([CC)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v1

    .line 1018
    if-nez v1, :cond_2e

    .line 1019
    .line 1020
    :goto_1a
    goto :goto_19

    .line 1021
    :cond_2e
    add-int/lit8 v13, v13, 0x1

    .line 1022
    .line 1023
    new-instance v1, Ljava/util/ArrayList;

    .line 1024
    .line 1025
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1026
    .line 1027
    .line 1028
    new-instance v5, La/bt40;

    .line 1029
    .line 1030
    const/4 v12, 0x2

    .line 1031
    invoke-direct {v5, v1, v13, v12}, La/bt40;-><init>(Ljava/lang/Object;IB)V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v2, v14, v5}, La/v9d;->d(Ljava/lang/CharSequence;La/bt40;)La/v9d;

    .line 1035
    .line 1036
    .line 1037
    iget-object v2, v4, La/y78;->c:Ljava/lang/Object;

    .line 1038
    .line 1039
    check-cast v2, Ljava/util/ArrayList;

    .line 1040
    .line 1041
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1042
    .line 1043
    .line 1044
    :goto_1b
    invoke-virtual {v3, v0}, La/k810;->e(I)La/k810;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    :goto_1c
    move-object v3, v0

    .line 1049
    goto :goto_1e

    .line 1050
    :goto_1d
    iget v0, v10, La/s9d;->f:I

    .line 1051
    .line 1052
    sub-int/2addr v0, v13

    .line 1053
    invoke-virtual {v3, v0}, La/k810;->e(I)La/k810;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    goto :goto_1c

    .line 1058
    :goto_1e
    move-object/from16 v0, p0

    .line 1059
    .line 1060
    move-object/from16 v2, p2

    .line 1061
    .line 1062
    move-object/from16 v1, v18

    .line 1063
    .line 1064
    move-object/from16 v5, v19

    .line 1065
    .line 1066
    const/4 v4, -0x1

    .line 1067
    const/4 v14, 0x0

    .line 1068
    goto/16 :goto_3

    .line 1069
    .line 1070
    :cond_2f
    move-object/from16 v18, v1

    .line 1071
    .line 1072
    move-object/from16 v19, v5

    .line 1073
    .line 1074
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    iput v1, v8, La/y78;->b:I

    .line 1083
    .line 1084
    const/4 v1, 0x3

    .line 1085
    const/4 v5, -0x1

    .line 1086
    invoke-virtual {v10, v5, v1}, La/s9d;->a(II)V

    .line 1087
    .line 1088
    .line 1089
    new-instance v1, La/sgi0;

    .line 1090
    .line 1091
    new-instance v2, Lkotlin/ranges/IntRange;

    .line 1092
    .line 1093
    iget v3, v8, La/y78;->b:I

    .line 1094
    .line 1095
    const/4 v14, 0x1

    .line 1096
    invoke-direct {v2, v11, v3, v14}, Lkotlin/ranges/a;-><init>(III)V

    .line 1097
    .line 1098
    .line 1099
    invoke-direct {v1, v2, v7}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    new-instance v1, La/dr20;

    .line 1106
    .line 1107
    move-object/from16 v2, v19

    .line 1108
    .line 1109
    invoke-direct {v1, v2, v6}, La/dr20;-><init>(La/er20;Ljava/lang/CharSequence;)V

    .line 1110
    .line 1111
    .line 1112
    new-instance v2, La/e8r0;

    .line 1113
    .line 1114
    const/16 v3, 0xd

    .line 1115
    .line 1116
    invoke-direct {v2, v1, v3}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 1117
    .line 1118
    .line 1119
    new-instance v1, La/cr20;

    .line 1120
    .line 1121
    invoke-virtual {v2, v9}, La/p4;->p0(Ljava/util/ArrayList;)La/j;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v2

    .line 1125
    invoke-direct {v1, v2, v0}, La/cr20;-><init>(La/j;Ljava/util/List;)V

    .line 1126
    .line 1127
    .line 1128
    new-instance v0, La/dgu;

    .line 1129
    .line 1130
    iget-object v1, v1, La/cr20;->a:La/j;

    .line 1131
    .line 1132
    move-object/from16 v4, p2

    .line 1133
    .line 1134
    move-object/from16 v5, v18

    .line 1135
    .line 1136
    invoke-direct {v0, v4, v1, v5}, La/dgu;-><init>(Ljava/lang/String;La/j;La/yk5;)V

    .line 1137
    .line 1138
    .line 1139
    new-instance v1, La/tqt;

    .line 1140
    .line 1141
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1142
    .line 1143
    .line 1144
    new-instance v2, La/htw;

    .line 1145
    .line 1146
    invoke-direct {v2, v0, v1}, La/htw;-><init>(La/dgu;La/tqt;)V

    .line 1147
    .line 1148
    .line 1149
    iget-object v1, v0, La/dgu;->b:Ljava/lang/Object;

    .line 1150
    .line 1151
    check-cast v1, La/j;

    .line 1152
    .line 1153
    invoke-virtual {v2, v1}, La/htw;->e0(La/j;)V

    .line 1154
    .line 1155
    .line 1156
    iget-object v0, v0, La/dgu;->d:Ljava/lang/Object;

    .line 1157
    .line 1158
    check-cast v0, Ljava/lang/StringBuilder;

    .line 1159
    .line 1160
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v0

    .line 1164
    move-object/from16 v1, p0

    .line 1165
    .line 1166
    iget-object v2, v1, Lorg/xplatform/rules/impl/util/ContactsWebView;->i:Ljava/lang/String;

    .line 1167
    .line 1168
    const-string v3, "</head><body>"

    .line 1169
    .line 1170
    const-string v4, "</body></html>"

    .line 1171
    .line 1172
    const-string v5, "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">"

    .line 1173
    .line 1174
    invoke-static {v5, v2, v3, v0, v4}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v8

    .line 1178
    invoke-direct {v1}, Lorg/xplatform/rules/impl/util/ContactsWebView;->getBinding()La/rce;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    iget-object v0, v0, La/rce;->b:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 1183
    .line 1184
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v6

    .line 1188
    if-eqz v6, :cond_30

    .line 1189
    .line 1190
    const-string v10, "UTF-8"

    .line 1191
    .line 1192
    const-string v11, ""

    .line 1193
    .line 1194
    const-string v7, ""

    .line 1195
    .line 1196
    const-string v9, "text/html"

    .line 1197
    .line 1198
    invoke-virtual/range {v6 .. v11}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1199
    .line 1200
    .line 1201
    :cond_30
    :goto_1f
    return-void

    .line 1202
    :cond_31
    move-object v4, v2

    .line 1203
    move-object v2, v5

    .line 1204
    const/4 v14, 0x1

    .line 1205
    move-object v5, v1

    .line 1206
    move-object v1, v0

    .line 1207
    const/4 v0, 0x2

    .line 1208
    invoke-interface {v6, v15, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v15

    .line 1212
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1213
    .line 1214
    .line 1215
    add-int/lit8 v15, v3, 0x1

    .line 1216
    .line 1217
    move-object v0, v1

    .line 1218
    move-object v1, v5

    .line 1219
    move-object v5, v2

    .line 1220
    move-object v2, v4

    .line 1221
    move v4, v14

    .line 1222
    const/4 v14, 0x0

    .line 1223
    goto/16 :goto_1
.end method

.method public final getOnHyperlinkClick()Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/net/Uri;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->k:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOnHyperlinkOpenFailed()Lkotlin/jvm/functions/Function0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->l:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setOnHyperlinkClick(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/net/Uri;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->k:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method

.method public final setOnHyperlinkOpenFailed(Lkotlin/jvm/functions/Function0;)V
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
    iput-object p1, p0, Lorg/xplatform/rules/impl/util/ContactsWebView;->l:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method
