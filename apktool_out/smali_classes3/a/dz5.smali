.class public abstract La/dz5;
.super Landroid/appwidget/AppWidgetProvider;
.source "SourceFile"


# instance fields
.field public a:La/yo4;

.field public b:La/fck0;

.field public c:La/afm0;

.field public d:La/wgu;

.field public e:La/wiu;

.field public f:La/au0;

.field public g:La/mj50;

.field public h:La/dpi0;

.field public i:La/ctf0;

.field public j:Z

.field public k:Z

.field public l:La/rzi;

.field public final m:La/sje;

.field public n:La/bby;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/tvk;->a:La/rwj;

    .line 5
    .line 6
    sget-object v0, La/dvj;->c:La/dvj;

    .line 7
    .line 8
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/dz5;->m:La/sje;

    .line 24
    .line 25
    return-void
.end method

.method public static q(Landroid/widget/RemoteViews;Landroid/content/Context;JJ)V
    .locals 4

    .line 1
    const v0, 0x7f0a0926

    .line 2
    .line 3
    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    invoke-virtual {p0, v0, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 7
    .line 8
    .line 9
    const v0, 0x7f0a0976

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 13
    .line 14
    .line 15
    const v0, 0x7f0a0927

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, v0, v2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 20
    .line 21
    .line 22
    const v0, 0x7f0a0c15

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    sget-object v0, La/rdj;->a:La/rdj;

    .line 33
    .line 34
    sget-object v0, La/efj;->d:La/efj;

    .line 35
    .line 36
    new-instance v1, La/znq0;

    .line 37
    .line 38
    invoke-direct {v1, p2, p3}, La/znq0;-><init>(J)V

    .line 39
    .line 40
    .line 41
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    const/16 p3, 0x38

    .line 44
    .line 45
    invoke-static {v1, v0, p2, v2, p3}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v3, La/znq0;

    .line 50
    .line 51
    invoke-direct {v3, p4, p5}, La/znq0;-><init>(J)V

    .line 52
    .line 53
    .line 54
    invoke-static {v3, v0, p2, v2, p3}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    filled-new-array {v1, p2}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    const p3, 0x7f13106c

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p3, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const p2, 0x7f0a0f4d

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p2, p1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public a()La/bz5;
    .locals 0

    .line 1
    sget-object p0, La/bz5;->c:La/bz5;

    .line 2
    .line 3
    return-object p0
.end method

.method public b()I
    .locals 0

    .line 1
    const p0, 0x7f0d003c

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public c()I
    .locals 0

    .line 1
    const p0, 0x7f0d003d

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final d(Landroid/content/Context;ILjava/lang/String;)Landroid/app/PendingIntent;
    .locals 1

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-virtual {p0}, La/dz5;->e()Landroid/appwidget/AppWidgetProvider;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p1, p0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    const-string p0, "widget_id"

    .line 18
    .line 19
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    invoke-virtual {v0, p0}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    const-string p0, "CUSTOM_INTENT"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 p2, 0x1f

    .line 42
    .line 43
    if-lt p0, p2, :cond_0

    .line 44
    .line 45
    const/high16 p0, 0xa000000

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/high16 p0, 0x8000000

    .line 49
    .line 50
    :goto_0
    const/4 p2, 0x0

    .line 51
    invoke-static {p1, p2, v0, p0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    return-object p0
.end method

.method public e()Landroid/appwidget/AppWidgetProvider;
    .locals 0

    .line 1
    return-object p0
.end method

.method public f()Landroid/widget/RemoteViewsService;
    .locals 0

    .line 1
    new-instance p0, Lorg/xplatform/widget/impl/presentation/favorites/AppWidgetFavoritesService;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xplatform/widget/impl/presentation/favorites/AppWidgetFavoritesService;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public g()I
    .locals 0

    .line 1
    const p0, 0x7f13086b

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final h()La/yo4;
    .locals 0

    .line 1
    iget-object p0, p0, La/dz5;->a:La/yo4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "widgetAnalytics"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final i()La/au0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dz5;->f:La/au0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "widgetFatmanLogger"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final j(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast p1, Landroid/app/Application;

    .line 12
    .line 13
    instance-of v0, p1, La/af3;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p1, La/af3;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, v1

    .line 22
    :goto_0
    const-class v0, La/ldv0;

    .line 23
    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, La/o5d0;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, La/ze3;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object p1, v1

    .line 46
    :goto_1
    instance-of v2, p1, La/ldv0;

    .line 47
    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-object v1, p1

    .line 52
    :goto_2
    check-cast v1, La/ldv0;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {v1}, La/ldv0;->a()La/rzi;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, La/dz5;->l:La/rzi;

    .line 61
    .line 62
    invoke-virtual {p1}, La/rzi;->i()La/yo4;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/dz5;->a:La/yo4;

    .line 67
    .line 68
    new-instance v0, La/fck0;

    .line 69
    .line 70
    iget-object v1, p1, La/rzi;->p:La/bn6;

    .line 71
    .line 72
    iget-object v2, p1, La/rzi;->q:La/je;

    .line 73
    .line 74
    const/16 v3, 0x12

    .line 75
    .line 76
    invoke-direct {v0, v1, v2, v3}, La/fck0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, La/dz5;->b:La/fck0;

    .line 80
    .line 81
    new-instance v0, La/afm0;

    .line 82
    .line 83
    const/16 v3, 0x11

    .line 84
    .line 85
    invoke-direct {v0, v1, v2, v3}, La/afm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, La/dz5;->c:La/afm0;

    .line 89
    .line 90
    iget-object v0, p1, La/rzi;->r:La/wgu;

    .line 91
    .line 92
    iput-object v0, p0, La/dz5;->d:La/wgu;

    .line 93
    .line 94
    iget-object v0, p1, La/rzi;->s:La/wiu;

    .line 95
    .line 96
    iput-object v0, p0, La/dz5;->e:La/wiu;

    .line 97
    .line 98
    iget-object v0, p1, La/rzi;->n:La/au0;

    .line 99
    .line 100
    iput-object v0, p0, La/dz5;->f:La/au0;

    .line 101
    .line 102
    new-instance v0, La/mj50;

    .line 103
    .line 104
    invoke-virtual {p1}, La/rzi;->h()La/yox;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-direct {v0, v1}, La/mj50;-><init>(La/yox;)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, La/dz5;->g:La/mj50;

    .line 112
    .line 113
    new-instance v0, La/dpi0;

    .line 114
    .line 115
    invoke-virtual {p1}, La/rzi;->h()La/yox;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-direct {v0, v1}, La/dpi0;-><init>(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iput-object v0, p0, La/dz5;->h:La/dpi0;

    .line 123
    .line 124
    iget-object p1, p1, La/rzi;->o:La/ctf0;

    .line 125
    .line 126
    iput-object p1, p0, La/dz5;->i:La/ctf0;

    .line 127
    .line 128
    return-void

    .line 129
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 130
    .line 131
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public k(Landroid/widget/RemoteViews;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;I)V
    .locals 7

    .line 1
    invoke-virtual {p3, p4}, Landroid/appwidget/AppWidgetManager;->getAppWidgetOptions(I)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    iget-boolean v0, p0, La/dz5;->j:Z

    .line 6
    .line 7
    const v1, 0x7f0a0c15

    .line 8
    .line 9
    .line 10
    const v2, 0x7f0a0927

    .line 11
    .line 12
    .line 13
    const v3, 0x7f0a0926

    .line 14
    .line 15
    .line 16
    const v4, 0x7f0a0976

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/16 v6, 0x8

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, v4, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v3, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 28
    .line 29
    .line 30
    const p3, 0x7f0a075b

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p3, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v2, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 40
    .line 41
    .line 42
    invoke-static {p2}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    const v0, 0x7f130677

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    const v0, 0x7f0a0f45

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0, p3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    const v0, 0x7f131111

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    const v0, 0x7f0a0220

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0, p3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    const-string p3, "refresh_event_click"

    .line 77
    .line 78
    invoke-virtual {p0, p2, p4, p3}, La/dz5;->d(Landroid/content/Context;ILjava/lang/String;)Landroid/app/PendingIntent;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p1, v0, p0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_0
    iget-boolean p0, p0, La/dz5;->k:Z

    .line 87
    .line 88
    if-eqz p0, :cond_1

    .line 89
    .line 90
    :try_start_0
    const-string p0, "key_start_date_prophylaxis"

    .line 91
    .line 92
    invoke-virtual {p3, p0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 93
    .line 94
    .line 95
    move-result-wide v2

    .line 96
    const-string p0, "key_end_date_prophylaxis"

    .line 97
    .line 98
    invoke-virtual {p3, p0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 99
    .line 100
    .line 101
    move-result-wide v4

    .line 102
    move-object v0, p1

    .line 103
    move-object v1, p2

    .line 104
    invoke-static/range {v0 .. v5}, La/dz5;->q(Landroid/widget/RemoteViews;Landroid/content/Context;JJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :catch_0
    move-exception v0

    .line 109
    move-object p0, v0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_1
    move-object v0, p1

    .line 115
    invoke-virtual {v0, v3, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v4, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v2, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public l()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final m()V
    .locals 4

    .line 1
    iget-object v0, p0, La/dz5;->g:La/mj50;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, v0, La/mj50;->a:La/yox;

    .line 7
    .line 8
    iget-object v0, v0, La/yox;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/vwb0;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    const-string v3, "NEED_AUTHORIZATION_LOG"

    .line 14
    .line 15
    invoke-static {v0, v3, v2}, La/ua80;->x(La/vwb0;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, La/dz5;->h:La/dpi0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, La/dpi0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/yox;

    .line 28
    .line 29
    iget-object v0, v0, La/yox;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La/vwb0;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v3, v1}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/dz5;->h()La/yo4;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, La/yo4;->a:La/kt2;

    .line 42
    .line 43
    const-string v1, "widget_favor_anonim"

    .line 44
    .line 45
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, La/dz5;->i()La/au0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object p0, p0, La/au0;->a:La/s1p;

    .line 53
    .line 54
    const-wide/16 v0, 0xc4f

    .line 55
    .line 56
    sget-object v2, La/xun;->a:La/xun;

    .line 57
    .line 58
    invoke-virtual {p0, v2, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-string p0, "updateNeedAuthorizationLogUseCase"

    .line 63
    .line 64
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :cond_1
    return-void

    .line 69
    :cond_2
    const-string p0, "needWidgetAuthorizationLogUseCase"

    .line 70
    .line 71
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v1
.end method

.method public final n(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1
    const-string v0, "widget_id"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    new-instance v2, Lkotlin/Pair;

    .line 15
    .line 16
    const-string v3, "top_live_error_data"

    .line 17
    .line 18
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lkotlin/Pair;

    .line 22
    .line 23
    const-string v4, "error_need_authorization"

    .line 24
    .line 25
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    filled-new-array {v2, v3}, [Lkotlin/Pair;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, p2, v1}, Landroid/appwidget/AppWidgetManager;->updateAppWidgetOptions(ILandroid/os/Bundle;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, La/dz5;->a()La/bz5;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    const/4 p2, 0x1

    .line 50
    if-eq p0, p2, :cond_1

    .line 51
    .line 52
    const/4 p2, 0x2

    .line 53
    if-ne p0, p2, :cond_0

    .line 54
    .line 55
    const-string p0, "action_update_top_all_games"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    const-string p0, "action_update_top_live_games"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const-string p0, "action_update_top_line_games"

    .line 66
    .line 67
    :goto_0
    invoke-static {p1}, La/gr00;->t(Landroid/content/Context;)La/gr00;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance p2, Landroid/content/Intent;

    .line 72
    .line 73
    invoke-direct {p2, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, La/gr00;->E(Landroid/content/Intent;)Z

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public o(JJJZZ)V
    .locals 10

    .line 1
    iget-object p0, p0, La/dz5;->b:La/fck0;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    if-eqz p7, :cond_0

    .line 6
    .line 7
    const-string v0, "widget_live_list"

    .line 8
    .line 9
    :goto_0
    move-object v8, v0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-string v0, "widget_line_list"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :goto_1
    iget-object v0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, La/bn6;

    .line 18
    .line 19
    move-wide v2, p1

    .line 20
    move-wide v4, p3

    .line 21
    move-wide v6, p5

    .line 22
    move/from16 v9, p7

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v9}, La/bn6;->d(JJJLjava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v1, p0

    .line 30
    check-cast v1, La/je;

    .line 31
    .line 32
    invoke-virtual/range {v1 .. v9}, La/je;->g(JJJLjava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const-string p0, "widgetLiveAndLineUseCase"

    .line 37
    .line 38
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    throw p0
.end method

.method public final onAppWidgetOptionsChanged(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/appwidget/AppWidgetProvider;->onAppWidgetOptionsChanged(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    new-instance p3, Landroid/content/ComponentName;

    .line 9
    .line 10
    invoke-virtual {p0}, La/dz5;->e()Landroid/appwidget/AppWidgetProvider;

    .line 11
    .line 12
    .line 13
    move-result-object p4

    .line 14
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p4

    .line 18
    invoke-direct {p3, p1, p4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p3}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2, p3}, La/dz5;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final onDeleted(Landroid/content/Context;[I)V
    .locals 4

    .line 1
    iget-object v0, p0, La/dz5;->h:La/dpi0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, v0, La/dpi0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/yox;

    .line 9
    .line 10
    iget-object v0, v0, La/yox;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/vwb0;

    .line 13
    .line 14
    const-string v2, "NEED_AUTHORIZATION_LOG"

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-virtual {v0, v2, v3}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onDeleted(Landroid/content/Context;[I)V

    .line 21
    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const-string p0, "widget_shared_prefs"

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-virtual {p1, p0, p2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string p1, "widget_language"

    .line 40
    .line 41
    invoke-interface {p0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void

    .line 49
    :cond_1
    const-string p0, "updateNeedAuthorizationLogUseCase"

    .line 50
    .line 51
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 12

    .line 1
    iget-object v0, p0, La/dz5;->l:La/rzi;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/dz5;->j(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/dz5;->e:La/wiu;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, La/wiu;->a()Ljava/util/Locale;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p1, v0}, La/u7x;->u(Landroid/content/Context;Ljava/util/Locale;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p0, "getLocaleUseCase"

    .line 24
    .line 25
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v5

    .line 29
    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move-object v0, v5

    .line 37
    :goto_1
    if-eqz v0, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x1

    .line 44
    const-wide/16 v3, 0x1f4

    .line 45
    .line 46
    const-wide/16 v6, 0x0

    .line 47
    .line 48
    const-string v8, "widget_any_button_clicked_time"

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    const-string v10, "widget_shared_prefs"

    .line 52
    .line 53
    sparse-switch v1, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    :cond_3
    :goto_2
    move-object v3, p0

    .line 57
    move-object v2, p1

    .line 58
    move-object v4, p2

    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :sswitch_0
    const-string v1, "refresh_event_click"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    invoke-virtual {p1, v10, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-interface {v2, v8, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    sub-long v5, v0, v5

    .line 87
    .line 88
    cmp-long v2, v5, v3

    .line 89
    .line 90
    if-lez v2, :cond_3

    .line 91
    .line 92
    invoke-virtual {p1, v10, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-interface {v2, v8, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1, p2}, La/dz5;->n(Landroid/content/Context;Landroid/content/Intent;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :sswitch_1
    const-string v1, "refresh_events_click"

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_4

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    const-string v0, "widget_id"

    .line 124
    .line 125
    const/4 v1, -0x1

    .line 126
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-ne v0, v1, :cond_5

    .line 131
    .line 132
    goto/16 :goto_3

    .line 133
    .line 134
    :cond_5
    if-eqz p1, :cond_3

    .line 135
    .line 136
    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 141
    .line 142
    new-instance v3, Lkotlin/Pair;

    .line 143
    .line 144
    const-string v4, "renew_animation_needed"

    .line 145
    .line 146
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v1, v0, v2}, Landroid/appwidget/AppWidgetManager;->updateAppWidgetOptions(ILandroid/os/Bundle;)V

    .line 158
    .line 159
    .line 160
    const v2, 0x7f0a0976

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v0, v2}, Landroid/appwidget/AppWidgetManager;->notifyAppWidgetViewDataChanged(II)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, p1, p2}, La/dz5;->n(Landroid/content/Context;Landroid/content/Intent;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :sswitch_2
    const-string v1, "games_events_click"

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_6

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    if-eqz p1, :cond_3

    .line 180
    .line 181
    new-instance v0, La/kk0;

    .line 182
    .line 183
    const/16 v1, 0x8

    .line 184
    .line 185
    invoke-direct {v0, p2, p0, p1, v1}, La/kk0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 186
    .line 187
    .line 188
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 189
    .line 190
    .line 191
    move-result-wide v1

    .line 192
    invoke-virtual {p1, v10, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-interface {v5, v8, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 200
    .line 201
    .line 202
    move-result-wide v5

    .line 203
    sub-long v5, v1, v5

    .line 204
    .line 205
    cmp-long v3, v5, v3

    .line 206
    .line 207
    if-lez v3, :cond_3

    .line 208
    .line 209
    invoke-virtual {p1, v10, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-interface {v3, v8, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, La/kk0;->invoke()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    goto/16 :goto_2

    .line 231
    .line 232
    :sswitch_3
    const-string v1, "authorization_event_click"

    .line 233
    .line 234
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-nez v0, :cond_7

    .line 239
    .line 240
    goto/16 :goto_2

    .line 241
    .line 242
    :cond_7
    invoke-virtual {p0}, La/dz5;->h()La/yo4;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    iget-object v0, v0, La/yo4;->a:La/kt2;

    .line 247
    .line 248
    new-instance v1, Lkotlin/Pair;

    .line 249
    .line 250
    const-string v3, "screen"

    .line 251
    .line 252
    const-string v4, "selected_anomin"

    .line 253
    .line 254
    invoke-direct {v1, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    invoke-static {v1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    const-string v3, "login_page_call"

    .line 262
    .line 263
    invoke-interface {v0, v3, v1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, La/dz5;->i()La/au0;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    sget-object v1, La/y1p;->b:La/y1p;

    .line 271
    .line 272
    iget-object v0, v0, La/au0;->a:La/s1p;

    .line 273
    .line 274
    const-wide/16 v3, 0xbdb

    .line 275
    .line 276
    const-string v1, "selected_anonim"

    .line 277
    .line 278
    invoke-static {v1, v0, v3, v4}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 279
    .line 280
    .line 281
    if-nez p1, :cond_8

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_8
    invoke-static {p1}, La/j120;->Q(Landroid/content/Context;)Landroid/content/Intent;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    if-nez v0, :cond_9

    .line 289
    .line 290
    :goto_3
    return-void

    .line 291
    :cond_9
    const-string v1, "REQUEST_FAVORITES_WIDGET"

    .line 292
    .line 293
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    const-string v1, "CUSTOM_INTENT"

    .line 298
    .line 299
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0, p1, p2}, La/dz5;->n(Landroid/content/Context;Landroid/content/Intent;)V

    .line 307
    .line 308
    .line 309
    goto/16 :goto_2

    .line 310
    .line 311
    :sswitch_4
    const-string v1, "android.intent.action.LOCALE_CHANGED"

    .line 312
    .line 313
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-nez v0, :cond_a

    .line 318
    .line 319
    goto/16 :goto_2

    .line 320
    .line 321
    :cond_a
    if-eqz p1, :cond_3

    .line 322
    .line 323
    iget-object v0, p0, La/dz5;->d:La/wgu;

    .line 324
    .line 325
    if-eqz v0, :cond_d

    .line 326
    .line 327
    invoke-virtual {v0}, La/wgu;->a()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {p1, v10, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    const-string v3, "widget_language"

    .line 339
    .line 340
    const-string v4, ""

    .line 341
    .line 342
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    if-nez v1, :cond_b

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_b
    move-object v4, v1

    .line 350
    :goto_4
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-nez v1, :cond_3

    .line 355
    .line 356
    invoke-virtual {p1, v10, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 372
    .line 373
    .line 374
    iget-object v0, p0, La/dz5;->n:La/bby;

    .line 375
    .line 376
    if-eqz v0, :cond_c

    .line 377
    .line 378
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-ne v0, v2, :cond_c

    .line 383
    .line 384
    iget-object v0, p0, La/dz5;->n:La/bby;

    .line 385
    .line 386
    if-eqz v0, :cond_c

    .line 387
    .line 388
    invoke-interface {v0, v5}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 389
    .line 390
    .line 391
    :cond_c
    sget-object v7, La/cz5;->a:La/cz5;

    .line 392
    .line 393
    new-instance v1, La/ee0;

    .line 394
    .line 395
    const/16 v6, 0xe

    .line 396
    .line 397
    move-object v3, p0

    .line 398
    move-object v2, p1

    .line 399
    move-object v4, p2

    .line 400
    invoke-direct/range {v1 .. v6}, La/ee0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 401
    .line 402
    .line 403
    const/16 v11, 0xe

    .line 404
    .line 405
    iget-object v6, v3, La/dz5;->m:La/sje;

    .line 406
    .line 407
    const/4 v8, 0x0

    .line 408
    const/4 v9, 0x0

    .line 409
    move-object v10, v1

    .line 410
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    iput-object p0, v3, La/dz5;->n:La/bby;

    .line 415
    .line 416
    goto :goto_5

    .line 417
    :cond_d
    const-string p0, "getLanguageUseCase"

    .line 418
    .line 419
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    throw v5

    .line 423
    :goto_5
    invoke-super {v3, v2, v4}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 424
    .line 425
    .line 426
    return-void

    .line 427
    :sswitch_data_0
    .sparse-switch
        -0x122164c -> :sswitch_4
        0x2e5f10dd -> :sswitch_3
        0x5d158ba0 -> :sswitch_2
        0x66fea5c6 -> :sswitch_1
        0x7e55403f -> :sswitch_0
    .end sparse-switch
.end method

.method public final onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-super/range {p0 .. p3}, Landroid/appwidget/AppWidgetProvider;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    .line 19
    .line 20
    .line 21
    sget-object v4, La/rdj;->a:La/rdj;

    .line 22
    .line 23
    iget-object v4, v0, La/dz5;->i:La/ctf0;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    if-eqz v4, :cond_3

    .line 27
    .line 28
    invoke-virtual {v4}, La/ctf0;->h()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v4}, La/rdj;->l(Z)V

    .line 33
    .line 34
    .line 35
    array-length v4, v3

    .line 36
    const/4 v6, 0x0

    .line 37
    move v7, v6

    .line 38
    :goto_0
    if-ge v7, v4, :cond_2

    .line 39
    .line 40
    aget v8, v3, v7

    .line 41
    .line 42
    new-instance v9, Landroid/widget/RemoteViews;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    invoke-virtual {v11}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    iget v11, v11, Landroid/content/res/Configuration;->uiMode:I

    .line 57
    .line 58
    const/16 v12, 0x20

    .line 59
    .line 60
    and-int/2addr v11, v12

    .line 61
    if-ne v11, v12, :cond_0

    .line 62
    .line 63
    invoke-virtual {v0}, La/dz5;->c()I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    invoke-virtual {v0}, La/dz5;->b()I

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    :goto_1
    invoke-direct {v9, v10, v11}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v8}, Landroid/appwidget/AppWidgetManager;->getAppWidgetOptions(I)Landroid/os/Bundle;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    const-string v11, "top_live_error_data"

    .line 80
    .line 81
    invoke-virtual {v10, v11, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    iput-boolean v11, v0, La/dz5;->j:Z

    .line 86
    .line 87
    const-string v11, "games_events_click"

    .line 88
    .line 89
    invoke-virtual {v0, v1, v8, v11}, La/dz5;->d(Landroid/content/Context;ILjava/lang/String;)Landroid/app/PendingIntent;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    const v12, 0x7f0a0976

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9, v12, v11}, Landroid/widget/RemoteViews;->setPendingIntentTemplate(ILandroid/app/PendingIntent;)V

    .line 97
    .line 98
    .line 99
    const-string v11, "show_prophylaxis"

    .line 100
    .line 101
    invoke-virtual {v10, v11, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    iput-boolean v11, v0, La/dz5;->k:Z

    .line 106
    .line 107
    const-string v11, "renew_animation_needed"

    .line 108
    .line 109
    invoke-virtual {v10, v11, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    const/16 v13, 0x8

    .line 114
    .line 115
    const v14, 0x7f0a0c18

    .line 116
    .line 117
    .line 118
    const v15, 0x7f0a0c16

    .line 119
    .line 120
    .line 121
    if-eqz v11, :cond_1

    .line 122
    .line 123
    invoke-virtual {v9, v15, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v14, v13}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_1
    invoke-virtual {v9, v15, v13}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v9, v14, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 134
    .line 135
    .line 136
    :goto_2
    const-string v11, "refresh_events_click"

    .line 137
    .line 138
    invoke-virtual {v0, v1, v8, v11}, La/dz5;->d(Landroid/content/Context;ILjava/lang/String;)Landroid/app/PendingIntent;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    const v13, 0x7f0a0c15

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9, v13, v11}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 146
    .line 147
    .line 148
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    invoke-static {v11}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    invoke-virtual {v11}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    .line 161
    .line 162
    .line 163
    move-result-wide v13

    .line 164
    const-wide/16 v15, 0x3e8

    .line 165
    .line 166
    div-long/2addr v13, v15

    .line 167
    const-string v11, "upload_data_time"

    .line 168
    .line 169
    invoke-virtual {v10, v11, v13, v14}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 170
    .line 171
    .line 172
    move-result-wide v10

    .line 173
    sget-object v13, La/rdj;->a:La/rdj;

    .line 174
    .line 175
    invoke-static {v1}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 176
    .line 177
    .line 178
    move-result v13

    .line 179
    sget-object v14, La/ykq0;->c:La/ykq0;

    .line 180
    .line 181
    new-instance v15, La/znq0;

    .line 182
    .line 183
    invoke-direct {v15, v10, v11}, La/znq0;-><init>(J)V

    .line 184
    .line 185
    .line 186
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    const/16 v11, 0xf8

    .line 191
    .line 192
    invoke-static {v15, v14, v10, v5, v11}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    const v11, 0x7f0a0c19

    .line 197
    .line 198
    .line 199
    invoke-virtual {v9, v11, v10}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v1}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    invoke-virtual {v0}, La/dz5;->g()I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    invoke-virtual {v10, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    const v11, 0x7f0a0f54

    .line 215
    .line 216
    .line 217
    invoke-virtual {v9, v11, v10}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    new-instance v10, Landroid/content/Intent;

    .line 221
    .line 222
    invoke-virtual {v0}, La/dz5;->f()Landroid/widget/RemoteViewsService;

    .line 223
    .line 224
    .line 225
    move-result-object v11

    .line 226
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    invoke-direct {v10, v1, v11}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 231
    .line 232
    .line 233
    const-string v11, "appWidgetId"

    .line 234
    .line 235
    invoke-virtual {v10, v11, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, La/dz5;->e()Landroid/appwidget/AppWidgetProvider;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    const-string v13, "key_widget_provider_class"

    .line 251
    .line 252
    invoke-virtual {v10, v13, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 253
    .line 254
    .line 255
    const-string v11, "key_count_item_for_notification"

    .line 256
    .line 257
    invoke-virtual {v0}, La/dz5;->l()I

    .line 258
    .line 259
    .line 260
    move-result v13

    .line 261
    invoke-virtual {v10, v11, v13}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 262
    .line 263
    .line 264
    const/4 v11, 0x1

    .line 265
    invoke-virtual {v10, v11}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    invoke-static {v11}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 270
    .line 271
    .line 272
    move-result-object v11

    .line 273
    invoke-virtual {v10, v11}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v9, v12, v10}, Landroid/widget/RemoteViews;->setRemoteAdapter(ILandroid/content/Intent;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v9, v1, v2, v8}, La/dz5;->k(Landroid/widget/RemoteViews;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v8, v9}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 283
    .line 284
    .line 285
    add-int/lit8 v7, v7, 0x1

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_2
    invoke-super/range {p0 .. p3}, Landroid/appwidget/AppWidgetProvider;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :cond_3
    const-string v0, "resourceManager"

    .line 294
    .line 295
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v5
.end method

.method public final p(Landroid/widget/RemoteViews;Landroid/content/Context;I)V
    .locals 2

    .line 1
    const v0, 0x7f0a0926

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 6
    .line 7
    .line 8
    const v0, 0x7f0a075b

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const v1, 0x7f130dc5

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const v1, 0x7f0a0f45

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p2}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const v1, 0x7f130c92

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const v1, 0x7f0a0220

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v1, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    const-string v0, "authorization_event_click"

    .line 49
    .line 50
    invoke-virtual {p0, p2, p3, v0}, La/dz5;->d(Landroid/content/Context;ILjava/lang/String;)Landroid/app/PendingIntent;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p1, v1, p0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
