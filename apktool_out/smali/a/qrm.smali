.class public final synthetic La/qrm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zf60;
.implements La/sg00;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qrm;->b:Ljava/lang/Object;

    iput p2, p0, La/qrm;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/qrm;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/media3/common/MediaItem;

    .line 4
    .line 5
    iget p0, p0, La/qrm;->a:I

    .line 6
    .line 7
    check-cast p1, La/ky90;

    .line 8
    .line 9
    invoke-interface {p1, v0, p0}, La/ky90;->o(Landroidx/media3/common/MediaItem;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 5

    .line 1
    iget-object v0, p0, La/qrm;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x207

    .line 9
    .line 10
    iget-object p2, p2, La/xiv0;->a:La/uiv0;

    .line 11
    .line 12
    invoke-virtual {p2, v1}, La/uiv0;->i(I)La/pfx;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget v1, p2, La/pfx;->c:I

    .line 20
    .line 21
    iget v2, p2, La/pfx;->a:I

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 30
    .line 31
    invoke-static {v0}, La/f7k;->X(Landroid/content/Context;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    iget p0, p0, La/qrm;->a:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object p0, La/mjv0;->a:La/ljv0;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object p0, La/ljv0;->b:La/njv0;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, La/njv0;->b(Landroid/content/Context;)La/kjv0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    iget-object p0, p0, La/kjv0;->a:La/tq8;

    .line 55
    .line 56
    invoke-virtual {p0}, La/tq8;->c()Landroid/graphics/Rect;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int v4, v2, v1

    .line 65
    .line 66
    sub-int/2addr p0, v4

    .line 67
    :goto_0
    iget p2, p2, La/pfx;->d:I

    .line 68
    .line 69
    iput p2, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 70
    .line 71
    iput p0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 72
    .line 73
    invoke-static {v0}, La/f7k;->X(Landroid/content/Context;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_1

    .line 78
    .line 79
    add-int p2, v2, v1

    .line 80
    .line 81
    sget-object v4, La/mjv0;->a:La/ljv0;

    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    sget-object v4, La/ljv0;->b:La/njv0;

    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v0}, La/njv0;->b(Landroid/content/Context;)La/kjv0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v0, v0, La/kjv0;->a:La/tq8;

    .line 96
    .line 97
    invoke-virtual {v0}, La/tq8;->c()Landroid/graphics/Rect;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    sub-int/2addr v0, p0

    .line 106
    sub-int/2addr v0, p2

    .line 107
    div-int/lit8 v0, v0, 0x2

    .line 108
    .line 109
    add-int/2addr v2, v0

    .line 110
    iput v2, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 111
    .line 112
    add-int/2addr v0, v1

    .line 113
    iput v0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    iput v2, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 117
    .line 118
    iput v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 119
    .line 120
    :goto_1
    invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    .line 122
    .line 123
    sget-object p0, La/xiv0;->b:La/xiv0;

    .line 124
    .line 125
    return-object p0

    .line 126
    :cond_2
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 127
    .line 128
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/4 p0, 0x0

    .line 132
    return-object p0
.end method
