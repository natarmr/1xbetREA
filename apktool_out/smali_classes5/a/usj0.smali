.class public final La/usj0;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public final a:La/a8z;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, La/wez;->b:La/wez;

    .line 8
    .line 9
    new-instance v0, La/sue0;

    .line 10
    .line 11
    const/16 v1, 0x13

    .line 12
    .line 13
    invoke-direct {v0, p0, p0, v1}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/usj0;->a:La/a8z;

    .line 21
    .line 22
    return-void
.end method

.method private final getViewBinding()La/vsj0;
    .locals 0

    .line 1
    iget-object p0, p0, La/usj0;->a:La/a8z;

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
    check-cast p0, La/vsj0;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public final setSportIcon(J)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x2c3

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const p2, 0x7f0809a9

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object p2, La/j5d;->a:Landroid/util/TypedValue;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const v0, 0x7f040b0b

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {p2, v0, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0, p2}, La/vcc;->c0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, La/usj0;->getViewBinding()La/vsj0;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object p0, p0, La/vsj0;->b:Landroid/widget/ImageView;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 56
    .line 57
    invoke-direct {p0}, La/usj0;->getViewBinding()La/vsj0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object p0, p0, La/vsj0;->b:Landroid/widget/ImageView;

    .line 62
    .line 63
    const-wide/16 v0, 0x0

    .line 64
    .line 65
    cmp-long v0, p1, v0

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    const-string v0, "svg"

    .line 70
    .line 71
    const-string v1, "sports_v2"

    .line 72
    .line 73
    const-string v2, "static"

    .line 74
    .line 75
    invoke-static {v2, v0, v1}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v1, ".svg"

    .line 80
    .line 81
    invoke-static {p1, p2, v1, v0}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, v0, La/bzu;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    const-string p1, ""

    .line 94
    .line 95
    :goto_0
    invoke-static {p0, p1}, La/u0d;->k(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method
