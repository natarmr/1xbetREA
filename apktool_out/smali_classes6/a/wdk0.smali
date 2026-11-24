.class public final La/wdk0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function0;

.field public final b:Lkotlin/jvm/functions/Function0;

.field public final c:Lkotlin/jvm/functions/Function0;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 3

    .line 32
    new-instance v0, La/pdk0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La/pdk0;-><init>(B)V

    .line 33
    new-instance v1, La/pdk0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, La/pdk0;-><init>(B)V

    .line 34
    invoke-direct {p0, p1, v0, v1}, La/wdk0;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/wdk0;->a:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    iput-object p2, p0, La/wdk0;->b:Lkotlin/jvm/functions/Function0;

    .line 7
    .line 8
    iput-object p3, p0, La/wdk0;->c:Lkotlin/jvm/functions/Function0;

    .line 9
    .line 10
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/wdk0;->d:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    new-instance p1, Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/wdk0;->e:Ljava/util/Set;

    .line 30
    .line 31
    return-void
.end method

.method public static a(La/wdk0;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-string p0, "request_key_notification_updated"

    .line 8
    .line 9
    invoke-static {p1, p0}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static b(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 22
    .line 23
    instance-of v3, v2, La/yx5;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    instance-of v3, v2, La/by5;

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    instance-of v2, v2, La/i620;

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-object v0
.end method

.method public static c(La/kxq;Landroid/view/View;)Landroid/view/View;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_4

    .line 5
    .line 6
    :cond_0
    sget-object p1, La/ujk;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    new-instance v1, La/vbk;

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-direct {v1, v2}, La/vbk;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v1}, La/w3d;->y(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 15
    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Landroid/view/View;

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :cond_3
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_6

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v2, v1

    .line 69
    check-cast v2, Landroid/view/View;

    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    :goto_1
    instance-of v3, v2, Landroid/app/Activity;

    .line 91
    .line 92
    if-eqz v3, :cond_4

    .line 93
    .line 94
    check-cast v2, Landroid/app/Activity;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    instance-of v3, v2, Landroid/content/ContextWrapper;

    .line 98
    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    check-cast v2, Landroid/content/ContextWrapper;

    .line 102
    .line 103
    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    move-object v2, v0

    .line 112
    :goto_2
    if-ne v2, p0, :cond_3

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    move-object v1, v0

    .line 116
    :goto_3
    check-cast v1, Landroid/view/View;

    .line 117
    .line 118
    if-eqz v1, :cond_8

    .line 119
    .line 120
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    const p1, 0x1020002

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    check-cast p0, Landroid/view/ViewGroup;

    .line 132
    .line 133
    if-eqz p0, :cond_7

    .line 134
    .line 135
    return-object p0

    .line 136
    :cond_7
    return-object v1

    .line 137
    :cond_8
    :goto_4
    return-object v0
.end method

.method public static d(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-interface {p0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v1, v0

    .line 31
    :goto_0
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    iget-object p0, p0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 42
    .line 43
    invoke-virtual {p0}, La/pmi;->p()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    invoke-static {p0}, La/wdk0;->b(Ljava/util/List;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    return-object p0

    .line 54
    :catch_0
    :cond_2
    return-object v0
.end method

.method public static e(Landroid/view/View;)I
    .locals 3

    .line 1
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-static {p0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p0, La/xiv0;->a:La/uiv0;

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/uiv0;->i(I)La/pfx;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget v1, v1, La/pfx;->d:I

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-virtual {p0, v2}, La/uiv0;->i(I)La/pfx;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget v2, v2, La/pfx;->d:I

    .line 26
    .line 27
    invoke-virtual {p0, v0}, La/uiv0;->u(I)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    sub-int/2addr v1, v2

    .line 34
    return v1

    .line 35
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public static f(Ljava/util/List;)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    invoke-static {p0}, La/wdk0;->d(Ljava/util/List;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0}, La/wdk0;->d(Ljava/util/List;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    sget-object p0, La/iun;->a:La/iun;

    .line 21
    .line 22
    :cond_1
    invoke-static {p0}, La/wdk0;->f(Ljava/util/List;)Landroidx/fragment/app/Fragment;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_2
    :goto_0
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Landroidx/fragment/app/Fragment;

    .line 32
    .line 33
    return-object p0
.end method

.method public static g(Ljava/util/List;)Landroidx/fragment/app/Fragment;
    .locals 6

    .line 1
    invoke-static {p0}, La/wdk0;->d(Ljava/util/List;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    move-object v4, v3

    .line 23
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 24
    .line 25
    instance-of v5, v4, La/i620;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v3, v1

    .line 37
    :goto_0
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move-object v3, v1

    .line 41
    :goto_1
    if-nez v3, :cond_6

    .line 42
    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    invoke-static {p0}, La/wdk0;->d(Ljava/util/List;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-nez p0, :cond_4

    .line 57
    .line 58
    sget-object p0, La/iun;->a:La/iun;

    .line 59
    .line 60
    :cond_4
    invoke-static {p0}, La/wdk0;->g(Ljava/util/List;)Landroidx/fragment/app/Fragment;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_5
    :goto_2
    return-object v1

    .line 66
    :cond_6
    return-object v3
.end method

.method public static i(La/wdk0;La/xdk0;Landroid/view/View;)La/mdk0;
    .locals 3

    .line 1
    new-instance v0, La/pdk0;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, La/pdk0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/l3c0;

    .line 8
    .line 9
    const/16 v2, 0xf

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, La/l3c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2, p1, v1}, La/wdk0;->h(Landroid/view/View;La/xdk0;Lkotlin/jvm/functions/Function0;)La/rrm;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, La/g46;->e()V

    .line 19
    .line 20
    .line 21
    new-instance p1, La/mdk0;

    .line 22
    .line 23
    invoke-direct {p1, p0}, La/mdk0;-><init>(La/rrm;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;
    .locals 13

    .line 1
    and-int/lit8 v1, p8, 0x4

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    move-object v1, v2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object/from16 v1, p3

    .line 9
    .line 10
    :goto_0
    and-int/lit8 v3, p8, 0x8

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    new-instance v3, La/pdk0;

    .line 16
    .line 17
    invoke-direct {v3, v4}, La/pdk0;-><init>(B)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object/from16 v3, p4

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v5, p8, 0x10

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    if-eqz v5, :cond_2

    .line 27
    .line 28
    move v5, v6

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move/from16 v5, p5

    .line 31
    .line 32
    :goto_2
    and-int/lit8 v7, p8, 0x20

    .line 33
    .line 34
    if-eqz v7, :cond_3

    .line 35
    .line 36
    move v7, v6

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    move/from16 v7, p6

    .line 39
    .line 40
    :goto_3
    and-int/lit8 v8, p8, 0x40

    .line 41
    .line 42
    if-eqz v8, :cond_4

    .line 43
    .line 44
    move-object v8, v2

    .line 45
    goto :goto_4

    .line 46
    :cond_4
    move-object/from16 v8, p7

    .line 47
    .line 48
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {p2, v1}, La/wdk0;->c(La/kxq;Landroid/view/View;)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    const v10, 0x1020002

    .line 59
    .line 60
    .line 61
    if-nez v9, :cond_a

    .line 62
    .line 63
    invoke-virtual {p2}, La/kxq;->r()La/v1r;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    iget-object v9, v9, Landroidx/fragment/app/e;->c:La/pmi;

    .line 68
    .line 69
    invoke-virtual {v9}, La/pmi;->p()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v9}, La/wdk0;->b(Ljava/util/List;)Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-static {v9}, La/wdk0;->g(Ljava/util/List;)Landroidx/fragment/app/Fragment;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    instance-of v12, v11, La/sik;

    .line 85
    .line 86
    if-eqz v12, :cond_5

    .line 87
    .line 88
    check-cast v11, La/sik;

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_5
    move-object v11, v2

    .line 92
    :goto_5
    if-eqz v11, :cond_6

    .line 93
    .line 94
    invoke-virtual {v11}, La/sik;->A0()Landroid/app/Dialog;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    if-eqz v11, :cond_6

    .line 99
    .line 100
    invoke-virtual {v11, v10}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    check-cast v11, Landroid/view/ViewGroup;

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_6
    move-object v11, v2

    .line 108
    :goto_6
    invoke-static {v9}, La/wdk0;->f(Ljava/util/List;)Landroidx/fragment/app/Fragment;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    instance-of v12, v9, La/by5;

    .line 113
    .line 114
    if-eqz v12, :cond_7

    .line 115
    .line 116
    check-cast v9, La/by5;

    .line 117
    .line 118
    goto :goto_7

    .line 119
    :cond_7
    move-object v9, v2

    .line 120
    :goto_7
    if-eqz v9, :cond_9

    .line 121
    .line 122
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->S()Z

    .line 123
    .line 124
    .line 125
    move-result v12

    .line 126
    if-eqz v12, :cond_8

    .line 127
    .line 128
    goto :goto_8

    .line 129
    :cond_8
    move-object v9, v2

    .line 130
    :goto_8
    if-eqz v9, :cond_9

    .line 131
    .line 132
    invoke-virtual {v9}, La/sik;->A0()Landroid/app/Dialog;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    if-eqz v9, :cond_9

    .line 137
    .line 138
    invoke-virtual {v9}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    if-eqz v9, :cond_9

    .line 143
    .line 144
    invoke-virtual {v9, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    check-cast v9, Landroid/view/ViewGroup;

    .line 149
    .line 150
    goto :goto_9

    .line 151
    :cond_9
    move-object v9, v2

    .line 152
    :goto_9
    if-eqz v11, :cond_a

    .line 153
    .line 154
    move-object v9, v11

    .line 155
    :cond_a
    if-nez v9, :cond_d

    .line 156
    .line 157
    if-nez v1, :cond_c

    .line 158
    .line 159
    invoke-virtual {p2, v10}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    if-eqz v10, :cond_b

    .line 164
    .line 165
    goto :goto_a

    .line 166
    :cond_b
    const-string p0, "Container or activity must not be null"

    .line 167
    .line 168
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-object v2

    .line 172
    :cond_c
    move-object v10, v1

    .line 173
    goto :goto_a

    .line 174
    :cond_d
    move-object v10, v9

    .line 175
    :goto_a
    if-eqz v9, :cond_e

    .line 176
    .line 177
    goto :goto_b

    .line 178
    :cond_e
    move v6, v4

    .line 179
    :goto_b
    new-instance v9, La/qdk0;

    .line 180
    .line 181
    invoke-direct {v9, v3, v5, p0, v7}, La/qdk0;-><init>(Lkotlin/jvm/functions/Function0;ZLa/wdk0;Z)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v10, p1, v9}, La/wdk0;->h(Landroid/view/View;La/xdk0;Lkotlin/jvm/functions/Function0;)La/rrm;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    iget-object v10, v9, La/g46;->i:La/f46;

    .line 189
    .line 190
    new-instance v11, Ljava/lang/ref/WeakReference;

    .line 191
    .line 192
    invoke-direct {v11, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v10}, Landroid/view/View;->isLaidOut()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_15

    .line 203
    .line 204
    invoke-virtual {v10}, Landroid/view/View;->isLayoutRequested()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-nez v0, :cond_15

    .line 209
    .line 210
    invoke-virtual {v11}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, La/kxq;

    .line 215
    .line 216
    if-eqz v0, :cond_14

    .line 217
    .line 218
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    if-nez v11, :cond_f

    .line 223
    .line 224
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    if-nez v11, :cond_f

    .line 229
    .line 230
    invoke-virtual {v10}, Landroid/view/View;->isAttachedToWindow()Z

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    if-nez v11, :cond_10

    .line 235
    .line 236
    :cond_f
    move-object v0, v2

    .line 237
    :cond_10
    if-eqz v0, :cond_14

    .line 238
    .line 239
    invoke-static {v0}, La/zdx;->A(La/kxq;)La/ba50;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iget-object v0, v0, La/ba50;->a:La/p7m0;

    .line 244
    .line 245
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    check-cast v0, La/db50;

    .line 250
    .line 251
    iget-object v11, v0, La/db50;->b:Ljava/lang/Float;

    .line 252
    .line 253
    if-eqz v6, :cond_11

    .line 254
    .line 255
    invoke-virtual {p0, v9}, La/wdk0;->p(La/rrm;)V

    .line 256
    .line 257
    .line 258
    goto :goto_c

    .line 259
    :cond_11
    iget-boolean v0, v0, La/db50;->a:Z

    .line 260
    .line 261
    if-nez v0, :cond_12

    .line 262
    .line 263
    invoke-virtual {v10}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-static {v9, v0, v4, v8}, La/wdk0;->o(La/rrm;Landroid/content/res/Resources;ILjava/lang/Integer;)V

    .line 271
    .line 272
    .line 273
    goto :goto_c

    .line 274
    :cond_12
    if-eqz v11, :cond_13

    .line 275
    .line 276
    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    invoke-virtual {p0, v9, v0}, La/wdk0;->m(La/rrm;F)V

    .line 281
    .line 282
    .line 283
    goto :goto_c

    .line 284
    :cond_13
    invoke-virtual {v10}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-static {v9, v0, v4}, La/wdk0;->n(La/rrm;Landroid/content/res/Resources;I)V

    .line 292
    .line 293
    .line 294
    :cond_14
    :goto_c
    move v4, v6

    .line 295
    move-object v0, v8

    .line 296
    move-object v6, v9

    .line 297
    goto :goto_d

    .line 298
    :cond_15
    new-instance v0, La/tdk0;

    .line 299
    .line 300
    move-object/from16 p5, p0

    .line 301
    .line 302
    move-object p2, v0

    .line 303
    move/from16 p4, v6

    .line 304
    .line 305
    move-object/from16 p7, v8

    .line 306
    .line 307
    move-object/from16 p6, v9

    .line 308
    .line 309
    move-object/from16 p3, v11

    .line 310
    .line 311
    invoke-direct/range {p2 .. p7}, La/tdk0;-><init>(Ljava/lang/ref/WeakReference;ZLa/wdk0;La/rrm;Ljava/lang/Integer;)V

    .line 312
    .line 313
    .line 314
    move-object v8, p2

    .line 315
    move/from16 v4, p4

    .line 316
    .line 317
    move-object/from16 v6, p6

    .line 318
    .line 319
    move-object/from16 v0, p7

    .line 320
    .line 321
    invoke-virtual {v10, v8}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 322
    .line 323
    .line 324
    :goto_d
    invoke-virtual {v6}, La/g46;->e()V

    .line 325
    .line 326
    .line 327
    if-nez v1, :cond_16

    .line 328
    .line 329
    new-instance v1, La/rdk0;

    .line 330
    .line 331
    move-object/from16 p3, p0

    .line 332
    .line 333
    move-object/from16 p4, p1

    .line 334
    .line 335
    move-object/from16 p8, v0

    .line 336
    .line 337
    move-object p2, v1

    .line 338
    move-object/from16 p5, v3

    .line 339
    .line 340
    move/from16 p6, v5

    .line 341
    .line 342
    move/from16 p7, v7

    .line 343
    .line 344
    invoke-direct/range {p2 .. p8}, La/rdk0;-><init>(La/wdk0;La/xdk0;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;)V

    .line 345
    .line 346
    .line 347
    move-object v2, p2

    .line 348
    :cond_16
    if-eqz v4, :cond_17

    .line 349
    .line 350
    new-instance p0, La/ldk0;

    .line 351
    .line 352
    invoke-direct {p0, v6}, La/ldk0;-><init>(La/rrm;)V

    .line 353
    .line 354
    .line 355
    iput-object v2, p0, La/ldk0;->b:La/rdk0;

    .line 356
    .line 357
    return-object p0

    .line 358
    :cond_17
    new-instance p0, La/mdk0;

    .line 359
    .line 360
    invoke-direct {p0, v6}, La/mdk0;-><init>(La/rrm;)V

    .line 361
    .line 362
    .line 363
    iput-object v2, p0, La/mdk0;->b:La/rdk0;

    .line 364
    .line 365
    return-object p0
.end method

.method public static k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;
    .locals 13

    .line 1
    move/from16 v0, p7

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move-object v1, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object/from16 v1, p3

    .line 11
    .line 12
    :goto_0
    and-int/lit8 v3, v0, 0x8

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    move-object v10, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move-object/from16 v10, p4

    .line 19
    .line 20
    :goto_1
    and-int/lit8 v3, v0, 0x10

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    move v12, v4

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move/from16 v12, p5

    .line 28
    .line 29
    :goto_2
    and-int/lit8 v3, v0, 0x20

    .line 30
    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    move v6, v4

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    const/4 v3, 0x1

    .line 36
    move v6, v3

    .line 37
    :goto_3
    new-instance v3, La/pdk0;

    .line 38
    .line 39
    const/4 v5, 0x4

    .line 40
    invoke-direct {v3, v5}, La/pdk0;-><init>(B)V

    .line 41
    .line 42
    .line 43
    and-int/lit16 v0, v0, 0x200

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    move-object v11, v2

    .line 48
    goto :goto_4

    .line 49
    :cond_4
    move-object/from16 v11, p6

    .line 50
    .line 51
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {p2, v10}, La/wdk0;->c(La/kxq;Landroid/view/View;)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    if-nez v10, :cond_8

    .line 69
    .line 70
    if-nez v8, :cond_7

    .line 71
    .line 72
    const v0, 0x1020002

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-nez v0, :cond_9

    .line 80
    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    goto :goto_5

    .line 88
    :cond_5
    move-object v0, v2

    .line 89
    :goto_5
    if-eqz v0, :cond_6

    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_6
    const-string p0, "Container or activity must not be null"

    .line 93
    .line 94
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object v2

    .line 98
    :cond_7
    move-object v0, v8

    .line 99
    goto :goto_6

    .line 100
    :cond_8
    move-object v0, v10

    .line 101
    :cond_9
    :goto_6
    new-instance v1, La/o0k0;

    .line 102
    .line 103
    const/4 v5, 0x2

    .line 104
    invoke-direct {v1, v3, p0, v5}, La/o0k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0, p1, v1}, La/wdk0;->h(Landroid/view/View;La/xdk0;Lkotlin/jvm/functions/Function0;)La/rrm;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    iget-object p1, v9, La/g46;->i:La/f46;

    .line 112
    .line 113
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 114
    .line 115
    invoke-direct {v5, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_12

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-nez p2, :cond_12

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    check-cast p2, La/kxq;

    .line 138
    .line 139
    if-eqz p2, :cond_13

    .line 140
    .line 141
    invoke-virtual {p2}, Landroid/app/Activity;->isFinishing()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_b

    .line 146
    .line 147
    invoke-virtual {p2}, Landroid/app/Activity;->isDestroyed()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-nez v0, :cond_b

    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_a

    .line 158
    .line 159
    goto :goto_7

    .line 160
    :cond_a
    move-object v2, p2

    .line 161
    :cond_b
    :goto_7
    if-eqz v2, :cond_13

    .line 162
    .line 163
    if-eqz v6, :cond_c

    .line 164
    .line 165
    invoke-static {p1}, La/wdk0;->e(Landroid/view/View;)I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    :cond_c
    invoke-static {v2}, La/zdx;->A(La/kxq;)La/ba50;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    iget-object p2, p2, La/ba50;->a:La/p7m0;

    .line 174
    .line 175
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    check-cast p2, La/db50;

    .line 180
    .line 181
    iget-object v0, p2, La/db50;->b:Ljava/lang/Float;

    .line 182
    .line 183
    if-eqz v8, :cond_d

    .line 184
    .line 185
    invoke-virtual {p0, v9}, La/wdk0;->p(La/rrm;)V

    .line 186
    .line 187
    .line 188
    goto :goto_9

    .line 189
    :cond_d
    iget-boolean p2, p2, La/db50;->a:Z

    .line 190
    .line 191
    if-nez p2, :cond_e

    .line 192
    .line 193
    if-nez v10, :cond_e

    .line 194
    .line 195
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-static {v9, p0, v4, v11}, La/wdk0;->o(La/rrm;Landroid/content/res/Resources;ILjava/lang/Integer;)V

    .line 203
    .line 204
    .line 205
    goto :goto_9

    .line 206
    :cond_e
    if-eqz v0, :cond_f

    .line 207
    .line 208
    if-nez v10, :cond_f

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    invoke-virtual {p0, v9, p1}, La/wdk0;->m(La/rrm;F)V

    .line 215
    .line 216
    .line 217
    goto :goto_9

    .line 218
    :cond_f
    if-nez v12, :cond_11

    .line 219
    .line 220
    if-eqz p2, :cond_10

    .line 221
    .line 222
    if-nez v10, :cond_10

    .line 223
    .line 224
    goto :goto_8

    .line 225
    :cond_10
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {v9, p0, v4, v11}, La/wdk0;->o(La/rrm;Landroid/content/res/Resources;ILjava/lang/Integer;)V

    .line 233
    .line 234
    .line 235
    goto :goto_9

    .line 236
    :cond_11
    :goto_8
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-static {v9, p0, v4}, La/wdk0;->n(La/rrm;Landroid/content/res/Resources;I)V

    .line 244
    .line 245
    .line 246
    goto :goto_9

    .line 247
    :cond_12
    new-instance v4, La/udk0;

    .line 248
    .line 249
    move-object v7, p0

    .line 250
    invoke-direct/range {v4 .. v12}, La/udk0;-><init>(Ljava/lang/ref/WeakReference;ZLa/wdk0;Landroid/view/View;La/rrm;Landroid/view/View;Ljava/lang/Integer;Z)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v4}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 254
    .line 255
    .line 256
    :cond_13
    :goto_9
    invoke-virtual {v9}, La/g46;->e()V

    .line 257
    .line 258
    .line 259
    if-eqz v8, :cond_14

    .line 260
    .line 261
    new-instance p0, La/ldk0;

    .line 262
    .line 263
    invoke-direct {p0, v9}, La/ldk0;-><init>(La/rrm;)V

    .line 264
    .line 265
    .line 266
    return-object p0

    .line 267
    :cond_14
    new-instance p0, La/mdk0;

    .line 268
    .line 269
    invoke-direct {p0, v9}, La/mdk0;-><init>(La/rrm;)V

    .line 270
    .line 271
    .line 272
    return-object p0
.end method

.method public static l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V
    .locals 7

    .line 1
    sget-object v4, La/qek0;->a:La/qek0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, La/zw8;

    .line 10
    .line 11
    const-string v1, "request_key_notification_updated"

    .line 12
    .line 13
    const-string v2, "bundle_key_notification_update"

    .line 14
    .line 15
    move-object v3, p0

    .line 16
    move-object v5, p1

    .line 17
    move v6, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/zw8;-><init>(Ljava/lang/String;Ljava/lang/String;La/wdk0;La/sek0;Landroidx/fragment/app/Fragment;Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {v5, v1, v0}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static n(La/rrm;Landroid/content/res/Resources;I)V
    .locals 3

    .line 1
    const v0, 0x7f070074

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v1, 0x7f0706c1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const v2, 0x7f0706d0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    add-int/2addr p2, v0

    .line 23
    div-int/lit8 v1, v1, 0x2

    .line 24
    .line 25
    add-int/2addr v1, p2

    .line 26
    sub-int/2addr v1, p1

    .line 27
    iget-object p0, p0, La/g46;->i:La/f46;

    .line 28
    .line 29
    int-to-float p1, v1

    .line 30
    neg-float p1, p1

    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static o(La/rrm;Landroid/content/res/Resources;ILjava/lang/Integer;)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const p3, 0x7f070656

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    add-int/2addr p1, p2

    .line 16
    iget-object p0, p0, La/g46;->i:La/f46;

    .line 17
    .line 18
    int-to-float p1, p1

    .line 19
    neg-float p1, p1

    .line 20
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final h(Landroid/view/View;La/xdk0;Lkotlin/jvm/functions/Function0;)La/rrm;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/wdk0;->a:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    const-string v3, "monochromeWithWhiteIcon"

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    move-object v2, v3

    .line 18
    :cond_0
    sget-object v4, La/rrm;->B:La/sje;

    .line 19
    .line 20
    iget-object v4, v1, La/xdk0;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v5, v1, La/xdk0;->c:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v6, v1, La/xdk0;->f:Ljava/lang/Integer;

    .line 25
    .line 26
    iget-object v7, v1, La/xdk0;->d:La/idk0;

    .line 27
    .line 28
    iget-object v8, v1, La/xdk0;->e:La/kdk0;

    .line 29
    .line 30
    iget-object v9, v1, La/xdk0;->a:La/sek0;

    .line 31
    .line 32
    sget-object v10, La/rek0;->b:La/rek0;

    .line 33
    .line 34
    sget-object v11, La/qek0;->a:La/qek0;

    .line 35
    .line 36
    sget-object v12, La/pek0;->a:La/pek0;

    .line 37
    .line 38
    sget-object v13, La/mek0;->a:La/gle0;

    .line 39
    .line 40
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v13

    .line 47
    sparse-switch v13, :sswitch_data_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :sswitch_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    sget-object v2, La/mek0;->b:La/mek0;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :sswitch_1
    const-string v3, "colloredBackgroundNoIcon"

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    sget-object v2, La/mek0;->e:La/mek0;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :sswitch_2
    const-string v3, "monochromeWithColloredIcon"

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    sget-object v2, La/mek0;->d:La/mek0;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :sswitch_3
    const-string v3, "monochromeNoIcon"

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    :cond_3
    :goto_0
    sget-object v2, La/mek0;->b:La/mek0;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    sget-object v2, La/mek0;->c:La/mek0;

    .line 96
    .line 97
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    const/4 v3, 0x2

    .line 102
    const/4 v13, 0x3

    .line 103
    const/4 v14, 0x1

    .line 104
    const/4 v15, 0x0

    .line 105
    if-eqz v2, :cond_e

    .line 106
    .line 107
    if-eq v2, v14, :cond_d

    .line 108
    .line 109
    if-eq v2, v3, :cond_9

    .line 110
    .line 111
    if-ne v2, v13, :cond_8

    .line 112
    .line 113
    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_5

    .line 118
    .line 119
    sget-object v2, La/zdk0;->e:La/zdk0;

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_6

    .line 127
    .line 128
    sget-object v2, La/aek0;->e:La/aek0;

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_6
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_7

    .line 136
    .line 137
    sget-object v2, La/bek0;->e:La/bek0;

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 141
    .line 142
    .line 143
    return-object v15

    .line 144
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 145
    .line 146
    .line 147
    return-object v15

    .line 148
    :cond_9
    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_a

    .line 153
    .line 154
    sget-object v2, La/eek0;->e:La/eek0;

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_a
    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_b

    .line 162
    .line 163
    sget-object v2, La/fek0;->e:La/fek0;

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_b
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_c

    .line 171
    .line 172
    sget-object v2, La/gek0;->e:La/gek0;

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 176
    .line 177
    .line 178
    return-object v15

    .line 179
    :cond_d
    sget-object v2, La/dek0;->c:La/dek0;

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_e
    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_f

    .line 187
    .line 188
    sget-object v2, La/hek0;->d:La/hek0;

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_f
    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_10

    .line 196
    .line 197
    sget-object v2, La/iek0;->d:La/iek0;

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_10
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_33

    .line 205
    .line 206
    sget-object v2, La/jek0;->d:La/jek0;

    .line 207
    .line 208
    :goto_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    sget-object v9, La/jmu0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 212
    .line 213
    move-object/from16 v9, p1

    .line 214
    .line 215
    move-object v10, v15

    .line 216
    :goto_3
    instance-of v11, v9, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 217
    .line 218
    if-eqz v11, :cond_11

    .line 219
    .line 220
    check-cast v9, Landroid/view/ViewGroup;

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_11
    instance-of v11, v9, Landroid/widget/FrameLayout;

    .line 224
    .line 225
    if-eqz v11, :cond_13

    .line 226
    .line 227
    move-object v10, v9

    .line 228
    check-cast v10, Landroid/widget/FrameLayout;

    .line 229
    .line 230
    invoke-virtual {v10}, Landroid/view/View;->getId()I

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    const v11, 0x1020002

    .line 235
    .line 236
    .line 237
    if-ne v10, v11, :cond_12

    .line 238
    .line 239
    check-cast v9, Landroid/view/ViewGroup;

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_12
    move-object v10, v9

    .line 243
    check-cast v10, Landroid/view/ViewGroup;

    .line 244
    .line 245
    :cond_13
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    instance-of v11, v9, Landroid/view/View;

    .line 250
    .line 251
    if-eqz v11, :cond_14

    .line 252
    .line 253
    check-cast v9, Landroid/view/View;

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_14
    move-object v9, v15

    .line 257
    :goto_4
    if-nez v9, :cond_32

    .line 258
    .line 259
    move-object v9, v10

    .line 260
    :goto_5
    if-eqz v9, :cond_31

    .line 261
    .line 262
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 267
    .line 268
    .line 269
    move-result-object v11

    .line 270
    const v12, 0x7f0706b5

    .line 271
    .line 272
    .line 273
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    invoke-static {v10}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    const v15, 0x7f0d0585

    .line 282
    .line 283
    .line 284
    const/4 v13, 0x0

    .line 285
    invoke-virtual {v12, v15, v9, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    check-cast v12, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;

    .line 293
    .line 294
    iget-object v15, v12, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->q:La/zkk;

    .line 295
    .line 296
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 297
    .line 298
    .line 299
    move-result v17

    .line 300
    if-nez v17, :cond_15

    .line 301
    .line 302
    const v17, 0x7f1404a5

    .line 303
    .line 304
    .line 305
    :goto_6
    move/from16 v18, v17

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_15
    const v17, 0x7f1404a0

    .line 309
    .line 310
    .line 311
    goto :goto_6

    .line 312
    :goto_7
    if-eqz v6, :cond_16

    .line 313
    .line 314
    move/from16 v17, v14

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_16
    move/from16 v17, v13

    .line 318
    .line 319
    :goto_8
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, La/lek0;->a()I

    .line 327
    .line 328
    .line 329
    move-result v13

    .line 330
    sget-object v14, La/bqd0;->n0:[I

    .line 331
    .line 332
    invoke-virtual {v3, v13, v14}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    iget-object v13, v15, La/zkk;->c:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 339
    .line 340
    iget-object v14, v15, La/zkk;->h:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v14, Landroid/widget/TextView;

    .line 343
    .line 344
    move-object/from16 v19, v6

    .line 345
    .line 346
    iget-object v6, v15, La/zkk;->b:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v6, Landroidx/appcompat/widget/AppCompatImageView;

    .line 349
    .line 350
    iget-object v0, v15, La/zkk;->e:Landroid/view/View;

    .line 351
    .line 352
    check-cast v0, Landroid/widget/TextView;

    .line 353
    .line 354
    iget-object v1, v15, La/zkk;->i:Landroid/view/View;

    .line 355
    .line 356
    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 357
    .line 358
    move-object/from16 v21, v7

    .line 359
    .line 360
    move-object/from16 v20, v8

    .line 361
    .line 362
    const/4 v8, 0x1

    .line 363
    invoke-virtual {v3, v8}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    invoke-static {v13, v7}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 368
    .line 369
    .line 370
    const/4 v7, 0x2

    .line 371
    const/4 v8, 0x0

    .line 372
    invoke-virtual {v3, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 373
    .line 374
    .line 375
    move-result v7

    .line 376
    if-eqz v7, :cond_18

    .line 377
    .line 378
    iget-object v7, v15, La/zkk;->c:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 381
    .line 382
    invoke-virtual {v7}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    instance-of v13, v7, Landroid/graphics/drawable/GradientDrawable;

    .line 387
    .line 388
    if-eqz v13, :cond_17

    .line 389
    .line 390
    check-cast v7, Landroid/graphics/drawable/GradientDrawable;

    .line 391
    .line 392
    goto :goto_9

    .line 393
    :cond_17
    const/4 v7, 0x0

    .line 394
    :goto_9
    if-eqz v7, :cond_18

    .line 395
    .line 396
    invoke-virtual {v7}, Landroid/graphics/drawable/GradientDrawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 400
    .line 401
    .line 402
    move-result-object v13

    .line 403
    const v8, 0x7f070633

    .line 404
    .line 405
    .line 406
    invoke-virtual {v13, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 407
    .line 408
    .line 409
    move-result v8

    .line 410
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 411
    .line 412
    .line 413
    move-result-object v13

    .line 414
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    move-object/from16 v22, v5

    .line 418
    .line 419
    const v5, 0x7f040b15

    .line 420
    .line 421
    .line 422
    move-object/from16 v23, v4

    .line 423
    .line 424
    const/4 v4, 0x6

    .line 425
    invoke-static {v13, v5, v4}, La/m5d;->g(Landroid/content/Context;II)I

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    invoke-virtual {v7, v8, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 430
    .line 431
    .line 432
    goto :goto_a

    .line 433
    :cond_18
    move-object/from16 v23, v4

    .line 434
    .line 435
    move-object/from16 v22, v5

    .line 436
    .line 437
    :goto_a
    const/4 v4, 0x5

    .line 438
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 443
    .line 444
    .line 445
    move/from16 v4, v18

    .line 446
    .line 447
    invoke-static {v4, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 448
    .line 449
    .line 450
    const/16 v4, 0xc

    .line 451
    .line 452
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 457
    .line 458
    .line 459
    iget-object v0, v15, La/zkk;->d:Landroid/widget/TextView;

    .line 460
    .line 461
    const/16 v4, 0xb

    .line 462
    .line 463
    invoke-virtual {v3, v4}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 468
    .line 469
    .line 470
    const/4 v8, 0x0

    .line 471
    invoke-virtual {v3, v8}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 476
    .line 477
    .line 478
    const/4 v0, 0x3

    .line 479
    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 480
    .line 481
    .line 482
    move-result-object v4

    .line 483
    invoke-static {v6, v4}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 484
    .line 485
    .line 486
    const/4 v0, 0x4

    .line 487
    invoke-virtual {v3, v0, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 492
    .line 493
    .line 494
    if-nez v17, :cond_19

    .line 495
    .line 496
    instance-of v0, v2, La/kek0;

    .line 497
    .line 498
    if-eqz v0, :cond_1a

    .line 499
    .line 500
    :cond_19
    const/4 v4, 0x6

    .line 501
    invoke-virtual {v3, v4, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 506
    .line 507
    .line 508
    :cond_1a
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 509
    .line 510
    .line 511
    iget-boolean v0, v2, La/lek0;->a:Z

    .line 512
    .line 513
    if-eqz v0, :cond_1b

    .line 514
    .line 515
    const/4 v0, 0x0

    .line 516
    goto :goto_b

    .line 517
    :cond_1b
    const/16 v0, 0x8

    .line 518
    .line 519
    :goto_b
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 520
    .line 521
    .line 522
    new-instance v0, La/rrm;

    .line 523
    .line 524
    invoke-direct {v0, v9, v12, v12}, La/g46;-><init>(Landroid/view/ViewGroup;Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;)V

    .line 525
    .line 526
    .line 527
    iget-object v1, v0, La/g46;->i:La/f46;

    .line 528
    .line 529
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    const v3, 0x7f0606d8

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v3}, Landroid/content/Context;->getColor(I)I

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 541
    .line 542
    .line 543
    const/4 v8, 0x0

    .line 544
    invoke-virtual {v1, v8, v8, v8, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 545
    .line 546
    .line 547
    sget-object v2, La/rrm;->B:La/sje;

    .line 548
    .line 549
    new-instance v3, La/wib;

    .line 550
    .line 551
    const/16 v4, 0x1b

    .line 552
    .line 553
    const/4 v5, 0x0

    .line 554
    invoke-direct {v3, v0, v5, v4}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 555
    .line 556
    .line 557
    const/4 v4, 0x3

    .line 558
    invoke-static {v2, v5, v5, v3, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 559
    .line 560
    .line 561
    new-instance v2, La/qrm;

    .line 562
    .line 563
    invoke-direct {v2, v10, v11}, La/qrm;-><init>(Ljava/lang/Object;I)V

    .line 564
    .line 565
    .line 566
    sget-object v3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 567
    .line 568
    invoke-static {v1, v2}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 569
    .line 570
    .line 571
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 572
    .line 573
    const/16 v3, 0x1d

    .line 574
    .line 575
    if-gt v2, v3, :cond_1c

    .line 576
    .line 577
    new-instance v2, La/mfr;

    .line 578
    .line 579
    invoke-direct {v2, v1, v9, v0}, La/mfr;-><init>(La/f46;Landroid/view/ViewGroup;La/rrm;)V

    .line 580
    .line 581
    .line 582
    invoke-static {v1, v2}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 583
    .line 584
    .line 585
    :cond_1c
    move-object/from16 v3, v23

    .line 586
    .line 587
    invoke-virtual {v12, v3}, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->setTitle(Ljava/lang/CharSequence;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    if-nez v2, :cond_1d

    .line 595
    .line 596
    goto :goto_c

    .line 597
    :cond_1d
    move-object/from16 v4, v22

    .line 598
    .line 599
    invoke-virtual {v12, v4}, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 600
    .line 601
    .line 602
    :goto_c
    if-eqz v19, :cond_1e

    .line 603
    .line 604
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    .line 605
    .line 606
    .line 607
    move-result v2

    .line 608
    invoke-virtual {v12, v2}, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->setIcon(I)V

    .line 609
    .line 610
    .line 611
    :cond_1e
    sget-object v2, La/ujn;->Z:La/ujn;

    .line 612
    .line 613
    move-object/from16 v5, v21

    .line 614
    .line 615
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v2

    .line 619
    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 620
    .line 621
    if-nez v2, :cond_22

    .line 622
    .line 623
    sget-object v2, La/lwf;->Y:La/lwf;

    .line 624
    .line 625
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    if-eqz v2, :cond_1f

    .line 630
    .line 631
    new-instance v2, La/ntl;

    .line 632
    .line 633
    const/16 v4, 0x9

    .line 634
    .line 635
    invoke-direct {v2, v0, v4}, La/ntl;-><init>(Ljava/lang/Object;B)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v2}, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->setCancelAction(Lkotlin/jvm/functions/Function0;)V

    .line 639
    .line 640
    .line 641
    goto :goto_d

    .line 642
    :cond_1f
    instance-of v2, v5, La/hdk0;

    .line 643
    .line 644
    if-eqz v2, :cond_21

    .line 645
    .line 646
    move-object v7, v5

    .line 647
    check-cast v7, La/hdk0;

    .line 648
    .line 649
    iget-object v2, v7, La/hdk0;->a:Ljava/lang/String;

    .line 650
    .line 651
    new-instance v4, La/gnm;

    .line 652
    .line 653
    const/4 v6, 0x3

    .line 654
    invoke-direct {v4, v5, v0, v6}, La/gnm;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 661
    .line 662
    .line 663
    move-result-object v5

    .line 664
    const v6, 0x7f07072d

    .line 665
    .line 666
    .line 667
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    iget-object v6, v15, La/zkk;->e:Landroid/view/View;

    .line 672
    .line 673
    check-cast v6, Landroid/widget/TextView;

    .line 674
    .line 675
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 676
    .line 677
    .line 678
    move-result-object v7

    .line 679
    if-eqz v7, :cond_20

    .line 680
    .line 681
    check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 682
    .line 683
    invoke-virtual {v7, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 687
    .line 688
    .line 689
    const/4 v8, 0x0

    .line 690
    invoke-virtual {v14, v8}, Landroid/view/View;->setVisibility(I)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v14, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 694
    .line 695
    .line 696
    new-instance v2, La/q10;

    .line 697
    .line 698
    const/16 v5, 0x13

    .line 699
    .line 700
    invoke-direct {v2, v4, v5}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v14, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 704
    .line 705
    .line 706
    goto :goto_d

    .line 707
    :cond_20
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    const/16 v16, 0x0

    .line 711
    .line 712
    return-object v16

    .line 713
    :cond_21
    const/16 v16, 0x0

    .line 714
    .line 715
    invoke-static {}, La/t9f;->b()V

    .line 716
    .line 717
    .line 718
    return-object v16

    .line 719
    :cond_22
    :goto_d
    sget-object v2, La/jtv;->x:La/jtv;

    .line 720
    .line 721
    move-object/from16 v6, v20

    .line 722
    .line 723
    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result v2

    .line 727
    if-eqz v2, :cond_23

    .line 728
    .line 729
    const/16 v2, 0xfa0

    .line 730
    .line 731
    iput v2, v0, La/g46;->k:I

    .line 732
    .line 733
    :goto_e
    const/4 v8, 0x0

    .line 734
    goto :goto_f

    .line 735
    :cond_23
    sget-object v2, La/rv00;->B:La/rv00;

    .line 736
    .line 737
    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 738
    .line 739
    .line 740
    move-result v2

    .line 741
    if-eqz v2, :cond_24

    .line 742
    .line 743
    const/4 v2, -0x2

    .line 744
    iput v2, v0, La/g46;->k:I

    .line 745
    .line 746
    goto :goto_e

    .line 747
    :cond_24
    sget-object v2, La/gqw0;->D1:La/gqw0;

    .line 748
    .line 749
    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v2

    .line 753
    if-eqz v2, :cond_25

    .line 754
    .line 755
    const/4 v8, 0x0

    .line 756
    iput v8, v0, La/g46;->k:I

    .line 757
    .line 758
    goto :goto_f

    .line 759
    :cond_25
    const/4 v8, 0x0

    .line 760
    sget-object v2, La/jdk0;->a:La/jdk0;

    .line 761
    .line 762
    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move-result v2

    .line 766
    if-eqz v2, :cond_30

    .line 767
    .line 768
    const/4 v2, -0x1

    .line 769
    iput v2, v0, La/g46;->k:I

    .line 770
    .line 771
    :goto_f
    const/16 v2, 0x14

    .line 772
    .line 773
    invoke-static {v2}, La/sj3;->X(I)I

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    int-to-float v2, v2

    .line 778
    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationZ(F)V

    .line 779
    .line 780
    .line 781
    move-object/from16 v11, p2

    .line 782
    .line 783
    iget-object v5, v11, La/xdk0;->g:Ljava/lang/String;

    .line 784
    .line 785
    if-eqz v5, :cond_27

    .line 786
    .line 787
    invoke-static {v5}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 788
    .line 789
    .line 790
    move-result v2

    .line 791
    if-nez v2, :cond_26

    .line 792
    .line 793
    goto :goto_10

    .line 794
    :cond_26
    const/4 v5, 0x0

    .line 795
    :goto_10
    if-eqz v5, :cond_27

    .line 796
    .line 797
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 798
    .line 799
    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 800
    .line 801
    .line 802
    move-object/from16 v12, p0

    .line 803
    .line 804
    iget-object v4, v12, La/wdk0;->d:Ljava/util/LinkedHashMap;

    .line 805
    .line 806
    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    goto :goto_11

    .line 810
    :cond_27
    move-object/from16 v12, p0

    .line 811
    .line 812
    :goto_11
    new-instance v2, La/zbg0;

    .line 813
    .line 814
    move-object/from16 v13, p3

    .line 815
    .line 816
    invoke-direct {v2, v11, v12, v0, v13}, La/zbg0;-><init>(La/xdk0;La/wdk0;La/rrm;Lkotlin/jvm/functions/Function0;)V

    .line 817
    .line 818
    .line 819
    new-instance v4, La/wq;

    .line 820
    .line 821
    const/4 v14, 0x1

    .line 822
    invoke-direct {v4, v2, v14}, La/wq;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 823
    .line 824
    .line 825
    iget-object v2, v0, La/g46;->s:Ljava/util/ArrayList;

    .line 826
    .line 827
    if-nez v2, :cond_28

    .line 828
    .line 829
    new-instance v2, Ljava/util/ArrayList;

    .line 830
    .line 831
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 832
    .line 833
    .line 834
    iput-object v2, v0, La/g46;->s:Ljava/util/ArrayList;

    .line 835
    .line 836
    :cond_28
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    invoke-static/range {p1 .. p1}, La/hxm0;->p(Landroid/view/View;)La/yc3;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 844
    .line 845
    .line 846
    move-result v4

    .line 847
    if-eqz v4, :cond_2f

    .line 848
    .line 849
    invoke-virtual {v1}, Landroid/view/View;->isLayoutRequested()Z

    .line 850
    .line 851
    .line 852
    move-result v4

    .line 853
    if-nez v4, :cond_2f

    .line 854
    .line 855
    sget-object v4, La/mjv0;->a:La/ljv0;

    .line 856
    .line 857
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    .line 859
    .line 860
    sget-object v4, La/ljv0;->b:La/njv0;

    .line 861
    .line 862
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v4, v2}, La/njv0;->a(Landroid/app/Activity;)La/kjv0;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    iget-object v2, v2, La/kjv0;->a:La/tq8;

    .line 870
    .line 871
    invoke-virtual {v2}, La/tq8;->c()Landroid/graphics/Rect;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    invoke-static {v1}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    if-eqz v4, :cond_29

    .line 880
    .line 881
    iget-object v4, v4, La/xiv0;->a:La/uiv0;

    .line 882
    .line 883
    const/16 v5, 0x287

    .line 884
    .line 885
    invoke-virtual {v4, v5}, La/uiv0;->i(I)La/pfx;

    .line 886
    .line 887
    .line 888
    move-result-object v5

    .line 889
    goto :goto_12

    .line 890
    :cond_29
    const/4 v5, 0x0

    .line 891
    :goto_12
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 892
    .line 893
    .line 894
    move-result v2

    .line 895
    if-eqz v5, :cond_2a

    .line 896
    .line 897
    iget v4, v5, La/pfx;->a:I

    .line 898
    .line 899
    goto :goto_13

    .line 900
    :cond_2a
    move v4, v8

    .line 901
    :goto_13
    sub-int/2addr v2, v4

    .line 902
    if-eqz v5, :cond_2b

    .line 903
    .line 904
    iget v13, v5, La/pfx;->c:I

    .line 905
    .line 906
    goto :goto_14

    .line 907
    :cond_2b
    move v13, v8

    .line 908
    :goto_14
    sub-int/2addr v2, v13

    .line 909
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 910
    .line 911
    .line 912
    move-result-object v4

    .line 913
    if-eqz v4, :cond_2e

    .line 914
    .line 915
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 916
    .line 917
    iget v3, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 918
    .line 919
    iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 920
    .line 921
    add-int/2addr v3, v5

    .line 922
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 923
    .line 924
    .line 925
    move-result-object v5

    .line 926
    const v6, 0x7f0706b5

    .line 927
    .line 928
    .line 929
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 930
    .line 931
    .line 932
    move-result v5

    .line 933
    sub-int/2addr v2, v3

    .line 934
    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    .line 935
    .line 936
    .line 937
    move-result v2

    .line 938
    iput v2, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 939
    .line 940
    instance-of v2, v4, La/ble;

    .line 941
    .line 942
    const/16 v3, 0x51

    .line 943
    .line 944
    if-eqz v2, :cond_2c

    .line 945
    .line 946
    move-object v2, v4

    .line 947
    check-cast v2, La/ble;

    .line 948
    .line 949
    iput v3, v2, La/ble;->c:I

    .line 950
    .line 951
    goto :goto_15

    .line 952
    :cond_2c
    instance-of v2, v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 953
    .line 954
    if-eqz v2, :cond_2d

    .line 955
    .line 956
    move-object v2, v4

    .line 957
    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 958
    .line 959
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 960
    .line 961
    :cond_2d
    :goto_15
    invoke-virtual {v1, v4}, La/f46;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 962
    .line 963
    .line 964
    return-object v0

    .line 965
    :cond_2e
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 966
    .line 967
    .line 968
    const/16 v16, 0x0

    .line 969
    .line 970
    return-object v16

    .line 971
    :cond_2f
    new-instance v3, La/djl;

    .line 972
    .line 973
    const/4 v8, 0x3

    .line 974
    invoke-direct {v3, v2, v0, v8}, La/djl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v1, v3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 978
    .line 979
    .line 980
    return-object v0

    .line 981
    :cond_30
    const/16 v16, 0x0

    .line 982
    .line 983
    invoke-static {}, La/t9f;->b()V

    .line 984
    .line 985
    .line 986
    return-object v16

    .line 987
    :cond_31
    move-object/from16 v16, v15

    .line 988
    .line 989
    const-string v0, "No suitable parent found."

    .line 990
    .line 991
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 992
    .line 993
    .line 994
    return-object v16

    .line 995
    :cond_32
    move-object/from16 v19, v7

    .line 996
    .line 997
    move v7, v3

    .line 998
    move-object v3, v4

    .line 999
    move-object v4, v5

    .line 1000
    move-object/from16 v5, v19

    .line 1001
    .line 1002
    move-object/from16 v19, v6

    .line 1003
    .line 1004
    move-object v6, v8

    .line 1005
    move v8, v13

    .line 1006
    move-object/from16 v13, p3

    .line 1007
    .line 1008
    move-object v13, v4

    .line 1009
    move-object v4, v3

    .line 1010
    move v3, v7

    .line 1011
    move-object v7, v5

    .line 1012
    move-object v5, v13

    .line 1013
    move v13, v8

    .line 1014
    move-object v8, v6

    .line 1015
    move-object/from16 v6, v19

    .line 1016
    .line 1017
    goto/16 :goto_3

    .line 1018
    .line 1019
    :cond_33
    move-object/from16 v16, v15

    .line 1020
    .line 1021
    invoke-static {}, La/t9f;->b()V

    .line 1022
    .line 1023
    .line 1024
    return-object v16

    .line 1025
    :sswitch_data_0
    .sparse-switch
        -0x589a90a9 -> :sswitch_3
        -0x3a774296 -> :sswitch_2
        -0xf3d348a -> :sswitch_1
        0x41a17dff -> :sswitch_0
    .end sparse-switch
.end method

.method public final m(La/rrm;F)V
    .locals 2

    .line 1
    iget-object v0, p1, La/g46;->i:La/f46;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, La/wdk0;->m(La/rrm;F)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance v1, La/vdk0;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1, p2}, La/vdk0;-><init>(La/wdk0;La/rrm;F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const/4 p0, 0x2

    .line 38
    new-array p0, p0, [I

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    aget p0, p0, p1

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    add-int/2addr p1, p0

    .line 51
    int-to-float p0, p1

    .line 52
    sub-float/2addr p0, p2

    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    sub-float/2addr p1, p0

    .line 58
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final p(La/rrm;)V
    .locals 3

    .line 1
    iget-object v0, p1, La/g46;->i:La/f46;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, La/ptl;

    .line 12
    .line 13
    invoke-direct {v2, p1, v0, p0}, La/ptl;-><init>(La/rrm;Landroid/view/View;La/wdk0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
