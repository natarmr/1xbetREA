.class public abstract La/f9z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/q8z;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    new-instance v5, La/e9z;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v5, v0}, La/e9z;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sget-object v14, La/iun;->a:La/iun;

    .line 8
    .line 9
    sget-object v18, La/ma80;->a:La/ma80;

    .line 10
    .line 11
    invoke-static {}, La/hic;->g()La/z6k;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 16
    .line 17
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    new-instance v0, La/q8z;

    .line 22
    .line 23
    new-instance v11, La/z8z;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v11, v1}, La/z8z;-><init>(B)V

    .line 27
    .line 28
    .line 29
    new-instance v12, La/z8z;

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    invoke-direct {v12, v1}, La/z8z;-><init>(B)V

    .line 33
    .line 34
    .line 35
    const/16 v19, 0x0

    .line 36
    .line 37
    const/16 v20, 0x0

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v13, 0x0

    .line 47
    const/4 v15, 0x0

    .line 48
    const/16 v16, 0x0

    .line 49
    .line 50
    const/16 v17, 0x0

    .line 51
    .line 52
    invoke-direct/range {v0 .. v20}, La/q8z;-><init>(La/s8z;IZFLa/uj30;FZLa/vne;La/w6k;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/util/List;IIILa/ma80;II)V

    .line 53
    .line 54
    .line 55
    sput-object v0, La/f9z;->a:La/q8z;

    .line 56
    .line 57
    return-void
.end method

.method public static final a(La/fet;)La/d9z;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sget-object v2, La/d9z;->w:La/v0h0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/fet;->e(I)Z

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    invoke-virtual {p0, v0}, La/fet;->e(I)Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    or-int/2addr v3, v4

    .line 15
    invoke-virtual {p0}, La/fet;->P()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    sget-object v3, La/ukd;->a:La/cl5;

    .line 22
    .line 23
    if-ne v4, v3, :cond_1

    .line 24
    .line 25
    :cond_0
    new-instance v4, La/pcy;

    .line 26
    .line 27
    const/16 v3, 0x13

    .line 28
    .line 29
    invoke-direct {v4, v3}, La/pcy;-><init>(B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 36
    .line 37
    invoke-static {v1, v2, v4, p0, v0}, La/e9x;->R([Ljava/lang/Object;La/u0h0;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, La/d9z;

    .line 42
    .line 43
    return-object p0
.end method
