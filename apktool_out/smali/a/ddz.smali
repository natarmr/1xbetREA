.class public abstract La/ddz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/mcz;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    new-instance v5, La/e9z;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {v5, v0}, La/e9z;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sget-object v13, La/iun;->a:La/iun;

    .line 8
    .line 9
    sget-object v18, La/ma80;->a:La/ma80;

    .line 10
    .line 11
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 12
    .line 13
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    invoke-static {}, La/hic;->g()La/z6k;

    .line 18
    .line 19
    .line 20
    move-result-object v9

    .line 21
    const/4 v0, 0x0

    .line 22
    const/16 v1, 0xf

    .line 23
    .line 24
    invoke-static {v0, v0, v0, v0, v1}, La/r4e;->b(IIIII)J

    .line 25
    .line 26
    .line 27
    move-result-wide v10

    .line 28
    new-instance v0, La/mcz;

    .line 29
    .line 30
    const/16 v19, 0x0

    .line 31
    .line 32
    const/16 v20, 0x0

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v14, 0x0

    .line 42
    const/4 v15, 0x0

    .line 43
    const/16 v16, 0x0

    .line 44
    .line 45
    const/16 v17, 0x0

    .line 46
    .line 47
    invoke-direct/range {v0 .. v20}, La/mcz;-><init>(La/ncz;IZFLa/uj30;FZLa/vne;La/w6k;JILjava/util/List;IIIZLa/ma80;II)V

    .line 48
    .line 49
    .line 50
    sput-object v0, La/ddz;->a:La/mcz;

    .line 51
    .line 52
    return-void
.end method

.method public static final a(IILa/fet;II)La/xcz;
    .locals 4

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move p1, v1

    .line 12
    :cond_1
    new-array p4, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    sget-object v0, La/xcz;->y:La/v0h0;

    .line 15
    .line 16
    and-int/lit8 v2, p3, 0xe

    .line 17
    .line 18
    xor-int/lit8 v2, v2, 0x6

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    if-le v2, v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2, p0}, La/fet;->e(I)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    :cond_2
    and-int/lit8 p3, p3, 0x6

    .line 30
    .line 31
    if-ne p3, v3, :cond_4

    .line 32
    .line 33
    :cond_3
    const/4 p3, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_4
    move p3, v1

    .line 36
    :goto_0
    invoke-virtual {p2, p1}, La/fet;->e(I)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    or-int/2addr p3, v2

    .line 41
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-nez p3, :cond_5

    .line 46
    .line 47
    sget-object p3, La/ukd;->a:La/cl5;

    .line 48
    .line 49
    if-ne v2, p3, :cond_6

    .line 50
    .line 51
    :cond_5
    new-instance v2, La/cdz;

    .line 52
    .line 53
    invoke-direct {v2, p0, p1}, La/cdz;-><init>(II)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 60
    .line 61
    invoke-static {p4, v0, v2, p2, v1}, La/e9x;->R([Ljava/lang/Object;La/u0h0;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/xcz;

    .line 66
    .line 67
    return-object p0
.end method

.method public static final b(La/uwq;La/fet;)La/xcz;
    .locals 5

    .line 1
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/xcz;->y:La/v0h0;

    .line 6
    .line 7
    new-instance v1, La/hvy;

    .line 8
    .line 9
    const/16 v2, 0xc

    .line 10
    .line 11
    invoke-direct {v1, v2}, La/hvy;-><init>(B)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/ebz;

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    invoke-direct {v2, p0, v3}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v1}, La/qxw;->L(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/v0h0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {p1, v3}, La/fet;->e(I)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    or-int/2addr v2, v4

    .line 34
    invoke-virtual {p1, v3}, La/fet;->e(I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    or-int/2addr v2, v4

    .line 39
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-nez v2, :cond_0

    .line 44
    .line 45
    sget-object v2, La/ukd;->a:La/cl5;

    .line 46
    .line 47
    if-ne v4, v2, :cond_1

    .line 48
    .line 49
    :cond_0
    new-instance v4, La/rcz;

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    invoke-direct {v4, p0, v2}, La/rcz;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 59
    .line 60
    invoke-static {v0, v1, v4, p1, v3}, La/e9x;->R([Ljava/lang/Object;La/u0h0;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/xcz;

    .line 65
    .line 66
    return-object p0
.end method
