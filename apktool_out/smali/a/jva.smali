.class public final La/jva;
.super La/l900;
.source "SourceFile"


# instance fields
.field public final synthetic q:B


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;B)V
    .locals 0

    .line 8
    iput-byte p2, p0, La/jva;->q:B

    invoke-direct {p0, p1}, La/l900;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/carousel/CarouselLayoutManager;Landroid/content/Context;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-byte p1, p0, La/jva;->q:B

    .line 3
    .line 4
    invoke-direct {p0, p2}, La/l900;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a(I)Landroid/graphics/PointF;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jva;->q:B

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, La/she0;->a(I)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0

    :pswitch_0
    const/4 p0, 0x0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i(IIIII)I
    .locals 1

    .line 1
    iget-byte v0, p0, La/jva;->q:B

    packed-switch v0, :pswitch_data_0

    invoke-super/range {p0 .. p5}, La/l900;->i(IIIII)I

    move-result p0

    return p0

    :pswitch_0
    sub-int/2addr p3, p1

    add-int/lit8 p3, p3, 0x1

    return p3

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public j(Landroid/view/View;I)I
    .locals 1

    .line 1
    iget-byte v0, p0, La/jva;->q:B

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, La/l900;->j(Landroid/view/View;I)I

    move-result p0

    return p0

    :pswitch_0
    const/4 p0, 0x0

    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public k(Landroid/view/View;I)I
    .locals 1

    .line 1
    iget-byte v0, p0, La/jva;->q:B

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, La/l900;->k(Landroid/view/View;I)I

    move-result p0

    return p0

    :pswitch_0
    const/4 p0, 0x0

    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public l(Landroid/util/DisplayMetrics;)F
    .locals 1

    .line 1
    iget-byte v0, p0, La/jva;->q:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/l900;->l(Landroid/util/DisplayMetrics;)F

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-super {p0, p1}, La/l900;->l(Landroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/high16 p1, 0x40800000    # 4.0f

    .line 16
    .line 17
    mul-float/2addr p0, p1

    .line 18
    return p0

    .line 19
    :pswitch_1
    iget p0, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 20
    .line 21
    int-to-float p0, p0

    .line 22
    const/high16 p1, 0x42c80000    # 100.0f

    .line 23
    .line 24
    div-float/2addr p1, p0

    .line 25
    return p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public n()I
    .locals 1

    .line 1
    iget-byte v0, p0, La/jva;->q:B

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, La/l900;->n()I

    move-result p0

    return p0

    :pswitch_0
    const/4 p0, -0x1

    return p0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
