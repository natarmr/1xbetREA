.class public final La/yhb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zf60;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(La/bib;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-byte p1, p0, La/yhb;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/yhb;->b:Landroid/view/View;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/yhb;->a:B

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yhb;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 8

    .line 1
    iget-byte v0, p0, La/yhb;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p1, p2, La/xiv0;->a:La/uiv0;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, La/uiv0;->i(I)La/pfx;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget p1, p1, La/pfx;->d:I

    .line 17
    .line 18
    iget-object p0, p0, La/yhb;->b:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    :pswitch_0
    iget-object p1, p2, La/xiv0;->a:La/uiv0;

    .line 37
    .line 38
    const/4 p2, 0x1

    .line 39
    invoke-virtual {p1, p2}, La/uiv0;->i(I)La/pfx;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iget v4, p2, La/pfx;->b:I

    .line 44
    .line 45
    sget-object p2, La/bib;->X1:La/bj5;

    .line 46
    .line 47
    const/16 p2, 0x8

    .line 48
    .line 49
    invoke-virtual {p1, p2}, La/uiv0;->u(I)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    invoke-virtual {p1, p2}, La/uiv0;->i(I)La/pfx;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iget p2, p2, La/pfx;->d:I

    .line 60
    .line 61
    invoke-virtual {p1, v1}, La/uiv0;->i(I)La/pfx;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget p1, p1, La/pfx;->d:I

    .line 66
    .line 67
    sub-int/2addr p2, p1

    .line 68
    :goto_0
    move v6, p2

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 p2, 0x0

    .line 71
    goto :goto_0

    .line 72
    :goto_1
    iget-object v2, p0, La/yhb;->b:Landroid/view/View;

    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    instance-of p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 79
    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_1
    const/4 p0, 0x0

    .line 86
    :goto_2
    if-eqz p0, :cond_3

    .line 87
    .line 88
    iget p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 89
    .line 90
    if-ne p1, v4, :cond_2

    .line 91
    .line 92
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 93
    .line 94
    if-eq p0, v6, :cond_3

    .line 95
    .line 96
    :cond_2
    const/4 v5, 0x0

    .line 97
    const/4 v7, 0x5

    .line 98
    const/4 v3, 0x0

    .line 99
    invoke-static/range {v2 .. v7}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 100
    .line 101
    .line 102
    :cond_3
    sget-object p0, La/xiv0;->b:La/xiv0;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
