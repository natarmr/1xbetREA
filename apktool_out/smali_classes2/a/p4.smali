.class public abstract La/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vde0;
.implements La/e83;
.implements La/b43;
.implements La/syw0;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/p4;->a:B

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object p1, La/hkx;->a:La/ey40;

    .line 10
    .line 11
    new-instance p1, La/ey40;

    .line 12
    .line 13
    invoke-direct {p1}, La/ey40;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/p4;->b:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/p4;->b:Ljava/lang/Object;

    .line 28
    .line 29
    return-void

    .line 30
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, La/p4;->b:Ljava/lang/Object;

    .line 40
    .line 41
    return-void

    .line 42
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance p1, La/cqj0;

    .line 46
    .line 47
    invoke-direct {p1}, La/cqj0;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, La/p4;->b:Ljava/lang/Object;

    .line 51
    .line 52
    return-void

    .line 53
    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_2
        0xc -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 61
    iput-byte p1, p0, La/p4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/g93;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/p4;->a:B

    if-eqz p1, :cond_0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, La/p4;->b:Ljava/lang/Object;

    return-void

    :cond_0
    const/4 p0, 0x0

    .line 57
    invoke-static {p0}, La/p4;->l0(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(La/kxw0;)V
    .locals 1

    const/16 v0, 0xf

    iput-byte v0, p0, La/p4;->a:B

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    iput-object p1, p0, La/p4;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/rnk0;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/p4;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p4;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/wsy;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/p4;->a:B

    if-eqz p1, :cond_0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, La/p4;->b:Ljava/lang/Object;

    return-void

    .line 60
    :cond_0
    invoke-static {v0}, La/p4;->k0(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 53
    iput-byte p2, p0, La/p4;->a:B

    iput-object p1, p0, La/p4;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d1(ILa/sjw0;)I
    .locals 0

    .line 1
    shl-int/lit8 p0, p0, 0x3

    .line 2
    .line 3
    invoke-static {p0}, La/p4;->i1(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-virtual {p1}, La/sjw0;->e()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1, p1, p0}, La/ohs0;->C(III)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static e1(J)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    mul-int/lit8 p0, p0, 0x9

    .line 6
    .line 7
    rsub-int p0, p0, 0x280

    .line 8
    .line 9
    ushr-int/lit8 p0, p0, 0x6

    .line 10
    .line 11
    return p0
.end method

.method public static i1(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    mul-int/lit8 p0, p0, 0x9

    .line 6
    .line 7
    rsub-int p0, p0, 0x160

    .line 8
    .line 9
    ushr-int/lit8 p0, p0, 0x6

    .line 10
    .line 11
    return p0
.end method

.method public static j1(J)J
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    shl-long v0, p0, v0

    .line 3
    .line 4
    const/16 v2, 0x3f

    .line 5
    .line 6
    shr-long/2addr p0, v2

    .line 7
    xor-long/2addr p0, v0

    .line 8
    return-wide p0
.end method

.method public static synthetic k0(I)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p0, v1, :cond_0

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    .line 11
    .line 12
    :goto_0
    if-eq p0, v1, :cond_1

    .line 13
    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move v3, v0

    .line 19
    :goto_1
    new-array v3, v3, [Ljava/lang/Object;

    .line 20
    .line 21
    const-string v4, "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue"

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    if-eq p0, v1, :cond_2

    .line 25
    .line 26
    if-eq p0, v0, :cond_2

    .line 27
    .line 28
    const-string v6, "receiverType"

    .line 29
    .line 30
    aput-object v6, v3, v5

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    aput-object v4, v3, v5

    .line 34
    .line 35
    :goto_2
    if-eq p0, v1, :cond_4

    .line 36
    .line 37
    if-eq p0, v0, :cond_3

    .line 38
    .line 39
    aput-object v4, v3, v1

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    const-string v4, "getOriginal"

    .line 43
    .line 44
    aput-object v4, v3, v1

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_4
    const-string v4, "getType"

    .line 48
    .line 49
    aput-object v4, v3, v1

    .line 50
    .line 51
    :goto_3
    if-eq p0, v1, :cond_5

    .line 52
    .line 53
    if-eq p0, v0, :cond_5

    .line 54
    .line 55
    const-string v4, "<init>"

    .line 56
    .line 57
    aput-object v4, v3, v0

    .line 58
    .line 59
    :cond_5
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-eq p0, v1, :cond_6

    .line 64
    .line 65
    if-eq p0, v0, :cond_6

    .line 66
    .line 67
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :goto_4
    throw p0
.end method

.method public static synthetic l0(I)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_0

    .line 3
    .line 4
    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string v1, "@NotNull method %s.%s must not return null"

    .line 8
    .line 9
    :goto_0
    const/4 v2, 0x2

    .line 10
    if-eq p0, v0, :cond_1

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    move v3, v2

    .line 15
    :goto_1
    new-array v3, v3, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v4, "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl"

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-eq p0, v0, :cond_2

    .line 21
    .line 22
    const-string v6, "annotations"

    .line 23
    .line 24
    aput-object v6, v3, v5

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_2
    aput-object v4, v3, v5

    .line 28
    .line 29
    :goto_2
    if-eq p0, v0, :cond_3

    .line 30
    .line 31
    aput-object v4, v3, v0

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_3
    const-string v4, "getAnnotations"

    .line 35
    .line 36
    aput-object v4, v3, v0

    .line 37
    .line 38
    :goto_3
    if-eq p0, v0, :cond_4

    .line 39
    .line 40
    const-string v4, "<init>"

    .line 41
    .line 42
    aput-object v4, v3, v2

    .line 43
    .line 44
    :cond_4
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eq p0, v0, :cond_5

    .line 49
    .line 50
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 51
    .line 52
    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_4
    throw p0
.end method

.method public static l1(I)I
    .locals 1

    .line 1
    shl-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    shr-int/lit8 p0, p0, 0x1f

    .line 4
    .line 5
    xor-int/2addr p0, v0

    .line 6
    return p0
.end method


# virtual methods
.method public abstract A0()Ljava/lang/Object;
.end method

.method public B0()La/p4;
    .locals 0

    .line 1
    return-object p0
.end method

.method public C0()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/rnk0;

    .line 4
    .line 5
    iget-object v0, p0, La/rnk0;->c:Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v1, La/tnk0;->a:La/cge0;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, La/cge0;->c(Landroid/view/View;)La/tnk0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iget-object p0, p0, La/rnk0;->a:La/tnk0;

    .line 23
    .line 24
    if-eq v0, p0, :cond_2

    .line 25
    .line 26
    sget-object v1, La/tnk0;->c:La/tnk0;

    .line 27
    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    if-eq p0, v1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 36
    return p0
.end method

.method public D0()Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public E0(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/vkr0;

    .line 7
    .line 8
    iget-object p0, p0, La/vkr0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/wut0;

    .line 11
    .line 12
    iget-object p0, p0, La/wut0;->g:La/gsj;

    .line 13
    .line 14
    sget-object v0, La/vv00;->c:La/vv00;

    .line 15
    .line 16
    invoke-virtual {p0, v0, p1, p2}, La/gsj;->b(La/vv00;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public F0(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/vkr0;

    .line 4
    .line 5
    iget-object p0, p0, La/vkr0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/wut0;

    .line 8
    .line 9
    iget-object p0, p0, La/wut0;->g:La/gsj;

    .line 10
    .line 11
    sget-object v0, La/vv00;->d:La/vv00;

    .line 12
    .line 13
    const-string v1, ""

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, p1}, La/gsj;->b(La/vv00;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public abstract G0(La/og9;)La/x3;
.end method

.method public H0(F)La/p4;
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/high16 v0, 0x437f0000    # 255.0f

    .line 13
    .line 14
    mul-float/2addr p1, v0

    .line 15
    float-to-int p1, p1

    .line 16
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/cqj0;

    .line 19
    .line 20
    shl-int/lit8 p1, p1, 0x18

    .line 21
    .line 22
    iget v1, v0, La/cqj0;->e:I

    .line 23
    .line 24
    const v2, 0xffffff

    .line 25
    .line 26
    .line 27
    and-int/2addr v1, v2

    .line 28
    or-int/2addr p1, v1

    .line 29
    iput p1, v0, La/cqj0;->e:I

    .line 30
    .line 31
    invoke-virtual {p0}, La/p4;->B0()La/p4;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public abstract I0(Ljava/lang/Object;)V
.end method

.method public J()La/fxw0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public J0(F)La/p4;
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/high16 v0, 0x437f0000    # 255.0f

    .line 13
    .line 14
    mul-float/2addr p1, v0

    .line 15
    float-to-int p1, p1

    .line 16
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/cqj0;

    .line 19
    .line 20
    shl-int/lit8 p1, p1, 0x18

    .line 21
    .line 22
    iget v1, v0, La/cqj0;->d:I

    .line 23
    .line 24
    const v2, 0xffffff

    .line 25
    .line 26
    .line 27
    and-int/2addr v1, v2

    .line 28
    or-int/2addr p1, v1

    .line 29
    iput p1, v0, La/cqj0;->d:I

    .line 30
    .line 31
    invoke-virtual {p0}, La/p4;->B0()La/p4;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public K()Landroid/content/Context;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public K0(La/oms0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public L0()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract M0(La/x3;)V
.end method

.method public N0()I
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public abstract O0()Ljava/lang/Object;
.end method

.method public abstract P0(B)V
.end method

.method public abstract Q0(I)V
.end method

.method public abstract R0(II)V
.end method

.method public S()La/lwf;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public abstract S0(IJ)V
.end method

.method public abstract T0(ILa/sjw0;)V
.end method

.method public abstract U0(ILjava/lang/String;)V
.end method

.method public abstract V0(IZ)V
.end method

.method public abstract W0(J)V
.end method

.method public abstract X0([BII)V
.end method

.method public Y0(La/lgx0;La/wgm0;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    invoke-virtual {p0}, La/p4;->O0()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_3

    .line 21
    .line 22
    invoke-virtual {p2}, La/wgm0;->y()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v0, 0x0

    .line 27
    :goto_0
    if-ge v0, p1, :cond_2

    .line 28
    .line 29
    sget-object v1, La/xfx0;->f:La/tfx0;

    .line 30
    .line 31
    invoke-virtual {p2, v0}, La/wgm0;->A(I)La/vgx0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2, v0}, La/wgm0;->B(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return-object p0

    .line 48
    :cond_3
    return-object p1
.end method

.method public abstract Z0(I)V
.end method

.method public abstract a1(II)V
.end method

.method public abstract b1(IJ)V
.end method

.method public abstract c1(J)V
.end method

.method public f1()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/p4;->N0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gtz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, La/p4;->N0()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-ltz p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "Wrote more data than expected."

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const-string p0, "Did not write as much data as expected."

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public g()Z
    .locals 3

    .line 1
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, La/cmy;

    .line 24
    .line 25
    invoke-virtual {p0}, La/cmy;->c()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return v2

    .line 33
    :cond_1
    :goto_0
    return v1
.end method

.method public abstract g1(I)V
.end method

.method public getAnnotations()La/g93;
    .locals 0

    .line 1
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/g93;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x1

    .line 9
    invoke-static {p0}, La/p4;->l0(I)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    throw p0
.end method

.method public getType()La/wsy;
    .locals 0

    .line 1
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/wsy;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x1

    .line 9
    invoke-static {p0}, La/p4;->k0(I)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    throw p0
.end method

.method public abstract h1(II)V
.end method

.method public j0()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/List;

    .line 4
    .line 5
    return-object p0
.end method

.method public abstract k1(II)V
.end method

.method public abstract m0(La/z220;)V
.end method

.method public m1()V
    .locals 0

    .line 1
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/kxw0;

    .line 4
    .line 5
    iget-object p0, p0, La/kxw0;->g:La/fxw0;

    .line 6
    .line 7
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/fxw0;->m1()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public n0()Landroid/graphics/RenderEffect;
    .locals 1

    .line 1
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/RenderEffect;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/p4;->u0()Landroid/graphics/RenderEffect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public o0()La/cqj0;
    .locals 9

    .line 1
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/cqj0;

    .line 4
    .line 5
    iget-boolean v0, p0, La/cqj0;->f:Z

    .line 6
    .line 7
    iget-object v1, p0, La/cqj0;->b:[I

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, 0x2

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eq v0, v5, :cond_0

    .line 14
    .line 15
    iget v6, p0, La/cqj0;->e:I

    .line 16
    .line 17
    aput v6, v1, v4

    .line 18
    .line 19
    iget v7, p0, La/cqj0;->d:I

    .line 20
    .line 21
    aput v7, v1, v5

    .line 22
    .line 23
    aput v7, v1, v3

    .line 24
    .line 25
    aput v6, v1, v2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget v6, p0, La/cqj0;->d:I

    .line 29
    .line 30
    aput v6, v1, v4

    .line 31
    .line 32
    aput v6, v1, v5

    .line 33
    .line 34
    iget v6, p0, La/cqj0;->e:I

    .line 35
    .line 36
    aput v6, v1, v3

    .line 37
    .line 38
    aput v6, v1, v2

    .line 39
    .line 40
    :goto_0
    iget-object v1, p0, La/cqj0;->a:[F

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const/high16 v7, 0x3f800000    # 1.0f

    .line 44
    .line 45
    if-eq v0, v5, :cond_1

    .line 46
    .line 47
    iget v0, p0, La/cqj0;->k:F

    .line 48
    .line 49
    sub-float v0, v7, v0

    .line 50
    .line 51
    iget v8, p0, La/cqj0;->l:F

    .line 52
    .line 53
    sub-float/2addr v0, v8

    .line 54
    const/high16 v8, 0x40000000    # 2.0f

    .line 55
    .line 56
    div-float/2addr v0, v8

    .line 57
    invoke-static {v0, v6}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    aput v0, v1, v4

    .line 62
    .line 63
    iget v0, p0, La/cqj0;->k:F

    .line 64
    .line 65
    sub-float v0, v7, v0

    .line 66
    .line 67
    const v4, 0x3a83126f    # 0.001f

    .line 68
    .line 69
    .line 70
    sub-float/2addr v0, v4

    .line 71
    div-float/2addr v0, v8

    .line 72
    invoke-static {v0, v6}, Ljava/lang/Math;->max(FF)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    aput v0, v1, v5

    .line 77
    .line 78
    iget v0, p0, La/cqj0;->k:F

    .line 79
    .line 80
    add-float/2addr v0, v7

    .line 81
    add-float/2addr v0, v4

    .line 82
    div-float/2addr v0, v8

    .line 83
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    aput v0, v1, v3

    .line 88
    .line 89
    iget v0, p0, La/cqj0;->k:F

    .line 90
    .line 91
    add-float/2addr v0, v7

    .line 92
    iget v3, p0, La/cqj0;->l:F

    .line 93
    .line 94
    add-float/2addr v0, v3

    .line 95
    div-float/2addr v0, v8

    .line 96
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    aput v0, v1, v2

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_1
    aput v6, v1, v4

    .line 104
    .line 105
    iget v0, p0, La/cqj0;->k:F

    .line 106
    .line 107
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    aput v0, v1, v5

    .line 112
    .line 113
    iget v0, p0, La/cqj0;->k:F

    .line 114
    .line 115
    iget v4, p0, La/cqj0;->l:F

    .line 116
    .line 117
    add-float/2addr v0, v4

    .line 118
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    aput v0, v1, v3

    .line 123
    .line 124
    aput v7, v1, v2

    .line 125
    .line 126
    return-object p0
.end method

.method public p()La/svs0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public p0(Ljava/util/ArrayList;)La/j;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x2

    .line 8
    mul-int/2addr v1, v2

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-ge v4, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, La/sgi0;

    .line 25
    .line 26
    iget-object v6, v5, La/sgi0;->a:Lkotlin/ranges/IntRange;

    .line 27
    .line 28
    iget v7, v6, Lkotlin/ranges/a;->a:I

    .line 29
    .line 30
    iget v6, v6, Lkotlin/ranges/a;->b:I

    .line 31
    .line 32
    new-instance v8, La/fqs0;

    .line 33
    .line 34
    invoke-direct {v8, v7, v4, v5}, La/fqs0;-><init>(IILa/sgi0;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    if-eq v6, v7, :cond_0

    .line 41
    .line 42
    new-instance v7, La/fqs0;

    .line 43
    .line 44
    invoke-direct {v7, v6, v4, v5}, La/fqs0;-><init>(IILa/sgi0;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance p1, La/y43;

    .line 54
    .line 55
    const/4 v1, 0x4

    .line 56
    invoke-direct {p1, v2, v1}, La/y43;-><init>(IB)V

    .line 57
    .line 58
    .line 59
    new-instance v1, La/gi2;

    .line 60
    .line 61
    const/4 v2, 0x7

    .line 62
    invoke-direct {v1, p1, v2}, La/gi2;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v0}, La/v3d;->t(Ljava/util/Comparator;Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    new-instance p1, La/ty40;

    .line 69
    .line 70
    invoke-direct {p1}, La/ty40;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object v1, p1, La/ty40;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_a

    .line 82
    .line 83
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, La/fqs0;

    .line 88
    .line 89
    iget-object v2, v2, La/fqs0;->c:La/sgi0;

    .line 90
    .line 91
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, La/fqs0;

    .line 96
    .line 97
    iget-object v4, v4, La/fqs0;->c:La/sgi0;

    .line 98
    .line 99
    invoke-virtual {v2, v4}, La/sgi0;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_9

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    :goto_1
    const/4 v4, 0x0

    .line 110
    if-ge v3, v2, :cond_8

    .line 111
    .line 112
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    check-cast v5, La/fqs0;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-eqz v6, :cond_2

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Lkotlin/Pair;

    .line 130
    .line 131
    iget-object v4, v4, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v4, Ljava/util/List;

    .line 134
    .line 135
    :goto_2
    invoke-virtual {p0, v5, v4}, La/p4;->v0(La/fqs0;Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5}, La/fqs0;->c()Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    iget-object v6, v5, La/fqs0;->c:La/sgi0;

    .line 143
    .line 144
    if-eqz v4, :cond_3

    .line 145
    .line 146
    new-instance v4, Lkotlin/Pair;

    .line 147
    .line 148
    new-instance v6, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-direct {v4, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v4}, La/ty40;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_3
    invoke-virtual {v5}, La/fqs0;->b()Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_4

    .line 165
    .line 166
    new-instance v4, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_4
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    add-int/lit8 v7, v7, -0x1

    .line 181
    .line 182
    invoke-virtual {p1, v7}, La/ty40;->remove(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    check-cast v4, Lkotlin/Pair;

    .line 186
    .line 187
    iget-object v7, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v7, La/fqs0;

    .line 190
    .line 191
    iget-object v7, v7, La/fqs0;->c:La/sgi0;

    .line 192
    .line 193
    invoke-virtual {v7, v6}, La/sgi0;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    if-eqz v7, :cond_7

    .line 198
    .line 199
    iget-object v4, v4, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v4, Ljava/util/List;

    .line 202
    .line 203
    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    invoke-virtual {p0, v5, v4, v6}, La/p4;->s0(La/fqs0;Ljava/util/List;Z)La/eqs0;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    if-eqz v6, :cond_6

    .line 212
    .line 213
    add-int/lit8 v3, v3, 0x1

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-ne v3, p0, :cond_5

    .line 220
    .line 221
    iget-object p0, v4, La/eqs0;->a:La/j;

    .line 222
    .line 223
    return-object p0

    .line 224
    :cond_5
    new-instance p0, La/byw;

    .line 225
    .line 226
    const-string p1, ""

    .line 227
    .line 228
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw p0

    .line 232
    :cond_6
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    check-cast v5, Lkotlin/Pair;

    .line 237
    .line 238
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v5, Ljava/util/List;

    .line 241
    .line 242
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 246
    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :cond_7
    iget-object p0, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast p0, La/fqs0;

    .line 252
    .line 253
    iget-object p0, p0, La/fqs0;->c:La/sgi0;

    .line 254
    .line 255
    new-instance p1, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    const-string v0, "Intersecting parsed nodes detected: "

    .line 258
    .line 259
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string p0, " vs "

    .line 266
    .line 267
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    new-instance p1, La/byw;

    .line 278
    .line 279
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw p1

    .line 283
    :cond_8
    const-string p0, "markers stack should close some time thus would not be here!"

    .line 284
    .line 285
    invoke-static {p0}, La/c99;->l(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    return-object v4

    .line 289
    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    const-string p1, "more than one root?\nfirst: "

    .line 292
    .line 293
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    check-cast p1, La/fqs0;

    .line 301
    .line 302
    iget-object p1, p1, La/fqs0;->c:La/sgi0;

    .line 303
    .line 304
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    check-cast p1, La/fqs0;

    .line 312
    .line 313
    iget-object p1, p1, La/fqs0;->c:La/sgi0;

    .line 314
    .line 315
    const-string v0, "\nlast: "

    .line 316
    .line 317
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    new-instance p1, La/byw;

    .line 328
    .line 329
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw p1

    .line 333
    :cond_a
    new-instance p0, La/byw;

    .line 334
    .line 335
    const-string p1, "nonsense"

    .line 336
    .line 337
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    throw p0
.end method

.method public abstract q0(La/td9;)Ljava/lang/Object;
.end method

.method public r()La/uuw0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public r0(Landroid/content/res/TypedArray;)La/p4;
    .locals 11

    .line 1
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/cqj0;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-boolean v2, v0, La/cqj0;->n:Z

    .line 13
    .line 14
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iput-boolean v2, v0, La/cqj0;->n:Z

    .line 19
    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    iget-boolean v3, v0, La/cqj0;->o:Z

    .line 28
    .line 29
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iput-boolean v3, v0, La/cqj0;->o:Z

    .line 34
    .line 35
    :cond_1
    const/4 v3, 0x1

    .line 36
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    const v4, 0x3e99999a    # 0.3f

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-virtual {p0, v4}, La/p4;->H0(F)La/p4;

    .line 50
    .line 51
    .line 52
    :cond_2
    const/16 v4, 0xb

    .line 53
    .line 54
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    const/high16 v5, 0x3f800000    # 1.0f

    .line 61
    .line 62
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {p0, v4}, La/p4;->J0(F)La/p4;

    .line 67
    .line 68
    .line 69
    :cond_3
    const/4 v4, 0x7

    .line 70
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const/4 v6, 0x0

    .line 75
    const-wide/16 v7, 0x0

    .line 76
    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    iget-wide v9, v0, La/cqj0;->s:J

    .line 80
    .line 81
    long-to-int v5, v9

    .line 82
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    int-to-long v4, v4

    .line 87
    cmp-long v9, v4, v7

    .line 88
    .line 89
    if-ltz v9, :cond_4

    .line 90
    .line 91
    iput-wide v4, v0, La/cqj0;->s:J

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    const-string p0, "Given a negative duration: "

    .line 95
    .line 96
    invoke-static {v4, v5, p0}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v6

    .line 104
    :cond_5
    :goto_0
    const/16 v4, 0xe

    .line 105
    .line 106
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_6

    .line 111
    .line 112
    iget v5, v0, La/cqj0;->q:I

    .line 113
    .line 114
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    iput v4, v0, La/cqj0;->q:I

    .line 119
    .line 120
    :cond_6
    const/16 v4, 0xf

    .line 121
    .line 122
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_8

    .line 127
    .line 128
    iget-wide v9, v0, La/cqj0;->t:J

    .line 129
    .line 130
    long-to-int v5, v9

    .line 131
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    int-to-long v4, v4

    .line 136
    cmp-long v7, v4, v7

    .line 137
    .line 138
    if-ltz v7, :cond_7

    .line 139
    .line 140
    iput-wide v4, v0, La/cqj0;->t:J

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_7
    const-string p0, "Given a negative repeat delay: "

    .line 144
    .line 145
    invoke-static {v4, v5, p0}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-object v6

    .line 153
    :cond_8
    :goto_1
    const/16 v4, 0x10

    .line 154
    .line 155
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_9

    .line 160
    .line 161
    iget v5, v0, La/cqj0;->r:I

    .line 162
    .line 163
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    iput v4, v0, La/cqj0;->r:I

    .line 168
    .line 169
    :cond_9
    const/4 v4, 0x5

    .line 170
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-eqz v5, :cond_d

    .line 175
    .line 176
    iget-byte v5, v0, La/cqj0;->c:B

    .line 177
    .line 178
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eq v4, v3, :cond_c

    .line 183
    .line 184
    const/4 v5, 0x2

    .line 185
    if-eq v4, v5, :cond_b

    .line 186
    .line 187
    if-eq v4, v1, :cond_a

    .line 188
    .line 189
    iput-byte v2, v0, La/cqj0;->c:B

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_a
    iput-byte v1, v0, La/cqj0;->c:B

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_b
    iput-byte v5, v0, La/cqj0;->c:B

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_c
    iput-byte v3, v0, La/cqj0;->c:B

    .line 199
    .line 200
    :cond_d
    :goto_2
    const/16 v1, 0x11

    .line 201
    .line 202
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_f

    .line 207
    .line 208
    iget-boolean v4, v0, La/cqj0;->f:Z

    .line 209
    .line 210
    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eq v1, v3, :cond_e

    .line 215
    .line 216
    iput-boolean v2, v0, La/cqj0;->f:Z

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_e
    iput-boolean v3, v0, La/cqj0;->f:Z

    .line 220
    .line 221
    :cond_f
    :goto_3
    const/4 v1, 0x6

    .line 222
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    const/4 v3, 0x0

    .line 227
    if-eqz v2, :cond_11

    .line 228
    .line 229
    iget v2, v0, La/cqj0;->l:F

    .line 230
    .line 231
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    cmpg-float v2, v1, v3

    .line 236
    .line 237
    if-ltz v2, :cond_10

    .line 238
    .line 239
    iput v1, v0, La/cqj0;->l:F

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_10
    const-string p0, "Given invalid dropoff value: "

    .line 243
    .line 244
    invoke-static {v1, p0}, La/v4i0;->h(FLjava/lang/String;)V

    .line 245
    .line 246
    .line 247
    return-object v6

    .line 248
    :cond_11
    :goto_4
    const/16 v1, 0x9

    .line 249
    .line 250
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_13

    .line 255
    .line 256
    iget v2, v0, La/cqj0;->g:I

    .line 257
    .line 258
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-ltz v1, :cond_12

    .line 263
    .line 264
    iput v1, v0, La/cqj0;->g:I

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_12
    const-string p0, "Given invalid width: "

    .line 268
    .line 269
    invoke-static {v1, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-object v6

    .line 277
    :cond_13
    :goto_5
    const/16 v1, 0x8

    .line 278
    .line 279
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-eqz v2, :cond_15

    .line 284
    .line 285
    iget v2, v0, La/cqj0;->h:I

    .line 286
    .line 287
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-ltz v1, :cond_14

    .line 292
    .line 293
    iput v1, v0, La/cqj0;->h:I

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_14
    const-string p0, "Given invalid height: "

    .line 297
    .line 298
    invoke-static {v1, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    return-object v6

    .line 306
    :cond_15
    :goto_6
    const/16 v1, 0xd

    .line 307
    .line 308
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-eqz v2, :cond_17

    .line 313
    .line 314
    iget v2, v0, La/cqj0;->k:F

    .line 315
    .line 316
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    cmpg-float v2, v1, v3

    .line 321
    .line 322
    if-ltz v2, :cond_16

    .line 323
    .line 324
    iput v1, v0, La/cqj0;->k:F

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_16
    const-string p0, "Given invalid intensity value: "

    .line 328
    .line 329
    invoke-static {v1, p0}, La/v4i0;->h(FLjava/lang/String;)V

    .line 330
    .line 331
    .line 332
    return-object v6

    .line 333
    :cond_17
    :goto_7
    const/16 v1, 0x13

    .line 334
    .line 335
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    if-eqz v2, :cond_19

    .line 340
    .line 341
    iget v2, v0, La/cqj0;->i:F

    .line 342
    .line 343
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    cmpg-float v2, v1, v3

    .line 348
    .line 349
    if-ltz v2, :cond_18

    .line 350
    .line 351
    iput v1, v0, La/cqj0;->i:F

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_18
    const-string p0, "Given invalid width ratio: "

    .line 355
    .line 356
    invoke-static {v1, p0}, La/v4i0;->h(FLjava/lang/String;)V

    .line 357
    .line 358
    .line 359
    return-object v6

    .line 360
    :cond_19
    :goto_8
    const/16 v1, 0xa

    .line 361
    .line 362
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    if-eqz v2, :cond_1b

    .line 367
    .line 368
    iget v2, v0, La/cqj0;->j:F

    .line 369
    .line 370
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    cmpg-float v2, v1, v3

    .line 375
    .line 376
    if-ltz v2, :cond_1a

    .line 377
    .line 378
    iput v1, v0, La/cqj0;->j:F

    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_1a
    const-string p0, "Given invalid height ratio: "

    .line 382
    .line 383
    invoke-static {v1, p0}, La/v4i0;->h(FLjava/lang/String;)V

    .line 384
    .line 385
    .line 386
    return-object v6

    .line 387
    :cond_1b
    :goto_9
    const/16 v1, 0x12

    .line 388
    .line 389
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-eqz v2, :cond_1c

    .line 394
    .line 395
    iget v2, v0, La/cqj0;->m:F

    .line 396
    .line 397
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    iput p1, v0, La/cqj0;->m:F

    .line 402
    .line 403
    :cond_1c
    invoke-virtual {p0}, La/p4;->B0()La/p4;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    return-object p0
.end method

.method public s0(La/fqs0;Ljava/util/List;Z)La/eqs0;
    .locals 8

    .line 1
    sget-object p3, La/cy2;->j0:La/fr20;

    .line 2
    .line 3
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/peg0;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, La/fqs0;->c:La/sgi0;

    .line 11
    .line 12
    iget-object v0, p1, La/sgi0;->b:La/ar20;

    .line 13
    .line 14
    iget-object p1, p1, La/sgi0;->a:Lkotlin/ranges/IntRange;

    .line 15
    .line 16
    iget v1, p1, Lkotlin/ranges/a;->a:I

    .line 17
    .line 18
    iget p1, p1, Lkotlin/ranges/a;->b:I

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-boolean v2, v0, La/ar20;->b:Z

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1, p1}, La/peg0;->h(La/ar20;II)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance p2, La/eqs0;

    .line 31
    .line 32
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, La/j;

    .line 37
    .line 38
    invoke-direct {p2, p0, v1, p1}, La/eqs0;-><init>(La/j;II)V

    .line 39
    .line 40
    .line 41
    return-object p2

    .line 42
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, La/eqs0;

    .line 56
    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    iget v3, v3, La/eqs0;->b:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move v3, p1

    .line 63
    :goto_0
    if-eq v1, v3, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0, p3, v1, v3}, La/peg0;->h(La/ar20;II)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    const/4 v4, 0x1

    .line 77
    :goto_1
    if-ge v4, v3, :cond_4

    .line 78
    .line 79
    add-int/lit8 v5, v4, -0x1

    .line 80
    .line 81
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, La/eqs0;

    .line 86
    .line 87
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, La/eqs0;

    .line 92
    .line 93
    iget-object v7, v5, La/eqs0;->a:La/j;

    .line 94
    .line 95
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    iget v5, v5, La/eqs0;->c:I

    .line 99
    .line 100
    iget v6, v6, La/eqs0;->b:I

    .line 101
    .line 102
    if-eq v5, v6, :cond_3

    .line 103
    .line 104
    invoke-virtual {p0, p3, v5, v6}, La/peg0;->h(La/ar20;II)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 109
    .line 110
    .line 111
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_5

    .line 119
    .line 120
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, La/eqs0;

    .line 125
    .line 126
    iget-object v3, v3, La/eqs0;->a:La/j;

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    check-cast p2, La/eqs0;

    .line 136
    .line 137
    iget p2, p2, La/eqs0;->c:I

    .line 138
    .line 139
    if-eq p2, p1, :cond_5

    .line 140
    .line 141
    invoke-virtual {p0, p3, p2, p1}, La/peg0;->h(La/ar20;II)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 146
    .line 147
    .line 148
    :cond_5
    invoke-virtual {p0, v0, v2}, La/peg0;->g(La/ar20;Ljava/util/ArrayList;)La/zkd;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    new-instance p2, La/eqs0;

    .line 153
    .line 154
    invoke-direct {p2, p0, v1, p1}, La/eqs0;-><init>(La/j;II)V

    .line 155
    .line 156
    .line 157
    return-object p2
.end method

.method public abstract t0(La/x3;)La/x3;
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, La/p4;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    const-string v1, "values="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public abstract u0()Landroid/graphics/RenderEffect;
.end method

.method public v0(La/fqs0;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public abstract w0(IIIJ)La/kbz;
.end method

.method public x0()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "androidx.core.app.NotificationCompat$BigPictureStyle"

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract y0()Ljava/lang/Object;
.end method

.method public z0(La/jbz;IJ)Ljava/util/List;
    .locals 7

    .line 1
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ey40;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, La/gkx;->b(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p1, p2}, La/jbz;->a(I)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    new-instance v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    move v5, v1

    .line 29
    :goto_0
    if-ge v5, v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/pj30;

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    move-wide v2, p3

    .line 39
    invoke-static/range {v1 .. v6}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p0, p2, v4}, La/ey40;->j(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v4
.end method
