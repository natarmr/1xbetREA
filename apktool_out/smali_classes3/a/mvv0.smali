.class public final La/mvv0;
.super La/q1r;
.source "SourceFile"

# interfaces
.implements La/qvj;


# instance fields
.field public final a:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

.field public final b:La/jvv0;


# direct methods
.method public constructor <init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/jvv0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/mvv0;->a:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 8
    .line 9
    iput-object p2, p0, La/mvv0;->b:La/jvv0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, La/mvv0;->j(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final d(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, La/mvv0;->j(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final f(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V
    .locals 7

    .line 1
    iget-object p1, p0, La/mvv0;->b:La/jvv0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->g()La/piu0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object p1, p1, La/jvv0;->a:La/p7m0;

    .line 11
    .line 12
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, La/gvv0;

    .line 17
    .line 18
    iget-object v1, v1, La/gvv0;->b:Ljava/util/Map;

    .line 19
    .line 20
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/util/Map$Entry;

    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, La/fvv0;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v5, v4, La/fvv0;->b:Ljava/lang/ref/WeakReference;

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->g()La/piu0;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    if-ne v5, v6, :cond_0

    .line 65
    .line 66
    iget-object v4, v4, La/fvv0;->a:Ljava/lang/ref/WeakReference;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    if-eq v4, p2, :cond_0

    .line 73
    .line 74
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Ljava/lang/Iterable;

    .line 91
    .line 92
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->V(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, La/kvv0;

    .line 97
    .line 98
    if-nez v1, :cond_2

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    move-object v3, v2

    .line 106
    check-cast v3, La/gvv0;

    .line 107
    .line 108
    new-instance v4, La/fvv0;

    .line 109
    .line 110
    invoke-direct {v4, p2, v0}, La/fvv0;-><init>(Landroidx/fragment/app/Fragment;La/piu0;)V

    .line 111
    .line 112
    .line 113
    iget-object v5, v3, La/gvv0;->b:Ljava/util/Map;

    .line 114
    .line 115
    new-instance v6, Lkotlin/Pair;

    .line 116
    .line 117
    invoke-direct {v6, v1, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v5, v6}, La/xp20;->k(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    const/4 v5, 0x5

    .line 125
    const/4 v6, 0x0

    .line 126
    invoke-static {v3, v6, v4, v6, v5}, La/gvv0;->a(La/gvv0;Ljava/util/Map;Ljava/util/Map;La/kvv0;I)La/gvv0;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {p1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_2

    .line 135
    .line 136
    :goto_1
    const/4 p1, 0x1

    .line 137
    invoke-virtual {p0, p1}, La/mvv0;->j(Z)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final j(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, La/mvv0;->a:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, La/agd;->x()La/glz;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, La/tvk;->a:La/rwj;

    .line 12
    .line 13
    sget-object v1, La/ys10;->a:La/vs10;

    .line 14
    .line 15
    new-instance v2, La/lvv0;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, p0, p1, v3}, La/lvv0;-><init>(La/mvv0;ZLa/yje;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x2

    .line 22
    invoke-static {v0, v1, v3, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final onResume(La/clz;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, La/mvv0;->j(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
