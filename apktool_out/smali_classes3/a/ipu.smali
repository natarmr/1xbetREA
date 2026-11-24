.class public final La/ipu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;

.field public final b:La/gst0;


# direct methods
.method public constructor <init>(La/pbt;La/gst0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/ipu;->a:La/pbt;

    .line 11
    .line 12
    iput-object p2, p0, La/ipu;->b:La/gst0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/hpu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/hpu;

    .line 7
    .line 8
    iget v1, v0, La/hpu;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/hpu;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hpu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/hpu;-><init>(La/ipu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/hpu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hpu;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/ipu;->b:La/gst0;

    .line 51
    .line 52
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iput v3, v0, La/hpu;->k:I

    .line 57
    .line 58
    iget-object p0, p0, La/ipu;->a:La/pbt;

    .line 59
    .line 60
    invoke-virtual {p0, p1, v0}, La/pbt;->k(ZLa/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance p1, La/umu;

    .line 74
    .line 75
    invoke-direct {p1, v3}, La/umu;-><init>(B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0, p1}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance p1, La/umu;

    .line 83
    .line 84
    const/4 v0, 0x2

    .line 85
    invoke-direct {p1, v0}, La/umu;-><init>(B)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0, p1}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    new-instance p1, La/vvt;

    .line 93
    .line 94
    const/16 v0, 0x14

    .line 95
    .line 96
    invoke-direct {p1, v0}, La/vvt;-><init>(B)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, La/pgi0;->u(Lkotlin/sequences/Sequence;)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p1, p0}, La/v3d;->t(Ljava/util/Comparator;Ljava/util/List;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-nez p1, :cond_4

    .line 115
    .line 116
    sget-object p0, La/iun;->a:La/iun;

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_5

    .line 128
    .line 129
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_6

    .line 147
    .line 148
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_6
    return-object v0
.end method
