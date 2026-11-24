.class public final La/o2x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/o2x;

.field public static final b:La/ewb0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/o2x;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/o2x;->a:La/o2x;

    .line 7
    .line 8
    const-string v0, "ImageVariant"

    .line 9
    .line 10
    sget-object v1, La/zvb0;->j:La/zvb0;

    .line 11
    .line 12
    invoke-static {v0, v1}, La/x2x;->j(Ljava/lang/String;La/zvb0;)La/ewb0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, La/o2x;->b:La/ewb0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of p0, p1, La/icy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    check-cast p1, La/icy;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    :goto_0
    if-eqz p1, :cond_3

    .line 11
    .line 12
    invoke-static {p1}, La/hne;->m(La/icy;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    sget-object p0, La/jz60;->a:La/jz60;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    new-instance p1, La/kz60;

    .line 26
    .line 27
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    :goto_1
    invoke-direct {p1, p0}, La/kz60;-><init>(I)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_3
    const-string p0, "Expected JSON decoder"

    .line 44
    .line 45
    invoke-static {p0}, La/v4i0;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/o2x;->b:La/ewb0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La/lz60;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of p0, p2, La/jz60;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const-string p0, ""

    .line 11
    .line 12
    invoke-interface {p1, p0}, La/bwn;->E(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    instance-of p0, p2, La/kz60;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    check-cast p2, La/kz60;

    .line 21
    .line 22
    iget p0, p2, La/kz60;->a:I

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p1, p0}, La/bwn;->E(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 33
    .line 34
    .line 35
    return-void
.end method
