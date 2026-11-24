.class public final synthetic La/sbq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xbq0;


# direct methods
.method public synthetic constructor <init>(La/xbq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sbq0;->a:B

    iput-object p1, p0, La/sbq0;->b:La/xbq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/sbq0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/sbq0;->b:La/xbq0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/xbq0;->O1:La/m6m0;

    .line 9
    .line 10
    new-instance v0, La/ry3;

    .line 11
    .line 12
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object p0, p0, La/xbq0;->L1:La/cxi;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    const-string p0, "viewModelFactory"

    .line 25
    .line 26
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    throw p0

    .line 31
    :pswitch_0
    sget-object v0, La/xbq0;->O1:La/m6m0;

    .line 32
    .line 33
    invoke-virtual {p0}, La/xbq0;->K0()La/zbq0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object v0, p0, La/zbq0;->m:La/nvu;

    .line 38
    .line 39
    iget-object v1, v0, La/nvu;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/lang/Iterable;

    .line 48
    .line 49
    iget-object v2, v0, La/nvu;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Ljava/lang/Iterable;

    .line 58
    .line 59
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/lang/Iterable;

    .line 64
    .line 65
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->B0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    iget-object v0, v0, La/nvu;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, La/s1p;

    .line 72
    .line 73
    new-instance v1, La/j1p;

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    const/16 v8, 0x3e

    .line 77
    .line 78
    const-string v4, ", "

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    invoke-static/range {v3 .. v8}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-direct {v1, v2, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 88
    .line 89
    .line 90
    filled-new-array {v1}, [La/j1p;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v1}, La/dui0;->c([Ljava/lang/Object;)Ljava/util/Set;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-wide/16 v4, 0xcd8

    .line 99
    .line 100
    invoke-virtual {v0, v1, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 101
    .line 102
    .line 103
    iget-object p0, p0, La/zbq0;->b:La/i1w0;

    .line 104
    .line 105
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    new-instance v1, La/c8d;

    .line 110
    .line 111
    sget-object v2, La/y7d;->a:La/v7d;

    .line 112
    .line 113
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 114
    .line 115
    invoke-direct {v1, v2, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v1, p0, v0, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    :goto_0
    move-object v1, v0

    .line 123
    check-cast v1, La/paw;

    .line 124
    .line 125
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_1

    .line 130
    .line 131
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, La/oe50;

    .line 136
    .line 137
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
