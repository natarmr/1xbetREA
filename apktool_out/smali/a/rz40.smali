.class public final La/rz40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# instance fields
.field public final synthetic a:B

.field public final b:La/jiy;

.field public final c:La/ugi0;


# direct methods
.method public constructor <init>(La/jiy;B)V
    .locals 2

    .line 1
    iput-byte p2, p0, La/rz40;->a:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/rz40;->b:La/jiy;

    .line 13
    .line 14
    invoke-interface {p1}, La/jiy;->getDescriptor()La/ugi0;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-interface {p2}, La/ugi0;->l()La/c3x;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    instance-of v0, p2, La/zvb0;

    .line 23
    .line 24
    const-string v1, "kotlinx.coroutines.flow.MutableStateFlow"

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    check-cast p2, La/zvb0;

    .line 29
    .line 30
    invoke-static {v1, p2}, La/x2x;->j(Ljava/lang/String;La/zvb0;)La/ewb0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {p1}, La/jiy;->getDescriptor()La/ugi0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v1, p1}, La/x2x;->o(Ljava/lang/String;La/ugi0;)La/zqv0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    iput-object p1, p0, La/rz40;->c:La/ugi0;

    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sget-object p2, La/jnk0;->Companion:La/ink0;

    .line 50
    .line 51
    invoke-virtual {p2, p1}, La/ink0;->serializer(La/jiy;)La/jiy;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, La/rz40;->b:La/jiy;

    .line 56
    .line 57
    invoke-interface {p1}, La/jiy;->getDescriptor()La/ugi0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, La/rz40;->c:La/ugi0;

    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/rz40;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rz40;->b:La/jiy;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/jiy;

    .line 9
    .line 10
    invoke-interface {p1, p0}, La/rkj;->w(La/jiy;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jnk0;

    .line 15
    .line 16
    iget-object p1, p0, La/jnk0;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object p0, p0, La/jnk0;->b:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    new-instance v0, Landroid/util/SparseArray;

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    :goto_0
    if-ge v2, v1, :cond_1

    .line 45
    .line 46
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v0, v3, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const-string p0, "Failed requirement."

    .line 67
    .line 68
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    :cond_1
    return-object v0

    .line 73
    :pswitch_0
    check-cast p0, La/jiy;

    .line 74
    .line 75
    invoke-interface {p1, p0}, La/rkj;->w(La/jiy;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescriptor()La/ugi0;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rz40;->a:B

    iget-object p0, p0, La/rz40;->c:La/ugi0;

    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-byte v0, p0, La/rz40;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rz40;->b:La/jiy;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p2, Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v3, v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p2, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    :goto_1
    if-ge v2, v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {p2, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    new-instance p2, La/jnk0;

    .line 62
    .line 63
    invoke-direct {p2, v1, v3}, La/jnk0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 64
    .line 65
    .line 66
    check-cast p0, La/jiy;

    .line 67
    .line 68
    invoke-interface {p1, p0, p2}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_0
    check-cast p2, La/qz40;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    check-cast p0, La/jiy;

    .line 78
    .line 79
    check-cast p2, La/p7m0;

    .line 80
    .line 81
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-interface {p1, p0, p2}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
