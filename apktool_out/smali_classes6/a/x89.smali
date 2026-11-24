.class public final La/x89;
.super Landroid/util/Property;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/x89;->a:B

    .line 3
    .line 4
    const-class v0, Landroid/graphics/Matrix;

    .line 5
    .line 6
    const-string v1, "imageMatrixProperty"

    .line 7
    .line 8
    invoke-direct {p0, v0, v1}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/x89;->b:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(La/y89;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/x89;->a:B

    iput-object p1, p0, La/x89;->b:Ljava/lang/Object;

    .line 19
    const-string p1, "tintColor"

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-direct {p0, v0, p1}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/x89;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/x89;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Landroid/widget/ImageView;

    .line 9
    .line 10
    check-cast p0, Landroid/graphics/Matrix;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    check-cast p1, Landroid/widget/ImageView;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast p0, La/y89;

    .line 26
    .line 27
    iget p0, p0, La/y89;->o:I

    .line 28
    .line 29
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/x89;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/widget/ImageView;

    .line 7
    .line 8
    check-cast p2, Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, Landroid/widget/ImageView;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/x89;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, La/y89;

    .line 28
    .line 29
    iput p2, p0, La/y89;->o:I

    .line 30
    .line 31
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 32
    .line 33
    invoke-virtual {p1, p2, p0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
