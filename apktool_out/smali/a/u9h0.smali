.class public final La/u9h0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pz40;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/u9h0;->a:La/pz40;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/AndroidComposeView;La/wai0;Lkotlin/coroutines/CoroutineContext;Ljava/util/function/Consumer;)V
    .locals 8

    .line 1
    new-instance v2, La/xz40;

    .line 2
    .line 3
    const/16 v0, 0x10

    .line 4
    .line 5
    new-array v0, v0, [La/v9h0;

    .line 6
    .line 7
    invoke-direct {v2, v0}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, La/wai0;->a()La/tai0;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    new-instance v0, La/zz;

    .line 15
    .line 16
    const/16 v6, 0x8

    .line 17
    .line 18
    const/4 v7, 0x2

    .line 19
    const/4 v1, 0x1

    .line 20
    const-class v3, La/xz40;

    .line 21
    .line 22
    const-string v4, "add"

    .line 23
    .line 24
    const-string v5, "add(Ljava/lang/Object;)Z"

    .line 25
    .line 26
    invoke-direct/range {v0 .. v7}, La/zz;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {p2, v1, v0}, La/zvw;->h0(La/tai0;ILa/zz;)V

    .line 31
    .line 32
    .line 33
    new-instance p2, La/w0h0;

    .line 34
    .line 35
    const/16 v0, 0x11

    .line 36
    .line 37
    invoke-direct {p2, v0}, La/w0h0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    new-instance v0, La/w0h0;

    .line 41
    .line 42
    const/16 v3, 0x12

    .line 43
    .line 44
    invoke-direct {v0, v3}, La/w0h0;-><init>(B)V

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    new-array v3, v3, [Lkotlin/jvm/functions/Function1;

    .line 49
    .line 50
    aput-object p2, v3, v1

    .line 51
    .line 52
    const/4 p2, 0x1

    .line 53
    aput-object v0, v3, p2

    .line 54
    .line 55
    invoke-static {v3}, La/hdd;->a([Lkotlin/jvm/functions/Function1;)La/gi2;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v3, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 60
    .line 61
    iget v4, v2, La/xz40;->c:I

    .line 62
    .line 63
    invoke-static {v3, v1, v4, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 64
    .line 65
    .line 66
    iget v0, v2, La/xz40;->c:I

    .line 67
    .line 68
    if-nez v0, :cond_0

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    sub-int/2addr v0, p2

    .line 73
    iget-object v1, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 74
    .line 75
    aget-object v0, v1, v0

    .line 76
    .line 77
    :goto_0
    check-cast v0, La/v9h0;

    .line 78
    .line 79
    if-nez v0, :cond_1

    .line 80
    .line 81
    return-void

    .line 82
    :cond_1
    iget-object v3, v0, La/v9h0;->c:La/mkx;

    .line 83
    .line 84
    invoke-static {p3}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    new-instance v1, La/gkd;

    .line 89
    .line 90
    iget-object v2, v0, La/v9h0;->a:La/tai0;

    .line 91
    .line 92
    move-object v5, p0

    .line 93
    move-object v6, p1

    .line 94
    invoke-direct/range {v1 .. v6}, La/gkd;-><init>(La/tai0;La/mkx;La/sje;La/u9h0;Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 95
    .line 96
    .line 97
    iget-object p0, v0, La/v9h0;->d:La/s460;

    .line 98
    .line 99
    invoke-static {p0}, La/k7x;->C(La/j6z;)La/j6z;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {p1, p0, p2}, La/j6z;->w(La/j6z;Z)La/jge0;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {v3}, La/mkx;->b()J

    .line 108
    .line 109
    .line 110
    move-result-wide p1

    .line 111
    invoke-static {p0}, La/m2x;->C(La/jge0;)La/mkx;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, La/e9x;->U(La/mkx;)Landroid/graphics/Rect;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    new-instance p3, Landroid/graphics/Point;

    .line 120
    .line 121
    const/16 v0, 0x20

    .line 122
    .line 123
    shr-long v4, p1, v0

    .line 124
    .line 125
    long-to-int v0, v4

    .line 126
    const-wide v4, 0xffffffffL

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    and-long/2addr p1, v4

    .line 132
    long-to-int p1, p1

    .line 133
    invoke-direct {p3, v0, p1}, Landroid/graphics/Point;-><init>(II)V

    .line 134
    .line 135
    .line 136
    new-instance p1, Landroid/view/ScrollCaptureTarget;

    .line 137
    .line 138
    invoke-direct {p1, v6, p0, p3, v1}, Landroid/view/ScrollCaptureTarget;-><init>(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/view/ScrollCaptureCallback;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v3}, La/e9x;->U(La/mkx;)Landroid/graphics/Rect;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {p1, p0}, Landroid/view/ScrollCaptureTarget;->setScrollBounds(Landroid/graphics/Rect;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {p4, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    return-void
.end method
